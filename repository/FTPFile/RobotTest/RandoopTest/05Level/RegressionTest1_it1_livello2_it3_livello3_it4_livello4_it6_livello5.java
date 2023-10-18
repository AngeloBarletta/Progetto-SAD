package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1_it1_livello2_it3_livello3_it4_livello4_it6_livello5 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test01"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.getName();
    boolean b8 = fTPFile0.isUnknown();
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    fTPFile0.setRawListing("?---------    0          ?---------    0                         -1 null       -1 null");
    java.util.Calendar calendar15 = fTPFile0.getTimestamp();
    fTPFile0.setRawListing("?---------    0          ?---------    0          ?---------    0                         -1 null       -1 null       -1 ?---------    0                         -1 null");
    boolean b18 = fTPFile0.isSymbolicLink();
    fTPFile0.setLink("?---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test02"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount(2);
    boolean b9 = fTPFile0.isSymbolicLink();
    boolean b10 = fTPFile0.isUnknown();
    fTPFile0.setHardLinkCount(0);
    java.lang.String str13 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test03"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setHardLinkCount(2);
    boolean b11 = fTPFile0.isDirectory();
    fTPFile0.setUser("?---------    0 ?---------    0                          0 null ?---------    0                         -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test04"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    boolean b3 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(10);
    java.lang.String str6 = fTPFile0.getName();
    boolean b7 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test05"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType(3);
    boolean b5 = fTPFile0.isValid();
    java.lang.String str6 = fTPFile0.getLink();
    long long7 = fTPFile0.getSize();
    fTPFile0.setGroup("?---------  100          ?---------    0                         -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 10L);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test06"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    fTPFile0.setType((int)(byte)-1);
    boolean b9 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    fTPFile0.setType((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test07"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setGroup("?---------    0                         -1 null");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isUnknown();
    boolean b5 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test08"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.getName();
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str9 = fTPFile0.getName();
    int i10 = fTPFile0.getHardLinkCount();
    fTPFile0.setLink("?---------   -1                          0 null");
    int i13 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test09"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setGroup("?---------    0                         -1 null");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setGroup("?---------   -1                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test10"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.getUser();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    fTPFile0.setType((-1));
    fTPFile0.setRawListing("?---------    0                         32 null");
    java.lang.String str13 = fTPFile0.getGroup();
    java.lang.String str14 = fTPFile0.getGroup();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)'a', 2, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test11"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.getName();
    boolean b8 = fTPFile0.isUnknown();
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    int i13 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0          ?---------    0                         -1 null       -1 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test12"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setGroup("?---------    0                         -1 null");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str8 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 null"+ "'", str8.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test13"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.getUser();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    fTPFile0.setType((-1));
    boolean b11 = fTPFile0.isDirectory();
    boolean b12 = fTPFile0.isFile();
    fTPFile0.setRawListing("?---------    0                         -1 ?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test14"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.getUser();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    boolean b9 = fTPFile0.isFile();
    fTPFile0.setHardLinkCount((int)'a');
    fTPFile0.setName("?---------    0                         -1 ?---------    0                         -1 null");
    java.lang.String str14 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test15"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.getUser();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    boolean b9 = fTPFile0.isFile();
    long long10 = fTPFile0.getSize();
    fTPFile0.setType((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test16"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.getName();
    fTPFile0.setSize((long)'4');
    int i10 = fTPFile0.getHardLinkCount();
    int i11 = fTPFile0.getType();
    java.util.Calendar calendar12 = null;
    fTPFile0.setTimestamp(calendar12);
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = fTPFile0.hasPermission((int)(short)0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test17"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setGroup("?---------    0                         -1 null");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isUnknown();
    int i5 = fTPFile0.getHardLinkCount();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test18"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.getName();
    boolean b8 = fTPFile0.isUnknown();
    int i9 = fTPFile0.getType();
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    boolean b11 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test19"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    fTPFile0.setSize((long)(short)1);
    boolean b9 = fTPFile0.isUnknown();
    boolean b10 = fTPFile0.isValid();
    int i11 = fTPFile0.getType();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str15 = fTPFile0.toFormattedString("?---------    0                         52 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------   35                          1 null"+ "'", str15.equals("?---------   35                          1 null"));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test20"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.getName();
    java.lang.String str8 = fTPFile0.toString();
    boolean b9 = fTPFile0.isDirectory();
    fTPFile0.setLink("?---------    1                         -1 null");
    boolean b12 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test21"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.getName();
    fTPFile0.setSize((long)'4');
    boolean b10 = fTPFile0.isFile();
    java.lang.String str11 = fTPFile0.getLink();
    boolean b12 = fTPFile0.isUnknown();
    boolean b13 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test22"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.getUser();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    boolean b9 = fTPFile0.isFile();
    java.lang.String str10 = fTPFile0.getName();
    java.lang.String str11 = fTPFile0.getGroup();
    java.lang.String str12 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                          0 null"+ "'", str12.equals("?---------    0                          0 null"));

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test23"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.getUser();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    boolean b9 = fTPFile0.isFile();
    java.lang.String str10 = fTPFile0.getName();
    boolean b11 = fTPFile0.isFile();
    java.lang.String str12 = fTPFile0.getLink();
    java.lang.String str13 = fTPFile0.toString();
    java.util.Calendar calendar14 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar14);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test24"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("?---------    0                         -1 null");
    fTPFile0.setGroup("?---------    0                         -1 null");
    java.lang.String str5 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test25"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.getName();
    boolean b8 = fTPFile0.isUnknown();
    fTPFile0.setLink("hi!");
    boolean b11 = fTPFile0.isValid();
    long long12 = fTPFile0.getSize();
    fTPFile0.setGroup("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test26"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.isDirectory();
    boolean b7 = fTPFile0.isSymbolicLink();
    boolean b8 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test27"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.toFormattedString();
    java.lang.String str9 = fTPFile0.toFormattedString("hi!");
    long long10 = fTPFile0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)-1, (int)'4', false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                          0 null"+ "'", str7.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                          0 null"+ "'", str9.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test28"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.getUser();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setUser("");
    boolean b12 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                          0 null"+ "'", str9.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test29"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.getName();
    boolean b8 = fTPFile0.isUnknown();
    fTPFile0.setLink("hi!");
    boolean b11 = fTPFile0.isValid();
    long long12 = fTPFile0.getSize();
    fTPFile0.setUser("?---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test30"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.getUser();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    fTPFile0.setType((-1));
    fTPFile0.setRawListing("?---------    0                         32 null");
    fTPFile0.setType((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test31"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setGroup("?---------    0                         -1 null");
    long long3 = fTPFile0.getSize();
    fTPFile0.setSize(0L);
    fTPFile0.setUser("?---------    1                         -1 null");
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test32"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.isDirectory();
    fTPFile0.setUser("?---------    0                          0 null");
    fTPFile0.setName("?---------   35                          1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test33"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    java.lang.String str3 = fTPFile0.getGroup();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setHardLinkCount(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test34"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.getName();
    fTPFile0.setSize((long)'4');
    boolean b10 = fTPFile0.isUnknown();
    long long11 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 52L);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test35"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("?---------    0                         -1 null");
    fTPFile0.setGroup("?---------    0                         -1 null");
    java.lang.String str5 = fTPFile0.getLink();
    int i6 = fTPFile0.getHardLinkCount();
    long long7 = fTPFile0.getSize();
    java.lang.String str8 = fTPFile0.getGroup();
    boolean b9 = fTPFile0.isDirectory();
    fTPFile0.setGroup("?---------   35                          1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 null"+ "'", str8.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test36"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.getUser();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    boolean b9 = fTPFile0.isFile();
    fTPFile0.setUser("?---------    0                         -1 null");
    java.lang.String str12 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test37"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    long long3 = fTPFile0.getSize();
    fTPFile0.setPermission(0, 2, false);
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str10 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test38"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.getName();
    boolean b8 = fTPFile0.isUnknown();
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    fTPFile0.setUser("hi!");
    boolean b15 = fTPFile0.isUnknown();
    fTPFile0.setHardLinkCount(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test39"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.getName();
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setLink("?---------    2                          0 null");
    fTPFile0.setHardLinkCount((int)'a');
    java.util.Calendar calendar14 = null;
    fTPFile0.setTimestamp(calendar14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                          0 null"+ "'", str9.equals("?---------    0                          0 null"));

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test40"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount(2);
    boolean b9 = fTPFile0.isSymbolicLink();
    boolean b10 = fTPFile0.isUnknown();
    java.lang.String str11 = fTPFile0.getName();
    fTPFile0.setType((int)(short)-1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = fTPFile0.hasPermission((int)' ', (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test41"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.toFormattedString();
    fTPFile0.setHardLinkCount((int)(short)0);
    fTPFile0.setPermission((int)(short)1, (int)(short)1, false);
    java.util.Calendar calendar14 = null;
    fTPFile0.setTimestamp(calendar14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                          0 null"+ "'", str7.equals("?---------    0                          0 null"));

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test42"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.getName();
    fTPFile0.setSize((long)'4');
    int i10 = fTPFile0.getHardLinkCount();
    boolean b11 = fTPFile0.isSymbolicLink();
    java.lang.String str12 = fTPFile0.getLink();
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = fTPFile0.hasPermission(100, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test43"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.getUser();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setUser("");
    java.util.Calendar calendar12 = fTPFile0.getTimestamp();
    fTPFile0.setHardLinkCount(3);
    fTPFile0.setRawListing("?---------    0          ?---------    0                         -1 null       -1 null");
    java.lang.String str17 = fTPFile0.toString();
    boolean b18 = fTPFile0.isDirectory();
    boolean b19 = fTPFile0.isUnknown();
    java.lang.String str20 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                          0 null"+ "'", str9.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "?---------    0          ?---------    0                         -1 null       -1 null"+ "'", str17.equals("?---------    0          ?---------    0                         -1 null       -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test44"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.getUser();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setUser("");
    java.util.Calendar calendar12 = fTPFile0.getTimestamp();
    boolean b13 = fTPFile0.isUnknown();
    fTPFile0.setName("hi!");
    java.lang.String str16 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                          0 null"+ "'", str9.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test45"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.getName();
    java.lang.String str9 = fTPFile0.toFormattedString("");
    boolean b10 = fTPFile0.isDirectory();
    boolean b11 = fTPFile0.isDirectory();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(0, 3, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                          0 null"+ "'", str9.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test46"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.getUser();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    int i9 = fTPFile0.getType();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0 ?---------    0                          0 null ?---------    0                         -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          0 null"+ "'", str11.equals("?---------    0                          0 null"));

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test47"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.toString();
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                         -1 null");
    boolean b10 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                          0 null"+ "'", str9.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test48"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setGroup("?---------    0                         -1 null");
    long long3 = fTPFile0.getSize();
    fTPFile0.setName("");
    boolean b6 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getUser();
    fTPFile0.setRawListing("?---------    0                         10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test49"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.getName();
    boolean b8 = fTPFile0.isUnknown();
    fTPFile0.setLink("hi!");
    java.lang.String str11 = fTPFile0.getUser();
    int i12 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test50"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setGroup("?---------    0                         -1 null");
    boolean b3 = fTPFile0.isUnknown();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    2                          0 null");
    java.lang.String str7 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0          ?---------    0                         -1 null       -1 null"+ "'", str6.equals("?---------    0          ?---------    0                         -1 null       -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test51"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setRawListing("?---------    0                         -1 null");
    fTPFile0.setHardLinkCount((int)(short)10);
    fTPFile0.setHardLinkCount((int)(short)1);
    long long9 = fTPFile0.getSize();
    java.lang.String str10 = fTPFile0.toString();
    boolean b11 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 null"+ "'", str10.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test52"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setGroup("?---------    0                         -1 null");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setType((int)(short)100);
    fTPFile0.setName("");
    fTPFile0.setType((int)(byte)10);
    java.lang.String str12 = fTPFile0.toFormattedString("?---------    0          ?---------    0                         -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0          ?---------    0                         -1 null       -1 "+ "'", str12.equals("?---------    0          ?---------    0                         -1 null       -1 "));

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test53"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(0L);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setHardLinkCount(2);
    boolean b11 = fTPFile0.isDirectory();
    java.lang.String str12 = fTPFile0.getRawListing();
    java.lang.String str13 = fTPFile0.toFormattedString();
    int i14 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    2                          0 null"+ "'", str13.equals("?---------    2                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);

  }

}
