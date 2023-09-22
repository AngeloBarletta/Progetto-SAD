
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add((int)(short)-1, 151);
    int i21 = classUnderTest0.add(258, 512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 770);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(byte)1, 208);
    int i21 = classUnderTest0.add(267, 368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 209);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 635);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(153, (int)(byte)1);
    int i18 = classUnderTest0.add(118, (int)(byte)-1);
    int i21 = classUnderTest0.add(635, 348);
    int i24 = classUnderTest0.add(898, 105);
    int i27 = classUnderTest0.add(35, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 983);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1003);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 135);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(1, 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 102);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(0, 347);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 347);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add(10, 108);
    int i21 = classUnderTest0.add(720, 52);
    int i24 = classUnderTest0.add(206, 1223);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 118);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 772);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1429);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(118, 450);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 568);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(118, 1052);
    int i21 = classUnderTest0.add((int)(byte)100, 314);
    int i24 = classUnderTest0.add(100, 95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 414);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 195);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(1052, 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 565);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1153);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(533, 100);
    int i15 = classUnderTest0.add((int)(short)0, 241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 633);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 241);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(1260, 1312);
    int i6 = classUnderTest0.add(665, 270);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2572);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 935);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add((int)(short)-1, 150);
    int i24 = classUnderTest0.add(3030, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 149);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3030);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add((int)(byte)10, 502);
    int i21 = classUnderTest0.add(1153, 303);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1456);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add(552, 2308);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2860);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(208, (int)(byte)10);
    int i18 = classUnderTest0.add(0, 449);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 449);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add(215, 233);
    int i21 = classUnderTest0.add(236, 215);
    int i24 = classUnderTest0.add(154, 420);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 448);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 451);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 574);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(short)1, 269);
    int i15 = classUnderTest0.add(100, 298);
    int i18 = classUnderTest0.add(0, 513);
    int i21 = classUnderTest0.add((int)(byte)1, 179);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 270);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 398);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 513);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 180);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)1, 237);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 238);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add(270, 10);
    int i21 = classUnderTest0.add((int)(byte)100, 53);
    int i24 = classUnderTest0.add(217, 366);
    int i27 = classUnderTest0.add(2338, 403);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 583);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2741);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(1554, 208);
    int i15 = classUnderTest0.add(398, 3808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1762);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 4206);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(898, 503);
    int i15 = classUnderTest0.add(583, 1518);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1401);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2101);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(479, 1312);
    int i24 = classUnderTest0.add(486, 100);
    int i27 = classUnderTest0.add((int)'#', 565);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1791);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 586);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 600);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(700, 147);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 847);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(151, 0);
    int i21 = classUnderTest0.add(517, 1791);
    int i24 = classUnderTest0.add(420, 0);
    int i27 = classUnderTest0.add(1762, 940);
    int i30 = classUnderTest0.add(738, 503);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2308);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 420);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2702);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1241);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)-1, 197);
    int i18 = classUnderTest0.add((int)(byte)0, 549);
    int i21 = classUnderTest0.add(403, 820);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 196);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 549);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1223);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(305, 635);
    int i15 = classUnderTest0.add(772, 36);
    int i18 = classUnderTest0.add(84, 1906);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 940);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1990);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'a', 0);
    int i24 = classUnderTest0.add(151, 217);
    int i27 = classUnderTest0.add(10, (int)(byte)10);
    int i30 = classUnderTest0.add(205, 347);
    int i33 = classUnderTest0.add(1629, 300);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 552);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1929);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(1314, 1717);
    int i18 = classUnderTest0.add(227, 2873);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3031);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3100);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(52, 206);
    int i18 = classUnderTest0.add(603, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 258);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 603);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(651, 301);
    int i12 = classUnderTest0.add(331, 117);
    int i15 = classUnderTest0.add(0, 1003);
    int i18 = classUnderTest0.add(644, 510);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 952);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 448);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1003);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1154);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(348, (int)(short)10);
    int i21 = classUnderTest0.add(533, 314);
    int i24 = classUnderTest0.add(151, 603);
    int i27 = classUnderTest0.add(209, 479);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 358);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 847);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 754);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 688);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add(173, 470);
    int i21 = classUnderTest0.add(348, 711);
    int i24 = classUnderTest0.add(1059, 2228);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 206);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 643);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1059);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3287);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(736, 0);
    int i27 = classUnderTest0.add(138, 996);
    int i30 = classUnderTest0.add(728, 1220);
    int i33 = classUnderTest0.add(1925, 4155);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1068);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 736);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1134);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1948);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 6080);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(236, 517);
    int i24 = classUnderTest0.add(586, 3062);
    int i27 = classUnderTest0.add(1109, 6752);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 753);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3648);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 7861);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(565, 348);
    int i24 = classUnderTest0.add(992, 118);
    int i27 = classUnderTest0.add(2143, 1142);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 913);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1110);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3285);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add(10, 108);
    int i21 = classUnderTest0.add(720, 52);
    int i24 = classUnderTest0.add(4283, 218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 118);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 772);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4501);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(513, 34);
    int i27 = classUnderTest0.add(547, 1453);
    int i30 = classUnderTest0.add(2427, 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 547);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2544);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(151, 0);
    int i21 = classUnderTest0.add(697, 138);
    int i24 = classUnderTest0.add(2511, 1045);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 835);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3556);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(10, 217);
    int i24 = classUnderTest0.add(2927, 1402);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 227);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4329);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(35, 270);
    int i18 = classUnderTest0.add(1567, 2374);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 305);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3941);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(179, 549);
    int i21 = classUnderTest0.add(1443, 448);
    int i24 = classUnderTest0.add(1563, 451);
    int i27 = classUnderTest0.add(533, 2014);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1891);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2014);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2547);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(34, 309);
    int i21 = classUnderTest0.add(512, 248);
    int i24 = classUnderTest0.add((int)(byte)-1, 323);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 343);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 760);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 322);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(305, 552);
    int i15 = classUnderTest0.add(118, 84);
    int i18 = classUnderTest0.add(1110, 343);
    int i21 = classUnderTest0.add(42, 7363);
    int i24 = classUnderTest0.add(87, 95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 857);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 202);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1453);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 7405);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 182);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(502, (int)'a');
    int i12 = classUnderTest0.add(479, 433);
    int i15 = classUnderTest0.add(52, 1059);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 599);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1111);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(433, 84);
    int i27 = classUnderTest0.add((int)(short)0, 207);
    int i30 = classUnderTest0.add(0, 1586);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 517);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1586);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(565, 348);
    int i24 = classUnderTest0.add(992, 118);
    int i27 = classUnderTest0.add(793, 1762);
    int i30 = classUnderTest0.add(1137, 2887);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 913);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1110);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2555);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4024);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(52, 645);
    int i24 = classUnderTest0.add(0, (int)(byte)-1);
    int i27 = classUnderTest0.add(3399, 609);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4008);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(305, 552);
    int i15 = classUnderTest0.add(118, 84);
    int i18 = classUnderTest0.add(1110, 343);
    int i21 = classUnderTest0.add(512, 300);
    int i24 = classUnderTest0.add(218, 847);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 857);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 202);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1453);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 812);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1065);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(10, 217);
    int i24 = classUnderTest0.add((int)(byte)1, 695);
    int i27 = classUnderTest0.add(32, 3652);
    int i30 = classUnderTest0.add(796, 53);
    int i33 = classUnderTest0.add(1249, 915);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 227);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 696);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3684);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 849);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2164);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(3177, 502);
    int i9 = classUnderTest0.add(3145, 4650);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3679);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 7795);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(52, 645);
    int i24 = classUnderTest0.add(665, 1052);
    int i27 = classUnderTest0.add(907, 1068);
    int i30 = classUnderTest0.add(1940, 1026);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1717);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1975);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2966);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(100, 53);
    int i21 = classUnderTest0.add(611, 100);
    int i24 = classUnderTest0.add(952, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 711);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 952);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(772, 368);
    int i21 = classUnderTest0.add((int)(byte)-1, (int)(byte)10);
    int i24 = classUnderTest0.add(3150, 502);
    int i27 = classUnderTest0.add(5518, 208);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1140);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3652);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5726);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(952, 139);
    int i24 = classUnderTest0.add(533, 728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 206);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1091);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1261);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(772, 368);
    int i21 = classUnderTest0.add(4283, 486);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1140);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4769);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(269, 233);
    int i21 = classUnderTest0.add(1567, 1250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 502);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2817);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(2424, 917);
    int i27 = classUnderTest0.add(270, 6116);
    int i30 = classUnderTest0.add(4060, 2219);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3341);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 6386);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 6279);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(1314, 1717);
    int i18 = classUnderTest0.add(3285, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3031);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3285);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(808, 801);
    int i27 = classUnderTest0.add(448, 720);
    int i30 = classUnderTest0.add(635, 280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1068);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1609);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1168);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 915);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add(173, 470);
    int i21 = classUnderTest0.add(51, 9395);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 206);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 643);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 9446);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'a', 0);
    int i24 = classUnderTest0.add(217, 486);
    int i27 = classUnderTest0.add(1763, 1110);
    int i30 = classUnderTest0.add(1137, 820);
    int i33 = classUnderTest0.add(1940, 2101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 703);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2873);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1957);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 4041);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add(154, 325);
    int i21 = classUnderTest0.add(3000, 139);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 479);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3139);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(479, 1312);
    int i24 = classUnderTest0.add(1717, 2741);
    int i27 = classUnderTest0.add(2718, 912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1791);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4458);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3630);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(269, 233);
    int i21 = classUnderTest0.add(196, 1052);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 502);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1248);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add((int)(byte)10, 502);
    int i21 = classUnderTest0.add(34, 298);
    int i24 = classUnderTest0.add(398, 4671);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 5069);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(7363, 238);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 7601);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(94, (int)(short)1);
    int i18 = classUnderTest0.add(145, 1795);
    int i21 = classUnderTest0.add(489, 796);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 565);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1940);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1285);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(34, 3116);
    int i15 = classUnderTest0.add(348, 2999);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3347);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 568);
    int i24 = classUnderTest0.add(0, 793);
    int i27 = classUnderTest0.add(2563, 1295);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 568);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 793);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3858);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(0, 820);
    int i12 = classUnderTest0.add(102, 303);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 820);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 405);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(772, 368);
    int i21 = classUnderTest0.add((int)(byte)-1, (int)(byte)10);
    int i24 = classUnderTest0.add((int)(short)10, 205);
    int i27 = classUnderTest0.add(1077, 173);
    int i30 = classUnderTest0.add(968, 0);
    int i33 = classUnderTest0.add(234, 0);
    int i36 = classUnderTest0.add(614, 2108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1140);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 215);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 968);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2722);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(20, 153);
    int i6 = classUnderTest0.add(786, 695);
    int i9 = classUnderTest0.add(1241, 3185);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 173);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1481);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 4426);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add((int)(byte)-1, (int)(short)1);
    int i21 = classUnderTest0.add(101, 4545);
    int i24 = classUnderTest0.add(6525, 3963);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4646);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 10488);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(323, 2104);
    int i24 = classUnderTest0.add(145, 97);
    int i27 = classUnderTest0.add(3160, 0);
    int i30 = classUnderTest0.add(816, 9446);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 206);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2427);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 242);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 10262);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(770, 1170);
    int i18 = classUnderTest0.add(2120, 996);
    int i21 = classUnderTest0.add(2180, 154);
    int i24 = classUnderTest0.add(154, 97);
    int i27 = classUnderTest0.add(1942, 2718);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1940);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3116);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2334);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 251);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4660);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(233, 665);
    int i15 = classUnderTest0.add(2187, 700);
    int i18 = classUnderTest0.add(3195, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2887);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3195);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(736, 0);
    int i27 = classUnderTest0.add(138, 996);
    int i30 = classUnderTest0.add(0, 3890);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1068);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 736);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1134);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3890);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add((int)(short)10, 331);
    int i27 = classUnderTest0.add(197, 2980);
    int i30 = classUnderTest0.add(3357, 3285);
    int i33 = classUnderTest0.add((int)(short)-1, 4384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 341);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3177);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 6642);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 4383);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(154, 512);
    int i24 = classUnderTest0.add(234, 645);
    int i27 = classUnderTest0.add(9, 42);
    int i30 = classUnderTest0.add(2120, 3139);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 666);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 879);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5259);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(byte)1, 208);
    int i21 = classUnderTest0.add(9446, 1364);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 209);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10810);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(898, 503);
    int i15 = classUnderTest0.add(720, 348);
    int i18 = classUnderTest0.add(2081, 17245);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1401);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1068);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 19326);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(200, 101);
    int i15 = classUnderTest0.add(20, 612);
    int i18 = classUnderTest0.add(0, 227);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 301);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 632);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 227);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add((int)(byte)1, 786);
    int i21 = classUnderTest0.add(549, 1594);
    int i24 = classUnderTest0.add(3983, (int)(short)10);
    int i27 = classUnderTest0.add(11552, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 787);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2143);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3993);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 11552);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(20, 153);
    int i6 = classUnderTest0.add(449, 3341);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 173);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3790);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 97);
    int i15 = classUnderTest0.add(205, 10);
    int i18 = classUnderTest0.add(1, 791);
    int i21 = classUnderTest0.add(1626, 533);
    int i24 = classUnderTest0.add(2719, 5077);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 215);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 792);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2159);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 7796);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(32, (int)'4');
    int i24 = classUnderTest0.add(139, 898);
    int i27 = classUnderTest0.add(992, 258);
    int i30 = classUnderTest0.add(403, 107);
    int i33 = classUnderTest0.add(2074, 643);
    int i36 = classUnderTest0.add(1629, 1298);
    int i39 = classUnderTest0.add(208, 801);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1037);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 510);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2717);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2927);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1009);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add(950, 517);
    int i15 = classUnderTest0.add(2290, 466);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1467);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2756);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(198, 100);
    int i21 = classUnderTest0.add(1037, 0);
    int i24 = classUnderTest0.add(1429, 3116);
    int i27 = classUnderTest0.add(4155, 414);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1037);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4545);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4569);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add(10, 108);
    int i21 = classUnderTest0.add(720, 52);
    int i24 = classUnderTest0.add(720, 100);
    int i27 = classUnderTest0.add(1401, 479);
    int i30 = classUnderTest0.add(1940, 1220);
    int i33 = classUnderTest0.add(0, 568);
    int i36 = classUnderTest0.add(4366, 3287);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 118);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 772);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 820);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1880);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 568);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 7653);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)(byte)10, 197);
    int i24 = classUnderTest0.add(414, 547);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 961);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(952, 139);
    int i24 = classUnderTest0.add(533, 202);
    int i27 = classUnderTest0.add(1476, 1554);
    int i30 = classUnderTest0.add(1429, 2718);
    int i33 = classUnderTest0.add(928, 772);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 206);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1091);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 735);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3030);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4147);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1700);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(95, (int)(short)-1);
    int i15 = classUnderTest0.add(210, 635);
    int i18 = classUnderTest0.add(2429, 1013);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 845);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3442);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(35, (int)(short)0);
    int i9 = classUnderTest0.add(9395, 347);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 9742);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(151, 0);
    int i21 = classUnderTest0.add(517, 1791);
    int i24 = classUnderTest0.add(420, 0);
    int i27 = classUnderTest0.add(1762, 940);
    int i30 = classUnderTest0.add(1052, 1250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2308);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 420);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2702);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2302);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(byte)1, 208);
    int i21 = classUnderTest0.add(808, 269);
    int i24 = classUnderTest0.add(2867, 2219);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 209);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1077);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 5086);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(32, (int)'4');
    int i24 = classUnderTest0.add(139, 898);
    int i27 = classUnderTest0.add(992, 258);
    int i30 = classUnderTest0.add(403, 107);
    int i33 = classUnderTest0.add(2074, 643);
    int i36 = classUnderTest0.add(1629, 1298);
    int i39 = classUnderTest0.add(1609, 820);
    int i42 = classUnderTest0.add(1261, 370);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1037);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 510);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2717);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2927);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2429);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1631);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add((int)(byte)1, 786);
    int i21 = classUnderTest0.add(549, 1594);
    int i24 = classUnderTest0.add(770, 1223);
    int i27 = classUnderTest0.add(5069, 1506);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 787);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2143);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1993);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 6575);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(100, 433);
    int i24 = classUnderTest0.add(118, 207);
    int i27 = classUnderTest0.add(512, (int)(short)100);
    int i30 = classUnderTest0.add(298, 6752);
    int i33 = classUnderTest0.add(3220, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 325);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 612);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 7050);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 3220);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(100, 53);
    int i21 = classUnderTest0.add(611, 100);
    int i24 = classUnderTest0.add(898, 348);
    int i27 = classUnderTest0.add(214, 2343);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 711);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1246);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2557);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add((int)'4', 643);
    int i18 = classUnderTest0.add(0, 1091);
    int i21 = classUnderTest0.add(135, 227);
    int i24 = classUnderTest0.add(2267, 451);
    int i27 = classUnderTest0.add(95, 2459);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 695);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1091);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 362);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2718);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2554);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add(10, 108);
    int i21 = classUnderTest0.add(720, 52);
    int i24 = classUnderTest0.add(720, 100);
    int i27 = classUnderTest0.add(108, 206);
    int i30 = classUnderTest0.add(857, 517);
    int i33 = classUnderTest0.add(200, 332);
    int i36 = classUnderTest0.add(3150, 2343);
    int i39 = classUnderTest0.add(0, 410);
    int i42 = classUnderTest0.add(0, 3808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 118);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 772);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 820);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 314);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1374);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 532);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 5493);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 410);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 3808);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(502, (int)'a');
    int i12 = classUnderTest0.add(6752, 611);
    int i15 = classUnderTest0.add(1196, 95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 599);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 7363);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1291);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(150, 300);
    int i27 = classUnderTest0.add(938, 303);
    int i30 = classUnderTest0.add(366, 666);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 450);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1032);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(946, 196);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1142);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add((int)'#', (int)(byte)-1);
    int i21 = classUnderTest0.add(786, 206);
    int i24 = classUnderTest0.add(0, 147);
    int i27 = classUnderTest0.add(2187, 2554);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 992);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 147);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4741);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(153, (int)(byte)1);
    int i18 = classUnderTest0.add(118, (int)(byte)-1);
    int i21 = classUnderTest0.add(1593, 323);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1916);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add(10, 108);
    int i21 = classUnderTest0.add(720, 52);
    int i24 = classUnderTest0.add(720, 100);
    int i27 = classUnderTest0.add(108, 206);
    int i30 = classUnderTest0.add(300, 248);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 118);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 772);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 820);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 314);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 548);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(1163, 366);
    int i15 = classUnderTest0.add(267, 0);
    int i18 = classUnderTest0.add(2483, 1054);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1529);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 267);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3537);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(byte)1, 208);
    int i21 = classUnderTest0.add(150, 3160);
    int i24 = classUnderTest0.add(4306, 3652);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 209);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3310);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 7958);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add((int)(byte)1, 786);
    int i21 = classUnderTest0.add(2511, 3009);
    int i24 = classUnderTest0.add(816, 899);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 787);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5520);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1715);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add((int)(short)10, 97);
    int i21 = classUnderTest0.add(1629, 6112);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 7741);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(4019, 347);
    int i21 = classUnderTest0.add(1629, 1761);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3390);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(574, 1534);
    int i24 = classUnderTest0.add(772, 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1005);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(135, 1467);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 565);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1602);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add((int)(byte)1, 786);
    int i21 = classUnderTest0.add(2511, 3009);
    int i24 = classUnderTest0.add(869, 898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 787);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5520);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1767);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'a', 0);
    int i24 = classUnderTest0.add(151, 217);
    int i27 = classUnderTest0.add(95, 643);
    int i30 = classUnderTest0.add(0, 3421);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 738);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3421);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(793, 135);
    int i18 = classUnderTest0.add(218, 1077);
    int i21 = classUnderTest0.add(2227, 4569);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 565);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 928);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1295);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 6796);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add((int)(byte)1, 786);
    int i21 = classUnderTest0.add(549, 1594);
    int i24 = classUnderTest0.add(3983, (int)(short)10);
    int i27 = classUnderTest0.add(1363, 3287);
    int i30 = classUnderTest0.add(420, 4060);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 787);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2143);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3993);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4650);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4480);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(118, 118);
    int i18 = classUnderTest0.add(238, 2793);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 236);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3031);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(703, 609);
    int i18 = classUnderTest0.add(9, (int)'a');
    int i21 = classUnderTest0.add(147, 1296);
    int i24 = classUnderTest0.add(300, 796);
    int i27 = classUnderTest0.add(3083, 681);
    int i30 = classUnderTest0.add(7363, 1532);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 106);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1443);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3764);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 8895);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(808, 801);
    int i27 = classUnderTest0.add(331, 138);
    int i30 = classUnderTest0.add(4479, 0);
    int i33 = classUnderTest0.add(151, 1906);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1068);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1609);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 469);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4479);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2057);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(10, 217);
    int i24 = classUnderTest0.add((int)(byte)1, 695);
    int i27 = classUnderTest0.add(32, 3652);
    int i30 = classUnderTest0.add(796, 53);
    int i33 = classUnderTest0.add(196, 982);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 227);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 696);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3684);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 849);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1178);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'a', 0);
    int i24 = classUnderTest0.add(151, 217);
    int i27 = classUnderTest0.add(10, (int)(byte)10);
    int i30 = classUnderTest0.add(205, 347);
    int i33 = classUnderTest0.add(2821, 356);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 552);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 3177);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add(154, 325);
    int i21 = classUnderTest0.add(42, 1350);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 479);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1392);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add(154, 325);
    int i21 = classUnderTest0.add(808, 237);
    int i24 = classUnderTest0.add(848, 2486);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 479);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1045);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3334);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(35, 206);
    int i27 = classUnderTest0.add(1593, 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1677);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)(byte)10, 197);
    int i24 = classUnderTest0.add(105, 34);
    int i27 = classUnderTest0.add(98, 150);
    int i30 = classUnderTest0.add(770, 564);
    int i33 = classUnderTest0.add(668, 1285);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 139);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 248);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1334);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1953);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(34, 309);
    int i21 = classUnderTest0.add(2572, 6752);
    int i24 = classUnderTest0.add(3390, 2999);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 343);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 9324);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6389);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(34, 3116);
    int i15 = classUnderTest0.add(227, 2219);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2446);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(52, 645);
    int i24 = classUnderTest0.add(0, (int)(byte)-1);
    int i27 = classUnderTest0.add(2093, 179);
    int i30 = classUnderTest0.add(1415, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2272);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1415);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(1629, 2531);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 4160);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add(10, 108);
    int i21 = classUnderTest0.add(720, 52);
    int i24 = classUnderTest0.add(720, 100);
    int i27 = classUnderTest0.add(108, 206);
    int i30 = classUnderTest0.add(2057, 1777);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 118);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 772);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 820);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 314);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3834);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(996, (int)(short)0);
    int i15 = classUnderTest0.add(870, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 996);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 870);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(479, 1312);
    int i24 = classUnderTest0.add(486, 100);
    int i27 = classUnderTest0.add(1077, 486);
    int i30 = classUnderTest0.add(322, 11552);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1791);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 586);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1563);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11874);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(772, 368);
    int i21 = classUnderTest0.add(97, 323);
    int i24 = classUnderTest0.add(1492, 3287);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1140);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 420);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4779);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)(byte)10, 197);
    int i24 = classUnderTest0.add(105, 34);
    int i27 = classUnderTest0.add(2338, 1561);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 139);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3899);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(153, (int)(byte)1);
    int i18 = classUnderTest0.add(6336, 2607);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 8943);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(6499, 10262);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 16761);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(298, 0);
    int i24 = classUnderTest0.add(675, 907);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1582);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(479, 1312);
    int i24 = classUnderTest0.add(486, 100);
    int i27 = classUnderTest0.add(1077, 486);
    int i30 = classUnderTest0.add(0, 2180);
    int i33 = classUnderTest0.add(9446, 1532);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1791);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 586);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1563);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2180);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 10978);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add(270, 10);
    int i21 = classUnderTest0.add((int)(byte)100, 53);
    int i24 = classUnderTest0.add(217, 366);
    int i27 = classUnderTest0.add(480, 4418);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 583);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4898);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(byte)1, 208);
    int i21 = classUnderTest0.add(215, 108);
    int i24 = classUnderTest0.add(787, 205);
    int i27 = classUnderTest0.add(5223, 2693);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 209);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 323);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 992);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 7916);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(10, 198);
    int i18 = classUnderTest0.add(512, 153);
    int i21 = classUnderTest0.add(1677, 4479);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 208);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 665);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 6156);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(35, 270);
    int i18 = classUnderTest0.add((int)(short)0, 2374);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 305);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2374);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(35, (int)(byte)-1);
    int i24 = classUnderTest0.add(2330, 700);
    int i27 = classUnderTest0.add(4501, 1903);
    int i30 = classUnderTest0.add(1262, 3471);
    int i33 = classUnderTest0.add(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3030);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 6404);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4733);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(772, 368);
    int i21 = classUnderTest0.add((int)(byte)-1, (int)(byte)10);
    int i24 = classUnderTest0.add((int)(short)10, 205);
    int i27 = classUnderTest0.add(1077, 173);
    int i30 = classUnderTest0.add(968, 0);
    int i33 = classUnderTest0.add(3652, 632);
    int i36 = classUnderTest0.add(8951, 4704);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1140);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 215);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 968);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 4284);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 13655);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(10, 217);
    int i24 = classUnderTest0.add((int)(byte)1, 695);
    int i27 = classUnderTest0.add(0, 3245);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 227);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 696);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3245);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(996, 300);
    int i15 = classUnderTest0.add(1140, 489);
    int i18 = classUnderTest0.add(3630, 154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1296);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1629);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3784);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(703, 1260);
    int i18 = classUnderTest0.add(3421, 1660);
    int i21 = classUnderTest0.add(786, 2465);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1963);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 5081);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3251);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(197, 611);
    int i15 = classUnderTest0.add(1506, 9446);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10952);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(35, 206);
    int i27 = classUnderTest0.add(547, 1940);
    int i30 = classUnderTest0.add((int)' ', 1363);
    int i33 = classUnderTest0.add(2247, 1032);
    int i36 = classUnderTest0.add(1423, 6116);
    int i39 = classUnderTest0.add(7861, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2487);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1395);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 3279);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 7539);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 7861);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(10, 217);
    int i24 = classUnderTest0.add((int)(byte)1, 695);
    int i27 = classUnderTest0.add(32, 3652);
    int i30 = classUnderTest0.add(796, 53);
    int i33 = classUnderTest0.add(633, 4324);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 227);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 696);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3684);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 849);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 4957);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)-1, 197);
    int i18 = classUnderTest0.add(996, 151);
    int i21 = classUnderTest0.add(1315, 996);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 196);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1147);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2311);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add((int)' ', 205);
    int i18 = classUnderTest0.add(847, 2179);
    int i21 = classUnderTest0.add(5620, 600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 237);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3026);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 6220);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(565, 448);
    int i21 = classUnderTest0.add(250, 1009);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1013);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1259);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add(10, 108);
    int i21 = classUnderTest0.add(720, 52);
    int i24 = classUnderTest0.add(720, 100);
    int i27 = classUnderTest0.add(1147, 1476);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 118);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 772);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 820);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2623);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(635, 303);
    int i18 = classUnderTest0.add(4019, 760);
    int i21 = classUnderTest0.add(486, 2104);
    int i24 = classUnderTest0.add(3277, 4140);
    int i27 = classUnderTest0.add(420, 314);
    int i30 = classUnderTest0.add(138, 218);
    int i33 = classUnderTest0.add(7417, 983);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 938);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4779);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2590);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 7417);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 734);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 356);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 8400);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(348, 1246);
    int i24 = classUnderTest0.add(2693, 0);
    int i27 = classUnderTest0.add(438, 1068);
    int i30 = classUnderTest0.add(12799, 3195);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1594);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2693);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1506);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 15994);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(1212, 3100);
    int i21 = classUnderTest0.add(6220, 1761);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 7981);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'a', 0);
    int i24 = classUnderTest0.add(151, 217);
    int i27 = classUnderTest0.add(10, (int)(byte)10);
    int i30 = classUnderTest0.add(205, 347);
    int i33 = classUnderTest0.add(666, 34);
    int i36 = classUnderTest0.add(1733, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 552);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 700);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1733);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(138, 332);
    int i24 = classUnderTest0.add(1940, 438);
    int i27 = classUnderTest0.add(2179, 2980);
    int i30 = classUnderTest0.add(2290, 118);
    int i33 = classUnderTest0.add(1529, 728);
    int i36 = classUnderTest0.add(180, 6116);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 470);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2378);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5159);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2257);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 6296);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(233, 665);
    int i15 = classUnderTest0.add(5791, 760);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 6551);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(808, 801);
    int i27 = classUnderTest0.add(992, 3009);
    int i30 = classUnderTest0.add(4941, 1392);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1068);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1609);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 6333);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(10, 198);
    int i18 = classUnderTest0.add(512, 153);
    int i21 = classUnderTest0.add(135, 433);
    int i24 = classUnderTest0.add(517, 5726);
    int i27 = classUnderTest0.add(2104, 6379);
    int i30 = classUnderTest0.add(1178, 3160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 208);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 665);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 568);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 8483);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4338);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(305, 486);
    int i21 = classUnderTest0.add(98, 898);
    int i24 = classUnderTest0.add((int)'a', 1382);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 791);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 996);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1479);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(0, 820);
    int i12 = classUnderTest0.add(1673, 786);
    int i15 = classUnderTest0.add(1578, 479);
    int i18 = classUnderTest0.add(195, 697);
    int i21 = classUnderTest0.add(154, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 820);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2459);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2057);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 892);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 154);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(100, 433);
    int i24 = classUnderTest0.add(118, 207);
    int i27 = classUnderTest0.add(3083, 2483);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 325);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5566);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(348, (int)(short)10);
    int i21 = classUnderTest0.add(533, 314);
    int i24 = classUnderTest0.add(10488, 1096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 358);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 847);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 11584);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add((int)(byte)100, 98);
    int i18 = classUnderTest0.add(914, 996);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 198);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1910);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(772, 368);
    int i21 = classUnderTest0.add((int)(byte)-1, (int)(byte)10);
    int i24 = classUnderTest0.add(3150, 502);
    int i27 = classUnderTest0.add(914, 510);
    int i30 = classUnderTest0.add(6525, 3279);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1140);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3652);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1424);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 9804);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(153, (int)(byte)1);
    int i18 = classUnderTest0.add(118, (int)(byte)-1);
    int i21 = classUnderTest0.add(635, 348);
    int i24 = classUnderTest0.add(2427, 4098);
    int i27 = classUnderTest0.add(5159, 1761);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 983);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6525);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 6920);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 97);
    int i15 = classUnderTest0.add(1453, 398);
    int i18 = classUnderTest0.add(209, 267);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1851);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 476);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add(154, 325);
    int i21 = classUnderTest0.add(2015, 4284);
    int i24 = classUnderTest0.add(3083, 3263);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 479);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 6299);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6346);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add((int)(short)10, 331);
    int i27 = classUnderTest0.add(1481, 946);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 341);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2427);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(233, 665);
    int i15 = classUnderTest0.add(5176, 195);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 5371);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(323, 703);
    int i15 = classUnderTest0.add(1314, 10488);
    int i18 = classUnderTest0.add(1315, 3150);
    int i21 = classUnderTest0.add(0, 13101);
    int i24 = classUnderTest0.add(2074, 9726);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1026);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 11802);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4465);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 13101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 11800);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)0, 52);
    int i15 = classUnderTest0.add(10720, 1060);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 11780);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(206, 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 307);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(10, 198);
    int i18 = classUnderTest0.add(512, 153);
    int i21 = classUnderTest0.add(135, 433);
    int i24 = classUnderTest0.add(940, 42);
    int i27 = classUnderTest0.add(605, 2340);
    int i30 = classUnderTest0.add(1037, 4661);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 208);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 665);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 568);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 982);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2945);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5698);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(703, 1260);
    int i18 = classUnderTest0.add(3421, 1660);
    int i21 = classUnderTest0.add(1431, 3310);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1963);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 5081);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4741);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(503, 217);
    int i24 = classUnderTest0.add(983, 914);
    int i27 = classUnderTest0.add(0, 1109);
    int i30 = classUnderTest0.add(756, 2299);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 720);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1897);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3055);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(1395, 9324);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10719);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(209, (int)(byte)100);
    int i21 = classUnderTest0.add(214, 700);
    int i24 = classUnderTest0.add(532, 1154);
    int i27 = classUnderTest0.add(1626, 633);
    int i30 = classUnderTest0.add(3937, 2458);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 309);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 914);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1686);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2259);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 6395);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(565, 348);
    int i24 = classUnderTest0.add(992, 118);
    int i27 = classUnderTest0.add(2572, 3347);
    int i30 = classUnderTest0.add(0, 2429);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 913);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1110);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5919);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2429);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(35, (int)(byte)-1);
    int i24 = classUnderTest0.add(2330, 700);
    int i27 = classUnderTest0.add(1476, 20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3030);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1496);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(2821, 9446);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 12267);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(151, 0);
    int i21 = classUnderTest0.add(697, 138);
    int i24 = classUnderTest0.add(5726, 4001);
    int i27 = classUnderTest0.add(1374, 1007);
    int i30 = classUnderTest0.add(2588, 2179);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 835);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 9727);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2381);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4767);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add((int)(byte)100, 98);
    int i18 = classUnderTest0.add(206, 97);
    int i21 = classUnderTest0.add(343, 564);
    int i24 = classUnderTest0.add(2557, 2219);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 198);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 303);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 907);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4776);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add((int)(byte)10, 502);
    int i21 = classUnderTest0.add((int)' ', 3983);
    int i24 = classUnderTest0.add(1423, 1456);
    int i27 = classUnderTest0.add(7958, 898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4015);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2879);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 8856);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(479, 135);
    int i21 = classUnderTest0.add(1857, 12799);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 614);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 14656);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(703, 609);
    int i18 = classUnderTest0.add(9, (int)'a');
    int i21 = classUnderTest0.add(816, 6393);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 106);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 7209);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(770, 1170);
    int i18 = classUnderTest0.add(2120, 996);
    int i21 = classUnderTest0.add(2180, 154);
    int i24 = classUnderTest0.add(154, 97);
    int i27 = classUnderTest0.add(3220, 298);
    int i30 = classUnderTest0.add(22759, 4496);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1940);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3116);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2334);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 251);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3518);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 27255);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(6081, 98);
    int i21 = classUnderTest0.add(12803, 2101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 6179);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 14904);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(280, 940);
    int i18 = classUnderTest0.add(645, 309);
    int i21 = classUnderTest0.add(1009, 2247);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1220);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 954);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3256);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(100, 433);
    int i24 = classUnderTest0.add(331, 6421);
    int i27 = classUnderTest0.add(4206, 3094);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6752);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 7300);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(205, 298);
    int i12 = classUnderTest0.add(243, 0);
    int i15 = classUnderTest0.add(4543, 1196);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 503);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 5739);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(100, 433);
    int i24 = classUnderTest0.add(118, 207);
    int i27 = classUnderTest0.add(512, (int)(short)100);
    int i30 = classUnderTest0.add(907, 202);
    int i33 = classUnderTest0.add(8665, 1083);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 325);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 612);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 9748);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 3399);
    int i24 = classUnderTest0.add(1792, 7927);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3399);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 9719);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(368, 118);
    int i18 = classUnderTest0.add(52, 209);
    int i21 = classUnderTest0.add(1880, 347);
    int i24 = classUnderTest0.add(791, 5620);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 486);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 261);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2227);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6411);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(368, 118);
    int i18 = classUnderTest0.add((int)(short)100, (int)(byte)0);
    int i21 = classUnderTest0.add(410, (int)(byte)0);
    int i24 = classUnderTest0.add(2272, 2632);
    int i27 = classUnderTest0.add(2005, 150);
    int i30 = classUnderTest0.add(4501, 8539);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 486);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 410);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4904);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2155);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 13040);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add((int)(short)10, 97);
    int i21 = classUnderTest0.add(51, 848);
    int i24 = classUnderTest0.add(7284, 1975);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 899);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 9259);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(502, (int)'a');
    int i12 = classUnderTest0.add(7985, 1332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 599);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 9317);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(118, 118);
    int i18 = classUnderTest0.add(202, 1995);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 236);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2197);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(100, 433);
    int i24 = classUnderTest0.add(118, 207);
    int i27 = classUnderTest0.add(42, 258);
    int i30 = classUnderTest0.add(588, 11968);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 325);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 300);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 12556);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add((int)' ', 106);
    int i18 = classUnderTest0.add(845, 5548);
    int i21 = classUnderTest0.add(5564, 334);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 138);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 6393);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5898);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(433, 84);
    int i27 = classUnderTest0.add((int)(short)0, 207);
    int i30 = classUnderTest0.add(1110, 796);
    int i33 = classUnderTest0.add(2726, 1334);
    int i36 = classUnderTest0.add(2693, 2076);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 517);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1906);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 4060);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 4769);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(433, 84);
    int i27 = classUnderTest0.add((int)(short)0, 207);
    int i30 = classUnderTest0.add(1110, 796);
    int i33 = classUnderTest0.add(1003, 4545);
    int i36 = classUnderTest0.add(314, 1948);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 517);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1906);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 5548);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2262);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(52, 645);
    int i24 = classUnderTest0.add(0, (int)(byte)-1);
    int i27 = classUnderTest0.add(2093, 179);
    int i30 = classUnderTest0.add(3651, 1469);
    int i33 = classUnderTest0.add(0, 3753);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2272);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5120);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 3753);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(0, 84);
    int i21 = classUnderTest0.add(9324, 2025);
    int i24 = classUnderTest0.add(2104, 503);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 11349);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2607);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(35, 206);
    int i27 = classUnderTest0.add(547, 1940);
    int i30 = classUnderTest0.add(4155, 341);
    int i33 = classUnderTest0.add(0, 781);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2487);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4496);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 781);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(4019, 347);
    int i21 = classUnderTest0.add(15412, 8400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 23812);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(35, (int)(short)0);
    int i9 = classUnderTest0.add(0, 269);
    int i12 = classUnderTest0.add(1431, 2459);
    int i15 = classUnderTest0.add(946, 2950);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3890);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3896);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(205, 298);
    int i12 = classUnderTest0.add(243, 0);
    int i15 = classUnderTest0.add(1763, 1594);
    int i18 = classUnderTest0.add(706, 2693);
    int i21 = classUnderTest0.add(328, 8821);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 503);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3357);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3399);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 9149);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(305, 635);
    int i15 = classUnderTest0.add(772, 36);
    int i18 = classUnderTest0.add(1083, 332);
    int i21 = classUnderTest0.add(17104, 270);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 940);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1415);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 17374);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add((int)'4', 643);
    int i18 = classUnderTest0.add(0, 1091);
    int i21 = classUnderTest0.add(135, 227);
    int i24 = classUnderTest0.add(2267, 451);
    int i27 = classUnderTest0.add(1242, 753);
    int i30 = classUnderTest0.add(5018, 8856);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 695);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1091);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 362);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2718);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1995);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 13874);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(772, 368);
    int i21 = classUnderTest0.add((int)(byte)-1, (int)(byte)10);
    int i24 = classUnderTest0.add((int)(short)10, 205);
    int i27 = classUnderTest0.add(1077, 173);
    int i30 = classUnderTest0.add(552, 1791);
    int i33 = classUnderTest0.add(1156, 208);
    int i36 = classUnderTest0.add(603, 609);
    int i39 = classUnderTest0.add(6074, 1314);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1140);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 215);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2343);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1364);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1212);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 7388);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(118, 1052);
    int i21 = classUnderTest0.add(568, 12533);
    int i24 = classUnderTest0.add(1761, 3569);
    int i27 = classUnderTest0.add(366, 695);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 13101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 5330);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1061);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(short)1, 269);
    int i15 = classUnderTest0.add(100, 298);
    int i18 = classUnderTest0.add(332, 1246);
    int i21 = classUnderTest0.add(1401, 4312);
    int i24 = classUnderTest0.add(2120, 8951);
    int i27 = classUnderTest0.add(4545, 0);
    int i30 = classUnderTest0.add(1700, 11780);
    int i33 = classUnderTest0.add(2693, 2381);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 270);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 398);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1578);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5713);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 11071);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4545);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 13480);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 5074);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add((int)(short)-1, 150);
    int i24 = classUnderTest0.add(4352, 4479);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 149);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 8831);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(479, 1312);
    int i24 = classUnderTest0.add(486, 100);
    int i27 = classUnderTest0.add(4019, 9727);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1791);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 586);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 13746);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(32, (int)'4');
    int i24 = classUnderTest0.add(139, 898);
    int i27 = classUnderTest0.add(992, 258);
    int i30 = classUnderTest0.add(403, 107);
    int i33 = classUnderTest0.add(720, 643);
    int i36 = classUnderTest0.add(625, 3019);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1037);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 510);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1363);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 3644);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'a', 0);
    int i24 = classUnderTest0.add(151, 217);
    int i27 = classUnderTest0.add(982, 0);
    int i30 = classUnderTest0.add(1529, 954);
    int i33 = classUnderTest0.add(11, 6091);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 982);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2483);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 6102);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(1163, 366);
    int i15 = classUnderTest0.add(267, 0);
    int i18 = classUnderTest0.add(118, 787);
    int i21 = classUnderTest0.add(3062, 3160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1529);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 267);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 905);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 6222);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(410, 198);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 608);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(10, 198);
    int i18 = classUnderTest0.add(512, 153);
    int i21 = classUnderTest0.add(135, 433);
    int i24 = classUnderTest0.add(940, 42);
    int i27 = classUnderTest0.add(1791, (int)(short)100);
    int i30 = classUnderTest0.add(17245, 7822);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 208);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 665);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 568);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 982);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1891);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 25067);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add((int)(byte)10, 502);
    int i21 = classUnderTest0.add(34, 298);
    int i24 = classUnderTest0.add(502, 234);
    int i27 = classUnderTest0.add(1248, 3009);
    int i30 = classUnderTest0.add(754, 0);
    int i33 = classUnderTest0.add(16968, 202);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 736);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4257);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 754);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 17170);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(703, 609);
    int i18 = classUnderTest0.add(9, (int)'a');
    int i21 = classUnderTest0.add(147, 1296);
    int i24 = classUnderTest0.add(94, 241);
    int i27 = classUnderTest0.add(2247, 0);
    int i30 = classUnderTest0.add(4453, 1270);
    int i33 = classUnderTest0.add(1249, 7300);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 106);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1443);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 335);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2247);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5723);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 8549);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add(270, 10);
    int i21 = classUnderTest0.add(197, 10);
    int i24 = classUnderTest0.add((int)(short)0, 149);
    int i27 = classUnderTest0.add(681, 3569);
    int i30 = classUnderTest0.add(4568, 9446);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 149);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 14014);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add(950, 517);
    int i15 = classUnderTest0.add(398, 6404);
    int i18 = classUnderTest0.add(20225, 781);
    int i21 = classUnderTest0.add(2262, 2446);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1467);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 6802);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 21006);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4708);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(233, 665);
    int i15 = classUnderTest0.add(1700, 3983);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 5683);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(151, 0);
    int i21 = classUnderTest0.add(410, 0);
    int i24 = classUnderTest0.add(1673, 7958);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 410);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 9631);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(479, 1312);
    int i24 = classUnderTest0.add(486, 100);
    int i27 = classUnderTest0.add((int)(short)10, 760);
    int i30 = classUnderTest0.add(0, 463);
    int i33 = classUnderTest0.add(3220, 3684);
    int i36 = classUnderTest0.add(1518, 633);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1791);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 586);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 770);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 463);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 6904);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2151);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(479, 1312);
    int i24 = classUnderTest0.add(486, 100);
    int i27 = classUnderTest0.add(1077, 486);
    int i30 = classUnderTest0.add(1350, 17374);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1791);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 586);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1563);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 18724);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(635, 303);
    int i18 = classUnderTest0.add(4019, 760);
    int i21 = classUnderTest0.add(3828, 20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 938);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4779);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3848);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(1891, 51);
    int i27 = classUnderTest0.add(2290, 3834);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1942);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 6124);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'a', 0);
    int i24 = classUnderTest0.add(151, 217);
    int i27 = classUnderTest0.add(10, (int)(byte)10);
    int i30 = classUnderTest0.add(11800, 21270);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 33070);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 97);
    int i15 = classUnderTest0.add(205, 10);
    int i18 = classUnderTest0.add(1, 791);
    int i21 = classUnderTest0.add(1626, 533);
    int i24 = classUnderTest0.add(1315, 154);
    int i27 = classUnderTest0.add(5018, 209);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 215);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 792);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2159);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1469);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5227);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(151, 197);
    int i21 = classUnderTest0.add(703, 95);
    int i24 = classUnderTest0.add(892, 2005);
    int i27 = classUnderTest0.add(23812, 1995);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 348);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 798);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2897);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 25807);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add((int)(byte)10, 502);
    int i21 = classUnderTest0.add(34, 298);
    int i24 = classUnderTest0.add(517, 1834);
    int i27 = classUnderTest0.add(15994, 307);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2351);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 16301);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add((int)'#', (int)(byte)-1);
    int i21 = classUnderTest0.add(786, 206);
    int i24 = classUnderTest0.add(0, 147);
    int i27 = classUnderTest0.add(3440, 4480);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 992);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 147);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 7920);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(323, 2104);
    int i24 = classUnderTest0.add(145, 97);
    int i27 = classUnderTest0.add(1762, 1777);
    int i30 = classUnderTest0.add(2288, 1609);
    int i33 = classUnderTest0.add(7405, 9699);
    int i36 = classUnderTest0.add(6389, 517);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 206);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2427);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 242);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3539);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3897);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 17104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 6906);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(7284, 3277);
    int i27 = classUnderTest0.add(5371, 7861);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1068);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 10561);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 13232);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)-1, 197);
    int i18 = classUnderTest0.add((int)(byte)0, 549);
    int i21 = classUnderTest0.add(3220, 3337);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 196);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 549);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 6557);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(772, 368);
    int i21 = classUnderTest0.add((int)(byte)-1, (int)(byte)10);
    int i24 = classUnderTest0.add((int)(short)10, 205);
    int i27 = classUnderTest0.add(1077, 173);
    int i30 = classUnderTest0.add(552, 1791);
    int i33 = classUnderTest0.add(1156, 208);
    int i36 = classUnderTest0.add(603, 609);
    int i39 = classUnderTest0.add(1140, 1792);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1140);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 215);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2343);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1364);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1212);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2932);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add((int)(byte)1, 786);
    int i21 = classUnderTest0.add(2511, 3009);
    int i24 = classUnderTest0.add(411, 214);
    int i27 = classUnderTest0.add(968, 8663);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 787);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5520);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 625);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 9631);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(565, 348);
    int i24 = classUnderTest0.add(992, 118);
    int i27 = classUnderTest0.add(2572, 3347);
    int i30 = classUnderTest0.add(3355, 4306);
    int i33 = classUnderTest0.add(4568, 1887);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 913);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1110);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5919);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 7661);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 6455);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(1511, 6421);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 7932);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)0, (int)'4');
    int i18 = classUnderTest0.add(52, 796);
    int i21 = classUnderTest0.add(1163, 197);
    int i24 = classUnderTest0.add(151, 2555);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 848);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1360);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2706);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(368, 118);
    int i18 = classUnderTest0.add((int)(short)100, (int)(byte)0);
    int i21 = classUnderTest0.add(410, (int)(byte)0);
    int i24 = classUnderTest0.add(9480, 786);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 486);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 410);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 10266);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)(byte)10, 197);
    int i24 = classUnderTest0.add(105, 34);
    int i27 = classUnderTest0.add(98, 150);
    int i30 = classUnderTest0.add(770, 564);
    int i33 = classUnderTest0.add(205, 206);
    int i36 = classUnderTest0.add(14245, 706);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 139);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 248);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1334);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 411);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 14951);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add((int)' ', 106);
    int i18 = classUnderTest0.add(0, 145);
    int i21 = classUnderTest0.add(1534, 8856);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 138);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 145);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10390);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(517, 269);
    int i27 = classUnderTest0.add(898, 879);
    int i30 = classUnderTest0.add(13191, 1940);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 786);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1777);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 15131);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(3177, 502);
    int i9 = classUnderTest0.add(1572, 4627);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3679);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 6199);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(368, 118);
    int i18 = classUnderTest0.add((int)(short)100, (int)(byte)0);
    int i21 = classUnderTest0.add(0, 241);
    int i24 = classUnderTest0.add(3543, 781);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 486);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4324);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(10, 198);
    int i18 = classUnderTest0.add(512, 153);
    int i21 = classUnderTest0.add(135, 433);
    int i24 = classUnderTest0.add(940, 42);
    int i27 = classUnderTest0.add(605, 2340);
    int i30 = classUnderTest0.add(847, 17525);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 208);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 665);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 568);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 982);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2945);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 18372);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(197, 151);
    int i18 = classUnderTest0.add((int)(short)100, 914);
    int i21 = classUnderTest0.add(9727, 2340);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 348);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1014);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 12067);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(736, 0);
    int i27 = classUnderTest0.add(1763, 913);
    int i30 = classUnderTest0.add(466, 410);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1068);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 736);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2676);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 876);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(153, (int)(byte)1);
    int i18 = classUnderTest0.add(118, (int)(byte)-1);
    int i21 = classUnderTest0.add(197, 1109);
    int i24 = classUnderTest0.add(1990, 2867);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1306);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4857);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(323, 2104);
    int i24 = classUnderTest0.add(145, 97);
    int i27 = classUnderTest0.add(3160, 0);
    int i30 = classUnderTest0.add(1932, 0);
    int i33 = classUnderTest0.add(4041, 14639);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 206);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2427);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 242);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1932);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 18680);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(179, 549);
    int i21 = classUnderTest0.add(1443, 448);
    int i24 = classUnderTest0.add(1563, 451);
    int i27 = classUnderTest0.add(857, 6220);
    int i30 = classUnderTest0.add(53, 4755);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1891);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2014);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 7077);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4808);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 97);
    int i15 = classUnderTest0.add(205, 10);
    int i18 = classUnderTest0.add(1, 791);
    int i21 = classUnderTest0.add(0, 1932);
    int i24 = classUnderTest0.add(1827, 6116);
    int i27 = classUnderTest0.add(954, 150);
    int i30 = classUnderTest0.add(0, 8679);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 215);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 792);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1932);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 7943);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 8679);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'a', 0);
    int i24 = classUnderTest0.add(151, 217);
    int i27 = classUnderTest0.add(97, 0);
    int i30 = classUnderTest0.add(533, 796);
    int i33 = classUnderTest0.add(2887, 2717);
    int i36 = classUnderTest0.add(2080, 1424);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1329);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 5604);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 3504);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(147, 564);
    int i21 = classUnderTest0.add(0, 298);
    int i24 = classUnderTest0.add(2706, 2066);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 711);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4772);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(703, 609);
    int i18 = classUnderTest0.add(9, (int)'a');
    int i21 = classUnderTest0.add(147, 1296);
    int i24 = classUnderTest0.add(94, 241);
    int i27 = classUnderTest0.add(1026, 8539);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 106);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1443);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 335);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 9565);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add((int)(byte)1, 786);
    int i21 = classUnderTest0.add(549, 1594);
    int i24 = classUnderTest0.add(3983, (int)(short)10);
    int i27 = classUnderTest0.add(1363, 3287);
    int i30 = classUnderTest0.add(1956, 2693);
    int i33 = classUnderTest0.add(8483, 179);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 787);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2143);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3993);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4650);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4649);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 8662);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(433, 84);
    int i27 = classUnderTest0.add((int)(short)0, 207);
    int i30 = classUnderTest0.add(261, 1529);
    int i33 = classUnderTest0.add(236, 214);
    int i36 = classUnderTest0.add(1791, 633);
    int i39 = classUnderTest0.add(1932, 5548);
    int i42 = classUnderTest0.add(982, 5077);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 517);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1790);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 450);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2424);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 7480);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 6059);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(952, 139);
    int i24 = classUnderTest0.add(533, 202);
    int i27 = classUnderTest0.add(1026, 1054);
    int i30 = classUnderTest0.add(1903, 2557);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 206);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1091);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 735);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2080);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4460);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(4898, 303);
    int i27 = classUnderTest0.add(2610, 5018);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 5201);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 7628);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add((int)(short)10, 331);
    int i27 = classUnderTest0.add(197, 2980);
    int i30 = classUnderTest0.add(3357, 3285);
    int i33 = classUnderTest0.add(3873, 6571);
    int i36 = classUnderTest0.add(1631, 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 341);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3177);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 6642);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 10444);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1997);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(35, (int)(byte)-1);
    int i24 = classUnderTest0.add(323, 3220);
    int i27 = classUnderTest0.add(574, 0);
    int i30 = classUnderTest0.add(198, 5518);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3543);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 574);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5716);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add((int)'#', (int)(byte)-1);
    int i21 = classUnderTest0.add(786, 206);
    int i24 = classUnderTest0.add(0, 147);
    int i27 = classUnderTest0.add(182, 5259);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 992);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 147);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5441);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(635, 303);
    int i18 = classUnderTest0.add(4019, 760);
    int i21 = classUnderTest0.add(486, 2104);
    int i24 = classUnderTest0.add(10, 301);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 938);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4779);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2590);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 311);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(433, 84);
    int i27 = classUnderTest0.add((int)(short)0, 207);
    int i30 = classUnderTest0.add(261, 1529);
    int i33 = classUnderTest0.add(236, 214);
    int i36 = classUnderTest0.add(1907, 5069);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 517);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1790);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 450);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 6976);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(651, 301);
    int i12 = classUnderTest0.add(4660, 398);
    int i15 = classUnderTest0.add(1891, 217);
    int i18 = classUnderTest0.add(1972, 1130);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 952);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 5058);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3102);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(512, 97);
    int i21 = classUnderTest0.add(318, 3310);
    int i24 = classUnderTest0.add(4041, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 609);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3628);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4041);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add((int)'#', (int)(byte)-1);
    int i21 = classUnderTest0.add(786, 206);
    int i24 = classUnderTest0.add(611, 703);
    int i27 = classUnderTest0.add(819, 8614);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 992);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1314);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 9433);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(368, 118);
    int i18 = classUnderTest0.add(52, 209);
    int i21 = classUnderTest0.add(331, 1897);
    int i24 = classUnderTest0.add(635, 3648);
    int i27 = classUnderTest0.add(17245, 2980);
    int i30 = classUnderTest0.add(6091, 1026);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 486);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 261);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2228);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4283);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 20225);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 7117);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(651, 301);
    int i12 = classUnderTest0.add(331, 117);
    int i15 = classUnderTest0.add(4283, 16968);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 952);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 448);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 21251);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)0, 52);
    int i15 = classUnderTest0.add(1963, 4789);
    int i18 = classUnderTest0.add(4366, 6948);
    int i21 = classUnderTest0.add(180, 2343);
    int i24 = classUnderTest0.add(898, 7641);
    int i27 = classUnderTest0.add(5430, 849);
    int i30 = classUnderTest0.add(1975, 242);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 6752);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11314);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2523);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 8539);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 6279);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2217);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(512, 97);
    int i21 = classUnderTest0.add(105, 298);
    int i24 = classUnderTest0.add(3009, 53);
    int i27 = classUnderTest0.add(269, 0);
    int i30 = classUnderTest0.add(4366, 7924);
    int i33 = classUnderTest0.add(706, 6920);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 609);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 403);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3062);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 12290);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 7626);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(52, 645);
    int i24 = classUnderTest0.add(968, 202);
    int i27 = classUnderTest0.add(0, 4904);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4904);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(772, 368);
    int i21 = classUnderTest0.add((int)(byte)-1, (int)(byte)10);
    int i24 = classUnderTest0.add(3150, 502);
    int i27 = classUnderTest0.add(914, 510);
    int i30 = classUnderTest0.add(11720, 1953);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1140);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3652);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1424);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 13673);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(736, 0);
    int i27 = classUnderTest0.add(138, 996);
    int i30 = classUnderTest0.add(6112, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1068);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 736);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1134);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 6112);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add(270, 10);
    int i21 = classUnderTest0.add(197, 10);
    int i24 = classUnderTest0.add((int)(short)0, 149);
    int i27 = classUnderTest0.add(681, 3569);
    int i30 = classUnderTest0.add(8619, 10810);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 149);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 19429);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(53, 512);
    int i24 = classUnderTest0.add(564, 2294);
    int i27 = classUnderTest0.add(7237, 5161);
    int i30 = classUnderTest0.add(3094, 12699);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 565);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2858);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 12398);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 15793);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(269, 233);
    int i21 = classUnderTest0.add(2873, 7808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 502);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10681);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(153, (int)(byte)1);
    int i18 = classUnderTest0.add(118, (int)(byte)-1);
    int i21 = classUnderTest0.add(635, 348);
    int i24 = classUnderTest0.add(2427, 4098);
    int i27 = classUnderTest0.add(736, 2057);
    int i30 = classUnderTest0.add(2590, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 983);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6525);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2793);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2590);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(10, 198);
    int i18 = classUnderTest0.add(512, 52);
    int i21 = classUnderTest0.add(2966, 4257);
    int i24 = classUnderTest0.add(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 208);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 564);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 7223);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(237, 1103);
    int i21 = classUnderTest0.add(633, 3766);
    int i24 = classUnderTest0.add(549, 3941);
    int i27 = classUnderTest0.add(3858, 1442);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1340);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4399);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4490);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5300);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(502, (int)'a');
    int i12 = classUnderTest0.add(3334, 17104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 599);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 20438);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add(154, 325);
    int i21 = classUnderTest0.add(808, 237);
    int i24 = classUnderTest0.add(2607, 5493);
    int i27 = classUnderTest0.add(3679, 1295);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 479);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1045);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 8100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4974);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(byte)1, 448);
    int i21 = classUnderTest0.add(309, 1687);
    int i24 = classUnderTest0.add(1953, 5319);
    int i27 = classUnderTest0.add(906, 4838);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 449);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1996);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 7272);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5744);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(197, 611);
    int i15 = classUnderTest0.add(835, 197);
    int i18 = classUnderTest0.add(5945, 2108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1032);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 8053);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(347, 1037);
    int i24 = classUnderTest0.add(2162, 1270);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3432);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(97, 1529);
    int i21 = classUnderTest0.add(311, 253);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1626);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 564);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(1887, 7077);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 8964);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(305, 635);
    int i15 = classUnderTest0.add(772, 36);
    int i18 = classUnderTest0.add(1827, 7223);
    int i21 = classUnderTest0.add(18213, 8663);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 940);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 9050);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 26876);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add((int)' ', 205);
    int i18 = classUnderTest0.add(0, 2741);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 237);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2741);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(3854, 4635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 8489);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(4257, 217);
    int i24 = classUnderTest0.add(8943, 3440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4474);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 12383);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add((int)'#', (int)(byte)-1);
    int i21 = classUnderTest0.add(786, 206);
    int i24 = classUnderTest0.add(611, 703);
    int i27 = classUnderTest0.add(643, 24171);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 992);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1314);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 24814);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(808, 801);
    int i27 = classUnderTest0.add(3060, 1541);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1068);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1609);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4601);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'#', 633);
    int i24 = classUnderTest0.add(728, 711);
    int i27 = classUnderTest0.add(205, 3357);
    int i30 = classUnderTest0.add(1481, 1942);
    int i33 = classUnderTest0.add(202, 770);
    int i36 = classUnderTest0.add(7653, 6592);
    int i39 = classUnderTest0.add(4957, 2080);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 668);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1439);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3562);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3423);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 972);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 14245);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 7037);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(1296, 479);
    int i9 = classUnderTest0.add(1260, 2728);
    int i12 = classUnderTest0.add(410, 323);
    int i15 = classUnderTest0.add(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1775);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3988);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 733);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(305, 552);
    int i15 = classUnderTest0.add(118, 84);
    int i18 = classUnderTest0.add(1110, 343);
    int i21 = classUnderTest0.add(512, 300);
    int i24 = classUnderTest0.add(2563, 234);
    int i27 = classUnderTest0.add(0, 1572);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 857);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 202);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1453);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 812);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2797);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1572);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(6081, 98);
    int i21 = classUnderTest0.add(3966, 8508);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 6179);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 12474);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(3399, 2717);
    int i18 = classUnderTest0.add(5545, 2267);
    int i21 = classUnderTest0.add(3263, 1990);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 6116);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 7812);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5253);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(433, 84);
    int i27 = classUnderTest0.add((int)(short)0, 207);
    int i30 = classUnderTest0.add(1110, 796);
    int i33 = classUnderTest0.add(1401, 1156);
    int i36 = classUnderTest0.add(1065, 1223);
    int i39 = classUnderTest0.add(1995, 6948);
    int i42 = classUnderTest0.add(12067, 4769);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 517);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1906);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2557);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 8943);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 16836);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(651, 301);
    int i12 = classUnderTest0.add(331, 117);
    int i15 = classUnderTest0.add(1127, 668);
    int i18 = classUnderTest0.add(7920, 3150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 952);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 448);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1795);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11070);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(2057, 1220);
    int i18 = classUnderTest0.add(105, 145);
    int i21 = classUnderTest0.add(0, 2572);
    int i24 = classUnderTest0.add(405, 298);
    int i27 = classUnderTest0.add(914, 14656);
    int i30 = classUnderTest0.add(3017, 13714);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3277);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2572);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 703);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 15570);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 16731);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(347, 1037);
    int i24 = classUnderTest0.add(267, 414);
    int i27 = classUnderTest0.add(6275, 1582);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 681);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 7857);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(179, 549);
    int i21 = classUnderTest0.add(1443, 448);
    int i24 = classUnderTest0.add(1563, 451);
    int i27 = classUnderTest0.add(2288, 1309);
    int i30 = classUnderTest0.add(1235, 3941);
    int i33 = classUnderTest0.add(16836, 2980);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1891);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2014);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3597);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 19816);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add((int)(byte)10, 502);
    int i21 = classUnderTest0.add(850, 2343);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3193);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(53, 42);
    int i24 = classUnderTest0.add(236, 772);
    int i27 = classUnderTest0.add(568, 433);
    int i30 = classUnderTest0.add(4019, 1052);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1008);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5071);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(502, (int)'a');
    int i12 = classUnderTest0.add(209, 1);
    int i15 = classUnderTest0.add(10875, 12022);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 599);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 210);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 22897);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add(10, 108);
    int i21 = classUnderTest0.add(720, 52);
    int i24 = classUnderTest0.add(720, 100);
    int i27 = classUnderTest0.add(1432, 1394);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 118);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 772);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 820);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2826);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(1291, 3525);
    int i18 = classUnderTest0.add(3280, 510);
    int i21 = classUnderTest0.add(1948, 2544);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 4816);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3790);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4492);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(1329, 1891);
    int i18 = classUnderTest0.add(237, 2557);
    int i21 = classUnderTest0.add(0, 2344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3220);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2794);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2344);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(20, 153);
    int i6 = classUnderTest0.add(4452, 8247);
    int i9 = classUnderTest0.add(14245, 1660);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 173);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12699);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 15905);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(2057, 1220);
    int i18 = classUnderTest0.add(105, 145);
    int i21 = classUnderTest0.add(0, 2572);
    int i24 = classUnderTest0.add(405, 298);
    int i27 = classUnderTest0.add(304, 217);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3277);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2572);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 703);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 521);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add((int)(byte)100, 98);
    int i18 = classUnderTest0.add(206, 97);
    int i21 = classUnderTest0.add(2381, 899);
    int i24 = classUnderTest0.add(12383, 3277);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 198);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 303);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 15660);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(325, 17104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 17429);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(770, 1170);
    int i18 = classUnderTest0.add(2120, 996);
    int i21 = classUnderTest0.add(1296, 2563);
    int i24 = classUnderTest0.add(17874, 3518);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1940);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3116);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3859);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 21392);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'#', 633);
    int i24 = classUnderTest0.add(728, 711);
    int i27 = classUnderTest0.add(1223, 611);
    int i30 = classUnderTest0.add(4426, 53);
    int i33 = classUnderTest0.add(4322, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 668);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1439);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1834);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4479);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 4322);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'#', 633);
    int i24 = classUnderTest0.add(728, 711);
    int i27 = classUnderTest0.add(1223, 611);
    int i30 = classUnderTest0.add(3808, 3145);
    int i33 = classUnderTest0.add(4015, 1593);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 668);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1439);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1834);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 6953);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 5608);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add(270, 10);
    int i21 = classUnderTest0.add((int)(byte)100, 53);
    int i24 = classUnderTest0.add(217, 366);
    int i27 = classUnderTest0.add(370, 1007);
    int i30 = classUnderTest0.add(9446, 3899);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 583);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1377);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 13345);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add((int)(short)10, 331);
    int i27 = classUnderTest0.add(197, 2980);
    int i30 = classUnderTest0.add(3357, 3285);
    int i33 = classUnderTest0.add(3873, 6571);
    int i36 = classUnderTest0.add(7237, 756);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 341);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3177);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 6642);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 10444);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 7993);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)'a', 100);
    int i12 = classUnderTest0.add(772, 107);
    int i15 = classUnderTest0.add(1401, 6028);
    int i18 = classUnderTest0.add(5000, 5000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 879);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 7429);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10000);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(4312, 4586);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 565);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 8898);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(502, (int)'a');
    int i12 = classUnderTest0.add(479, 433);
    int i15 = classUnderTest0.add(6336, 4384);
    int i18 = classUnderTest0.add(463, 1442);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 599);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10720);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1905);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(808, 801);
    int i27 = classUnderTest0.add(448, 720);
    int i30 = classUnderTest0.add(513, 1163);
    int i33 = classUnderTest0.add(3040, 476);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1068);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1609);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1168);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1676);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 3516);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(486, 370);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 856);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)-1, 197);
    int i18 = classUnderTest0.add((int)(byte)0, 549);
    int i21 = classUnderTest0.add(0, 819);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 196);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 549);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 819);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(808, 801);
    int i27 = classUnderTest0.add(2486, 1777);
    int i30 = classUnderTest0.add(1395, 0);
    int i33 = classUnderTest0.add(1220, 1007);
    int i36 = classUnderTest0.add(1360, 13040);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1068);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1609);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4263);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1395);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2227);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 14400);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(770, 1170);
    int i18 = classUnderTest0.add(2120, 996);
    int i21 = classUnderTest0.add(1296, 2563);
    int i24 = classUnderTest0.add(2980, 1178);
    int i27 = classUnderTest0.add(13101, 2728);
    int i30 = classUnderTest0.add(4755, 0);
    int i33 = classUnderTest0.add(1109, 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1940);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3116);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3859);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4158);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 15829);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4755);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1441);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(479, 1312);
    int i24 = classUnderTest0.add(486, 100);
    int i27 = classUnderTest0.add(1077, 486);
    int i30 = classUnderTest0.add(208, 835);
    int i33 = classUnderTest0.add(1334, 405);
    int i36 = classUnderTest0.add(15994, 3526);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1791);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 586);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1563);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1043);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1739);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 19520);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(565, 348);
    int i24 = classUnderTest0.add(5071, 4322);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 913);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 9393);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(479, 1312);
    int i24 = classUnderTest0.add(688, 370);
    int i27 = classUnderTest0.add(135, 195);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1791);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1058);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 330);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(10, 198);
    int i18 = classUnderTest0.add(512, 153);
    int i21 = classUnderTest0.add(135, 433);
    int i24 = classUnderTest0.add(1429, 645);
    int i27 = classUnderTest0.add(3896, 4704);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 208);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 665);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 568);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2074);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 8600);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(0, 84);
    int i21 = classUnderTest0.add(9324, 2025);
    int i24 = classUnderTest0.add(9530, 9505);
    int i27 = classUnderTest0.add(0, 4001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 11349);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 19035);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4001);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add((int)(short)10, 331);
    int i27 = classUnderTest0.add(197, 2980);
    int i30 = classUnderTest0.add(3357, 3285);
    int i33 = classUnderTest0.add(1392, 147);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 341);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3177);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 6642);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1539);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add(10, 108);
    int i21 = classUnderTest0.add(720, 52);
    int i24 = classUnderTest0.add(720, 100);
    int i27 = classUnderTest0.add(1401, 479);
    int i30 = classUnderTest0.add(248, (int)(byte)0);
    int i33 = classUnderTest0.add(1629, 0);
    int i36 = classUnderTest0.add(334, 4568);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 118);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 772);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 820);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1880);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 248);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1629);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 4902);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(368, 118);
    int i18 = classUnderTest0.add(52, 209);
    int i21 = classUnderTest0.add(331, 1897);
    int i24 = classUnderTest0.add(635, 3648);
    int i27 = classUnderTest0.add(17245, 2980);
    int i30 = classUnderTest0.add(4957, 6802);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 486);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 261);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2228);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4283);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 20225);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11759);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(209, (int)(byte)100);
    int i21 = classUnderTest0.add(214, 700);
    int i24 = classUnderTest0.add(532, 1154);
    int i27 = classUnderTest0.add(26876, 4099);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 309);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 914);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1686);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 30975);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(153, (int)(byte)1);
    int i18 = classUnderTest0.add(118, (int)(byte)-1);
    int i21 = classUnderTest0.add(197, 1109);
    int i24 = classUnderTest0.add(2722, 0);
    int i27 = classUnderTest0.add(7881, 3337);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1306);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2722);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 11218);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add(10, 108);
    int i21 = classUnderTest0.add(720, 52);
    int i24 = classUnderTest0.add(720, 100);
    int i27 = classUnderTest0.add(108, 206);
    int i30 = classUnderTest0.add(857, 517);
    int i33 = classUnderTest0.add(200, 332);
    int i36 = classUnderTest0.add(3150, 2343);
    int i39 = classUnderTest0.add(251, 3337);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 118);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 772);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 820);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 314);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1374);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 532);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 5493);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 3588);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(323, 2104);
    int i24 = classUnderTest0.add(145, 97);
    int i27 = classUnderTest0.add(3160, 0);
    int i30 = classUnderTest0.add(4352, 4303);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 206);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2427);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 242);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 8655);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(503, 217);
    int i24 = classUnderTest0.add(1250, 149);
    int i27 = classUnderTest0.add(2306, 6336);
    int i30 = classUnderTest0.add(4055, 5352);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 720);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1399);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 8642);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 9407);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(9581, 5278);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 14859);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(52, 645);
    int i24 = classUnderTest0.add(1453, 2702);
    int i27 = classUnderTest0.add(7451, 5223);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4155);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 12674);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add((int)(short)10, 97);
    int i21 = classUnderTest0.add(0, 1399);
    int i24 = classUnderTest0.add(6220, 2876);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1399);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 9096);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(479, 1312);
    int i24 = classUnderTest0.add(486, 100);
    int i27 = classUnderTest0.add((int)(short)10, 760);
    int i30 = classUnderTest0.add(0, 463);
    int i33 = classUnderTest0.add(3220, 3684);
    int i36 = classUnderTest0.add(1739, 1674);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1791);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 586);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 770);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 463);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 6904);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 3413);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(2057, 1220);
    int i18 = classUnderTest0.add(105, 145);
    int i21 = classUnderTest0.add(3357, 403);
    int i24 = classUnderTest0.add(19035, 5791);
    int i27 = classUnderTest0.add(906, 4288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3277);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3760);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 24826);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5194);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(2074, 645);
    int i18 = classUnderTest0.add(202, 5493);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2719);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 5695);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(3177, 502);
    int i9 = classUnderTest0.add(248, 1011);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3679);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1259);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(512, 97);
    int i21 = classUnderTest0.add(318, 3310);
    int i24 = classUnderTest0.add(3821, 4060);
    int i27 = classUnderTest0.add(4646, 1561);
    int i30 = classUnderTest0.add(202, 9719);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 609);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3628);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 7881);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 6207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 9921);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(772, 368);
    int i21 = classUnderTest0.add((int)(byte)-1, (int)(byte)10);
    int i24 = classUnderTest0.add(753, 400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1140);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1153);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'a', 0);
    int i24 = classUnderTest0.add(217, 486);
    int i27 = classUnderTest0.add(25807, 6074);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 703);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 31881);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(197, 611);
    int i15 = classUnderTest0.add(205, 898);
    int i18 = classUnderTest0.add((int)'#', 633);
    int i21 = classUnderTest0.add(645, 1453);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1103);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 668);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2098);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(10, 198);
    int i18 = classUnderTest0.add(512, 153);
    int i21 = classUnderTest0.add(135, 433);
    int i24 = classUnderTest0.add(8619, 5176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 208);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 665);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 568);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 13795);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(35, (int)(short)0);
    int i9 = classUnderTest0.add(0, 269);
    int i12 = classUnderTest0.add(3897, 1586);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 5483);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(996, (int)(short)0);
    int i15 = classUnderTest0.add(3093, 857);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 996);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3950);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(305, 635);
    int i15 = classUnderTest0.add(772, 36);
    int i18 = classUnderTest0.add(898, 448);
    int i21 = classUnderTest0.add(1479, 24246);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 940);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1346);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 25725);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(1897, 1993);
    int i24 = classUnderTest0.add(6156, 738);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3890);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6894);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(0, 8247);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 8247);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(233, 665);
    int i15 = classUnderTest0.add(241, 2487);
    int i18 = classUnderTest0.add(5406, 1593);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 6999);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)0, 52);
    int i15 = classUnderTest0.add(1963, 4789);
    int i18 = classUnderTest0.add(4366, 6948);
    int i21 = classUnderTest0.add(180, 2343);
    int i24 = classUnderTest0.add(7812, 106);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 6752);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11314);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2523);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 7918);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(short)1, 269);
    int i15 = classUnderTest0.add(100, 298);
    int i18 = classUnderTest0.add(332, 1246);
    int i21 = classUnderTest0.add(1401, 4312);
    int i24 = classUnderTest0.add(2120, 8951);
    int i27 = classUnderTest0.add(946, 625);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 270);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 398);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1578);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5713);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 11071);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1571);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(209, (int)(byte)100);
    int i21 = classUnderTest0.add(0, 781);
    int i24 = classUnderTest0.add(1891, 706);
    int i27 = classUnderTest0.add(2794, 6199);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 309);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 781);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2597);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 8993);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'a', 0);
    int i24 = classUnderTest0.add(151, 217);
    int i27 = classUnderTest0.add(117, 0);
    int i30 = classUnderTest0.add(1242, 7641);
    int i33 = classUnderTest0.add(1687, 347);
    int i36 = classUnderTest0.add(1382, 4152);
    int i39 = classUnderTest0.add(6074, 10262);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 8883);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2034);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 5534);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 16336);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add((int)(short)0, 118);
    int i15 = classUnderTest0.add(95, (int)(short)10);
    int i18 = classUnderTest0.add(118, 4206);
    int i21 = classUnderTest0.add(1065, 8539);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 118);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 105);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4324);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 9604);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)0, (int)'4');
    int i18 = classUnderTest0.add(52, 796);
    int i21 = classUnderTest0.add(611, 1791);
    int i24 = classUnderTest0.add(4152, 2802);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 848);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2402);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6954);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(94, (int)(short)1);
    int i18 = classUnderTest0.add(6366, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 565);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 6366);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(280, 940);
    int i18 = classUnderTest0.add(12013, 695);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1220);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 12708);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)'a', 100);
    int i12 = classUnderTest0.add(772, 107);
    int i15 = classUnderTest0.add(1401, 6028);
    int i18 = classUnderTest0.add(8884, 574);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 879);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 7429);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 9458);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(503, 217);
    int i24 = classUnderTest0.add(983, 914);
    int i27 = classUnderTest0.add(0, 1109);
    int i30 = classUnderTest0.add(2306, 1178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 720);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1897);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3484);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(10, 198);
    int i18 = classUnderTest0.add(512, 153);
    int i21 = classUnderTest0.add(135, 433);
    int i24 = classUnderTest0.add(517, 5726);
    int i27 = classUnderTest0.add(2104, 6379);
    int i30 = classUnderTest0.add(2741, 4496);
    int i33 = classUnderTest0.add(2632, 5176);
    int i36 = classUnderTest0.add(405, 7943);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 208);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 665);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 568);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 8483);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 7237);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 7808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 8348);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(32, (int)'4');
    int i24 = classUnderTest0.add(139, 898);
    int i27 = classUnderTest0.add(992, 258);
    int i30 = classUnderTest0.add(403, 107);
    int i33 = classUnderTest0.add(2074, 643);
    int i36 = classUnderTest0.add(2290, 4140);
    int i39 = classUnderTest0.add(2557, 466);
    int i42 = classUnderTest0.add(5924, 2990);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1037);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 510);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2717);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 6430);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 3023);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 8914);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(808, 801);
    int i27 = classUnderTest0.add(2486, 1777);
    int i30 = classUnderTest0.add(1561, 10810);
    int i33 = classUnderTest0.add(3899, 9676);
    int i36 = classUnderTest0.add(8898, 3116);
    int i39 = classUnderTest0.add(4671, 1554);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1068);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1609);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4263);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 12371);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 13575);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 12014);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 6225);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(565, 348);
    int i24 = classUnderTest0.add(992, 118);
    int i27 = classUnderTest0.add(2572, 3347);
    int i30 = classUnderTest0.add(1990, 1065);
    int i33 = classUnderTest0.add(4250, 961);
    int i36 = classUnderTest0.add(801, 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 913);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1110);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5919);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3055);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 5211);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1044);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add(270, 10);
    int i21 = classUnderTest0.add(197, 10);
    int i24 = classUnderTest0.add((int)(short)0, 149);
    int i27 = classUnderTest0.add((-1), 3764);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 149);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3763);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(198, 100);
    int i21 = classUnderTest0.add(996, 4257);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5253);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 97);
    int i15 = classUnderTest0.add(205, 10);
    int i18 = classUnderTest0.add(1, 791);
    int i21 = classUnderTest0.add(0, 1932);
    int i24 = classUnderTest0.add(1827, 6116);
    int i27 = classUnderTest0.add(10000, 6752);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 215);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 792);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1932);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 7943);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 16752);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add(10, 108);
    int i21 = classUnderTest0.add(720, 52);
    int i24 = classUnderTest0.add(0, 218);
    int i27 = classUnderTest0.add(4545, 532);
    int i30 = classUnderTest0.add(974, 5535);
    int i33 = classUnderTest0.add(1929, 303);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 118);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 772);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5077);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 6509);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2232);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(952, 139);
    int i24 = classUnderTest0.add(533, 202);
    int i27 = classUnderTest0.add(1476, 1554);
    int i30 = classUnderTest0.add(1429, 2718);
    int i33 = classUnderTest0.add(3440, 208);
    int i36 = classUnderTest0.add(19411, 1285);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 206);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1091);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 735);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3030);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4147);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 3648);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 20696);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(2308, 1314);
    int i24 = classUnderTest0.add(3279, 5159);
    int i27 = classUnderTest0.add(7953, 1007);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3622);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 8438);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 8960);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add((int)(short)0, 118);
    int i15 = classUnderTest0.add(95, (int)(short)10);
    int i18 = classUnderTest0.add(3983, 36);
    int i21 = classUnderTest0.add(9096, 8600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 118);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 105);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4019);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 17696);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add(154, 325);
    int i21 = classUnderTest0.add(2487, 206);
    int i24 = classUnderTest0.add(3828, 2228);
    int i27 = classUnderTest0.add(1065, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 479);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2693);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6056);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1065);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(533, 100);
    int i15 = classUnderTest0.add(11146, 36);
    int i18 = classUnderTest0.add(4496, 599);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 633);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 11182);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 5095);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(1329, 1891);
    int i18 = classUnderTest0.add(1431, 1609);
    int i21 = classUnderTest0.add(4943, 738);
    int i24 = classUnderTest0.add(4187, 61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3220);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3040);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5681);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4248);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(651, 301);
    int i12 = classUnderTest0.add(331, 117);
    int i15 = classUnderTest0.add(0, 1003);
    int i18 = classUnderTest0.add(4767, 4660);
    int i21 = classUnderTest0.add(33070, 279);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 952);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 448);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1003);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 9427);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 33349);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(793, 2187);
    int i18 = classUnderTest0.add(3009, 2093);
    int i21 = classUnderTest0.add(3561, 961);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2980);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 5102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4522);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(703, 609);
    int i18 = classUnderTest0.add(0, 12327);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 12327);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(233, 665);
    int i15 = classUnderTest0.add(241, 2487);
    int i18 = classUnderTest0.add(0, 1037);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1037);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add((int)(short)10, 97);
    int i21 = classUnderTest0.add(347, 4324);
    int i24 = classUnderTest0.add(907, 7958);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4671);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 8865);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(305, 612);
    int i21 = classUnderTest0.add(2632, 20225);
    int i24 = classUnderTest0.add(6492, 938);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 917);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 22857);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 7430);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(479, 1312);
    int i24 = classUnderTest0.add(486, 100);
    int i27 = classUnderTest0.add(1077, 486);
    int i30 = classUnderTest0.add(208, 835);
    int i33 = classUnderTest0.add(1394, 3622);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1791);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 586);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1563);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1043);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 5016);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(byte)1, 208);
    int i21 = classUnderTest0.add(215, 108);
    int i24 = classUnderTest0.add(787, 205);
    int i27 = classUnderTest0.add(2424, 208);
    int i30 = classUnderTest0.add(4660, 10681);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 209);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 323);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 992);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2632);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 15341);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add((int)(short)-1, 151);
    int i21 = classUnderTest0.add((int)(byte)100, (int)(byte)1);
    int i24 = classUnderTest0.add(4335, 8662);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 12997);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(898, 503);
    int i15 = classUnderTest0.add(720, 348);
    int i18 = classUnderTest0.add(305, 480);
    int i21 = classUnderTest0.add(34135, 4661);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1401);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1068);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 785);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 38796);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(703, 609);
    int i18 = classUnderTest0.add(9, (int)'a');
    int i21 = classUnderTest0.add(147, 1296);
    int i24 = classUnderTest0.add(94, 241);
    int i27 = classUnderTest0.add(0, 635);
    int i30 = classUnderTest0.add(6446, 2847);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 106);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1443);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 335);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 9293);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'#', 633);
    int i24 = classUnderTest0.add(728, 711);
    int i27 = classUnderTest0.add(205, 3357);
    int i30 = classUnderTest0.add(1481, 1942);
    int i33 = classUnderTest0.add(202, 770);
    int i36 = classUnderTest0.add(4997, 5253);
    int i39 = classUnderTest0.add(2483, 87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 668);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1439);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3562);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3423);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 972);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 10250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2570);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(635, 303);
    int i18 = classUnderTest0.add(4019, 760);
    int i21 = classUnderTest0.add(486, 2104);
    int i24 = classUnderTest0.add(3277, 4140);
    int i27 = classUnderTest0.add(420, 314);
    int i30 = classUnderTest0.add(138, 218);
    int i33 = classUnderTest0.add(2483, 9505);
    int i36 = classUnderTest0.add(2663, 6005);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 938);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4779);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2590);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 7417);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 734);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 356);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 11988);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 8668);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(118, 1052);
    int i21 = classUnderTest0.add((int)(byte)100, 314);
    int i24 = classUnderTest0.add(2632, 4418);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 414);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 7050);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(198, 100);
    int i21 = classUnderTest0.add(1037, 0);
    int i24 = classUnderTest0.add(1429, 3116);
    int i27 = classUnderTest0.add(269, 791);
    int i30 = classUnderTest0.add(5430, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1037);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4545);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1060);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5430);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 97);
    int i15 = classUnderTest0.add(205, 10);
    int i18 = classUnderTest0.add(1, 791);
    int i21 = classUnderTest0.add(1626, 533);
    int i24 = classUnderTest0.add(946, 961);
    int i27 = classUnderTest0.add(1052, 3256);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 215);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 792);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2159);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1907);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4308);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(703, 1260);
    int i18 = classUnderTest0.add(0, 411);
    int i21 = classUnderTest0.add(1045, 10720);
    int i24 = classUnderTest0.add(2711, 565);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1963);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 411);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 11765);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3276);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(635, 303);
    int i18 = classUnderTest0.add(4019, 760);
    int i21 = classUnderTest0.add(8835, 1629);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 938);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4779);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10464);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(34, 309);
    int i21 = classUnderTest0.add(736, 798);
    int i24 = classUnderTest0.add(2483, 6306);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 343);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1534);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 8789);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(151, 197);
    int i21 = classUnderTest0.add(703, 95);
    int i24 = classUnderTest0.add(892, 2005);
    int i27 = classUnderTest0.add((int)'#', 3446);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 348);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 798);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2897);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3481);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)0, (int)'4');
    int i18 = classUnderTest0.add((int)(short)-1, 197);
    int i21 = classUnderTest0.add(1880, (int)(short)1);
    int i24 = classUnderTest0.add(10241, 1511);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 196);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1881);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 11752);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(368, 118);
    int i18 = classUnderTest0.add(4155, 549);
    int i21 = classUnderTest0.add(4629, 8508);
    int i24 = classUnderTest0.add(8619, 1857);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 486);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4704);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 13137);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 10476);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add((int)'4', 643);
    int i18 = classUnderTest0.add(0, 1091);
    int i21 = classUnderTest0.add(135, 227);
    int i24 = classUnderTest0.add(470, 4817);
    int i27 = classUnderTest0.add(1747, 5211);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 695);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1091);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 362);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 5287);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 6958);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add(173, 470);
    int i21 = classUnderTest0.add(946, 6156);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 206);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 643);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 7102);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(32, (int)'4');
    int i24 = classUnderTest0.add(139, 898);
    int i27 = classUnderTest0.add(992, 258);
    int i30 = classUnderTest0.add(11772, 102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1037);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11874);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)0, 52);
    int i15 = classUnderTest0.add(1963, 4789);
    int i18 = classUnderTest0.add(4366, 6948);
    int i21 = classUnderTest0.add(19520, 9458);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 6752);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11314);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 28978);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(52, 645);
    int i24 = classUnderTest0.add(665, 1052);
    int i27 = classUnderTest0.add(982, 16941);
    int i30 = classUnderTest0.add(7223, 4140);
    int i33 = classUnderTest0.add(8056, 433);
    int i36 = classUnderTest0.add(13874, 1110);
    int i39 = classUnderTest0.add(3896, 2821);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1717);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 17923);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11363);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 8489);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 14984);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 6717);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)(byte)10, 197);
    int i24 = classUnderTest0.add(105, 34);
    int i27 = classUnderTest0.add(98, 150);
    int i30 = classUnderTest0.add((int)(byte)0, 3285);
    int i33 = classUnderTest0.add(2474, 14512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 139);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 248);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3285);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 16986);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(179, 549);
    int i21 = classUnderTest0.add(414, 1432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1846);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(479, 1312);
    int i24 = classUnderTest0.add(1153, 753);
    int i27 = classUnderTest0.add(940, 207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1791);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1906);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1147);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add((int)(byte)-1, (int)(short)1);
    int i21 = classUnderTest0.add(98, 0);
    int i24 = classUnderTest0.add(1906, 4206);
    int i27 = classUnderTest0.add(2308, 4018);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6112);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 6326);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add((int)(short)-1, 151);
    int i21 = classUnderTest0.add((int)(byte)100, (int)(byte)1);
    int i24 = classUnderTest0.add(207, 2459);
    int i27 = classUnderTest0.add(469, 1993);
    int i30 = classUnderTest0.add(5081, 238);
    int i33 = classUnderTest0.add(7628, 4041);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2666);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2462);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5319);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 11669);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add((int)'#', 502);
    int i24 = classUnderTest0.add(217, 348);
    int i27 = classUnderTest0.add(3790, 1795);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 537);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 565);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5585);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(323, 703);
    int i15 = classUnderTest0.add(1314, 10488);
    int i18 = classUnderTest0.add(1315, 3150);
    int i21 = classUnderTest0.add(0, 13101);
    int i24 = classUnderTest0.add(614, 2108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1026);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 11802);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4465);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 13101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2722);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(414, 3347);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3761);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(1329, 1891);
    int i18 = classUnderTest0.add(6324, 10810);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3220);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 17134);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(100, 433);
    int i24 = classUnderTest0.add(118, 207);
    int i27 = classUnderTest0.add(512, (int)(short)100);
    int i30 = classUnderTest0.add(907, 202);
    int i33 = classUnderTest0.add(1065, 668);
    int i36 = classUnderTest0.add(84, 9506);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 325);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 612);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1733);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 9590);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(448, 954);
    int i27 = classUnderTest0.add(517, 906);
    int i30 = classUnderTest0.add(135, 1432);
    int i33 = classUnderTest0.add(517, 625);
    int i36 = classUnderTest0.add(5726, 549);
    int i39 = classUnderTest0.add(3561, 4997);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1068);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1402);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1423);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1567);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1142);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 6275);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 8558);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(703, 1260);
    int i18 = classUnderTest0.add(0, 411);
    int i21 = classUnderTest0.add(118, 906);
    int i24 = classUnderTest0.add(34, 309);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1963);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 411);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1024);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 343);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(502, (int)'a');
    int i12 = classUnderTest0.add(479, 433);
    int i15 = classUnderTest0.add(6336, 4384);
    int i18 = classUnderTest0.add(2523, 2446);
    int i21 = classUnderTest0.add(17235, 1791);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 599);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10720);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4969);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 19026);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(448, 954);
    int i27 = classUnderTest0.add(2272, 1975);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1068);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1402);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4247);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(808, 801);
    int i27 = classUnderTest0.add(992, 3009);
    int i30 = classUnderTest0.add(753, 14804);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1068);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1609);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 15557);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add(270, 10);
    int i21 = classUnderTest0.add(197, 10);
    int i24 = classUnderTest0.add((int)(short)0, 149);
    int i27 = classUnderTest0.add(2120, 906);
    int i30 = classUnderTest0.add(3993, 3648);
    int i33 = classUnderTest0.add(548, 7405);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 149);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3026);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 7641);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 7953);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(35, (int)(byte)-1);
    int i24 = classUnderTest0.add(847, 2162);
    int i27 = classUnderTest0.add(1399, 173);
    int i30 = classUnderTest0.add(304, 565);
    int i33 = classUnderTest0.add(5352, 479);
    int i36 = classUnderTest0.add(1083, 1340);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3009);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1572);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 869);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 5831);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2423);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(7102, 6565);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 13667);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(150, 300);
    int i27 = classUnderTest0.add(938, 303);
    int i30 = classUnderTest0.add(632, 564);
    int i33 = classUnderTest0.add(1626, 3009);
    int i36 = classUnderTest0.add(4283, 1975);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 450);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1196);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 4635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 6258);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add((int)'4', 643);
    int i18 = classUnderTest0.add(420, 450);
    int i21 = classUnderTest0.add(0, 8489);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 695);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 870);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 8489);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add(3299, 940);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4239);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(35, (int)(byte)-1);
    int i24 = classUnderTest0.add(847, 2162);
    int i27 = classUnderTest0.add(1399, 173);
    int i30 = classUnderTest0.add(3556, 905);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3009);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1572);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4461);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(32, (int)'4');
    int i24 = classUnderTest0.add(139, 898);
    int i27 = classUnderTest0.add(992, 258);
    int i30 = classUnderTest0.add(250, 1077);
    int i33 = classUnderTest0.add(4008, 234);
    int i36 = classUnderTest0.add(0, 5919);
    int i39 = classUnderTest0.add(1235, 1534);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1037);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1327);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 4242);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 5919);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2769);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(612, (int)' ');
    int i9 = classUnderTest0.add(1142, 100);
    int i12 = classUnderTest0.add(551, 2718);
    int i15 = classUnderTest0.add(1431, 4660);
    int i18 = classUnderTest0.add(1429, 1493);
    int i21 = classUnderTest0.add(3185, 1309);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 644);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1242);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 6091);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2922);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4494);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(138, 332);
    int i24 = classUnderTest0.add(1940, 438);
    int i27 = classUnderTest0.add(2179, 2980);
    int i30 = classUnderTest0.add(2290, 118);
    int i33 = classUnderTest0.add(1529, 728);
    int i36 = classUnderTest0.add(913, 2693);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 470);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2378);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5159);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2257);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 3606);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)0, 52);
    int i15 = classUnderTest0.add(0, 105);
    int i18 = classUnderTest0.add(2104, 234);
    int i21 = classUnderTest0.add(197, 738);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 105);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2338);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 935);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(793, 135);
    int i18 = classUnderTest0.add(8355, 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 565);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 928);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 8589);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(770, 1170);
    int i18 = classUnderTest0.add(2120, 996);
    int i21 = classUnderTest0.add(2180, 154);
    int i24 = classUnderTest0.add(154, 97);
    int i27 = classUnderTest0.add(3220, 298);
    int i30 = classUnderTest0.add(3644, 3821);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1940);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3116);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2334);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 251);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3518);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 7465);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(151, 0);
    int i21 = classUnderTest0.add(697, 138);
    int i24 = classUnderTest0.add(5726, 4001);
    int i27 = classUnderTest0.add(52, 974);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 835);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 9727);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1026);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(52, 95);
    int i21 = classUnderTest0.add(17245, 12290);
    int i24 = classUnderTest0.add(9458, 1739);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 147);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 29535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 11197);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(772, 368);
    int i21 = classUnderTest0.add(433, 323);
    int i24 = classUnderTest0.add(760, 3808);
    int i27 = classUnderTest0.add(6156, 3464);
    int i30 = classUnderTest0.add(907, 940);
    int i33 = classUnderTest0.add(18767, 3897);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1140);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 756);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4568);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 9620);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1847);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 22664);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(34, 309);
    int i21 = classUnderTest0.add(1140, 1729);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 343);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2869);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(153, (int)(byte)1);
    int i18 = classUnderTest0.add(118, (int)(byte)-1);
    int i21 = classUnderTest0.add(635, 348);
    int i24 = classUnderTest0.add(2427, 4098);
    int i27 = classUnderTest0.add(3031, 2487);
    int i30 = classUnderTest0.add(267, 4024);
    int i33 = classUnderTest0.add(5548, 7157);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 983);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6525);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5518);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4291);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 12705);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(243, 368);
    int i24 = classUnderTest0.add(147, (int)' ');
    int i27 = classUnderTest0.add(2343, 7451);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 611);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 179);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 9794);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add(10, 108);
    int i21 = classUnderTest0.add(720, 52);
    int i24 = classUnderTest0.add(720, 100);
    int i27 = classUnderTest0.add(1401, 479);
    int i30 = classUnderTest0.add(1940, 1220);
    int i33 = classUnderTest0.add(845, 1529);
    int i36 = classUnderTest0.add(3160, 2990);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 118);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 772);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 820);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1880);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2374);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 6150);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add((int)'#', 502);
    int i24 = classUnderTest0.add(0, 1270);
    int i27 = classUnderTest0.add(820, 6464);
    int i30 = classUnderTest0.add(2302, 1700);
    int i33 = classUnderTest0.add(305, 348);
    int i36 = classUnderTest0.add(1506, 9505);
    int i39 = classUnderTest0.add(4635, 3100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 537);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1270);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 7284);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4002);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 653);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 11011);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 7735);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(798, 633);
    int i24 = classUnderTest0.add(19411, 1586);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1431);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 20997);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(0, 84);
    int i21 = classUnderTest0.add(9324, 2025);
    int i24 = classUnderTest0.add(9530, 9505);
    int i27 = classUnderTest0.add(6796, 2374);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 11349);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 19035);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 9170);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(10, 217);
    int i24 = classUnderTest0.add((int)(byte)1, 695);
    int i27 = classUnderTest0.add(32, 3652);
    int i30 = classUnderTest0.add(796, 53);
    int i33 = classUnderTest0.add(1925, 151);
    int i36 = classUnderTest0.add(4769, 588);
    int i39 = classUnderTest0.add(1298, 5287);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 227);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 696);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3684);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 849);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2076);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 5357);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 6585);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add((int)(short)10, 97);
    int i21 = classUnderTest0.add(469, 668);
    int i24 = classUnderTest0.add(502, 1059);
    int i27 = classUnderTest0.add(9726, 4755);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1137);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1561);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 14481);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(269, 233);
    int i21 = classUnderTest0.add(0, 5739);
    int i24 = classUnderTest0.add(29535, 2338);
    int i27 = classUnderTest0.add(1013, 9433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 502);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5739);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 31873);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 10446);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(808, 801);
    int i27 = classUnderTest0.add(331, 138);
    int i30 = classUnderTest0.add(12267, 202);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1068);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1609);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 469);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 12469);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(218, (int)(short)-1);
    int i9 = classUnderTest0.add(298, 7812);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 217);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 8110);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add((int)(byte)100, 98);
    int i18 = classUnderTest0.add(792, 1312);
    int i21 = classUnderTest0.add(2074, 906);
    int i24 = classUnderTest0.add(2711, 3481);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 198);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2980);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6192);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add((int)(short)-1, 151);
    int i21 = classUnderTest0.add((int)(byte)100, (int)(byte)1);
    int i24 = classUnderTest0.add(207, 2459);
    int i27 = classUnderTest0.add(469, 1993);
    int i30 = classUnderTest0.add(3963, 328);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2666);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2462);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4291);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(10, 198);
    int i18 = classUnderTest0.add(512, 153);
    int i21 = classUnderTest0.add(2922, 7710);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 208);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 665);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10632);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(233, 665);
    int i15 = classUnderTest0.add(241, 2487);
    int i18 = classUnderTest0.add(269, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 269);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(179, 549);
    int i21 = classUnderTest0.add(1443, 448);
    int i24 = classUnderTest0.add(1563, 451);
    int i27 = classUnderTest0.add(1295, 899);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1891);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2014);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2194);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(703, 609);
    int i18 = classUnderTest0.add(1220, 1037);
    int i21 = classUnderTest0.add(6368, 5211);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2257);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 11579);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(118, 1052);
    int i21 = classUnderTest0.add(0, 7157);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 7157);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(305, 612);
    int i21 = classUnderTest0.add(586, 5159);
    int i24 = classUnderTest0.add(1563, 2374);
    int i27 = classUnderTest0.add(7924, 695);
    int i30 = classUnderTest0.add(3094, 10561);
    int i33 = classUnderTest0.add(1360, 0);
    int i36 = classUnderTest0.add(4383, 10266);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 917);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5745);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3937);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 8619);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 13655);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1360);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 14649);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(100, 53);
    int i21 = classUnderTest0.add(611, 100);
    int i24 = classUnderTest0.add(173, 502);
    int i27 = classUnderTest0.add(706, 5287);
    int i30 = classUnderTest0.add(1153, 2057);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 711);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 675);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5993);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3210);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(703, 1260);
    int i18 = classUnderTest0.add(3421, 1660);
    int i21 = classUnderTest0.add(9324, 1314);
    int i24 = classUnderTest0.add(6867, 9699);
    int i27 = classUnderTest0.add(0, 3137);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1963);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 5081);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10638);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 16566);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3137);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'a', 0);
    int i24 = classUnderTest0.add(217, 486);
    int i27 = classUnderTest0.add(1763, 1110);
    int i30 = classUnderTest0.add(1137, 820);
    int i33 = classUnderTest0.add(1274, 218);
    int i36 = classUnderTest0.add(633, 1054);
    int i39 = classUnderTest0.add(198, 1572);
    int i42 = classUnderTest0.add(972, 7875);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 703);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2873);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1957);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1492);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1687);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1770);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 8847);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(368, 118);
    int i18 = classUnderTest0.add(52, 209);
    int i21 = classUnderTest0.add(180, 1096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 486);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 261);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1276);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(118, 118);
    int i18 = classUnderTest0.add(100, 1925);
    int i21 = classUnderTest0.add(8100, 16986);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 236);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2025);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 25086);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)0, (int)'4');
    int i18 = classUnderTest0.add(52, 796);
    int i21 = classUnderTest0.add(3993, 2343);
    int i24 = classUnderTest0.add(603, 480);
    int i27 = classUnderTest0.add(0, 6455);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 848);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 6336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1083);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 6455);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add((int)(byte)-1, (int)(short)1);
    int i21 = classUnderTest0.add(98, 0);
    int i24 = classUnderTest0.add(1906, 4206);
    int i27 = classUnderTest0.add(233, 5563);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6112);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5796);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(433, 84);
    int i27 = classUnderTest0.add((int)(short)0, 207);
    int i30 = classUnderTest0.add(261, 1529);
    int i33 = classUnderTest0.add(236, 214);
    int i36 = classUnderTest0.add(1791, 633);
    int i39 = classUnderTest0.add(2187, 2081);
    int i42 = classUnderTest0.add(1790, 10932);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 517);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1790);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 450);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2424);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 4268);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 12722);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(770, 1170);
    int i18 = classUnderTest0.add(2120, 996);
    int i21 = classUnderTest0.add(2180, 154);
    int i24 = classUnderTest0.add((int)(short)100, 1453);
    int i27 = classUnderTest0.add(0, 2423);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1940);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3116);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2334);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1553);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2423);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(512, 97);
    int i21 = classUnderTest0.add(105, 298);
    int i24 = classUnderTest0.add(3009, 53);
    int i27 = classUnderTest0.add(3753, 4494);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 609);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 403);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3062);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 8247);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)0, (int)'4');
    int i18 = classUnderTest0.add(52, 796);
    int i21 = classUnderTest0.add(3993, 2343);
    int i24 = classUnderTest0.add(603, 480);
    int i27 = classUnderTest0.add(3966, 8056);
    int i30 = classUnderTest0.add(4187, 3637);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 848);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 6336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1083);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 12022);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 7824);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add((int)'4', 643);
    int i18 = classUnderTest0.add(0, 1091);
    int i21 = classUnderTest0.add(469, 9631);
    int i24 = classUnderTest0.add(6324, 1241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 695);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1091);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 7565);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)0, 52);
    int i15 = classUnderTest0.add(1963, 4789);
    int i18 = classUnderTest0.add(4366, 6948);
    int i21 = classUnderTest0.add(180, 2343);
    int i24 = classUnderTest0.add(898, 7641);
    int i27 = classUnderTest0.add(0, 5642);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 6752);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11314);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2523);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 8539);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5642);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(772, 368);
    int i21 = classUnderTest0.add((int)(byte)-1, (int)(byte)10);
    int i24 = classUnderTest0.add((int)(short)10, 205);
    int i27 = classUnderTest0.add(1077, 173);
    int i30 = classUnderTest0.add(552, 1791);
    int i33 = classUnderTest0.add(1156, 208);
    int i36 = classUnderTest0.add(603, 609);
    int i39 = classUnderTest0.add(2273, 7478);
    int i42 = classUnderTest0.add(20225, 21006);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1140);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 215);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2343);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1364);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1212);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 9751);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 41231);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(772, 368);
    int i21 = classUnderTest0.add((int)(byte)-1, (int)(byte)10);
    int i24 = classUnderTest0.add(3150, 502);
    int i27 = classUnderTest0.add(914, 510);
    int i30 = classUnderTest0.add(0, 3093);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1140);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3652);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1424);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3093);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(703, 609);
    int i18 = classUnderTest0.add(9, (int)'a');
    int i21 = classUnderTest0.add(147, 1296);
    int i24 = classUnderTest0.add(300, 796);
    int i27 = classUnderTest0.add(243, 3431);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 106);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1443);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3674);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(34, 3116);
    int i15 = classUnderTest0.add(95, 9581);
    int i18 = classUnderTest0.add(3341, 150);
    int i21 = classUnderTest0.add(7875, 551);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 9676);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3491);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 8426);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(433, 84);
    int i27 = classUnderTest0.add((int)(short)0, 207);
    int i30 = classUnderTest0.add(1110, 796);
    int i33 = classUnderTest0.add(1401, 1156);
    int i36 = classUnderTest0.add(1065, 1223);
    int i39 = classUnderTest0.add(1995, 6948);
    int i42 = classUnderTest0.add(11071, 5518);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 517);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1906);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2557);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 8943);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 16589);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add(10, 108);
    int i21 = classUnderTest0.add(720, 52);
    int i24 = classUnderTest0.add(720, 100);
    int i27 = classUnderTest0.add(1881, 1794);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 118);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 772);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 820);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3675);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'a', 0);
    int i24 = classUnderTest0.add(151, 217);
    int i27 = classUnderTest0.add(778, 3030);
    int i30 = classUnderTest0.add(1897, 270);
    int i33 = classUnderTest0.add(1763, 2030);
    int i36 = classUnderTest0.add(2543, 41231);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2167);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 3793);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 43774);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(808, 801);
    int i27 = classUnderTest0.add(2486, 1777);
    int i30 = classUnderTest0.add(1395, 0);
    int i33 = classUnderTest0.add(1077, 31881);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1068);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1609);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4263);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1395);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 32958);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(10, 198);
    int i18 = classUnderTest0.add(26876, 666);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 208);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 27542);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(2702, 2476);
    int i27 = classUnderTest0.add(3357, 9446);
    int i30 = classUnderTest0.add(18464, 6430);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 5178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 12803);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 24894);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(32, (int)'4');
    int i24 = classUnderTest0.add(139, 898);
    int i27 = classUnderTest0.add(992, 258);
    int i30 = classUnderTest0.add(403, 107);
    int i33 = classUnderTest0.add(2074, 643);
    int i36 = classUnderTest0.add(1629, 1298);
    int i39 = classUnderTest0.add(1609, 820);
    int i42 = classUnderTest0.add(7886, 1335);
    int i45 = classUnderTest0.add(0, 251);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1037);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 510);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2717);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2927);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2429);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 9221);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 251);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(10, 198);
    int i18 = classUnderTest0.add(512, 153);
    int i21 = classUnderTest0.add(135, 433);
    int i24 = classUnderTest0.add(517, 5726);
    int i27 = classUnderTest0.add(3399, 5874);
    int i30 = classUnderTest0.add(633, 2402);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 208);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 665);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 568);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 9273);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3035);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)0, 52);
    int i15 = classUnderTest0.add(1963, 4789);
    int i18 = classUnderTest0.add(4366, 6948);
    int i21 = classUnderTest0.add(3150, 20225);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 6752);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11314);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 23375);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(2632, 3287);
    int i18 = classUnderTest0.add((int)(short)10, 1);
    int i21 = classUnderTest0.add(5462, 3784);
    int i24 = classUnderTest0.add(441, 6947);
    int i27 = classUnderTest0.add(1785, 4152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 565);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 5919);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 9246);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 7388);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5937);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(20, 153);
    int i6 = classUnderTest0.add(4452, 8247);
    int i9 = classUnderTest0.add(0, 11600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 173);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12699);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11600);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(153, (int)(byte)1);
    int i18 = classUnderTest0.add(118, (int)(byte)-1);
    int i21 = classUnderTest0.add((int)(byte)-1, 565);
    int i24 = classUnderTest0.add(612, 303);
    int i27 = classUnderTest0.add(0, 268);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 564);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 915);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 268);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(0, 84);
    int i21 = classUnderTest0.add(9324, 2025);
    int i24 = classUnderTest0.add(1309, 3821);
    int i27 = classUnderTest0.add(1401, 0);
    int i30 = classUnderTest0.add(0, 2015);
    int i33 = classUnderTest0.add(9631, 2219);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 11349);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 5130);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1401);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2015);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 11850);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(35, (int)(byte)-1);
    int i24 = classUnderTest0.add(1686, 688);
    int i27 = classUnderTest0.add(2057, 1298);
    int i30 = classUnderTest0.add(6074, 18213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2374);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3355);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 24287);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(35, 206);
    int i27 = classUnderTest0.add(547, 1940);
    int i30 = classUnderTest0.add(668, 808);
    int i33 = classUnderTest0.add(568, 1402);
    int i36 = classUnderTest0.add(2718, 0);
    int i39 = classUnderTest0.add(1554, 11979);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2487);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1476);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2718);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 13533);

  }

}
