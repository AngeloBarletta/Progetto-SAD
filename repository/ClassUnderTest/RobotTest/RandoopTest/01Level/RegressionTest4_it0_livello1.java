
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test001"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(34, 3116);
    int i15 = classUnderTest0.add(335, 2860);
    int i18 = classUnderTest0.add(30710, 23314);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3195);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 54024);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test002"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(565, 348);
    int i24 = classUnderTest0.add(796, 1270);
    int i27 = classUnderTest0.add(1270, 738);
    int i30 = classUnderTest0.add(56134, 1903);
    
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
    org.junit.Assert.assertTrue(i24 == 2066);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2008);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 58037);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test003"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(1506, 279);
    int i18 = classUnderTest0.add(5526, 20438);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1785);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 25964);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test004"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(6386, 2228);
    int i24 = classUnderTest0.add(1563, 1963);
    int i27 = classUnderTest0.add(2259, 3019);
    int i30 = classUnderTest0.add(4627, 4490);
    int i33 = classUnderTest0.add(217, 2945);
    int i36 = classUnderTest0.add(0, 4158);
    int i39 = classUnderTest0.add(9170, 820);
    
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
    org.junit.Assert.assertTrue(i24 == 3526);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5278);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 9117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 3162);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 4158);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 9990);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test005"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(808, 801);
    int i27 = classUnderTest0.add(173, 0);
    
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
    org.junit.Assert.assertTrue(i27 == 173);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test006"); }


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
    int i33 = classUnderTest0.add(2374, 12705);
    int i36 = classUnderTest0.add(5937, 10675);
    
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
    org.junit.Assert.assertTrue(i33 == 15079);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 16612);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test007"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add(270, 10);
    int i21 = classUnderTest0.add(197, 10);
    int i24 = classUnderTest0.add(6346, 4568);
    int i27 = classUnderTest0.add(1957, 1068);
    int i30 = classUnderTest0.add(4910, 3769);
    int i33 = classUnderTest0.add(22305, 2860);
    
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
    org.junit.Assert.assertTrue(i24 == 10914);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3025);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 8679);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 25165);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test008"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)-1, 197);
    int i18 = classUnderTest0.add(105, 305);
    int i21 = classUnderTest0.add(778, 1401);
    int i24 = classUnderTest0.add(450, 3648);
    int i27 = classUnderTest0.add(7363, 3569);
    int i30 = classUnderTest0.add(1432, 0);
    int i33 = classUnderTest0.add(53728, 3481);
    
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
    org.junit.Assert.assertTrue(i24 == 4098);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 10932);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 57209);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test009"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(612, (int)' ');
    int i9 = classUnderTest0.add(1142, 100);
    int i12 = classUnderTest0.add(551, 2718);
    int i15 = classUnderTest0.add(1431, 4660);
    int i18 = classUnderTest0.add(1429, 1493);
    int i21 = classUnderTest0.add(6091, 9631);
    int i24 = classUnderTest0.add(0, 1093);
    int i27 = classUnderTest0.add(643, 1957);
    int i30 = classUnderTest0.add(3030, 3003);
    
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
    org.junit.Assert.assertTrue(i27 == 2600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 6033);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test010"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(118, 1052);
    int i21 = classUnderTest0.add(2927, 3537);
    int i24 = classUnderTest0.add(17429, 2881);
    
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
    org.junit.Assert.assertTrue(i21 == 6464);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 20310);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test011"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add((int)(byte)100, 98);
    int i18 = classUnderTest0.add(206, 97);
    int i21 = classUnderTest0.add(13714, 0);
    
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
    org.junit.Assert.assertTrue(i21 == 13714);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test012"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(1003, 681);
    int i6 = classUnderTest0.add(250, 2017);
    int i9 = classUnderTest0.add(341, 1170);
    int i12 = classUnderTest0.add(9395, 633);
    int i15 = classUnderTest0.add(31843, 3055);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1684);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2267);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1511);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10028);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34898);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test013"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(35, (int)(short)0);
    int i9 = classUnderTest0.add(1609, 154);
    int i12 = classUnderTest0.add(1140, 3652);
    int i15 = classUnderTest0.add(1162, 5196);
    int i18 = classUnderTest0.add(5208, 15999);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1763);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4792);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 6358);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 21207);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test014"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(305, 552);
    int i15 = classUnderTest0.add(118, 84);
    int i18 = classUnderTest0.add(1110, 343);
    int i21 = classUnderTest0.add(512, 300);
    int i24 = classUnderTest0.add(1453, 1110);
    int i27 = classUnderTest0.add(5604, 3280);
    int i30 = classUnderTest0.add(6920, 1246);
    int i33 = classUnderTest0.add(2817, 3766);
    int i36 = classUnderTest0.add(14518, 6812);
    int i39 = classUnderTest0.add(1259, 16133);
    
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
    org.junit.Assert.assertTrue(i27 == 8884);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 8166);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 6583);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 21330);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 17392);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test015"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(118, 1052);
    int i21 = classUnderTest0.add(568, 12533);
    int i24 = classUnderTest0.add(1761, 3569);
    int i27 = classUnderTest0.add(18213, 0);
    int i30 = classUnderTest0.add(16437, 5462);
    int i33 = classUnderTest0.add(2151, 23990);
    
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
    org.junit.Assert.assertTrue(i27 == 18213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 21899);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 26141);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test016"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'a', 0);
    int i24 = classUnderTest0.add(151, 217);
    int i27 = classUnderTest0.add(720, 1137);
    int i30 = classUnderTest0.add(8247, 3525);
    int i33 = classUnderTest0.add(486, 6430);
    int i36 = classUnderTest0.add(2543, 448);
    int i39 = classUnderTest0.add(8178, 8100);
    
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
    org.junit.Assert.assertTrue(i27 == 1857);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11772);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 6916);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2991);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 16278);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test017"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add(270, 10);
    int i21 = classUnderTest0.add(197, 10);
    int i24 = classUnderTest0.add(3222, 2081);
    int i27 = classUnderTest0.add(5632, 7729);
    
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
    org.junit.Assert.assertTrue(i24 == 5303);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 13361);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test018"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(898, 503);
    int i15 = classUnderTest0.add(720, 348);
    int i18 = classUnderTest0.add(248, 301);
    int i21 = classUnderTest0.add(1037, 517);
    int i24 = classUnderTest0.add(5259, 3562);
    int i27 = classUnderTest0.add(19927, 7653);
    
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
    org.junit.Assert.assertTrue(i18 == 549);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1554);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 8821);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 27580);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test019"); }


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
    int i39 = classUnderTest0.add(4019, 305);
    int i42 = classUnderTest0.add(8013, 12290);
    
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
    org.junit.Assert.assertTrue(i39 == 4324);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 20303);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test020"); }


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
    int i33 = classUnderTest0.add(17525, 25830);
    
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
    org.junit.Assert.assertTrue(i33 == 43355);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test021"); }


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
    int i30 = classUnderTest0.add(2873, 9412);
    int i33 = classUnderTest0.add(6085, 3267);
    
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
    org.junit.Assert.assertTrue(i30 == 12285);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 9352);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test022"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add((int)(short)-1, 151);
    int i21 = classUnderTest0.add(7405, 305);
    int i24 = classUnderTest0.add(879, 552);
    int i27 = classUnderTest0.add(18904, 4767);
    
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
    org.junit.Assert.assertTrue(i21 == 7710);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1431);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 23671);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test023"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(20, 153);
    int i6 = classUnderTest0.add(0, 917);
    int i9 = classUnderTest0.add(4206, 611);
    int i12 = classUnderTest0.add(261, 3834);
    int i15 = classUnderTest0.add(5120, 17170);
    int i18 = classUnderTest0.add(7741, 10797);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 173);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 917);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 4817);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4095);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 22290);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 18538);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test024"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(898, 503);
    int i15 = classUnderTest0.add(720, 348);
    int i18 = classUnderTest0.add(1434, 1024);
    int i21 = classUnderTest0.add(28401, 9565);
    
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
    org.junit.Assert.assertTrue(i18 == 2458);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 37966);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test025"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(6386, 2228);
    int i24 = classUnderTest0.add(1563, 1963);
    int i27 = classUnderTest0.add(9081, 35315);
    int i30 = classUnderTest0.add(1431, 14563);
    int i33 = classUnderTest0.add(2711, 26681);
    
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
    org.junit.Assert.assertTrue(i24 == 3526);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 44396);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 15994);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 29392);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test026"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(byte)1, 448);
    int i21 = classUnderTest0.add(309, 1687);
    int i24 = classUnderTest0.add(609, 11924);
    int i27 = classUnderTest0.add(3841, 1677);
    int i30 = classUnderTest0.add(33950, 4889);
    int i33 = classUnderTest0.add(4474, 15222);
    
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
    org.junit.Assert.assertTrue(i24 == 12533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5518);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 38839);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 19696);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test027"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(368, 118);
    int i18 = classUnderTest0.add(4155, 549);
    int i21 = classUnderTest0.add(4629, 8508);
    int i24 = classUnderTest0.add(5120, 0);
    int i27 = classUnderTest0.add(2442, 20085);
    int i30 = classUnderTest0.add(7666, 11355);
    
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
    org.junit.Assert.assertTrue(i24 == 5120);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 22527);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 19021);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test028"); }


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
    int i33 = classUnderTest0.add(10720, 1248);
    int i36 = classUnderTest0.add(850, 347);
    int i39 = classUnderTest0.add(12969, 1541);
    int i42 = classUnderTest0.add(30791, 19870);
    
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
    org.junit.Assert.assertTrue(i33 == 11968);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 14510);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 50661);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test029"); }


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
    int i39 = classUnderTest0.add(2257, 1920);
    int i42 = classUnderTest0.add(21955, 12997);
    int i45 = classUnderTest0.add(2950, 1142);
    
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
    org.junit.Assert.assertTrue(i39 == 4177);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 34952);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4092);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test030"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add(950, 517);
    int i15 = classUnderTest0.add(398, 6404);
    int i18 = classUnderTest0.add(4187, 1916);
    int i21 = classUnderTest0.add(3347, 7958);
    int i24 = classUnderTest0.add(64248, 15587);
    
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
    org.junit.Assert.assertTrue(i21 == 11305);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 79835);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test031"); }


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
    int i30 = classUnderTest0.add(2227, 772);
    int i33 = classUnderTest0.add(6867, 5077);
    
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
    org.junit.Assert.assertTrue(i30 == 2999);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 11944);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test032"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(269, 233);
    int i21 = classUnderTest0.add(0, 5739);
    int i24 = classUnderTest0.add(17479, 992);
    int i27 = classUnderTest0.add(3777, 14490);
    
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
    org.junit.Assert.assertTrue(i24 == 18471);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 18267);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test033"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(147, 564);
    int i21 = classUnderTest0.add(0, 298);
    int i24 = classUnderTest0.add(0, 736);
    int i27 = classUnderTest0.add(1467, 2588);
    int i30 = classUnderTest0.add(7924, 2034);
    int i33 = classUnderTest0.add(10914, 16405);
    
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
    org.junit.Assert.assertTrue(i24 == 736);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4055);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 9958);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 27319);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test034"); }


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
    int i33 = classUnderTest0.add(6446, 738);
    int i36 = classUnderTest0.add(7824, 8589);
    int i39 = classUnderTest0.add(13461, 6299);
    int i42 = classUnderTest0.add(1660, 4188);
    int i45 = classUnderTest0.add(6285, 0);
    int i48 = classUnderTest0.add(44018, 43625);
    
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
    org.junit.Assert.assertTrue(i33 == 7184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 16413);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 19760);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 5848);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 6285);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 87643);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test035"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(793, 135);
    int i18 = classUnderTest0.add(218, 1077);
    int i21 = classUnderTest0.add(1312, 4838);
    int i24 = classUnderTest0.add(341, 3614);
    int i27 = classUnderTest0.add(7927, 43762);
    
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
    org.junit.Assert.assertTrue(i21 == 6150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3955);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 51689);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test036"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(197, 611);
    int i15 = classUnderTest0.add(205, 898);
    int i18 = classUnderTest0.add(8355, 3017);
    int i21 = classUnderTest0.add(3652, 3888);
    int i24 = classUnderTest0.add(55125, 29538);
    
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
    org.junit.Assert.assertTrue(i18 == 11372);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 7540);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 84663);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test037"); }


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
    int i30 = classUnderTest0.add(583, 3899);
    int i33 = classUnderTest0.add(23138, 0);
    
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
    org.junit.Assert.assertTrue(i30 == 4482);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 23138);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test038"); }


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
    int i36 = classUnderTest0.add(898, 325);
    int i39 = classUnderTest0.add(12556, 1235);
    int i42 = classUnderTest0.add(0, 0);
    
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
    org.junit.Assert.assertTrue(i36 == 1223);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 13791);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test039"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(short)1, 269);
    int i15 = classUnderTest0.add(1925, 551);
    int i18 = classUnderTest0.add(898, 3606);
    int i21 = classUnderTest0.add(2197, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 270);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2476);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4504);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2197);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test040"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(52, 645);
    int i24 = classUnderTest0.add(665, 1052);
    int i27 = classUnderTest0.add(9742, 11528);
    int i30 = classUnderTest0.add(928, 4015);
    int i33 = classUnderTest0.add(5686, 22400);
    int i36 = classUnderTest0.add(0, 6976);
    
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
    org.junit.Assert.assertTrue(i27 == 21270);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4943);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 28086);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 6976);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test041"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(5566, 18680);
    int i21 = classUnderTest0.add(25804, 5208);
    
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
    org.junit.Assert.assertTrue(i21 == 31012);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test042"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add((int)(short)0, 118);
    int i15 = classUnderTest0.add(95, (int)(short)10);
    int i18 = classUnderTest0.add(3983, 36);
    int i21 = classUnderTest0.add(197, 173);
    int i24 = classUnderTest0.add(2486, 1843);
    int i27 = classUnderTest0.add(4060, 4629);
    
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
    org.junit.Assert.assertTrue(i24 == 4329);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 8689);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test043"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(323, 703);
    int i15 = classUnderTest0.add(1314, 10488);
    int i18 = classUnderTest0.add(20617, 0);
    int i21 = classUnderTest0.add(4180, 4418);
    
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
    org.junit.Assert.assertTrue(i18 == 20617);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 8598);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test044"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(243, 368);
    int i24 = classUnderTest0.add(208, 139);
    int i27 = classUnderTest0.add(816, 1906);
    int i30 = classUnderTest0.add(696, 1096);
    int i33 = classUnderTest0.add(3545, 36);
    int i36 = classUnderTest0.add(605, 4027);
    int i39 = classUnderTest0.add(0, 3083);
    
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
    org.junit.Assert.assertTrue(i27 == 2722);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1792);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 3581);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 4632);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 3083);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test045"); }


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
    int i42 = classUnderTest0.add(816, 8883);
    int i45 = classUnderTest0.add(0, 7916);
    int i48 = classUnderTest0.add(1504, 411);
    
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
    org.junit.Assert.assertTrue(i42 == 9699);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 7916);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1915);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test046"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add(154, 325);
    int i21 = classUnderTest0.add(2487, 206);
    int i24 = classUnderTest0.add(2343, 200);
    int i27 = classUnderTest0.add(16865, 8589);
    
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
    org.junit.Assert.assertTrue(i24 == 2543);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 25454);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test047"); }


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
    int i30 = classUnderTest0.add(4214, 3418);
    int i33 = classUnderTest0.add(41168, 5379);
    
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
    org.junit.Assert.assertTrue(i30 == 7632);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 46547);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test048"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(512, 97);
    int i21 = classUnderTest0.add(105, 298);
    int i24 = classUnderTest0.add(2980, 983);
    int i27 = classUnderTest0.add(21371, 9041);
    int i30 = classUnderTest0.add(12570, 8406);
    
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
    org.junit.Assert.assertTrue(i24 == 3963);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 30412);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 20976);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test049"); }


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
    int i30 = classUnderTest0.add(830, 3965);
    
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
    org.junit.Assert.assertTrue(i30 == 4795);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test050"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add((int)' ', 205);
    int i18 = classUnderTest0.add(1037, 237);
    int i21 = classUnderTest0.add(2330, 205);
    int i24 = classUnderTest0.add(1449, 2120);
    int i27 = classUnderTest0.add(6278, 2557);
    int i30 = classUnderTest0.add(7363, 366);
    int i33 = classUnderTest0.add(11584, 5357);
    int i36 = classUnderTest0.add(9751, 16612);
    int i39 = classUnderTest0.add(20043, 7857);
    
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
    org.junit.Assert.assertTrue(i24 == 3569);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 8835);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 7729);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 16941);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 26363);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 27900);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test051"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(10, 217);
    int i24 = classUnderTest0.add(5081, 600);
    int i27 = classUnderTest0.add(4655, 3496);
    
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
    org.junit.Assert.assertTrue(i24 == 5681);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 8151);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test052"); }


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
    int i30 = classUnderTest0.add(18411, 1940);
    
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
    org.junit.Assert.assertTrue(i30 == 20351);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test053"); }


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
    int i39 = classUnderTest0.add(2257, 1920);
    int i42 = classUnderTest0.add(9991, 1518);
    
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
    org.junit.Assert.assertTrue(i39 == 4177);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 11509);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test054"); }


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
    int i30 = classUnderTest0.add(24369, 48418);
    
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
    org.junit.Assert.assertTrue(i30 == 72787);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test055"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add((int)(short)-1, 151);
    int i21 = classUnderTest0.add((int)(byte)100, (int)(byte)1);
    int i24 = classUnderTest0.add(207, 2459);
    int i27 = classUnderTest0.add(18498, 20905);
    
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
    org.junit.Assert.assertTrue(i27 == 39403);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test056"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(150, 300);
    int i27 = classUnderTest0.add(11471, 2180);
    int i30 = classUnderTest0.add(2693, 19051);
    int i33 = classUnderTest0.add(8318, 20291);
    
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
    org.junit.Assert.assertTrue(i27 == 13651);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 21744);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 28609);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test057"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add((int)' ', 205);
    int i18 = classUnderTest0.add(1037, 237);
    int i21 = classUnderTest0.add(2330, 205);
    int i24 = classUnderTest0.add(1449, 2120);
    int i27 = classUnderTest0.add(8597, 27395);
    
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
    org.junit.Assert.assertTrue(i24 == 3569);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 35992);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test058"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(770, 1170);
    int i18 = classUnderTest0.add(2120, 996);
    int i21 = classUnderTest0.add(1296, 2563);
    int i24 = classUnderTest0.add(1327, 3896);
    int i27 = classUnderTest0.add(3357, 24313);
    
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
    org.junit.Assert.assertTrue(i27 == 27670);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test059"); }


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
    int i33 = classUnderTest0.add(4817, 9395);
    int i36 = classUnderTest0.add(1153, 6421);
    int i39 = classUnderTest0.add(41182, 3390);
    
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
    org.junit.Assert.assertTrue(i33 == 14212);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 7574);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 44572);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test060"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add((int)(byte)1, 786);
    int i21 = classUnderTest0.add(2511, 3009);
    int i24 = classUnderTest0.add(787, (int)(byte)1);
    int i27 = classUnderTest0.add(5201, 2945);
    int i30 = classUnderTest0.add(0, 5836);
    
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
    org.junit.Assert.assertTrue(i24 == 788);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 8146);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5836);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test061"); }


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
    int i30 = classUnderTest0.add(3858, 311);
    int i33 = classUnderTest0.add(3150, 1402);
    
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
    org.junit.Assert.assertTrue(i30 == 4169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 4552);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test062"); }


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
    int i33 = classUnderTest0.add(1763, 2572);
    int i36 = classUnderTest0.add(1729, 98);
    int i39 = classUnderTest0.add(8656, 3606);
    
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
    org.junit.Assert.assertTrue(i33 == 4335);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1827);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 12262);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test063"); }


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
    int i36 = classUnderTest0.add(258, 2402);
    int i39 = classUnderTest0.add(2319, 9);
    int i42 = classUnderTest0.add(4479, 1888);
    int i45 = classUnderTest0.add(8216, 17642);
    
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
    org.junit.Assert.assertTrue(i36 == 2660);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2328);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 6367);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 25858);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test064"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(512, 97);
    int i21 = classUnderTest0.add(105, 298);
    int i24 = classUnderTest0.add(2980, 983);
    int i27 = classUnderTest0.add(358, 42);
    int i30 = classUnderTest0.add(6278, 10109);
    int i33 = classUnderTest0.add(23510, 3808);
    int i36 = classUnderTest0.add(4620, 1310);
    int i39 = classUnderTest0.add(9265, 4024);
    
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
    org.junit.Assert.assertTrue(i24 == 3963);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 16387);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 27318);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 5930);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 13289);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test065"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(100, 53);
    int i21 = classUnderTest0.add(46042, 5698);
    
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
    org.junit.Assert.assertTrue(i21 == 51740);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test066"); }


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
    int i33 = classUnderTest0.add(22522, 7283);
    
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
    org.junit.Assert.assertTrue(i33 == 29805);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test067"); }


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
    int i33 = classUnderTest0.add(1134, 798);
    int i36 = classUnderTest0.add(8132, 10952);
    int i39 = classUnderTest0.add(100, 11071);
    
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
    org.junit.Assert.assertTrue(i33 == 1932);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 19084);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 11171);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test068"); }


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
    int i30 = classUnderTest0.add(1563, 33070);
    
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
    org.junit.Assert.assertTrue(i30 == 34633);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test069"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(198, 100);
    int i21 = classUnderTest0.add(1037, 0);
    int i24 = classUnderTest0.add(358, 798);
    int i27 = classUnderTest0.add(5473, 20371);
    
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
    org.junit.Assert.assertTrue(i27 == 25844);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test070"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)(byte)10, 197);
    int i24 = classUnderTest0.add(3355, 0);
    int i27 = classUnderTest0.add(1401, 33054);
    
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
    org.junit.Assert.assertTrue(i27 == 34455);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test071"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(2289, 15228);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 17517);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test072"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(898, 503);
    int i15 = classUnderTest0.add(720, 348);
    int i18 = classUnderTest0.add(305, 480);
    int i21 = classUnderTest0.add(1364, 1990);
    int i24 = classUnderTest0.add(1916, 7050);
    int i27 = classUnderTest0.add(9523, 9751);
    
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
    org.junit.Assert.assertTrue(i24 == 8966);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 19274);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test073"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(305, 552);
    int i15 = classUnderTest0.add(118, 84);
    int i18 = classUnderTest0.add(1110, 343);
    int i21 = classUnderTest0.add(512, 300);
    int i24 = classUnderTest0.add(1453, 1110);
    int i27 = classUnderTest0.add(5604, 3280);
    int i30 = classUnderTest0.add(2257, 2098);
    int i33 = classUnderTest0.add(22180, 2983);
    
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
    org.junit.Assert.assertTrue(i27 == 8884);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4355);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 25163);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test074"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(305, 552);
    int i15 = classUnderTest0.add(118, 84);
    int i18 = classUnderTest0.add(1110, 343);
    int i21 = classUnderTest0.add(512, 300);
    int i24 = classUnderTest0.add(1453, 1110);
    int i27 = classUnderTest0.add(6089, 10674);
    int i30 = classUnderTest0.add(3585, 370);
    
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
    org.junit.Assert.assertTrue(i27 == 16763);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3955);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test075"); }


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
    int i36 = classUnderTest0.add(6089, 238);
    int i39 = classUnderTest0.add(10262, 14951);
    int i42 = classUnderTest0.add(5407, 13667);
    
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
    org.junit.Assert.assertTrue(i36 == 6327);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 25213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 19074);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test076"); }


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
    int i33 = classUnderTest0.add(1572, 153);
    int i36 = classUnderTest0.add(5001, 8508);
    
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
    org.junit.Assert.assertTrue(i33 == 1725);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 13509);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test077"); }


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
    int i42 = classUnderTest0.add(18767, 16210);
    int i45 = classUnderTest0.add(2308, 8096);
    
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
    org.junit.Assert.assertTrue(i42 == 34977);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 10404);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test078"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(368, 118);
    int i18 = classUnderTest0.add(4155, 549);
    int i21 = classUnderTest0.add(4629, 8508);
    int i24 = classUnderTest0.add(3098, 785);
    int i27 = classUnderTest0.add(328, 27678);
    
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
    org.junit.Assert.assertTrue(i24 == 3883);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 28006);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test079"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(35, (int)(short)0);
    int i9 = classUnderTest0.add(1609, 154);
    int i12 = classUnderTest0.add(1140, 3652);
    int i15 = classUnderTest0.add(1162, 5196);
    int i18 = classUnderTest0.add(31348, 4543);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1763);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4792);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 6358);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 35891);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test080"); }


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
    int i39 = classUnderTest0.add(1784, 6398);
    
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
    org.junit.Assert.assertTrue(i39 == 8182);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test081"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(20, 153);
    int i6 = classUnderTest0.add(4452, 8247);
    int i9 = classUnderTest0.add(7198, 19927);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 173);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12699);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 27125);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test082"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(323, 2104);
    int i24 = classUnderTest0.add(6226, 25830);
    
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
    org.junit.Assert.assertTrue(i24 == 32056);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test083"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add((int)(short)-1, 151);
    int i21 = classUnderTest0.add((int)(byte)100, (int)(byte)1);
    int i24 = classUnderTest0.add(1532, 8668);
    
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
    org.junit.Assert.assertTrue(i24 == 10200);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test084"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(8438, 135);
    int i24 = classUnderTest0.add(1578, 3991);
    int i27 = classUnderTest0.add(700, 9523);
    int i30 = classUnderTest0.add(23120, 17282);
    int i33 = classUnderTest0.add(1096, 1449);
    
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
    org.junit.Assert.assertTrue(i21 == 8573);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 5569);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 10223);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 40402);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2545);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test085"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(97, 323);
    int i18 = classUnderTest0.add(117, 857);
    int i21 = classUnderTest0.add(2338, 8053);
    int i24 = classUnderTest0.add(7504, 7117);
    
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
    org.junit.Assert.assertTrue(i24 == 14621);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test086"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(20, 153);
    int i6 = classUnderTest0.add(786, 695);
    int i9 = classUnderTest0.add(3277, 0);
    int i12 = classUnderTest0.add(241, 753);
    int i15 = classUnderTest0.add(2228, 303);
    int i18 = classUnderTest0.add(5807, 1);
    int i21 = classUnderTest0.add(6894, 3263);
    int i24 = classUnderTest0.add(8348, 7408);
    int i27 = classUnderTest0.add(44906, 2446);
    
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
    org.junit.Assert.assertTrue(i18 == 5808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10157);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 15756);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 47352);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test087"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(52, 645);
    int i24 = classUnderTest0.add(665, 1052);
    int i27 = classUnderTest0.add(9742, 11528);
    int i30 = classUnderTest0.add(928, 4015);
    int i33 = classUnderTest0.add(5686, 22400);
    int i36 = classUnderTest0.add(15812, 6404);
    
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
    org.junit.Assert.assertTrue(i27 == 21270);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4943);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 28086);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 22216);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test088"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(2308, 1314);
    int i24 = classUnderTest0.add(3279, 5159);
    int i27 = classUnderTest0.add(6899, 5697);
    int i30 = classUnderTest0.add(1068, 8318);
    int i33 = classUnderTest0.add(6226, 3370);
    
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
    org.junit.Assert.assertTrue(i27 == 12596);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 9386);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 9596);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test089"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(1384, (int)(short)10);
    int i12 = classUnderTest0.add(711, 1629);
    int i15 = classUnderTest0.add(6379, 2224);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1394);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2340);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 8603);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test090"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(151, 0);
    int i21 = classUnderTest0.add((int)(byte)10, 0);
    int i24 = classUnderTest0.add(5559, 3304);
    
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
    org.junit.Assert.assertTrue(i21 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 8863);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test091"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)0, (int)'4');
    int i18 = classUnderTest0.add(52, 796);
    int i21 = classUnderTest0.add(3993, 2343);
    int i24 = classUnderTest0.add(603, 480);
    int i27 = classUnderTest0.add(11722, 8166);
    int i30 = classUnderTest0.add(0, 23573);
    
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
    org.junit.Assert.assertTrue(i27 == 19888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 23573);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test092"); }


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
    int i45 = classUnderTest0.add(12067, 7927);
    int i48 = classUnderTest0.add(7940, 6327);
    int i51 = classUnderTest0.add(3998, 26743);
    int i54 = classUnderTest0.add(6968, 2966);
    
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
    org.junit.Assert.assertTrue(i45 == 19994);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 14267);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 30741);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 9934);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test093"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(5726, 7886);
    int i24 = classUnderTest0.add(7417, 1309);
    int i27 = classUnderTest0.add(1481, 8558);
    int i30 = classUnderTest0.add(2802, 1676);
    
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
    org.junit.Assert.assertTrue(i24 == 8726);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 10039);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4478);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test094"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(94, (int)(short)1);
    int i18 = classUnderTest0.add(0, 0);
    int i21 = classUnderTest0.add(0, 1340);
    int i24 = classUnderTest0.add(1541, 778);
    int i27 = classUnderTest0.add(3195, 13667);
    int i30 = classUnderTest0.add(17132, 847);
    
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
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1340);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2319);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 16862);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 17979);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test095"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(2290, 793);
    int i18 = classUnderTest0.add(2483, 738);
    int i21 = classUnderTest0.add(94, 32);
    int i24 = classUnderTest0.add(2544, 3423);
    int i27 = classUnderTest0.add(8388, 697);
    
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
    org.junit.Assert.assertTrue(i27 == 9085);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test096"); }


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
    int i30 = classUnderTest0.add(13232, 20268);
    int i33 = classUnderTest0.add(7244, 9407);
    int i36 = classUnderTest0.add(8184, 325);
    
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
    org.junit.Assert.assertTrue(i30 == 33500);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 16651);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 8509);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test097"); }


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
    int i33 = classUnderTest0.add(10, 13891);
    int i36 = classUnderTest0.add(4140, 7993);
    
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
    org.junit.Assert.assertTrue(i33 == 13901);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 12133);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test098"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(byte)1, 208);
    int i21 = classUnderTest0.add(215, 108);
    int i24 = classUnderTest0.add(332, 778);
    int i27 = classUnderTest0.add(26743, 19924);
    
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
    org.junit.Assert.assertTrue(i27 == 46667);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test099"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(217, 2968);
    int i12 = classUnderTest0.add(12013, 0);
    int i15 = classUnderTest0.add(202, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3185);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 12013);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 202);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test100"); }


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
    int i36 = classUnderTest0.add(816, 899);
    int i39 = classUnderTest0.add(12660, 1920);
    
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
    org.junit.Assert.assertTrue(i36 == 1715);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 14580);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test101"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(205, 298);
    int i12 = classUnderTest0.add(243, 0);
    int i15 = classUnderTest0.add(6711, 15228);
    int i18 = classUnderTest0.add(1504, 6897);
    int i21 = classUnderTest0.add(2151, 54124);
    
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
    org.junit.Assert.assertTrue(i18 == 8401);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 56275);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test102"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(632, 3137);
    int i15 = classUnderTest0.add(6279, (int)(short)100);
    int i18 = classUnderTest0.add(34427, 398);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3769);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 6379);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 34825);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test103"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(793, 2187);
    int i18 = classUnderTest0.add(3009, 2093);
    int i21 = classUnderTest0.add(11124, 52742);
    
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
    org.junit.Assert.assertTrue(i21 == 63866);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test104"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add(1235, 1767);
    int i21 = classUnderTest0.add(4247, 2098);
    int i24 = classUnderTest0.add(27812, 6920);
    
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
    org.junit.Assert.assertTrue(i21 == 6345);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 34732);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test105"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(short)1, 269);
    int i15 = classUnderTest0.add(100, 298);
    int i18 = classUnderTest0.add(4848, 5028);
    int i21 = classUnderTest0.add(1382, 16300);
    
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
    org.junit.Assert.assertTrue(i18 == 9876);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 17682);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test106"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 97);
    int i15 = classUnderTest0.add(205, 10);
    int i18 = classUnderTest0.add(1, 791);
    int i21 = classUnderTest0.add(8789, 1368);
    int i24 = classUnderTest0.add(10915, 3468);
    
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
    org.junit.Assert.assertTrue(i21 == 10157);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 14383);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test107"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(305, 552);
    int i15 = classUnderTest0.add(118, 84);
    int i18 = classUnderTest0.add(1110, 343);
    int i21 = classUnderTest0.add(512, 300);
    int i24 = classUnderTest0.add(1717, 3828);
    int i27 = classUnderTest0.add(6056, 6499);
    
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
    org.junit.Assert.assertTrue(i24 == 5545);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 12555);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test108"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)'a', 100);
    int i12 = classUnderTest0.add(197, 107);
    int i15 = classUnderTest0.add(2459, 2330);
    int i18 = classUnderTest0.add(2817, 1953);
    int i21 = classUnderTest0.add(303, 8835);
    int i24 = classUnderTest0.add(2557, 1220);
    int i27 = classUnderTest0.add(1235, 835);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 4789);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4770);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 9138);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3777);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2070);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test109"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(703, 1260);
    int i18 = classUnderTest0.add(1511, 2034);
    int i21 = classUnderTest0.add(4383, 6091);
    int i24 = classUnderTest0.add(173, 6552);
    int i27 = classUnderTest0.add(19313, 4635);
    
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
    org.junit.Assert.assertTrue(i24 == 6725);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 23948);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test110"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(517, 269);
    int i27 = classUnderTest0.add(1154, 1940);
    int i30 = classUnderTest0.add(1026, 10209);
    
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
    org.junit.Assert.assertTrue(i27 == 3094);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11235);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test111"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(331, 107);
    int i12 = classUnderTest0.add(200, 280);
    int i15 = classUnderTest0.add(8745, 869);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 438);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 480);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 9614);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test112"); }


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
    int i30 = classUnderTest0.add(2162, 2290);
    int i33 = classUnderTest0.add(11071, 8619);
    int i36 = classUnderTest0.add(26876, 936);
    int i39 = classUnderTest0.add(8332, 835);
    
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
    org.junit.Assert.assertTrue(i30 == 4452);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 19690);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 27812);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 9167);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test113"); }


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
    int i48 = classUnderTest0.add(6796, 1456);
    int i51 = classUnderTest0.add(1156, 23533);
    int i54 = classUnderTest0.add(6649, 4453);
    
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
    org.junit.Assert.assertTrue(i48 == 8252);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 24689);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 11102);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test114"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(298, 0);
    int i24 = classUnderTest0.add(97, 4789);
    int i27 = classUnderTest0.add(6028, 298);
    
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
    org.junit.Assert.assertTrue(i27 == 6326);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test115"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add(513, 280);
    int i18 = classUnderTest0.add(20222, 13232);
    int i21 = classUnderTest0.add(276, 7451);
    
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
    org.junit.Assert.assertTrue(i21 == 7727);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test116"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(31848, 609);
    
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
    org.junit.Assert.assertTrue(i18 == 32457);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test117"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(20, 3279);
    int i27 = classUnderTest0.add(10262, 449);
    int i30 = classUnderTest0.add(11211, 6039);
    
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
    org.junit.Assert.assertTrue(i24 == 3299);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 10711);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 17250);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test118"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(479, 1312);
    int i24 = classUnderTest0.add(486, 100);
    int i27 = classUnderTest0.add(6039, 3628);
    
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
    org.junit.Assert.assertTrue(i27 == 9667);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test119"); }


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
    int i42 = classUnderTest0.add(816, 8883);
    int i45 = classUnderTest0.add(17923, 17235);
    
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
    org.junit.Assert.assertTrue(i42 == 9699);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 35158);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test120"); }


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
    int i36 = classUnderTest0.add(3055, 0);
    int i39 = classUnderTest0.add(2547, 4957);
    int i42 = classUnderTest0.add(7677, 11363);
    
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
    org.junit.Assert.assertTrue(i36 == 3055);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 7504);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 19040);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test121"); }


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
    int i36 = classUnderTest0.add(18724, 0);
    
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
    org.junit.Assert.assertTrue(i36 == 18724);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test122"); }


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
    int i36 = classUnderTest0.add(4632, 9221);
    int i39 = classUnderTest0.add(0, 16166);
    
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
    org.junit.Assert.assertTrue(i36 == 13853);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 16166);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test123"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(770, 1170);
    int i18 = classUnderTest0.add(2120, 996);
    int i21 = classUnderTest0.add(2180, 154);
    int i24 = classUnderTest0.add((int)(short)100, 1453);
    int i27 = classUnderTest0.add(2187, 1567);
    int i30 = classUnderTest0.add(10660, 14400);
    
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
    org.junit.Assert.assertTrue(i27 == 3754);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 25060);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test124"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(348, (int)(short)10);
    int i21 = classUnderTest0.add(4479, 25067);
    int i24 = classUnderTest0.add(9620, 27319);
    
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
    org.junit.Assert.assertTrue(i21 == 29546);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 36939);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test125"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(1891, 51);
    int i27 = classUnderTest0.add(16761, 17374);
    int i30 = classUnderTest0.add(2958, 0);
    
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
    org.junit.Assert.assertTrue(i27 == 34135);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2958);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test126"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(348, 1246);
    int i24 = classUnderTest0.add(2693, 0);
    int i27 = classUnderTest0.add(19035, 18148);
    
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
    org.junit.Assert.assertTrue(i27 == 37183);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test127"); }


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
    int i30 = classUnderTest0.add(3587, 2487);
    int i33 = classUnderTest0.add(5268, 2554);
    int i36 = classUnderTest0.add(820, 612);
    int i39 = classUnderTest0.add(1348, 1363);
    int i42 = classUnderTest0.add(521, 250);
    int i45 = classUnderTest0.add(67762, 5831);
    
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
    org.junit.Assert.assertTrue(i30 == 6074);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 7822);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2711);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 771);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 73593);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test128"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(151, 0);
    int i21 = classUnderTest0.add(0, 635);
    int i24 = classUnderTest0.add(46476, 10475);
    
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
    org.junit.Assert.assertTrue(i21 == 635);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 56951);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test129"); }


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
    int i33 = classUnderTest0.add(13888, 37827);
    
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
    org.junit.Assert.assertTrue(i33 == 51715);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test130"); }


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
    int i30 = classUnderTest0.add(7077, 2005);
    int i33 = classUnderTest0.add(3630, 0);
    int i36 = classUnderTest0.add(36110, 28242);
    int i39 = classUnderTest0.add(16836, 26876);
    
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
    org.junit.Assert.assertTrue(i30 == 9082);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 3630);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 64352);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 43712);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test131"); }


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
    int i33 = classUnderTest0.add(6365, 18775);
    
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
    org.junit.Assert.assertTrue(i33 == 25140);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test132"); }


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
    int i33 = classUnderTest0.add(31843, 42128);
    
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
    org.junit.Assert.assertTrue(i33 == 73971);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test133"); }


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
    int i30 = classUnderTest0.add(0, 6039);
    int i33 = classUnderTest0.add(26404, 11081);
    
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
    org.junit.Assert.assertTrue(i30 == 6039);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 37485);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test134"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add(1312, 301);
    int i21 = classUnderTest0.add(4206, 210);
    int i24 = classUnderTest0.add(3195, 3267);
    int i27 = classUnderTest0.add(3614, 153);
    int i30 = classUnderTest0.add(16756, 13640);
    
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
    org.junit.Assert.assertTrue(i27 == 3767);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 30396);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test135"); }


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
    int i36 = classUnderTest0.add(2330, 39297);
    
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
    org.junit.Assert.assertTrue(i36 == 41627);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test136"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(574, 1534);
    int i24 = classUnderTest0.add(0, 5133);
    int i27 = classUnderTest0.add(23921, 304);
    
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
    org.junit.Assert.assertTrue(i24 == 5133);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 24225);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test137"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(1296, 479);
    int i9 = classUnderTest0.add(1260, 2728);
    int i12 = classUnderTest0.add(410, 323);
    int i15 = classUnderTest0.add(0, 0);
    int i18 = classUnderTest0.add(1660, 950);
    int i21 = classUnderTest0.add(5620, 1242);
    int i24 = classUnderTest0.add(9934, 599);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1775);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3988);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 733);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2610);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 6862);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 10533);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test138"); }


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
    int i39 = classUnderTest0.add(13461, 6059);
    
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
    org.junit.Assert.assertTrue(i39 == 19520);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test139"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(34, 309);
    int i21 = classUnderTest0.add(736, 798);
    int i24 = classUnderTest0.add(2563, 1725);
    int i27 = classUnderTest0.add(13891, 4169);
    
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
    org.junit.Assert.assertTrue(i27 == 18060);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test140"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(byte)1, 448);
    int i21 = classUnderTest0.add(309, 1687);
    int i24 = classUnderTest0.add(8149, 954);
    int i27 = classUnderTest0.add(3347, 2319);
    int i30 = classUnderTest0.add(4997, 1);
    
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
    org.junit.Assert.assertTrue(i24 == 9103);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5666);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4998);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test141"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(512, 97);
    int i21 = classUnderTest0.add(105, 298);
    int i24 = classUnderTest0.add(3009, 53);
    int i27 = classUnderTest0.add(996, 10945);
    int i30 = classUnderTest0.add(6020, 22664);
    int i33 = classUnderTest0.add(18271, 4591);
    int i36 = classUnderTest0.add(12128, 10810);
    
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
    org.junit.Assert.assertTrue(i27 == 11941);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 28684);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 22862);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 22938);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test142"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(20, 153);
    int i6 = classUnderTest0.add(0, 917);
    int i9 = classUnderTest0.add(227, 236);
    int i12 = classUnderTest0.add(23092, 1163);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 173);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 917);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 463);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 24255);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test143"); }


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
    int i39 = classUnderTest0.add(4268, 14580);
    
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
    org.junit.Assert.assertTrue(i39 == 18848);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test144"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'a', 0);
    int i24 = classUnderTest0.add(7483, 21588);
    
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
    org.junit.Assert.assertTrue(i24 == 29071);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test145"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(1003, 681);
    int i6 = classUnderTest0.add(9467, 12285);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1684);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 21752);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test146"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add((int)(byte)-1, (int)(short)1);
    int i21 = classUnderTest0.add(101, 4545);
    int i24 = classUnderTest0.add(1360, 1777);
    int i27 = classUnderTest0.add(10906, 5259);
    
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
    org.junit.Assert.assertTrue(i24 == 3137);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 16165);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test147"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add(108, (int)'a');
    int i21 = classUnderTest0.add(3017, 7981);
    
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
    org.junit.Assert.assertTrue(i21 == 10998);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test148"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add(1993, 0);
    int i21 = classUnderTest0.add(0, 3285);
    int i24 = classUnderTest0.add(6091, 18051);
    
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
    org.junit.Assert.assertTrue(i18 == 1993);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3285);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 24142);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test149"); }


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
    int i39 = classUnderTest0.add(0, 830);
    
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
    org.junit.Assert.assertTrue(i39 == 830);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test150"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(651, 301);
    int i12 = classUnderTest0.add(4660, 398);
    int i15 = classUnderTest0.add(9103, 2887);
    int i18 = classUnderTest0.add(502, 5642);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 952);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 5058);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 11990);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 6144);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test151"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add((int)'4', 643);
    int i18 = classUnderTest0.add(0, 1091);
    int i21 = classUnderTest0.add(1957, 738);
    int i24 = classUnderTest0.add(4568, 1920);
    int i27 = classUnderTest0.add(1777, 2676);
    int i30 = classUnderTest0.add(2002, 3251);
    int i33 = classUnderTest0.add(5642, 26404);
    int i36 = classUnderTest0.add(4504, 21713);
    
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
    org.junit.Assert.assertTrue(i21 == 2695);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6488);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4453);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5253);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 32046);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 26217);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test152"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add((int)(short)0, 118);
    int i15 = classUnderTest0.add(95, (int)(short)10);
    int i18 = classUnderTest0.add(3983, 36);
    int i21 = classUnderTest0.add(197, 173);
    int i24 = classUnderTest0.add(2427, 666);
    int i27 = classUnderTest0.add(1792, 5161);
    int i30 = classUnderTest0.add(8964, 597);
    int i33 = classUnderTest0.add(14949, 26743);
    
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
    org.junit.Assert.assertTrue(i24 == 3093);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 6953);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 9561);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 41692);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test153"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(10, 198);
    int i18 = classUnderTest0.add(512, 153);
    int i21 = classUnderTest0.add(135, 433);
    int i24 = classUnderTest0.add(940, 42);
    int i27 = classUnderTest0.add(565, 7363);
    int i30 = classUnderTest0.add(1916, 1059);
    int i33 = classUnderTest0.add(3245, 8617);
    
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
    org.junit.Assert.assertTrue(i27 == 7928);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2975);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 11862);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test154"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add(215, 233);
    int i21 = classUnderTest0.add(1110, 2873);
    int i24 = classUnderTest0.add(0, 1327);
    
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
    org.junit.Assert.assertTrue(i21 == 3983);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1327);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test155"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'a', 0);
    int i24 = classUnderTest0.add(151, 217);
    int i27 = classUnderTest0.add(720, 1137);
    int i30 = classUnderTest0.add(8247, 3525);
    int i33 = classUnderTest0.add(486, 6430);
    int i36 = classUnderTest0.add(2543, 448);
    int i39 = classUnderTest0.add(0, 13640);
    
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
    org.junit.Assert.assertTrue(i27 == 1857);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11772);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 6916);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2991);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 13640);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test156"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(1296, 479);
    int i9 = classUnderTest0.add(1260, 2728);
    int i12 = classUnderTest0.add(410, 323);
    int i15 = classUnderTest0.add(0, 0);
    int i18 = classUnderTest0.add(1660, 950);
    int i21 = classUnderTest0.add(51715, 12857);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1775);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3988);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 733);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2610);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 64572);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test157"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(10, 198);
    int i18 = classUnderTest0.add(512, 153);
    int i21 = classUnderTest0.add(135, 433);
    int i24 = classUnderTest0.add(517, 5726);
    int i27 = classUnderTest0.add(9598, 14644);
    
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
    org.junit.Assert.assertTrue(i27 == 24242);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test158"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add((int)' ', 205);
    int i18 = classUnderTest0.add(1037, 237);
    int i21 = classUnderTest0.add(734, 2074);
    int i24 = classUnderTest0.add(11920, 11862);
    
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
    org.junit.Assert.assertTrue(i24 == 23782);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test159"); }


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
    int i36 = classUnderTest0.add(67326, 5178);
    
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
    org.junit.Assert.assertTrue(i36 == 72504);

  }

}
