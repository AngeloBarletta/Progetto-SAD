
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test001"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(898, 503);
    int i15 = classUnderTest0.add(720, 348);
    int i18 = classUnderTest0.add(1434, 1024);
    int i21 = classUnderTest0.add(6336, 38454);
    int i24 = classUnderTest0.add(5967, 2869);
    
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
    org.junit.Assert.assertTrue(i21 == 44790);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 8836);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test002"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(898, 503);
    int i15 = classUnderTest0.add(303, 665);
    int i18 = classUnderTest0.add(6393, 961);
    int i21 = classUnderTest0.add(3220, 2306);
    int i24 = classUnderTest0.add(1686, 19051);
    int i27 = classUnderTest0.add(994, 24332);
    
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
    org.junit.Assert.assertTrue(i18 == 7354);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5526);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 20737);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 25326);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test003"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(2074, 106);
    int i15 = classUnderTest0.add(1332, 32);
    int i18 = classUnderTest0.add(8386, 8993);
    int i21 = classUnderTest0.add(745, 15451);
    int i24 = classUnderTest0.add(17847, 2597);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2180);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1364);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 17379);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 16196);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 20444);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test004"); }


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
    int i39 = classUnderTest0.add(16756, 1453);
    
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
    org.junit.Assert.assertTrue(i39 == 18209);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test005"); }


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
    int i30 = classUnderTest0.add(512, 11389);
    
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
    org.junit.Assert.assertTrue(i30 == 11901);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test006"); }


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
    int i36 = classUnderTest0.add(801, 1925);
    int i39 = classUnderTest0.add(5548, 3858);
    
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
    org.junit.Assert.assertTrue(i36 == 2726);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 9406);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test007"); }


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
    int i33 = classUnderTest0.add(102, 1315);
    int i36 = classUnderTest0.add(5993, 4479);
    int i39 = classUnderTest0.add(32323, 3102);
    int i42 = classUnderTest0.add(3256, 11575);
    int i45 = classUnderTest0.add(1316, 7940);
    int i48 = classUnderTest0.add(6950, 51237);
    
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
    org.junit.Assert.assertTrue(i33 == 1417);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 10472);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 35425);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 14831);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 9256);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 58187);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test008"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(94, (int)(short)1);
    int i18 = classUnderTest0.add(145, 1795);
    int i21 = classUnderTest0.add(5493, 314);
    int i24 = classUnderTest0.add(13040, 18051);
    int i27 = classUnderTest0.add(13461, 2351);
    int i30 = classUnderTest0.add(15658, 25524);
    
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
    org.junit.Assert.assertTrue(i21 == 5807);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 31091);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 15812);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 41182);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test009"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(770, 1170);
    int i18 = classUnderTest0.add(2120, 996);
    int i21 = classUnderTest0.add(1296, 2563);
    int i24 = classUnderTest0.add(2980, 1178);
    int i27 = classUnderTest0.add(611, 1972);
    
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
    org.junit.Assert.assertTrue(i27 == 2583);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test010"); }


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
    int i30 = classUnderTest0.add(470, 0);
    
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
    org.junit.Assert.assertTrue(i30 == 470);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test011"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(8438, 135);
    int i24 = classUnderTest0.add(2299, 760);
    int i27 = classUnderTest0.add(16814, 3390);
    
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
    org.junit.Assert.assertTrue(i24 == 3059);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 20204);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test012"); }


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
    int i30 = classUnderTest0.add(11946, 1676);
    
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
    org.junit.Assert.assertTrue(i30 == 13622);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test013"); }


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
    int i33 = classUnderTest0.add(12261, 3491);
    
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
    org.junit.Assert.assertTrue(i33 == 15752);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test014"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(byte)10, 503);
    int i21 = classUnderTest0.add(411, 2465);
    int i24 = classUnderTest0.add(3177, 4792);
    int i27 = classUnderTest0.add(3684, 1360);
    int i30 = classUnderTest0.add(1061, 14167);
    int i33 = classUnderTest0.add(1039, 7349);
    
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
    org.junit.Assert.assertTrue(i27 == 5044);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 15228);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 8388);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test015"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(19245, 3060);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 22305);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test016"); }


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
    int i30 = classUnderTest0.add(23875, 11002);
    
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
    org.junit.Assert.assertTrue(i30 == 34877);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test017"); }


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
    int i33 = classUnderTest0.add(2999, 3279);
    int i36 = classUnderTest0.add(1329, 3030);
    
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
    org.junit.Assert.assertTrue(i33 == 6278);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 4359);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test018"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add(154, 325);
    int i21 = classUnderTest0.add(808, 237);
    int i24 = classUnderTest0.add(2607, 5493);
    int i27 = classUnderTest0.add(22508, 7838);
    
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
    org.junit.Assert.assertTrue(i27 == 30346);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test019"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(1384, (int)(short)10);
    int i12 = classUnderTest0.add(711, 1629);
    int i15 = classUnderTest0.add(105, 772);
    int i18 = classUnderTest0.add(7871, 5001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1394);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2340);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 877);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 12872);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test020"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(5005, 3471);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 8476);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test021"); }


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
    int i33 = classUnderTest0.add(1843, 13181);
    int i36 = classUnderTest0.add(21426, 15557);
    
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
    org.junit.Assert.assertTrue(i33 == 15024);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 36983);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test022"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(512, 97);
    int i21 = classUnderTest0.add(318, 3310);
    int i24 = classUnderTest0.add(5642, 4366);
    int i27 = classUnderTest0.add(7552, 586);
    
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
    org.junit.Assert.assertTrue(i24 == 10008);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 8138);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test023"); }


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
    int i33 = classUnderTest0.add(331, 0);
    int i36 = classUnderTest0.add(6347, 1310);
    int i39 = classUnderTest0.add(835, 19245);
    
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
    org.junit.Assert.assertTrue(i33 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 7657);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 20080);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test024"); }


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
    int i30 = classUnderTest0.add(1582, 3009);
    int i33 = classUnderTest0.add(411, 18288);
    int i36 = classUnderTest0.add(25653, 9921);
    
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
    org.junit.Assert.assertTrue(i30 == 4591);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 18699);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 35574);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test025"); }


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
    int i39 = classUnderTest0.add(14209, 15412);
    int i42 = classUnderTest0.add(6711, 5044);
    
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
    org.junit.Assert.assertTrue(i39 == 29621);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 11755);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test026"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add(108, (int)'a');
    int i21 = classUnderTest0.add(46476, 1553);
    
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
    org.junit.Assert.assertTrue(i21 == 48029);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test027"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(205, 298);
    int i12 = classUnderTest0.add(243, 0);
    int i15 = classUnderTest0.add(1615, 5278);
    int i18 = classUnderTest0.add(2381, 15295);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 503);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 6893);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 17676);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test028"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add((int)'#', (int)(byte)-1);
    int i21 = classUnderTest0.add(786, 206);
    int i24 = classUnderTest0.add(15434, 29645);
    int i27 = classUnderTest0.add(12132, 12884);
    
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
    org.junit.Assert.assertTrue(i24 == 45079);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 25016);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test029"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(8438, 135);
    int i24 = classUnderTest0.add(1578, 3991);
    int i27 = classUnderTest0.add(7985, 370);
    int i30 = classUnderTest0.add(451, 7560);
    int i33 = classUnderTest0.add(10413, 2232);
    
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
    org.junit.Assert.assertTrue(i27 == 8355);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 8011);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 12645);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test030"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add((int)(byte)-1, (int)(short)1);
    int i21 = classUnderTest0.add(98, 0);
    int i24 = classUnderTest0.add(1906, 4206);
    int i27 = classUnderTest0.add(1170, 2294);
    int i30 = classUnderTest0.add(62515, 3075);
    
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
    org.junit.Assert.assertTrue(i27 == 3464);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 65590);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test031"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(52, 645);
    int i24 = classUnderTest0.add(1453, 2702);
    int i27 = classUnderTest0.add(574, 2187);
    int i30 = classUnderTest0.add(14267, 7388);
    
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
    org.junit.Assert.assertTrue(i27 == 2761);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 21655);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test032"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add((int)(byte)1, 786);
    int i21 = classUnderTest0.add(549, 1594);
    int i24 = classUnderTest0.add(770, 1223);
    int i27 = classUnderTest0.add(1068, 202);
    int i30 = classUnderTest0.add(1534, 7861);
    int i33 = classUnderTest0.add(26309, 0);
    
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
    org.junit.Assert.assertTrue(i27 == 1270);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 9395);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 26309);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test033"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add(1993, 0);
    int i21 = classUnderTest0.add(0, 3285);
    int i24 = classUnderTest0.add(24894, 3966);
    int i27 = classUnderTest0.add(7729, 17672);
    
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
    org.junit.Assert.assertTrue(i24 == 28860);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 25401);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test034"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add(173, 470);
    int i21 = classUnderTest0.add(348, 711);
    int i24 = classUnderTest0.add(2227, 1298);
    int i27 = classUnderTest0.add(510, 0);
    
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
    org.junit.Assert.assertTrue(i27 == 510);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test035"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(17282, 6551);
    int i15 = classUnderTest0.add(3622, 2517);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 23833);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 6139);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test036"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add((int)(short)-1, 151);
    int i21 = classUnderTest0.add((int)(byte)100, (int)(byte)1);
    int i24 = classUnderTest0.add(207, 2459);
    int i27 = classUnderTest0.add(21402, 0);
    
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
    org.junit.Assert.assertTrue(i27 == 21402);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test037"); }


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
    int i33 = classUnderTest0.add(946, 2294);
    int i36 = classUnderTest0.add(1631, 26415);
    
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
    org.junit.Assert.assertTrue(i33 == 3240);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 28046);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test038"); }


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
    int i30 = classUnderTest0.add(16005, 5130);
    
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
    org.junit.Assert.assertTrue(i30 == 21135);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test039"); }


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
    int i33 = classUnderTest0.add(15712, 1262);
    int i36 = classUnderTest0.add(16109, 31091);
    
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
    org.junit.Assert.assertTrue(i33 == 16974);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 47200);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test040"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(233, 665);
    int i15 = classUnderTest0.add(2187, 700);
    int i18 = classUnderTest0.add(5352, 9138);
    int i21 = classUnderTest0.add(4886, 4308);
    
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
    org.junit.Assert.assertTrue(i18 == 14490);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 9194);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test041"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add(1312, 301);
    int i21 = classUnderTest0.add(4206, 210);
    int i24 = classUnderTest0.add(19429, 17482);
    int i27 = classUnderTest0.add(7487, 10484);
    
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
    org.junit.Assert.assertTrue(i27 == 17971);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test042"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(448, 954);
    int i27 = classUnderTest0.add(0, 1948);
    int i30 = classUnderTest0.add(22481, 11946);
    
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
    org.junit.Assert.assertTrue(i27 == 1948);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 34427);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test043"); }


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
    int i36 = classUnderTest0.add(11216, 11669);
    int i39 = classUnderTest0.add(4504, 0);
    
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
    org.junit.Assert.assertTrue(i36 == 22885);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 4504);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test044"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(52, 645);
    int i24 = classUnderTest0.add(0, (int)(byte)-1);
    int i27 = classUnderTest0.add(14481, 15660);
    int i30 = classUnderTest0.add(420, 7283);
    int i33 = classUnderTest0.add(0, 24698);
    
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
    org.junit.Assert.assertTrue(i27 == 30141);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 7703);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 24698);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test045"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(1291, 3525);
    int i18 = classUnderTest0.add(9433, 2563);
    int i21 = classUnderTest0.add(234, 5834);
    int i24 = classUnderTest0.add(0, 35425);
    int i27 = classUnderTest0.add(13640, 1321);
    
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
    org.junit.Assert.assertTrue(i21 == 6068);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 35425);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 14961);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test046"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(280, (int)'4');
    int i6 = classUnderTest0.add(32555, 3325);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35880);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test047"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(52, 645);
    int i24 = classUnderTest0.add(18714, 4957);
    int i27 = classUnderTest0.add(7191, 0);
    
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
    org.junit.Assert.assertTrue(i24 == 23671);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 7191);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test048"); }


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
    int i30 = classUnderTest0.add(0, 12826);
    int i33 = classUnderTest0.add(8216, 4002);
    
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
    org.junit.Assert.assertTrue(i30 == 12826);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 12218);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test049"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(22897, 0);
    int i27 = classUnderTest0.add(4322, 8797);
    
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
    org.junit.Assert.assertTrue(i27 == 13119);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test050"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(305, 552);
    int i15 = classUnderTest0.add(118, 84);
    int i18 = classUnderTest0.add(12218, 1061);
    
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
    org.junit.Assert.assertTrue(i18 == 13279);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test051"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(736, 0);
    int i27 = classUnderTest0.add(857, 197);
    int i30 = classUnderTest0.add(5544, 12398);
    
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
    org.junit.Assert.assertTrue(i27 == 1054);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 17942);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test052"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(298, 0);
    int i24 = classUnderTest0.add(97, 4789);
    int i27 = classUnderTest0.add(1975, 7157);
    int i30 = classUnderTest0.add(17923, 10421);
    int i33 = classUnderTest0.add(11800, 2076);
    
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
    org.junit.Assert.assertTrue(i27 == 9132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 28344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 13876);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test053"); }


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
    int i39 = classUnderTest0.add(1250, 0);
    int i42 = classUnderTest0.add(1429, 1554);
    int i45 = classUnderTest0.add(0, 1553);
    int i48 = classUnderTest0.add(0, 6226);
    
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
    org.junit.Assert.assertTrue(i39 == 1250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 2983);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1553);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 6226);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test054"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add((int)(byte)10, 502);
    int i21 = classUnderTest0.add((int)' ', 3983);
    int i24 = classUnderTest0.add(4969, 688);
    int i27 = classUnderTest0.add(7916, 21939);
    
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
    org.junit.Assert.assertTrue(i24 == 5657);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 29855);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test055"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add(1399, (int)'#');
    int i21 = classUnderTest0.add(1843, 6081);
    int i24 = classUnderTest0.add(2330, 20811);
    int i27 = classUnderTest0.add(2474, 9991);
    
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
    org.junit.Assert.assertTrue(i18 == 1434);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 7924);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 23141);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 12465);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test056"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(byte)1, 448);
    int i21 = classUnderTest0.add(309, 1687);
    int i24 = classUnderTest0.add(1953, 5319);
    int i27 = classUnderTest0.add(9117, 6334);
    int i30 = classUnderTest0.add(23833, 10438);
    int i33 = classUnderTest0.add(3767, 3915);
    
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
    org.junit.Assert.assertTrue(i27 == 15451);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 34271);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 7682);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test057"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(35, (int)(short)0);
    int i9 = classUnderTest0.add(0, 269);
    int i12 = classUnderTest0.add(1045, 798);
    int i15 = classUnderTest0.add(16255, 3896);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1843);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 20151);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test058"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add((int)(short)0, 118);
    int i15 = classUnderTest0.add(95, (int)(short)10);
    int i18 = classUnderTest0.add((-1), 270);
    int i21 = classUnderTest0.add(2858, 2554);
    int i24 = classUnderTest0.add(11816, 28675);
    int i27 = classUnderTest0.add(14161, 2005);
    
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
    org.junit.Assert.assertTrue(i27 == 16166);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test059"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(243, 368);
    int i24 = classUnderTest0.add(147, (int)' ');
    int i27 = classUnderTest0.add(2057, 946);
    int i30 = classUnderTest0.add(46248, 7480);
    
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
    org.junit.Assert.assertTrue(i27 == 3003);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 53728);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test060"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(209, (int)(byte)100);
    int i21 = classUnderTest0.add(9446, 30741);
    
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
    org.junit.Assert.assertTrue(i21 == 40187);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test061"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(1910, 26876);
    int i18 = classUnderTest0.add(3210, 13891);
    int i21 = classUnderTest0.add(1162, 21251);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 565);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 28786);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 17101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 22413);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test062"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add((int)(byte)1, 786);
    int i21 = classUnderTest0.add(2511, 3009);
    int i24 = classUnderTest0.add(411, 214);
    int i27 = classUnderTest0.add(551, 1529);
    int i30 = classUnderTest0.add(217, 101);
    int i33 = classUnderTest0.add(4857, 3372);
    
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
    org.junit.Assert.assertTrue(i27 == 2080);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 318);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 8229);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test063"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(short)1, 269);
    int i15 = classUnderTest0.add(1925, 551);
    int i18 = classUnderTest0.add(1348, 8132);
    int i21 = classUnderTest0.add(16814, 21262);
    
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
    org.junit.Assert.assertTrue(i18 == 9480);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 38076);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test064"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(1296, 479);
    int i9 = classUnderTest0.add(1260, 2728);
    int i12 = classUnderTest0.add(410, 323);
    int i15 = classUnderTest0.add(6243, 322);
    int i18 = classUnderTest0.add(23949, 696);
    int i21 = classUnderTest0.add(4136, 5564);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1775);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3988);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 733);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 6565);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 24645);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 9700);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test065"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(1314, 1717);
    int i18 = classUnderTest0.add(5834, 537);
    int i21 = classUnderTest0.add(1827, 32365);
    
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
    org.junit.Assert.assertTrue(i18 == 6371);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 34192);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test066"); }


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
    int i39 = classUnderTest0.add(276, 6333);
    
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
    org.junit.Assert.assertTrue(i39 == 6609);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test067"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)0, 52);
    int i15 = classUnderTest0.add(0, 105);
    int i18 = classUnderTest0.add(2104, 234);
    int i21 = classUnderTest0.add(2588, 215);
    int i24 = classUnderTest0.add(21626, 12204);
    
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
    org.junit.Assert.assertTrue(i21 == 2803);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 33830);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test068"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(147, 564);
    int i21 = classUnderTest0.add(0, 298);
    int i24 = classUnderTest0.add(1942, (int)(short)-1);
    int i27 = classUnderTest0.add(3446, 2860);
    int i30 = classUnderTest0.add(13079, 2487);
    int i33 = classUnderTest0.add(29866, 2351);
    
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
    org.junit.Assert.assertTrue(i27 == 6306);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 15566);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 32217);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test069"); }


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
    int i33 = classUnderTest0.add(449, 16723);
    int i36 = classUnderTest0.add(10914, 0);
    int i39 = classUnderTest0.add(946, 34359);
    
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
    org.junit.Assert.assertTrue(i33 == 17172);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 10914);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 35305);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test070"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(772, 368);
    int i21 = classUnderTest0.add(154, 7478);
    
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
    org.junit.Assert.assertTrue(i21 == 7632);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test071"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'a', 0);
    int i24 = classUnderTest0.add(325, 2338);
    int i27 = classUnderTest0.add(5223, 2259);
    int i30 = classUnderTest0.add(4352, 1334);
    int i33 = classUnderTest0.add(5430, 3150);
    
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
    org.junit.Assert.assertTrue(i24 == 2663);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 7482);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5686);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 8580);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test072"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(651, 301);
    int i12 = classUnderTest0.add(331, 117);
    int i15 = classUnderTest0.add(0, 11579);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 952);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 448);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 11579);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test073"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(35, 206);
    int i27 = classUnderTest0.add(28955, 6936);
    int i30 = classUnderTest0.add(14639, 16387);
    
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
    org.junit.Assert.assertTrue(i27 == 35891);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 31026);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test074"); }


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
    int i33 = classUnderTest0.add(4661, 0);
    
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
    org.junit.Assert.assertTrue(i33 == 4661);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test075"); }


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
    int i30 = classUnderTest0.add(7430, 2076);
    int i33 = classUnderTest0.add(3285, 935);
    int i36 = classUnderTest0.add(23058, 2047);
    
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
    org.junit.Assert.assertTrue(i30 == 9506);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 4220);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 25105);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test076"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(4257, 217);
    int i24 = classUnderTest0.add(8100, 5081);
    int i27 = classUnderTest0.add(303, 3644);
    
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
    org.junit.Assert.assertTrue(i27 == 3947);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test077"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(612, (int)' ');
    int i9 = classUnderTest0.add(1142, 100);
    int i12 = classUnderTest0.add(551, 2718);
    int i15 = classUnderTest0.add(1431, 4660);
    int i18 = classUnderTest0.add(1429, 1493);
    int i21 = classUnderTest0.add(6091, 9631);
    int i24 = classUnderTest0.add(0, 1093);
    int i27 = classUnderTest0.add(0, 4620);
    
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
    org.junit.Assert.assertTrue(i27 == 4620);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test078"); }


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
    int i39 = classUnderTest0.add(3277, 5041);
    int i42 = classUnderTest0.add(3145, 1137);
    int i45 = classUnderTest0.add(0, 11314);
    int i48 = classUnderTest0.add(11899, 17079);
    
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
    org.junit.Assert.assertTrue(i39 == 8318);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 4282);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 11314);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 28978);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test079"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(632, 3137);
    int i15 = classUnderTest0.add(4620, 44808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3769);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 49428);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test080"); }


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
    int i39 = classUnderTest0.add(33609, 695);
    
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
    org.junit.Assert.assertTrue(i39 == 34304);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test081"); }


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
    int i30 = classUnderTest0.add(6557, 4437);
    
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
    org.junit.Assert.assertTrue(i30 == 10994);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test082"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(0, 3526);
    int i18 = classUnderTest0.add(0, 6116);
    int i21 = classUnderTest0.add(10475, 1687);
    
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
    org.junit.Assert.assertTrue(i18 == 6116);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 12162);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test083"); }


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
    int i30 = classUnderTest0.add(1024, 15276);
    int i33 = classUnderTest0.add(792, 3083);
    
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
    org.junit.Assert.assertTrue(i30 == 16300);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 3875);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test084"); }


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
    int i33 = classUnderTest0.add((int)(byte)-1, 0);
    int i36 = classUnderTest0.add(10250, 16941);
    
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
    org.junit.Assert.assertTrue(i33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 27191);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test085"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(323, 703);
    int i15 = classUnderTest0.add(19326, 7417);
    int i18 = classUnderTest0.add(2808, 10561);
    int i21 = classUnderTest0.add(878, 4268);
    int i24 = classUnderTest0.add(40020, 12722);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1026);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 26743);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 13369);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5146);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 52742);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test086"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(35, (int)(short)0);
    int i9 = classUnderTest0.add(0, 332);
    int i12 = classUnderTest0.add(358, 1762);
    int i15 = classUnderTest0.add(12398, 8617);
    int i18 = classUnderTest0.add(8928, 597);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2120);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 21015);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 9525);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test087"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add((int)(byte)100, 98);
    int i18 = classUnderTest0.add(206, 97);
    int i21 = classUnderTest0.add(343, 564);
    int i24 = classUnderTest0.add(4790, 1037);
    
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
    org.junit.Assert.assertTrue(i24 == 5827);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test088"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(1887, 2465);
    int i21 = classUnderTest0.add(5683, 4522);
    int i24 = classUnderTest0.add(17374, 8578);
    int i27 = classUnderTest0.add(1249, 34226);
    
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
    org.junit.Assert.assertTrue(i18 == 4352);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10205);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 25952);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 35475);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test089"); }


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
    int i30 = classUnderTest0.add(4838, 5604);
    int i33 = classUnderTest0.add(9565, 10413);
    
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
    org.junit.Assert.assertTrue(i30 == 10442);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 19978);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test090"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add((int)(short)-1, 151);
    int i21 = classUnderTest0.add(7405, 305);
    int i24 = classUnderTest0.add(879, 552);
    int i27 = classUnderTest0.add(1763, 6275);
    int i30 = classUnderTest0.add(16620, 2227);
    int i33 = classUnderTest0.add(5853, 1340);
    
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
    org.junit.Assert.assertTrue(i27 == 8038);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 18847);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 7193);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test091"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(703, 1260);
    int i18 = classUnderTest0.add(3421, 1660);
    int i21 = classUnderTest0.add(9324, 1314);
    int i24 = classUnderTest0.add(6867, 9699);
    int i27 = classUnderTest0.add(6840, 4957);
    int i30 = classUnderTest0.add(18680, 4242);
    int i33 = classUnderTest0.add(28556, 1511);
    
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
    org.junit.Assert.assertTrue(i27 == 11797);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 22922);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 30067);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test092"); }


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
    int i33 = classUnderTest0.add(4789, (int)(short)100);
    int i36 = classUnderTest0.add(5545, 420);
    
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
    org.junit.Assert.assertTrue(i33 == 4889);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 5965);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test093"); }


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
    int i33 = classUnderTest0.add(8053, 34255);
    
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
    org.junit.Assert.assertTrue(i33 == 42308);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test094"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(1384, (int)(short)10);
    int i12 = classUnderTest0.add(1496, 16968);
    int i15 = classUnderTest0.add(11700, 12290);
    int i18 = classUnderTest0.add(10846, 18464);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1394);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 18464);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 23990);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 29310);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test095"); }


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
    int i39 = classUnderTest0.add(6916, 4494);
    
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
    org.junit.Assert.assertTrue(i39 == 11410);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test096"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add(108, (int)'a');
    int i21 = classUnderTest0.add(24287, 463);
    
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
    org.junit.Assert.assertTrue(i21 == 24750);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test097"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(150, 300);
    int i27 = classUnderTest0.add(5462, 5535);
    
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
    org.junit.Assert.assertTrue(i27 == 10997);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test098"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(512, 97);
    int i21 = classUnderTest0.add(318, 3310);
    int i24 = classUnderTest0.add(205, 3337);
    int i27 = classUnderTest0.add(23314, 1629);
    
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
    org.junit.Assert.assertTrue(i27 == 24943);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test099"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(512, 97);
    int i21 = classUnderTest0.add(105, 298);
    int i24 = classUnderTest0.add(2980, 983);
    int i27 = classUnderTest0.add(5807, 5319);
    
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
    org.junit.Assert.assertTrue(i27 == 11126);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test100"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(1887, 2465);
    int i21 = classUnderTest0.add(5683, 4522);
    int i24 = classUnderTest0.add(770, 4099);
    
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
    org.junit.Assert.assertTrue(i18 == 4352);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10205);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4869);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test101"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(347, 1037);
    int i24 = classUnderTest0.add(5564, 2311);
    int i27 = classUnderTest0.add(4022, 44210);
    
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
    org.junit.Assert.assertTrue(i24 == 7875);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 48232);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test102"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(197, 611);
    int i15 = classUnderTest0.add(4341, 700);
    int i18 = classUnderTest0.add(26279, 15300);
    
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
    org.junit.Assert.assertTrue(i18 == 41579);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test103"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(703, 609);
    int i18 = classUnderTest0.add(9, (int)'a');
    int i21 = classUnderTest0.add(147, 1296);
    int i24 = classUnderTest0.add(1576, 3854);
    int i27 = classUnderTest0.add(22668, 4704);
    int i30 = classUnderTest0.add(0, 5745);
    
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
    org.junit.Assert.assertTrue(i24 == 5430);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 27372);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5745);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test104"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(612, (int)' ');
    int i9 = classUnderTest0.add(1142, 100);
    int i12 = classUnderTest0.add(3983, 8539);
    int i15 = classUnderTest0.add(736, 7881);
    int i18 = classUnderTest0.add(8583, 38076);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 644);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1242);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 12522);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 8617);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 46659);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test105"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 97);
    int i15 = classUnderTest0.add(1453, 398);
    int i18 = classUnderTest0.add(1725, 3543);
    int i21 = classUnderTest0.add(6499, 9324);
    int i24 = classUnderTest0.add(1594, 1449);
    int i27 = classUnderTest0.add(4671, 688);
    int i30 = classUnderTest0.add(16731, 3545);
    
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
    org.junit.Assert.assertTrue(i18 == 5268);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 15823);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3043);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5359);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 20276);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test106"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'a', 0);
    int i24 = classUnderTest0.add(12327, 3883);
    int i27 = classUnderTest0.add(4586, 322);
    
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
    org.junit.Assert.assertTrue(i24 == 16210);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4908);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test107"); }


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
    int i36 = classUnderTest0.add(9050, 108);
    int i39 = classUnderTest0.add(2459, 7657);
    int i42 = classUnderTest0.add(13396, 1007);
    
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
    org.junit.Assert.assertTrue(i36 == 9158);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 10116);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 14403);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test108"); }


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
    int i30 = classUnderTest0.add(6199, 22522);
    
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
    org.junit.Assert.assertTrue(i30 == 28721);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test109"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(1296, 479);
    int i9 = classUnderTest0.add(1260, 2728);
    int i12 = classUnderTest0.add(410, 323);
    int i15 = classUnderTest0.add(0, 0);
    int i18 = classUnderTest0.add(7881, 532);
    int i21 = classUnderTest0.add(6074, 2104);
    
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
    org.junit.Assert.assertTrue(i18 == 8413);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 8178);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test110"); }


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
    int i30 = classUnderTest0.add(10214, 6723);
    
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
    org.junit.Assert.assertTrue(i30 == 16937);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test111"); }


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
    int i54 = classUnderTest0.add(13853, 848);
    
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
    org.junit.Assert.assertTrue(i54 == 14701);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test112"); }


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
    int i33 = classUnderTest0.add(8789, 23576);
    
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
    org.junit.Assert.assertTrue(i33 == 32365);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test113"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)0, 52);
    int i15 = classUnderTest0.add(0, 105);
    int i18 = classUnderTest0.add(1925, 4202);
    int i21 = classUnderTest0.add(24928, 3370);
    
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
    org.junit.Assert.assertTrue(i18 == 6127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 28298);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test114"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(1887, 2465);
    int i21 = classUnderTest0.add(5683, 4522);
    int i24 = classUnderTest0.add(6702, 0);
    
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
    org.junit.Assert.assertTrue(i18 == 4352);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10205);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6702);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test115"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(612, (int)' ');
    int i9 = classUnderTest0.add(10719, 6641);
    int i12 = classUnderTest0.add(5924, 466);
    int i15 = classUnderTest0.add(0, 6906);
    int i18 = classUnderTest0.add(0, 6225);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 644);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 17360);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 6390);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 6906);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 6225);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test116"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(34, 309);
    int i21 = classUnderTest0.add(1665, 625);
    int i24 = classUnderTest0.add(4008, 102);
    int i27 = classUnderTest0.add(2143, 233);
    int i30 = classUnderTest0.add(58187, 15823);
    
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
    org.junit.Assert.assertTrue(i21 == 2290);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4110);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2376);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 74010);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test117"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(53, (int)(byte)-1);
    int i18 = classUnderTest0.add(300, 547);
    int i21 = classUnderTest0.add(2424, 20);
    int i24 = classUnderTest0.add(21426, 2656);
    
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
    org.junit.Assert.assertTrue(i21 == 2444);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 24082);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test118"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add(149, 632);
    int i15 = classUnderTest0.add(1887, 915);
    int i18 = classUnderTest0.add(3381, 12849);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 781);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2802);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 16230);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test119"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(736, 0);
    int i27 = classUnderTest0.add(5018, 22885);
    
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
    org.junit.Assert.assertTrue(i27 == 27903);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test120"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(793, 2187);
    int i18 = classUnderTest0.add(3009, 2093);
    int i21 = classUnderTest0.add(16836, 12660);
    
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
    org.junit.Assert.assertTrue(i21 == 29496);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test121"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(2057, 1220);
    int i18 = classUnderTest0.add(105, 145);
    int i21 = classUnderTest0.add(3357, 403);
    int i24 = classUnderTest0.add(6421, 150);
    int i27 = classUnderTest0.add(13622, 8558);
    
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
    org.junit.Assert.assertTrue(i24 == 6571);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 22180);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test122"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add((int)(byte)10, 502);
    int i21 = classUnderTest0.add(5133, 1235);
    int i24 = classUnderTest0.add(1432, 17282);
    int i27 = classUnderTest0.add(0, 8576);
    
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
    org.junit.Assert.assertTrue(i24 == 18714);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 8576);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test123"); }


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
    int i36 = classUnderTest0.add(8964, 503);
    
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
    org.junit.Assert.assertTrue(i36 == 9467);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test124"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(2343, 625);
    int i18 = classUnderTest0.add(5697, 4741);
    int i21 = classUnderTest0.add(0, 2101);
    int i24 = classUnderTest0.add(7653, 4496);
    
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
    org.junit.Assert.assertTrue(i24 == 12149);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test125"); }


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
    int i39 = classUnderTest0.add(6258, 41957);
    
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
    org.junit.Assert.assertTrue(i39 == 48215);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test126"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(34, 3116);
    int i15 = classUnderTest0.add(0, 106);
    int i18 = classUnderTest0.add(2532, 19411);
    int i21 = classUnderTest0.add(6585, 6893);
    int i24 = classUnderTest0.add(2695, 2423);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 106);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 21943);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 13478);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 5118);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test127"); }


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
    int i42 = classUnderTest0.add(30790, 6243);
    
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
    org.junit.Assert.assertTrue(i42 == 37033);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test128"); }


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
    int i33 = classUnderTest0.add(3766, 13795);
    int i36 = classUnderTest0.add(549, 7539);
    
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
    org.junit.Assert.assertTrue(i33 == 17561);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 8088);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test129"); }


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
    int i33 = classUnderTest0.add(2999, 3279);
    int i36 = classUnderTest0.add(5319, 8856);
    
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
    org.junit.Assert.assertTrue(i33 == 6278);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 14175);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test130"); }


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
    int i33 = classUnderTest0.add(5520, 0);
    
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
    org.junit.Assert.assertTrue(i33 == 5520);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test131"); }


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
    int i33 = classUnderTest0.add(10475, 32);
    
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
    org.junit.Assert.assertTrue(i33 == 10507);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test132"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(1384, (int)(short)10);
    int i12 = classUnderTest0.add(711, 1629);
    int i15 = classUnderTest0.add(5671, 10474);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1394);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2340);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 16145);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test133"); }


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
    int i33 = classUnderTest0.add(17235, 44018);
    
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
    org.junit.Assert.assertTrue(i33 == 61253);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test134"); }


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
    int i36 = classUnderTest0.add(6711, 9505);
    int i39 = classUnderTest0.add(7284, 9973);
    
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
    org.junit.Assert.assertTrue(i36 == 16216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 17257);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test135"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(703, 1260);
    int i18 = classUnderTest0.add(0, 411);
    int i21 = classUnderTest0.add(118, 906);
    int i24 = classUnderTest0.add(10846, 4571);
    
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
    org.junit.Assert.assertTrue(i24 == 15417);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test136"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(7284, 3277);
    int i27 = classUnderTest0.add(788, 42516);
    
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
    org.junit.Assert.assertTrue(i27 == 43304);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test137"); }


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
    int i42 = classUnderTest0.add(12578, 27812);
    
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
    org.junit.Assert.assertTrue(i42 == 40390);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test138"); }


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
    int i33 = classUnderTest0.add(4627, 1942);
    
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
    org.junit.Assert.assertTrue(i33 == 6569);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test139"); }


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
    int i33 = classUnderTest0.add(1684, 6893);
    int i36 = classUnderTest0.add(20199, 10592);
    int i39 = classUnderTest0.add(0, 56330);
    
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
    org.junit.Assert.assertTrue(i33 == 8577);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 30791);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 56330);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test140"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(503, 217);
    int i24 = classUnderTest0.add(1250, 149);
    int i27 = classUnderTest0.add(20, 469);
    int i30 = classUnderTest0.add(8573, 9300);
    
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
    org.junit.Assert.assertTrue(i27 == 489);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 17873);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test141"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(1329, 1891);
    int i18 = classUnderTest0.add(237, 2557);
    int i21 = classUnderTest0.add(801, 20625);
    int i24 = classUnderTest0.add(16761, 15131);
    
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
    org.junit.Assert.assertTrue(i21 == 21426);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 31892);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test142"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add(950, 517);
    int i15 = classUnderTest0.add(398, 6404);
    int i18 = classUnderTest0.add(4187, 1916);
    int i21 = classUnderTest0.add(3347, 7958);
    int i24 = classUnderTest0.add(3630, 11765);
    
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
    org.junit.Assert.assertTrue(i24 == 15395);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test143"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(10, 198);
    int i18 = classUnderTest0.add(0, (int)'#');
    int i21 = classUnderTest0.add(24313, 14984);
    
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
    org.junit.Assert.assertTrue(i18 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 39297);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test144"); }


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
    int i30 = classUnderTest0.add(1196, 15414);
    
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
    org.junit.Assert.assertTrue(i30 == 16610);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test145"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(197, 151);
    int i18 = classUnderTest0.add((int)(short)100, 914);
    int i21 = classUnderTest0.add(41957, 11402);
    int i24 = classUnderTest0.add(9699, 1795);
    
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
    org.junit.Assert.assertTrue(i21 == 53359);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 11494);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test146"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(154, 512);
    int i24 = classUnderTest0.add(331, 218);
    int i27 = classUnderTest0.add(597, 4767);
    int i30 = classUnderTest0.add(18726, 2716);
    
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
    org.junit.Assert.assertTrue(i24 == 549);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5364);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 21442);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test147"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(898, 503);
    int i15 = classUnderTest0.add(720, 348);
    int i18 = classUnderTest0.add(248, 301);
    int i21 = classUnderTest0.add(3679, 848);
    int i24 = classUnderTest0.add(2143, 1910);
    
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
    org.junit.Assert.assertTrue(i21 == 4527);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4053);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test148"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add((int)'#', (int)(byte)-1);
    int i21 = classUnderTest0.add(786, 206);
    int i24 = classUnderTest0.add(0, 147);
    int i27 = classUnderTest0.add(6371, 6306);
    int i30 = classUnderTest0.add(1739, 19973);
    
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
    org.junit.Assert.assertTrue(i27 == 12677);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 21712);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test149"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(703, 609);
    int i18 = classUnderTest0.add(11752, 3614);
    
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
    org.junit.Assert.assertTrue(i18 == 15366);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test150"); }


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
    int i30 = classUnderTest0.add(13891, 10006);
    
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
    org.junit.Assert.assertTrue(i30 == 23897);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test151"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(703, 1260);
    int i18 = classUnderTest0.add(0, 411);
    int i21 = classUnderTest0.add(14346, 4558);
    int i24 = classUnderTest0.add(5357, 8817);
    
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
    org.junit.Assert.assertTrue(i21 == 18904);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 14174);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test152"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add((int)(byte)100, 98);
    int i18 = classUnderTest0.add(206, 97);
    int i21 = classUnderTest0.add(2381, 899);
    int i24 = classUnderTest0.add(9506, 6081);
    int i27 = classUnderTest0.add(6780, 17350);
    int i30 = classUnderTest0.add(1014, 7363);
    
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
    org.junit.Assert.assertTrue(i24 == 15587);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 24130);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 8377);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test153"); }


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
    int i30 = classUnderTest0.add(0, 1777);
    int i33 = classUnderTest0.add(736, 7920);
    
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
    org.junit.Assert.assertTrue(i30 == 1777);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 8656);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test154"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(52, 95);
    int i21 = classUnderTest0.add(6525, 10720);
    int i24 = classUnderTest0.add(6124, 4055);
    
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
    org.junit.Assert.assertTrue(i24 == 10179);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test155"); }


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
    int i42 = classUnderTest0.add(22290, 42516);
    
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
    org.junit.Assert.assertTrue(i42 == 64806);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test156"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(53, (int)(byte)-1);
    int i18 = classUnderTest0.add(1942, 0);
    int i21 = classUnderTest0.add(4024, 1109);
    int i24 = classUnderTest0.add(52, 1110);
    int i27 = classUnderTest0.add(7969, 5566);
    
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
    org.junit.Assert.assertTrue(i27 == 13535);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test157"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(305, 552);
    int i15 = classUnderTest0.add(118, 84);
    int i18 = classUnderTest0.add(1110, 343);
    int i21 = classUnderTest0.add(2476, 787);
    int i24 = classUnderTest0.add(11765, 15587);
    int i27 = classUnderTest0.add(6488, 3210);
    
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
    org.junit.Assert.assertTrue(i27 == 9698);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test158"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(772, 368);
    int i21 = classUnderTest0.add(433, 323);
    int i24 = classUnderTest0.add(760, 3808);
    int i27 = classUnderTest0.add(7927, 9480);
    int i30 = classUnderTest0.add(14904, 26279);
    
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
    org.junit.Assert.assertTrue(i27 == 17407);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 41183);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test159"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(179, 549);
    int i21 = classUnderTest0.add(1443, 448);
    int i24 = classUnderTest0.add(1563, 451);
    int i27 = classUnderTest0.add(1762, 1903);
    int i30 = classUnderTest0.add(10028, 5406);
    int i33 = classUnderTest0.add(14400, 3888);
    int i36 = classUnderTest0.add(2247, 149);
    
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
    org.junit.Assert.assertTrue(i27 == 3665);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 15434);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 18288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2396);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test160"); }


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
    int i33 = classUnderTest0.add(45996, 21330);
    
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
    org.junit.Assert.assertTrue(i33 == 67326);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test161"); }


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
    int i33 = classUnderTest0.add(0, 651);
    int i36 = classUnderTest0.add(2543, 703);
    int i39 = classUnderTest0.add(1052, 8619);
    
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
    org.junit.Assert.assertTrue(i33 == 651);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 3246);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 9671);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test162"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(898, 503);
    int i15 = classUnderTest0.add(207, 609);
    int i18 = classUnderTest0.add(8146, 17057);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1401);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 816);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 25203);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test163"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(612, (int)' ');
    int i9 = classUnderTest0.add(1142, 100);
    int i12 = classUnderTest0.add(551, 2718);
    int i15 = classUnderTest0.add(1431, 4660);
    int i18 = classUnderTest0.add(1429, 1493);
    int i21 = classUnderTest0.add(4180, 13260);
    int i24 = classUnderTest0.add(21270, 366);
    int i27 = classUnderTest0.add(9561, 6367);
    
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
    org.junit.Assert.assertTrue(i21 == 17440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 21636);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 15928);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test164"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(94, (int)(short)1);
    int i18 = classUnderTest0.add(0, 0);
    int i21 = classUnderTest0.add(0, 1340);
    int i24 = classUnderTest0.add(1541, 778);
    int i27 = classUnderTest0.add(3399, 10507);
    
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
    org.junit.Assert.assertTrue(i27 == 13906);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test165"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(5791, 16968);
    int i18 = classUnderTest0.add(1001, 16937);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 22759);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 17938);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test166"); }


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
    int i30 = classUnderTest0.add(17311, 1346);
    
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
    org.junit.Assert.assertTrue(i30 == 18657);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test167"); }


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
    int i33 = classUnderTest0.add(6948, 1717);
    int i36 = classUnderTest0.add(695, 1739);
    
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
    org.junit.Assert.assertTrue(i33 == 8665);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2434);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test168"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(byte)1, 448);
    int i21 = classUnderTest0.add(6116, 586);
    int i24 = classUnderTest0.add(32472, 1137);
    int i27 = classUnderTest0.add(3784, 18015);
    
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
    org.junit.Assert.assertTrue(i21 == 6702);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 33609);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 21799);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test169"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(368, 118);
    int i18 = classUnderTest0.add((int)(short)100, (int)(byte)0);
    int i21 = classUnderTest0.add(410, (int)(byte)0);
    int i24 = classUnderTest0.add(2272, 2632);
    int i27 = classUnderTest0.add(771, 830);
    
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
    org.junit.Assert.assertTrue(i27 == 1601);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test170"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(10, 217);
    int i24 = classUnderTest0.add(301, 645);
    int i27 = classUnderTest0.add((int)(short)100, 1476);
    int i30 = classUnderTest0.add(665, 4714);
    
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
    org.junit.Assert.assertTrue(i27 == 1576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5379);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test171"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(703, 609);
    int i18 = classUnderTest0.add(9, (int)'a');
    int i21 = classUnderTest0.add(0, 45079);
    
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
    org.junit.Assert.assertTrue(i21 == 45079);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test172"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(53, (int)(byte)-1);
    int i18 = classUnderTest0.add(1942, 0);
    int i21 = classUnderTest0.add(4099, 0);
    int i24 = classUnderTest0.add(8011, 1920);
    
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
    org.junit.Assert.assertTrue(i21 == 4099);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 9931);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test173"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(205, 298);
    int i12 = classUnderTest0.add(243, 0);
    int i15 = classUnderTest0.add(1763, 1594);
    int i18 = classUnderTest0.add(5146, 1109);
    
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
    org.junit.Assert.assertTrue(i18 == 6255);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test174"); }


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
    int i42 = classUnderTest0.add(3062, 7677);
    int i45 = classUnderTest0.add(41182, 7738);
    
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
    org.junit.Assert.assertTrue(i42 == 10739);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 48920);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test175"); }


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
    int i30 = classUnderTest0.add(10214, 1001);
    int i33 = classUnderTest0.add(9259, 1446);
    
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
    org.junit.Assert.assertTrue(i30 == 11215);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 10705);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test176"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(503, 217);
    int i24 = classUnderTest0.add(9748, 3966);
    int i27 = classUnderTest0.add(8597, 4604);
    
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
    org.junit.Assert.assertTrue(i24 == 13714);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 13201);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test177"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(52, 645);
    int i24 = classUnderTest0.add(18714, 4957);
    int i27 = classUnderTest0.add(4941, 5965);
    
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
    org.junit.Assert.assertTrue(i24 == 23671);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 10906);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test178"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(952, 139);
    int i24 = classUnderTest0.add(135, 10);
    int i27 = classUnderTest0.add(1673, 1);
    int i30 = classUnderTest0.add(7940, 18464);
    int i33 = classUnderTest0.add(22885, 13225);
    
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
    org.junit.Assert.assertTrue(i24 == 145);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1674);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 26404);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 36110);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test179"); }


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
    int i36 = classUnderTest0.add(11752, 16731);
    int i39 = classUnderTest0.add(9259, 12522);
    
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
    org.junit.Assert.assertTrue(i36 == 28483);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 21781);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test180"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(703, 1260);
    int i18 = classUnderTest0.add(9386, 7462);
    
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
    org.junit.Assert.assertTrue(i18 == 16848);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test181"); }


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
    int i30 = classUnderTest0.add(5505, 13291);
    
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
    org.junit.Assert.assertTrue(i30 == 18796);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test182"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(153, (int)(byte)1);
    int i18 = classUnderTest0.add(118, (int)(byte)-1);
    int i21 = classUnderTest0.add(197, 1109);
    int i24 = classUnderTest0.add(2722, 0);
    int i27 = classUnderTest0.add(2180, 537);
    int i30 = classUnderTest0.add(0, 8554);
    
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
    org.junit.Assert.assertTrue(i27 == 2717);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 8554);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test183"); }


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
    int i30 = classUnderTest0.add(7430, 2076);
    int i33 = classUnderTest0.add(4303, 14804);
    
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
    org.junit.Assert.assertTrue(i30 == 9506);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 19107);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test184"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(10, 198);
    int i18 = classUnderTest0.add(512, 153);
    int i21 = classUnderTest0.add(135, 433);
    int i24 = classUnderTest0.add(517, 5726);
    int i27 = classUnderTest0.add(583, 5993);
    
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
    org.junit.Assert.assertTrue(i27 == 6576);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test185"); }


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
    int i33 = classUnderTest0.add(13874, 26601);
    
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
    org.junit.Assert.assertTrue(i33 == 40475);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test186"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add(3587, 9480);
    int i21 = classUnderTest0.add(8600, 1609);
    int i24 = classUnderTest0.add(38285, 16487);
    
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
    org.junit.Assert.assertTrue(i24 == 54772);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test187"); }


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
    int i30 = classUnderTest0.add(10390, 0);
    int i33 = classUnderTest0.add(5604, 21234);
    
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
    org.junit.Assert.assertTrue(i30 == 10390);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 26838);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test188"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)-1, 197);
    int i18 = classUnderTest0.add((int)(byte)0, 549);
    int i21 = classUnderTest0.add(105, 261);
    int i24 = classUnderTest0.add(24369, 1940);
    int i27 = classUnderTest0.add(1506, 7928);
    
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
    org.junit.Assert.assertTrue(i21 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 26309);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 9434);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test189"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(612, (int)' ');
    int i9 = classUnderTest0.add(1142, 100);
    int i12 = classUnderTest0.add(551, 2718);
    int i15 = classUnderTest0.add(13738, 24082);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 644);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1242);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 37820);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test190"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add(513, 280);
    int i18 = classUnderTest0.add(946, 314);
    int i21 = classUnderTest0.add(7677, 12545);
    int i24 = classUnderTest0.add(7796, 11946);
    int i27 = classUnderTest0.add(1291, 40010);
    
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
    org.junit.Assert.assertTrue(i27 == 41301);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test191"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(4019, 347);
    int i21 = classUnderTest0.add(6011, 2860);
    
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
    org.junit.Assert.assertTrue(i21 == 8871);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test192"); }


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
    int i33 = classUnderTest0.add(0, 2338);
    int i36 = classUnderTest0.add(7354, 19971);
    
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
    org.junit.Assert.assertTrue(i33 == 2338);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 27325);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test193"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(34, 309);
    int i21 = classUnderTest0.add(1665, 625);
    int i24 = classUnderTest0.add(4008, 102);
    int i27 = classUnderTest0.add(2219, 23533);
    int i30 = classUnderTest0.add(917, 11941);
    
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
    org.junit.Assert.assertTrue(i21 == 2290);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4110);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 25752);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 12858);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test194"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add((int)(byte)1, 786);
    int i21 = classUnderTest0.add(549, 1594);
    int i24 = classUnderTest0.add(3983, (int)(short)10);
    int i27 = classUnderTest0.add(3569, 10592);
    int i30 = classUnderTest0.add(6395, 25333);
    
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
    org.junit.Assert.assertTrue(i27 == 14161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 31728);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test195"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add((int)(byte)1, 786);
    int i21 = classUnderTest0.add(3418, 14403);
    
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
    org.junit.Assert.assertTrue(i21 == 17821);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test196"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(703, 609);
    int i18 = classUnderTest0.add(9, (int)'a');
    int i21 = classUnderTest0.add(147, 1296);
    int i24 = classUnderTest0.add(94, 241);
    int i27 = classUnderTest0.add(15561, 46530);
    int i30 = classUnderTest0.add(4250, 8401);
    
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
    org.junit.Assert.assertTrue(i27 == 62091);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 12651);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test197"); }


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
    int i36 = classUnderTest0.add(13667, 11081);
    
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
    org.junit.Assert.assertTrue(i36 == 24748);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test198"); }


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
    int i33 = classUnderTest0.add(0, 651);
    int i36 = classUnderTest0.add(2543, 703);
    int i39 = classUnderTest0.add(14700, 17057);
    
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
    org.junit.Assert.assertTrue(i33 == 651);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 3246);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 31757);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test199"); }


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
    int i33 = classUnderTest0.add(5683, 10906);
    
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
    org.junit.Assert.assertTrue(i33 == 16589);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test200"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(703, 1260);
    int i18 = classUnderTest0.add(0, 411);
    int i21 = classUnderTest0.add(14346, 4558);
    int i24 = classUnderTest0.add(4022, 5371);
    
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
    org.junit.Assert.assertTrue(i21 == 18904);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 9393);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test201"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(20, 153);
    int i6 = classUnderTest0.add(0, 917);
    int i9 = classUnderTest0.add(1456, 1975);
    int i12 = classUnderTest0.add(6642, 305);
    int i15 = classUnderTest0.add(3753, 9221);
    int i18 = classUnderTest0.add(1481, 4158);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 173);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 917);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3431);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 6947);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 12974);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 5639);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test202"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(4257, 217);
    int i24 = classUnderTest0.add(8100, 5081);
    int i27 = classUnderTest0.add(10923, 29448);
    
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
    org.junit.Assert.assertTrue(i27 == 40371);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test203"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(898, 503);
    int i15 = classUnderTest0.add(720, 348);
    int i18 = classUnderTest0.add(305, 480);
    int i21 = classUnderTest0.add(1364, 1990);
    int i24 = classUnderTest0.add(1916, 7050);
    int i27 = classUnderTest0.add(2803, 8138);
    
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
    org.junit.Assert.assertTrue(i27 == 10941);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test204"); }


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
    int i30 = classUnderTest0.add(0, 31026);
    
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
    org.junit.Assert.assertTrue(i30 == 31026);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test205"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(20, 3279);
    int i27 = classUnderTest0.add(14904, 318);
    int i30 = classUnderTest0.add(4359, 32485);
    int i33 = classUnderTest0.add(307, 4586);
    
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
    org.junit.Assert.assertTrue(i27 == 15222);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 36844);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 4893);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test206"); }


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
    int i33 = classUnderTest0.add(0, 10907);
    
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
    org.junit.Assert.assertTrue(i33 == 10907);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test207"); }


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
    int i33 = classUnderTest0.add(6179, 19520);
    int i36 = classUnderTest0.add(253, 888);
    
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
    org.junit.Assert.assertTrue(i33 == 25699);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1141);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test208"); }


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
    int i36 = classUnderTest0.add(6400, 992);
    int i39 = classUnderTest0.add(1350, 2563);
    
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
    org.junit.Assert.assertTrue(i36 == 7392);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 3913);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test209"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add((int)'#', (int)(byte)-1);
    int i21 = classUnderTest0.add(7157, 992);
    int i24 = classUnderTest0.add(7209, 1364);
    int i27 = classUnderTest0.add(5028, 14707);
    
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
    org.junit.Assert.assertTrue(i21 == 8149);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 8573);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 19735);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test210"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)0, (int)'4');
    int i18 = classUnderTest0.add(52, 796);
    int i21 = classUnderTest0.add(1163, 197);
    int i24 = classUnderTest0.add(1905, 97);
    int i27 = classUnderTest0.add(14014, 12857);
    
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
    org.junit.Assert.assertTrue(i27 == 26871);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test211"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(94, (int)(short)1);
    int i18 = classUnderTest0.add(0, 0);
    int i21 = classUnderTest0.add(0, 1340);
    int i24 = classUnderTest0.add(7209, 3423);
    int i27 = classUnderTest0.add(36983, 1504);
    
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
    org.junit.Assert.assertTrue(i24 == 10632);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 38487);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test212"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(147, 564);
    int i21 = classUnderTest0.add(237, 2228);
    int i24 = classUnderTest0.add(4409, 4140);
    int i27 = classUnderTest0.add(8817, 14707);
    
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
    org.junit.Assert.assertTrue(i21 == 2465);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 8549);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 23524);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test213"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(10, 198);
    int i18 = classUnderTest0.add(512, 52);
    int i21 = classUnderTest0.add(2966, 4257);
    int i24 = classUnderTest0.add(16937, 18211);
    
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
    org.junit.Assert.assertTrue(i24 == 35148);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test214"); }


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
    int i48 = classUnderTest0.add(1009, 7465);
    
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
    org.junit.Assert.assertTrue(i48 == 8474);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test215"); }


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
    int i33 = classUnderTest0.add(102, 1315);
    int i36 = classUnderTest0.add(5993, 4479);
    int i39 = classUnderTest0.add(15057, 1348);
    int i42 = classUnderTest0.add(14209, 15623);
    
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
    org.junit.Assert.assertTrue(i33 == 1417);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 10472);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 16405);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 29832);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test216"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(8438, 135);
    int i24 = classUnderTest0.add(1578, 3991);
    int i27 = classUnderTest0.add(7985, 370);
    int i30 = classUnderTest0.add(1534, 250);
    int i33 = classUnderTest0.add(2503, 12829);
    
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
    org.junit.Assert.assertTrue(i27 == 8355);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 15332);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test217"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(1296, 479);
    int i9 = classUnderTest0.add(1260, 2728);
    int i12 = classUnderTest0.add(410, 323);
    int i15 = classUnderTest0.add(6243, 322);
    int i18 = classUnderTest0.add(23949, 696);
    int i21 = classUnderTest0.add(5004, 6411);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1775);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3988);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 733);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 6565);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 24645);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 11415);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test218"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(612, (int)' ');
    int i9 = classUnderTest0.add(1142, 100);
    int i12 = classUnderTest0.add(0, 2057);
    int i15 = classUnderTest0.add(0, 4160);
    int i18 = classUnderTest0.add(9434, 46961);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 644);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1242);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2057);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 4160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 56395);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test219"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(32, (int)'4');
    int i24 = classUnderTest0.add(139, 898);
    int i27 = classUnderTest0.add(3000, 4283);
    int i30 = classUnderTest0.add(1996, 9143);
    
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
    org.junit.Assert.assertTrue(i27 == 7283);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11139);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test220"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(151, 197);
    int i21 = classUnderTest0.add(4904, 5959);
    
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
    org.junit.Assert.assertTrue(i21 == 10863);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test221"); }


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
    int i30 = classUnderTest0.add(13583, 323);
    
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
    org.junit.Assert.assertTrue(i30 == 13906);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test222"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)0, 52);
    int i15 = classUnderTest0.add(1963, 4789);
    int i18 = classUnderTest0.add(4366, 6948);
    int i21 = classUnderTest0.add(16267, 30741);
    
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
    org.junit.Assert.assertTrue(i21 == 47008);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test223"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(772, 368);
    int i21 = classUnderTest0.add(202, 772);
    int i24 = classUnderTest0.add(23921, 604);
    
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
    org.junit.Assert.assertTrue(i21 == 974);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 24525);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test224"); }


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
    int i36 = classUnderTest0.add(9082, 0);
    
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
    org.junit.Assert.assertTrue(i36 == 9082);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test225"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(703, 1260);
    int i18 = classUnderTest0.add(3421, 1660);
    int i21 = classUnderTest0.add(9324, 1314);
    int i24 = classUnderTest0.add(441, 20590);
    
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
    org.junit.Assert.assertTrue(i24 == 21031);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test226"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add(10, 108);
    int i21 = classUnderTest0.add(720, 52);
    int i24 = classUnderTest0.add(720, 100);
    int i27 = classUnderTest0.add(0, 34609);
    
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
    org.junit.Assert.assertTrue(i27 == 34609);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test227"); }


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
    int i33 = classUnderTest0.add(19429, 2288);
    int i36 = classUnderTest0.add(10438, 2180);
    int i39 = classUnderTest0.add(3271, 30741);
    
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
    org.junit.Assert.assertTrue(i33 == 21717);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 12618);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 34012);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test228"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(928, 1153);
    int i12 = classUnderTest0.add(533, 311);
    int i15 = classUnderTest0.add(11528, 1747);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2081);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 844);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 13275);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test229"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add((int)(byte)100, 98);
    int i18 = classUnderTest0.add(792, 1312);
    int i21 = classUnderTest0.add(2074, 906);
    int i24 = classUnderTest0.add(0, 29047);
    int i27 = classUnderTest0.add(2560, 6179);
    
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
    org.junit.Assert.assertTrue(i27 == 8739);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test230"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(35, (int)(byte)-1);
    int i24 = classUnderTest0.add(850, 7482);
    int i27 = classUnderTest0.add(179, 1629);
    int i30 = classUnderTest0.add(5214, 1629);
    
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
    org.junit.Assert.assertTrue(i24 == 8332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 6843);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test231"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(2343, 625);
    int i18 = classUnderTest0.add(5493, 5697);
    int i21 = classUnderTest0.add(13980, 12371);
    int i24 = classUnderTest0.add(1594, 40010);
    
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
    org.junit.Assert.assertTrue(i21 == 26351);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 41604);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test232"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(502, (int)'a');
    int i12 = classUnderTest0.add(479, 433);
    int i15 = classUnderTest0.add(6336, 4384);
    int i18 = classUnderTest0.add(2523, 2446);
    int i21 = classUnderTest0.add(10262, 8821);
    int i24 = classUnderTest0.add(4604, 12261);
    
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
    org.junit.Assert.assertTrue(i21 == 19083);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 16865);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test233"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(368, 118);
    int i18 = classUnderTest0.add((int)(short)100, (int)(byte)0);
    int i21 = classUnderTest0.add(0, 241);
    int i24 = classUnderTest0.add(1335, 2968);
    int i27 = classUnderTest0.add(32611, 21220);
    
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
    org.junit.Assert.assertTrue(i24 == 4303);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 53831);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test234"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(348, (int)(short)10);
    int i21 = classUnderTest0.add(533, 314);
    int i24 = classUnderTest0.add(151, 603);
    int i27 = classUnderTest0.add(8665, 3539);
    int i30 = classUnderTest0.add(9608, 1631);
    
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
    org.junit.Assert.assertTrue(i27 == 12204);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11239);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test235"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(502, (int)'a');
    int i12 = classUnderTest0.add(479, 433);
    int i15 = classUnderTest0.add(6336, 4384);
    int i18 = classUnderTest0.add(2523, 2446);
    int i21 = classUnderTest0.add(34107, 30141);
    
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
    org.junit.Assert.assertTrue(i21 == 64248);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test236"); }


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
    int i42 = classUnderTest0.add(3062, 7677);
    int i45 = classUnderTest0.add(102, 7861);
    int i48 = classUnderTest0.add(13634, 14014);
    int i51 = classUnderTest0.add(0, 5992);
    
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
    org.junit.Assert.assertTrue(i42 == 10739);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 7963);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 27648);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 5992);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test237"); }


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
    int i39 = classUnderTest0.add(10438, 1384);
    int i42 = classUnderTest0.add(6346, 2155);
    
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
    org.junit.Assert.assertTrue(i39 == 11822);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 8501);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test238"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(772, 368);
    int i21 = classUnderTest0.add(433, 323);
    int i24 = classUnderTest0.add(760, 3808);
    int i27 = classUnderTest0.add(14021, 21372);
    
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
    org.junit.Assert.assertTrue(i27 == 35393);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test239"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(2343, 625);
    int i18 = classUnderTest0.add(5697, 4741);
    int i21 = classUnderTest0.add(0, 2101);
    int i24 = classUnderTest0.add(4496, 3484);
    int i27 = classUnderTest0.add(318, 857);
    
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
    org.junit.Assert.assertTrue(i24 == 7980);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1175);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test240"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'a', 0);
    int i24 = classUnderTest0.add(2927, 410);
    int i27 = classUnderTest0.add(0, 4324);
    
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
    org.junit.Assert.assertTrue(i27 == 4324);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test241"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(197, 151);
    int i18 = classUnderTest0.add((int)(short)100, 914);
    int i21 = classUnderTest0.add(6346, 3542);
    
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
    org.junit.Assert.assertTrue(i21 == 9888);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test242"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add((int)(byte)1, 786);
    int i21 = classUnderTest0.add(2511, 3009);
    int i24 = classUnderTest0.add(267, 61);
    int i27 = classUnderTest0.add(996, 1291);
    int i30 = classUnderTest0.add(25906, 5937);
    int i33 = classUnderTest0.add(25203, 22481);
    
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
    org.junit.Assert.assertTrue(i27 == 2287);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 31843);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 47684);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test243"); }


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
    int i45 = classUnderTest0.add(8831, 33349);
    
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
    org.junit.Assert.assertTrue(i45 == 42180);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test244"); }


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
    int i39 = classUnderTest0.add(34107, 11889);
    int i42 = classUnderTest0.add(6642, 28786);
    
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
    org.junit.Assert.assertTrue(i39 == 45996);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 35428);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test245"); }


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
    int i36 = classUnderTest0.add(8656, 14951);
    
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
    org.junit.Assert.assertTrue(i36 == 23607);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test246"); }


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
    int i36 = classUnderTest0.add(2429, 1942);
    int i39 = classUnderTest0.add(489, 793);
    int i42 = classUnderTest0.add(5919, 7795);
    int i45 = classUnderTest0.add(1794, 12865);
    
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
    org.junit.Assert.assertTrue(i36 == 4371);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1282);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 13714);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 14659);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test247"); }


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
    int i36 = classUnderTest0.add(12331, 44396);
    
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
    org.junit.Assert.assertTrue(i36 == 56727);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test248"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(154, 512);
    int i24 = classUnderTest0.add(18363, 19107);
    
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
    org.junit.Assert.assertTrue(i24 == 37470);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test249"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(898, 503);
    int i15 = classUnderTest0.add(720, 348);
    int i18 = classUnderTest0.add(248, 301);
    int i21 = classUnderTest0.add(1037, 517);
    int i24 = classUnderTest0.add(0, 7849);
    
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
    org.junit.Assert.assertTrue(i24 == 7849);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test250"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(2057, 1220);
    int i18 = classUnderTest0.add(105, 145);
    int i21 = classUnderTest0.add(0, 2572);
    int i24 = classUnderTest0.add(405, 298);
    int i27 = classUnderTest0.add(4019, 25401);
    
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
    org.junit.Assert.assertTrue(i27 == 29420);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test251"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(11410, 6336);
    int i15 = classUnderTest0.add(1674, 11363);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 17746);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 13037);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test252"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)0, (int)'4');
    int i18 = classUnderTest0.add(52, 796);
    int i21 = classUnderTest0.add(3993, 2343);
    int i24 = classUnderTest0.add(233, 233);
    int i27 = classUnderTest0.add(8739, 9600);
    
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
    org.junit.Assert.assertTrue(i24 == 466);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 18339);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test253"); }


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
    int i54 = classUnderTest0.add(47695, 732);
    
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
    org.junit.Assert.assertTrue(i54 == 48427);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test254"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(503, 217);
    int i24 = classUnderTest0.add(0, 43774);
    
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
    org.junit.Assert.assertTrue(i24 == 43774);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test255"); }


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
    int i30 = classUnderTest0.add(20043, 2217);
    int i33 = classUnderTest0.add(7131, 330);
    
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
    org.junit.Assert.assertTrue(i30 == 22260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 7461);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test256"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add(16867, 3504);
    
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
    org.junit.Assert.assertTrue(i18 == 20371);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test257"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(703, 98);
    int i15 = classUnderTest0.add(248, (int)(byte)0);
    int i18 = classUnderTest0.add(52, 1963);
    int i21 = classUnderTest0.add(8824, 16267);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 801);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 248);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2015);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 25091);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test258"); }


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
    int i36 = classUnderTest0.add(849, 3569);
    int i39 = classUnderTest0.add(7561, 4943);
    int i42 = classUnderTest0.add(298, 15905);
    
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
    org.junit.Assert.assertTrue(i36 == 4418);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 12504);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 16203);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test259"); }


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
    int i36 = classUnderTest0.add(30122, 16589);
    
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
    org.junit.Assert.assertTrue(i36 == 46711);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test260"); }


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
    int i33 = classUnderTest0.add(6894, 9726);
    int i36 = classUnderTest0.add(11579, 26743);
    
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
    org.junit.Assert.assertTrue(i33 == 16620);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 38322);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test261"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(10, 198);
    int i18 = classUnderTest0.add(512, 153);
    int i21 = classUnderTest0.add(135, 433);
    int i24 = classUnderTest0.add(1429, 645);
    int i27 = classUnderTest0.add(298, 2583);
    
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
    org.junit.Assert.assertTrue(i27 == 2881);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test262"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)-1, 197);
    int i18 = classUnderTest0.add((int)(byte)0, 549);
    int i21 = classUnderTest0.add(105, 261);
    int i24 = classUnderTest0.add(754, (int)(byte)0);
    int i27 = classUnderTest0.add(0, 323);
    int i30 = classUnderTest0.add(3873, 992);
    int i33 = classUnderTest0.add(4941, 2015);
    
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
    org.junit.Assert.assertTrue(i21 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 754);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 323);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4865);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 6956);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test263"); }


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
    int i33 = classUnderTest0.add(5671, 62091);
    
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
    org.junit.Assert.assertTrue(i33 == 67762);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test264"); }


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
    int i33 = classUnderTest0.add(3245, 8995);
    int i36 = classUnderTest0.add(0, 10711);
    
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
    org.junit.Assert.assertTrue(i33 == 12240);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 10711);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test265"); }


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
    int i30 = classUnderTest0.add(1990, 651);
    
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
    org.junit.Assert.assertTrue(i30 == 2641);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test266"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(2057, 1220);
    int i18 = classUnderTest0.add(1431, 574);
    int i21 = classUnderTest0.add(3269, 2351);
    int i24 = classUnderTest0.add(3849, 279);
    int i27 = classUnderTest0.add(5211, 2219);
    int i30 = classUnderTest0.add(21371, 3453);
    
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
    org.junit.Assert.assertTrue(i18 == 2005);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5620);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 7430);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 24824);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test267"); }


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
    int i30 = classUnderTest0.add(3496, 1175);
    
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
    org.junit.Assert.assertTrue(i30 == 4671);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test268"); }


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
    int i30 = classUnderTest0.add(0, 2227);
    int i33 = classUnderTest0.add(8406, 8313);
    
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
    org.junit.Assert.assertTrue(i30 == 2227);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 16719);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test269"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add((int)'4', 643);
    int i18 = classUnderTest0.add(12327, 5044);
    int i21 = classUnderTest0.add(8995, 17458);
    
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
    org.junit.Assert.assertTrue(i18 == 17371);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 26453);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test270"); }


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
    int i42 = classUnderTest0.add(11146, 7560);
    int i45 = classUnderTest0.add(400, 1127);
    
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
    org.junit.Assert.assertTrue(i42 == 18706);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1527);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test271"); }


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
    int i30 = classUnderTest0.add(1441, 463);
    int i33 = classUnderTest0.add(5686, 8443);
    
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
    org.junit.Assert.assertTrue(i30 == 1904);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 14129);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test272"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(348, (int)(short)10);
    int i21 = classUnderTest0.add(2219, 3423);
    int i24 = classUnderTest0.add(2999, 15412);
    int i27 = classUnderTest0.add(0, 2287);
    
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
    org.junit.Assert.assertTrue(i21 == 5642);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 18411);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2287);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test273"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(52, 95);
    int i21 = classUnderTest0.add(334, 1578);
    int i24 = classUnderTest0.add(6102, 5851);
    int i27 = classUnderTest0.add(5534, 10875);
    int i30 = classUnderTest0.add(12886, 0);
    
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
    org.junit.Assert.assertTrue(i27 == 16409);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 12886);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test274"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(574, 1534);
    int i24 = classUnderTest0.add(7953, 0);
    
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
    org.junit.Assert.assertTrue(i24 == 7953);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test275"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'#', 633);
    int i24 = classUnderTest0.add(533, 1140);
    int i27 = classUnderTest0.add(12849, 35519);
    int i30 = classUnderTest0.add(14617, 0);
    
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
    org.junit.Assert.assertTrue(i24 == 1673);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 48368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 14617);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test276"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(651, 1274);
    int i24 = classUnderTest0.add(0, 11752);
    int i27 = classUnderTest0.add(10923, 3556);
    int i30 = classUnderTest0.add(15618, 6222);
    
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
    org.junit.Assert.assertTrue(i21 == 1925);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 11752);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 14479);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 21840);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test277"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(703, 1260);
    int i18 = classUnderTest0.add(7284, 4187);
    int i21 = classUnderTest0.add(3009, 5544);
    
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
    org.junit.Assert.assertTrue(i18 == 11471);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 8553);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test278"); }


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
    int i30 = classUnderTest0.add(1993, 1346);
    int i33 = classUnderTest0.add(653, 2932);
    int i36 = classUnderTest0.add(1223, 16387);
    
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
    org.junit.Assert.assertTrue(i30 == 3339);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 3585);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 17610);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test279"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(448, 954);
    int i27 = classUnderTest0.add(954, 33070);
    int i30 = classUnderTest0.add(215, 1613);
    
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
    org.junit.Assert.assertTrue(i27 == 34024);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1828);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test280"); }


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
    int i30 = classUnderTest0.add(10000, 11190);
    
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
    org.junit.Assert.assertTrue(i30 == 21190);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test281"); }


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
    int i30 = classUnderTest0.add(11988, 13137);
    
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
    org.junit.Assert.assertTrue(i30 == 25125);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test282"); }


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
    int i33 = classUnderTest0.add(0, 52055);
    
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
    org.junit.Assert.assertTrue(i33 == 52055);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test283"); }


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
    int i39 = classUnderTest0.add(14209, 15412);
    int i42 = classUnderTest0.add(5323, 5604);
    
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
    org.junit.Assert.assertTrue(i39 == 29621);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 10927);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test284"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add(1312, 301);
    int i21 = classUnderTest0.add(4206, 210);
    int i24 = classUnderTest0.add(3195, 3267);
    int i27 = classUnderTest0.add(5268, 22587);
    
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
    org.junit.Assert.assertTrue(i27 == 27855);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test285"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(612, (int)' ');
    int i9 = classUnderTest0.add(1142, 100);
    int i12 = classUnderTest0.add(0, 2057);
    int i15 = classUnderTest0.add(19994, 1350);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 644);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1242);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2057);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 21344);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test286"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add((int)(short)0, 118);
    int i15 = classUnderTest0.add(95, (int)(short)10);
    int i18 = classUnderTest0.add(3983, 36);
    int i21 = classUnderTest0.add(9908, 154);
    
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
    org.junit.Assert.assertTrue(i21 == 10062);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test287"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add((int)(byte)1, 786);
    int i21 = classUnderTest0.add(2511, 3009);
    int i24 = classUnderTest0.add(267, 61);
    int i27 = classUnderTest0.add(996, 1291);
    int i30 = classUnderTest0.add(25906, 5937);
    int i33 = classUnderTest0.add(3116, 1083);
    
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
    org.junit.Assert.assertTrue(i27 == 2287);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 31843);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 4199);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test288"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(98, 0);
    int i18 = classUnderTest0.add(6571, 3116);
    int i21 = classUnderTest0.add(0, 4504);
    
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
    org.junit.Assert.assertTrue(i21 == 4504);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test289"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(368, 118);
    int i18 = classUnderTest0.add(52, 209);
    int i21 = classUnderTest0.add(331, 1897);
    int i24 = classUnderTest0.add(635, 3648);
    int i27 = classUnderTest0.add(17360, 479);
    
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
    org.junit.Assert.assertTrue(i27 == 17839);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test290"); }


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
    int i33 = classUnderTest0.add(3288, 4248);
    
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
    org.junit.Assert.assertTrue(i33 == 7536);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test291"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(2288, 905);
    int i21 = classUnderTest0.add(0, 537);
    int i24 = classUnderTest0.add(2374, 31843);
    
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
    org.junit.Assert.assertTrue(i24 == 34217);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test292"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(305, 552);
    int i15 = classUnderTest0.add(118, 84);
    int i18 = classUnderTest0.add(1110, 343);
    int i21 = classUnderTest0.add(512, 300);
    int i24 = classUnderTest0.add(1717, 3828);
    int i27 = classUnderTest0.add(0, 37371);
    
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
    org.junit.Assert.assertTrue(i27 == 37371);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test293"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(305, 552);
    int i15 = classUnderTest0.add(118, 84);
    int i18 = classUnderTest0.add(1110, 343);
    int i21 = classUnderTest0.add(512, 300);
    int i24 = classUnderTest0.add(2563, 234);
    int i27 = classUnderTest0.add(5697, 3808);
    int i30 = classUnderTest0.add(13888, 9751);
    
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
    org.junit.Assert.assertTrue(i27 == 9505);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 23639);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test294"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'#', 633);
    int i24 = classUnderTest0.add(17590, 16752);
    int i27 = classUnderTest0.add(56330, 32958);
    
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
    org.junit.Assert.assertTrue(i24 == 34342);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 89288);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test295"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add((int)(byte)-1, (int)(short)1);
    int i21 = classUnderTest0.add(98, 0);
    int i24 = classUnderTest0.add(1906, 4206);
    int i27 = classUnderTest0.add(1700, 12327);
    int i30 = classUnderTest0.add(4957, 24856);
    
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
    org.junit.Assert.assertTrue(i27 == 14027);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 29813);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test296"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add((int)'4', 643);
    int i18 = classUnderTest0.add(0, 1091);
    int i21 = classUnderTest0.add(469, 9631);
    int i24 = classUnderTest0.add(6796, 4308);
    
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
    org.junit.Assert.assertTrue(i24 == 11104);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test297"); }


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
    int i45 = classUnderTest0.add(405, 3766);
    
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
    org.junit.Assert.assertTrue(i45 == 4171);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test298"); }


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
    int i30 = classUnderTest0.add(20590, 10387);
    
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
    org.junit.Assert.assertTrue(i30 == 30977);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test299"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(4479, 150);
    int i18 = classUnderTest0.add(6642, 6207);
    int i21 = classUnderTest0.add(0, 27844);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 4629);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 12849);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 27844);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test300"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(94, (int)(short)1);
    int i18 = classUnderTest0.add(0, 0);
    int i21 = classUnderTest0.add(8576, 19480);
    
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
    org.junit.Assert.assertTrue(i21 == 28056);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test301"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(18411, 400);
    int i21 = classUnderTest0.add(2194, 4175);
    
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
    org.junit.Assert.assertTrue(i18 == 18811);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 6369);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test302"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(1384, (int)(short)10);
    int i12 = classUnderTest0.add(1496, 16968);
    int i15 = classUnderTest0.add(6910, 3000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1394);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 18464);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 9910);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test303"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(94, (int)(short)1);
    int i18 = classUnderTest0.add(3537, 850);
    int i21 = classUnderTest0.add(2932, 18550);
    
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
    org.junit.Assert.assertTrue(i18 == 4387);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 21482);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test304"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(2057, 1220);
    int i18 = classUnderTest0.add(105, 145);
    int i21 = classUnderTest0.add((int)(byte)100, 2756);
    int i24 = classUnderTest0.add(1609, 17847);
    int i27 = classUnderTest0.add(26893, 6904);
    int i30 = classUnderTest0.add(3679, 845);
    
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
    org.junit.Assert.assertTrue(i21 == 2856);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 19456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 33797);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4524);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test305"); }


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
    int i33 = classUnderTest0.add(5745, 847);
    int i36 = classUnderTest0.add(10923, 0);
    
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
    org.junit.Assert.assertTrue(i33 == 6592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 10923);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test306"); }


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
    int i30 = classUnderTest0.add(8216, 1990);
    
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
    org.junit.Assert.assertTrue(i30 == 10206);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test307"); }


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
    int i42 = classUnderTest0.add(8489, 4940);
    
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
    org.junit.Assert.assertTrue(i42 == 13429);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test308"); }


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
    int i33 = classUnderTest0.add(4789, (int)(short)100);
    int i36 = classUnderTest0.add(1439, 2707);
    
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
    org.junit.Assert.assertTrue(i33 == 4889);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 4146);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test309"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(154, 512);
    int i24 = classUnderTest0.add(331, 218);
    int i27 = classUnderTest0.add(6544, 797);
    int i30 = classUnderTest0.add(38230, 2034);
    
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
    org.junit.Assert.assertTrue(i24 == 549);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 7341);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 40264);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test310"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(298, 0);
    int i24 = classUnderTest0.add(97, 4789);
    int i27 = classUnderTest0.add(1975, 7157);
    int i30 = classUnderTest0.add(3030, 1763);
    
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
    org.junit.Assert.assertTrue(i27 == 9132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4793);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test311"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(byte)1, 208);
    int i21 = classUnderTest0.add(6953, 10573);
    
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
    org.junit.Assert.assertTrue(i21 == 17526);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test312"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(280, 940);
    int i18 = classUnderTest0.add(645, 309);
    int i21 = classUnderTest0.add(24246, 10446);
    int i24 = classUnderTest0.add(6152, 14161);
    
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
    org.junit.Assert.assertTrue(i21 == 34692);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 20313);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test313"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(269, 233);
    int i21 = classUnderTest0.add(6285, 4660);
    int i24 = classUnderTest0.add(0, 0);
    int i27 = classUnderTest0.add(37820, 16301);
    
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
    org.junit.Assert.assertTrue(i21 == 10945);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 54121);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test314"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add(270, 10);
    int i21 = classUnderTest0.add(197, 10);
    int i24 = classUnderTest0.add(3222, 2081);
    int i27 = classUnderTest0.add(22759, 5834);
    
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
    org.junit.Assert.assertTrue(i27 == 28593);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test315"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(368, 118);
    int i18 = classUnderTest0.add(4155, 549);
    int i21 = classUnderTest0.add(4629, 8508);
    int i24 = classUnderTest0.add(3098, 785);
    int i27 = classUnderTest0.add(4312, 3854);
    int i30 = classUnderTest0.add(30412, 8348);
    
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
    org.junit.Assert.assertTrue(i27 == 8166);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 38760);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test316"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(20, 153);
    int i6 = classUnderTest0.add(786, 695);
    int i9 = classUnderTest0.add(3418, 5120);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 173);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1481);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 8538);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test317"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(1296, 479);
    int i9 = classUnderTest0.add(1260, 2728);
    int i12 = classUnderTest0.add(410, 323);
    int i15 = classUnderTest0.add(0, 0);
    int i18 = classUnderTest0.add(10879, 14403);
    
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
    org.junit.Assert.assertTrue(i18 == 25282);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test318"); }


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
    int i30 = classUnderTest0.add(10214, 1903);
    
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
    org.junit.Assert.assertTrue(i30 == 12117);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test319"); }


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
    int i30 = classUnderTest0.add(1147, 870);
    int i33 = classUnderTest0.add(848, (int)(byte)-1);
    int i36 = classUnderTest0.add(4789, 7157);
    int i39 = classUnderTest0.add(5548, 6446);
    int i42 = classUnderTest0.add(0, 10978);
    
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
    org.junit.Assert.assertTrue(i30 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 847);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 11946);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 11994);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 10978);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test320"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(0, 533);
    int i21 = classUnderTest0.add(0, 332);
    int i24 = classUnderTest0.add(236, 470);
    int i27 = classUnderTest0.add(5483, 38322);
    
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
    org.junit.Assert.assertTrue(i27 == 43805);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test321"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(53, 42);
    int i24 = classUnderTest0.add((int)(byte)10, 635);
    int i27 = classUnderTest0.add(643, (int)(byte)10);
    int i30 = classUnderTest0.add(251, 15660);
    int i33 = classUnderTest0.add(1506, 706);
    int i36 = classUnderTest0.add(6346, 4041);
    int i39 = classUnderTest0.add(5208, 1044);
    
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
    org.junit.Assert.assertTrue(i27 == 653);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 15911);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2212);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 10387);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 6252);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test322"); }


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
    int i39 = classUnderTest0.add(15999, 22203);
    
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
    org.junit.Assert.assertTrue(i39 == 38202);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test323"); }


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
    int i36 = classUnderTest0.add(24168, 4074);
    
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
    org.junit.Assert.assertTrue(i36 == 28242);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test324"); }


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
    int i39 = classUnderTest0.add(12699, 21251);
    int i42 = classUnderTest0.add(22180, 21962);
    
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
    org.junit.Assert.assertTrue(i39 == 33950);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 44142);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test325"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(10, 198);
    int i18 = classUnderTest0.add(512, 153);
    int i21 = classUnderTest0.add(135, 433);
    int i24 = classUnderTest0.add(10932, 1395);
    int i27 = classUnderTest0.add(6156, 9246);
    int i30 = classUnderTest0.add(9386, 3279);
    int i33 = classUnderTest0.add(1810, 0);
    
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
    org.junit.Assert.assertTrue(i24 == 12327);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 15402);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 12665);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1810);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test326"); }


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
    int i30 = classUnderTest0.add(8662, 19520);
    
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
    org.junit.Assert.assertTrue(i30 == 28182);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test327"); }


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
    int i30 = classUnderTest0.add(503, 1291);
    int i33 = classUnderTest0.add(11941, 5358);
    
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
    org.junit.Assert.assertTrue(i30 == 1794);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 17299);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test328"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)0, 52);
    int i15 = classUnderTest0.add(0, 105);
    int i18 = classUnderTest0.add(2104, 234);
    int i21 = classUnderTest0.add(2588, 215);
    int i24 = classUnderTest0.add(173, 32365);
    
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
    org.junit.Assert.assertTrue(i21 == 2803);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 32538);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test329"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(368, 118);
    int i18 = classUnderTest0.add(7237, 9300);
    
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
    org.junit.Assert.assertTrue(i18 == 16537);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test330"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add((int)(short)-1, 35);
    int i18 = classUnderTest0.add(2288, 905);
    int i21 = classUnderTest0.add(30790, 3480);
    
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
    org.junit.Assert.assertTrue(i21 == 34270);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test331"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(612, (int)' ');
    int i9 = classUnderTest0.add(1142, 100);
    int i12 = classUnderTest0.add(551, 2718);
    int i15 = classUnderTest0.add(1431, 4660);
    int i18 = classUnderTest0.add(0, 11314);
    int i21 = classUnderTest0.add(23120, 22922);
    int i24 = classUnderTest0.add(108, 732);
    
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
    org.junit.Assert.assertTrue(i21 == 46042);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 840);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test332"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(153, (int)(byte)1);
    int i18 = classUnderTest0.add(118, (int)(byte)-1);
    int i21 = classUnderTest0.add(197, 1109);
    int i24 = classUnderTest0.add(2722, 0);
    int i27 = classUnderTest0.add(4857, 1340);
    
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
    org.junit.Assert.assertTrue(i27 == 6197);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test333"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add(770, 1170);
    int i18 = classUnderTest0.add(2120, 996);
    int i21 = classUnderTest0.add(1296, 2563);
    int i24 = classUnderTest0.add(2554, 3540);
    
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
    org.junit.Assert.assertTrue(i24 == 6094);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test334"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(368, 118);
    int i18 = classUnderTest0.add(4155, 549);
    int i21 = classUnderTest0.add(4629, 8508);
    int i24 = classUnderTest0.add(5120, 0);
    int i27 = classUnderTest0.add(5246, 6796);
    
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
    org.junit.Assert.assertTrue(i27 == 12042);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test335"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(52, 645);
    int i24 = classUnderTest0.add(665, 1052);
    int i27 = classUnderTest0.add(17254, 29047);
    
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
    org.junit.Assert.assertTrue(i27 == 46301);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test336"); }


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
    int i30 = classUnderTest0.add(2351, 4312);
    int i33 = classUnderTest0.add(7953, 3496);
    
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
    org.junit.Assert.assertTrue(i30 == 6663);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 11449);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test337"); }


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
    int i36 = classUnderTest0.add(10039, 9434);
    int i39 = classUnderTest0.add(21185, 3896);
    
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
    org.junit.Assert.assertTrue(i36 == 19473);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 25081);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test338"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(2632, 3287);
    int i18 = classUnderTest0.add((int)(short)10, 1);
    int i21 = classUnderTest0.add(214, 1431);
    int i24 = classUnderTest0.add(8760, 3963);
    int i27 = classUnderTest0.add(9337, 6129);
    
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
    org.junit.Assert.assertTrue(i24 == 12723);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 15466);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test339"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(100, 53);
    int i21 = classUnderTest0.add(611, 100);
    int i24 = classUnderTest0.add(173, 502);
    int i27 = classUnderTest0.add(205, 1715);
    int i30 = classUnderTest0.add(328, 7430);
    
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
    org.junit.Assert.assertTrue(i27 == 1920);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 7758);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test340"); }


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
    int i30 = classUnderTest0.add(1995, 20889);
    
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
    org.junit.Assert.assertTrue(i30 == 22884);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test341"); }


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
    int i36 = classUnderTest0.add(12086, 0);
    
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
    org.junit.Assert.assertTrue(i36 == 12086);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test342"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)0, 52);
    int i15 = classUnderTest0.add(1963, 4789);
    int i18 = classUnderTest0.add(4366, 6948);
    int i21 = classUnderTest0.add(180, 2343);
    int i24 = classUnderTest0.add(7615, 38703);
    
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
    org.junit.Assert.assertTrue(i24 == 46318);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test343"); }


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
    int i45 = classUnderTest0.add(2351, 3062);
    int i48 = classUnderTest0.add(24750, 267);
    
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
    org.junit.Assert.assertTrue(i45 == 5413);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 25017);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test344"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(269, 233);
    int i21 = classUnderTest0.add(6285, 4660);
    int i24 = classUnderTest0.add(0, 0);
    int i27 = classUnderTest0.add(2199, 38796);
    
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
    org.junit.Assert.assertTrue(i21 == 10945);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 40995);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test345"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add(149, 632);
    int i15 = classUnderTest0.add(0, 537);
    int i18 = classUnderTest0.add(2486, 1335);
    int i21 = classUnderTest0.add(0, 13964);
    
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
    org.junit.Assert.assertTrue(i21 == 13964);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test346"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(793, 135);
    int i18 = classUnderTest0.add(218, 1077);
    int i21 = classUnderTest0.add(1312, 4838);
    int i24 = classUnderTest0.add(2547, 4480);
    int i27 = classUnderTest0.add(2707, 2330);
    
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
    org.junit.Assert.assertTrue(i24 == 7027);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5037);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test347"); }


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
    int i30 = classUnderTest0.add(1068, 0);
    int i33 = classUnderTest0.add(13124, 20617);
    
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
    org.junit.Assert.assertTrue(i30 == 1068);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 33741);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test348"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(20, 153);
    int i6 = classUnderTest0.add(786, 695);
    int i9 = classUnderTest0.add(3277, 0);
    int i12 = classUnderTest0.add(12212, 29420);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 173);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1481);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3277);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 41632);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test349"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(1291, 3525);
    int i18 = classUnderTest0.add(9433, 2563);
    int i21 = classUnderTest0.add(3993, 33500);
    int i24 = classUnderTest0.add(3925, 3767);
    
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
    org.junit.Assert.assertTrue(i24 == 7692);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test350"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(1003, 681);
    int i6 = classUnderTest0.add(250, 2017);
    int i9 = classUnderTest0.add(341, 1170);
    int i12 = classUnderTest0.add(42516, 3858);
    int i15 = classUnderTest0.add(10352, 29340);
    int i18 = classUnderTest0.add(2555, 62515);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1684);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2267);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1511);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 46374);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 39692);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 65070);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test351"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(305, 635);
    int i15 = classUnderTest0.add(772, 36);
    int i18 = classUnderTest0.add(1083, 332);
    int i21 = classUnderTest0.add(19924, 22884);
    
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
    org.junit.Assert.assertTrue(i21 == 42808);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test352"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add((int)(byte)-1, (int)(short)1);
    int i21 = classUnderTest0.add(13874, 3768);
    
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
    org.junit.Assert.assertTrue(i21 == 17642);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test353"); }


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
    int i36 = classUnderTest0.add(12829, 14400);
    
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
    org.junit.Assert.assertTrue(i36 == 27229);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test354"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(205, 298);
    int i12 = classUnderTest0.add(243, 0);
    int i15 = classUnderTest0.add(1763, 1594);
    int i18 = classUnderTest0.add(706, 2693);
    int i21 = classUnderTest0.add(3562, 1009);
    int i24 = classUnderTest0.add(5371, 3446);
    int i27 = classUnderTest0.add(1795, 33070);
    
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
    org.junit.Assert.assertTrue(i21 == 4571);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 8817);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 34865);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test355"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(237, 1103);
    int i21 = classUnderTest0.add(633, 3766);
    int i24 = classUnderTest0.add(10797, 15660);
    
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
    org.junit.Assert.assertTrue(i24 == 26457);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test356"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(298, 0);
    int i24 = classUnderTest0.add(6920, 0);
    int i27 = classUnderTest0.add(33830, 3339);
    
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
    org.junit.Assert.assertTrue(i27 == 37169);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test357"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(52, 206);
    int i18 = classUnderTest0.add(195, 968);
    int i21 = classUnderTest0.add(32, 0);
    int i24 = classUnderTest0.add(5726, 343);
    int i27 = classUnderTest0.add(1005, 23524);
    
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
    org.junit.Assert.assertTrue(i27 == 24529);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test358"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(533, 100);
    int i15 = classUnderTest0.add(4024, 10488);
    int i18 = classUnderTest0.add(12556, 22857);
    int i21 = classUnderTest0.add(20617, 1096);
    
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
    org.junit.Assert.assertTrue(i21 == 21713);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test359"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(35, (int)(short)0);
    int i9 = classUnderTest0.add(1851, 1990);
    int i12 = classUnderTest0.add(18767, 7037);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3841);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 25804);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test360"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add((int)'4', 643);
    int i18 = classUnderTest0.add(0, 1091);
    int i21 = classUnderTest0.add(2074, 1891);
    int i24 = classUnderTest0.add(1321, 1162);
    
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
    org.junit.Assert.assertTrue(i21 == 3965);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2483);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test361"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(480, 1476);
    int i15 = classUnderTest0.add(2199, 27855);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1956);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 30054);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test362"); }


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
    int i39 = classUnderTest0.add(695, 6899);
    
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
    org.junit.Assert.assertTrue(i39 == 7594);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test363"); }


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
    int i30 = classUnderTest0.add(1147, 870);
    int i33 = classUnderTest0.add(17132, 10749);
    
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
    org.junit.Assert.assertTrue(i30 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 27881);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test364"); }


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
    int i51 = classUnderTest0.add(23058, 4620);
    
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
    org.junit.Assert.assertTrue(i51 == 27678);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test365"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(4568, 1223);
    int i15 = classUnderTest0.add(7969, 12708);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 5791);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 20677);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test366"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add((int)(byte)-1, (int)(short)1);
    int i21 = classUnderTest0.add(98, 0);
    int i24 = classUnderTest0.add(1906, 4206);
    int i27 = classUnderTest0.add(1700, 12327);
    int i30 = classUnderTest0.add(3030, 1196);
    
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
    org.junit.Assert.assertTrue(i27 == 14027);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4226);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test367"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(280, 940);
    int i18 = classUnderTest0.add(645, 309);
    int i21 = classUnderTest0.add(1683, 551);
    int i24 = classUnderTest0.add(5851, 13655);
    int i27 = classUnderTest0.add(12645, 21442);
    
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
    org.junit.Assert.assertTrue(i27 == 34087);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test368"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'a', 0);
    int i24 = classUnderTest0.add(8884, 7918);
    
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
    org.junit.Assert.assertTrue(i24 == 16802);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test369"); }


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
    int i33 = classUnderTest0.add(343, 787);
    int i36 = classUnderTest0.add(6752, 6278);
    
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
    org.junit.Assert.assertTrue(i33 == 1130);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 13030);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test370"); }


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
    int i33 = classUnderTest0.add(331, 0);
    int i36 = classUnderTest0.add(6347, 1310);
    int i39 = classUnderTest0.add(0, 8578);
    
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
    org.junit.Assert.assertTrue(i33 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 7657);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 8578);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test371"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add(1993, 0);
    int i21 = classUnderTest0.add(0, 3285);
    int i24 = classUnderTest0.add(280, 2840);
    int i27 = classUnderTest0.add(8400, 8388);
    
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
    org.junit.Assert.assertTrue(i24 == 3120);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 16788);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test372"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(151, 0);
    int i21 = classUnderTest0.add(697, 138);
    int i24 = classUnderTest0.add(644, 17371);
    int i27 = classUnderTest0.add(13714, 42516);
    
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
    org.junit.Assert.assertTrue(i27 == 56230);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test373"); }


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
    int i33 = classUnderTest0.add(208, 2716);
    
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
    org.junit.Assert.assertTrue(i33 == 2924);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test374"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(52, 95);
    int i21 = classUnderTest0.add(334, 1578);
    int i24 = classUnderTest0.add(6102, 5851);
    int i27 = classUnderTest0.add(5534, 10875);
    int i30 = classUnderTest0.add(0, 27191);
    
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
    org.junit.Assert.assertTrue(i27 == 16409);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 27191);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test375"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(35, (int)(short)0);
    int i9 = classUnderTest0.add(0, 332);
    int i12 = classUnderTest0.add(2164, 6499);
    int i15 = classUnderTest0.add(8122, 28298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 332);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 8663);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 36420);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test376"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(207, 36);
    int i18 = classUnderTest0.add(305, 5569);
    int i21 = classUnderTest0.add(8843, 29813);
    
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
    org.junit.Assert.assertTrue(i18 == 5874);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 38656);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test377"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)-1, 197);
    int i18 = classUnderTest0.add((int)(byte)0, 549);
    int i21 = classUnderTest0.add(105, 261);
    int i24 = classUnderTest0.add(2104, 1163);
    int i27 = classUnderTest0.add(8964, 10720);
    int i30 = classUnderTest0.add(30489, 4247);
    
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
    org.junit.Assert.assertTrue(i21 == 366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3267);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 19684);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 34736);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test378"); }


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
    int i30 = classUnderTest0.add(1686, 21185);
    
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
    org.junit.Assert.assertTrue(i30 == 22871);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test379"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(2057, 1220);
    int i18 = classUnderTest0.add(105, 145);
    int i21 = classUnderTest0.add(0, 2572);
    int i24 = classUnderTest0.add(405, 298);
    int i27 = classUnderTest0.add(756, 1274);
    int i30 = classUnderTest0.add(4128, 14175);
    
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
    org.junit.Assert.assertTrue(i27 == 2030);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 18303);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test380"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(898, 503);
    int i15 = classUnderTest0.add(303, 665);
    int i18 = classUnderTest0.add((int)'4', 35);
    int i21 = classUnderTest0.add(1032, 101);
    int i24 = classUnderTest0.add(20617, 32307);
    
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
    org.junit.Assert.assertTrue(i24 == 52924);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test381"); }


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
    int i30 = classUnderTest0.add(5453, 604);
    
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
    org.junit.Assert.assertTrue(i30 == 6057);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test382"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(53, 42);
    int i24 = classUnderTest0.add((int)(byte)10, 635);
    int i27 = classUnderTest0.add(1496, 1007);
    int i30 = classUnderTest0.add(10464, 4997);
    int i33 = classUnderTest0.add(4257, 4416);
    int i36 = classUnderTest0.add(6365, 0);
    
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
    org.junit.Assert.assertTrue(i27 == 2503);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 15461);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 8673);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 6365);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test383"); }


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
    int i30 = classUnderTest0.add(14563, 728);
    
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
    org.junit.Assert.assertTrue(i30 == 15291);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test384"); }


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
    int i30 = classUnderTest0.add(6369, 7237);
    
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
    org.junit.Assert.assertTrue(i30 == 13606);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test385"); }


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
    int i39 = classUnderTest0.add(3347, 17374);
    
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
    org.junit.Assert.assertTrue(i39 == 20721);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test386"); }


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
    int i36 = classUnderTest0.add(11752, 16731);
    int i39 = classUnderTest0.add(0, 29813);
    
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
    org.junit.Assert.assertTrue(i36 == 28483);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 29813);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test387"); }


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
    int i45 = classUnderTest0.add(0, 9505);
    int i48 = classUnderTest0.add(732, 7560);
    int i51 = classUnderTest0.add(2108, 7117);
    int i54 = classUnderTest0.add(4147, 29144);
    int i57 = classUnderTest0.add(6333, 29866);
    
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
    org.junit.Assert.assertTrue(i45 == 9505);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 8292);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 9225);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 33291);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 36199);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test388"); }


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
    int i39 = classUnderTest0.add(736, 879);
    int i42 = classUnderTest0.add(5133, 6083);
    int i45 = classUnderTest0.add(548, 117);
    int i48 = classUnderTest0.add(1334, 20905);
    int i51 = classUnderTest0.add(14161, 38839);
    
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
    org.junit.Assert.assertTrue(i39 == 1615);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 11216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 665);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 22239);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 53000);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test389"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(200, 34);
    int i12 = classUnderTest0.add(200, 101);
    int i15 = classUnderTest0.add(20, 612);
    int i18 = classUnderTest0.add(3561, 1975);
    int i21 = classUnderTest0.add(856, 1032);
    int i24 = classUnderTest0.add(4461, 6840);
    
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
    org.junit.Assert.assertTrue(i18 == 5536);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 11301);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test390"); }


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
    int i30 = classUnderTest0.add(38974, 12112);
    
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
    org.junit.Assert.assertTrue(i30 == 51086);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test391"); }


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
    int i33 = classUnderTest0.add(0, 3540);
    int i36 = classUnderTest0.add(25081, 35315);
    
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
    org.junit.Assert.assertTrue(i33 == 3540);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 60396);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test392"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add(154, 325);
    int i21 = classUnderTest0.add(6199, 3017);
    int i24 = classUnderTest0.add(10472, 11780);
    
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
    org.junit.Assert.assertTrue(i21 == 9216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 22252);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test393"); }


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
    int i33 = classUnderTest0.add(1953, 4226);
    
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
    org.junit.Assert.assertTrue(i33 == 6179);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test394"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(368, 118);
    int i18 = classUnderTest0.add(52, 209);
    int i21 = classUnderTest0.add(1880, 347);
    int i24 = classUnderTest0.add(233, 1083);
    int i27 = classUnderTest0.add(5073, 13275);
    
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
    org.junit.Assert.assertTrue(i24 == 1316);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 18348);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test395"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(898, 503);
    int i15 = classUnderTest0.add(207, 609);
    int i18 = classUnderTest0.add(4527, 1170);
    int i21 = classUnderTest0.add(34270, 2706);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1401);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 816);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 5697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 36976);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test396"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(898, 503);
    int i15 = classUnderTest0.add(303, 665);
    int i18 = classUnderTest0.add(6393, 961);
    int i21 = classUnderTest0.add(3220, 2306);
    int i24 = classUnderTest0.add(2702, 4409);
    int i27 = classUnderTest0.add(8138, 21847);
    
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
    org.junit.Assert.assertTrue(i18 == 7354);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5526);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 7111);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 29985);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test397"); }


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
    int i42 = classUnderTest0.add(1586, (int)'a');
    int i45 = classUnderTest0.add(38270, 5016);
    int i48 = classUnderTest0.add(914, 0);
    
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
    org.junit.Assert.assertTrue(i42 == 1683);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 43286);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 914);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test398"); }


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
    int i33 = classUnderTest0.add(7014, 5573);
    
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
    org.junit.Assert.assertTrue(i33 == 12587);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test399"); }


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
    int i30 = classUnderTest0.add(7678, 812);
    int i33 = classUnderTest0.add(17839, 4175);
    
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
    org.junit.Assert.assertTrue(i30 == 8490);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 22014);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test400"); }


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
    int i36 = classUnderTest0.add(16752, 10643);
    
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
    org.junit.Assert.assertTrue(i36 == 27395);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test401"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(368, 118);
    int i18 = classUnderTest0.add(4155, 549);
    int i21 = classUnderTest0.add(12243, 3587);
    
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
    org.junit.Assert.assertTrue(i21 == 15830);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test402"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(305, 486);
    int i21 = classUnderTest0.add(15756, 261);
    
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
    org.junit.Assert.assertTrue(i21 == 16017);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test403"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(2308, 1314);
    int i24 = classUnderTest0.add(3279, 5159);
    int i27 = classUnderTest0.add(10475, 10879);
    
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
    org.junit.Assert.assertTrue(i27 == 21354);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test404"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(100, 53);
    int i21 = classUnderTest0.add(611, 100);
    int i24 = classUnderTest0.add(215, 1163);
    int i27 = classUnderTest0.add(20222, 11126);
    
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
    org.junit.Assert.assertTrue(i24 == 1378);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 31348);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test405"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add(1993, 0);
    int i21 = classUnderTest0.add(4789, 14904);
    
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
    org.junit.Assert.assertTrue(i21 == 19693);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test406"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add((int)(short)10, 97);
    int i21 = classUnderTest0.add(0, 1399);
    int i24 = classUnderTest0.add(1249, 8355);
    int i27 = classUnderTest0.add(695, 411);
    
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
    org.junit.Assert.assertTrue(i24 == 9604);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1106);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test407"); }


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
    int i30 = classUnderTest0.add(38270, 1808);
    int i33 = classUnderTest0.add(145, 1220);
    
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
    org.junit.Assert.assertTrue(i30 == 40078);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1365);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test408"); }


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
    int i30 = classUnderTest0.add(24814, 13980);
    
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
    org.junit.Assert.assertTrue(i30 == 38794);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test409"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add((int)(byte)10, 502);
    int i21 = classUnderTest0.add(34, 298);
    int i24 = classUnderTest0.add(1534, 3569);
    
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
    org.junit.Assert.assertTrue(i24 == 5103);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test410"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add(200, 0);
    int i18 = classUnderTest0.add((int)(byte)-1, (int)(short)1);
    int i21 = classUnderTest0.add(98, 0);
    int i24 = classUnderTest0.add(1906, 4206);
    int i27 = classUnderTest0.add(1170, 2294);
    int i30 = classUnderTest0.add(14486, 7050);
    int i33 = classUnderTest0.add(16428, 12848);
    
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
    org.junit.Assert.assertTrue(i27 == 3464);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 21536);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 29276);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test411"); }


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
    int i39 = classUnderTest0.add(11528, 952);
    
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
    org.junit.Assert.assertTrue(i39 == 12480);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test412"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(280, 940);
    int i18 = classUnderTest0.add(645, 309);
    int i21 = classUnderTest0.add(1683, 551);
    int i24 = classUnderTest0.add(5851, 13655);
    int i27 = classUnderTest0.add(1, 2288);
    
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
    org.junit.Assert.assertTrue(i27 == 2289);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test413"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)0, (int)'4');
    int i18 = classUnderTest0.add(52, 796);
    int i21 = classUnderTest0.add(1163, 197);
    int i24 = classUnderTest0.add(1110, 6347);
    int i27 = classUnderTest0.add(29144, 16409);
    
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
    org.junit.Assert.assertTrue(i24 == 7457);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 45553);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test414"); }


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
    int i30 = classUnderTest0.add(182, 1631);
    
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
    org.junit.Assert.assertTrue(i30 == 1813);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test415"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(151, 0);
    int i21 = classUnderTest0.add((int)(byte)10, 0);
    int i24 = classUnderTest0.add(31881, 665);
    
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
    org.junit.Assert.assertTrue(i24 == 32546);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test416"); }


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
    int i30 = classUnderTest0.add(7430, 2076);
    int i33 = classUnderTest0.add(1044, 16990);
    int i36 = classUnderTest0.add(0, 4110);
    
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
    org.junit.Assert.assertTrue(i30 == 9506);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 18034);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 4110);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test417"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add((int)(short)0, 218);
    int i21 = classUnderTest0.add(243, 368);
    int i24 = classUnderTest0.add(208, 139);
    int i27 = classUnderTest0.add(12186, 19911);
    
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
    org.junit.Assert.assertTrue(i27 == 32097);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test418"); }


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
    int i36 = classUnderTest0.add(4188, 9469);
    int i39 = classUnderTest0.add(18266, 13001);
    
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
    org.junit.Assert.assertTrue(i36 == 13657);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 31267);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test419"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(298, 0);
    int i24 = classUnderTest0.add(97, 4789);
    int i27 = classUnderTest0.add(1975, 7157);
    int i30 = classUnderTest0.add(11785, 10109);
    
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
    org.junit.Assert.assertTrue(i27 == 9132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 21894);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test420"); }


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
    int i33 = classUnderTest0.add(21371, 11328);
    int i36 = classUnderTest0.add(4318, 12438);
    
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
    org.junit.Assert.assertTrue(i33 == 32699);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 16756);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test421"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(269, 233);
    int i21 = classUnderTest0.add(0, 5739);
    int i24 = classUnderTest0.add(29535, 2338);
    int i27 = classUnderTest0.add(3048, 2761);
    
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
    org.junit.Assert.assertTrue(i27 == 5809);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test422"); }


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
    int i30 = classUnderTest0.add(2077, 2879);
    
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
    org.junit.Assert.assertTrue(i30 == 4956);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test423"); }


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
    int i36 = classUnderTest0.add(9888, 14346);
    
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
    org.junit.Assert.assertTrue(i36 == 24234);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test424"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(34, 309);
    int i21 = classUnderTest0.add(512, 248);
    int i24 = classUnderTest0.add(2717, 0);
    int i27 = classUnderTest0.add(6663, 36636);
    
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
    org.junit.Assert.assertTrue(i27 == 43299);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test425"); }


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
    int i30 = classUnderTest0.add(12128, 26023);
    
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
    org.junit.Assert.assertTrue(i30 == 38151);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test426"); }


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
    int i42 = classUnderTest0.add(6552, 5993);
    int i45 = classUnderTest0.add(4696, 10387);
    
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
    org.junit.Assert.assertTrue(i42 == 12545);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 15083);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test427"); }


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
    int i36 = classUnderTest0.add(39133, 3413);
    int i39 = classUnderTest0.add(3399, 6296);
    
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
    org.junit.Assert.assertTrue(i36 == 42546);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 9695);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test428"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add((int)'4', 643);
    int i18 = classUnderTest0.add(420, 450);
    int i21 = classUnderTest0.add(23138, 305);
    
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
    org.junit.Assert.assertTrue(i21 == 23443);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test429"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add(651, 301);
    int i12 = classUnderTest0.add(4660, 398);
    int i15 = classUnderTest0.add(512, 1235);
    int i18 = classUnderTest0.add(4091, 34865);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 952);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 5058);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1747);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 38956);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test430"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(1163, 366);
    int i15 = classUnderTest0.add(267, 0);
    int i18 = classUnderTest0.add(118, 787);
    int i21 = classUnderTest0.add(34692, 4282);
    int i24 = classUnderTest0.add(38322, 20449);
    
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
    org.junit.Assert.assertTrue(i21 == 38974);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 58771);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test431"); }


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
    int i36 = classUnderTest0.add(6812, 1382);
    int i39 = classUnderTest0.add(7628, 7388);
    
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
    org.junit.Assert.assertTrue(i36 == 8194);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 15016);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test432"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add(107, 0);
    int i24 = classUnderTest0.add(1944, 0);
    
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
    org.junit.Assert.assertTrue(i24 == 1944);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test433"); }


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
    int i30 = classUnderTest0.add(0, 4022);
    
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
    org.junit.Assert.assertTrue(i30 == 4022);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test434"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add((int)(byte)10, 502);
    int i21 = classUnderTest0.add(5133, 1235);
    int i24 = classUnderTest0.add(40390, 2717);
    
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
    org.junit.Assert.assertTrue(i24 == 43107);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test435"); }


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
    int i33 = classUnderTest0.add(6585, 20930);
    
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
    org.junit.Assert.assertTrue(i33 == 27515);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test436"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(13480, 4284);
    int i18 = classUnderTest0.add(18714, 961);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 17764);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 19675);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test437"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(612, (int)' ');
    int i9 = classUnderTest0.add(1142, 100);
    int i12 = classUnderTest0.add(551, 2718);
    int i15 = classUnderTest0.add(1431, 4660);
    int i18 = classUnderTest0.add(0, 11314);
    int i21 = classUnderTest0.add(9748, 3221);
    int i24 = classUnderTest0.add(2005, 2737);
    int i27 = classUnderTest0.add(4248, 0);
    
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
    org.junit.Assert.assertTrue(i27 == 4248);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test438"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(502, (int)'a');
    int i12 = classUnderTest0.add(479, 433);
    int i15 = classUnderTest0.add(6336, 4384);
    int i18 = classUnderTest0.add(37279, 18855);
    int i21 = classUnderTest0.add(1306, 935);
    
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
    org.junit.Assert.assertTrue(i18 == 56134);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2241);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test439"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(2057, 1220);
    int i18 = classUnderTest0.add(105, 145);
    int i21 = classUnderTest0.add(7037, 5535);
    int i24 = classUnderTest0.add(6642, 2966);
    int i27 = classUnderTest0.add(18706, 6222);
    int i30 = classUnderTest0.add(9581, 4660);
    int i33 = classUnderTest0.add(20625, 11946);
    
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
    org.junit.Assert.assertTrue(i27 == 24928);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 14241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 32571);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test440"); }


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
    int i30 = classUnderTest0.add(4571, 4018);
    int i33 = classUnderTest0.add(332, 954);
    int i36 = classUnderTest0.add(138, 2726);
    int i39 = classUnderTest0.add(179, 6102);
    int i42 = classUnderTest0.add(0, 37148);
    int i45 = classUnderTest0.add(370, 15855);
    
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
    org.junit.Assert.assertTrue(i30 == 8589);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1286);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 6281);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 37148);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 16225);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test441"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(2632, 3287);
    int i18 = classUnderTest0.add((int)(short)10, 1);
    int i21 = classUnderTest0.add(214, 1431);
    int i24 = classUnderTest0.add(1539, 1941);
    int i27 = classUnderTest0.add(10262, 33500);
    int i30 = classUnderTest0.add(2150, 13101);
    
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
    org.junit.Assert.assertTrue(i24 == 3480);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 43762);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 15251);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test442"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(2057, 1220);
    int i18 = classUnderTest0.add(105, 145);
    int i21 = classUnderTest0.add((int)(byte)100, 2756);
    int i24 = classUnderTest0.add(11363, 6156);
    
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
    org.junit.Assert.assertTrue(i21 == 2856);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 17519);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test443"); }


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
    int i30 = classUnderTest0.add(0, 1847);
    
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
    org.junit.Assert.assertTrue(i30 == 1847);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test444"); }


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
    int i33 = classUnderTest0.add(6840, 611);
    int i36 = classUnderTest0.add(14462, 7478);
    
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
    org.junit.Assert.assertTrue(i33 == 7451);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 21940);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test445"); }


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
    int i33 = classUnderTest0.add(3139, 1813);
    
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
    org.junit.Assert.assertTrue(i33 == 4952);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test446"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add(154, 325);
    int i21 = classUnderTest0.add(808, 237);
    int i24 = classUnderTest0.add(2607, 5493);
    int i27 = classUnderTest0.add(14518, 12163);
    
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
    org.junit.Assert.assertTrue(i27 == 26681);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test447"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(100, 53);
    int i21 = classUnderTest0.add(611, 100);
    int i24 = classUnderTest0.add(173, 502);
    int i27 = classUnderTest0.add(205, 1715);
    int i30 = classUnderTest0.add(0, 3543);
    int i33 = classUnderTest0.add(15855, 4688);
    
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
    org.junit.Assert.assertTrue(i27 == 1920);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3543);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 20543);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test448"); }


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
    int i30 = classUnderTest0.add(2010, 4696);
    
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
    org.junit.Assert.assertTrue(i30 == 6706);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test449"); }


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
    int i33 = classUnderTest0.add(117, 0);
    
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
    org.junit.Assert.assertTrue(i33 == 117);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test450"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 97);
    int i15 = classUnderTest0.add(205, 10);
    int i18 = classUnderTest0.add(1, 791);
    int i21 = classUnderTest0.add(1626, 533);
    int i24 = classUnderTest0.add(946, 961);
    int i27 = classUnderTest0.add(3525, 2010);
    int i30 = classUnderTest0.add(0, 3372);
    
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
    org.junit.Assert.assertTrue(i27 == 5535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3372);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test451"); }


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
    int i33 = classUnderTest0.add(0, 2338);
    int i36 = classUnderTest0.add(1445, 4187);
    
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
    org.junit.Assert.assertTrue(i33 == 2338);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 5632);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test452"); }


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
    int i30 = classUnderTest0.add(279, 0);
    int i33 = classUnderTest0.add(4494, 3509);
    
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
    org.junit.Assert.assertTrue(i30 == 279);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 8003);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test453"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)1, (int)'#');
    int i15 = classUnderTest0.add((int)'4', 643);
    int i18 = classUnderTest0.add(0, 1091);
    int i21 = classUnderTest0.add(2074, 1891);
    int i24 = classUnderTest0.add(1044, 8898);
    
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
    org.junit.Assert.assertTrue(i21 == 3965);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 9942);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test454"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, 84);
    int i12 = classUnderTest0.add(2074, 106);
    int i15 = classUnderTest0.add(1332, 32);
    int i18 = classUnderTest0.add(8386, 8993);
    int i21 = classUnderTest0.add(745, 15451);
    int i24 = classUnderTest0.add(34427, 2474);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2180);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1364);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 17379);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 16196);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 36901);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test455"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(703, 609);
    int i18 = classUnderTest0.add(9, (int)'a');
    int i21 = classUnderTest0.add(1687, 0);
    int i24 = classUnderTest0.add(38760, 21185);
    
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
    org.junit.Assert.assertTrue(i21 == 1687);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 59945);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test456"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(100, (int)'a');
    int i15 = classUnderTest0.add(10, (int)' ');
    int i18 = classUnderTest0.add(1739, 52323);
    int i21 = classUnderTest0.add(6736, 11139);
    
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
    org.junit.Assert.assertTrue(i18 == 54062);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 17875);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test457"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(53, 42);
    int i24 = classUnderTest0.add((int)(byte)10, 635);
    int i27 = classUnderTest0.add(643, (int)(byte)10);
    int i30 = classUnderTest0.add(603, 8663);
    
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
    org.junit.Assert.assertTrue(i27 == 653);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 9266);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test458"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(53, 42);
    int i24 = classUnderTest0.add((int)(byte)10, 635);
    int i27 = classUnderTest0.add(1496, 1007);
    int i30 = classUnderTest0.add(10464, 4997);
    int i33 = classUnderTest0.add(27736, 5919);
    
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
    org.junit.Assert.assertTrue(i27 == 2503);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 15461);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 33655);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test459"); }


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
    int i30 = classUnderTest0.add(18193, 1626);
    
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
    org.junit.Assert.assertTrue(i30 == 19819);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test460"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(1, 52);
    int i18 = classUnderTest0.add(270, 10);
    int i21 = classUnderTest0.add((int)(byte)100, 53);
    int i24 = classUnderTest0.add(217, 366);
    int i27 = classUnderTest0.add(4098, 208);
    int i30 = classUnderTest0.add(2797, 14647);
    int i33 = classUnderTest0.add(3982, 9246);
    
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
    org.junit.Assert.assertTrue(i27 == 4306);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 17444);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 13228);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test461"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add(816, 311);
    int i18 = classUnderTest0.add(17374, 13876);
    int i21 = classUnderTest0.add(0, 4335);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 31250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4335);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test462"); }


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
    int i33 = classUnderTest0.add(35, 3644);
    int i36 = classUnderTest0.add(10558, 2120);
    int i39 = classUnderTest0.add(15916, 11190);
    
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
    org.junit.Assert.assertTrue(i33 == 3679);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 12678);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 27106);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test463"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(10, 217);
    int i24 = classUnderTest0.add(301, 645);
    int i27 = classUnderTest0.add(625, 3263);
    int i30 = classUnderTest0.add(6056, 17991);
    int i33 = classUnderTest0.add(13561, 10558);
    
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
    org.junit.Assert.assertTrue(i27 == 3888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 24047);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 24119);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test464"); }


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
    int i39 = classUnderTest0.add(3764, 0);
    
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
    org.junit.Assert.assertTrue(i39 == 3764);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test465"); }


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
    int i30 = classUnderTest0.add(3277, 15366);
    
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
    org.junit.Assert.assertTrue(i30 == 18643);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test466"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(234, 331);
    int i15 = classUnderTest0.add(2632, 3287);
    int i18 = classUnderTest0.add(4494, 28039);
    
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
    org.junit.Assert.assertTrue(i18 == 32533);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test467"); }


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
    int i36 = classUnderTest0.add(8007, 433);
    
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
    org.junit.Assert.assertTrue(i36 == 8440);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test468"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add(3587, 9480);
    int i21 = classUnderTest0.add(565, 5545);
    int i24 = classUnderTest0.add(6663, 5657);
    
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
    org.junit.Assert.assertTrue(i21 == 6110);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 12320);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test469"); }


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
    int i30 = classUnderTest0.add(935, 1910);
    
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
    org.junit.Assert.assertTrue(i30 == 2845);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test470"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add((int)' ', (int)(byte)0);
    int i15 = classUnderTest0.add((int)(short)-1, 207);
    int i18 = classUnderTest0.add((int)' ', 209);
    int i21 = classUnderTest0.add(323, 2104);
    int i24 = classUnderTest0.add(145, 97);
    int i27 = classUnderTest0.add(510, 4490);
    int i30 = classUnderTest0.add(0, 2303);
    int i33 = classUnderTest0.add(16589, 12086);
    int i36 = classUnderTest0.add(1784, 4755);
    
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
    org.junit.Assert.assertTrue(i27 == 5000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2303);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 28675);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 6539);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test471"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(0, (int)' ');
    int i18 = classUnderTest0.add(234, (int)'a');
    int i21 = classUnderTest0.add(1068, 0);
    int i24 = classUnderTest0.add(787, 205);
    int i27 = classUnderTest0.add(1586, 3000);
    int i30 = classUnderTest0.add(14922, 12327);
    int i33 = classUnderTest0.add(43625, 24625);
    
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
    org.junit.Assert.assertTrue(i24 == 992);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4586);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 27249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 68250);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test472"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(118, 1052);
    int i21 = classUnderTest0.add(2927, 3537);
    int i24 = classUnderTest0.add(8600, 8879);
    int i27 = classUnderTest0.add(0, 1009);
    int i30 = classUnderTest0.add(1626, 22759);
    
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
    org.junit.Assert.assertTrue(i24 == 17479);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1009);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 24385);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test473"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(348, (int)(short)10);
    int i21 = classUnderTest0.add(0, 4496);
    int i24 = classUnderTest0.add(3630, 2761);
    
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
    org.junit.Assert.assertTrue(i21 == 4496);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6391);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test474"); }


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
    int i30 = classUnderTest0.add(10978, 0);
    int i33 = classUnderTest0.add(4214, 9241);
    int i36 = classUnderTest0.add(1609, 18726);
    
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
    org.junit.Assert.assertTrue(i30 == 10978);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 13455);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 20335);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test475"); }


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
    int i42 = classUnderTest0.add(8216, 2427);
    int i45 = classUnderTest0.add(608, 19683);
    
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
    org.junit.Assert.assertTrue(i42 == 10643);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 20291);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test476"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(53, 42);
    int i24 = classUnderTest0.add((int)(byte)10, 635);
    int i27 = classUnderTest0.add(2303, 1177);
    
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
    org.junit.Assert.assertTrue(i27 == 3480);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test477"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(5620, 1626);
    int i21 = classUnderTest0.add(23443, 11372);
    
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
    org.junit.Assert.assertTrue(i18 == 7246);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 34815);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test478"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, 269);
    int i15 = classUnderTest0.add(10, 198);
    int i18 = classUnderTest0.add(512, 153);
    int i21 = classUnderTest0.add(135, 433);
    int i24 = classUnderTest0.add(940, 42);
    int i27 = classUnderTest0.add(7960, 7861);
    
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
    org.junit.Assert.assertTrue(i27 == 15821);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test479"); }


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
    int i36 = classUnderTest0.add(1995, 0);
    int i39 = classUnderTest0.add(12555, 2719);
    
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
    org.junit.Assert.assertTrue(i36 == 1995);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 15274);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test480"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)(byte)-1, 234);
    int i15 = classUnderTest0.add(98, 53);
    int i18 = classUnderTest0.add(1, (int)(short)-1);
    int i21 = classUnderTest0.add((int)'a', 0);
    int i24 = classUnderTest0.add(4974, 32611);
    
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
    org.junit.Assert.assertTrue(i24 == 37585);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test481"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(791, 107);
    int i21 = classUnderTest0.add(2308, 1314);
    int i24 = classUnderTest0.add(5483, 36);
    
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
    org.junit.Assert.assertTrue(i24 == 5519);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test482"); }


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
    int i36 = classUnderTest0.add(7574, 15999);
    
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
    org.junit.Assert.assertTrue(i36 == 23573);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test483"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add(34, 309);
    int i21 = classUnderTest0.add(1665, 625);
    int i24 = classUnderTest0.add(4008, 102);
    int i27 = classUnderTest0.add(451, 5518);
    int i30 = classUnderTest0.add(816, 2487);
    
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
    org.junit.Assert.assertTrue(i21 == 2290);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4110);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5969);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3303);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test484"); }


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
    int i36 = classUnderTest0.add(449, 644);
    int i39 = classUnderTest0.add(4177, 11584);
    
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
    org.junit.Assert.assertTrue(i36 == 1093);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 15761);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test485"); }


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
    int i33 = classUnderTest0.add(2990, 2015);
    int i36 = classUnderTest0.add(5836, 16941);
    
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
    org.junit.Assert.assertTrue(i33 == 5005);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 22777);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test486"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add(35, (int)(byte)-1);
    int i12 = classUnderTest0.add((int)'#', 234);
    int i15 = classUnderTest0.add(366, 269);
    int i18 = classUnderTest0.add(100, 53);
    int i21 = classUnderTest0.add(28056, 1077);
    
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
    org.junit.Assert.assertTrue(i21 == 29133);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test487"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add(0, 35);
    int i15 = classUnderTest0.add(118, 118);
    int i18 = classUnderTest0.add(0, 4646);
    int i21 = classUnderTest0.add(2808, 11489);
    
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
    org.junit.Assert.assertTrue(i18 == 4646);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 14297);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test488"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add(107, 0);
    int i21 = classUnderTest0.add(100, 433);
    int i24 = classUnderTest0.add(479, 0);
    int i27 = classUnderTest0.add(253, 322);
    
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
    org.junit.Assert.assertTrue(i24 == 479);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 575);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test489"); }


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
    int i33 = classUnderTest0.add(946, 2294);
    int i36 = classUnderTest0.add(3399, 25105);
    
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
    org.junit.Assert.assertTrue(i33 == 3240);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 28504);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test490"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add(53, 0);
    int i15 = classUnderTest0.add(703, 609);
    int i18 = classUnderTest0.add(9, (int)'a');
    int i21 = classUnderTest0.add(147, 1296);
    int i24 = classUnderTest0.add(1576, 3854);
    int i27 = classUnderTest0.add(22668, 4704);
    int i30 = classUnderTest0.add(3464, (int)'#');
    
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
    org.junit.Assert.assertTrue(i24 == 5430);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 27372);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3499);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test491"); }


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
    int i30 = classUnderTest0.add(3285, 3259);
    int i33 = classUnderTest0.add(4501, 6080);
    
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
    org.junit.Assert.assertTrue(i30 == 6544);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 10581);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test492"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)0, 52);
    int i15 = classUnderTest0.add(0, 105);
    int i18 = classUnderTest0.add(2104, 234);
    int i21 = classUnderTest0.add(5413, 5194);
    
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
    org.junit.Assert.assertTrue(i21 == 10607);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test493"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add(98, (int)(byte)-1);
    int i18 = classUnderTest0.add((int)(short)10, 97);
    int i21 = classUnderTest0.add(12849, 8856);
    
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
    org.junit.Assert.assertTrue(i21 == 21705);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test494"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add(10, (int)(short)0);
    int i12 = classUnderTest0.add((int)(byte)-1, 1);
    int i15 = classUnderTest0.add((int)(byte)0, 100);
    int i18 = classUnderTest0.add((int)(short)10, 32);
    int i21 = classUnderTest0.add(503, 217);
    int i24 = classUnderTest0.add(1250, 149);
    int i27 = classUnderTest0.add(3070, 8943);
    int i30 = classUnderTest0.add(5198, 2290);
    
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
    org.junit.Assert.assertTrue(i27 == 12013);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 7488);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test495"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(35, (int)(short)0);
    int i9 = classUnderTest0.add(1609, 154);
    int i12 = classUnderTest0.add(10357, 7487);
    int i15 = classUnderTest0.add(20291, 15557);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1763);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 17844);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 35848);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test496"); }


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
    int i33 = classUnderTest0.add(3569, 197);
    int i36 = classUnderTest0.add(6278, 400);
    int i39 = classUnderTest0.add(28291, 9631);
    int i42 = classUnderTest0.add(9256, 2423);
    
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
    org.junit.Assert.assertTrue(i33 == 3766);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 6678);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 37922);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 11679);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test497"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add(0, (int)(short)10);
    int i9 = classUnderTest0.add((int)(byte)-1, 35);
    int i12 = classUnderTest0.add(149, 217);
    int i15 = classUnderTest0.add(200, 233);
    int i18 = classUnderTest0.add((int)(byte)1, 786);
    int i21 = classUnderTest0.add(549, 1594);
    int i24 = classUnderTest0.add(2155, 118);
    int i27 = classUnderTest0.add(10390, 9794);
    
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
    org.junit.Assert.assertTrue(i24 == 2273);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 20184);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test498"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'4', (int)(short)1);
    int i9 = classUnderTest0.add((int)(byte)10, 98);
    int i12 = classUnderTest0.add((int)(byte)100, 100);
    int i15 = classUnderTest0.add((int)(byte)100, 98);
    int i18 = classUnderTest0.add(206, 97);
    int i21 = classUnderTest0.add(2381, 899);
    int i24 = classUnderTest0.add(10413, 11874);
    int i27 = classUnderTest0.add(4437, 4308);
    
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
    org.junit.Assert.assertTrue(i24 == 22287);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 8745);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test499"); }


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
    int i30 = classUnderTest0.add(4188, 3267);
    int i33 = classUnderTest0.add(9265, 8490);
    
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
    org.junit.Assert.assertTrue(i30 == 7455);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 17755);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test500"); }


    ClassUnderTest classUnderTest0 = new ClassUnderTest();
    int i3 = classUnderTest0.add(0, (int)'#');
    int i6 = classUnderTest0.add((int)'a', 1);
    int i9 = classUnderTest0.add((int)(short)100, (int)(short)0);
    int i12 = classUnderTest0.add(0, (int)(short)-1);
    int i15 = classUnderTest0.add((int)(byte)0, (int)'4');
    int i18 = classUnderTest0.add(52, 796);
    int i21 = classUnderTest0.add(611, 1791);
    int i24 = classUnderTest0.add(1997, 982);
    
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
    org.junit.Assert.assertTrue(i24 == 2979);

  }

}
