
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
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(69, 63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 132);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)10, 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 108);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)-1, (int)(byte)10);
    int i9 = classUnderTest0.add((int)(byte)1, 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 33);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(53, 69);
    int i12 = classUnderTest0.add((int)' ', 132);
    int i15 = classUnderTest0.add((int)(byte)1, 32);
    int i18 = classUnderTest0.add((-1), (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 122);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 164);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 31);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add(10, (int)(short)0);
    int i21 = classUnderTest0.add(107, 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 149);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add((int)(byte)0, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(265, 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 307);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(53, 100);
    int i12 = classUnderTest0.add(102, 63);
    int i15 = classUnderTest0.add(184, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 165);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 185);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(164, 175);
    int i12 = classUnderTest0.add(153, 31);
    int i15 = classUnderTest0.add(33, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 339);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 133);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(53, 100);
    int i12 = classUnderTest0.add(167, 68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 235);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add(132, (int)(byte)100);
    int i15 = classUnderTest0.add(35, 119);
    int i18 = classUnderTest0.add(189, (int)(byte)100);
    int i21 = classUnderTest0.add(296, 156);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 289);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 452);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add((int)' ', (-1));
    int i12 = classUnderTest0.add(67, 218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 285);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add((int)(short)10, 0);
    int i12 = classUnderTest0.add(221, (int)(byte)1);
    int i15 = classUnderTest0.add((int)'a', 184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 222);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 281);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(165, 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 196);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add((int)' ', (-1));
    int i12 = classUnderTest0.add(10, 99);
    int i15 = classUnderTest0.add(404, 149);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 553);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(164, 175);
    int i12 = classUnderTest0.add(109, 876);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 339);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 985);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add(35, 394);
    int i18 = classUnderTest0.add(985, 440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 429);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1425);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(0, 101);
    int i15 = classUnderTest0.add(84, 67);
    int i18 = classUnderTest0.add(1425, 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1578);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add(9, 336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 345);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add((int)'#', 34);
    int i21 = classUnderTest0.add((int)'4', (int)(short)0);
    int i24 = classUnderTest0.add(184, 35);
    int i27 = classUnderTest0.add(339, 189);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 219);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 528);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add((int)'#', 34);
    int i21 = classUnderTest0.add((int)'4', (int)(short)0);
    int i24 = classUnderTest0.add((int)(short)100, 149);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 249);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add((int)' ', (-1));
    int i12 = classUnderTest0.add(10, 99);
    int i15 = classUnderTest0.add(68, 62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 130);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(162, 175);
    int i6 = classUnderTest0.add(124, 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 337);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 133);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add((int)'#', 34);
    int i21 = classUnderTest0.add((int)'#', 0);
    int i24 = classUnderTest0.add((int)(byte)1, 674);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 675);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(9, (int)(byte)100);
    int i9 = classUnderTest0.add(345, 438);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 783);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((int)'#', 119);
    int i18 = classUnderTest0.add(53, 72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 125);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add((int)' ', (int)(byte)-1);
    int i21 = classUnderTest0.add(100, (int)(byte)0);
    int i24 = classUnderTest0.add(151, 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 248);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add(216, 124);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 340);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add((-1), (int)(byte)0);
    int i9 = classUnderTest0.add(262, (int)(short)0);
    int i12 = classUnderTest0.add(307, 463);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 262);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 770);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add((int)' ', (int)(byte)-1);
    int i21 = classUnderTest0.add(100, (int)(byte)0);
    int i24 = classUnderTest0.add(72, 84);
    int i27 = classUnderTest0.add(69, 687);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 156);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 756);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(short)10, 0);
    int i6 = classUnderTest0.add((int)(short)0, 69);
    int i9 = classUnderTest0.add(521, 34);
    int i12 = classUnderTest0.add(834, 30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 555);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 864);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add(97, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)10, (int)' ');
    int i12 = classUnderTest0.add(154, 413);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 567);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(122, 53);
    int i12 = classUnderTest0.add(0, 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 175);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(261, 248);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 509);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(53, 100);
    int i12 = classUnderTest0.add(102, 63);
    int i15 = classUnderTest0.add(438, 265);
    int i18 = classUnderTest0.add(222, 218);
    int i21 = classUnderTest0.add(440, 756);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 165);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 703);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1196);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(short)10, 0);
    int i6 = classUnderTest0.add((int)(short)0, 69);
    int i9 = classUnderTest0.add(94, 68);
    int i12 = classUnderTest0.add((int)(short)100, 567);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 162);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 667);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(232, (-1));
    int i12 = classUnderTest0.add(0, 164);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 231);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 164);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(0, 0);
    int i9 = classUnderTest0.add(185, 336);
    int i12 = classUnderTest0.add(185, 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 521);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 283);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(131, 985);
    int i6 = classUnderTest0.add(749, 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1116);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 780);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(53, 69);
    int i12 = classUnderTest0.add((int)' ', 132);
    int i15 = classUnderTest0.add(0, 34);
    int i18 = classUnderTest0.add(531, 429);
    int i21 = classUnderTest0.add(1425, 1425);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 122);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 164);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 960);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2850);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add(35, 394);
    int i18 = classUnderTest0.add(675, 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 429);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 728);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(9, (int)(byte)100);
    int i9 = classUnderTest0.add(337, 404);
    int i12 = classUnderTest0.add(41, 674);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 741);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 715);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(468, 154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 622);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(0, 32);
    int i12 = classUnderTest0.add(261, 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 493);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(1, 1);
    int i12 = classUnderTest0.add(0, 161);
    int i15 = classUnderTest0.add(429, 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 537);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(9, (int)(byte)100);
    int i9 = classUnderTest0.add(1041, 1084);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2125);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add((int)(short)0, (int)'a');
    int i12 = classUnderTest0.add(10, 53);
    int i15 = classUnderTest0.add(9, 63);
    int i18 = classUnderTest0.add(149, 922);
    int i21 = classUnderTest0.add((int)'#', 216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1071);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 251);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)-1, (int)(byte)10);
    int i9 = classUnderTest0.add(12, 265);
    int i12 = classUnderTest0.add(0, 130);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 277);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 130);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(0, 101);
    int i15 = classUnderTest0.add(0, 132);
    int i18 = classUnderTest0.add(97, 122);
    int i21 = classUnderTest0.add(884, 216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 219);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1100);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(short)10, 0);
    int i6 = classUnderTest0.add(2, 175);
    int i9 = classUnderTest0.add((int)(byte)0, 339);
    int i12 = classUnderTest0.add(438, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 177);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 339);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 448);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', (int)'4');
    int i9 = classUnderTest0.add(98, 296);
    int i12 = classUnderTest0.add(161, 394);
    int i15 = classUnderTest0.add(542, 41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 394);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 555);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 583);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(short)10, 0);
    int i6 = classUnderTest0.add(42, 41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 83);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add((int)(short)1, 97);
    int i15 = classUnderTest0.add(394, (int)(short)10);
    int i18 = classUnderTest0.add(261, 703);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 404);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 964);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add(67, 94);
    int i15 = classUnderTest0.add(336, (int)' ');
    int i18 = classUnderTest0.add((int)(byte)100, 2850);
    int i21 = classUnderTest0.add(219, 756);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2950);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 975);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add(97, (int)(short)10);
    int i9 = classUnderTest0.add(31, (int)(short)-1);
    int i12 = classUnderTest0.add(189, 337);
    int i15 = classUnderTest0.add(482, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 526);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 534);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(394, 0);
    int i9 = classUnderTest0.add(1071, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 394);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1171);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add(130, 619);
    int i21 = classUnderTest0.add(2850, 452);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 749);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3302);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(162, 175);
    int i6 = classUnderTest0.add(84, 67);
    int i9 = classUnderTest0.add(101, 34);
    int i12 = classUnderTest0.add((int)(short)0, 1204);
    int i15 = classUnderTest0.add((-1), 341);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 337);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 135);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1204);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 340);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add((int)' ', (int)(byte)-1);
    int i21 = classUnderTest0.add((int)'#', 32);
    int i24 = classUnderTest0.add(94, 62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 156);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(42, (int)(byte)10);
    int i15 = classUnderTest0.add(336, 98);
    int i18 = classUnderTest0.add(99, 985);
    int i21 = classUnderTest0.add(52, 102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 434);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1084);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 154);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(162, 175);
    int i6 = classUnderTest0.add(528, 296);
    int i9 = classUnderTest0.add(221, 1084);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 337);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1305);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add((int)(short)1, 97);
    int i15 = classUnderTest0.add((int)'4', 101);
    int i18 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i21 = classUnderTest0.add(132, (int)(short)0);
    int i24 = classUnderTest0.add(175, 307);
    int i27 = classUnderTest0.add(1221, 109);
    int i30 = classUnderTest0.add((int)(byte)-1, 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 482);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1330);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 32);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(0, 32);
    int i12 = classUnderTest0.add(100, 2);
    int i15 = classUnderTest0.add(452, 124);
    int i18 = classUnderTest0.add(219, 703);
    int i21 = classUnderTest0.add((int)(byte)100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 922);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add((int)(short)10, 52);
    int i12 = classUnderTest0.add(1196, 161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1357);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add((int)' ', (-1));
    int i12 = classUnderTest0.add(10, 99);
    int i15 = classUnderTest0.add(549, 337);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 886);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(0, 0);
    int i9 = classUnderTest0.add(587, 634);
    int i12 = classUnderTest0.add(221, 175);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1221);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 396);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(122, 53);
    int i12 = classUnderTest0.add(0, 63);
    int i15 = classUnderTest0.add(780, 67);
    int i18 = classUnderTest0.add(1300, 1580);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 175);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 847);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2880);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add((int)(short)0, (int)'a');
    int i12 = classUnderTest0.add(10, 53);
    int i15 = classUnderTest0.add(52, 62);
    int i18 = classUnderTest0.add((int)(short)1, 468);
    int i21 = classUnderTest0.add(687, 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 114);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 469);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 947);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(53, 69);
    int i12 = classUnderTest0.add(69, 394);
    int i15 = classUnderTest0.add(53, 0);
    int i18 = classUnderTest0.add(312, 219);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 122);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 463);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 531);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add((int)' ', (int)(byte)-1);
    int i21 = classUnderTest0.add(1171, 165);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1336);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add(35, 394);
    int i18 = classUnderTest0.add(622, 33);
    int i21 = classUnderTest0.add(1578, 151);
    int i24 = classUnderTest0.add(119, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 429);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 655);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1729);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 119);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(0, 32);
    int i12 = classUnderTest0.add(100, 2);
    int i15 = classUnderTest0.add(452, 124);
    int i18 = classUnderTest0.add(534, 567);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1101);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(42, (int)(byte)10);
    int i15 = classUnderTest0.add(336, 98);
    int i18 = classUnderTest0.add(99, 985);
    int i21 = classUnderTest0.add((-1), 219);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 434);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1084);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 218);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add(35, 394);
    int i18 = classUnderTest0.add((int)'#', 655);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 429);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 690);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(67, 52);
    int i12 = classUnderTest0.add(152, 542);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 119);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 694);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(151, 185);
    int i15 = classUnderTest0.add(122, 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 124);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(53, 100);
    int i12 = classUnderTest0.add(102, 63);
    int i15 = classUnderTest0.add(438, 265);
    int i18 = classUnderTest0.add(222, 218);
    int i21 = classUnderTest0.add(567, 12);
    int i24 = classUnderTest0.add(53, 0);
    int i27 = classUnderTest0.add(501, 1305);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 165);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 703);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 579);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1806);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add((int)' ', (int)(byte)-1);
    int i21 = classUnderTest0.add(100, (int)(byte)0);
    int i24 = classUnderTest0.add(72, 84);
    int i27 = classUnderTest0.add(339, 185);
    int i30 = classUnderTest0.add(824, 549);
    int i33 = classUnderTest0.add(1204, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 156);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 524);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1373);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1204);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(53, 100);
    int i12 = classUnderTest0.add(102, 63);
    int i15 = classUnderTest0.add(438, 265);
    int i18 = classUnderTest0.add(222, 218);
    int i21 = classUnderTest0.add(567, 12);
    int i24 = classUnderTest0.add(149, (int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 165);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 703);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 579);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 148);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add((-1), (int)(byte)0);
    int i9 = classUnderTest0.add(69, (-1));
    int i12 = classUnderTest0.add(482, 133);
    int i15 = classUnderTest0.add(2125, 493);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 615);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2618);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add((int)(short)1, 97);
    int i15 = classUnderTest0.add((int)'4', 101);
    int i18 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i21 = classUnderTest0.add(281, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 381);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add((int)(short)0, (int)'a');
    int i12 = classUnderTest0.add(10, 53);
    int i15 = classUnderTest0.add(52, 62);
    int i18 = classUnderTest0.add((int)(short)1, 468);
    int i21 = classUnderTest0.add(122, 678);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 114);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 469);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 800);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(1, 1);
    int i12 = classUnderTest0.add(0, 161);
    int i15 = classUnderTest0.add(553, 281);
    int i18 = classUnderTest0.add(41, 114);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 834);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 155);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add((int)' ', (-1));
    int i12 = classUnderTest0.add((int)(byte)100, 52);
    int i15 = classUnderTest0.add(218, 720);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 938);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(122, 53);
    int i12 = classUnderTest0.add(67, 0);
    int i15 = classUnderTest0.add((int)(short)0, 67);
    int i18 = classUnderTest0.add((int)(short)0, 587);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 175);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 587);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add((int)' ', (int)(byte)-1);
    int i21 = classUnderTest0.add(100, (int)(byte)0);
    int i24 = classUnderTest0.add(72, 84);
    int i27 = classUnderTest0.add(339, 185);
    int i30 = classUnderTest0.add(824, 549);
    int i33 = classUnderTest0.add(10, 960);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 156);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 524);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1373);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 970);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(53, 69);
    int i12 = classUnderTest0.add(69, 394);
    int i15 = classUnderTest0.add(53, 0);
    int i18 = classUnderTest0.add(133, 30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 122);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 463);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 163);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add(296, 285);
    int i9 = classUnderTest0.add(1580, 109);
    int i12 = classUnderTest0.add(619, 265);
    int i15 = classUnderTest0.add(1758, 800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 581);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1689);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 884);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2558);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(122, 53);
    int i12 = classUnderTest0.add(0, 3302);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 175);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3302);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add(132, (int)(byte)100);
    int i15 = classUnderTest0.add(35, 119);
    int i18 = classUnderTest0.add(189, (int)(byte)100);
    int i21 = classUnderTest0.add(154, 1101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 289);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1255);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(0, 32);
    int i12 = classUnderTest0.add((int)(byte)100, 31);
    int i15 = classUnderTest0.add(749, 487);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 131);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1236);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(164, 175);
    int i12 = classUnderTest0.add(153, 31);
    int i15 = classUnderTest0.add(1101, 249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 339);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1350);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add((int)(short)0, (int)'a');
    int i12 = classUnderTest0.add(10, 53);
    int i15 = classUnderTest0.add(69, 1689);
    int i18 = classUnderTest0.add(32, 511);
    int i21 = classUnderTest0.add(1100, 847);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1758);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 543);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1947);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add(97, (int)(short)10);
    int i9 = classUnderTest0.add(0, 463);
    int i12 = classUnderTest0.add(0, 749);
    int i15 = classUnderTest0.add(735, (int)(byte)1);
    int i18 = classUnderTest0.add((int)'a', 1116);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 463);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 749);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 736);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1213);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(151, 185);
    int i15 = classUnderTest0.add(501, 161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 662);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add((int)' ', (int)(byte)-1);
    int i21 = classUnderTest0.add(100, (int)(byte)0);
    int i24 = classUnderTest0.add(72, 84);
    int i27 = classUnderTest0.add(339, 185);
    int i30 = classUnderTest0.add(824, 549);
    int i33 = classUnderTest0.add(99, 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 156);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 524);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1373);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 151);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(122, 99);
    int i9 = classUnderTest0.add(401, 401);
    int i12 = classUnderTest0.add(1100, 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 221);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 802);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1135);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(33, 509);
    int i12 = classUnderTest0.add(339, 68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 542);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 407);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(232, (-1));
    int i12 = classUnderTest0.add(401, 277);
    int i15 = classUnderTest0.add(102, 655);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 231);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 678);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 757);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(0, 32);
    int i12 = classUnderTest0.add(100, 2);
    int i15 = classUnderTest0.add(101, 0);
    int i18 = classUnderTest0.add(0, 108);
    int i21 = classUnderTest0.add(196, 802);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 998);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', (int)'4');
    int i9 = classUnderTest0.add(122, 2);
    int i12 = classUnderTest0.add(196, 438);
    int i15 = classUnderTest0.add(884, 33);
    int i18 = classUnderTest0.add(847, 800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 124);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 634);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 917);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1647);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add(67, 94);
    int i15 = classUnderTest0.add(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(0, 32);
    int i12 = classUnderTest0.add(161, (int)(short)100);
    int i15 = classUnderTest0.add(222, 1241);
    int i18 = classUnderTest0.add(2618, 1255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 261);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1463);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3873);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(short)10, 0);
    int i6 = classUnderTest0.add(98, (int)(byte)1);
    int i9 = classUnderTest0.add(468, 119);
    int i12 = classUnderTest0.add(32, (int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 587);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 31);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(655, 567);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1222);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add((int)(short)0, (int)'a');
    int i12 = classUnderTest0.add(10, 53);
    int i15 = classUnderTest0.add(69, 1689);
    int i18 = classUnderTest0.add(583, 511);
    int i21 = classUnderTest0.add(756, 401);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1758);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1094);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1157);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add(0, 151);
    int i18 = classUnderTest0.add(34, 149);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 183);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add((int)(short)1, 97);
    int i15 = classUnderTest0.add((int)'4', 101);
    int i18 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i21 = classUnderTest0.add(132, (int)(short)0);
    int i24 = classUnderTest0.add(175, 307);
    int i27 = classUnderTest0.add(1221, 109);
    int i30 = classUnderTest0.add(0, 759);
    int i33 = classUnderTest0.add(834, 413);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 482);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1330);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 759);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1247);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add((int)(short)1, 97);
    int i15 = classUnderTest0.add((int)'4', 101);
    int i18 = classUnderTest0.add(84, 100);
    int i21 = classUnderTest0.add(189, 0);
    int i24 = classUnderTest0.add((int)'#', 161);
    int i27 = classUnderTest0.add(63, 876);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 189);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 196);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 939);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(162, 175);
    int i6 = classUnderTest0.add(3409, 463);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 337);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3872);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(short)10, 0);
    int i6 = classUnderTest0.add(84, (int)(byte)10);
    int i9 = classUnderTest0.add(67, (int)(byte)100);
    int i12 = classUnderTest0.add(184, 32);
    int i15 = classUnderTest0.add(97, (int)'#');
    int i18 = classUnderTest0.add(678, 72);
    int i21 = classUnderTest0.add(222, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 167);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 750);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 222);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(1, 1);
    int i12 = classUnderTest0.add(165, (int)(byte)100);
    int i15 = classUnderTest0.add(307, 94);
    int i18 = classUnderTest0.add(524, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 401);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 534);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(151, 185);
    int i15 = classUnderTest0.add((int)(short)-1, 131);
    int i18 = classUnderTest0.add(487, 221);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 130);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 708);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add((int)(short)1, 97);
    int i15 = classUnderTest0.add((int)'4', 101);
    int i18 = classUnderTest0.add(84, 100);
    int i21 = classUnderTest0.add(99, 756);
    int i24 = classUnderTest0.add(1084, 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 855);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1349);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(short)10, 0);
    int i6 = classUnderTest0.add(164, 132);
    int i9 = classUnderTest0.add(1947, 1463);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 296);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3410);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(151, 185);
    int i15 = classUnderTest0.add(33, 615);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 648);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(0, 0);
    int i9 = classUnderTest0.add(587, 634);
    int i12 = classUnderTest0.add(1373, 824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1221);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2197);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', (int)'4');
    int i9 = classUnderTest0.add(122, 2);
    int i12 = classUnderTest0.add(196, 438);
    int i15 = classUnderTest0.add(884, 33);
    int i18 = classUnderTest0.add(368, 511);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 124);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 634);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 917);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 879);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(164, 175);
    int i12 = classUnderTest0.add(153, 31);
    int i15 = classUnderTest0.add(783, 2850);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 339);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3633);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(short)10, 0);
    int i6 = classUnderTest0.add((int)(short)0, 69);
    int i9 = classUnderTest0.add(94, 68);
    int i12 = classUnderTest0.add(35, (int)(short)0);
    int i15 = classUnderTest0.add(381, 12);
    int i18 = classUnderTest0.add(3015, 381);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 162);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 393);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3396);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(53, 69);
    int i12 = classUnderTest0.add(69, 394);
    int i15 = classUnderTest0.add(1022, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 122);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 463);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1057);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(42, (int)(byte)10);
    int i15 = classUnderTest0.add(336, 98);
    int i18 = classUnderTest0.add(9, 283);
    int i21 = classUnderTest0.add((int)'4', 662);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 434);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 292);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 714);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add(67, 94);
    int i15 = classUnderTest0.add(336, (int)' ');
    int i18 = classUnderTest0.add(1722, 1463);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3185);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(162, 175);
    int i6 = classUnderTest0.add(84, 67);
    int i9 = classUnderTest0.add(101, 34);
    int i12 = classUnderTest0.add(528, 413);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 337);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 135);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 941);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add((int)'#', 34);
    int i21 = classUnderTest0.add((int)'4', (int)(short)0);
    int i24 = classUnderTest0.add(175, 509);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 684);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(53, 69);
    int i12 = classUnderTest0.add((int)' ', 132);
    int i15 = classUnderTest0.add(161, 876);
    int i18 = classUnderTest0.add(30, 114);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 122);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 164);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1037);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 144);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add((int)' ', (int)(byte)-1);
    int i21 = classUnderTest0.add(401, 12);
    int i24 = classUnderTest0.add(985, 219);
    int i27 = classUnderTest0.add(917, 154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 413);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1204);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1071);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(0, 101);
    int i15 = classUnderTest0.add(0, 132);
    int i18 = classUnderTest0.add(31, 0);
    int i21 = classUnderTest0.add(811, 440);
    int i24 = classUnderTest0.add(281, 667);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1251);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 948);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(9, (int)(byte)100);
    int i9 = classUnderTest0.add(63, 521);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 584);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(122, 53);
    int i12 = classUnderTest0.add(67, 0);
    int i15 = classUnderTest0.add((int)(short)0, 67);
    int i18 = classUnderTest0.add(2125, 619);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 175);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2744);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add((int)(short)1, 97);
    int i15 = classUnderTest0.add((int)'4', 101);
    int i18 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i21 = classUnderTest0.add(132, (int)(short)0);
    int i24 = classUnderTest0.add(175, 307);
    int i27 = classUnderTest0.add(1, 864);
    int i30 = classUnderTest0.add(122, 2558);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 482);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 865);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2680);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(151, 185);
    int i15 = classUnderTest0.add(289, 1578);
    int i18 = classUnderTest0.add(678, 924);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1867);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1602);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add((int)(short)1, 97);
    int i15 = classUnderTest0.add((int)'4', 101);
    int i18 = classUnderTest0.add(9, 32);
    int i21 = classUnderTest0.add(1647, 3396);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5043);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(232, (-1));
    int i12 = classUnderTest0.add(132, 864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 231);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 996);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(53, 69);
    int i12 = classUnderTest0.add(69, 394);
    int i15 = classUnderTest0.add(53, 0);
    int i18 = classUnderTest0.add(251, 296);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 122);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 463);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 547);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add(35, 394);
    int i18 = classUnderTest0.add(622, 33);
    int i21 = classUnderTest0.add(35, 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 429);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 655);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 186);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(53, 69);
    int i12 = classUnderTest0.add((int)' ', 132);
    int i15 = classUnderTest0.add(0, 34);
    int i18 = classUnderTest0.add(531, 429);
    int i21 = classUnderTest0.add(124, 687);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 122);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 164);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 960);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 811);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(byte)100);
    int i15 = classUnderTest0.add(800, 1578);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2378);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add((int)(short)1, 97);
    int i15 = classUnderTest0.add((int)'4', 101);
    int i18 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i21 = classUnderTest0.add(132, (int)(short)0);
    int i24 = classUnderTest0.add(175, 307);
    int i27 = classUnderTest0.add(1221, 109);
    int i30 = classUnderTest0.add(2850, 1300);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 482);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1330);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4150);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add((int)(short)10, 52);
    int i12 = classUnderTest0.add(155, 735);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 890);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add((int)' ', (-1));
    int i12 = classUnderTest0.add(10, 99);
    int i15 = classUnderTest0.add(3873, 823);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 4696);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add((int)' ', (int)(byte)-1);
    int i21 = classUnderTest0.add(100, (int)(byte)0);
    int i24 = classUnderTest0.add((int)(short)0, 534);
    int i27 = classUnderTest0.add(1100, 2378);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 534);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3478);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(short)10, 0);
    int i6 = classUnderTest0.add(84, (int)(byte)10);
    int i9 = classUnderTest0.add(67, (int)(byte)100);
    int i12 = classUnderTest0.add(307, 175);
    int i15 = classUnderTest0.add(1037, 674);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 167);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 482);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1711);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(164, 175);
    int i12 = classUnderTest0.add(542, 448);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 339);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 990);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add((int)' ', (int)(byte)-1);
    int i21 = classUnderTest0.add(100, (int)(byte)0);
    int i24 = classUnderTest0.add(72, 84);
    int i27 = classUnderTest0.add(339, 185);
    int i30 = classUnderTest0.add(824, 549);
    int i33 = classUnderTest0.add(144, 72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 156);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 524);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1373);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 216);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(short)10, 0);
    int i6 = classUnderTest0.add((int)(short)0, 69);
    int i9 = classUnderTest0.add(521, 34);
    int i12 = classUnderTest0.add(1042, 1722);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 555);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2764);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add((-1), (int)(byte)0);
    int i9 = classUnderTest0.add(69, (-1));
    int i12 = classUnderTest0.add(1347, 715);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2062);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', (int)'4');
    int i9 = classUnderTest0.add(122, 2);
    int i12 = classUnderTest0.add(196, 438);
    int i15 = classUnderTest0.add(307, 1241);
    int i18 = classUnderTest0.add(543, 222);
    int i21 = classUnderTest0.add(879, 468);
    int i24 = classUnderTest0.add(185, 381);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 124);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 634);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1548);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 765);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1347);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 566);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(42, (int)(byte)10);
    int i15 = classUnderTest0.add(336, 98);
    int i18 = classUnderTest0.add(9, 283);
    int i21 = classUnderTest0.add(175, 667);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 434);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 292);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 842);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 0);
    int i9 = classUnderTest0.add(531, 265);
    int i12 = classUnderTest0.add(184, 262);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 796);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 446);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', (int)'4');
    int i9 = classUnderTest0.add(122, 2);
    int i12 = classUnderTest0.add(196, 438);
    int i15 = classUnderTest0.add(307, 1241);
    int i18 = classUnderTest0.add(543, 222);
    int i21 = classUnderTest0.add(879, 468);
    int i24 = classUnderTest0.add(501, 2680);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 124);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 634);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1548);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 765);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1347);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3181);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(1, 1);
    int i12 = classUnderTest0.add(101, 337);
    int i15 = classUnderTest0.add(452, 97);
    int i18 = classUnderTest0.add(292, 292);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 438);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 549);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 584);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add(132, (int)(byte)100);
    int i15 = classUnderTest0.add(0, 222);
    int i18 = classUnderTest0.add(985, 1548);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 222);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2533);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(53, 69);
    int i12 = classUnderTest0.add((int)' ', 132);
    int i15 = classUnderTest0.add((int)(byte)1, 32);
    int i18 = classUnderTest0.add(165, 53);
    int i21 = classUnderTest0.add(2454, 662);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 122);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 164);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3116);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(0, 32);
    int i12 = classUnderTest0.add(161, (int)(short)100);
    int i15 = classUnderTest0.add(741, 281);
    int i18 = classUnderTest0.add(434, 1711);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 261);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1022);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2145);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add((int)(short)1, 97);
    int i15 = classUnderTest0.add((int)'4', 101);
    int i18 = classUnderTest0.add(84, 100);
    int i21 = classUnderTest0.add(189, 0);
    int i24 = classUnderTest0.add(715, 339);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 189);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1054);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add((int)' ', (-1));
    int i12 = classUnderTest0.add(2764, 543);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3307);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add((-1), (int)(byte)0);
    int i9 = classUnderTest0.add(1357, 1041);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2398);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(0, 101);
    int i15 = classUnderTest0.add(84, 67);
    int i18 = classUnderTest0.add(119, 922);
    int i21 = classUnderTest0.add(100, 4696);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1041);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4796);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add((int)(short)1, 97);
    int i15 = classUnderTest0.add((int)'4', 101);
    int i18 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i21 = classUnderTest0.add(132, (int)(short)0);
    int i24 = classUnderTest0.add(175, 307);
    int i27 = classUnderTest0.add(1221, 109);
    int i30 = classUnderTest0.add(0, 759);
    int i33 = classUnderTest0.add(1101, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 482);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1330);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 759);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1111);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add((int)' ', (int)(byte)-1);
    int i21 = classUnderTest0.add(2850, 165);
    int i24 = classUnderTest0.add(1689, 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3015);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1783);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add((int)'#', 34);
    int i21 = classUnderTest0.add((int)'#', 0);
    int i24 = classUnderTest0.add(0, 68);
    int i27 = classUnderTest0.add(0, 720);
    int i30 = classUnderTest0.add(341, 667);
    int i33 = classUnderTest0.add(281, 543);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 720);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1008);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 824);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add(97, (int)(short)10);
    int i9 = classUnderTest0.add(31, (int)(short)-1);
    int i12 = classUnderTest0.add(189, 337);
    int i15 = classUnderTest0.add(542, 1236);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 526);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1778);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add((int)(short)1, 97);
    int i15 = classUnderTest0.add((int)'4', 101);
    int i18 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i21 = classUnderTest0.add(132, (int)(short)0);
    int i24 = classUnderTest0.add(175, 307);
    int i27 = classUnderTest0.add(1, 864);
    int i30 = classUnderTest0.add(1241, 1157);
    int i33 = classUnderTest0.add(985, 547);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 482);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 865);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2398);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1532);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(0, 101);
    int i15 = classUnderTest0.add(0, 132);
    int i18 = classUnderTest0.add(97, 122);
    int i21 = classUnderTest0.add(97, 404);
    int i24 = classUnderTest0.add(674, 281);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 219);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 501);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 955);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add((int)(short)1, 97);
    int i15 = classUnderTest0.add((int)'4', 101);
    int i18 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i21 = classUnderTest0.add(132, (int)(short)0);
    int i24 = classUnderTest0.add(175, 307);
    int i27 = classUnderTest0.add(553, 167);
    int i30 = classUnderTest0.add(667, 68);
    int i33 = classUnderTest0.add(285, 1081);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 482);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 720);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 735);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1366);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(0, 32);
    int i12 = classUnderTest0.add(100, 2);
    int i15 = classUnderTest0.add((-1), 130);
    int i18 = classUnderTest0.add(452, 694);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 129);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1146);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(short)10, 0);
    int i6 = classUnderTest0.add(1108, 114);
    int i9 = classUnderTest0.add(1729, 345);
    int i12 = classUnderTest0.add(35, 667);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1222);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2074);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 702);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(151, 185);
    int i15 = classUnderTest0.add(0, 922);
    int i18 = classUnderTest0.add(834, 161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 922);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 995);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add(67, 94);
    int i15 = classUnderTest0.add(122, 67);
    int i18 = classUnderTest0.add((int)(short)10, 2);
    int i21 = classUnderTest0.add(703, 108);
    int i24 = classUnderTest0.add(0, 216);
    int i27 = classUnderTest0.add(662, 970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 189);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 811);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1632);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(162, 175);
    int i6 = classUnderTest0.add(84, 67);
    int i9 = classUnderTest0.add(101, 34);
    int i12 = classUnderTest0.add(31, 1350);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 337);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 135);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1381);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add((int)' ', (int)(byte)-1);
    int i21 = classUnderTest0.add(100, (int)(byte)0);
    int i24 = classUnderTest0.add(72, 84);
    int i27 = classUnderTest0.add(1196, 886);
    int i30 = classUnderTest0.add(196, 765);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 156);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2082);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 961);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add((-1), (int)(byte)0);
    int i9 = classUnderTest0.add(69, (-1));
    int i12 = classUnderTest0.add(296, 289);
    int i15 = classUnderTest0.add(584, 2680);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 585);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3264);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(1, 1);
    int i12 = classUnderTest0.add(340, (int)(byte)1);
    int i15 = classUnderTest0.add(2680, 581);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 341);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3261);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add((int)' ', (int)(byte)-1);
    int i21 = classUnderTest0.add(401, 12);
    int i24 = classUnderTest0.add(985, 219);
    int i27 = classUnderTest0.add(307, 757);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 413);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1204);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1064);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(1, 1);
    int i12 = classUnderTest0.add(165, (int)(byte)100);
    int i15 = classUnderTest0.add(307, 94);
    int i18 = classUnderTest0.add(0, 251);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 401);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 251);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add(97, (int)(short)10);
    int i9 = classUnderTest0.add(0, 463);
    int i12 = classUnderTest0.add(151, 0);
    int i15 = classUnderTest0.add(260, (int)'4');
    int i18 = classUnderTest0.add(1100, 1357);
    int i21 = classUnderTest0.add(3409, 2744);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 463);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2457);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 6153);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(0, 32);
    int i12 = classUnderTest0.add(100, 2);
    int i15 = classUnderTest0.add(285, 119);
    int i18 = classUnderTest0.add(834, 526);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 404);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1360);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add((int)(short)1, 97);
    int i15 = classUnderTest0.add((int)'4', 101);
    int i18 = classUnderTest0.add(84, 100);
    int i21 = classUnderTest0.add(501, 10);
    int i24 = classUnderTest0.add(2850, 4150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 511);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 7000);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add((int)'#', 34);
    int i21 = classUnderTest0.add((int)'4', (int)(short)0);
    int i24 = classUnderTest0.add(2618, 292);
    int i27 = classUnderTest0.add(42, 2082);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2910);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2124);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(67, 52);
    int i12 = classUnderTest0.add(84, 5043);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 119);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 5127);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add(67, 94);
    int i15 = classUnderTest0.add(336, (int)' ');
    int i18 = classUnderTest0.add((int)(byte)100, 2850);
    int i21 = classUnderTest0.add(542, 281);
    int i24 = classUnderTest0.add(800, 960);
    int i27 = classUnderTest0.add(1783, 339);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2950);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 823);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1760);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2122);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(short)10, 0);
    int i6 = classUnderTest0.add(164, 132);
    int i9 = classUnderTest0.add(413, 567);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 296);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 980);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add((int)' ', (-1));
    int i12 = classUnderTest0.add(802, 2074);
    int i15 = classUnderTest0.add(0, 811);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2876);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 811);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(short)10, 0);
    int i6 = classUnderTest0.add(2, 175);
    int i9 = classUnderTest0.add(890, 1806);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 177);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2696);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(122, 53);
    int i12 = classUnderTest0.add(995, 756);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 175);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1751);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(0, 101);
    int i15 = classUnderTest0.add(0, 132);
    int i18 = classUnderTest0.add(31, 0);
    int i21 = classUnderTest0.add(97, 879);
    int i24 = classUnderTest0.add(336, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 976);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 346);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(0, 32);
    int i12 = classUnderTest0.add(100, 2);
    int i15 = classUnderTest0.add(101, 0);
    int i18 = classUnderTest0.add(0, 108);
    int i21 = classUnderTest0.add(756, 824);
    int i24 = classUnderTest0.add(567, 750);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1580);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1317);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add((int)' ', (int)(byte)-1);
    int i21 = classUnderTest0.add(100, (int)(byte)0);
    int i24 = classUnderTest0.add(72, 84);
    int i27 = classUnderTest0.add(1196, 886);
    int i30 = classUnderTest0.add(186, 690);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 156);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2082);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 876);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add(0, 189);
    int i15 = classUnderTest0.add(615, 970);
    int i18 = classUnderTest0.add(1729, 2082);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 189);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1585);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3811);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(short)10, 0);
    int i6 = classUnderTest0.add(84, (int)(byte)10);
    int i9 = classUnderTest0.add(67, (int)(byte)100);
    int i12 = classUnderTest0.add(184, 32);
    int i15 = classUnderTest0.add(97, (int)'#');
    int i18 = classUnderTest0.add(678, 72);
    int i21 = classUnderTest0.add(487, 1135);
    int i24 = classUnderTest0.add(1778, 1360);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 167);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 750);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1622);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3138);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add((int)(short)1, 97);
    int i15 = classUnderTest0.add((int)'4', 101);
    int i18 = classUnderTest0.add(9, 32);
    int i21 = classUnderTest0.add(855, 1111);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1966);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(0, 32);
    int i12 = classUnderTest0.add(100, 2);
    int i15 = classUnderTest0.add((-1), 130);
    int i18 = classUnderTest0.add(434, 2680);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 129);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3114);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', (int)'4');
    int i9 = classUnderTest0.add(98, 296);
    int i12 = classUnderTest0.add(549, 1071);
    int i15 = classUnderTest0.add(534, 161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 394);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1620);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 695);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(53, 69);
    int i12 = classUnderTest0.add((int)' ', 132);
    int i15 = classUnderTest0.add((int)(byte)1, 32);
    int i18 = classUnderTest0.add(463, 296);
    int i21 = classUnderTest0.add(1330, 1350);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 122);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 164);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 759);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2680);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add((int)' ', (int)(byte)-1);
    int i21 = classUnderTest0.add(100, (int)(byte)0);
    int i24 = classUnderTest0.add((int)(short)0, 534);
    int i27 = classUnderTest0.add(865, 1221);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 534);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2086);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(151, 185);
    int i15 = classUnderTest0.add((int)(short)-1, 131);
    int i18 = classUnderTest0.add(534, 5127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 130);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 5661);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add((int)'#', 34);
    int i21 = classUnderTest0.add((int)'#', 0);
    int i24 = classUnderTest0.add(0, 68);
    int i27 = classUnderTest0.add(757, 2850);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3607);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add(0, 151);
    int i18 = classUnderTest0.add(1008, 100);
    int i21 = classUnderTest0.add(1729, 947);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2676);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add(132, (int)(byte)100);
    int i15 = classUnderTest0.add(35, 119);
    int i18 = classUnderTest0.add(648, 1094);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1742);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add((int)' ', (int)(byte)-1);
    int i21 = classUnderTest0.add(2850, 165);
    int i24 = classUnderTest0.add(1022, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3015);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1054);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(0, 32);
    int i12 = classUnderTest0.add(100, 2);
    int i15 = classUnderTest0.add(101, 0);
    int i18 = classUnderTest0.add((int)(short)100, 63);
    int i21 = classUnderTest0.add(1373, 1602);
    int i24 = classUnderTest0.add(1457, 2062);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 163);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2975);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3519);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(579, 32);
    int i12 = classUnderTest0.add(581, 133);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 611);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 714);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(short)10, 0);
    int i6 = classUnderTest0.add(2, 175);
    int i9 = classUnderTest0.add((int)(byte)0, 339);
    int i12 = classUnderTest0.add(655, 2910);
    int i15 = classUnderTest0.add(2197, 648);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 177);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 339);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3565);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2845);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(3015, 3338);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 6353);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', (int)'4');
    int i9 = classUnderTest0.add(98, 296);
    int i12 = classUnderTest0.add(393, 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 394);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 490);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(164, 175);
    int i12 = classUnderTest0.add(153, 31);
    int i15 = classUnderTest0.add(728, 995);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 339);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1723);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(0, 101);
    int i15 = classUnderTest0.add(0, 132);
    int i18 = classUnderTest0.add(97, 122);
    int i21 = classUnderTest0.add(219, 249);
    int i24 = classUnderTest0.add(938, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 219);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 468);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 938);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(164, 175);
    int i12 = classUnderTest0.add(153, 31);
    int i15 = classUnderTest0.add(0, 152);
    int i18 = classUnderTest0.add(521, (int)(short)10);
    int i21 = classUnderTest0.add(434, 53);
    int i24 = classUnderTest0.add(1221, 1111);
    int i27 = classUnderTest0.add(232, 583);
    int i30 = classUnderTest0.add(2533, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 339);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 531);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 487);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 815);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2533);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', (int)'4');
    int i9 = classUnderTest0.add(122, 2);
    int i12 = classUnderTest0.add(865, 1022);
    int i15 = classUnderTest0.add(345, 531);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 124);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1887);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 876);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(0, 32);
    int i12 = classUnderTest0.add(100, 2);
    int i15 = classUnderTest0.add(101, 0);
    int i18 = classUnderTest0.add(0, 108);
    int i21 = classUnderTest0.add(261, 135);
    int i24 = classUnderTest0.add(98, 1758);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 396);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1856);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', (int)'4');
    int i9 = classUnderTest0.add(122, 2);
    int i12 = classUnderTest0.add(196, 438);
    int i15 = classUnderTest0.add(307, 1241);
    int i18 = classUnderTest0.add(543, 222);
    int i21 = classUnderTest0.add(879, 468);
    int i24 = classUnderTest0.add(368, 922);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 124);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 634);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1548);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 765);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1347);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1290);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add(130, 619);
    int i21 = classUnderTest0.add(2398, 333);
    int i24 = classUnderTest0.add(823, 125);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 749);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2731);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 948);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(0, 0);
    int i9 = classUnderTest0.add((int)(byte)100, 1357);
    int i12 = classUnderTest0.add(156, 177);
    int i15 = classUnderTest0.add(33, 687);
    int i18 = classUnderTest0.add(1236, 1622);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1457);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 333);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 720);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2858);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', (int)'4');
    int i9 = classUnderTest0.add(98, 296);
    int i12 = classUnderTest0.add(161, 394);
    int i15 = classUnderTest0.add(340, 960);
    int i18 = classUnderTest0.add(584, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 394);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 555);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1300);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 584);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', (int)'4');
    int i9 = classUnderTest0.add(98, 296);
    int i12 = classUnderTest0.add(161, 394);
    int i15 = classUnderTest0.add(165, 678);
    int i18 = classUnderTest0.add(249, 1360);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 394);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 555);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 843);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1609);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(1, 1);
    int i12 = classUnderTest0.add(0, 161);
    int i15 = classUnderTest0.add(553, 281);
    int i18 = classUnderTest0.add((int)(short)1, 1300);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 834);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1301);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add((int)(short)1, 97);
    int i15 = classUnderTest0.add((int)'4', 101);
    int i18 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i21 = classUnderTest0.add(132, (int)(short)0);
    int i24 = classUnderTest0.add(175, 307);
    int i27 = classUnderTest0.add(1221, 109);
    int i30 = classUnderTest0.add(1723, 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 482);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1330);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1830);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(53, 69);
    int i12 = classUnderTest0.add((int)' ', 132);
    int i15 = classUnderTest0.add(161, 876);
    int i18 = classUnderTest0.add(62, 579);
    int i21 = classUnderTest0.add(1116, 469);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 122);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 164);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1037);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 641);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1585);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', (int)'4');
    int i9 = classUnderTest0.add(98, 296);
    int i12 = classUnderTest0.add(161, 394);
    int i15 = classUnderTest0.add(340, 960);
    int i18 = classUnderTest0.add(1349, 102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 394);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 555);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1300);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1451);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add((-1), (int)(byte)0);
    int i9 = classUnderTest0.add(69, (-1));
    int i12 = classUnderTest0.add(1196, 175);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1371);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(0, 32);
    int i12 = classUnderTest0.add(100, 2);
    int i15 = classUnderTest0.add(452, 124);
    int i18 = classUnderTest0.add(219, 703);
    int i21 = classUnderTest0.add(0, 1336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 922);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1336);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(0, 32);
    int i12 = classUnderTest0.add(42, 218);
    int i15 = classUnderTest0.add(1094, 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1126);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(53, 100);
    int i12 = classUnderTest0.add(102, 63);
    int i15 = classUnderTest0.add(438, 265);
    int i18 = classUnderTest0.add(222, 218);
    int i21 = classUnderTest0.add(567, 12);
    int i24 = classUnderTest0.add(114, 108);
    int i27 = classUnderTest0.add(3302, 107);
    int i30 = classUnderTest0.add(1689, 33);
    int i33 = classUnderTest0.add(157, 3181);
    int i36 = classUnderTest0.add(703, 1301);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 165);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 703);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 579);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 222);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3409);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1722);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 3338);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2004);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(53, 100);
    int i12 = classUnderTest0.add(102, 63);
    int i15 = classUnderTest0.add(6153, 2062);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 165);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 8215);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(53, 69);
    int i12 = classUnderTest0.add((int)' ', 132);
    int i15 = classUnderTest0.add(0, 34);
    int i18 = classUnderTest0.add(404, 130);
    int i21 = classUnderTest0.add(438, 249);
    int i24 = classUnderTest0.add(440, 2676);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 122);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 164);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 534);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 687);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3116);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(162, 175);
    int i6 = classUnderTest0.add(780, 1084);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 337);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1864);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(0, 101);
    int i15 = classUnderTest0.add(0, 132);
    int i18 = classUnderTest0.add(770, 154);
    int i21 = classUnderTest0.add(341, 133);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 924);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 474);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((int)'#', 119);
    int i18 = classUnderTest0.add(413, 3396);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3809);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(9, (int)(byte)100);
    int i9 = classUnderTest0.add(394, 482);
    int i12 = classUnderTest0.add((int)(short)1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 876);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(42, (int)(byte)10);
    int i15 = classUnderTest0.add(336, 98);
    int i18 = classUnderTest0.add(9, 283);
    int i21 = classUnderTest0.add(1647, 865);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 434);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 292);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2512);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(1, 1);
    int i12 = classUnderTest0.add(101, 337);
    int i15 = classUnderTest0.add(0, 129);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 438);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 129);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(232, (-1));
    int i12 = classUnderTest0.add(401, 277);
    int i15 = classUnderTest0.add(1, 156);
    int i18 = classUnderTest0.add(634, 1126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 231);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 678);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 157);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1760);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', (int)'4');
    int i9 = classUnderTest0.add(122, 2);
    int i12 = classUnderTest0.add(196, 438);
    int i15 = classUnderTest0.add(154, 970);
    int i18 = classUnderTest0.add(231, 2332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 124);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 634);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1124);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2563);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add(35, 394);
    int i18 = classUnderTest0.add(622, 33);
    int i21 = classUnderTest0.add(1578, 151);
    int i24 = classUnderTest0.add(10, 1071);
    int i27 = classUnderTest0.add(1457, 149);
    int i30 = classUnderTest0.add(736, 1373);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 429);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 655);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1729);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1081);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1606);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2109);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(53, 100);
    int i12 = classUnderTest0.add((int)(byte)100, 524);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 624);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(short)10, 0);
    int i6 = classUnderTest0.add(84, (int)(byte)10);
    int i9 = classUnderTest0.add(67, (int)(byte)100);
    int i12 = classUnderTest0.add(1057, 975);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 167);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2032);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(164, 175);
    int i12 = classUnderTest0.add(153, 31);
    int i15 = classUnderTest0.add(0, 152);
    int i18 = classUnderTest0.add(521, (int)(short)10);
    int i21 = classUnderTest0.add(434, 53);
    int i24 = classUnderTest0.add(1221, 1111);
    int i27 = classUnderTest0.add(232, 583);
    int i30 = classUnderTest0.add(31, 1317);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 339);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 531);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 487);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 815);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1348);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(452, 222);
    int i15 = classUnderTest0.add(1463, 2224);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 674);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3687);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(short)10, 0);
    int i6 = classUnderTest0.add((int)(short)0, 69);
    int i9 = classUnderTest0.add(119, 1241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1360);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(53, 69);
    int i12 = classUnderTest0.add(69, 394);
    int i15 = classUnderTest0.add(493, 549);
    int i18 = classUnderTest0.add(567, 585);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 122);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 463);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1042);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1152);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(0, 101);
    int i15 = classUnderTest0.add(3410, 865);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 4275);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(0, 32);
    int i12 = classUnderTest0.add(100, 2);
    int i15 = classUnderTest0.add(101, 0);
    int i18 = classUnderTest0.add(728, 655);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1383);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)(short)0, 98);
    int i9 = classUnderTest0.add(69, 84);
    int i12 = classUnderTest0.add(151, 185);
    int i15 = classUnderTest0.add(132, 2224);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2356);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add((int)(short)1, 97);
    int i15 = classUnderTest0.add((int)'4', 101);
    int i18 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i21 = classUnderTest0.add((-1), 3633);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3632);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', (int)'4');
    int i9 = classUnderTest0.add(98, 296);
    int i12 = classUnderTest0.add(549, 1071);
    int i15 = classUnderTest0.add(490, 8215);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 394);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1620);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 8705);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add((int)' ', (-1));
    int i12 = classUnderTest0.add((int)(byte)100, 52);
    int i15 = classUnderTest0.add((int)(byte)100, 162);
    int i18 = classUnderTest0.add(1108, 1116);
    int i21 = classUnderTest0.add(109, 262);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 262);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2224);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 371);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(122, 53);
    int i12 = classUnderTest0.add(0, 63);
    int i15 = classUnderTest0.add(780, 67);
    int i18 = classUnderTest0.add(924, 1632);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 175);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 847);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2556);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(53, 69);
    int i12 = classUnderTest0.add(69, 394);
    int i15 = classUnderTest0.add(1373, 1081);
    int i18 = classUnderTest0.add(68, (int)(byte)-1);
    int i21 = classUnderTest0.add(824, 555);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 122);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 463);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2454);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1379);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add((int)(short)0, (int)'a');
    int i12 = classUnderTest0.add(10, 53);
    int i15 = classUnderTest0.add(69, 1689);
    int i18 = classUnderTest0.add(281, 1057);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1758);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1338);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add(296, 285);
    int i9 = classUnderTest0.add(811, 690);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 581);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1501);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(53, 100);
    int i12 = classUnderTest0.add(102, 63);
    int i15 = classUnderTest0.add(438, 265);
    int i18 = classUnderTest0.add(222, 218);
    int i21 = classUnderTest0.add(567, 12);
    int i24 = classUnderTest0.add(53, 0);
    int i27 = classUnderTest0.add(4275, 167);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 165);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 703);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 579);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4442);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', (int)'4');
    int i9 = classUnderTest0.add(98, 296);
    int i12 = classUnderTest0.add(549, 1071);
    int i15 = classUnderTest0.add(0, 583);
    int i18 = classUnderTest0.add(980, 2122);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 394);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1620);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 583);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3102);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add(67, 52);
    int i12 = classUnderTest0.add(521, 98);
    int i15 = classUnderTest0.add(3015, 345);
    int i18 = classUnderTest0.add(5661, 2880);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 119);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 619);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3360);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 8541);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add((int)(short)1, 97);
    int i15 = classUnderTest0.add((int)'4', 101);
    int i18 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i21 = classUnderTest0.add(132, (int)(short)0);
    int i24 = classUnderTest0.add(175, 307);
    int i27 = classUnderTest0.add(553, 167);
    int i30 = classUnderTest0.add(8541, 1360);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 482);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 720);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 9901);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(34, (int)(short)0);
    int i12 = classUnderTest0.add((int)(short)1, (int)(short)100);
    int i15 = classUnderTest0.add((-1), 32);
    int i18 = classUnderTest0.add((int)' ', (int)(byte)-1);
    int i21 = classUnderTest0.add(100, (int)(byte)0);
    int i24 = classUnderTest0.add((int)(short)0, 534);
    int i27 = classUnderTest0.add(757, 1008);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 534);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1765);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add(1, (int)'4');
    int i9 = classUnderTest0.add(0, 32);
    int i12 = classUnderTest0.add(834, 770);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1604);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)(byte)0);
    int i6 = classUnderTest0.add((-1), (int)(byte)0);
    int i9 = classUnderTest0.add(69, (-1));
    int i12 = classUnderTest0.add(482, 133);
    int i15 = classUnderTest0.add(281, 960);
    int i18 = classUnderTest0.add(2062, 1094);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 615);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3156);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add((int)(byte)-1, (int)'#');
    int i6 = classUnderTest0.add((int)' ', 0);
    int i9 = classUnderTest0.add((int)(short)1, 31);
    int i12 = classUnderTest0.add(0, 189);
    int i15 = classUnderTest0.add(615, 970);
    int i18 = classUnderTest0.add(1357, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 189);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1585);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1357);

  }

}
