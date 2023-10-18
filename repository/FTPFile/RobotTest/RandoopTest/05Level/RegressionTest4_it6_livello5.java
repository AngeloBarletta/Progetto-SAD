package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4_it6_livello5 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test001"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------    0                          0 ?---------    0                          0 null");
    boolean b7 = fTPFile0.isDirectory();
    java.lang.String str8 = fTPFile0.getLink();
    boolean b9 = fTPFile0.isDirectory();
    int i10 = fTPFile0.getType();
    fTPFile0.setName("?---------   35                         -1 ?---------    0                          0 ?---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test002"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    java.lang.String str7 = fTPFile0.toFormattedString("?---------    0                          0 null");
    fTPFile0.setUser("?---------    0                         -1 ");
    java.lang.String str10 = fTPFile0.getName();
    boolean b11 = fTPFile0.isSymbolicLink();
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = fTPFile0.hasPermission(3, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------   35                         -1 null"+ "'", str5.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   35                         -1 null"+ "'", str7.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test003"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b11 = fTPFile0.hasPermission(1, 1);
    long long12 = fTPFile0.getSize();
    java.lang.String str13 = fTPFile0.getName();
    java.util.Calendar calendar14 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar14);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test004"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("?---------    0                         -1 ");
    boolean b5 = fTPFile0.isUnknown();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(0);
    boolean b11 = fTPFile0.hasPermission(0, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test005"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                          0 null");
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    fTPFile0.setGroup("?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 ?---------    0          hi!             0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test006"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setName("?---------    0                         -1 ?---------    0                         -1 ");
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setGroup("?---------    0 ?---------   35          ?---------   35          hi!            -1 null       -1 null ?---------    0                         -1 hi!        0 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test007"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b11 = fTPFile0.hasPermission(1, 1);
    fTPFile0.setLink("");
    fTPFile0.setSize((long)(byte)-1);
    fTPFile0.setGroup("?---------   -1          ?---------    0                         -1 hi!       -1 ?---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test008"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test009"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                         -1 hi!");
    int i12 = fTPFile0.getHardLinkCount();
    fTPFile0.setGroup("?---------    0                          0 ?---------    0          hi!             0 null");
    int i15 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          0 null"+ "'", str11.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test010"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    int i4 = fTPFile0.getHardLinkCount();
    boolean b5 = fTPFile0.isSymbolicLink();
    int i6 = fTPFile0.getType();
    boolean b7 = fTPFile0.isUnknown();
    java.lang.String str8 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test011"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                          0 null");
    boolean b8 = fTPFile0.isFile();
    fTPFile0.setGroup("?---------    0          hi!            10 hi!");
    fTPFile0.setRawListing("?---------    0          ?---------    0 ?---------    0                          0 null                 0 null       10 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test012"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    fTPFile0.setHardLinkCount(2);
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str10 = fTPFile0.toFormattedString();
    boolean b11 = fTPFile0.isDirectory();
    boolean b12 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    2                          0 ?---------    0                          0 null"+ "'", str10.equals("?---------    2                          0 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test013"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setName("?---------    0                         -1 ?---------    0                         -1 ");
    fTPFile0.setLink("?---------    0 ?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null                 0 null");
    fTPFile0.setSize(0L);
    fTPFile0.setHardLinkCount((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test014"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.hasPermission((int)(byte)0, 0);
    java.lang.String str8 = fTPFile0.toString();
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test015"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    fTPFile0.setHardLinkCount((int)'4');
    java.lang.String str5 = fTPFile0.getName();
    int i6 = fTPFile0.getType();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                         -1 ?---------    0                          0 null");
    fTPFile0.setUser("?---------    0          ?---------    0                         -1 null       10 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------   52                         -1 hi!"+ "'", str9.equals("?---------   52                         -1 hi!"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test016"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str8 = fTPFile0.toFormattedString("?---------   35                         -1 null");
    boolean b9 = fTPFile0.isSymbolicLink();
    int i10 = fTPFile0.getHardLinkCount();
    boolean b11 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 "+ "'", str8.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test017"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    int i5 = fTPFile0.getHardLinkCount();
    fTPFile0.setHardLinkCount(0);
    fTPFile0.setHardLinkCount(1);
    java.lang.String str11 = fTPFile0.toFormattedString("?---------   35          hi!            -1 null");
    java.lang.String str12 = fTPFile0.getLink();
    boolean b13 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    1                          0 null"+ "'", str11.equals("?---------    1                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test018"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    fTPFile0.setUser("");
    java.lang.String str8 = fTPFile0.getName();
    fTPFile0.setGroup("");
    java.lang.String str11 = fTPFile0.getLink();
    int i12 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test019"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    boolean b3 = fTPFile0.isUnknown();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    boolean b6 = fTPFile0.isSymbolicLink();
    int i7 = fTPFile0.getType();
    fTPFile0.setType((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test020"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    fTPFile0.setName("?---------    0                         -1 ");
    java.lang.String str8 = fTPFile0.getGroup();
    fTPFile0.setGroup("?---------    0                         -1 hi!");
    boolean b11 = fTPFile0.isSymbolicLink();
    fTPFile0.setType(10);
    boolean b14 = fTPFile0.isUnknown();
    fTPFile0.setType((int)' ');
    java.lang.String str17 = fTPFile0.toFormattedString();
    fTPFile0.setSize((long)(short)10);
    java.lang.String str20 = fTPFile0.getGroup();
    boolean b21 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "?---------    0          ?---------    0                         -1 hi!        0 ?---------    0                         -1 "+ "'", str17.equals("?---------    0          ?---------    0                         -1 hi!        0 ?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "?---------    0                         -1 hi!"+ "'", str20.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test021"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    java.lang.String str7 = fTPFile0.getGroup();
    fTPFile0.setType((int)' ');
    boolean b12 = fTPFile0.hasPermission(2, 0);
    boolean b13 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("?---------    3                         -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test022"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    long long6 = fTPFile0.getSize();
    fTPFile0.setUser("?---------    0                          0 null");
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setRawListing("?---------   35                         -1 null");
    int i12 = fTPFile0.getHardLinkCount();
    int i13 = fTPFile0.getHardLinkCount();
    java.lang.String str14 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0 ?---------    0                          0 null                 0 null"+ "'", str9.equals("?---------    0 ?---------    0                          0 null                 0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------   35                         -1 null"+ "'", str14.equals("?---------   35                         -1 null"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test023"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.hasPermission((int)(byte)1, (int)(short)1);
    boolean b7 = fTPFile0.isValid();
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                         -1 hi!");
    java.lang.String str10 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                          0 null"+ "'", str9.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test024"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    java.lang.String str7 = fTPFile0.toFormattedString("?---------    0                          0 null");
    fTPFile0.setUser("?---------    0                         -1 ");
    fTPFile0.setRawListing("?---------    0                         -1 ");
    java.util.Calendar calendar12 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)(short)10);
    fTPFile0.setPermission((int)(short)1, (int)(byte)1, true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------   35                         -1 null"+ "'", str5.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   35                         -1 null"+ "'", str7.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar12);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test025"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    boolean b7 = fTPFile0.isUnknown();
    java.lang.String str8 = fTPFile0.getUser();
    fTPFile0.setType(3);
    fTPFile0.setSize(1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test026"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    fTPFile0.setGroup("?---------    0 ?---------    0                         -1                  0 null");
    fTPFile0.setSize((long)35);
    boolean b13 = fTPFile0.isValid();
    java.lang.String str14 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test027"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setLink("");
    java.lang.String str8 = fTPFile0.getRawListing();
    boolean b9 = fTPFile0.isSymbolicLink();
    java.lang.String str10 = fTPFile0.getLink();
    fTPFile0.setUser("?---------   35          hi!            -1 null");
    fTPFile0.setGroup("");
    boolean b15 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test028"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------    0                          0 ?---------    0                          0 null");
    boolean b7 = fTPFile0.isDirectory();
    java.lang.String str8 = fTPFile0.getLink();
    java.lang.String str9 = fTPFile0.toFormattedString();
    java.lang.String str10 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!"+ "'", str9.equals("?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str10.equals("?---------    0                          0 ?---------    0                          0 null"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test029"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("?---------    0                         -1 ");
    boolean b5 = fTPFile0.isUnknown();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setName("?---------    0          ?---------    0                         -1 null       10 hi!");
    fTPFile0.setLink("?-w-------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test030"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isSymbolicLink();
    int i5 = fTPFile0.getHardLinkCount();
    java.lang.String str6 = fTPFile0.toString();
    int i7 = fTPFile0.getType();
    boolean b8 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test031"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.toString();
    boolean b7 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test032"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("");
    fTPFile0.setGroup("?---------   35          hi!            -1 null");
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setRawListing("?---------    2 ?---------    0          hi!             0 null                 0 ?---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test033"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------    0                          0 ?---------    0                          0 null");
    boolean b7 = fTPFile0.isDirectory();
    boolean b8 = fTPFile0.isFile();
    fTPFile0.setUser("?---------    0                         -1 ?---------    0                          0 null");
    boolean b11 = fTPFile0.isUnknown();
    java.util.Calendar calendar12 = fTPFile0.getTimestamp();
    java.lang.String str13 = fTPFile0.toFormattedString();
    java.lang.String str14 = fTPFile0.toFormattedString();
    boolean b15 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0 ?---------    0                         -1 ?---------    0                          0 null ?---------    0                          0 ?---------    0                          0 null       -1 hi!"+ "'", str13.equals("?---------    0 ?---------    0                         -1 ?---------    0                          0 null ?---------    0                          0 ?---------    0                          0 null       -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    0 ?---------    0                         -1 ?---------    0                          0 null ?---------    0                          0 ?---------    0                          0 null       -1 hi!"+ "'", str14.equals("?---------    0 ?---------    0                         -1 ?---------    0                          0 null ?---------    0                          0 ?---------    0                          0 null       -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test034"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    java.lang.String str2 = fTPFile0.getName();
    fTPFile0.setLink("?---------   35          hi!            -1 ?---------    0          hi!             0 null");
    boolean b5 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test035"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    fTPFile0.setUser("");
    java.lang.String str8 = fTPFile0.getName();
    fTPFile0.setGroup("");
    int i11 = fTPFile0.getType();
    java.lang.String str12 = fTPFile0.getUser();
    fTPFile0.setRawListing("?---------    0 ?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!                 0 null");
    java.lang.String str15 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------   35                         -1 null"+ "'", str15.equals("?---------   35                         -1 null"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test036"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    fTPFile0.setName("?---------    0                          0 ");
    fTPFile0.setRawListing("l---------    0          ?---------    0                          0 ?---------    0                          0 null        0 null");
    fTPFile0.setLink("?---------    0 ?---------    0                          0 null                 0 ?---------    2                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test037"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    java.lang.String str6 = fTPFile0.getRawListing();
    boolean b7 = fTPFile0.isUnknown();
    int i8 = fTPFile0.getHardLinkCount();
    java.lang.String str9 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test038"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("?---------   35          hi!            -1 null");
    long long7 = fTPFile0.getSize();
    fTPFile0.setRawListing("?---------    0                         10 hi!");
    fTPFile0.setRawListing("?---------   32                          0 null");
    java.lang.String str12 = fTPFile0.getLink();
    int i13 = fTPFile0.getType();
    fTPFile0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test039"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0                         -1 ");
    boolean b6 = fTPFile0.isUnknown();
    fTPFile0.setGroup("?---------    0                         -1 hi!");
    fTPFile0.setRawListing("?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!");
    fTPFile0.setGroup("?---------    0                          0 null");
    fTPFile0.setUser("?---------    0                         -1 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test040"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0                         -1 ");
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    int i8 = fTPFile0.getType();
    java.lang.String str10 = fTPFile0.toFormattedString("?---------    0                          0 null");
    java.lang.String str11 = fTPFile0.getLink();
    boolean b12 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0 ?---------    0                         -1                  0 null"+ "'", str10.equals("?---------    0 ?---------    0                         -1                  0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test041"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0                         -1 ");
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    fTPFile0.setUser("");
    long long10 = fTPFile0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = fTPFile0.hasPermission(32, 32);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test042"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    fTPFile0.setHardLinkCount((int)'4');
    fTPFile0.setHardLinkCount((int)(short)100);
    java.lang.String str7 = fTPFile0.toString();
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1                  0 null");
    java.lang.String str10 = fTPFile0.getGroup();
    java.lang.String str11 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0 ?---------    0                         -1                  0 null"+ "'", str11.equals("?---------    0 ?---------    0                         -1                  0 null"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test043"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    0                          0 null");
    fTPFile0.setName("?---------    0                          0 null");
    fTPFile0.setType((int)'4');
    fTPFile0.setUser("?---------    0                          0 ?---------    0                         -1 ");
    java.lang.String str13 = fTPFile0.toString();
    java.lang.String str15 = fTPFile0.toFormattedString("?---------    0                         10 hi!");
    java.lang.String str16 = fTPFile0.toFormattedString();
    boolean b17 = fTPFile0.isValid();
    fTPFile0.setSize((long)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 "+ "'", str6.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null"+ "'", str15.equals("?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null"+ "'", str16.equals("?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test044"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    long long6 = fTPFile0.getSize();
    fTPFile0.setUser("?---------    0                          0 null");
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setRawListing("?---------   35                         -1 null");
    int i12 = fTPFile0.getHardLinkCount();
    int i13 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0 ?---------   35          ?---------   35          hi!            -1 null       -1 null ?---------    0                         -1 hi!        0 hi!");
    fTPFile0.setHardLinkCount((int)(byte)1);
    boolean b18 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0 ?---------    0                          0 null                 0 null"+ "'", str9.equals("?---------    0 ?---------    0                          0 null                 0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test045"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    java.lang.String str3 = fTPFile0.toFormattedString();
    java.lang.String str4 = fTPFile0.toString();
    boolean b5 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test046"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("?---------    0                         -1 ");
    boolean b5 = fTPFile0.isUnknown();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isSymbolicLink();
    boolean b8 = fTPFile0.isSymbolicLink();
    fTPFile0.setName("?---------    0 ?---------    0                         -1 ?---------    0                         -1                 -1 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test047"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0                         -1 ");
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    fTPFile0.setSize((long)2);
    java.lang.String str10 = fTPFile0.getGroup();
    java.lang.String str12 = fTPFile0.toFormattedString("?---------    0 ?---------    0                          0 null                 0 null");
    boolean b13 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0 ?---------    0                         -1                  2 null"+ "'", str12.equals("?---------    0 ?---------    0                         -1                  2 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test048"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    fTPFile0.setUser("");
    java.lang.String str8 = fTPFile0.getName();
    fTPFile0.setLink("?---------   35          hi!            -1 ?---------    0          hi!             0 null");
    java.lang.String str12 = fTPFile0.toFormattedString("l---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------   35          hi!            -1 null"+ "'", str12.equals("?---------   35          hi!            -1 null"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test049"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    int i4 = fTPFile0.getHardLinkCount();
    boolean b5 = fTPFile0.isSymbolicLink();
    int i6 = fTPFile0.getType();
    java.lang.String str8 = fTPFile0.toFormattedString("?---------    2                          0 ?---------    0                          0 null");
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setHardLinkCount(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 hi!"+ "'", str8.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 hi!"+ "'", str9.equals("?---------    0                         -1 hi!"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test050"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(short)0);
    boolean b7 = fTPFile0.isFile();
    long long8 = fTPFile0.getSize();
    java.lang.String str9 = fTPFile0.getRawListing();
    int i10 = fTPFile0.getHardLinkCount();
    fTPFile0.setGroup("?---------    0                          0 null");
    java.lang.String str13 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test051"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    java.lang.String str6 = fTPFile0.toString();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getRawListing();
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    java.lang.String str10 = fTPFile0.getRawListing();
    long long11 = fTPFile0.getSize();
    fTPFile0.setSize((long)97);
    fTPFile0.setUser("?---------    0 ?---------   35          hi!            -1 null                -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test052"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    boolean b6 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.toFormattedString("");
    boolean b9 = fTPFile0.isSymbolicLink();
    int i10 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         10 hi!"+ "'", str8.equals("?---------    0                         10 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test053"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    java.lang.String str6 = fTPFile0.toString();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    boolean b8 = fTPFile0.isValid();
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    java.lang.String str11 = fTPFile0.getLink();
    boolean b12 = fTPFile0.isValid();
    java.lang.String str13 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test054"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    fTPFile0.setGroup("?---------    0                         -1 hi!");
    fTPFile0.setGroup("?---------   32 ?---------    1                          0 null                -1 ?---------    0                          0 null");
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test055"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    int i5 = fTPFile0.getHardLinkCount();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isDirectory();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test056"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    int i4 = fTPFile0.getType();
    int i5 = fTPFile0.getType();
    fTPFile0.setLink("?---------  100                         -1 hi!");
    boolean b8 = fTPFile0.isDirectory();
    boolean b9 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test057"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    fTPFile0.setRawListing("?---------   35                         -1 null");
    boolean b4 = fTPFile0.isDirectory();
    java.lang.String str5 = fTPFile0.getGroup();
    fTPFile0.setName("?---------    0 ?---------   35          hi!            -1 null                -1 hi!");
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str9 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test058"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    fTPFile0.setName("?---------    0                         -1 ");
    boolean b8 = fTPFile0.isUnknown();
    boolean b9 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test059"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    int i4 = fTPFile0.getType();
    fTPFile0.setType(3);
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getUser();
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    boolean b10 = fTPFile0.isUnknown();
    fTPFile0.setLink("?-w-------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test060"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("");
    boolean b5 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test061"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    java.lang.String str6 = fTPFile0.toString();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setLink("l---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test062"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setHardLinkCount(0);
    fTPFile0.setUser("?---------    0                          0 ?---------    0                         -1 ");

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test063"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    int i5 = fTPFile0.getHardLinkCount();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isDirectory();
    java.lang.String str8 = fTPFile0.toString();
    java.lang.String str9 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test064"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("?---------    0                         -1 ");
    boolean b5 = fTPFile0.isUnknown();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    fTPFile0.setHardLinkCount((int)(short)-1);
    fTPFile0.setGroup("?---------    0 ?---------    0                          0 null                 0 null");
    fTPFile0.setUser("?---------   35                         -1 null");
    boolean b13 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test065"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b11 = fTPFile0.hasPermission(1, 1);
    fTPFile0.setLink("");
    fTPFile0.setSize((long)(byte)-1);
    fTPFile0.setRawListing("?---------    0                         -1 ");
    java.lang.String str19 = fTPFile0.toFormattedString("?---------    0          l---------    0                          0 null       10 hi!");
    int i20 = fTPFile0.getType();
    java.lang.String str21 = fTPFile0.getUser();
    fTPFile0.setHardLinkCount((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "?---------    0                         -1 null"+ "'", str19.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test066"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    fTPFile0.setHardLinkCount((int)'4');
    fTPFile0.setHardLinkCount((int)(short)100);
    java.lang.String str7 = fTPFile0.toString();
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1                  0 null");
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                          0 ?---------    0                         -1 ");
    java.util.Calendar calendar12 = null;
    fTPFile0.setTimestamp(calendar12);
    java.lang.String str14 = fTPFile0.toFormattedString();
    fTPFile0.setType((int)(short)1);
    java.lang.String str17 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------  100                         -1 hi!"+ "'", str11.equals("?---------  100                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------  100                         -1 hi!"+ "'", str14.equals("?---------  100                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test067"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    fTPFile0.setHardLinkCount((int)'4');
    int i5 = fTPFile0.getHardLinkCount();
    java.lang.String str6 = fTPFile0.getRawListing();
    java.lang.String str8 = fTPFile0.toFormattedString("?---------   35 ?---------   35          hi!            -1 ?---------    0          hi!             0 null hi!            -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------   52                         -1 hi!"+ "'", str8.equals("?---------   52                         -1 hi!"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test068"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    fTPFile0.setType(35);
    fTPFile0.setGroup("?---------    0                         -1 null");
    java.lang.String str11 = fTPFile0.toFormattedString("?---------   35                         -1 null");
    fTPFile0.setGroup("l---------    0                          0 null");
    java.lang.String str15 = fTPFile0.toFormattedString("?---------    0                          0 ?---------    0          hi!             0 null");
    fTPFile0.setLink("?---------    0                         10 ?---------    0                          0 null");
    boolean b18 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0          ?---------    0                         -1 null       10 hi!"+ "'", str11.equals("?---------    0          ?---------    0                         -1 null       10 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    0          l---------    0                          0 null       10 hi!"+ "'", str15.equals("?---------    0          l---------    0                          0 null       10 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test069"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0          hi!             0 null");
    boolean b6 = fTPFile0.isFile();
    fTPFile0.setSize((long)3);
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    fTPFile0.setHardLinkCount((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test070"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(short)0);
    boolean b7 = fTPFile0.isFile();
    boolean b8 = fTPFile0.isFile();
    java.lang.String str9 = fTPFile0.toString();
    java.lang.String str10 = fTPFile0.getRawListing();
    boolean b11 = fTPFile0.isFile();
    java.lang.String str12 = fTPFile0.getGroup();
    long long13 = fTPFile0.getSize();
    int i14 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test071"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str8 = fTPFile0.getLink();
    java.lang.String str10 = fTPFile0.toFormattedString("l---------    0                          0 null");
    java.lang.String str11 = fTPFile0.getLink();
    fTPFile0.setSize(10L);
    boolean b14 = fTPFile0.isDirectory();
    fTPFile0.setSize((long)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 ?---------    0                          0 null"+ "'", str10.equals("?---------    0                         -1 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test072"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    boolean b8 = fTPFile0.isDirectory();
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    boolean b10 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount((int)(byte)0);
    fTPFile0.setType((int)(short)10);
    java.lang.String str15 = fTPFile0.getRawListing();
    java.lang.String str16 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test073"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(short)0);
    boolean b7 = fTPFile0.isFile();
    boolean b8 = fTPFile0.isFile();
    fTPFile0.setGroup("?---------    2                          0 ?---------    0                          0 null");
    java.lang.String str11 = fTPFile0.toString();
    long long12 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test074"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0                         -1 ");
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    int i8 = fTPFile0.getType();
    java.lang.String str10 = fTPFile0.toFormattedString("?---------    0                          0 null");
    boolean b11 = fTPFile0.isValid();
    boolean b12 = fTPFile0.isDirectory();
    java.lang.String str13 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0 ?---------    0                         -1                  0 null"+ "'", str10.equals("?---------    0 ?---------    0                         -1                  0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test075"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------    0                          0 ?---------    0                          0 null");
    boolean b7 = fTPFile0.isDirectory();
    boolean b8 = fTPFile0.isFile();
    fTPFile0.setUser("?---------    0                         -1 ?---------    0                          0 null");
    boolean b11 = fTPFile0.isUnknown();
    fTPFile0.setRawListing("?---------    2                         -1 null");
    java.lang.String str14 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    0 ?---------    0                         -1 ?---------    0                          0 null ?---------    0                          0 ?---------    0                          0 null       -1 hi!"+ "'", str14.equals("?---------    0 ?---------    0                         -1 ?---------    0                          0 null ?---------    0                          0 ?---------    0                          0 null       -1 hi!"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test076"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    fTPFile0.setName("?---------   35                         -1 null");
    fTPFile0.setName("?---------    0          hi!             0 null");
    java.lang.String str10 = fTPFile0.getGroup();
    boolean b11 = fTPFile0.isSymbolicLink();
    fTPFile0.setRawListing("?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null");
    fTPFile0.setType(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test077"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    boolean b2 = fTPFile0.isSymbolicLink();
    java.lang.String str3 = fTPFile0.toString();
    java.lang.String str4 = fTPFile0.getLink();
    fTPFile0.setHardLinkCount((int)(short)10);
    int i7 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test078"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isSymbolicLink();
    java.lang.String str3 = fTPFile0.toFormattedString("?---------    0                          0 ?---------    0                          0 null");
    java.lang.String str4 = fTPFile0.getLink();
    int i5 = fTPFile0.getType();
    fTPFile0.setType(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test079"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                         -1 ");
    fTPFile0.setName("?---------    0                         -1 hi!");
    fTPFile0.setRawListing("");
    fTPFile0.setRawListing("?---------   35          hi!            -1 ?---------    0          hi!             0 null");
    int i14 = fTPFile0.getHardLinkCount();
    fTPFile0.setType(2);
    java.lang.String str17 = fTPFile0.getRawListing();
    java.lang.String str18 = fTPFile0.getRawListing();
    java.lang.String str19 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "?---------   35          hi!            -1 ?---------    0          hi!             0 null"+ "'", str17.equals("?---------   35          hi!            -1 ?---------    0          hi!             0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "?---------   35          hi!            -1 ?---------    0          hi!             0 null"+ "'", str18.equals("?---------   35          hi!            -1 ?---------    0          hi!             0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test080"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    fTPFile0.setType((int)(byte)-1);
    boolean b10 = fTPFile0.isFile();
    boolean b11 = fTPFile0.isSymbolicLink();
    fTPFile0.setLink("?---------    0          ?---------    0                         -1 hi!        0 ?---------    0                         -1 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test081"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.hasPermission((int)(byte)0, 0);
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test082"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    java.lang.String str6 = fTPFile0.toString();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.toString();
    boolean b9 = fTPFile0.isDirectory();
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    fTPFile0.setType(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test083"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.lang.String str3 = fTPFile0.getUser();
    int i4 = fTPFile0.getType();
    fTPFile0.setUser("?---------    0                         -1 ?---------    0                         -1 ");
    java.lang.String str7 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 ?---------    0                         -1 "+ "'", str7.equals("?---------    0                         -1 ?---------    0                         -1 "));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test084"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("");
    int i5 = fTPFile0.getHardLinkCount();
    java.lang.String str6 = fTPFile0.getRawListing();
    java.lang.String str8 = fTPFile0.toFormattedString("?---------    0          ?---------    0                          0 null        0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------   35                         -1 null"+ "'", str8.equals("?---------   35                         -1 null"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test085"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str7 = fTPFile0.toFormattedString("?---------    0                          0 ?---------    0                          0 null");
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0          ?---------    0          hi!             0 null        0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str7.equals("?---------    0                          0 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str9.equals("?---------    0                          0 ?---------    0                          0 null"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test086"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    0                          0 null");
    fTPFile0.setName("?---------    0                          0 null");
    fTPFile0.setType((int)'4');
    fTPFile0.setUser("?---------    0                          0 ?---------    0                         -1 ");
    java.lang.String str13 = fTPFile0.toString();
    java.lang.String str15 = fTPFile0.toFormattedString("?---------    0                         10 hi!");
    java.lang.String str16 = fTPFile0.toFormattedString();
    java.lang.String str17 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 "+ "'", str6.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null"+ "'", str15.equals("?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null"+ "'", str16.equals("?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null"+ "'", str17.equals("?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test087"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1                  0 null");
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setLink("?---------    0                          0 ?---------    0                         -1 ");
    java.lang.String str10 = fTPFile0.toString();
    fTPFile0.setType((int)' ');
    java.lang.String str13 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0 ?---------    0                         -1                  0 null"+ "'", str10.equals("?---------    0 ?---------    0                         -1                  0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0 ?---------    0                         -1                  0 null"+ "'", str13.equals("?---------    0 ?---------    0                         -1                  0 null"));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test088"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0                         -1 ");
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    boolean b8 = fTPFile0.isUnknown();
    fTPFile0.setType((int)(short)100);
    java.lang.String str11 = fTPFile0.toFormattedString();
    boolean b12 = fTPFile0.isUnknown();
    fTPFile0.setRawListing("?---------    0                         -1 ?---------    0                          0 null");
    boolean b15 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0 ?---------    0                         -1                  0 null"+ "'", str11.equals("?---------    0 ?---------    0                         -1                  0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test089"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------    0                          0 ?---------    0                          0 null");
    java.lang.String str7 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test090"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    fTPFile0.setHardLinkCount(1);
    boolean b4 = fTPFile0.isUnknown();
    int i5 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test091"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    boolean b2 = fTPFile0.isFile();
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    int i6 = fTPFile0.getHardLinkCount();
    fTPFile0.setLink("?---------   35                         -1 ?---------    0                          0 ?---------    0                          0 null");
    fTPFile0.setRawListing("?---------    0          ?---------    0 ?---------    0                          0 null                 0 null       10 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test092"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0                          0 ?---------    0                         -1 ");
    fTPFile0.setRawListing("?---------    0                         -1 hi!");
    boolean b9 = fTPFile0.isFile();
    boolean b10 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test093"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b11 = fTPFile0.hasPermission(1, 1);
    long long12 = fTPFile0.getSize();
    java.lang.String str13 = fTPFile0.getRawListing();
    java.lang.String str14 = fTPFile0.getUser();
    fTPFile0.setType(1);
    java.util.Calendar calendar17 = null;
    fTPFile0.setTimestamp(calendar17);
    boolean b19 = fTPFile0.isValid();
    int i20 = fTPFile0.getHardLinkCount();
    fTPFile0.setLink("?---------    0          ?---------    0                         -1 hi!        0 ?---------    0                         -1 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test094"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b11 = fTPFile0.hasPermission(1, 1);
    long long12 = fTPFile0.getSize();
    java.lang.String str13 = fTPFile0.getRawListing();
    java.lang.String str14 = fTPFile0.getUser();
    fTPFile0.setHardLinkCount((int)(byte)1);
    java.util.Calendar calendar17 = fTPFile0.getTimestamp();
    fTPFile0.setHardLinkCount(0);
    fTPFile0.setType((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar17);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test095"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((-1), (int)(short)-1, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test096"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    long long6 = fTPFile0.getSize();
    fTPFile0.setUser("?---------    0                          0 null");
    java.lang.String str9 = fTPFile0.toFormattedString();
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    fTPFile0.setHardLinkCount((int)(byte)-1);
    java.lang.String str14 = fTPFile0.toFormattedString();
    boolean b15 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0 ?---------    0                          0 null                 0 null"+ "'", str9.equals("?---------    0 ?---------    0                          0 null                 0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------   -1 ?---------    0                          0 null                 0 null"+ "'", str14.equals("?---------   -1 ?---------    0                          0 null                 0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test097"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    fTPFile0.setUser("?---------    0                         -1 ");
    boolean b5 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("?---------    2                          1 ?---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test098"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.getRawListing();
    boolean b4 = fTPFile0.isDirectory();
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    java.lang.String str6 = fTPFile0.getLink();
    java.lang.String str7 = fTPFile0.toFormattedString();
    boolean b8 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                          0 null"+ "'", str7.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test099"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    int i3 = fTPFile0.getHardLinkCount();
    int i4 = fTPFile0.getHardLinkCount();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)0, 97, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test100"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    boolean b7 = fTPFile0.isValid();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    boolean b10 = fTPFile0.isValid();
    int i11 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test101"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    long long6 = fTPFile0.getSize();
    fTPFile0.setUser("?---------    0                          0 null");
    java.lang.String str9 = fTPFile0.toString();
    boolean b10 = fTPFile0.isFile();
    java.lang.String str11 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          0 null"+ "'", str11.equals("?---------    0                          0 null"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test102"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getName();
    boolean b5 = fTPFile0.isFile();
    boolean b6 = fTPFile0.isFile();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getLink();
    java.lang.String str9 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test103"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str8 = fTPFile0.getUser();
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = fTPFile0.hasPermission((int)(short)10, 52);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test104"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(short)0);
    boolean b7 = fTPFile0.isFile();
    boolean b8 = fTPFile0.isDirectory();
    long long9 = fTPFile0.getSize();
    fTPFile0.setType((int)(short)-1);
    fTPFile0.setSize((long)'#');
    boolean b14 = fTPFile0.isDirectory();
    boolean b15 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test105"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    int i4 = fTPFile0.getType();
    java.lang.String str5 = fTPFile0.getUser();
    java.lang.String str6 = fTPFile0.toString();
    fTPFile0.setType((int)'#');
    boolean b9 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test106"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b11 = fTPFile0.hasPermission(1, 1);
    long long12 = fTPFile0.getSize();
    java.lang.String str13 = fTPFile0.getRawListing();
    java.lang.String str14 = fTPFile0.getUser();
    fTPFile0.setHardLinkCount((int)(byte)1);
    fTPFile0.setRawListing("hi!");
    int i19 = fTPFile0.getType();
    fTPFile0.setType((int)(short)100);
    java.lang.String str22 = fTPFile0.getGroup();
    boolean b23 = fTPFile0.isUnknown();
    int i24 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 100);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test107"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    boolean b7 = fTPFile0.isDirectory();
    boolean b8 = fTPFile0.isDirectory();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)-1, (int)(short)10, true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test108"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    java.lang.String str4 = fTPFile0.toString();
    java.lang.String str5 = fTPFile0.toString();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(0, 32, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test109"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str7 = fTPFile0.toFormattedString("?---------    0                          0 ?---------    0                          0 null");
    fTPFile0.setSize((long)10);
    fTPFile0.setLink("?---------    0                          0 ?---------    0                         -1 ");
    java.lang.String str12 = fTPFile0.toFormattedString();
    java.lang.String str13 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str7.equals("?---------    0                          0 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         10 ?---------    0                          0 null"+ "'", str12.equals("?---------    0                         10 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test110"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    0                          0 null");
    fTPFile0.setName("?---------    0                          0 null");
    fTPFile0.setName("?---------   35                         -1 null");
    java.lang.String str11 = fTPFile0.toString();
    java.lang.String str12 = fTPFile0.getGroup();
    fTPFile0.setName("d---------    0                         -1 hi!");
    fTPFile0.setSize(10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 "+ "'", str6.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test111"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    fTPFile0.setUser("");
    java.lang.String str8 = fTPFile0.getName();
    fTPFile0.setGroup("");
    int i11 = fTPFile0.getHardLinkCount();
    fTPFile0.setLink("?---------   35          hi!            -1 null");
    fTPFile0.setType((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 35);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test112"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    boolean b3 = fTPFile0.isUnknown();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.lang.String str6 = fTPFile0.toFormattedString();
    java.lang.String str7 = fTPFile0.getLink();
    int i8 = fTPFile0.getType();
    java.lang.String str9 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test113"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    boolean b3 = fTPFile0.isUnknown();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.lang.String str6 = fTPFile0.getGroup();
    java.lang.String str7 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test114"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    fTPFile0.setUser("");
    java.lang.String str8 = fTPFile0.getUser();
    boolean b9 = fTPFile0.isSymbolicLink();
    fTPFile0.setHardLinkCount((int)(byte)-1);
    fTPFile0.setRawListing("?---------    0                          0 null");
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(0, (int)(short)100, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test115"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    int i4 = fTPFile0.getHardLinkCount();
    boolean b5 = fTPFile0.isSymbolicLink();
    int i6 = fTPFile0.getType();
    java.lang.String str8 = fTPFile0.toFormattedString("?---------    2                          0 ?---------    0                          0 null");
    java.lang.String str9 = fTPFile0.toFormattedString();
    java.lang.String str10 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 hi!"+ "'", str8.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 hi!"+ "'", str9.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test116"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isSymbolicLink();
    boolean b2 = fTPFile0.isUnknown();
    int i3 = fTPFile0.getType();
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = fTPFile0.hasPermission((int)(byte)100, (int)'a');
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
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test117"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setName("?---------    0                         -1 ?---------    0                         -1 ");
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------   -1 ?---------    0                          0 null                 0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test118"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("hi!");
    boolean b3 = fTPFile0.isFile();
    boolean b4 = fTPFile0.isValid();
    boolean b5 = fTPFile0.isFile();
    java.lang.String str6 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test119"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b9 = fTPFile0.isDirectory();
    int i10 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test120"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.lang.String str3 = fTPFile0.getUser();
    int i4 = fTPFile0.getType();
    fTPFile0.setUser("?---------    0                         -1 ?---------    0                         -1 ");
    fTPFile0.setSize((long)(short)100);
    int i9 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test121"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1                  0 null");
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setLink("?---------    0                          0 ?---------    0                         -1 ");
    java.lang.String str10 = fTPFile0.toString();
    boolean b11 = fTPFile0.isUnknown();
    java.lang.String str12 = fTPFile0.getRawListing();
    fTPFile0.setRawListing("?---------    0          l---------    0                          0 null       10 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0 ?---------    0                         -1                  0 null"+ "'", str10.equals("?---------    0 ?---------    0                         -1                  0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0 ?---------    0                         -1                  0 null"+ "'", str12.equals("?---------    0 ?---------    0                         -1                  0 null"));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test122"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    fTPFile0.setGroup("?---------    0                         -1 hi!");
    fTPFile0.setLink("?---------    0                          0 ?---------    0                         -1 ");
    java.lang.String str10 = fTPFile0.getLink();
    java.lang.String str11 = fTPFile0.getRawListing();
    boolean b12 = fTPFile0.isUnknown();
    int i13 = fTPFile0.getHardLinkCount();
    java.lang.String str14 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                          0 ?---------    0                         -1 "+ "'", str10.equals("?---------    0                          0 ?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    0                         -1 hi!"+ "'", str14.equals("?---------    0                         -1 hi!"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test123"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("?---------    0                          0 null");
    boolean b7 = fTPFile0.isValid();
    boolean b8 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("");
    boolean b11 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test124"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("?---------    0                         -1 ");
    java.lang.String str5 = fTPFile0.getLink();
    java.lang.String str6 = fTPFile0.toFormattedString();
    java.lang.String str7 = fTPFile0.getLink();
    java.lang.String str8 = fTPFile0.getGroup();
    fTPFile0.setSize((long)'4');
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 "+ "'", str5.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------   35                         -1 null"+ "'", str6.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 "+ "'", str7.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test125"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    0                         10 ?---------    0                          0 null");
    java.lang.String str8 = fTPFile0.toFormattedString("?---------    0                        100 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 null"+ "'", str8.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test126"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    fTPFile0.setUser("?---------    0                         -1 ");
    fTPFile0.setSize((long)(short)0);
    boolean b7 = fTPFile0.isUnknown();
    java.lang.String str8 = fTPFile0.toString();
    java.lang.String str9 = fTPFile0.toString();
    boolean b10 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test127"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    fTPFile0.setName("?---------   35                         -1 null");
    fTPFile0.setName("?---------    0          hi!             0 null");
    java.lang.String str10 = fTPFile0.toFormattedString();
    fTPFile0.setUser("?---------   35          hi!            -1 ?---------    0          hi!             0 null");
    boolean b13 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                          0 ?---------    0          hi!             0 null"+ "'", str10.equals("?---------    0                          0 ?---------    0          hi!             0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test128"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    fTPFile0.setLink("?---------    0                          0 ?---------    0                          0 null");
    int i5 = fTPFile0.getType();
    boolean b6 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test129"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    boolean b3 = fTPFile0.isUnknown();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.lang.String str6 = fTPFile0.toFormattedString();
    java.lang.String str7 = fTPFile0.getLink();
    java.lang.String str8 = fTPFile0.getRawListing();
    int i9 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test130"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0                         -1 ");
    fTPFile0.setLink("?---------    0 ?---------   35                         -1 null ?---------    0          hi!             0 null        0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test131"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    long long5 = fTPFile0.getSize();
    fTPFile0.setName("?---------    0                         -1 ?---------    0                         -1 ");
    java.lang.String str8 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test132"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getName();
    boolean b5 = fTPFile0.isFile();
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    java.lang.String str8 = fTPFile0.getName();
    java.lang.String str9 = fTPFile0.getLink();
    int i10 = fTPFile0.getType();
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test133"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    fTPFile0.setHardLinkCount((int)'4');
    int i5 = fTPFile0.getHardLinkCount();
    fTPFile0.setSize((-1L));
    boolean b8 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test134"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    long long4 = fTPFile0.getSize();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setUser("?---------    0                         10 ?---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test135"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    fTPFile0.setName("?---------    0                         -1 ");
    java.lang.String str8 = fTPFile0.getGroup();
    java.lang.String str9 = fTPFile0.getRawListing();
    fTPFile0.setLink("?---------   35          hi!            -1 ?---------    0          hi!             0 null");
    fTPFile0.setLink("?---------    0          ?---------    0          hi!             0 null        0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test136"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    long long4 = fTPFile0.getSize();
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isValid();
    java.lang.String str7 = fTPFile0.getGroup();
    java.lang.String str8 = fTPFile0.toString();
    java.lang.String str9 = fTPFile0.getLink();
    java.lang.String str10 = fTPFile0.getRawListing();
    fTPFile0.setType(35);
    java.lang.String str14 = fTPFile0.toFormattedString("?---------   35          ?---------   35          hi!            -1 null       -1 null");
    java.lang.String str15 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                          0 null"+ "'", str5.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    0                          0 null"+ "'", str14.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test137"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    boolean b6 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.toFormattedString("");
    fTPFile0.setGroup("?---------    0 ?---------    0                          0 null                 0 null");
    boolean b11 = fTPFile0.isDirectory();
    java.lang.String str13 = fTPFile0.toFormattedString("?---------    0                          0 l---------    0                          0 null");
    java.lang.String str14 = fTPFile0.getLink();
    java.lang.String str15 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         10 hi!"+ "'", str8.equals("?---------    0                         10 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0          ?---------    0 ?---------    0                          0 null                 0 null       10 hi!"+ "'", str13.equals("?---------    0          ?---------    0 ?---------    0                          0 null                 0 null       10 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    0 ?---------    0                          0 null                 0 null"+ "'", str15.equals("?---------    0 ?---------    0                          0 null                 0 null"));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test138"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    int i4 = fTPFile0.getType();
    fTPFile0.setType(3);
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getUser();
    boolean b9 = fTPFile0.isSymbolicLink();
    java.lang.String str10 = fTPFile0.getLink();
    int i11 = fTPFile0.getHardLinkCount();
    fTPFile0.setUser("l---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test139"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    fTPFile0.setHardLinkCount((int)'4');
    fTPFile0.setHardLinkCount((int)(short)100);
    boolean b7 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test140"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setGroup("hi!");
    java.lang.String str7 = fTPFile0.getUser();
    boolean b8 = fTPFile0.isFile();
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                         -1 hi!");
    java.lang.String str12 = fTPFile0.getRawListing();
    fTPFile0.setRawListing("?---------   32 ?---------    1                          0 null                -1 ?---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0          hi!             0 null"+ "'", str11.equals("?---------    0          hi!             0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test141"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getName();
    boolean b5 = fTPFile0.isFile();
    boolean b6 = fTPFile0.isValid();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                          0 null");
    int i10 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                          0 null"+ "'", str9.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test142"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    fTPFile0.setLink("?---------    0                          0 ?---------    0                          0 null");
    boolean b5 = fTPFile0.isDirectory();
    long long6 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)10);
    java.lang.String str10 = fTPFile0.toFormattedString("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------   10                         -1 null"+ "'", str10.equals("?---------   10                         -1 null"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test143"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    boolean b7 = fTPFile0.isUnknown();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    boolean b9 = fTPFile0.isUnknown();
    int i10 = fTPFile0.getHardLinkCount();
    java.lang.String str11 = fTPFile0.getUser();
    java.lang.String str12 = fTPFile0.toString();
    java.lang.String str13 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0                          0 null"+ "'", str13.equals("?---------    0                          0 null"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test144"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    java.lang.String str7 = fTPFile0.toFormattedString("?---------    0                          0 null");
    fTPFile0.setUser("?---------    0                         -1 ");
    fTPFile0.setRawListing("?---------    0                         -1 ");
    java.util.Calendar calendar12 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)(short)10);
    java.lang.String str15 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------   35                         -1 null"+ "'", str5.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   35                         -1 null"+ "'", str7.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    0                         -1 "+ "'", str15.equals("?---------    0                         -1 "));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test145"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    fTPFile0.setName("?---------    0                         -1 ");
    fTPFile0.setHardLinkCount(97);
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    int i12 = fTPFile0.getHardLinkCount();
    java.lang.String str13 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test146"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.lang.String str3 = fTPFile0.getUser();
    java.lang.String str4 = fTPFile0.getRawListing();
    java.lang.String str5 = fTPFile0.getLink();
    java.lang.String str6 = fTPFile0.getGroup();
    fTPFile0.setPermission(1, (int)(short)1, true);
    fTPFile0.setRawListing("?---------    0          hi!             0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test147"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    int i4 = fTPFile0.getType();
    boolean b5 = fTPFile0.isValid();
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.getLink();
    fTPFile0.setUser("?---------  100                         -1 hi!");
    fTPFile0.setType(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test148"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    int i4 = fTPFile0.getType();
    fTPFile0.setType(3);
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str10 = fTPFile0.toFormattedString("?---------    1                          0 null");
    fTPFile0.setLink("?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null");
    fTPFile0.setSize((long)97);
    java.lang.String str15 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                          0 null"+ "'", str10.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    0                         97 null"+ "'", str15.equals("?---------    0                         97 null"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test149"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setGroup("hi!");
    java.lang.String str7 = fTPFile0.getUser();
    boolean b8 = fTPFile0.isFile();
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str11 = fTPFile0.toFormattedString("hi!");
    java.lang.String str12 = fTPFile0.getUser();
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = fTPFile0.hasPermission(10, 3);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0          hi!             0 null"+ "'", str11.equals("?---------    0          hi!             0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test150"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setHardLinkCount(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test151"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("");
    boolean b5 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test152"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    fTPFile0.setGroup("?---------    0                         -1 hi!");
    fTPFile0.setGroup("?---------   32 ?---------    1                          0 null                -1 ?---------    0                          0 null");
    fTPFile0.setUser("?---------    0                          0 ?---------    0          hi!             0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test153"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setUser("?---------    0                         -1 ");
    fTPFile0.setGroup("?---------    0                         35 ?---------    0                          1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test154"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b11 = fTPFile0.hasPermission(1, 1);
    long long12 = fTPFile0.getSize();
    java.lang.String str13 = fTPFile0.toString();
    fTPFile0.setUser("?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!");
    java.lang.String str16 = fTPFile0.toFormattedString();
    fTPFile0.setRawListing("?---------    0          ?---------    0          hi!             0 null        0 null");
    java.lang.String str19 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "?---------    0 ?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!                 0 null"+ "'", str16.equals("?---------    0 ?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!                 0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!"+ "'", str19.equals("?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!"));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test155"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    fTPFile0.setName("?---------    0                         -1 ");
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str9 = fTPFile0.getName();
    java.lang.String str10 = fTPFile0.getName();
    boolean b11 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 "+ "'", str9.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 "+ "'", str10.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test156"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    boolean b5 = fTPFile0.isSymbolicLink();
    java.lang.String str6 = fTPFile0.getRawListing();
    java.lang.String str7 = fTPFile0.getName();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    fTPFile0.setType((int)'#');
    fTPFile0.setGroup("?---------   35          hi!            -1 null");
    boolean b14 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

}
