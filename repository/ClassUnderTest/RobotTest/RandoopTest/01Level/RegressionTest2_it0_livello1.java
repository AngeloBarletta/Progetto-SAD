
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test001"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(0, 820);
    int i12 = classUnderTest0.add(6551, 16763);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 820);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 23314);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test002"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)0, 52);
    int i15 = classUnderTest0.add(5604, 1553);
    int i18 = classUnderTest0.add(857, 19411);
    int i21 = classUnderTest0.add(1571, 2159);
    int i24 = classUnderTest0.add(50410, 1005);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 7157);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 20268);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3730);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 51415);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test003"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(612, (int)' ');
    int i9 = classUnderTest0.add(1142, 100);
    int i12 = classUnderTest0.add(551, 2718);
    int i15 = classUnderTest0.add(1431, 4660);
    int i18 = classUnderTest0.add(1429, 1493);
    int i21 = classUnderTest0.add(6091, 9631);
    int i24 = classUnderTest0.add(1932, 11328);
    int i27 = classUnderTest0.add(6028, 17847);
    
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
    org.junit.Assert.assertTrue(i21 == 15722);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 13260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 23875);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test004"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(34, 309);
    int i21 = classUnderTest0.add(512, 248);
    int i24 = classUnderTest0.add(6023, 11146);
    
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
    org.junit.Assert.assertTrue(i24 == 17169);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test005"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'a', 0);
    int i24 = classUnderTest0.add(2927, 410);
    int i27 = classUnderTest0.add(279, 1609);
    int i30 = classUnderTest0.add(17672, 1808);
    
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
    org.junit.Assert.assertTrue(i24 == 3337);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 19480);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test006"); }


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
    int i30 = classUnderTest0.add(147, 2927);
    int i33 = classUnderTest0.add(982, 107);
    int i36 = classUnderTest0.add(14209, 11124);
    
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
    org.junit.Assert.assertTrue(i30 == 3074);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1089);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 25333);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test007"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add((int)(byte)1, 786);
    int i21 = classUnderTest0.add(2511, 3009);
    int i24 = classUnderTest0.add(267, 61);
    int i27 = classUnderTest0.add(0, 2795);
    int i30 = classUnderTest0.add(9143, 12022);
    
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
    org.junit.Assert.assertTrue(i24 == 328);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2795);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 21165);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test008"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add(1312, 301);
    int i21 = classUnderTest0.add(4206, 210);
    int i24 = classUnderTest0.add(15722, 4202);
    
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
    org.junit.Assert.assertTrue(i18 == 1613);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4416);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 19924);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test009"); }


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
    int i42 = classUnderTest0.add(10985, 7565);
    
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
    org.junit.Assert.assertTrue(i42 == 18550);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test010"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(793, 135);
    int i18 = classUnderTest0.add(218, 1077);
    int i21 = classUnderTest0.add(11081, 994);
    
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
    org.junit.Assert.assertTrue(i21 == 12075);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test011"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add(1312, 301);
    int i21 = classUnderTest0.add(4206, 210);
    int i24 = classUnderTest0.add(9246, 835);
    
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
    org.junit.Assert.assertTrue(i18 == 1613);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4416);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 10081);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test012"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add((int)'4', 643);
    int i18 = classUnderTest0.add(420, 450);
    int i21 = classUnderTest0.add(4571, 1434);
    int i24 = classUnderTest0.add(15823, 1767);
    int i27 = classUnderTest0.add(5945, 10996);
    
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
    org.junit.Assert.assertTrue(i21 == 6005);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 17590);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 16941);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test013"); }


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
    int i30 = classUnderTest0.add(486, 2120);
    
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
    org.junit.Assert.assertTrue(i30 == 2606);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test014"); }


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
    int i30 = classUnderTest0.add(11305, 14974);
    
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
    org.junit.Assert.assertTrue(i30 == 26279);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test015"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(612, (int)' ');
    int i9 = classUnderTest0.add(0, 651);
    int i12 = classUnderTest0.add(6457, 2666);
    int i15 = classUnderTest0.add(11757, 4817);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 644);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 651);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 9123);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 16574);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test016"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(byte)1, 448);
    int i21 = classUnderTest0.add(1109, 2719);
    int i24 = classUnderTest0.add(5227, 13434);
    
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
    org.junit.Assert.assertTrue(i21 == 3828);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 18661);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test017"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(898, 503);
    int i15 = classUnderTest0.add(720, 348);
    int i18 = classUnderTest0.add(305, 480);
    int i21 = classUnderTest0.add(1364, 1990);
    int i24 = classUnderTest0.add(30122, 11835);
    
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
    org.junit.Assert.assertTrue(i21 == 3354);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 41957);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test018"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(198, 100);
    int i21 = classUnderTest0.add(1037, 0);
    int i24 = classUnderTest0.add(358, 798);
    int i27 = classUnderTest0.add(697, 5924);
    int i30 = classUnderTest0.add(4453, 13855);
    
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
    org.junit.Assert.assertTrue(i24 == 1156);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 6621);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 18308);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test019"); }


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
    int i42 = classUnderTest0.add(876, 5489);
    
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
    org.junit.Assert.assertTrue(i42 == 6365);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test020"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add((int)'4', 643);
    int i18 = classUnderTest0.add(0, 1091);
    int i21 = classUnderTest0.add(135, 227);
    int i24 = classUnderTest0.add(470, 4817);
    int i27 = classUnderTest0.add(2717, 7875);
    int i30 = classUnderTest0.add(6950, 1846);
    
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
    org.junit.Assert.assertTrue(i27 == 10592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 8796);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test021"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(280, 940);
    int i18 = classUnderTest0.add(645, 309);
    int i21 = classUnderTest0.add(1683, 551);
    int i24 = classUnderTest0.add(5851, 13655);
    int i27 = classUnderTest0.add(3562, 4099);
    
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
    org.junit.Assert.assertTrue(i21 == 2234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 19506);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 7661);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test022"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(236, 470);
    int i27 = classUnderTest0.add(2057, 1594);
    int i30 = classUnderTest0.add(4060, 1432);
    int i33 = classUnderTest0.add(0, 2267);
    int i36 = classUnderTest0.add(760, 0);
    
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
    org.junit.Assert.assertTrue(i24 == 706);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3651);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5492);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2267);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 760);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test023"); }


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
    int i33 = classUnderTest0.add(603, 198);
    int i36 = classUnderTest0.add(0, 2458);
    int i39 = classUnderTest0.add(778, 2017);
    int i42 = classUnderTest0.add(3245, 10719);
    
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
    org.junit.Assert.assertTrue(i33 == 801);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2458);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2795);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 13964);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test024"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(512, 97);
    int i21 = classUnderTest0.add(318, 3310);
    int i24 = classUnderTest0.add(3821, 4060);
    int i27 = classUnderTest0.add(1586, 9742);
    int i30 = classUnderTest0.add(8578, 9304);
    
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
    org.junit.Assert.assertTrue(i27 == 11328);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 17882);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test025"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(770, 1170);
    int i18 = classUnderTest0.add(2120, 996);
    int i21 = classUnderTest0.add(2180, 154);
    int i24 = classUnderTest0.add(154, 97);
    int i27 = classUnderTest0.add(3145, 6192);
    int i30 = classUnderTest0.add(5569, 797);
    int i33 = classUnderTest0.add(11081, 5028);
    
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
    org.junit.Assert.assertTrue(i27 == 9337);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 6366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 16109);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test026"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(1554, 208);
    int i15 = classUnderTest0.add(17202, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1762);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 17254);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test027"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(197, 151);
    int i18 = classUnderTest0.add((int)(short)100, 914);
    int i21 = classUnderTest0.add(10985, 11218);
    
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
    org.junit.Assert.assertTrue(i21 == 22203);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test028"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add(10, 108);
    int i21 = classUnderTest0.add(720, 52);
    int i24 = classUnderTest0.add(720, 100);
    int i27 = classUnderTest0.add(3764, 202);
    int i30 = classUnderTest0.add(12243, 9149);
    
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
    org.junit.Assert.assertTrue(i27 == 3966);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 21392);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test029"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 97);
    int i15 = classUnderTest0.add(1453, 398);
    int i18 = classUnderTest0.add(4465, 0);
    int i21 = classUnderTest0.add(54062, 15412);
    
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
    org.junit.Assert.assertTrue(i18 == 4465);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 69474);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test030"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add(1312, 301);
    int i21 = classUnderTest0.add(4206, 210);
    int i24 = classUnderTest0.add(3195, 3267);
    int i27 = classUnderTest0.add(608, 3277);
    int i30 = classUnderTest0.add(10391, 3116);
    
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
    org.junit.Assert.assertTrue(i18 == 1613);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4416);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6462);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3885);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 13507);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test031"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add((int)' ', 205);
    int i18 = classUnderTest0.add(847, 2179);
    int i21 = classUnderTest0.add(869, 2795);
    int i24 = classUnderTest0.add(4458, 4366);
    
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
    org.junit.Assert.assertTrue(i21 == 3664);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 8824);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test032"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(1003, 681);
    int i6 = classUnderTest0.add(250, 2017);
    int i9 = classUnderTest0.add(341, 1170);
    int i12 = classUnderTest0.add(30229, 5493);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1684);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2267);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1511);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35722);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test033"); }


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
    int i30 = classUnderTest0.add(2532, 4418);
    int i33 = classUnderTest0.add(2167, 3185);
    int i36 = classUnderTest0.add(1077, 4418);
    int i39 = classUnderTest0.add(2234, 1039);
    int i42 = classUnderTest0.add(5004, 4465);
    
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
    org.junit.Assert.assertTrue(i30 == 6950);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 5352);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 5495);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 3273);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 9469);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test034"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add((int)' ', 205);
    int i18 = classUnderTest0.add(847, 2179);
    int i21 = classUnderTest0.add(1762, 3644);
    int i24 = classUnderTest0.add(11953, 4180);
    
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
    org.junit.Assert.assertTrue(i21 == 5406);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 16133);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test035"); }


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
    int i30 = classUnderTest0.add(126, 4283);
    int i33 = classUnderTest0.add(1857, 4591);
    int i36 = classUnderTest0.add(1196, 3644);
    int i39 = classUnderTest0.add(3334, 7605);
    
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
    org.junit.Assert.assertTrue(i30 == 4409);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 6448);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 4840);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 10939);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test036"); }


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
    int i30 = classUnderTest0.add((int)(byte)-1, 1432);
    int i33 = classUnderTest0.add(946, 1997);
    int i36 = classUnderTest0.add(11211, 0);
    
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
    org.junit.Assert.assertTrue(i30 == 1431);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2943);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 11211);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test037"); }


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
    int i30 = classUnderTest0.add(3263, 3993);
    int i33 = classUnderTest0.add(12997, 10952);
    
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
    org.junit.Assert.assertTrue(i30 == 7256);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 23949);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test038"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add((int)(short)10, 97);
    int i21 = classUnderTest0.add(347, 4324);
    int i24 = classUnderTest0.add(2557, 348);
    int i27 = classUnderTest0.add(625, 1360);
    
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
    org.junit.Assert.assertTrue(i24 == 2905);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1985);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test039"); }


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
    int i33 = classUnderTest0.add(94, 3177);
    int i36 = classUnderTest0.add(5231, 13040);
    
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
    org.junit.Assert.assertTrue(i33 == 3271);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 18271);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test040"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(7050, 6074);
    int i24 = classUnderTest0.add(32485, 15933);
    int i27 = classUnderTest0.add(0, 609);
    
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
    org.junit.Assert.assertTrue(i21 == 13124);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 48418);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 609);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test041"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(3399, 2717);
    int i18 = classUnderTest0.add(5545, 2267);
    int i21 = classUnderTest0.add(892, 8149);
    int i24 = classUnderTest0.add(318, 15687);
    
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
    org.junit.Assert.assertTrue(i21 == 9041);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 16005);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test042"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(996, 300);
    int i15 = classUnderTest0.add(52, 9505);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1296);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 9557);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test043"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(97, 323);
    int i18 = classUnderTest0.add(117, 857);
    int i21 = classUnderTest0.add(2338, 8053);
    int i24 = classUnderTest0.add(196, 9852);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 420);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 974);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10391);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 10048);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test044"); }


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
    int i30 = classUnderTest0.add(1683, 1377);
    int i33 = classUnderTest0.add(870, 9493);
    
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
    org.junit.Assert.assertTrue(i30 == 3060);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 10363);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test045"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(0, 3526);
    int i18 = classUnderTest0.add(15687, 23949);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3526);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 39636);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test046"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(233, 665);
    int i15 = classUnderTest0.add(11071, 0);
    int i18 = classUnderTest0.add(11990, 5934);
    int i21 = classUnderTest0.add(6916, 27222);
    int i24 = classUnderTest0.add(9821, 5058);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 11071);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 17924);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 34138);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 14879);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test047"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(2057, 1220);
    int i18 = classUnderTest0.add(105, 145);
    int i21 = classUnderTest0.add(0, 261);
    
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
    org.junit.Assert.assertTrue(i21 == 261);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test048"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(898, 503);
    int i15 = classUnderTest0.add(720, 348);
    int i18 = classUnderTest0.add(34, 0);
    int i21 = classUnderTest0.add(5253, 14617);
    int i24 = classUnderTest0.add(23866, 22664);
    
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
    org.junit.Assert.assertTrue(i18 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 19870);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 46530);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test049"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(byte)1, 208);
    int i21 = classUnderTest0.add(215, 108);
    int i24 = classUnderTest0.add(787, 205);
    int i27 = classUnderTest0.add(547, 479);
    int i30 = classUnderTest0.add(3988, 34);
    
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
    org.junit.Assert.assertTrue(i27 == 1026);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4022);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test050"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(703, 1260);
    int i18 = classUnderTest0.add(3421, 1660);
    int i21 = classUnderTest0.add((int)(short)100, 2199);
    int i24 = classUnderTest0.add(14245, 0);
    
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
    org.junit.Assert.assertTrue(i21 == 2299);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 14245);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test051"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add((int)(short)100, 954);
    int i18 = classUnderTest0.add(5028, 6400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1054);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11428);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test052"); }


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
    int i30 = classUnderTest0.add(11211, 21096);
    
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
    org.junit.Assert.assertTrue(i30 == 32307);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test053"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)0, (int)'4');
    int i18 = classUnderTest0.add(52, 796);
    int i21 = classUnderTest0.add(3993, 2343);
    int i24 = classUnderTest0.add(603, 480);
    int i27 = classUnderTest0.add(126, 9726);
    int i30 = classUnderTest0.add(6904, 6552);
    
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
    org.junit.Assert.assertTrue(i27 == 9852);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 13456);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test054"); }


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
    int i33 = classUnderTest0.add(101, 12619);
    
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
    org.junit.Assert.assertTrue(i33 == 12720);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test055"); }


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
    int i30 = classUnderTest0.add(18411, 14200);
    
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
    org.junit.Assert.assertTrue(i30 == 32611);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test056"); }


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
    int i39 = classUnderTest0.add(5642, 0);
    
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
    org.junit.Assert.assertTrue(i39 == 5642);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test057"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(236, 470);
    int i27 = classUnderTest0.add(2057, 1594);
    int i30 = classUnderTest0.add(4060, 1432);
    int i33 = classUnderTest0.add(2879, 1795);
    int i36 = classUnderTest0.add(5518, 733);
    
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
    org.junit.Assert.assertTrue(i24 == 706);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3651);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5492);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 4674);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 6251);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test058"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(479, 1312);
    int i24 = classUnderTest0.add(688, 370);
    int i27 = classUnderTest0.add(1242, 17525);
    int i30 = classUnderTest0.add((int)' ', 1332);
    
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
    org.junit.Assert.assertTrue(i27 == 18767);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1364);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test059"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(98, 0);
    int i18 = classUnderTest0.add(5018, 7808);
    int i21 = classUnderTest0.add(565, 18680);
    int i24 = classUnderTest0.add(6509, 2334);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 12826);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 19245);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 8843);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test060"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(10, 198);
    int i18 = classUnderTest0.add(512, 153);
    int i21 = classUnderTest0.add(135, 433);
    int i24 = classUnderTest0.add(0, 10952);
    int i27 = classUnderTest0.add(7429, 6592);
    int i30 = classUnderTest0.add(3000, 10100);
    
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
    org.junit.Assert.assertTrue(i24 == 10952);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 14021);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 13100);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test061"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(1003, 681);
    int i6 = classUnderTest0.add(16005, 2795);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1684);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 18800);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test062"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(0, 1291);
    int i15 = classUnderTest0.add(5430, 0);
    int i18 = classUnderTest0.add(18372, 1554);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1291);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 5430);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 19926);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test063"); }


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
    int i39 = classUnderTest0.add(101, 1392);
    int i42 = classUnderTest0.add(3347, 3784);
    
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
    org.junit.Assert.assertTrue(i39 == 1493);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 7131);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test064"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(772, 368);
    int i21 = classUnderTest0.add((int)(byte)-1, (int)(byte)10);
    int i24 = classUnderTest0.add((int)(short)10, 205);
    int i27 = classUnderTest0.add(3821, 5620);
    int i30 = classUnderTest0.add(6318, 1677);
    
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
    org.junit.Assert.assertTrue(i27 == 9441);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 7995);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test065"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(2057, 1220);
    int i18 = classUnderTest0.add(105, 145);
    int i21 = classUnderTest0.add(0, 2572);
    int i24 = classUnderTest0.add(358, 7678);
    
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
    org.junit.Assert.assertTrue(i24 == 8036);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test066"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(1163, 366);
    int i15 = classUnderTest0.add(267, 0);
    int i18 = classUnderTest0.add(118, 787);
    int i21 = classUnderTest0.add(19411, 258);
    
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
    org.junit.Assert.assertTrue(i21 == 19669);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test067"); }


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
    int i33 = classUnderTest0.add(892, 5223);
    int i36 = classUnderTest0.add(1777, 270);
    int i39 = classUnderTest0.add(37371, 0);
    
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
    org.junit.Assert.assertTrue(i33 == 6115);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2047);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 37371);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test068"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(197, 151);
    int i18 = classUnderTest0.add(4898, 16336);
    
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
    org.junit.Assert.assertTrue(i18 == 21234);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test069"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add((int)(short)10, 97);
    int i21 = classUnderTest0.add(347, 4324);
    int i24 = classUnderTest0.add(15979, 5713);
    
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
    org.junit.Assert.assertTrue(i24 == 21692);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test070"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add((int)(byte)100, 98);
    int i18 = classUnderTest0.add(206, 97);
    int i21 = classUnderTest0.add(343, 564);
    int i24 = classUnderTest0.add(1068, 267);
    int i27 = classUnderTest0.add(728, 2693);
    int i30 = classUnderTest0.add(6389, 6005);
    
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
    org.junit.Assert.assertTrue(i24 == 1335);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3421);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 12394);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test071"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add(10, 108);
    int i21 = classUnderTest0.add(411, 4694);
    int i24 = classUnderTest0.add(9441, 4696);
    
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
    org.junit.Assert.assertTrue(i21 == 5105);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 14137);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test072"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(150, 300);
    int i27 = classUnderTest0.add(786, 1401);
    int i30 = classUnderTest0.add(8549, 1315);
    int i33 = classUnderTest0.add((int)(byte)100, 2074);
    int i36 = classUnderTest0.add(2719, 1997);
    int i39 = classUnderTest0.add(0, 786);
    
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
    org.junit.Assert.assertTrue(i27 == 2187);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 9864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2174);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 4716);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 786);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test073"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(151, 0);
    int i21 = classUnderTest0.add(697, 138);
    int i24 = classUnderTest0.add(644, 17371);
    int i27 = classUnderTest0.add(2632, 18828);
    
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
    org.junit.Assert.assertTrue(i24 == 18015);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 21460);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test074"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(209, (int)(byte)100);
    int i21 = classUnderTest0.add(214, 700);
    int i24 = classUnderTest0.add(532, 1154);
    int i27 = classUnderTest0.add(11, 16256);
    
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
    org.junit.Assert.assertTrue(i27 == 16267);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test075"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(612, (int)' ');
    int i9 = classUnderTest0.add(1142, 100);
    int i12 = classUnderTest0.add(551, 2718);
    int i15 = classUnderTest0.add(1431, 4660);
    int i18 = classUnderTest0.add(0, 6958);
    int i21 = classUnderTest0.add(5726, 6381);
    
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
    org.junit.Assert.assertTrue(i18 == 6958);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 12107);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test076"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(byte)1, 208);
    int i21 = classUnderTest0.add(215, 108);
    int i24 = classUnderTest0.add(332, 778);
    int i27 = classUnderTest0.add(19313, 24312);
    
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
    org.junit.Assert.assertTrue(i24 == 1110);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 43625);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test077"); }


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
    int i36 = classUnderTest0.add(1212, (int)(byte)100);
    int i39 = classUnderTest0.add(9324, 2228);
    int i42 = classUnderTest0.add(26023, 8679);
    int i45 = classUnderTest0.add(4366, 13964);
    
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
    org.junit.Assert.assertTrue(i36 == 1312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 11552);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 34702);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 18330);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test078"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add((int)(byte)100, 98);
    int i18 = classUnderTest0.add(206, 97);
    int i21 = classUnderTest0.add(2381, 899);
    int i24 = classUnderTest0.add(8332, 10438);
    
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
    org.junit.Assert.assertTrue(i24 == 18770);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test079"); }


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
    int i33 = classUnderTest0.add(603, 198);
    int i36 = classUnderTest0.add(3372, 2150);
    int i39 = classUnderTest0.add(18296, 3026);
    
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
    org.junit.Assert.assertTrue(i33 == 801);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 5522);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 21322);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test080"); }


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
    int i30 = classUnderTest0.add(11924, 21962);
    int i33 = classUnderTest0.add(1093, 11030);
    
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
    org.junit.Assert.assertTrue(i30 == 33886);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 12123);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test081"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(703, 1260);
    int i18 = classUnderTest0.add(1511, 2034);
    int i21 = classUnderTest0.add(4383, 6091);
    int i24 = classUnderTest0.add(0, 10907);
    int i27 = classUnderTest0.add(5495, 697);
    
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
    org.junit.Assert.assertTrue(i18 == 3545);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10474);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 10907);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 6192);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test082"); }


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
    int i33 = classUnderTest0.add(4460, 3023);
    int i36 = classUnderTest0.add(0, 5004);
    
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
    org.junit.Assert.assertTrue(i33 == 7483);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 5004);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test083"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(5726, 7886);
    int i24 = classUnderTest0.add(21270, 13101);
    
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
    org.junit.Assert.assertTrue(i21 == 13612);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 34371);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test084"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(byte)10, 503);
    int i21 = classUnderTest0.add(411, 2465);
    int i24 = classUnderTest0.add(3177, 4792);
    int i27 = classUnderTest0.add(3983, 12831);
    
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
    org.junit.Assert.assertTrue(i18 == 513);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2876);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 7969);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 16814);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test085"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(770, 1170);
    int i18 = classUnderTest0.add(2120, 996);
    int i21 = classUnderTest0.add(1296, 2563);
    int i24 = classUnderTest0.add(1327, 3896);
    int i27 = classUnderTest0.add(0, 251);
    int i30 = classUnderTest0.add(1382, 4770);
    int i33 = classUnderTest0.add(1481, 2293);
    
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
    org.junit.Assert.assertTrue(i24 == 5223);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 251);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 6152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 3774);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test086"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add((int)(short)-1, 150);
    int i24 = classUnderTest0.add(2486, 0);
    int i27 = classUnderTest0.add(5287, 276);
    int i30 = classUnderTest0.add(1368, 7932);
    
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
    org.junit.Assert.assertTrue(i24 == 2486);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5563);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 9300);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test087"); }


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
    int i36 = classUnderTest0.add(280, 17245);
    int i39 = classUnderTest0.add(2769, 8831);
    int i42 = classUnderTest0.add(237, 17245);
    int i45 = classUnderTest0.add(5018, 7822);
    
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
    org.junit.Assert.assertTrue(i36 == 17525);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 11600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 17482);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 12840);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test088"); }


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
    int i30 = classUnderTest0.add(9317, 16589);
    int i33 = classUnderTest0.add(0, 17057);
    
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
    org.junit.Assert.assertTrue(i30 == 25906);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 17057);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test089"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add(108, (int)'a');
    int i21 = classUnderTest0.add(233, 34);
    int i24 = classUnderTest0.add(0, 8884);
    
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
    org.junit.Assert.assertTrue(i18 == 205);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 267);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 8884);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test090"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add(513, 280);
    int i18 = classUnderTest0.add(946, 314);
    int i21 = classUnderTest0.add(7677, 12545);
    int i24 = classUnderTest0.add(7796, 11946);
    int i27 = classUnderTest0.add(44790, 2905);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 793);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 20222);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 19742);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 47695);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test091"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(770, 1170);
    int i18 = classUnderTest0.add(2120, 996);
    int i21 = classUnderTest0.add(1296, 2563);
    int i24 = classUnderTest0.add(1327, 3896);
    int i27 = classUnderTest0.add(2597, 3769);
    int i30 = classUnderTest0.add(6251, 17590);
    
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
    org.junit.Assert.assertTrue(i24 == 5223);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 6366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 23841);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test092"); }


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
    int i30 = classUnderTest0.add(1291, 1248);
    
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
    org.junit.Assert.assertTrue(i30 == 2539);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test093"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 97);
    int i15 = classUnderTest0.add(1453, 398);
    int i18 = classUnderTest0.add(35, 3753);
    int i21 = classUnderTest0.add(15414, 1306);
    
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
    org.junit.Assert.assertTrue(i18 == 3788);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 16720);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test094"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(305, 552);
    int i15 = classUnderTest0.add(118, 84);
    int i18 = classUnderTest0.add(1110, 343);
    int i21 = classUnderTest0.add(512, 300);
    int i24 = classUnderTest0.add(1453, 1110);
    int i27 = classUnderTest0.add(2187, 0);
    int i30 = classUnderTest0.add(12504, 7131);
    
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
    org.junit.Assert.assertTrue(i24 == 2563);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2187);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 19635);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test095"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(205, 298);
    int i12 = classUnderTest0.add(243, 0);
    int i15 = classUnderTest0.add(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 503);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test096"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add(149, 632);
    int i15 = classUnderTest0.add(0, 537);
    int i18 = classUnderTest0.add(2486, 1335);
    int i21 = classUnderTest0.add(8149, 98);
    int i24 = classUnderTest0.add(34, 711);
    int i27 = classUnderTest0.add(3581, 3220);
    int i30 = classUnderTest0.add(1052, 4110);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 781);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 537);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3821);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 8247);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 745);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 6801);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5162);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test097"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(8400, 7223);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 15623);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test098"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add((int)(byte)-1, (int)(short)1);
    int i21 = classUnderTest0.add(403, 2108);
    int i24 = classUnderTest0.add(451, 11124);
    int i27 = classUnderTest0.add(27235, 6080);
    
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
    org.junit.Assert.assertTrue(i21 == 2511);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 11575);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 33315);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test099"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'#', 633);
    int i24 = classUnderTest0.add(0, 2306);
    
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
    org.junit.Assert.assertTrue(i24 == 2306);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test100"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(2288, 905);
    int i21 = classUnderTest0.add(0, 537);
    int i24 = classUnderTest0.add(1262, 102);
    
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
    org.junit.Assert.assertTrue(i18 == 3193);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 537);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1364);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test101"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add((int)(byte)1, 786);
    int i21 = classUnderTest0.add(549, 1594);
    int i24 = classUnderTest0.add(770, 1223);
    int i27 = classUnderTest0.add(5545, 9265);
    int i30 = classUnderTest0.add(28291, 13137);
    
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
    org.junit.Assert.assertTrue(i27 == 14810);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 41428);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test102"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(2057, 1220);
    int i18 = classUnderTest0.add(105, 145);
    int i21 = classUnderTest0.add(7037, 5535);
    int i24 = classUnderTest0.add(1432, 4817);
    
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
    org.junit.Assert.assertTrue(i21 == 12572);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6249);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test103"); }


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
    int i42 = classUnderTest0.add(197, 10660);
    
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
    org.junit.Assert.assertTrue(i42 == 10857);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test104"); }


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
    int i33 = classUnderTest0.add((int)(short)-1, 215);
    int i36 = classUnderTest0.add(0, 22481);
    
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
    org.junit.Assert.assertTrue(i33 == 214);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 22481);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test105"); }


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
    int i30 = classUnderTest0.add(568, 1762);
    int i33 = classUnderTest0.add(242, 1068);
    int i36 = classUnderTest0.add(1282, 17350);
    
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
    org.junit.Assert.assertTrue(i30 == 2330);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1310);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 18632);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test106"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(236, 517);
    int i24 = classUnderTest0.add(586, 3062);
    int i27 = classUnderTest0.add(0, 10749);
    
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
    org.junit.Assert.assertTrue(i27 == 10749);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test107"); }


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
    int i39 = classUnderTest0.add(451, 6552);
    int i42 = classUnderTest0.add(913, 52696);
    
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
    org.junit.Assert.assertTrue(i39 == 7003);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 53609);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test108"); }


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
    int i30 = classUnderTest0.add(11315, 3766);
    
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
    org.junit.Assert.assertTrue(i30 == 15081);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test109"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(2057, 1220);
    int i18 = classUnderTest0.add(105, 145);
    int i21 = classUnderTest0.add(3357, 403);
    int i24 = classUnderTest0.add(653, 8318);
    
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
    org.junit.Assert.assertTrue(i24 == 8971);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test110"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(53, 42);
    int i24 = classUnderTest0.add(236, 772);
    int i27 = classUnderTest0.add(848, 18464);
    
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
    org.junit.Assert.assertTrue(i27 == 19312);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test111"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(20, 153);
    int i6 = classUnderTest0.add(0, 917);
    int i9 = classUnderTest0.add(227, 236);
    int i12 = classUnderTest0.add(34, 2272);
    int i15 = classUnderTest0.add(6641, 6920);
    int i18 = classUnderTest0.add(2227, 1312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 173);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 917);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 463);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2306);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 13561);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3539);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test112"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(153, (int)(byte)1);
    int i18 = classUnderTest0.add(118, (int)(byte)-1);
    int i21 = classUnderTest0.add(635, 348);
    int i24 = classUnderTest0.add(4338, 510);
    int i27 = classUnderTest0.add(13181, 38703);
    
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
    org.junit.Assert.assertTrue(i24 == 4848);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 51884);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test113"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(153, (int)(byte)1);
    int i18 = classUnderTest0.add(1037, 198);
    int i21 = classUnderTest0.add(1476, 117);
    int i24 = classUnderTest0.add(1686, 4306);
    int i27 = classUnderTest0.add(1895, 8013);
    
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
    org.junit.Assert.assertTrue(i18 == 1235);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1593);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 5992);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 9908);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test114"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)0, (int)'4');
    int i18 = classUnderTest0.add(52, 796);
    int i21 = classUnderTest0.add(280, 0);
    
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
    org.junit.Assert.assertTrue(i21 == 280);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test115"); }


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
    int i30 = classUnderTest0.add(198, 1134);
    int i33 = classUnderTest0.add(4646, 14209);
    
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
    org.junit.Assert.assertTrue(i30 == 1332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 18855);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test116"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(10, 217);
    int i24 = classUnderTest0.add(280, 772);
    int i27 = classUnderTest0.add(2462, 1434);
    int i30 = classUnderTest0.add(11172, 22897);
    int i33 = classUnderTest0.add(2159, 9458);
    
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
    org.junit.Assert.assertTrue(i24 == 1052);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3896);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 34069);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 11617);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test117"); }


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
    int i30 = classUnderTest0.add(3588, 7408);
    int i33 = classUnderTest0.add(954, 681);
    
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
    org.junit.Assert.assertTrue(i30 == 10996);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1635);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test118"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(98, 0);
    int i18 = classUnderTest0.add(6571, 3116);
    int i21 = classUnderTest0.add(13232, 4247);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 9687);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 17479);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test119"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(34, 309);
    int i21 = classUnderTest0.add(512, 248);
    int i24 = classUnderTest0.add(2717, 0);
    int i27 = classUnderTest0.add(3963, (int)'#');
    int i30 = classUnderTest0.add(5077, 7204);
    int i33 = classUnderTest0.add(0, 532);
    
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
    org.junit.Assert.assertTrue(i24 == 2717);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3998);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 12281);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 532);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test120"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(5259, 7932);
    int i21 = classUnderTest0.add(23949, 5074);
    
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
    org.junit.Assert.assertTrue(i18 == 13191);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 29023);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test121"); }


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
    int i30 = classUnderTest0.add(24814, 0);
    int i33 = classUnderTest0.add(6711, 8589);
    
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
    org.junit.Assert.assertTrue(i30 == 24814);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 15300);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test122"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(703, 609);
    int i18 = classUnderTest0.add(9, (int)'a');
    int i21 = classUnderTest0.add(0, 1761);
    int i24 = classUnderTest0.add(18706, 2666);
    
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
    org.junit.Assert.assertTrue(i21 == 1761);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 21372);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test123"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add((int)'4', 643);
    int i18 = classUnderTest0.add(3442, 5462);
    
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
    org.junit.Assert.assertTrue(i18 == 8904);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test124"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(798, 633);
    int i24 = classUnderTest0.add(1609, 2005);
    int i27 = classUnderTest0.add(5441, 1270);
    int i30 = classUnderTest0.add(35315, 0);
    
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
    org.junit.Assert.assertTrue(i24 == 3614);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 6711);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 35315);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test125"); }


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
    int i36 = classUnderTest0.add(1212, (int)(byte)100);
    int i39 = classUnderTest0.add(4898, 1942);
    int i42 = classUnderTest0.add(4272, 6080);
    
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
    org.junit.Assert.assertTrue(i36 == 1312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 6840);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 10352);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test126"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(short)1, 269);
    int i15 = classUnderTest0.add(100, 298);
    int i18 = classUnderTest0.add(332, 1246);
    int i21 = classUnderTest0.add(1401, 4312);
    int i24 = classUnderTest0.add(1795, 3769);
    int i27 = classUnderTest0.add(521, 6812);
    
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
    org.junit.Assert.assertTrue(i24 == 5564);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 7333);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test127"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'#', 633);
    int i24 = classUnderTest0.add(728, 711);
    int i27 = classUnderTest0.add(3993, 611);
    
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
    org.junit.Assert.assertTrue(i27 == 4604);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test128"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(305, 552);
    int i15 = classUnderTest0.add(118, 84);
    int i18 = classUnderTest0.add(1110, 343);
    int i21 = classUnderTest0.add(2476, 787);
    int i24 = classUnderTest0.add(11765, 15587);
    int i27 = classUnderTest0.add(4136, 21939);
    
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
    org.junit.Assert.assertTrue(i21 == 3263);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 27352);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 26075);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test129"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(35, (int)(byte)-1);
    int i24 = classUnderTest0.add(847, 2162);
    int i27 = classUnderTest0.add(1674, 4650);
    int i30 = classUnderTest0.add(0, 5253);
    int i33 = classUnderTest0.add(15057, 6345);
    int i36 = classUnderTest0.add(15285, 1220);
    
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
    org.junit.Assert.assertTrue(i27 == 6324);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5253);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 21402);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 16505);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test130"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(153, (int)(byte)1);
    int i18 = classUnderTest0.add(118, (int)(byte)-1);
    int i21 = classUnderTest0.add(635, 348);
    int i24 = classUnderTest0.add(2427, 4098);
    int i27 = classUnderTest0.add(1068, 208);
    
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
    org.junit.Assert.assertTrue(i27 == 1276);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test131"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)'a', 100);
    int i12 = classUnderTest0.add(772, 107);
    int i15 = classUnderTest0.add(2465, 5520);
    int i18 = classUnderTest0.add(4569, 2330);
    int i21 = classUnderTest0.add(0, 20462);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 879);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 7985);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 6899);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 20462);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test132"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(97, 1529);
    int i21 = classUnderTest0.add(5853, 1434);
    
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
    org.junit.Assert.assertTrue(i21 == 7287);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test133"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(574, 1534);
    int i24 = classUnderTest0.add(2607, 3983);
    int i27 = classUnderTest0.add(8835, 982);
    int i30 = classUnderTest0.add(19695, 611);
    
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
    org.junit.Assert.assertTrue(i24 == 6590);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 9817);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 20306);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test134"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(2632, 3287);
    int i18 = classUnderTest0.add((int)(short)10, 1);
    int i21 = classUnderTest0.add(214, 1431);
    int i24 = classUnderTest0.add(1794, 6081);
    int i27 = classUnderTest0.add(6112, 3035);
    
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
    org.junit.Assert.assertTrue(i21 == 1645);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 7875);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 9147);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test135"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add((int)' ', 205);
    int i18 = classUnderTest0.add(847, 2179);
    int i21 = classUnderTest0.add(1762, 3644);
    int i24 = classUnderTest0.add(13369, 5716);
    
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
    org.junit.Assert.assertTrue(i21 == 5406);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 19085);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test136"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)0, (int)'4');
    int i18 = classUnderTest0.add((int)(short)-1, 197);
    int i21 = classUnderTest0.add((int)(byte)-1, 218);
    int i24 = classUnderTest0.add(14481, 3111);
    
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
    org.junit.Assert.assertTrue(i21 == 217);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 17592);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test137"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(9742, 8132);
    int i15 = classUnderTest0.add(1888, 3440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 17874);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 5328);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test138"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(35, (int)(byte)-1);
    int i24 = classUnderTest0.add(1686, 688);
    int i27 = classUnderTest0.add(106, 335);
    int i30 = classUnderTest0.add(2927, 928);
    
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
    org.junit.Assert.assertTrue(i27 == 441);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3855);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test139"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add((int)' ', 106);
    int i18 = classUnderTest0.add(0, 145);
    int i21 = classUnderTest0.add(6279, 9433);
    
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
    org.junit.Assert.assertTrue(i21 == 15712);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test140"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(short)1, 269);
    int i15 = classUnderTest0.add(100, 298);
    int i18 = classUnderTest0.add(332, 1246);
    int i21 = classUnderTest0.add(1401, 4312);
    int i24 = classUnderTest0.add(696, 44210);
    
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
    org.junit.Assert.assertTrue(i24 == 44906);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test141"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(205, 298);
    int i12 = classUnderTest0.add(243, 0);
    int i15 = classUnderTest0.add(1763, 1594);
    int i18 = classUnderTest0.add(706, 2693);
    int i21 = classUnderTest0.add(15024, 33950);
    
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
    org.junit.Assert.assertTrue(i21 == 48974);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test142"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(34, 309);
    int i21 = classUnderTest0.add(736, 798);
    int i24 = classUnderTest0.add(2563, 1725);
    int i27 = classUnderTest0.add(5518, 102);
    int i30 = classUnderTest0.add(4437, 4110);
    
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
    org.junit.Assert.assertTrue(i24 == 4288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5620);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 8547);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test143"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(52, 95);
    int i21 = classUnderTest0.add(208, 1142);
    int i24 = classUnderTest0.add(6150, 2034);
    int i27 = classUnderTest0.add(8951, 15905);
    
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
    org.junit.Assert.assertTrue(i21 == 1350);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 8184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 24856);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test144"); }


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
    int i36 = classUnderTest0.add(1990, 857);
    int i39 = classUnderTest0.add(5493, 1059);
    int i42 = classUnderTest0.add(5493, 907);
    int i45 = classUnderTest0.add(2503, 3070);
    int i48 = classUnderTest0.add(19107, 2224);
    
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
    org.junit.Assert.assertTrue(i36 == 2847);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 6552);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 6400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 5573);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 21331);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test145"); }


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
    int i30 = classUnderTest0.add((int)(short)10, 200);
    int i33 = classUnderTest0.add(1296, 1178);
    int i36 = classUnderTest0.add(0, 6395);
    int i39 = classUnderTest0.add(666, 1534);
    
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
    org.junit.Assert.assertTrue(i30 == 210);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2474);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 6395);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2200);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test146"); }


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
    int i30 = classUnderTest0.add(2427, 1134);
    int i33 = classUnderTest0.add(3423, 1791);
    int i36 = classUnderTest0.add(10675, 15081);
    
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
    org.junit.Assert.assertTrue(i30 == 3561);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 5214);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 25756);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test147"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add((int)(byte)-1, (int)(short)1);
    int i21 = classUnderTest0.add(6976, 5723);
    
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
    org.junit.Assert.assertTrue(i21 == 12699);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test148"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add((int)(short)0, 118);
    int i15 = classUnderTest0.add(95, (int)(short)10);
    int i18 = classUnderTest0.add(1763, 2066);
    
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
    org.junit.Assert.assertTrue(i18 == 3829);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test149"); }


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
    int i36 = classUnderTest0.add(1990, 857);
    int i39 = classUnderTest0.add(5493, 1059);
    int i42 = classUnderTest0.add(5493, 907);
    int i45 = classUnderTest0.add(2503, 3070);
    int i48 = classUnderTest0.add(0, 32485);
    int i51 = classUnderTest0.add(9304, 696);
    
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
    org.junit.Assert.assertTrue(i36 == 2847);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 6552);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 6400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 5573);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 32485);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 10000);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test150"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(243, 368);
    int i24 = classUnderTest0.add(208, 139);
    int i27 = classUnderTest0.add(1423, 3518);
    int i30 = classUnderTest0.add(4060, 35073);
    
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
    org.junit.Assert.assertTrue(i24 == 347);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4941);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 39133);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test151"); }


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
    int i36 = classUnderTest0.add(1212, (int)(byte)100);
    int i39 = classUnderTest0.add(4527, 1554);
    int i42 = classUnderTest0.add(0, 2756);
    int i45 = classUnderTest0.add(18002, 16723);
    
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
    org.junit.Assert.assertTrue(i36 == 1312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 6081);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 2756);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 34725);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test152"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(236, 517);
    int i24 = classUnderTest0.add(586, 3062);
    int i27 = classUnderTest0.add(4627, 6150);
    int i30 = classUnderTest0.add(2544, 2076);
    
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
    org.junit.Assert.assertTrue(i27 == 10777);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4620);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test153"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(52, 206);
    int i18 = classUnderTest0.add(195, 968);
    int i21 = classUnderTest0.add(6091, 6544);
    int i24 = classUnderTest0.add(15829, 0);
    int i27 = classUnderTest0.add(13714, 5000);
    
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
    org.junit.Assert.assertTrue(i18 == 1163);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 12635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 15829);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 18714);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test154"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(byte)1, 448);
    int i21 = classUnderTest0.add(309, 1687);
    int i24 = classUnderTest0.add(1953, 5319);
    int i27 = classUnderTest0.add(5495, 6220);
    int i30 = classUnderTest0.add(20222, 611);
    int i33 = classUnderTest0.add(2756, 323);
    
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
    org.junit.Assert.assertTrue(i27 == 11715);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 20833);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 3079);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test155"); }


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
    int i30 = classUnderTest0.add(470, 845);
    int i33 = classUnderTest0.add(15557, 12803);
    
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
    org.junit.Assert.assertTrue(i30 == 1315);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 28360);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test156"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add(1235, 1767);
    int i21 = classUnderTest0.add(11994, 30141);
    
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
    org.junit.Assert.assertTrue(i18 == 3002);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 42135);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test157"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(4898, 303);
    int i27 = classUnderTest0.add(11575, 9050);
    int i30 = classUnderTest0.add(250, 0);
    int i33 = classUnderTest0.add(0, 14533);
    
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
    org.junit.Assert.assertTrue(i27 == 20625);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 14533);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test158"); }


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
    int i33 = classUnderTest0.add(603, 198);
    int i36 = classUnderTest0.add(3372, 2150);
    int i39 = classUnderTest0.add((int)' ', 311);
    int i42 = classUnderTest0.add(11372, 1683);
    
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
    org.junit.Assert.assertTrue(i33 == 801);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 5522);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 343);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 13055);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test159"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(770, 1170);
    int i18 = classUnderTest0.add(2120, 996);
    int i21 = classUnderTest0.add(2180, 154);
    int i24 = classUnderTest0.add(154, 97);
    int i27 = classUnderTest0.add(448, 2797);
    int i30 = classUnderTest0.add(3525, 7985);
    int i33 = classUnderTest0.add(19669, 9082);
    
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
    org.junit.Assert.assertTrue(i27 == 3245);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11510);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 28751);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test160"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(1026, 11552);
    int i18 = classUnderTest0.add(5130, 2769);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 12578);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 7899);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test161"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(153, (int)(byte)1);
    int i18 = classUnderTest0.add(118, (int)(byte)-1);
    int i21 = classUnderTest0.add(635, 348);
    int i24 = classUnderTest0.add(154, 451);
    int i27 = classUnderTest0.add(7641, 4283);
    int i30 = classUnderTest0.add(9903, 1674);
    
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
    org.junit.Assert.assertTrue(i24 == 605);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 11924);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11577);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test162"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add((int)(short)0, 118);
    int i15 = classUnderTest0.add(95, (int)(short)10);
    int i18 = classUnderTest0.add(118, 4206);
    int i21 = classUnderTest0.add(4672, 0);
    
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
    org.junit.Assert.assertTrue(i21 == 4672);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test163"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(9699, 3100);
    int i21 = classUnderTest0.add(5489, 3019);
    int i24 = classUnderTest0.add(2381, 7430);
    
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
    org.junit.Assert.assertTrue(i18 == 12799);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 8508);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 9811);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test164"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(20, 153);
    int i6 = classUnderTest0.add(0, 917);
    int i9 = classUnderTest0.add(4206, 611);
    int i12 = classUnderTest0.add(261, 3834);
    int i15 = classUnderTest0.add(7993, 9581);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 173);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 917);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 4817);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4095);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 17574);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test165"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'#', 633);
    int i24 = classUnderTest0.add(1052, 2093);
    int i27 = classUnderTest0.add(5086, 1563);
    int i30 = classUnderTest0.add(3828, 1282);
    int i33 = classUnderTest0.add(36911, 18148);
    
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
    org.junit.Assert.assertTrue(i24 == 3145);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 6649);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5110);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 55059);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test166"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(150, 300);
    int i27 = classUnderTest0.add(786, 1401);
    int i30 = classUnderTest0.add(214, 736);
    int i33 = classUnderTest0.add(1729, 2120);
    int i36 = classUnderTest0.add(41957, 5004);
    
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
    org.junit.Assert.assertTrue(i27 == 2187);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 950);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 3849);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 46961);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test167"); }


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
    int i30 = classUnderTest0.add(215, 2695);
    int i33 = classUnderTest0.add(1134, 11305);
    
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
    org.junit.Assert.assertTrue(i30 == 2910);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 12439);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test168"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(3030, (int)(byte)1);
    int i21 = classUnderTest0.add(98, 236);
    int i24 = classUnderTest0.add(0, 6345);
    
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
    org.junit.Assert.assertTrue(i18 == 3031);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 334);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6345);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test169"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add(513, 280);
    int i18 = classUnderTest0.add(20222, 13232);
    int i21 = classUnderTest0.add(6953, 14810);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 793);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 33454);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 21763);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test170"); }


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
    int i33 = classUnderTest0.add(892, 5223);
    int i36 = classUnderTest0.add(1777, 270);
    int i39 = classUnderTest0.add(3432, 19973);
    
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
    org.junit.Assert.assertTrue(i33 == 6115);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2047);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 23405);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test171"); }


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
    int i30 = classUnderTest0.add(5462, 1274);
    int i33 = classUnderTest0.add(10132, 33886);
    
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
    org.junit.Assert.assertTrue(i30 == 6736);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 44018);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test172"); }


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
    int i30 = classUnderTest0.add(3399, 12013);
    int i33 = classUnderTest0.add(21536, 11518);
    
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
    org.junit.Assert.assertTrue(i30 == 15412);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 33054);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test173"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(770, 1170);
    int i18 = classUnderTest0.add(2120, 996);
    int i21 = classUnderTest0.add(2180, 154);
    int i24 = classUnderTest0.add(154, 97);
    int i27 = classUnderTest0.add(448, 2797);
    int i30 = classUnderTest0.add(215, 242);
    
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
    org.junit.Assert.assertTrue(i27 == 3245);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 457);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test174"); }


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
    int i30 = classUnderTest0.add(0, 4792);
    int i33 = classUnderTest0.add(27736, 820);
    
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
    org.junit.Assert.assertTrue(i30 == 4792);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 28556);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test175"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add((int)(short)0, 118);
    int i15 = classUnderTest0.add(95, (int)(short)10);
    int i18 = classUnderTest0.add((-1), 270);
    int i21 = classUnderTest0.add(2858, 2554);
    int i24 = classUnderTest0.add(11816, 28675);
    int i27 = classUnderTest0.add(11566, 6597);
    
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
    org.junit.Assert.assertTrue(i18 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5412);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 40491);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 18163);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test176"); }


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
    int i33 = classUnderTest0.add(11874, 238);
    
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
    org.junit.Assert.assertTrue(i33 == 12112);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test177"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(52, 95);
    int i21 = classUnderTest0.add(6525, 10720);
    int i24 = classUnderTest0.add(4453, 29654);
    int i27 = classUnderTest0.add(3009, 13063);
    
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
    org.junit.Assert.assertTrue(i21 == 17245);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 34107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 16072);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test178"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(6074, 4283);
    int i24 = classUnderTest0.add(6222, 22922);
    
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
    org.junit.Assert.assertTrue(i21 == 10357);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 29144);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test179"); }


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
    int i33 = classUnderTest0.add(9446, 280);
    int i36 = classUnderTest0.add(10875, 1104);
    int i39 = classUnderTest0.add(8316, 4480);
    int i42 = classUnderTest0.add(13480, 154);
    
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
    org.junit.Assert.assertTrue(i33 == 9726);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 11979);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 12796);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 13634);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test180"); }


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
    int i36 = classUnderTest0.add(280, 17245);
    int i39 = classUnderTest0.add(6906, 4910);
    int i42 = classUnderTest0.add(2219, 4770);
    
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
    org.junit.Assert.assertTrue(i36 == 17525);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 11816);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 6989);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test181"); }


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
    int i30 = classUnderTest0.add(135, 1163);
    int i33 = classUnderTest0.add(600, 1060);
    int i36 = classUnderTest0.add(2623, 747);
    
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
    org.junit.Assert.assertTrue(i30 == 1298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1660);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 3370);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test182"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(2343, 625);
    int i18 = classUnderTest0.add(5697, 4741);
    int i21 = classUnderTest0.add(0, 2101);
    int i24 = classUnderTest0.add(10681, 234);
    int i27 = classUnderTest0.add(9, 4018);
    int i30 = classUnderTest0.add(1363, 1154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 565);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2968);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10438);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 10915);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4027);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2517);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test183"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(323, 703);
    int i15 = classUnderTest0.add(1314, 10488);
    int i18 = classUnderTest0.add(1315, 3150);
    int i21 = classUnderTest0.add(1350, 19644);
    int i24 = classUnderTest0.add(52323, 2802);
    int i27 = classUnderTest0.add(8668, 599);
    
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
    org.junit.Assert.assertTrue(i21 == 20994);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 55125);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 9267);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test184"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(20, 153);
    int i6 = classUnderTest0.add(0, 917);
    int i9 = classUnderTest0.add(227, 236);
    int i12 = classUnderTest0.add(34, 2272);
    int i15 = classUnderTest0.add(6641, 6920);
    int i18 = classUnderTest0.add(0, 7561);
    int i21 = classUnderTest0.add(7849, 7104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 173);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 917);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 463);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2306);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 13561);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 7561);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 14953);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test185"); }


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
    int i30 = classUnderTest0.add(2695, 1834);
    int i33 = classUnderTest0.add(3413, 8184);
    int i36 = classUnderTest0.add(754, 27255);
    int i39 = classUnderTest0.add(2663, 17574);
    
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
    org.junit.Assert.assertTrue(i30 == 4529);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 11597);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 28009);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 20237);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test186"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(197, 151);
    int i18 = classUnderTest0.add(5268, 9265);
    int i21 = classUnderTest0.add(1767, 5848);
    
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
    org.junit.Assert.assertTrue(i18 == 14533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 7615);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test187"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(512, 97);
    int i21 = classUnderTest0.add(105, 298);
    int i24 = classUnderTest0.add(3009, 53);
    int i27 = classUnderTest0.add(1539, 1929);
    int i30 = classUnderTest0.add(2719, 0);
    int i33 = classUnderTest0.add(14294, 10408);
    
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
    org.junit.Assert.assertTrue(i27 == 3468);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2719);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 24702);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test188"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(2343, 625);
    int i18 = classUnderTest0.add(331, 892);
    int i21 = classUnderTest0.add(4465, 5058);
    int i24 = classUnderTest0.add(69474, 9117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 565);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2968);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1223);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 9523);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 78591);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test189"); }


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
    int i30 = classUnderTest0.add(13561, 3993);
    int i33 = classUnderTest0.add(3162, 10438);
    
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
    org.junit.Assert.assertTrue(i30 == 17554);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 13600);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test190"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)0, (int)'4');
    int i18 = classUnderTest0.add(52, 796);
    int i21 = classUnderTest0.add(1163, 197);
    int i24 = classUnderTest0.add(1905, 97);
    int i27 = classUnderTest0.add(665, 10214);
    
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
    org.junit.Assert.assertTrue(i24 == 2002);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 10879);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test191"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(197, 611);
    int i15 = classUnderTest0.add(2076, 6020);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 8096);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test192"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(952, 139);
    int i24 = classUnderTest0.add(533, 202);
    int i27 = classUnderTest0.add(599, 197);
    int i30 = classUnderTest0.add(706, 4312);
    int i33 = classUnderTest0.add(6368, 0);
    int i36 = classUnderTest0.add(2228, 0);
    int i39 = classUnderTest0.add(3950, 5041);
    
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
    org.junit.Assert.assertTrue(i27 == 796);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5018);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 6368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2228);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 8991);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test193"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(10, 198);
    int i18 = classUnderTest0.add(512, 153);
    int i21 = classUnderTest0.add(1163, 502);
    int i24 = classUnderTest0.add(5319, 6068);
    
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
    org.junit.Assert.assertTrue(i21 == 1665);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 11387);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test194"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add((int)(byte)100, 98);
    int i18 = classUnderTest0.add(792, 1312);
    int i21 = classUnderTest0.add(8280, 772);
    
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
    org.junit.Assert.assertTrue(i21 == 9052);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test195"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(612, (int)' ');
    int i9 = classUnderTest0.add(0, 651);
    int i12 = classUnderTest0.add(1810, 147);
    int i15 = classUnderTest0.add(16589, 4001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 644);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 651);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1957);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 20590);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test196"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(198, 100);
    int i21 = classUnderTest0.add(1037, 0);
    int i24 = classUnderTest0.add(1429, 3116);
    int i27 = classUnderTest0.add(227, 6346);
    int i30 = classUnderTest0.add(138, 28028);
    
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
    org.junit.Assert.assertTrue(i27 == 6573);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 28166);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test197"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(9699, 3100);
    int i21 = classUnderTest0.add(1043, 2676);
    int i24 = classUnderTest0.add(10561, 8110);
    int i27 = classUnderTest0.add(1629, 17847);
    int i30 = classUnderTest0.add(4009, 8824);
    
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
    org.junit.Assert.assertTrue(i18 == 12799);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3719);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 18671);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 19476);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 12833);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test198"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add(154, 325);
    int i21 = classUnderTest0.add(1432, 100);
    int i24 = classUnderTest0.add(0, 11315);
    int i27 = classUnderTest0.add(1602, 30710);
    
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
    org.junit.Assert.assertTrue(i21 == 1532);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 11315);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 32312);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test199"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(305, 552);
    int i15 = classUnderTest0.add(5853, 1985);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 857);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 7838);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test200"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(280, 940);
    int i18 = classUnderTest0.add(2864, 14974);
    
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
    org.junit.Assert.assertTrue(i18 == 17838);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test201"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(2057, 1220);
    int i18 = classUnderTest0.add(105, 145);
    int i21 = classUnderTest0.add(7037, 5535);
    int i24 = classUnderTest0.add(6642, 2966);
    int i27 = classUnderTest0.add(10341, 10474);
    
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
    org.junit.Assert.assertTrue(i21 == 12572);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 9608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 20815);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test202"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(952, 139);
    int i24 = classUnderTest0.add(237, 42);
    int i27 = classUnderTest0.add(7916, 7838);
    
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
    org.junit.Assert.assertTrue(i24 == 279);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 15754);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test203"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(2632, 3287);
    int i18 = classUnderTest0.add((int)(short)10, 1);
    int i21 = classUnderTest0.add(5462, 3784);
    int i24 = classUnderTest0.add(441, 6947);
    int i27 = classUnderTest0.add(1645, 0);
    
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
    org.junit.Assert.assertTrue(i27 == 1645);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test204"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(305, 635);
    int i15 = classUnderTest0.add(4708, 13655);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 940);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 18363);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test205"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add((int)'#', (int)(byte)-1);
    int i21 = classUnderTest0.add(786, 206);
    int i24 = classUnderTest0.add(611, 703);
    int i27 = classUnderTest0.add(2945, 4660);
    int i30 = classUnderTest0.add(8668, 40020);
    
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
    org.junit.Assert.assertTrue(i27 == 7605);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 48688);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test206"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(7284, 3277);
    int i27 = classUnderTest0.add(38703, 9687);
    
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
    org.junit.Assert.assertTrue(i27 == 48390);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test207"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(6386, 2228);
    int i24 = classUnderTest0.add(1011, 10774);
    
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
    org.junit.Assert.assertTrue(i21 == 8614);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 11785);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test208"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(100, 53);
    int i21 = classUnderTest0.add(9611, 17282);
    int i24 = classUnderTest0.add(11124, 1431);
    
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
    org.junit.Assert.assertTrue(i21 == 26893);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 12555);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test209"); }


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
    int i33 = classUnderTest0.add(603, 198);
    int i36 = classUnderTest0.add(0, 2458);
    int i39 = classUnderTest0.add(778, 2017);
    int i42 = classUnderTest0.add(7184, 1032);
    int i45 = classUnderTest0.add(4136, 11979);
    
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
    org.junit.Assert.assertTrue(i33 == 801);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2458);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2795);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 8216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 16115);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test210"); }


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
    int i30 = classUnderTest0.add(0, 8438);
    
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
    org.junit.Assert.assertTrue(i30 == 8438);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test211"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)-1, 197);
    int i18 = classUnderTest0.add(105, 305);
    int i21 = classUnderTest0.add(778, 1401);
    int i24 = classUnderTest0.add(808, 10720);
    int i27 = classUnderTest0.add(0, 1170);
    int i30 = classUnderTest0.add(5069, 1467);
    int i33 = classUnderTest0.add(1083, 6115);
    
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
    org.junit.Assert.assertTrue(i18 == 410);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2179);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 11528);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 6536);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 7198);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test212"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(512, 97);
    int i21 = classUnderTest0.add(318, 3310);
    int i24 = classUnderTest0.add(3821, 4060);
    int i27 = classUnderTest0.add(1586, 9742);
    int i30 = classUnderTest0.add(2025, 7300);
    
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
    org.junit.Assert.assertTrue(i27 == 11328);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 9325);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test213"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(2476, 3017);
    int i24 = classUnderTest0.add(4248, 1791);
    int i27 = classUnderTest0.add(7487, 1089);
    int i30 = classUnderTest0.add(2876, 1912);
    
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
    org.junit.Assert.assertTrue(i21 == 5493);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6039);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 8576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4788);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test214"); }


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
    int i30 = classUnderTest0.add(1784, 7981);
    
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
    org.junit.Assert.assertTrue(i30 == 9765);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test215"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(53, 42);
    int i24 = classUnderTest0.add((int)(byte)10, 635);
    int i27 = classUnderTest0.add(2074, 1298);
    int i30 = classUnderTest0.add(4384, 1561);
    int i33 = classUnderTest0.add(153, 974);
    int i36 = classUnderTest0.add(643, 1220);
    int i39 = classUnderTest0.add(28556, 3988);
    
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
    org.junit.Assert.assertTrue(i24 == 645);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3372);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5945);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1863);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 32544);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test216"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(368, 118);
    int i18 = classUnderTest0.add(4155, 549);
    int i21 = classUnderTest0.add(4629, 8508);
    int i24 = classUnderTest0.add(3890, 798);
    
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
    org.junit.Assert.assertTrue(i24 == 4688);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test217"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(198, 100);
    int i21 = classUnderTest0.add(1037, 0);
    int i24 = classUnderTest0.add(3102, 1443);
    
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

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test218"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(703, 1260);
    int i18 = classUnderTest0.add(3421, 1660);
    int i21 = classUnderTest0.add(9324, 1314);
    int i24 = classUnderTest0.add(6867, 9699);
    int i27 = classUnderTest0.add(1916, 8508);
    
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
    org.junit.Assert.assertTrue(i27 == 10424);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test219"); }


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
    int i33 = classUnderTest0.add(18595, 23533);
    
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
    org.junit.Assert.assertTrue(i33 == 42128);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test220"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(770, 1170);
    int i18 = classUnderTest0.add(2120, 996);
    int i21 = classUnderTest0.add(2180, 154);
    int i24 = classUnderTest0.add(154, 97);
    int i27 = classUnderTest0.add(448, 2797);
    int i30 = classUnderTest0.add(3525, 7985);
    int i33 = classUnderTest0.add(8247, 21697);
    
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
    org.junit.Assert.assertTrue(i27 == 3245);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11510);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 29944);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test221"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(703, 1260);
    int i18 = classUnderTest0.add(3421, 1660);
    int i21 = classUnderTest0.add(9324, 1314);
    int i24 = classUnderTest0.add(0, 7653);
    int i27 = classUnderTest0.add(2267, 32);
    
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
    org.junit.Assert.assertTrue(i24 == 7653);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2299);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test222"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add((int)(short)10, 97);
    int i21 = classUnderTest0.add(469, 668);
    int i24 = classUnderTest0.add(6278, 1518);
    int i27 = classUnderTest0.add(1178, 2590);
    int i30 = classUnderTest0.add(13655, 15793);
    
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
    org.junit.Assert.assertTrue(i24 == 7796);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3768);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 29448);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test223"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(479, 135);
    int i21 = classUnderTest0.add(17874, 8149);
    int i24 = classUnderTest0.add(2334, 4969);
    
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
    org.junit.Assert.assertTrue(i21 == 26023);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 7303);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test224"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(2057, 1220);
    int i18 = classUnderTest0.add(105, 145);
    int i21 = classUnderTest0.add(968, 1335);
    int i24 = classUnderTest0.add(756, 486);
    int i27 = classUnderTest0.add(24596, 2793);
    
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
    org.junit.Assert.assertTrue(i21 == 2303);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1242);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 27389);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test225"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(298, 0);
    int i24 = classUnderTest0.add(97, 4789);
    int i27 = classUnderTest0.add(1291, 19520);
    int i30 = classUnderTest0.add(3468, 2543);
    
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
    org.junit.Assert.assertTrue(i24 == 4886);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 20811);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 6011);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test226"); }


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
    int i39 = classUnderTest0.add(10417, 10488);
    
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
    org.junit.Assert.assertTrue(i39 == 20905);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test227"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add(1077, 1103);
    int i21 = classUnderTest0.add(233, 35);
    int i24 = classUnderTest0.add(100, 102);
    
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
    org.junit.Assert.assertTrue(i18 == 2180);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 268);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 202);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test228"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(94, (int)(short)1);
    int i18 = classUnderTest0.add(145, 1795);
    int i21 = classUnderTest0.add(11669, 1327);
    
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
    org.junit.Assert.assertTrue(i21 == 12996);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test229"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(151, 0);
    int i21 = classUnderTest0.add(517, 1791);
    int i24 = classUnderTest0.add(0, 1429);
    int i27 = classUnderTest0.add(3269, 227);
    int i30 = classUnderTest0.add(835, 102);
    int i33 = classUnderTest0.add(27339, 700);
    int i36 = classUnderTest0.add(9852, 24374);
    
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
    org.junit.Assert.assertTrue(i24 == 1429);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3496);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 937);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 28039);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 34226);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test230"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(10, 217);
    int i24 = classUnderTest0.add(301, 645);
    int i27 = classUnderTest0.add(1249, 913);
    int i30 = classUnderTest0.add(1001, 7796);
    int i33 = classUnderTest0.add(668, 5744);
    int i36 = classUnderTest0.add(7256, 7451);
    
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
    org.junit.Assert.assertTrue(i24 == 946);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2162);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 8797);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 6412);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 14707);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test231"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(2476, 3017);
    int i24 = classUnderTest0.add(23533, 14294);
    
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
    org.junit.Assert.assertTrue(i21 == 5493);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 37827);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test232"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(2290, 793);
    int i18 = classUnderTest0.add(2483, 738);
    int i21 = classUnderTest0.add(94, 32);
    int i24 = classUnderTest0.add(2544, 3423);
    int i27 = classUnderTest0.add(15916, 2232);
    int i30 = classUnderTest0.add(1170, 4283);
    int i33 = classUnderTest0.add(812, 4886);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3083);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3221);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 5967);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 18148);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5453);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 5698);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test233"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(348, (int)(short)10);
    int i21 = classUnderTest0.add(533, 314);
    int i24 = classUnderTest0.add(735, 0);
    int i27 = classUnderTest0.add(51, 10);
    int i30 = classUnderTest0.add(470, 2351);
    int i33 = classUnderTest0.add(6446, 238);
    int i36 = classUnderTest0.add(16487, 279);
    int i39 = classUnderTest0.add(29621, 2227);
    int i42 = classUnderTest0.add(10446, 13923);
    
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
    org.junit.Assert.assertTrue(i24 == 735);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2821);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 6684);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 16766);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 31848);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 24369);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test234"); }


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
    int i36 = classUnderTest0.add(107, 4569);
    int i39 = classUnderTest0.add(734, 26404);
    
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
    org.junit.Assert.assertTrue(i36 == 4676);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 27138);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test235"); }


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
    int i30 = classUnderTest0.add(261, 675);
    int i33 = classUnderTest0.add(6074, 2120);
    
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
    org.junit.Assert.assertTrue(i30 == 936);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 8194);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test236"); }


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
    int i33 = classUnderTest0.add(0, 7478);
    int i36 = classUnderTest0.add(1504, 11105);
    int i39 = classUnderTest0.add(11617, 1674);
    
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
    org.junit.Assert.assertTrue(i33 == 7478);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 12609);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 13291);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test237"); }


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
    int i30 = classUnderTest0.add(98, 913);
    int i33 = classUnderTest0.add(18296, 318);
    int i36 = classUnderTest0.add(22668, 0);
    
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
    org.junit.Assert.assertTrue(i30 == 1011);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 18614);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 22668);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test238"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add((int)(byte)100, 98);
    int i18 = classUnderTest0.add(206, 97);
    int i21 = classUnderTest0.add(343, 564);
    int i24 = classUnderTest0.add(1068, 267);
    int i27 = classUnderTest0.add(9794, 25725);
    
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
    org.junit.Assert.assertTrue(i24 == 1335);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 35519);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test239"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(512, 97);
    int i21 = classUnderTest0.add(318, 3310);
    int i24 = classUnderTest0.add(15905, 6492);
    int i27 = classUnderTest0.add(4268, 26404);
    
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
    org.junit.Assert.assertTrue(i24 == 22397);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 30672);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test240"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(703, 609);
    int i18 = classUnderTest0.add(9, (int)'a');
    int i21 = classUnderTest0.add(0, 1761);
    int i24 = classUnderTest0.add(5407, 0);
    int i27 = classUnderTest0.add(2539, 15769);
    
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
    org.junit.Assert.assertTrue(i21 == 1761);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 5407);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 18308);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test241"); }


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
    int i30 = classUnderTest0.add(4769, 1887);
    
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
    org.junit.Assert.assertTrue(i30 == 6656);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test242"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(153, (int)(byte)1);
    int i18 = classUnderTest0.add(118, (int)(byte)-1);
    int i21 = classUnderTest0.add(950, 227);
    
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
    org.junit.Assert.assertTrue(i21 == 1177);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test243"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add(16428, 4461);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 20889);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test244"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(533, 100);
    int i15 = classUnderTest0.add(4024, 10488);
    int i18 = classUnderTest0.add(12556, 22857);
    int i21 = classUnderTest0.add(4969, 21962);
    int i24 = classUnderTest0.add(48390, 2847);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 633);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 14512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 35413);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 26931);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 51237);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test245"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(20, 153);
    int i6 = classUnderTest0.add(786, 695);
    int i9 = classUnderTest0.add(3277, 0);
    int i12 = classUnderTest0.add(241, 753);
    int i15 = classUnderTest0.add(2228, 303);
    int i18 = classUnderTest0.add(1291, 1532);
    int i21 = classUnderTest0.add(16723, 2197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 173);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1481);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3277);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 994);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2531);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2823);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 18920);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test246"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add((int)' ', 205);
    int i18 = classUnderTest0.add(1037, 237);
    int i21 = classUnderTest0.add(734, 2074);
    int i24 = classUnderTest0.add(14974, 5713);
    int i27 = classUnderTest0.add(4733, 2164);
    
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
    org.junit.Assert.assertTrue(i18 == 1274);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 20687);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 6897);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test247"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(10, 217);
    int i24 = classUnderTest0.add(301, 645);
    int i27 = classUnderTest0.add(1249, 913);
    int i30 = classUnderTest0.add(1572, 11314);
    
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
    org.junit.Assert.assertTrue(i24 == 946);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2162);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 12886);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test248"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(503, 217);
    int i24 = classUnderTest0.add(100, 635);
    int i27 = classUnderTest0.add(9565, 441);
    
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
    org.junit.Assert.assertTrue(i24 == 735);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 10006);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test249"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(100, 53);
    int i21 = classUnderTest0.add(611, 100);
    int i24 = classUnderTest0.add(11, 502);
    int i27 = classUnderTest0.add(17847, 6398);
    
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
    org.junit.Assert.assertTrue(i24 == 513);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 24245);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test250"); }


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
    int i36 = classUnderTest0.add(10914, 2311);
    int i39 = classUnderTest0.add(5518, 1863);
    
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
    org.junit.Assert.assertTrue(i36 == 13225);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 7381);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test251"); }


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
    int i30 = classUnderTest0.add(11924, 21962);
    int i33 = classUnderTest0.add(200, 2408);
    int i36 = classUnderTest0.add(4531, 22595);
    
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
    org.junit.Assert.assertTrue(i30 == 33886);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 27126);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test252"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(1481, 6080);
    int i12 = classUnderTest0.add(10560, 280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 7561);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10840);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test253"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add((int)(short)10, 97);
    int i21 = classUnderTest0.add(51, 848);
    int i24 = classUnderTest0.add(1996, 3017);
    
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
    org.junit.Assert.assertTrue(i24 == 5013);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test254"); }


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
    int i30 = classUnderTest0.add(9317, 5330);
    
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
    org.junit.Assert.assertTrue(i30 == 14647);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test255"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(533, 100);
    int i15 = classUnderTest0.add(11146, 36);
    int i18 = classUnderTest0.add(18724, 3399);
    
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
    org.junit.Assert.assertTrue(i18 == 22123);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test256"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(243, 368);
    int i24 = classUnderTest0.add(147, (int)' ');
    int i27 = classUnderTest0.add(11752, 1103);
    
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
    org.junit.Assert.assertTrue(i27 == 12855);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test257"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(2476, 3017);
    int i24 = classUnderTest0.add(4248, 1791);
    int i27 = classUnderTest0.add(18464, 4674);
    
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
    org.junit.Assert.assertTrue(i21 == 5493);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6039);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 23138);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test258"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add((int)'4', 643);
    int i18 = classUnderTest0.add(0, 1091);
    int i21 = classUnderTest0.add(135, 227);
    int i24 = classUnderTest0.add(470, 4817);
    int i27 = classUnderTest0.add(2717, 7875);
    int i30 = classUnderTest0.add(0, 3139);
    
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
    org.junit.Assert.assertTrue(i27 == 10592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3139);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test259"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(2343, 625);
    int i18 = classUnderTest0.add(5493, 5697);
    int i21 = classUnderTest0.add(6779, 6222);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 565);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2968);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11190);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 13001);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test260"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(512, 97);
    int i21 = classUnderTest0.add(105, 298);
    int i24 = classUnderTest0.add(3009, 53);
    int i27 = classUnderTest0.add(1539, 1929);
    int i30 = classUnderTest0.add(2719, 0);
    int i33 = classUnderTest0.add(54062, 0);
    
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
    org.junit.Assert.assertTrue(i27 == 3468);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2719);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 54062);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test261"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)0, 52);
    int i15 = classUnderTest0.add(227, 98);
    int i18 = classUnderTest0.add(7429, 11146);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 325);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 18575);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test262"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(2288, 905);
    int i21 = classUnderTest0.add(11518, 29023);
    
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
    org.junit.Assert.assertTrue(i18 == 3193);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 40541);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test263"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(703, 1260);
    int i18 = classUnderTest0.add(1511, 2034);
    int i21 = classUnderTest0.add(107, 8443);
    
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
    org.junit.Assert.assertTrue(i18 == 3545);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 8550);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test264"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(1554, 208);
    int i15 = classUnderTest0.add(2343, 0);
    int i18 = classUnderTest0.add(3280, 7204);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1762);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2343);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10484);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test265"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(35, (int)(byte)-1);
    int i24 = classUnderTest0.add(847, 2162);
    int i27 = classUnderTest0.add(10932, 3277);
    int i30 = classUnderTest0.add(4941, 19684);
    
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
    org.junit.Assert.assertTrue(i27 == 14209);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 24625);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test266"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(107, 0);
    int i24 = classUnderTest0.add(4632, 433);
    
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
    org.junit.Assert.assertTrue(i21 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 5065);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test267"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(5726, 7886);
    int i24 = classUnderTest0.add(0, 18411);
    
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
    org.junit.Assert.assertTrue(i21 == 13612);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 18411);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test268"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(14490, 2555);
    
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
    org.junit.Assert.assertTrue(i21 == 17045);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test269"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(147, 564);
    int i21 = classUnderTest0.add(0, 298);
    int i24 = classUnderTest0.add(1942, (int)(short)-1);
    int i27 = classUnderTest0.add(14656, 4755);
    int i30 = classUnderTest0.add(8046, 12884);
    
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
    org.junit.Assert.assertTrue(i24 == 1941);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 19411);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 20930);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test270"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(52, 95);
    int i21 = classUnderTest0.add(334, 1578);
    int i24 = classUnderTest0.add(6102, 5851);
    int i27 = classUnderTest0.add(0, 1770);
    
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
    org.junit.Assert.assertTrue(i21 == 1912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 11953);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1770);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test271"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add((int)(short)0, 118);
    int i15 = classUnderTest0.add(173, 781);
    int i18 = classUnderTest0.add(1676, 7465);
    int i21 = classUnderTest0.add(5531, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 118);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 954);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 9141);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5531);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test272"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add(3587, 9480);
    int i21 = classUnderTest0.add(8600, 1609);
    int i24 = classUnderTest0.add(3730, 552);
    
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
    org.junit.Assert.assertTrue(i18 == 13067);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10209);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4282);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test273"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add((int)(byte)100, 98);
    int i18 = classUnderTest0.add(206, 97);
    int i21 = classUnderTest0.add(2381, 899);
    int i24 = classUnderTest0.add(13923, 8668);
    
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
    org.junit.Assert.assertTrue(i24 == 22591);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test274"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(4257, 217);
    int i24 = classUnderTest0.add(8100, 5081);
    int i27 = classUnderTest0.add(5357, 36133);
    
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
    org.junit.Assert.assertTrue(i24 == 13181);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 41490);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test275"); }


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
    int i33 = classUnderTest0.add(7014, 18510);
    
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
    org.junit.Assert.assertTrue(i33 == 25524);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test276"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(byte)1, 448);
    int i21 = classUnderTest0.add(1109, 2719);
    int i24 = classUnderTest0.add(11218, 968);
    int i27 = classUnderTest0.add(1660, 22508);
    
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
    org.junit.Assert.assertTrue(i21 == 3828);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 12186);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 24168);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test277"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(2476, 3017);
    int i24 = classUnderTest0.add(4248, 1791);
    int i27 = classUnderTest0.add(7487, 1089);
    int i30 = classUnderTest0.add(2308, 7678);
    
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
    org.junit.Assert.assertTrue(i21 == 5493);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6039);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 8576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 9986);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test278"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add((int)(byte)-1, (int)(short)1);
    int i21 = classUnderTest0.add(403, 2108);
    int i24 = classUnderTest0.add(1554, 1827);
    
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
    org.junit.Assert.assertTrue(i21 == 2511);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3381);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test279"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add(154, 325);
    int i21 = classUnderTest0.add(13404, 3299);
    
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
    org.junit.Assert.assertTrue(i21 == 16703);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test280"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(151, 0);
    int i21 = classUnderTest0.add(517, 1791);
    int i24 = classUnderTest0.add(0, 1429);
    int i27 = classUnderTest0.add(3269, 227);
    int i30 = classUnderTest0.add(835, 102);
    int i33 = classUnderTest0.add(27339, 700);
    int i36 = classUnderTest0.add(1259, 12381);
    
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
    org.junit.Assert.assertTrue(i24 == 1429);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3496);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 937);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 28039);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 13640);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test281"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(772, 368);
    int i21 = classUnderTest0.add(97, 323);
    int i24 = classUnderTest0.add(720, 695);
    int i27 = classUnderTest0.add(820, 3221);
    int i30 = classUnderTest0.add(1156, 22922);
    
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
    org.junit.Assert.assertTrue(i24 == 1415);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4041);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 24078);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test282"); }


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
    int i33 = classUnderTest0.add(835, 8406);
    int i36 = classUnderTest0.add(14563, 6258);
    
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
    org.junit.Assert.assertTrue(i33 == 9241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 20821);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test283"); }


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
    int i30 = classUnderTest0.add(5919, 12533);
    
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
    org.junit.Assert.assertTrue(i30 == 18452);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test284"); }


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
    int i39 = classUnderTest0.add(451, 6552);
    int i42 = classUnderTest0.add(5545, 3277);
    int i45 = classUnderTest0.add(5161, 3280);
    
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
    org.junit.Assert.assertTrue(i39 == 7003);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 8822);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 8441);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test285"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add((int)(short)0, 118);
    int i15 = classUnderTest0.add(95, (int)(short)10);
    int i18 = classUnderTest0.add(3983, 36);
    int i21 = classUnderTest0.add(197, 173);
    int i24 = classUnderTest0.add(2257, 2057);
    int i27 = classUnderTest0.add(0, 899);
    
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
    org.junit.Assert.assertTrue(i21 == 370);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4314);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 899);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test286"); }


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
    int i42 = classUnderTest0.add(6102, 3628);
    int i45 = classUnderTest0.add(1329, 1417);
    int i48 = classUnderTest0.add(343, 19742);
    
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
    org.junit.Assert.assertTrue(i42 == 9730);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 2746);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 20085);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test287"); }


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
    int i30 = classUnderTest0.add(1001, 600);
    
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
    org.junit.Assert.assertTrue(i30 == 1601);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test288"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add((int)' ', 106);
    int i18 = classUnderTest0.add(0, 145);
    int i21 = classUnderTest0.add(8589, 1929);
    
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
    org.junit.Assert.assertTrue(i21 == 10518);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test289"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(153, (int)(byte)1);
    int i18 = classUnderTest0.add(1037, 198);
    int i21 = classUnderTest0.add(1476, 117);
    int i24 = classUnderTest0.add(30122, 12290);
    
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
    org.junit.Assert.assertTrue(i18 == 1235);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1593);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 42412);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test290"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(2290, 793);
    int i18 = classUnderTest0.add(2483, 738);
    int i21 = classUnderTest0.add(268, 1156);
    int i24 = classUnderTest0.add(3055, 398);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3083);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3221);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1424);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3453);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test291"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(34, 309);
    int i21 = classUnderTest0.add(512, 248);
    int i24 = classUnderTest0.add(2717, 0);
    int i27 = classUnderTest0.add(3963, (int)'#');
    int i30 = classUnderTest0.add(5077, 7204);
    int i33 = classUnderTest0.add(3245, 2769);
    
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
    org.junit.Assert.assertTrue(i24 == 2717);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3998);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 12281);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 6014);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test292"); }


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
    int i39 = classUnderTest0.add(5585, 17991);
    
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
    org.junit.Assert.assertTrue(i39 == 23576);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test293"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add(1312, 301);
    int i21 = classUnderTest0.add(4206, 210);
    int i24 = classUnderTest0.add(3195, 3267);
    int i27 = classUnderTest0.add(3525, 912);
    int i30 = classUnderTest0.add(1948, 6812);
    int i33 = classUnderTest0.add(5044, 11579);
    
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
    org.junit.Assert.assertTrue(i18 == 1613);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4416);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6462);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4437);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 8760);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 16623);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test294"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add(154, 325);
    int i21 = classUnderTest0.add(808, 237);
    int i24 = classUnderTest0.add(1942, (int)(short)1);
    
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
    org.junit.Assert.assertTrue(i24 == 1943);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test295"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(100, 433);
    int i24 = classUnderTest0.add(9325, 666);
    
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
    org.junit.Assert.assertTrue(i24 == 9991);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test296"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(197, 611);
    int i15 = classUnderTest0.add(205, 898);
    int i18 = classUnderTest0.add((int)'#', 633);
    int i21 = classUnderTest0.add(8508, 5223);
    
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
    org.junit.Assert.assertTrue(i21 == 13731);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test297"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add((int)(short)0, 118);
    int i15 = classUnderTest0.add(95, (int)(short)10);
    int i18 = classUnderTest0.add((-1), 270);
    int i21 = classUnderTest0.add(5211, 0);
    int i24 = classUnderTest0.add(1083, 17407);
    
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
    org.junit.Assert.assertTrue(i18 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5211);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 18490);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test298"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(byte)1, 208);
    int i21 = classUnderTest0.add(808, 269);
    int i24 = classUnderTest0.add(1360, 2695);
    int i27 = classUnderTest0.add(15434, 12398);
    int i30 = classUnderTest0.add(2424, 16387);
    
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
    org.junit.Assert.assertTrue(i24 == 4055);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 27832);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 18811);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test299"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(52, 645);
    int i24 = classUnderTest0.add(1453, 2702);
    int i27 = classUnderTest0.add(3139, 279);
    int i30 = classUnderTest0.add(1043, 1990);
    
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
    org.junit.Assert.assertTrue(i27 == 3418);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3033);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test300"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(35, (int)(short)0);
    int i9 = classUnderTest0.add(1609, 154);
    int i12 = classUnderTest0.add(1140, 3652);
    int i15 = classUnderTest0.add(10421, 2438);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1763);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4792);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 12859);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test301"); }


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
    int i33 = classUnderTest0.add(2983, 1401);
    int i36 = classUnderTest0.add(1298, 605);
    int i39 = classUnderTest0.add(3432, 0);
    
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
    org.junit.Assert.assertTrue(i33 == 4384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1903);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 3432);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test302"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(612, (int)' ');
    int i9 = classUnderTest0.add(1142, 100);
    int i12 = classUnderTest0.add(551, 2718);
    int i15 = classUnderTest0.add(1431, 4660);
    int i18 = classUnderTest0.add(0, 11314);
    int i21 = classUnderTest0.add(9748, 3221);
    int i24 = classUnderTest0.add(2005, 2737);
    int i27 = classUnderTest0.add(14879, 16930);
    
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
    org.junit.Assert.assertTrue(i18 == 11314);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 12969);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4742);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 31809);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test303"); }


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
    int i42 = classUnderTest0.add(332, 0);
    int i45 = classUnderTest0.add(565, 1140);
    int i48 = classUnderTest0.add(7735, 3062);
    
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
    org.junit.Assert.assertTrue(i42 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1705);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 10797);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test304"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add(1312, 301);
    int i21 = classUnderTest0.add(4206, 210);
    int i24 = classUnderTest0.add(3195, 3267);
    int i27 = classUnderTest0.add(3525, 912);
    int i30 = classUnderTest0.add(1948, 6812);
    int i33 = classUnderTest0.add(12186, 1609);
    
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
    org.junit.Assert.assertTrue(i18 == 1613);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4416);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6462);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4437);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 8760);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 13795);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test305"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(2057, 1220);
    int i18 = classUnderTest0.add(105, 145);
    int i21 = classUnderTest0.add(14518, 4767);
    
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
    org.junit.Assert.assertTrue(i21 == 19285);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test306"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(197, 151);
    int i18 = classUnderTest0.add(5268, 9265);
    int i21 = classUnderTest0.add(2876, 26662);
    
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
    org.junit.Assert.assertTrue(i18 == 14533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 29538);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test307"); }


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
    int i36 = classUnderTest0.add(4257, 11752);
    
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
    org.junit.Assert.assertTrue(i36 == 16009);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test308"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(52, 95);
    int i21 = classUnderTest0.add(208, 1142);
    int i24 = classUnderTest0.add(0, 15414);
    int i27 = classUnderTest0.add(643, 12556);
    
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
    org.junit.Assert.assertTrue(i21 == 1350);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 15414);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 13199);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test309"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(305, 552);
    int i15 = classUnderTest0.add(118, 84);
    int i18 = classUnderTest0.add(1110, 343);
    int i21 = classUnderTest0.add(2476, 787);
    int i24 = classUnderTest0.add(4387, 1887);
    
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
    org.junit.Assert.assertTrue(i21 == 3263);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6274);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test310"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(0, 820);
    int i12 = classUnderTest0.add(512, 1060);
    int i15 = classUnderTest0.add(5493, 18051);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 820);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1572);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 23544);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test311"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(1329, 1891);
    int i18 = classUnderTest0.add(4136, 18372);
    int i21 = classUnderTest0.add(2076, 4041);
    
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
    org.junit.Assert.assertTrue(i18 == 22508);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 6117);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test312"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(52, 95);
    int i21 = classUnderTest0.add(208, 1142);
    int i24 = classUnderTest0.add(0, 15414);
    int i27 = classUnderTest0.add(859, 4140);
    
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
    org.junit.Assert.assertTrue(i21 == 1350);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 15414);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4999);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test313"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(197, 611);
    int i15 = classUnderTest0.add(4341, 700);
    int i18 = classUnderTest0.add(0, 14649);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 5041);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 14649);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test314"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add((int)(byte)10, 502);
    int i21 = classUnderTest0.add((int)' ', 3983);
    int i24 = classUnderTest0.add(1423, 1456);
    int i27 = classUnderTest0.add(0, 992);
    int i30 = classUnderTest0.add(1235, 17360);
    int i33 = classUnderTest0.add(1168, 12720);
    
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
    org.junit.Assert.assertTrue(i27 == 992);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 18595);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 13888);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test315"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(2290, 793);
    int i18 = classUnderTest0.add(2483, 738);
    int i21 = classUnderTest0.add(94, 32);
    int i24 = classUnderTest0.add(2544, 3423);
    int i27 = classUnderTest0.add(15916, 2232);
    int i30 = classUnderTest0.add(6899, 15623);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3083);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3221);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 5967);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 18148);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 22522);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test316"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(53, (int)(byte)-1);
    int i18 = classUnderTest0.add(1942, 0);
    int i21 = classUnderTest0.add(4024, 1109);
    int i24 = classUnderTest0.add(52, 1110);
    int i27 = classUnderTest0.add(6091, 2503);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1942);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5133);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1162);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 8594);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test317"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(305, 612);
    int i21 = classUnderTest0.add(3055, 2476);
    
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
    org.junit.Assert.assertTrue(i21 == 5531);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test318"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(10, 198);
    int i18 = classUnderTest0.add(512, 153);
    int i21 = classUnderTest0.add(3453, 1943);
    
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
    org.junit.Assert.assertTrue(i21 == 5396);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test319"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(byte)1, 208);
    int i21 = classUnderTest0.add(5268, 4099);
    
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
    org.junit.Assert.assertTrue(i21 == 9367);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test320"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(35, (int)(short)0);
    int i9 = classUnderTest0.add(1609, 154);
    int i12 = classUnderTest0.add(1140, 3652);
    int i15 = classUnderTest0.add(330, 10262);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1763);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4792);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10592);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test321"); }


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
    int i30 = classUnderTest0.add(147, 2927);
    int i33 = classUnderTest0.add(982, 107);
    int i36 = classUnderTest0.add(4155, 30489);
    
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
    org.junit.Assert.assertTrue(i30 == 3074);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1089);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 34644);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test322"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(798, 633);
    int i24 = classUnderTest0.add(1609, 2005);
    int i27 = classUnderTest0.add(30229, 243);
    
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
    org.junit.Assert.assertTrue(i24 == 3614);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 30472);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test323"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(118, 1052);
    int i21 = classUnderTest0.add((int)(byte)100, 314);
    int i24 = classUnderTest0.add(1037, 198);
    int i27 = classUnderTest0.add(17169, 907);
    
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
    org.junit.Assert.assertTrue(i24 == 1235);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 18076);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test324"); }


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
    int i30 = classUnderTest0.add(1857, 6199);
    int i33 = classUnderTest0.add(12383, 18811);
    
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
    org.junit.Assert.assertTrue(i30 == 8056);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 31194);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test325"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add((int)(byte)10, 502);
    int i21 = classUnderTest0.add(5133, 1235);
    int i24 = classUnderTest0.add(318, 279);
    int i27 = classUnderTest0.add(16930, 18855);
    
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
    org.junit.Assert.assertTrue(i21 == 6368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 597);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 35785);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test326"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(898, 503);
    int i15 = classUnderTest0.add(303, 665);
    int i18 = classUnderTest0.add((int)'4', 35);
    int i21 = classUnderTest0.add(1032, 101);
    int i24 = classUnderTest0.add(34069, 1140);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1401);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 968);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1133);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 35209);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test327"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(52, 95);
    int i21 = classUnderTest0.add(4155, 2344);
    int i24 = classUnderTest0.add(4329, 2544);
    int i27 = classUnderTest0.add(11874, 8053);
    
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
    org.junit.Assert.assertTrue(i21 == 6499);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6873);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 19927);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test328"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(2308, 1314);
    int i24 = classUnderTest0.add(4458, 9433);
    int i27 = classUnderTest0.add(4889, 44790);
    
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
    org.junit.Assert.assertTrue(i24 == 13891);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 49679);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test329"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add(1312, 301);
    int i21 = classUnderTest0.add(4206, 210);
    int i24 = classUnderTest0.add(992, 268);
    int i27 = classUnderTest0.add(11684, 0);
    
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
    org.junit.Assert.assertTrue(i18 == 1613);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4416);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 11684);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test330"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(53, 42);
    int i24 = classUnderTest0.add(936, 1008);
    int i27 = classUnderTest0.add(3059, 2826);
    
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
    org.junit.Assert.assertTrue(i24 == 1944);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5885);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test331"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(98, 0);
    int i18 = classUnderTest0.add(5018, 7808);
    int i21 = classUnderTest0.add(565, 18680);
    int i24 = classUnderTest0.add(11239, 10387);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 12826);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 19245);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 21626);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test332"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add(173, 470);
    int i21 = classUnderTest0.add(348, 711);
    int i24 = classUnderTest0.add(2227, 1298);
    int i27 = classUnderTest0.add(15722, 1335);
    int i30 = classUnderTest0.add(4335, 18811);
    int i33 = classUnderTest0.add(29538, 7610);
    
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
    org.junit.Assert.assertTrue(i24 == 3525);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 17057);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 23146);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 37148);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test333"); }


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
    int i30 = classUnderTest0.add(2532, 4418);
    int i33 = classUnderTest0.add(11030, 3614);
    int i36 = classUnderTest0.add(9081, 7849);
    int i39 = classUnderTest0.add(9794, 1248);
    int i42 = classUnderTest0.add(0, 645);
    
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
    org.junit.Assert.assertTrue(i30 == 6950);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 14644);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 16930);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 11042);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 645);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test334"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(635, 303);
    int i18 = classUnderTest0.add(4019, 760);
    int i21 = classUnderTest0.add(486, 2104);
    int i24 = classUnderTest0.add(3277, 4140);
    int i27 = classUnderTest0.add(138, 450);
    int i30 = classUnderTest0.add(1843, 420);
    int i33 = classUnderTest0.add(18015, 0);
    
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
    org.junit.Assert.assertTrue(i27 == 588);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2263);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 18015);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test335"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add((int)(byte)100, 98);
    int i18 = classUnderTest0.add(792, 1312);
    int i21 = classUnderTest0.add(2074, 906);
    int i24 = classUnderTest0.add(0, 29047);
    int i27 = classUnderTest0.add(8821, 5919);
    int i30 = classUnderTest0.add(8292, 8681);
    
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
    org.junit.Assert.assertTrue(i24 == 29047);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 14740);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 16973);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test336"); }


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
    int i33 = classUnderTest0.add((int)(short)-1, 215);
    int i36 = classUnderTest0.add(1065, 23405);
    
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
    org.junit.Assert.assertTrue(i33 == 214);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 24470);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test337"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add((int)(byte)10, 502);
    int i21 = classUnderTest0.add((int)' ', 3983);
    int i24 = classUnderTest0.add(1423, 1456);
    int i27 = classUnderTest0.add(0, 992);
    int i30 = classUnderTest0.add(4465, 1024);
    int i33 = classUnderTest0.add(1429, 6336);
    
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
    org.junit.Assert.assertTrue(i27 == 992);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5489);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 7765);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test338"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(3030, (int)(byte)1);
    int i21 = classUnderTest0.add(6573, 9241);
    
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
    org.junit.Assert.assertTrue(i18 == 3031);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 15814);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test339"); }


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
    int i36 = classUnderTest0.add(9604, 3509);
    int i39 = classUnderTest0.add(4941, 267);
    int i42 = classUnderTest0.add(1162, 3480);
    
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
    org.junit.Assert.assertTrue(i36 == 13113);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 5208);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 4642);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test340"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add(950, 517);
    int i15 = classUnderTest0.add(398, 6404);
    int i18 = classUnderTest0.add(3983, 1014);
    int i21 = classUnderTest0.add(5352, 5268);
    int i24 = classUnderTest0.add(10489, 1674);
    
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
    org.junit.Assert.assertTrue(i18 == 4997);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10620);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 12163);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test341"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(52, 206);
    int i18 = classUnderTest0.add(195, 968);
    int i21 = classUnderTest0.add(32, 0);
    int i24 = classUnderTest0.add(94, 9096);
    
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
    org.junit.Assert.assertTrue(i18 == 1163);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 9190);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test342"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(209, (int)(byte)100);
    int i21 = classUnderTest0.add(214, 700);
    int i24 = classUnderTest0.add(532, 1154);
    int i27 = classUnderTest0.add(10464, 10000);
    int i30 = classUnderTest0.add(4314, 9324);
    
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
    org.junit.Assert.assertTrue(i27 == 20464);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 13638);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test343"); }


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
    int i36 = classUnderTest0.add(4898, 21778);
    
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
    org.junit.Assert.assertTrue(i36 == 26676);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test344"); }


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
    int i30 = classUnderTest0.add(1223, (int)(short)0);
    int i33 = classUnderTest0.add(857, 405);
    int i36 = classUnderTest0.add(9149, 5868);
    
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
    org.junit.Assert.assertTrue(i30 == 1223);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1262);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 15017);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test345"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add((int)'4', 643);
    int i18 = classUnderTest0.add(0, 1091);
    int i21 = classUnderTest0.add(469, 9631);
    int i24 = classUnderTest0.add(2847, 835);
    
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
    org.junit.Assert.assertTrue(i24 == 3682);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test346"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(52, 206);
    int i18 = classUnderTest0.add(195, 968);
    int i21 = classUnderTest0.add(32, 0);
    int i24 = classUnderTest0.add(5726, 343);
    int i27 = classUnderTest0.add(20889, 711);
    
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
    org.junit.Assert.assertTrue(i18 == 1163);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6069);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 21600);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test347"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(612, (int)' ');
    int i9 = classUnderTest0.add(1142, 100);
    int i12 = classUnderTest0.add(551, 2718);
    int i15 = classUnderTest0.add(1431, 4660);
    int i18 = classUnderTest0.add(1429, 1493);
    int i21 = classUnderTest0.add(6091, 9631);
    int i24 = classUnderTest0.add(0, 1093);
    int i27 = classUnderTest0.add(5492, 14656);
    
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
    org.junit.Assert.assertTrue(i21 == 15722);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1093);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 20148);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test348"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(348, (int)(short)10);
    int i21 = classUnderTest0.add(533, 314);
    int i24 = classUnderTest0.add(735, 0);
    int i27 = classUnderTest0.add(51, 10);
    int i30 = classUnderTest0.add(470, 2351);
    int i33 = classUnderTest0.add(9530, 711);
    int i36 = classUnderTest0.add(448, 4625);
    int i39 = classUnderTest0.add(6392, 5796);
    
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
    org.junit.Assert.assertTrue(i24 == 735);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2821);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 10241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 5073);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 12188);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test349"); }


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
    int i36 = classUnderTest0.add(3998, 14904);
    int i39 = classUnderTest0.add(32368, 20811);
    
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
    org.junit.Assert.assertTrue(i36 == 18902);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 53179);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test350"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(153, (int)(byte)1);
    int i18 = classUnderTest0.add(118, (int)(byte)-1);
    int i21 = classUnderTest0.add(635, 348);
    int i24 = classUnderTest0.add(4291, 403);
    int i27 = classUnderTest0.add(2080, 1576);
    
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
    org.junit.Assert.assertTrue(i24 == 4694);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3656);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test351"); }


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
    int i30 = classUnderTest0.add(10711, 95);
    
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
    org.junit.Assert.assertTrue(i30 == 10806);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test352"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(368, 118);
    int i18 = classUnderTest0.add((int)(short)100, (int)(byte)0);
    int i21 = classUnderTest0.add(410, (int)(byte)0);
    int i24 = classUnderTest0.add(400, 450);
    int i27 = classUnderTest0.add(362, 118);
    int i30 = classUnderTest0.add(793, 3525);
    int i33 = classUnderTest0.add(322, 6059);
    int i36 = classUnderTest0.add(11802, 28675);
    
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
    org.junit.Assert.assertTrue(i24 == 850);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 480);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4318);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 6381);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 40477);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test353"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(0, 820);
    int i12 = classUnderTest0.add(1673, 786);
    int i15 = classUnderTest0.add(1578, 479);
    int i18 = classUnderTest0.add(2402, 20971);
    
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
    org.junit.Assert.assertTrue(i18 == 23373);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test354"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(2476, 3017);
    int i24 = classUnderTest0.add(907, 6571);
    int i27 = classUnderTest0.add(4545, 4625);
    int i30 = classUnderTest0.add(9598, 5473);
    
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
    org.junit.Assert.assertTrue(i21 == 5493);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 7478);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 9170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 15071);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test355"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add((int)'4', 643);
    int i18 = classUnderTest0.add(420, 450);
    int i21 = classUnderTest0.add(8668, 15823);
    int i24 = classUnderTest0.add(808, 643);
    int i27 = classUnderTest0.add(1248, 5531);
    int i30 = classUnderTest0.add(11757, 12381);
    int i33 = classUnderTest0.add(5544, 1810);
    
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
    org.junit.Assert.assertTrue(i21 == 24491);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1451);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 6779);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 24138);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 7354);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test356"); }


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
    int i39 = classUnderTest0.add(19520, 1532);
    int i42 = classUnderTest0.add(26404, 3614);
    
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
    org.junit.Assert.assertTrue(i39 == 21052);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 30018);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test357"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(305, 552);
    int i15 = classUnderTest0.add(118, 84);
    int i18 = classUnderTest0.add(1110, 343);
    int i21 = classUnderTest0.add(42, 7363);
    int i24 = classUnderTest0.add(2563, 2108);
    int i27 = classUnderTest0.add(16255, 7666);
    
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
    org.junit.Assert.assertTrue(i24 == 4671);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 23921);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test358"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)-1, 197);
    int i18 = classUnderTest0.add((int)(byte)0, 549);
    int i21 = classUnderTest0.add(2015, 3597);
    int i24 = classUnderTest0.add(5585, 95);
    
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
    org.junit.Assert.assertTrue(i21 == 5612);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 5680);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test359"); }


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
    int i30 = classUnderTest0.add(7050, 7899);
    
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
    org.junit.Assert.assertTrue(i30 == 14949);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test360"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)0, (int)'4');
    int i18 = classUnderTest0.add(52, 796);
    int i21 = classUnderTest0.add(1163, 197);
    int i24 = classUnderTest0.add(5110, 248);
    int i27 = classUnderTest0.add(0, 3637);
    
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
    org.junit.Assert.assertTrue(i24 == 5358);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3637);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test361"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add((int)(byte)-1, (int)(short)1);
    int i21 = classUnderTest0.add(101, 4545);
    int i24 = classUnderTest0.add(1932, 0);
    int i27 = classUnderTest0.add(28675, 848);
    
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
    org.junit.Assert.assertTrue(i24 == 1932);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 29523);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test362"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(35, (int)(short)0);
    int i9 = classUnderTest0.add(1609, 154);
    int i12 = classUnderTest0.add(4627, 0);
    int i15 = classUnderTest0.add(3251, 532);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1763);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4627);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3783);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test363"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(197, 151);
    int i18 = classUnderTest0.add((int)(short)100, 914);
    int i21 = classUnderTest0.add(100, 2607);
    int i24 = classUnderTest0.add(3963, 982);
    
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
    org.junit.Assert.assertTrue(i21 == 2707);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4945);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test364"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(151, 0);
    int i21 = classUnderTest0.add(697, 138);
    int i24 = classUnderTest0.add(34255, 10390);
    
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
    org.junit.Assert.assertTrue(i24 == 44645);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test365"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add((int)(short)0, 118);
    int i15 = classUnderTest0.add(95, (int)(short)10);
    int i18 = classUnderTest0.add(479, 53);
    int i21 = classUnderTest0.add(915, 2531);
    int i24 = classUnderTest0.add(2808, 4160);
    int i27 = classUnderTest0.add(215, 18051);
    int i30 = classUnderTest0.add(6174, 10693);
    int i33 = classUnderTest0.add(34135, 3442);
    
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
    org.junit.Assert.assertTrue(i18 == 532);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3446);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6968);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 18266);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 16867);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 37577);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test366"); }


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
    int i36 = classUnderTest0.add(1298, 151);
    int i39 = classUnderTest0.add(2427, 0);
    int i42 = classUnderTest0.add(98, 1223);
    int i45 = classUnderTest0.add(2272, 568);
    int i48 = classUnderTest0.add(4060, 2876);
    int i51 = classUnderTest0.add(38703, 2465);
    int i54 = classUnderTest0.add(0, 22621);
    
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
    org.junit.Assert.assertTrue(i36 == 1449);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2427);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1321);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 2840);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 6936);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 41168);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 22621);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test367"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add((int)(short)-1, 151);
    int i21 = classUnderTest0.add((int)(byte)100, (int)(byte)1);
    int i24 = classUnderTest0.add(18471, 2487);
    int i27 = classUnderTest0.add(5069, 4904);
    
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
    org.junit.Assert.assertTrue(i24 == 20958);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 9973);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test368"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(52, 206);
    int i18 = classUnderTest0.add(195, 968);
    int i21 = classUnderTest0.add(1142, 4416);
    
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
    org.junit.Assert.assertTrue(i18 == 1163);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5558);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test369"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add(215, 233);
    int i21 = classUnderTest0.add(3797, 17245);
    
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
    org.junit.Assert.assertTrue(i21 == 21042);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test370"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)0, (int)'4');
    int i18 = classUnderTest0.add(1942, 1077);
    int i21 = classUnderTest0.add(0, 8856);
    int i24 = classUnderTest0.add(469, 10561);
    int i27 = classUnderTest0.add(16566, 6621);
    
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
    org.junit.Assert.assertTrue(i18 == 3019);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 8856);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 11030);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 23187);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test371"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(479, 1312);
    int i24 = classUnderTest0.add(486, 100);
    int i27 = classUnderTest0.add(207, 16761);
    int i30 = classUnderTest0.add(1676, 7050);
    int i33 = classUnderTest0.add(1384, 5430);
    
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
    org.junit.Assert.assertTrue(i27 == 16968);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 8726);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 6814);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test372"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(34, 3116);
    int i15 = classUnderTest0.add(95, 9581);
    int i18 = classUnderTest0.add(3341, 150);
    int i21 = classUnderTest0.add(2025, 13260);
    int i24 = classUnderTest0.add(2831, 4904);
    
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
    org.junit.Assert.assertTrue(i21 == 15285);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 7735);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test373"); }


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
    int i36 = classUnderTest0.add(4733, 9216);
    int i39 = classUnderTest0.add(597, 3245);
    
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
    org.junit.Assert.assertTrue(i36 == 13949);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 3842);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test374"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(118, 1052);
    int i21 = classUnderTest0.add((int)(byte)100, 314);
    int i24 = classUnderTest0.add(1561, 200);
    int i27 = classUnderTest0.add(51, 3019);
    int i30 = classUnderTest0.add(6552, 0);
    int i33 = classUnderTest0.add(5478, 6011);
    int i36 = classUnderTest0.add(8096, 7482);
    
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
    org.junit.Assert.assertTrue(i24 == 1761);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3070);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 6552);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 11489);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 15578);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test375"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(byte)10, 503);
    int i21 = classUnderTest0.add(411, 2465);
    int i24 = classUnderTest0.add(3177, 4792);
    int i27 = classUnderTest0.add(10806, 2608);
    
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
    org.junit.Assert.assertTrue(i18 == 513);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2876);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 7969);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 13414);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test376"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'a', 0);
    int i24 = classUnderTest0.add(2927, 410);
    int i27 = classUnderTest0.add(1052, 3858);
    int i30 = classUnderTest0.add(10846, 18015);
    
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
    org.junit.Assert.assertTrue(i24 == 3337);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4910);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 28861);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test377"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add((int)(byte)10, 502);
    int i21 = classUnderTest0.add((int)' ', 3983);
    int i24 = classUnderTest0.add(1423, 1456);
    int i27 = classUnderTest0.add(0, 992);
    int i30 = classUnderTest0.add(4465, 1024);
    int i33 = classUnderTest0.add(44645, 3941);
    
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
    org.junit.Assert.assertTrue(i27 == 992);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5489);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 48586);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test378"); }


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
    int i33 = classUnderTest0.add(236, 906);
    int i36 = classUnderTest0.add(2308, 36);
    int i39 = classUnderTest0.add(835, 53);
    int i42 = classUnderTest0.add(4767, 3830);
    int i45 = classUnderTest0.add(994, 11218);
    
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
    org.junit.Assert.assertTrue(i33 == 1142);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 8597);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 12212);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test379"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(35, (int)(byte)-1);
    int i24 = classUnderTest0.add(323, 3220);
    int i27 = classUnderTest0.add(8667, 4848);
    
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
    org.junit.Assert.assertTrue(i27 == 13515);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test380"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(952, 139);
    int i24 = classUnderTest0.add(533, 202);
    int i27 = classUnderTest0.add(209, 3993);
    int i30 = classUnderTest0.add(403, 2547);
    int i33 = classUnderTest0.add(0, 0);
    int i36 = classUnderTest0.add(479, 2511);
    int i39 = classUnderTest0.add(479, 3760);
    int i42 = classUnderTest0.add(0, 6717);
    
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
    org.junit.Assert.assertTrue(i27 == 4202);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2950);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2990);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 4239);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 6717);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test381"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(217, 2968);
    int i12 = classUnderTest0.add(12013, 0);
    int i15 = classUnderTest0.add(1178, 3002);
    int i18 = classUnderTest0.add(5211, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3185);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 12013);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 4180);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 5211);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test382"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'a', 0);
    int i24 = classUnderTest0.add(217, 486);
    int i27 = classUnderTest0.add(2517, 4206);
    
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
    org.junit.Assert.assertTrue(i27 == 6723);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test383"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add((int)(byte)100, 98);
    int i18 = classUnderTest0.add(792, 1312);
    int i21 = classUnderTest0.add(3000, 4494);
    
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
    org.junit.Assert.assertTrue(i21 == 7494);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test384"); }


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
    int i30 = classUnderTest0.add(857, 270);
    int i33 = classUnderTest0.add(12609, 9441);
    
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
    org.junit.Assert.assertTrue(i30 == 1127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 22050);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test385"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(53, 512);
    int i24 = classUnderTest0.add(564, 2294);
    int i27 = classUnderTest0.add((int)(short)-1, 0);
    int i30 = classUnderTest0.add(10474, 6129);
    int i33 = classUnderTest0.add(19742, 4772);
    
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
    org.junit.Assert.assertTrue(i27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 16603);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 24514);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test386"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(348, (int)(short)10);
    int i21 = classUnderTest0.add(3630, 0);
    int i24 = classUnderTest0.add(6411, 1327);
    
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
    org.junit.Assert.assertTrue(i21 == 3630);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 7738);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test387"); }


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
    int i30 = classUnderTest0.add(1013, 2458);
    int i33 = classUnderTest0.add(1912, 1399);
    
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
    org.junit.Assert.assertTrue(i30 == 3471);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 3311);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test388"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(100, 53);
    int i21 = classUnderTest0.add(611, 100);
    int i24 = classUnderTest0.add(173, 502);
    int i27 = classUnderTest0.add(2523, 44980);
    
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
    org.junit.Assert.assertTrue(i27 == 47503);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test389"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)0, (int)'4');
    int i18 = classUnderTest0.add((int)(short)-1, 197);
    int i21 = classUnderTest0.add(0, 253);
    
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
    org.junit.Assert.assertTrue(i21 == 253);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test390"); }


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
    int i30 = classUnderTest0.add(1683, 1377);
    int i33 = classUnderTest0.add(2879, 1103);
    
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
    org.junit.Assert.assertTrue(i30 == 3060);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 3982);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test391"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(20, 153);
    int i6 = classUnderTest0.add(4452, 8247);
    int i9 = classUnderTest0.add(1534, 9590);
    int i12 = classUnderTest0.add(13746, 23533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 173);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12699);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11124);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 37279);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test392"); }


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
    int i30 = classUnderTest0.add(2532, 4418);
    int i33 = classUnderTest0.add(11030, 3614);
    int i36 = classUnderTest0.add(9081, 7849);
    int i39 = classUnderTest0.add(9794, 1248);
    int i42 = classUnderTest0.add(16505, 24313);
    int i45 = classUnderTest0.add(21251, 4324);
    
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
    org.junit.Assert.assertTrue(i30 == 6950);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 14644);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 16930);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 11042);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 40818);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 25575);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test393"); }


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
    int i33 = classUnderTest0.add(23314, 21494);
    
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
    org.junit.Assert.assertTrue(i33 == 44808);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test394"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(217, 2968);
    int i12 = classUnderTest0.add(597, 4601);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3185);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 5198);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test395"); }


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
    int i36 = classUnderTest0.add(0, 4646);
    int i39 = classUnderTest0.add(11800, 19285);
    
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
    org.junit.Assert.assertTrue(i36 == 4646);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 31085);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test396"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(348, 1246);
    int i24 = classUnderTest0.add(2693, 0);
    int i27 = classUnderTest0.add(2294, 217);
    int i30 = classUnderTest0.add(2666, 12840);
    
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
    org.junit.Assert.assertTrue(i27 == 2511);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 15506);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test397"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(612, (int)' ');
    int i9 = classUnderTest0.add(1142, 100);
    int i12 = classUnderTest0.add(551, 2718);
    int i15 = classUnderTest0.add(1431, 4660);
    int i18 = classUnderTest0.add(1429, 1493);
    int i21 = classUnderTest0.add(6091, 9631);
    int i24 = classUnderTest0.add(1932, 11328);
    int i27 = classUnderTest0.add(5739, 7657);
    
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
    org.junit.Assert.assertTrue(i21 == 15722);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 13260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 13396);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test398"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(2308, 1314);
    int i24 = classUnderTest0.add(4458, 9433);
    int i27 = classUnderTest0.add(3334, 0);
    
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
    org.junit.Assert.assertTrue(i24 == 13891);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3334);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test399"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(0, 84);
    int i21 = classUnderTest0.add(9324, 2025);
    int i24 = classUnderTest0.add(9530, 9505);
    int i27 = classUnderTest0.add(950, 2272);
    int i30 = classUnderTest0.add(3111, 15814);
    
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
    org.junit.Assert.assertTrue(i27 == 3222);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 18925);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test400"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(22897, 0);
    int i27 = classUnderTest0.add(747, 4898);
    
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
    org.junit.Assert.assertTrue(i24 == 22897);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5645);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test401"); }


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
    int i30 = classUnderTest0.add(12996, 20199);
    
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
    org.junit.Assert.assertTrue(i30 == 33195);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test402"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add(10, 108);
    int i21 = classUnderTest0.add(720, 52);
    int i24 = classUnderTest0.add(720, 100);
    int i27 = classUnderTest0.add(11011, 4284);
    
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
    org.junit.Assert.assertTrue(i27 == 15295);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test403"); }


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
    int i36 = classUnderTest0.add(1572, 1476);
    
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
    org.junit.Assert.assertTrue(i36 == 3048);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test404"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(2476, 3017);
    int i24 = classUnderTest0.add(4248, 1791);
    int i27 = classUnderTest0.add(7487, 1089);
    int i30 = classUnderTest0.add(7677, 2943);
    
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
    org.junit.Assert.assertTrue(i21 == 5493);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6039);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 8576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 10620);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test405"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add((int)(byte)-1, (int)(short)1);
    int i21 = classUnderTest0.add(972, 5130);
    int i24 = classUnderTest0.add(3299, 8606);
    
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
    org.junit.Assert.assertTrue(i21 == 6102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 11905);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test406"); }


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
    int i42 = classUnderTest0.add(0, 10797);
    
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
    org.junit.Assert.assertTrue(i42 == 10797);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test407"); }


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
    int i30 = classUnderTest0.add(6446, 366);
    int i33 = classUnderTest0.add(400, 25512);
    
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
    org.junit.Assert.assertTrue(i30 == 6812);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 25912);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test408"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(5566, 18680);
    int i21 = classUnderTest0.add(4371, 5227);
    int i24 = classUnderTest0.add(13055, 2707);
    
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
    org.junit.Assert.assertTrue(i18 == 24246);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 9598);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 15762);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test409"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(651, 301);
    int i12 = classUnderTest0.add(4660, 398);
    int i15 = classUnderTest0.add(1891, 217);
    int i18 = classUnderTest0.add(8313, 7812);
    
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
    org.junit.Assert.assertTrue(i18 == 16125);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test410"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(512, 97);
    int i21 = classUnderTest0.add(318, 3310);
    int i24 = classUnderTest0.add(205, 3337);
    int i27 = classUnderTest0.add(4188, 2823);
    int i30 = classUnderTest0.add(23269, 703);
    
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
    org.junit.Assert.assertTrue(i24 == 3542);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 7011);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 23972);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test411"); }


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
    int i30 = classUnderTest0.add(470, 845);
    int i33 = classUnderTest0.add(6336, 11);
    int i36 = classUnderTest0.add(6220, 7363);
    
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
    org.junit.Assert.assertTrue(i30 == 1315);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 6347);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 13583);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test412"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(772, 368);
    int i21 = classUnderTest0.add((int)(byte)-1, (int)(byte)10);
    int i24 = classUnderTest0.add(32611, 1363);
    
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
    org.junit.Assert.assertTrue(i24 == 33974);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test413"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(298, 0);
    int i24 = classUnderTest0.add(6920, 0);
    int i27 = classUnderTest0.add(1134, 3656);
    
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
    org.junit.Assert.assertTrue(i24 == 6920);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4790);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test414"); }


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
    int i30 = classUnderTest0.add(18213, 5723);
    
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
    org.junit.Assert.assertTrue(i30 == 23936);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test415"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(7117, 343);
    int i12 = classUnderTest0.add(4177, 42516);
    int i15 = classUnderTest0.add(1384, 2707);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 7460);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 46693);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 4091);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test416"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(808, 801);
    int i27 = classUnderTest0.add(35, 2702);
    int i30 = classUnderTest0.add(7349, 3841);
    
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
    org.junit.Assert.assertTrue(i27 == 2737);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11190);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test417"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(53, (int)(byte)-1);
    int i18 = classUnderTest0.add(300, 547);
    int i21 = classUnderTest0.add(400, 1677);
    int i24 = classUnderTest0.add(1334, 1747);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 847);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2077);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3081);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test418"); }


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
    int i30 = classUnderTest0.add(53609, 3768);
    
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
    org.junit.Assert.assertTrue(i30 == 57377);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test419"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add((int)(short)-1, 151);
    int i21 = classUnderTest0.add((int)(byte)100, (int)(byte)1);
    int i24 = classUnderTest0.add(18471, 2487);
    int i27 = classUnderTest0.add(24856, 11780);
    
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
    org.junit.Assert.assertTrue(i24 == 20958);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 36636);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test420"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(952, 139);
    int i24 = classUnderTest0.add(533, 202);
    int i27 = classUnderTest0.add(209, 3993);
    int i30 = classUnderTest0.add(403, 2547);
    int i33 = classUnderTest0.add(835, 1364);
    int i36 = classUnderTest0.add(9149, 3334);
    int i39 = classUnderTest0.add(341, 3769);
    int i42 = classUnderTest0.add(32472, 2695);
    
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
    org.junit.Assert.assertTrue(i27 == 4202);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2950);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2199);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 12483);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 4110);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 35167);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test421"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(1003, 681);
    int i6 = classUnderTest0.add(250, 2017);
    int i9 = classUnderTest0.add(368, 1077);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1684);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2267);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1445);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test422"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(205, 298);
    int i12 = classUnderTest0.add(243, 0);
    int i15 = classUnderTest0.add(6711, 15228);
    int i18 = classUnderTest0.add(44790, 2873);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 503);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 21939);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 47663);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test423"); }


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
    int i30 = classUnderTest0.add(362, 645);
    int i33 = classUnderTest0.add(3581, 8662);
    int i36 = classUnderTest0.add(3899, 16072);
    
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
    org.junit.Assert.assertTrue(i30 == 1007);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 12243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 19971);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test424"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(53, 512);
    int i24 = classUnderTest0.add(564, 2294);
    int i27 = classUnderTest0.add(3644, 4338);
    int i30 = classUnderTest0.add(53, 195);
    int i33 = classUnderTest0.add(36, 7652);
    
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
    org.junit.Assert.assertTrue(i27 == 7982);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 248);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 7688);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test425"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(243, 368);
    int i24 = classUnderTest0.add(147, (int)' ');
    int i27 = classUnderTest0.add(816, 5410);
    
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
    org.junit.Assert.assertTrue(i27 == 6226);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test426"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add(10, 108);
    int i21 = classUnderTest0.add(6953, 3821);
    int i24 = classUnderTest0.add(3873, 14209);
    
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
    org.junit.Assert.assertTrue(i21 == 10774);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 18082);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test427"); }


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
    int i39 = classUnderTest0.add(19411, 4788);
    
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
    org.junit.Assert.assertTrue(i39 == 24199);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test428"); }


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
    int i30 = classUnderTest0.add(97, 179);
    int i33 = classUnderTest0.add(4601, 13795);
    int i36 = classUnderTest0.add(24514, 22759);
    
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
    org.junit.Assert.assertTrue(i30 == 276);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 18396);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 47273);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test429"); }


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
    int i36 = classUnderTest0.add(1212, (int)(byte)100);
    int i39 = classUnderTest0.add(21251, 5208);
    int i42 = classUnderTest0.add(17169, 1130);
    
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
    org.junit.Assert.assertTrue(i36 == 1312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 26459);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 18299);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test430"); }


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
    int i33 = classUnderTest0.add(6752, 196);
    int i36 = classUnderTest0.add(1312, 102);
    int i39 = classUnderTest0.add(17374, 0);
    
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
    org.junit.Assert.assertTrue(i33 == 6948);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1414);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 17374);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test431"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add((int)'4', 643);
    int i18 = classUnderTest0.add(420, 450);
    int i21 = classUnderTest0.add(8668, 15823);
    int i24 = classUnderTest0.add(808, 643);
    int i27 = classUnderTest0.add(1248, 5531);
    int i30 = classUnderTest0.add(11757, 12381);
    int i33 = classUnderTest0.add(1007, 10693);
    int i36 = classUnderTest0.add(7963, 4272);
    
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
    org.junit.Assert.assertTrue(i21 == 24491);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1451);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 6779);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 24138);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 11700);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 12235);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test432"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add(950, 517);
    int i15 = classUnderTest0.add(398, 6404);
    int i18 = classUnderTest0.add(4187, 1916);
    int i21 = classUnderTest0.add(10223, 3269);
    
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
    org.junit.Assert.assertTrue(i18 == 6103);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 13492);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test433"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)(byte)10, 197);
    int i24 = classUnderTest0.add(3355, 0);
    int i27 = classUnderTest0.add(19051, 37279);
    
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
    org.junit.Assert.assertTrue(i24 == 3355);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 56330);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test434"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)-1, 197);
    int i18 = classUnderTest0.add(996, 151);
    int i21 = classUnderTest0.add((int)(byte)100, 4527);
    int i24 = classUnderTest0.add(7077, 3652);
    
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
    org.junit.Assert.assertTrue(i21 == 4627);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 10729);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test435"); }


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
    int i30 = classUnderTest0.add((int)(short)10, 200);
    int i33 = classUnderTest0.add(8597, 19732);
    
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
    org.junit.Assert.assertTrue(i30 == 210);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 28329);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test436"); }


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
    int i33 = classUnderTest0.add(1059, 5808);
    int i36 = classUnderTest0.add(21955, 10413);
    int i39 = classUnderTest0.add(19927, 6488);
    
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
    org.junit.Assert.assertTrue(i33 == 6867);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 32368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 26415);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test437"); }


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
    int i30 = classUnderTest0.add((int)(byte)-1, 907);
    int i33 = classUnderTest0.add(1975, 1170);
    int i36 = classUnderTest0.add(1093, 4741);
    int i39 = classUnderTest0.add(1332, 1993);
    int i42 = classUnderTest0.add(5013, 5004);
    
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
    org.junit.Assert.assertTrue(i30 == 906);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 3145);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 5834);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 3325);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 10017);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test438"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(6386, 2228);
    int i24 = classUnderTest0.add(5807, 276);
    int i27 = classUnderTest0.add(0, 14468);
    int i30 = classUnderTest0.add(12474, 61);
    int i33 = classUnderTest0.add(9337, 9433);
    int i36 = classUnderTest0.add(5065, 3222);
    
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
    org.junit.Assert.assertTrue(i21 == 8614);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6083);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 14468);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 12535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 18770);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 8287);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test439"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(197, 611);
    int i15 = classUnderTest0.add(205, 898);
    int i18 = classUnderTest0.add(6059, 45996);
    
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
    org.junit.Assert.assertTrue(i18 == 52055);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test440"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(1291, 3525);
    int i18 = classUnderTest0.add(9433, 2563);
    int i21 = classUnderTest0.add(3993, 33500);
    int i24 = classUnderTest0.add((int)(byte)100, 1153);
    
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
    org.junit.Assert.assertTrue(i18 == 11996);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 37493);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1253);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test441"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add((int)' ', 205);
    int i18 = classUnderTest0.add(847, 2179);
    int i21 = classUnderTest0.add(9804, 1103);
    int i24 = classUnderTest0.add(17554, 10474);
    int i27 = classUnderTest0.add(9158, 2793);
    int i30 = classUnderTest0.add(1170, 3561);
    
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
    org.junit.Assert.assertTrue(i21 == 10907);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 28028);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 11951);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4731);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test442"); }


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
    int i36 = classUnderTest0.add(537, 3100);
    int i39 = classUnderTest0.add(15057, 10484);
    int i42 = classUnderTest0.add(298, 1378);
    
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
    org.junit.Assert.assertTrue(i36 == 3637);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 25541);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1676);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test443"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add(108, (int)'a');
    int i21 = classUnderTest0.add(9727, 600);
    int i24 = classUnderTest0.add(38839, 15285);
    
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
    org.junit.Assert.assertTrue(i18 == 205);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10327);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 54124);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test444"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add(173, 470);
    int i21 = classUnderTest0.add(348, 711);
    int i24 = classUnderTest0.add(2858, 996);
    int i27 = classUnderTest0.add(4943, 4322);
    int i30 = classUnderTest0.add(4529, 733);
    int i33 = classUnderTest0.add(13456, 9852);
    
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
    org.junit.Assert.assertTrue(i24 == 3854);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 9265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5262);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 23308);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test445"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add((int)(byte)10, 502);
    int i21 = classUnderTest0.add(34, 298);
    int i24 = classUnderTest0.add(517, 1834);
    int i27 = classUnderTest0.add(0, 1903);
    int i30 = classUnderTest0.add(733, 23141);
    int i33 = classUnderTest0.add(3280, 2532);
    
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
    org.junit.Assert.assertTrue(i27 == 1903);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 23874);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 5812);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test446"); }


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
    int i33 = classUnderTest0.add(479, 770);
    int i36 = classUnderTest0.add(280, 323);
    int i39 = classUnderTest0.add(3074, (int)(short)1);
    int i42 = classUnderTest0.add(9927, 7928);
    
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
    org.junit.Assert.assertTrue(i33 == 1249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 603);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 3075);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 17855);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test447"); }


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
    int i33 = classUnderTest0.add(21460, 0);
    
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
    org.junit.Assert.assertTrue(i33 == 21460);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test448"); }


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
    int i30 = classUnderTest0.add(3277, 797);
    
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
    org.junit.Assert.assertTrue(i30 == 4074);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test449"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add(270, 10);
    int i21 = classUnderTest0.add(197, 10);
    int i24 = classUnderTest0.add((int)(short)0, 149);
    int i27 = classUnderTest0.add(16703, 754);
    
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
    org.junit.Assert.assertTrue(i27 == 17457);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test450"); }


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
    int i39 = classUnderTest0.add(217, 10421);
    int i42 = classUnderTest0.add(6585, 3890);
    
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
    org.junit.Assert.assertTrue(i39 == 10638);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 10475);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test451"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(512, 97);
    int i21 = classUnderTest0.add(318, 3310);
    int i24 = classUnderTest0.add(205, 3337);
    int i27 = classUnderTest0.add(12381, 279);
    
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
    org.junit.Assert.assertTrue(i24 == 3542);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 12660);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test452"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(10, 198);
    int i18 = classUnderTest0.add(512, 153);
    int i21 = classUnderTest0.add(1163, 502);
    int i24 = classUnderTest0.add(24826, 10489);
    int i27 = classUnderTest0.add(1013, 11835);
    int i30 = classUnderTest0.add(3656, 16255);
    
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
    org.junit.Assert.assertTrue(i21 == 1665);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 35315);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 12848);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 19911);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test453"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(35, (int)(byte)-1);
    int i24 = classUnderTest0.add(847, 2162);
    int i27 = classUnderTest0.add(10932, 3277);
    int i30 = classUnderTest0.add(2290, 0);
    int i33 = classUnderTest0.add(5074, 4769);
    
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
    org.junit.Assert.assertTrue(i27 == 14209);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2290);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 9843);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test454"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add((int)' ', 205);
    int i18 = classUnderTest0.add(1037, 237);
    int i21 = classUnderTest0.add(2330, 205);
    int i24 = classUnderTest0.add(13031, 23972);
    
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
    org.junit.Assert.assertTrue(i18 == 1274);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 37003);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test455"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(198, 100);
    int i21 = classUnderTest0.add(1037, 0);
    int i24 = classUnderTest0.add(1429, 3116);
    int i27 = classUnderTest0.add(1481, 1130);
    
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
    org.junit.Assert.assertTrue(i27 == 2611);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test456"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(368, 118);
    int i18 = classUnderTest0.add((int)(short)100, (int)(byte)0);
    int i21 = classUnderTest0.add(410, (int)(byte)0);
    int i24 = classUnderTest0.add(898, 42);
    int i27 = classUnderTest0.add(8132, 1449);
    int i30 = classUnderTest0.add(6862, 2299);
    
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
    org.junit.Assert.assertTrue(i24 == 940);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 9581);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 9161);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test457"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(512, 97);
    int i21 = classUnderTest0.add(105, 298);
    int i24 = classUnderTest0.add(3009, 53);
    int i27 = classUnderTest0.add(3468, 16731);
    int i30 = classUnderTest0.add(1613, 5807);
    
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
    org.junit.Assert.assertTrue(i27 == 20199);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 7420);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test458"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(233, 665);
    int i15 = classUnderTest0.add(844, 1449);
    int i18 = classUnderTest0.add(26931, 3859);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2293);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 30790);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test459"); }


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
    int i33 = classUnderTest0.add(603, 198);
    int i36 = classUnderTest0.add(331, 1963);
    int i39 = classUnderTest0.add(0, 1223);
    int i42 = classUnderTest0.add(14810, 16968);
    int i45 = classUnderTest0.add(14518, 52);
    
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
    org.junit.Assert.assertTrue(i33 == 801);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2294);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1223);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 31778);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 14570);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test460"); }


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
    int i33 = classUnderTest0.add(9446, 280);
    int i36 = classUnderTest0.add(0, 6199);
    int i39 = classUnderTest0.add(952, 1163);
    
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
    org.junit.Assert.assertTrue(i33 == 9726);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 6199);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2115);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test461"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(772, 368);
    int i21 = classUnderTest0.add((int)(byte)-1, (int)(byte)10);
    int i24 = classUnderTest0.add(3150, 502);
    int i27 = classUnderTest0.add(1024, 2563);
    int i30 = classUnderTest0.add(356, 3966);
    int i33 = classUnderTest0.add(6702, 2864);
    int i36 = classUnderTest0.add(6185, 15722);
    
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
    org.junit.Assert.assertTrue(i27 == 3587);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4322);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 9566);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 21907);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test462"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(913, 605);
    int i24 = classUnderTest0.add(605, 5713);
    int i27 = classUnderTest0.add(1943, 7657);
    
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
    org.junit.Assert.assertTrue(i21 == 1518);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6318);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 9600);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test463"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(0, 84);
    int i21 = classUnderTest0.add(9324, 2025);
    int i24 = classUnderTest0.add(9530, 9505);
    int i27 = classUnderTest0.add(950, 2272);
    int i30 = classUnderTest0.add(2180, 1329);
    int i33 = classUnderTest0.add(6395, 4586);
    int i36 = classUnderTest0.add(1847, 6736);
    int i39 = classUnderTest0.add(6318, 2010);
    
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
    org.junit.Assert.assertTrue(i27 == 3222);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3509);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 10981);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 8583);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 8328);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test464"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(197, 611);
    int i15 = classUnderTest0.add(205, 898);
    int i18 = classUnderTest0.add((int)'#', 633);
    int i21 = classUnderTest0.add(8662, 11800);
    int i24 = classUnderTest0.add(7363, 1511);
    int i27 = classUnderTest0.add(11172, 2151);
    
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
    org.junit.Assert.assertTrue(i21 == 20462);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 8874);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 13323);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test465"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(217, 2968);
    int i12 = classUnderTest0.add(1054, 1506);
    int i15 = classUnderTest0.add(6551, 23533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3185);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2560);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 30084);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test466"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(770, 1170);
    int i18 = classUnderTest0.add(2120, 996);
    int i21 = classUnderTest0.add(2180, 154);
    int i24 = classUnderTest0.add(154, 97);
    int i27 = classUnderTest0.add(3145, 6192);
    int i30 = classUnderTest0.add(5569, 797);
    int i33 = classUnderTest0.add(2794, 10100);
    
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
    org.junit.Assert.assertTrue(i27 == 9337);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 6366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 12894);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test467"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(996, 300);
    int i15 = classUnderTest0.add(915, 2344);
    int i18 = classUnderTest0.add(3651, 0);
    int i21 = classUnderTest0.add(13040, 1003);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1296);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3259);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3651);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 14043);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test468"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(913, 605);
    int i24 = classUnderTest0.add(879, 1368);
    int i27 = classUnderTest0.add(7548, 13714);
    
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
    org.junit.Assert.assertTrue(i21 == 1518);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2247);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 21262);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test469"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add((int)(byte)10, 502);
    int i21 = classUnderTest0.add((int)' ', 3983);
    int i24 = classUnderTest0.add(1554, (int)' ');
    
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
    org.junit.Assert.assertTrue(i24 == 1586);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test470"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(53, 42);
    int i24 = classUnderTest0.add((int)(byte)10, 635);
    int i27 = classUnderTest0.add(2074, 1298);
    int i30 = classUnderTest0.add(4384, 1561);
    int i33 = classUnderTest0.add((int)(short)1, 6333);
    int i36 = classUnderTest0.add(16620, 2155);
    
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
    org.junit.Assert.assertTrue(i24 == 645);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3372);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5945);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 6334);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 18775);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test471"); }


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
    int i42 = classUnderTest0.add(1449, 2424);
    int i45 = classUnderTest0.add(703, 26459);
    
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
    org.junit.Assert.assertTrue(i42 == 3873);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 27162);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test472"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(6074, 4283);
    int i24 = classUnderTest0.add(15434, 29546);
    int i27 = classUnderTest0.add(5178, 0);
    int i30 = classUnderTest0.add(1920, 2402);
    int i33 = classUnderTest0.add(27235, 2197);
    
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
    org.junit.Assert.assertTrue(i21 == 10357);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 44980);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4322);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 29432);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test473"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add(1312, 301);
    int i21 = classUnderTest0.add(4206, 210);
    int i24 = classUnderTest0.add(19429, 17482);
    int i27 = classUnderTest0.add(9742, 8096);
    
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
    org.junit.Assert.assertTrue(i18 == 1613);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4416);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 36911);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 17838);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test474"); }


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
    int i39 = classUnderTest0.add(1925, 2000);
    int i42 = classUnderTest0.add(6324, 0);
    int i45 = classUnderTest0.add(11715, 25213);
    
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
    org.junit.Assert.assertTrue(i39 == 3925);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 6324);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 36928);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test475"); }


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
    int i39 = classUnderTest0.add(847, 1246);
    int i42 = classUnderTest0.add(2879, 14200);
    int i45 = classUnderTest0.add(798, 5161);
    
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
    org.junit.Assert.assertTrue(i39 == 2093);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 17079);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 5959);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test476"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)-1, 197);
    int i18 = classUnderTest0.add(105, 305);
    int i21 = classUnderTest0.add(1424, 3899);
    int i24 = classUnderTest0.add(0, 5492);
    int i27 = classUnderTest0.add(7539, 362);
    int i30 = classUnderTest0.add(3988, 6950);
    
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
    org.junit.Assert.assertTrue(i18 == 410);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5323);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 5492);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 7901);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 10938);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test477"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add(215, 233);
    int i21 = classUnderTest0.add(3622, 4694);
    int i24 = classUnderTest0.add(21697, 703);
    int i27 = classUnderTest0.add(1717, 0);
    int i30 = classUnderTest0.add(5358, 24369);
    
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
    org.junit.Assert.assertTrue(i21 == 8316);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 22400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1717);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 29727);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test478"); }


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
    int i30 = classUnderTest0.add(1857, 362);
    int i33 = classUnderTest0.add(0, 15762);
    
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
    org.junit.Assert.assertTrue(i30 == 2219);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 15762);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test479"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)0, 52);
    int i15 = classUnderTest0.add(5604, 1553);
    int i18 = classUnderTest0.add(857, 19411);
    int i21 = classUnderTest0.add(1571, 2159);
    int i24 = classUnderTest0.add(5642, 8096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 7157);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 20268);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3730);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 13738);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test480"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(5726, 7886);
    int i24 = classUnderTest0.add(1360, 12840);
    
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
    org.junit.Assert.assertTrue(i21 == 13612);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 14200);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test481"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(1163, 366);
    int i15 = classUnderTest0.add(0, 1891);
    int i18 = classUnderTest0.add(366, 44018);
    int i21 = classUnderTest0.add(10157, 5697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1529);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1891);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 44384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 15854);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test482"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(512, 97);
    int i21 = classUnderTest0.add(105, 298);
    int i24 = classUnderTest0.add(3009, 53);
    int i27 = classUnderTest0.add(28483, 4002);
    int i30 = classUnderTest0.add(23510, 3858);
    
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
    org.junit.Assert.assertTrue(i27 == 32485);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 27368);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test483"); }


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
    int i33 = classUnderTest0.add(603, 198);
    int i36 = classUnderTest0.add(3372, 2150);
    int i39 = classUnderTest0.add((int)' ', 311);
    int i42 = classUnderTest0.add(305, 236);
    int i45 = classUnderTest0.add(8665, 12555);
    
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
    org.junit.Assert.assertTrue(i33 == 801);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 5522);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 343);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 541);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 21220);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test484"); }


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
    int i30 = classUnderTest0.add(414, 4371);
    int i33 = classUnderTest0.add(1733, 3372);
    int i36 = classUnderTest0.add(6840, 3269);
    int i39 = classUnderTest0.add(19456, 20811);
    
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
    org.junit.Assert.assertTrue(i30 == 4785);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 5105);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 10109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 40267);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test485"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add((int)(byte)1, 786);
    int i21 = classUnderTest0.add(549, 1594);
    int i24 = classUnderTest0.add(3983, (int)(short)10);
    int i27 = classUnderTest0.add(5073, 0);
    
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
    org.junit.Assert.assertTrue(i27 == 5073);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test486"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(7050, 6074);
    int i24 = classUnderTest0.add(107, 2267);
    int i27 = classUnderTest0.add(18411, 9433);
    
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
    org.junit.Assert.assertTrue(i21 == 13124);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2374);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 27844);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test487"); }


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
    int i30 = classUnderTest0.add(7050, 2531);
    int i33 = classUnderTest0.add(14984, 859);
    
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
    org.junit.Assert.assertTrue(i30 == 9581);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 15843);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test488"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(898, 503);
    int i15 = classUnderTest0.add(720, 348);
    int i18 = classUnderTest0.add(34, 0);
    int i21 = classUnderTest0.add(4188, 4416);
    
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
    org.junit.Assert.assertTrue(i18 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 8604);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test489"); }


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
    int i33 = classUnderTest0.add(675, 1054);
    int i36 = classUnderTest0.add(5159, 4371);
    int i39 = classUnderTest0.add(1785, 16941);
    
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
    org.junit.Assert.assertTrue(i33 == 1729);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 9530);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 18726);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test490"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(770, 1170);
    int i18 = classUnderTest0.add(2120, 996);
    int i21 = classUnderTest0.add(2180, 154);
    int i24 = classUnderTest0.add(154, 97);
    int i27 = classUnderTest0.add(448, 2797);
    int i30 = classUnderTest0.add(0, 17457);
    
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
    org.junit.Assert.assertTrue(i27 == 3245);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 17457);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test491"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add((int)(short)10, 97);
    int i21 = classUnderTest0.add(347, 4324);
    int i24 = classUnderTest0.add(19411, 233);
    int i27 = classUnderTest0.add(7561, 12796);
    int i30 = classUnderTest0.add(10774, 28439);
    int i33 = classUnderTest0.add(21372, 470);
    
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
    org.junit.Assert.assertTrue(i24 == 19644);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 20357);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 39213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 21842);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test492"); }


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
    int i30 = classUnderTest0.add(1103, 1553);
    
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
    org.junit.Assert.assertTrue(i30 == 2656);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test493"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(503, 217);
    int i24 = classUnderTest0.add(983, 914);
    int i27 = classUnderTest0.add(135, 118);
    int i30 = classUnderTest0.add(8056, 0);
    
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
    org.junit.Assert.assertTrue(i27 == 253);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 8056);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test494"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add((int)(short)10, 97);
    int i21 = classUnderTest0.add(469, 668);
    int i24 = classUnderTest0.add(6278, 1518);
    int i27 = classUnderTest0.add(1178, 2590);
    int i30 = classUnderTest0.add(0, 8316);
    
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
    org.junit.Assert.assertTrue(i24 == 7796);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3768);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 8316);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test495"); }


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
    int i30 = classUnderTest0.add(2532, 4418);
    int i33 = classUnderTest0.add(2167, 3185);
    int i36 = classUnderTest0.add(1077, 4418);
    int i39 = classUnderTest0.add(2234, 1039);
    int i42 = classUnderTest0.add(12969, 16703);
    
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
    org.junit.Assert.assertTrue(i30 == 6950);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 5352);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 5495);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 3273);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 29672);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test496"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(1003, 681);
    int i6 = classUnderTest0.add(9921, 4002);
    int i9 = classUnderTest0.add(7204, 69474);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1684);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 13923);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 76678);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test497"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(35, (int)(byte)-1);
    int i24 = classUnderTest0.add(2330, 700);
    int i27 = classUnderTest0.add(4790, 6565);
    
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
    org.junit.Assert.assertTrue(i27 == 11355);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test498"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(2632, 3287);
    int i18 = classUnderTest0.add((int)(short)10, 1);
    int i21 = classUnderTest0.add(480, 398);
    int i24 = classUnderTest0.add(106, 8943);
    
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
    org.junit.Assert.assertTrue(i21 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 9049);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test499"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(35, 206);
    int i27 = classUnderTest0.add(2150, 2408);
    int i30 = classUnderTest0.add(5102, 15855);
    
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
    org.junit.Assert.assertTrue(i27 == 4558);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 20957);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test500"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(35, (int)(byte)-1);
    int i24 = classUnderTest0.add(847, 2162);
    int i27 = classUnderTest0.add(2228, 1212);
    int i30 = classUnderTest0.add(7601, 248);
    int i33 = classUnderTest0.add(0, 8843);
    
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
    org.junit.Assert.assertTrue(i27 == 3440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 7849);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 8843);

  }

}
