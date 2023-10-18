package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2_it6_livello5 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test001"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------    0                          0 ?---------    0                          0 null");
    boolean b7 = fTPFile0.isDirectory();
    boolean b8 = fTPFile0.isFile();
    fTPFile0.setUser("?---------    0                         -1 ?---------    0                          0 null");
    fTPFile0.setName("?---------    0          hi!            10 hi!");
    fTPFile0.setGroup("?---------    0 ?---------    0                          0 null                 0 null");
    java.lang.String str15 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    0                         -1 ?---------    0                          0 null"+ "'", str15.equals("?---------    0                         -1 ?---------    0                          0 null"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test002"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    int i4 = fTPFile0.getHardLinkCount();
    fTPFile0.setGroup("");
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    fTPFile0.setHardLinkCount(52);
    fTPFile0.setLink("?---------    0                         -1 ?---------    0                          0 null");
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setGroup("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test003"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    fTPFile0.setHardLinkCount((int)'4');
    fTPFile0.setHardLinkCount((int)(short)100);
    java.lang.String str7 = fTPFile0.toString();
    java.lang.String str8 = fTPFile0.toString();
    int i9 = fTPFile0.getHardLinkCount();
    int i10 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test004"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(short)0);
    boolean b7 = fTPFile0.isFile();
    boolean b8 = fTPFile0.isDirectory();
    long long9 = fTPFile0.getSize();
    fTPFile0.setName("?---------    0                         -1 ");
    java.lang.String str12 = fTPFile0.getName();
    long long13 = fTPFile0.getSize();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         -1 "+ "'", str12.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test005"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    long long4 = fTPFile0.getSize();
    fTPFile0.setRawListing("?---------    0                          0 null");
    java.lang.String str8 = fTPFile0.toFormattedString("?---------    0                        100 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------   35                         -1 null"+ "'", str8.equals("?---------   35                         -1 null"));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test006"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    int i6 = fTPFile0.getHardLinkCount();
    int i7 = fTPFile0.getType();
    fTPFile0.setHardLinkCount((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------   35                         -1 null"+ "'", str5.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test007"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0          hi!             0 null");
    boolean b6 = fTPFile0.isFile();
    long long7 = fTPFile0.getSize();
    fTPFile0.setName("?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!");
    int i10 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 35);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test008"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("?---------    0                         -1 ");
    boolean b5 = fTPFile0.isUnknown();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    fTPFile0.setHardLinkCount((int)(short)-1);
    java.lang.String str9 = fTPFile0.getLink();
    long long10 = fTPFile0.getSize();
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    int i12 = fTPFile0.getType();
    boolean b13 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 "+ "'", str9.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test009"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.lang.String str3 = fTPFile0.getUser();
    int i4 = fTPFile0.getType();
    int i5 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test010"); }


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
    long long22 = fTPFile0.getSize();
    fTPFile0.setRawListing("?---------    0          hi!             0 null");
    boolean b25 = fTPFile0.isUnknown();
    
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
    org.junit.Assert.assertTrue(long22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test011"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    java.lang.String str4 = fTPFile0.getLink();
    java.lang.String str5 = fTPFile0.getName();
    boolean b6 = fTPFile0.isUnknown();
    java.lang.String str7 = fTPFile0.toString();
    java.lang.String str8 = fTPFile0.getLink();
    boolean b9 = fTPFile0.isDirectory();
    long long10 = fTPFile0.getSize();
    java.lang.String str11 = fTPFile0.getName();
    fTPFile0.setType((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test012"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.hasPermission((int)(byte)0, 0);
    java.lang.String str8 = fTPFile0.toString();
    fTPFile0.setSize((long)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test013"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    boolean b8 = fTPFile0.isDirectory();
    java.lang.String str9 = fTPFile0.toFormattedString();
    java.lang.String str10 = fTPFile0.getRawListing();
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0          hi!            10 hi!"+ "'", str9.equals("?---------    0          hi!            10 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test014"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.lang.String str3 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    java.lang.String str6 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 "+ "'", str5.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 "+ "'", str6.equals("?---------    0                         -1 "));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test015"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    fTPFile0.setName("?---------    0                         -1 ");
    java.lang.String str8 = fTPFile0.getGroup();
    java.lang.String str9 = fTPFile0.getRawListing();
    fTPFile0.setLink("?---------   35          hi!            -1 ?---------    0          hi!             0 null");
    fTPFile0.setGroup("?---------    0                         -1 ");
    java.lang.String str14 = fTPFile0.getRawListing();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test016"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setHardLinkCount((-1));
    fTPFile0.setGroup("?---------    2                          0 ?---------    0                          0 null");
    boolean b9 = fTPFile0.isSymbolicLink();
    boolean b10 = fTPFile0.isUnknown();
    boolean b11 = fTPFile0.isUnknown();
    java.lang.String str12 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test017"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b11 = fTPFile0.hasPermission(1, 1);
    fTPFile0.setLink("");
    fTPFile0.setRawListing("?---------    1                         -1 ");
    java.util.Calendar calendar16 = null;
    fTPFile0.setTimestamp(calendar16);
    java.lang.String str18 = fTPFile0.toFormattedString();
    fTPFile0.setLink("?---------    2 ?---------    0          hi!             0 null                 0 ?---------    0                          0 null");
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1 ?---------    0                         -1                 -1 ");
    java.lang.String str23 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "?---------    0                          0 null"+ "'", str18.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test018"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    fTPFile0.setHardLinkCount((int)'4');
    fTPFile0.setHardLinkCount((int)(short)100);
    fTPFile0.setUser("?---------    0          hi!             0 null");
    fTPFile0.setType(1);
    fTPFile0.setSize((long)'#');

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test019"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    java.lang.String str6 = fTPFile0.toString();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test020"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setHardLinkCount((-1));
    fTPFile0.setGroup("?---------    2                          0 ?---------    0                          0 null");
    boolean b9 = fTPFile0.isSymbolicLink();
    boolean b10 = fTPFile0.isUnknown();
    boolean b11 = fTPFile0.isUnknown();
    java.lang.String str12 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------   -1          ?---------    2                          0 ?---------    0                          0 null        0 null"+ "'", str12.equals("?---------   -1          ?---------    2                          0 ?---------    0                          0 null        0 null"));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test021"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                         -1 ");
    long long12 = fTPFile0.getSize();
    fTPFile0.setType(97);
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(short)10, (int)(byte)-1, false);
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
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          0 null"+ "'", str11.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test022"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str7 = fTPFile0.toFormattedString("?---------    0                          0 ?---------    0                          0 null");
    fTPFile0.setSize((long)10);
    fTPFile0.setLink("?---------    0                          0 ?---------    0                         -1 ");
    java.lang.String str12 = fTPFile0.toString();
    fTPFile0.setName("?---------    0                         -1 ?---------    1                          0 null");
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1 ?---------    0                         -1                 -1 ");
    boolean b17 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str7.equals("?---------    0                          0 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test023"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    java.lang.String str6 = fTPFile0.toFormattedString();
    boolean b7 = fTPFile0.isUnknown();
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                         -1 ?---------    0                          0 null");
    fTPFile0.setUser("");
    java.lang.String str13 = fTPFile0.toFormattedString("l---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 hi!"+ "'", str6.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 hi!"+ "'", str9.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0                         -1 hi!"+ "'", str13.equals("?---------    0                         -1 hi!"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test024"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------    0                          0 ?---------    0                          0 null");
    boolean b7 = fTPFile0.isDirectory();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    java.lang.String str10 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!"+ "'", str10.equals("?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test025"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0                         -1 ");
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    fTPFile0.setUser("");
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    java.lang.String str11 = fTPFile0.getName();
    fTPFile0.setGroup("?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null");
    int i14 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test026"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setLink("");
    java.lang.String str8 = fTPFile0.toFormattedString();
    java.lang.String str9 = fTPFile0.getRawListing();
    fTPFile0.setGroup("?---------    2                          0 ?---------    0                          0 null");
    int i12 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 hi!"+ "'", str8.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test027"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setLink("");
    java.lang.String str8 = fTPFile0.getRawListing();
    boolean b9 = fTPFile0.isSymbolicLink();
    boolean b10 = fTPFile0.isFile();
    fTPFile0.setHardLinkCount(0);
    fTPFile0.setUser("?---------    0 ?---------    0                          0 null                 0 null");
    boolean b15 = fTPFile0.isValid();
    long long16 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == (-1L));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test028"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    0                          0 null");
    fTPFile0.setName("?---------    0                          0 null");
    fTPFile0.setType((int)'4');
    boolean b11 = fTPFile0.isDirectory();
    java.lang.String str12 = fTPFile0.getUser();
    fTPFile0.setSize((long)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 "+ "'", str6.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test029"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                         -1 ");
    fTPFile0.setName("?---------    0                         -1 hi!");
    fTPFile0.setRawListing("");
    fTPFile0.setRawListing("?---------   35          hi!            -1 ?---------    0          hi!             0 null");
    int i14 = fTPFile0.getHardLinkCount();
    java.lang.String str16 = fTPFile0.toFormattedString("?---------    0 ?---------    0                         -1 ?---------    0                          0 null ?---------    0                          0 ?---------    0                          0 null       -1 hi!");
    java.util.Calendar calendar17 = null;
    fTPFile0.setTimestamp(calendar17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "?---------    0                         -1 ?---------    0                         -1 hi!"+ "'", str16.equals("?---------    0                         -1 ?---------    0                         -1 hi!"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test030"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    boolean b3 = fTPFile0.isUnknown();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.lang.String str6 = fTPFile0.toFormattedString();
    long long7 = fTPFile0.getSize();
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str9 = fTPFile0.getUser();
    java.lang.String str10 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 null"+ "'", str10.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test031"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    java.lang.String str3 = fTPFile0.toFormattedString();
    java.lang.String str4 = fTPFile0.toString();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.toString();
    java.lang.String str8 = fTPFile0.getUser();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(0, (int)(byte)100, false);
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
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test032"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setLink("");
    java.lang.String str8 = fTPFile0.getRawListing();
    boolean b9 = fTPFile0.isSymbolicLink();
    java.lang.String str10 = fTPFile0.toString();
    int i11 = fTPFile0.getType();
    fTPFile0.setName("?---------  100                         -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test033"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    boolean b8 = fTPFile0.isDirectory();
    boolean b9 = fTPFile0.isSymbolicLink();
    java.lang.String str10 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0          hi!            10 hi!"+ "'", str10.equals("?---------    0          hi!            10 hi!"));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test034"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.lang.String str3 = fTPFile0.getUser();
    java.lang.String str4 = fTPFile0.getGroup();
    java.lang.String str5 = fTPFile0.getRawListing();
    fTPFile0.setType(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test035"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    java.lang.String str6 = fTPFile0.toString();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getLink();
    java.lang.String str9 = fTPFile0.getLink();
    fTPFile0.setUser("?---------    2 ?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test036"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setSize((-1L));
    java.lang.String str7 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.isDirectory();
    java.lang.String str9 = fTPFile0.getName();
    int i10 = fTPFile0.getType();
    boolean b11 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test037"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1                  0 null");
    fTPFile0.setHardLinkCount(2);
    boolean b8 = fTPFile0.isValid();
    boolean b9 = fTPFile0.isSymbolicLink();
    boolean b10 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test038"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    java.lang.String str6 = fTPFile0.toString();
    fTPFile0.setType((int)(short)10);
    boolean b9 = fTPFile0.isValid();
    java.lang.String str10 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test039"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("");
    int i5 = fTPFile0.getHardLinkCount();
    int i6 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test040"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setLink("");
    java.lang.String str8 = fTPFile0.getRawListing();
    boolean b9 = fTPFile0.isSymbolicLink();
    java.lang.String str10 = fTPFile0.toString();
    java.lang.String str11 = fTPFile0.getLink();
    java.lang.String str12 = fTPFile0.getRawListing();
    fTPFile0.setName("?---------    0 ?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!                 0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test041"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0                         -1 ");
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    fTPFile0.setUser("");
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    java.lang.String str13 = fTPFile0.toFormattedString();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(0, 100, true);
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
    org.junit.Assert.assertNull(calendar10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0                          0 null"+ "'", str13.equals("?---------    0                          0 null"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test042"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    boolean b5 = fTPFile0.isSymbolicLink();
    java.lang.String str6 = fTPFile0.getRawListing();
    java.lang.String str7 = fTPFile0.getName();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    fTPFile0.setHardLinkCount(52);
    java.lang.String str13 = fTPFile0.toFormattedString("?---------   -1          ?---------    2                          0 ?---------    0                          0 null        0 null");
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------   52                          0 null"+ "'", str13.equals("?---------   52                          0 null"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test043"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("?---------    0                         -1 ");
    java.lang.String str5 = fTPFile0.getLink();
    java.lang.String str6 = fTPFile0.toFormattedString();
    int i7 = fTPFile0.getType();
    long long8 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 "+ "'", str5.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------   35                         -1 null"+ "'", str6.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test044"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    boolean b3 = fTPFile0.isValid();
    boolean b4 = fTPFile0.isValid();
    java.lang.String str5 = fTPFile0.getUser();
    long long6 = fTPFile0.getSize();
    fTPFile0.setName("?---------    0                         10 hi!");
    fTPFile0.setRawListing("l---------    0                          0 ?---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test045"); }


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
    long long22 = fTPFile0.getSize();
    fTPFile0.setRawListing("?---------    0          hi!             0 null");
    fTPFile0.setGroup("");
    
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
    org.junit.Assert.assertTrue(long22 == 0L);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test046"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    int i6 = fTPFile0.getHardLinkCount();
    boolean b7 = fTPFile0.isValid();
    java.lang.String str8 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------   35                         -1 null"+ "'", str5.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------   35                         -1 null"+ "'", str8.equals("?---------   35                         -1 null"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test047"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setLink("?---------    0                          0 null");
    fTPFile0.setLink("?---------    0          hi!             0 null");
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    java.lang.String str10 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test048"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                         -1 ");
    fTPFile0.setType(2);
    boolean b14 = fTPFile0.isFile();
    int i15 = fTPFile0.getType();
    boolean b16 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("?---------    0                          0 null");
    fTPFile0.setLink("?---------   35                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          0 null"+ "'", str11.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test049"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    java.lang.String str2 = fTPFile0.getName();
    java.lang.String str3 = fTPFile0.toString();
    java.lang.String str4 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test050"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    int i5 = fTPFile0.getHardLinkCount();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str10 = fTPFile0.getRawListing();
    fTPFile0.setType((int)(byte)100);
    fTPFile0.setType(0);
    boolean b15 = fTPFile0.isFile();
    
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
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test051"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    fTPFile0.setName("?---------    0          hi!             0 null");
    boolean b8 = fTPFile0.isValid();
    java.lang.String str9 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test052"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    java.lang.String str6 = fTPFile0.toString();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getRawListing();
    java.lang.String str9 = fTPFile0.getName();
    boolean b10 = fTPFile0.isSymbolicLink();
    java.lang.String str12 = fTPFile0.toFormattedString("?---------    0                         -1 ?---------    0                         -1 ");
    boolean b13 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------   35          hi!            -1 null"+ "'", str12.equals("?---------   35          hi!            -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test053"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.getRawListing();
    boolean b4 = fTPFile0.isDirectory();
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    java.lang.String str6 = fTPFile0.toString();
    fTPFile0.setGroup("?---------    2                         -1 null");
    fTPFile0.setType(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test054"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    int i8 = fTPFile0.getType();
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setGroup("?---------    0 ?---------   35          hi!            -1 null                -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0          hi!            10 hi!"+ "'", str9.equals("?---------    0          hi!            10 hi!"));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test055"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setHardLinkCount((-1));
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)'4', (int)(byte)0, true);
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
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test056"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    int i4 = fTPFile0.getType();
    int i5 = fTPFile0.getType();
    java.lang.String str6 = fTPFile0.getGroup();
    fTPFile0.setHardLinkCount(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test057"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                         -1 ");
    fTPFile0.setType(2);
    boolean b14 = fTPFile0.isFile();
    int i15 = fTPFile0.getType();
    boolean b16 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar17 = null;
    fTPFile0.setTimestamp(calendar17);
    fTPFile0.setName("?---------    0                          0 null");
    fTPFile0.setGroup("?---------  100                         -1 hi!");
    boolean b23 = fTPFile0.isUnknown();
    boolean b24 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          0 null"+ "'", str11.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test058"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    fTPFile0.setSize((long)(short)0);
    boolean b13 = fTPFile0.hasPermission((int)(short)1, 0);
    java.lang.String str14 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test059"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("?---------    0                         -1 ");
    boolean b5 = fTPFile0.isUnknown();
    boolean b6 = fTPFile0.isValid();
    long long7 = fTPFile0.getSize();
    fTPFile0.setType((int)(byte)100);
    java.lang.String str11 = fTPFile0.toFormattedString("?---------   -1          ?---------    0                         -1 hi!       -1 ?---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------   35                         -1 null"+ "'", str11.equals("?---------   35                         -1 null"));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test060"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    int i4 = fTPFile0.getType();
    fTPFile0.setRawListing("?---------    0                         -1 hi!");
    fTPFile0.setUser("?---------    0                          0 ?---------    0                          0 null");
    java.lang.String str9 = fTPFile0.getName();
    int i10 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test061"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    long long6 = fTPFile0.getSize();
    fTPFile0.setUser("?---------    0                          0 null");
    java.lang.String str9 = fTPFile0.toFormattedString();
    java.lang.String str10 = fTPFile0.getLink();
    boolean b11 = fTPFile0.isDirectory();
    
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
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test062"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isSymbolicLink();
    java.lang.String str3 = fTPFile0.toFormattedString("?---------    0                          0 ?---------    0                          0 null");
    java.lang.String str4 = fTPFile0.getGroup();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test063"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                         -1 ");
    fTPFile0.setName("?---------    0                         -1 hi!");
    fTPFile0.setRawListing("");
    fTPFile0.setRawListing("?---------   35          hi!            -1 ?---------    0          hi!             0 null");
    boolean b14 = fTPFile0.isDirectory();
    java.util.Calendar calendar15 = fTPFile0.getTimestamp();
    java.lang.String str16 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test064"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("?---------    0                          0 null");
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)(short)10);
    int i10 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test065"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    int i6 = fTPFile0.getHardLinkCount();
    int i7 = fTPFile0.getType();
    java.lang.String str8 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------   35                         -1 null"+ "'", str5.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test066"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                         -1 ");
    fTPFile0.setType(2);
    boolean b14 = fTPFile0.isFile();
    int i15 = fTPFile0.getType();
    java.lang.String str16 = fTPFile0.toString();
    boolean b17 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          0 null"+ "'", str11.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test067"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                         -1 hi!");
    fTPFile0.setRawListing("?---------    0                         -1 ?---------   35                         -1 null");
    java.util.Calendar calendar14 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          0 null"+ "'", str11.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar14);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test068"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    boolean b6 = fTPFile0.isDirectory();
    fTPFile0.setName("l---------    0                          0 null");
    fTPFile0.setName("hi!");
    boolean b11 = fTPFile0.isValid();
    fTPFile0.setUser("?---------    0 ?---------    0                         -1                  2 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test069"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1                  0 null");
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setLink("?---------    0                          0 ?---------    0                         -1 ");
    java.lang.String str10 = fTPFile0.toString();
    fTPFile0.setLink("?---------    0                          0 ?---------    0                         -1 ");
    fTPFile0.setHardLinkCount((int)'a');
    fTPFile0.setType((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0 ?---------    0                         -1                  0 null"+ "'", str10.equals("?---------    0 ?---------    0                         -1                  0 null"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test070"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setHardLinkCount(0);
    java.lang.String str7 = fTPFile0.getLink();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    boolean b10 = fTPFile0.isUnknown();
    fTPFile0.setType((int)'#');
    fTPFile0.setSize((long)2);
    java.lang.String str15 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test071"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("?---------    0                         -1 ");
    boolean b5 = fTPFile0.isUnknown();
    boolean b6 = fTPFile0.isValid();
    long long7 = fTPFile0.getSize();
    java.lang.String str8 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test072"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("");
    fTPFile0.setGroup("?---------   35          hi!            -1 null");
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test073"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    fTPFile0.setName("?---------   35                         -1 null");
    fTPFile0.setName("?---------    0          hi!             0 null");
    fTPFile0.setHardLinkCount((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test074"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    fTPFile0.setName("?---------    0                         -1 ");
    java.lang.String str8 = fTPFile0.toFormattedString();
    java.lang.String str9 = fTPFile0.toString();
    boolean b10 = fTPFile0.isValid();
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = fTPFile0.hasPermission((int)'4', 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                          0 ?---------    0                         -1 "+ "'", str8.equals("?---------    0                          0 ?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test075"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    int i5 = fTPFile0.getHardLinkCount();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str10 = fTPFile0.getRawListing();
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    boolean b13 = fTPFile0.isUnknown();
    
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
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test076"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    java.lang.String str4 = fTPFile0.toString();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test077"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.hasPermission((int)(byte)1, (int)(short)1);
    boolean b7 = fTPFile0.isValid();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test078"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    long long6 = fTPFile0.getSize();
    fTPFile0.setUser("?---------    0                          0 null");
    java.lang.String str9 = fTPFile0.toString();
    boolean b10 = fTPFile0.isFile();
    fTPFile0.setUser("?---------    2                         -1 null");
    
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

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test079"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("?---------    0                          0 null");
    boolean b7 = fTPFile0.isValid();
    fTPFile0.setSize((long)(byte)-1);
    java.lang.String str10 = fTPFile0.getName();
    java.lang.String str11 = fTPFile0.getGroup();
    boolean b12 = fTPFile0.isDirectory();
    boolean b13 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                          0 null"+ "'", str10.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test080"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    fTPFile0.setSize((long)(short)0);
    boolean b11 = fTPFile0.isDirectory();
    boolean b14 = fTPFile0.hasPermission(2, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test081"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setHardLinkCount((-1));
    fTPFile0.setType((int)(short)-1);
    java.lang.String str9 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test082"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1                  0 null");
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setLink("?---------    0                          0 ?---------    0                         -1 ");
    java.lang.String str10 = fTPFile0.toString();
    boolean b11 = fTPFile0.isValid();
    boolean b12 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0 ?---------    0                         -1                  0 null"+ "'", str10.equals("?---------    0 ?---------    0                         -1                  0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test083"); }


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
    long long22 = fTPFile0.getSize();
    fTPFile0.setRawListing("?---------    0          hi!             0 null");
    java.util.Calendar calendar25 = null;
    fTPFile0.setTimestamp(calendar25);
    
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
    org.junit.Assert.assertTrue(long22 == 0L);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test084"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                          0 null");
    fTPFile0.setName("hi!");
    fTPFile0.setUser("?---------    0                         -1 null");
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = fTPFile0.hasPermission((int)(byte)-1, 2);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test085"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("?---------    0                         -1 ");
    java.lang.String str5 = fTPFile0.getLink();
    java.lang.String str6 = fTPFile0.toFormattedString();
    int i7 = fTPFile0.getType();
    fTPFile0.setGroup("?---------   -1          ?---------    2                          0 ?---------    0                          0 null        0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 "+ "'", str5.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------   35                         -1 null"+ "'", str6.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test086"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    fTPFile0.setHardLinkCount(2);
    java.lang.String str9 = fTPFile0.getGroup();
    int i10 = fTPFile0.getType();
    java.lang.String str11 = fTPFile0.getName();
    java.lang.String str13 = fTPFile0.toFormattedString("?---------   35                         -1 ?---------    0                          0 ?---------    0                          0 null");
    fTPFile0.setGroup("?---------   35                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          0 null"+ "'", str11.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    2                          0 ?---------    0                          0 null"+ "'", str13.equals("?---------    2                          0 ?---------    0                          0 null"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test087"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    fTPFile0.setHardLinkCount(2);
    java.lang.String str9 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(byte)1);
    boolean b12 = fTPFile0.isUnknown();
    java.lang.String str14 = fTPFile0.toFormattedString("?---------    0          hi!            10 hi!");
    java.lang.String str15 = fTPFile0.toFormattedString();
    boolean b16 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    2                          1 ?---------    0                          0 null"+ "'", str14.equals("?---------    2                          1 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    2                          1 ?---------    0                          0 null"+ "'", str15.equals("?---------    2                          1 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test088"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setGroup("hi!");
    java.lang.String str7 = fTPFile0.getUser();
    boolean b8 = fTPFile0.isFile();
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                         -1 hi!");
    fTPFile0.setSize((long)(short)-1);
    boolean b14 = fTPFile0.isSymbolicLink();
    fTPFile0.setLink("hi!");
    int i17 = fTPFile0.getType();
    java.util.Calendar calendar18 = null;
    fTPFile0.setTimestamp(calendar18);
    java.lang.String str20 = fTPFile0.getRawListing();
    
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
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test089"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    long long5 = fTPFile0.getSize();
    fTPFile0.setGroup("?---------   -1          ?---------    0                         -1 hi!       -1 ?---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test090"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    java.lang.String str4 = fTPFile0.toFormattedString("?---------   35                         -1 null");
    java.lang.String str5 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 hi!"+ "'", str4.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test091"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    boolean b7 = fTPFile0.isDirectory();
    boolean b8 = fTPFile0.isDirectory();
    boolean b9 = fTPFile0.isUnknown();
    java.lang.String str10 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                          0 null"+ "'", str10.equals("?---------    0                          0 null"));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test092"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    int i4 = fTPFile0.getType();
    fTPFile0.setType(3);
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str10 = fTPFile0.toFormattedString("?---------    1                          0 null");
    fTPFile0.setLink("?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null");
    int i13 = fTPFile0.getType();
    
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
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test093"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.hasPermission((int)(byte)1, (int)(short)1);
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1                  0 null");
    java.lang.String str9 = fTPFile0.toString();
    fTPFile0.setRawListing("?---------    0                         -1 ");
    long long12 = fTPFile0.getSize();
    int i13 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0 ?---------    0                         -1                  0 null"+ "'", str9.equals("?---------    0 ?---------    0                         -1                  0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test094"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    fTPFile0.setRawListing("?---------    0                          0 ?---------    0                         -1 ");
    java.lang.String str10 = fTPFile0.getLink();
    fTPFile0.setHardLinkCount((int)(short)100);
    java.lang.String str13 = fTPFile0.getName();
    boolean b14 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test095"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("?---------    0                          0 null");
    boolean b7 = fTPFile0.isValid();
    fTPFile0.setSize((long)(byte)-1);
    java.lang.String str10 = fTPFile0.getName();
    java.lang.String str11 = fTPFile0.getGroup();
    boolean b12 = fTPFile0.isDirectory();
    fTPFile0.setName("?---------    1                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                          0 null"+ "'", str10.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test096"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    fTPFile0.setName("?---------    0                         -1 ");
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str9 = fTPFile0.getName();
    boolean b10 = fTPFile0.isUnknown();
    fTPFile0.setLink("?---------    0          hi!             0 null");
    boolean b13 = fTPFile0.isUnknown();
    
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
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test097"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0                         -1 ");
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    fTPFile0.setUser("");
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    int i13 = fTPFile0.getType();
    boolean b14 = fTPFile0.isUnknown();
    java.lang.String str15 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test098"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    fTPFile0.setUser("");
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                          0 ?---------    0                         -1 ");
    boolean b10 = fTPFile0.isFile();
    fTPFile0.setUser("?---------    0 ?---------    0                         -1                  2 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------   35          hi!            -1 null"+ "'", str9.equals("?---------   35          hi!            -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test099"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0                         -1 ");
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    fTPFile0.setUser("");
    long long10 = fTPFile0.getSize();
    fTPFile0.setSize((long)35);
    java.util.Calendar calendar13 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar13);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test100"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    fTPFile0.setType(35);
    fTPFile0.setGroup("?---------    0                         -1 null");
    java.lang.String str11 = fTPFile0.toFormattedString("?---------   35                         -1 null");
    fTPFile0.setGroup("?---------    0          ?---------    0                         -1 null       10 hi!");
    boolean b14 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0          ?---------    0                         -1 null       10 hi!"+ "'", str11.equals("?---------    0          ?---------    0                         -1 null       10 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test101"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setGroup("?---------   35          hi!            -1 null");
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    0                         -1 ?---------    0                          0 null");
    fTPFile0.setUser("?---------    2                          1 ?---------    0                          0 null");
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str10 = fTPFile0.getGroup();
    fTPFile0.setRawListing("?---------    0                         -1 ?---------    0 ?---------   35          hi!            -1 null                -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------   35          ?---------   35          hi!            -1 null       -1 null"+ "'", str6.equals("?---------   35          ?---------   35          hi!            -1 null       -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------   35          hi!            -1 null"+ "'", str9.equals("?---------   35          hi!            -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------   35          hi!            -1 null"+ "'", str10.equals("?---------   35          hi!            -1 null"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test102"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    fTPFile0.setName("?---------    0                         -1 ");
    java.lang.String str8 = fTPFile0.getGroup();
    java.lang.String str9 = fTPFile0.getRawListing();
    fTPFile0.setLink("?---------   35          hi!            -1 ?---------    0          hi!             0 null");
    java.lang.String str12 = fTPFile0.toString();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test103"); }


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
    fTPFile0.setGroup("?---------    0                         -1 ?---------   35                         -1 null");
    long long23 = fTPFile0.getSize();
    
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
    org.junit.Assert.assertTrue(long23 == (-1L));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test104"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    long long4 = fTPFile0.getSize();
    fTPFile0.setGroup("?---------    0                          0 ?---------    0                          0 null");
    fTPFile0.setName("?---------    0                          0 null");
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    boolean b10 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test105"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.getRawListing();
    boolean b4 = fTPFile0.isDirectory();
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)97);
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)' ', 97, false);
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
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test106"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                          0 null");
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    fTPFile0.setHardLinkCount((int)' ');
    fTPFile0.setGroup("l---------    0                          0 null");
    java.lang.String str14 = fTPFile0.toFormattedString("?---------    1                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------   32          l---------    0                          0 null       -1 ?---------    0                          0 null"+ "'", str14.equals("?---------   32          l---------    0                          0 null       -1 ?---------    0                          0 null"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test107"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    0                          0 null");
    fTPFile0.setName("?---------    0                          0 null");
    fTPFile0.setName("?---------   35                         -1 null");
    java.lang.String str11 = fTPFile0.toString();
    java.lang.String str12 = fTPFile0.getGroup();
    java.lang.String str13 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 "+ "'", str6.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------   35                         -1 null"+ "'", str13.equals("?---------   35                         -1 null"));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test108"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1                  0 null");
    fTPFile0.setHardLinkCount(2);
    boolean b8 = fTPFile0.isValid();
    fTPFile0.setUser("?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null");
    boolean b11 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test109"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setLink("");
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    boolean b10 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test110"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b11 = fTPFile0.hasPermission(1, 1);
    long long12 = fTPFile0.getSize();
    java.lang.String str13 = fTPFile0.getName();
    int i14 = fTPFile0.getType();
    java.util.Calendar calendar15 = null;
    fTPFile0.setTimestamp(calendar15);
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = fTPFile0.hasPermission((int)(short)100, (int)(short)1);
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
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 97);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test111"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1                  0 null");
    java.lang.String str6 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toString();
    java.lang.String str8 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------   32                          0 null");
    boolean b11 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0 ?---------    0                         -1                  0 null"+ "'", str6.equals("?---------    0 ?---------    0                         -1                  0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0 ?---------    0                         -1                  0 null"+ "'", str7.equals("?---------    0 ?---------    0                         -1                  0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------   35                         -1 null"+ "'", str8.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test112"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    fTPFile0.setUser("");
    java.lang.String str8 = fTPFile0.getUser();
    boolean b9 = fTPFile0.isSymbolicLink();
    fTPFile0.setHardLinkCount((int)(byte)-1);
    fTPFile0.setRawListing("?---------    0                          0 null");
    int i14 = fTPFile0.getType();
    java.lang.String str15 = fTPFile0.getRawListing();
    boolean b16 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    0                          0 null"+ "'", str15.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test113"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    fTPFile0.setName("?---------    0                         -1 ");
    java.lang.String str8 = fTPFile0.getGroup();
    java.lang.String str10 = fTPFile0.toFormattedString("?---------    0                         -1 hi!");
    int i11 = fTPFile0.getType();
    java.util.Calendar calendar12 = null;
    fTPFile0.setTimestamp(calendar12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                          0 ?---------    0                         -1 "+ "'", str10.equals("?---------    0                          0 ?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test114"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    boolean b8 = fTPFile0.isDirectory();
    int i9 = fTPFile0.getType();
    boolean b10 = fTPFile0.isDirectory();
    boolean b11 = fTPFile0.isValid();
    java.lang.String str12 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test115"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setLink("?---------   35 ?---------   35          hi!            -1 ?---------    0          hi!             0 null hi!            -1 null");
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test116"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    java.lang.String str7 = fTPFile0.toFormattedString();
    fTPFile0.setRawListing("");
    java.lang.String str10 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str7.equals("?---------    0                          0 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str10.equals("?---------    0                          0 ?---------    0                          0 null"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test117"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------    0                          0 ?---------    0                          0 null");
    boolean b7 = fTPFile0.isDirectory();
    java.lang.String str8 = fTPFile0.getLink();
    java.lang.String str10 = fTPFile0.toFormattedString("?---------    0                         -1 ");
    java.lang.String str11 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!"+ "'", str10.equals("?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str11.equals("?---------    0                          0 ?---------    0                          0 null"));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test118"); }


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
    java.lang.String str13 = fTPFile0.toFormattedString();
    fTPFile0.setGroup("?---------    0                         10 ?---------    0                          0 null");
    boolean b16 = fTPFile0.isUnknown();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0          hi!             0 null"+ "'", str13.equals("?---------    0          hi!             0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test119"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("?---------    0                         -1 ");
    java.lang.String str5 = fTPFile0.getUser();
    java.lang.String str6 = fTPFile0.toString();
    int i7 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test120"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    int i4 = fTPFile0.getType();
    long long5 = fTPFile0.getSize();
    boolean b6 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test121"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("?---------   35          hi!            -1 null");
    java.lang.String str7 = fTPFile0.toString();
    boolean b8 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test122"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    int i4 = fTPFile0.getType();
    boolean b5 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("?---------   35                         -1 null");
    fTPFile0.setGroup("?---------    0          hi!             0 null");
    java.lang.String str10 = fTPFile0.getRawListing();
    java.lang.String str11 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0 ?---------   35                         -1 null ?---------    0          hi!             0 null        0 null"+ "'", str11.equals("?---------    0 ?---------   35                         -1 null ?---------    0          hi!             0 null        0 null"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test123"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    fTPFile0.setHardLinkCount((int)'4');
    fTPFile0.setHardLinkCount((int)(short)100);
    fTPFile0.setUser("?---------    0          hi!             0 null");
    boolean b9 = fTPFile0.isValid();
    fTPFile0.setType((int)' ');
    java.lang.String str12 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0          hi!             0 null"+ "'", str12.equals("?---------    0          hi!             0 null"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test124"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    boolean b3 = fTPFile0.isUnknown();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    boolean b6 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test125"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    fTPFile0.setHardLinkCount(2);
    java.lang.String str9 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test126"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    boolean b7 = fTPFile0.isFile();
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = fTPFile0.hasPermission(35, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test127"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isSymbolicLink();
    int i5 = fTPFile0.getHardLinkCount();
    fTPFile0.setGroup("?---------    0          hi!            10 hi!");
    int i8 = fTPFile0.getHardLinkCount();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)0, (int)(short)-1, false);
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
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test128"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1                  0 null");
    fTPFile0.setHardLinkCount(2);
    boolean b8 = fTPFile0.isValid();
    fTPFile0.setUser("?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null");
    java.lang.String str11 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test129"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(short)0);
    java.lang.String str7 = fTPFile0.getLink();
    java.lang.String str8 = fTPFile0.toString();
    fTPFile0.setGroup("?---------    0                          0 null");
    fTPFile0.setName("?---------    0          hi!            10 hi!");
    fTPFile0.setRawListing("?---------    0 ?---------    0          hi!             0 null                 0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test130"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                         -1 ");
    fTPFile0.setType(2);
    boolean b14 = fTPFile0.isFile();
    int i15 = fTPFile0.getType();
    boolean b16 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar17 = null;
    fTPFile0.setTimestamp(calendar17);
    fTPFile0.setName("?---------    0                          0 null");
    java.util.Calendar calendar21 = null;
    fTPFile0.setTimestamp(calendar21);
    java.lang.String str24 = fTPFile0.toFormattedString("?---------    0 ?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!                 0 null");
    java.lang.String str25 = fTPFile0.getRawListing();
    java.util.Calendar calendar26 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          0 null"+ "'", str11.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "l---------    0                          0 ?---------    0                          0 null"+ "'", str24.equals("l---------    0                          0 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar26);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test131"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    int i4 = fTPFile0.getHardLinkCount();
    boolean b5 = fTPFile0.isSymbolicLink();
    int i6 = fTPFile0.getType();
    boolean b7 = fTPFile0.isUnknown();
    long long8 = fTPFile0.getSize();
    java.lang.String str9 = fTPFile0.getGroup();
    
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
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test132"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    fTPFile0.setUser("");
    java.lang.String str8 = fTPFile0.getName();
    fTPFile0.setGroup("");
    java.lang.String str11 = fTPFile0.getLink();
    java.lang.String str12 = fTPFile0.toFormattedString();
    boolean b13 = fTPFile0.isSymbolicLink();
    boolean b14 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------   35                         -1 null"+ "'", str12.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test133"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    boolean b2 = fTPFile0.isSymbolicLink();
    fTPFile0.setName("?---------    0                          0 ?---------    0                         -1 ");
    fTPFile0.setUser("?---------    0                          0 null");
    java.lang.String str7 = fTPFile0.getUser();
    boolean b8 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                          0 null"+ "'", str7.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test134"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                          0 null");
    boolean b8 = fTPFile0.isFile();
    fTPFile0.setType((int)(byte)10);
    java.lang.String str11 = fTPFile0.getRawListing();
    int i12 = fTPFile0.getHardLinkCount();
    java.lang.String str14 = fTPFile0.toFormattedString("?---------    2                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    0                         -1 ?---------    0                          0 null"+ "'", str14.equals("?---------    0                         -1 ?---------    0                          0 null"));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test135"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    boolean b5 = fTPFile0.isFile();
    boolean b6 = fTPFile0.isValid();
    long long7 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test136"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    long long6 = fTPFile0.getSize();
    fTPFile0.setUser("?---------    0                          0 null");
    java.lang.String str9 = fTPFile0.toFormattedString();
    java.lang.String str10 = fTPFile0.toString();
    fTPFile0.setName("?---------    2                         -1 null");
    boolean b13 = fTPFile0.isFile();
    boolean b14 = fTPFile0.isValid();
    fTPFile0.setUser("?---------  100                         -1 hi!");
    fTPFile0.setUser("?---------    0          l---------    0                          0 null       10 hi!");
    java.util.Calendar calendar19 = fTPFile0.getTimestamp();
    
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
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar19);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test137"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    java.lang.String str3 = fTPFile0.getGroup();
    java.lang.String str4 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test138"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    boolean b5 = fTPFile0.isSymbolicLink();
    java.lang.String str6 = fTPFile0.getRawListing();
    fTPFile0.setSize((long)(-1));
    java.lang.String str9 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test139"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    boolean b3 = fTPFile0.isUnknown();
    int i4 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test140"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                          0 null");
    fTPFile0.setName("hi!");
    fTPFile0.setType((int)(short)1);
    java.lang.String str12 = fTPFile0.toString();
    java.lang.String str13 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "d---------    0                         -1 hi!"+ "'", str13.equals("d---------    0                         -1 hi!"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test141"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    0                          0 null");
    long long7 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount(0);
    fTPFile0.setGroup("?---------   35          hi!            -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 "+ "'", str6.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test142"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    fTPFile0.setType((int)(byte)-1);
    int i10 = fTPFile0.getType();
    fTPFile0.setSize(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test143"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------    0                          0 ?---------    0                          0 null");
    java.lang.String str7 = fTPFile0.getRawListing();
    fTPFile0.setName("?---------  100                         -1 hi!");
    long long10 = fTPFile0.getSize();
    java.lang.String str11 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------  100                         -1 hi!"+ "'", str11.equals("?---------  100                         -1 hi!"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test144"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    int i6 = fTPFile0.getHardLinkCount();
    int i7 = fTPFile0.getType();
    java.lang.String str8 = fTPFile0.getLink();
    boolean b9 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------   35                         -1 null"+ "'", str5.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test145"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    int i5 = fTPFile0.getHardLinkCount();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount(100);
    boolean b10 = fTPFile0.isFile();
    java.lang.String str11 = fTPFile0.getName();
    java.lang.String str12 = fTPFile0.toString();
    
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
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test146"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.lang.String str3 = fTPFile0.getUser();
    java.lang.String str4 = fTPFile0.getGroup();
    java.lang.String str5 = fTPFile0.getRawListing();
    fTPFile0.setSize((long)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test147"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("?---------    0                         -1 ");
    fTPFile0.setName("?---------    0                          0 ?---------    0                          0 null");
    fTPFile0.setSize(0L);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test148"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                         -1 ");
    boolean b12 = fTPFile0.isUnknown();
    java.lang.String str13 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          0 null"+ "'", str11.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test149"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.getRawListing();
    boolean b4 = fTPFile0.isDirectory();
    java.lang.String str5 = fTPFile0.getName();
    java.lang.String str6 = fTPFile0.getRawListing();
    java.lang.String str7 = fTPFile0.getLink();
    fTPFile0.setGroup("?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test150"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    boolean b5 = fTPFile0.isSymbolicLink();
    java.lang.String str6 = fTPFile0.getRawListing();
    java.lang.String str7 = fTPFile0.getName();
    java.lang.String str8 = fTPFile0.getGroup();
    
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test151"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.hasPermission((int)(byte)1, (int)(short)1);
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1                  0 null");
    boolean b9 = fTPFile0.isDirectory();
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = fTPFile0.hasPermission((int)(byte)-1, (int)'4');
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
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test152"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                         -1 ");
    fTPFile0.setType(2);
    boolean b14 = fTPFile0.isFile();
    int i15 = fTPFile0.getType();
    boolean b16 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar17 = null;
    fTPFile0.setTimestamp(calendar17);
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str21 = fTPFile0.getRawListing();
    fTPFile0.setSize((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          0 null"+ "'", str11.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test153"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("?---------    0                          0 null");
    boolean b7 = fTPFile0.isValid();
    fTPFile0.setSize((long)(byte)-1);
    java.lang.String str10 = fTPFile0.getName();
    java.lang.String str11 = fTPFile0.getGroup();
    boolean b12 = fTPFile0.isDirectory();
    boolean b13 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                          0 null"+ "'", str10.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test154"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                         -1 ");
    fTPFile0.setName("?---------    0                         -1 hi!");
    fTPFile0.setType(0);
    fTPFile0.setHardLinkCount((int)(short)0);
    int i14 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test155"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(short)0);
    boolean b7 = fTPFile0.isFile();
    boolean b8 = fTPFile0.isDirectory();
    long long9 = fTPFile0.getSize();
    boolean b10 = fTPFile0.isSymbolicLink();
    fTPFile0.setType((int)(short)-1);
    
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
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test156"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    int i4 = fTPFile0.getType();
    fTPFile0.setType(3);
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getUser();
    boolean b9 = fTPFile0.isSymbolicLink();
    java.lang.String str10 = fTPFile0.getLink();
    java.lang.String str11 = fTPFile0.getLink();
    
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
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test157"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    long long5 = fTPFile0.getSize();
    boolean b6 = fTPFile0.isUnknown();
    fTPFile0.setLink("?---------   -1          ?---------    2                          0 ?---------    0                          0 null        0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test158"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setLink("");
    java.lang.String str8 = fTPFile0.getRawListing();
    fTPFile0.setRawListing("?---------    0                          0 ?---------    0                          0 null");
    boolean b11 = fTPFile0.isValid();
    boolean b12 = fTPFile0.isUnknown();
    java.lang.String str13 = fTPFile0.toString();
    boolean b14 = fTPFile0.isSymbolicLink();
    boolean b15 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str13.equals("?---------    0                          0 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test159"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    long long4 = fTPFile0.getSize();
    fTPFile0.setGroup("?---------    0                          0 ?---------    0                          0 null");
    fTPFile0.setName("?---------    0                          0 null");
    fTPFile0.setGroup("?---------    0                         -1 hi!");
    fTPFile0.setSize((long)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test160"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getName();
    java.lang.String str5 = fTPFile0.toFormattedString();
    fTPFile0.setRawListing("");
    long long8 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                          0 null"+ "'", str5.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test161"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test162"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    java.lang.String str4 = fTPFile0.getUser();
    int i5 = fTPFile0.getType();
    fTPFile0.setType((int)(byte)1);
    java.lang.String str8 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test163"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    0                          0 null");
    fTPFile0.setName("?---------    0                          0 null");
    fTPFile0.setName("?---------   35                         -1 null");
    java.lang.String str11 = fTPFile0.getName();
    java.lang.String str12 = fTPFile0.getRawListing();
    java.lang.String str13 = fTPFile0.toFormattedString();
    fTPFile0.setGroup("?---------    0 ?---------    0                         -1 ?---------    0                         -1                 -1 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 "+ "'", str6.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------   35                         -1 null"+ "'", str11.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0                         -1 ?---------   35                         -1 null"+ "'", str13.equals("?---------    0                         -1 ?---------   35                         -1 null"));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test164"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(short)0);
    boolean b7 = fTPFile0.isFile();
    boolean b8 = fTPFile0.isFile();
    java.lang.String str9 = fTPFile0.toString();
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    1                          0 null");
    
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
    org.junit.Assert.assertNull(calendar10);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test165"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("?---------    0                         -1 ");
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------    0 ?---------    0                         -1                  0 null");
    fTPFile0.setLink("?---------   35                         -1 null");
    long long11 = fTPFile0.getSize();
    java.lang.String str12 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 "+ "'", str5.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test166"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0          hi!             0 null");
    boolean b6 = fTPFile0.isFile();
    long long7 = fTPFile0.getSize();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test167"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    int i4 = fTPFile0.getType();
    fTPFile0.setType(3);
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str10 = fTPFile0.toFormattedString("?---------    1                          0 null");
    int i11 = fTPFile0.getHardLinkCount();
    
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
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test168"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(short)0);
    boolean b7 = fTPFile0.isFile();
    boolean b8 = fTPFile0.isDirectory();
    long long9 = fTPFile0.getSize();
    fTPFile0.setName("?---------    0                         -1 ");
    java.lang.String str12 = fTPFile0.getName();
    boolean b13 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!");
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         -1 "+ "'", str12.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test169"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    int i4 = fTPFile0.getType();
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    0                         -1 ");
    fTPFile0.setSize((long)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                          0 null"+ "'", str6.equals("?---------    0                          0 null"));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test170"); }


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
    fTPFile0.setRawListing("?---------    0                          0 ?---------    0                         -1 ");
    java.lang.String str21 = fTPFile0.getName();
    
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
    org.junit.Assert.assertNull(str21);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test171"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    boolean b6 = fTPFile0.isDirectory();
    fTPFile0.setName("l---------    0                          0 null");
    fTPFile0.setName("hi!");
    boolean b11 = fTPFile0.isValid();
    fTPFile0.setGroup("?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test172"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                         -1 ");
    fTPFile0.setName("?---------    0                         -1 hi!");
    fTPFile0.setRawListing("");
    boolean b12 = fTPFile0.isDirectory();
    java.lang.String str13 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0                         -1 hi!"+ "'", str13.equals("?---------    0                         -1 hi!"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test173"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    java.lang.String str7 = fTPFile0.toFormattedString();
    long long8 = fTPFile0.getSize();
    boolean b9 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str7.equals("?---------    0                          0 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test174"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    fTPFile0.setType(35);
    fTPFile0.setGroup("?---------    0                         -1 null");
    java.lang.String str11 = fTPFile0.toFormattedString("?---------   35                         -1 null");
    boolean b12 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0          ?---------    0                         -1 null       10 hi!"+ "'", str11.equals("?---------    0          ?---------    0                         -1 null       10 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test175"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(short)0);
    java.lang.String str7 = fTPFile0.getLink();
    java.lang.String str8 = fTPFile0.toString();
    fTPFile0.setGroup("?---------    0                          0 null");
    java.lang.String str11 = fTPFile0.getRawListing();
    fTPFile0.setHardLinkCount(52);
    java.lang.String str14 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    0                          0 null"+ "'", str14.equals("?---------    0                          0 null"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test176"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    fTPFile0.setHardLinkCount((int)'4');
    fTPFile0.setHardLinkCount((int)(short)100);
    java.lang.String str7 = fTPFile0.toString();
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1                  0 null");
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                          0 ?---------    0                         -1 ");
    java.util.Calendar calendar12 = null;
    fTPFile0.setTimestamp(calendar12);
    fTPFile0.setType((int)(byte)0);
    boolean b16 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount((int)(short)100);
    boolean b19 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------  100                         -1 hi!"+ "'", str11.equals("?---------  100                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test177"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    int i4 = fTPFile0.getType();
    int i5 = fTPFile0.getType();
    java.lang.String str6 = fTPFile0.getGroup();
    boolean b7 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test178"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b11 = fTPFile0.hasPermission(1, 1);
    long long12 = fTPFile0.getSize();
    java.lang.String str13 = fTPFile0.getName();
    int i14 = fTPFile0.getType();
    fTPFile0.setType(100);
    
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
    org.junit.Assert.assertTrue(i14 == 97);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test179"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setSize((-1L));
    java.lang.String str7 = fTPFile0.getRawListing();
    fTPFile0.setLink("?---------    0                          0 ?---------    0                         -1 ");
    fTPFile0.setName("?---------   32 ?---------    1                          0 null                -1 ?---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test180"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    int i6 = fTPFile0.getHardLinkCount();
    long long7 = fTPFile0.getSize();
    fTPFile0.setGroup("?---------   35          ?---------   35          hi!            -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------   35                         -1 null"+ "'", str5.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test181"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setHardLinkCount(0);
    java.lang.String str7 = fTPFile0.getLink();
    boolean b8 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test182"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    fTPFile0.setGroup("?---------    0 ?---------    0                         -1                  0 null");
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    java.util.Calendar calendar12 = null;
    fTPFile0.setTimestamp(calendar12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test183"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    java.lang.String str7 = fTPFile0.toFormattedString();
    long long8 = fTPFile0.getSize();
    boolean b9 = fTPFile0.isUnknown();
    fTPFile0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str7.equals("?---------    0                          0 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test184"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                          0 null");
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    fTPFile0.setHardLinkCount((int)' ');
    boolean b11 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("?---------    1                          0 null");
    long long14 = fTPFile0.getSize();
    java.lang.String str15 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------   32 ?---------    1                          0 null                -1 ?---------    0                          0 null"+ "'", str15.equals("?---------   32 ?---------    1                          0 null                -1 ?---------    0                          0 null"));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test185"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    int i4 = fTPFile0.getType();
    java.lang.String str5 = fTPFile0.getUser();
    java.lang.String str6 = fTPFile0.toString();
    fTPFile0.setSize((long)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test186"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    java.lang.String str4 = fTPFile0.getLink();
    java.lang.String str5 = fTPFile0.getName();
    boolean b6 = fTPFile0.isUnknown();
    java.lang.String str7 = fTPFile0.toString();
    java.lang.String str8 = fTPFile0.toFormattedString();
    int i9 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 hi!"+ "'", str8.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test187"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.getRawListing();
    boolean b4 = fTPFile0.isDirectory();
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    java.lang.String str6 = fTPFile0.getLink();
    java.lang.String str7 = fTPFile0.toFormattedString();
    fTPFile0.setGroup("?---------   35          ?---------    0                         -1 hi!       -1 null");
    
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

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test188"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    java.lang.String str6 = fTPFile0.toString();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getRawListing();
    java.lang.String str9 = fTPFile0.getName();
    boolean b10 = fTPFile0.isSymbolicLink();
    java.lang.String str12 = fTPFile0.toFormattedString("?---------    0                         -1 ?---------    0                         -1 ");
    java.lang.String str13 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------   35          hi!            -1 null"+ "'", str12.equals("?---------   35          hi!            -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test189"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0                         -1 ");
    fTPFile0.setSize(100L);
    java.lang.String str8 = fTPFile0.getUser();
    long long9 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 "+ "'", str8.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 100L);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test190"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    long long4 = fTPFile0.getSize();
    fTPFile0.setGroup("?---------    0                          0 ?---------    0                          0 null");
    fTPFile0.setName("?---------    0                          0 null");
    boolean b9 = fTPFile0.isDirectory();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)0, (-1), true);
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
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test191"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                         -1 ");
    boolean b8 = fTPFile0.isUnknown();
    boolean b9 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test192"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b11 = fTPFile0.hasPermission(1, 1);
    int i12 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test193"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    long long4 = fTPFile0.getSize();
    fTPFile0.setGroup("?---------    0                          0 ?---------    0                          0 null");
    fTPFile0.setName("?---------    0                          0 null");
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    java.lang.String str10 = fTPFile0.getName();
    fTPFile0.setType((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                          0 null"+ "'", str10.equals("?---------    0                          0 null"));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test194"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("?---------    0                          0 null");
    boolean b7 = fTPFile0.isValid();
    fTPFile0.setGroup("?---------    0                         -1 hi!");
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setName("?---------    0 ?---------    0                         -1 ?---------    0                         -1                 -1 ");
    fTPFile0.setLink("?---------   -1          ?---------    0                         -1 hi!       -1 ?---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test195"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isSymbolicLink();
    java.lang.String str2 = fTPFile0.getLink();
    boolean b3 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test196"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(short)0);
    boolean b7 = fTPFile0.isFile();
    boolean b8 = fTPFile0.isFile();
    fTPFile0.setGroup("?---------    2                          0 ?---------    0                          0 null");
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(short)0, (int)(short)100, true);
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
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test197"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("?---------    0                         -1 ");
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------    0 ?---------    0                         -1                  0 null");
    java.lang.String str9 = fTPFile0.toString();
    fTPFile0.setSize(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 "+ "'", str5.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test198"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    boolean b7 = fTPFile0.isValid();
    fTPFile0.setLink("?---------    0                         -1 ");
    boolean b10 = fTPFile0.isSymbolicLink();
    fTPFile0.setRawListing("?---------    0                          1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test199"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    fTPFile0.setName("?---------   35                         -1 null");
    fTPFile0.setName("?---------    0          hi!             0 null");
    java.lang.String str10 = fTPFile0.getGroup();
    boolean b11 = fTPFile0.isSymbolicLink();
    java.lang.String str12 = fTPFile0.getUser();
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = fTPFile0.hasPermission((-1), (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test200"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    int i4 = fTPFile0.getHardLinkCount();
    boolean b5 = fTPFile0.isSymbolicLink();
    int i6 = fTPFile0.getType();
    fTPFile0.setGroup("?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 ?---------    0          hi!             0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test201"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    0                          0 null");
    fTPFile0.setName("?---------    0                          0 null");
    fTPFile0.setSize((long)'#');
    java.lang.String str11 = fTPFile0.getUser();
    fTPFile0.setRawListing("?---------   32          l---------    0                          0 null       -1 ?---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 "+ "'", str6.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test202"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                         -1 ");
    fTPFile0.setType(2);
    boolean b14 = fTPFile0.isFile();
    int i15 = fTPFile0.getType();
    boolean b16 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar17 = null;
    fTPFile0.setTimestamp(calendar17);
    java.lang.String str19 = fTPFile0.getUser();
    java.util.Calendar calendar20 = fTPFile0.getTimestamp();
    java.lang.String str21 = fTPFile0.getUser();
    fTPFile0.setType((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          0 null"+ "'", str11.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test203"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("?---------    0                          0 null");
    boolean b7 = fTPFile0.isValid();
    fTPFile0.setSize((long)(byte)-1);
    java.lang.String str10 = fTPFile0.getName();
    java.lang.String str11 = fTPFile0.getName();
    fTPFile0.setSize((long)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                          0 null"+ "'", str10.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          0 null"+ "'", str11.equals("?---------    0                          0 null"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test204"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    long long4 = fTPFile0.getSize();
    java.lang.String str5 = fTPFile0.toFormattedString();
    fTPFile0.setGroup("?---------    0                         -1 null");
    fTPFile0.setUser("l---------    0                          0 null");
    boolean b10 = fTPFile0.isDirectory();
    long long11 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                          0 null"+ "'", str5.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test205"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setLink("?---------    0                          0 ?---------    0                         -1 ");
    java.lang.String str8 = fTPFile0.toFormattedString("?---------    0                          0 ?---------    0                         -1 ");
    boolean b9 = fTPFile0.isUnknown();
    java.lang.String str10 = fTPFile0.getRawListing();
    boolean b11 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------   35                         -1 null"+ "'", str8.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test206"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    0                          0 null");
    fTPFile0.setName("?---------    0                          0 null");
    fTPFile0.setSize((long)'#');
    java.lang.String str11 = fTPFile0.getUser();
    java.lang.String str12 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 "+ "'", str6.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test207"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("?---------    0                         -1 ");
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------    0 ?---------    0                         -1                  0 null");
    fTPFile0.setLink("?---------   35                         -1 null");
    java.lang.String str11 = fTPFile0.getGroup();
    fTPFile0.setRawListing("l---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 "+ "'", str5.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test208"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isSymbolicLink();
    fTPFile0.setName("?---------    0                         10 hi!");
    boolean b4 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test209"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                         -1 ");
    fTPFile0.setName("?---------    0                         -1 hi!");
    fTPFile0.setRawListing("?---------   35                         -1 null");
    java.lang.String str12 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test210"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    fTPFile0.setSize((long)1);
    fTPFile0.setSize((long)(byte)1);
    java.lang.String str7 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test211"); }


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
    fTPFile0.setSize((-1L));
    
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

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test212"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setLink("");
    java.lang.String str8 = fTPFile0.getRawListing();
    boolean b9 = fTPFile0.isSymbolicLink();
    java.lang.String str10 = fTPFile0.getLink();
    fTPFile0.setUser("?---------   35          hi!            -1 null");
    java.lang.String str14 = fTPFile0.toFormattedString("?---------    1                          0 null");
    fTPFile0.setUser("?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!");
    java.lang.String str17 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    0 ?---------   35          hi!            -1 null                -1 hi!"+ "'", str14.equals("?---------    0 ?---------   35          hi!            -1 null                -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!"+ "'", str17.equals("?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test213"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    fTPFile0.setSize(0L);
    fTPFile0.setLink("?---------    0 ?---------    0                         -1 ?---------    0                         -1                 -1 ");
    boolean b10 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test214"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    fTPFile0.setRawListing("?---------   35                         -1 null");
    boolean b6 = fTPFile0.isFile();
    boolean b7 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test215"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    fTPFile0.setHardLinkCount((int)'4');
    fTPFile0.setHardLinkCount((int)(short)100);
    java.lang.String str7 = fTPFile0.toString();
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1                  0 null");
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                          0 ?---------    0                         -1 ");
    java.lang.String str12 = fTPFile0.toString();
    java.util.Calendar calendar13 = fTPFile0.getTimestamp();
    java.lang.String str14 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------  100                         -1 hi!"+ "'", str11.equals("?---------  100                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0 ?---------    0                         -1                  0 null"+ "'", str12.equals("?---------    0 ?---------    0                         -1                  0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test216"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setGroup("hi!");
    java.lang.String str7 = fTPFile0.getUser();
    boolean b8 = fTPFile0.isFile();
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                         -1 hi!");
    java.lang.String str13 = fTPFile0.toFormattedString("?---------    0                          0 ?---------    0                         -1 ");
    java.util.Calendar calendar14 = null;
    fTPFile0.setTimestamp(calendar14);
    boolean b16 = fTPFile0.isUnknown();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0          hi!             0 null"+ "'", str13.equals("?---------    0          hi!             0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test217"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    java.lang.String str8 = fTPFile0.getUser();
    boolean b9 = fTPFile0.isSymbolicLink();
    boolean b10 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test218"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    java.lang.String str6 = fTPFile0.getRawListing();
    boolean b7 = fTPFile0.isUnknown();
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str10 = fTPFile0.toFormattedString("?---------    0                          0 null");
    fTPFile0.setRawListing("?---------    0          hi!             0 null");
    boolean b13 = fTPFile0.isFile();
    java.lang.String str15 = fTPFile0.toFormattedString("d---------    0                          0 null");
    java.util.Calendar calendar16 = fTPFile0.getTimestamp();
    
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                          0 null"+ "'", str10.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    0                          0 null"+ "'", str15.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar16);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test219"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    fTPFile0.setLink("?---------    0                          0 ?---------    0                          0 null");
    boolean b5 = fTPFile0.isDirectory();
    java.lang.String str6 = fTPFile0.getLink();
    boolean b7 = fTPFile0.isFile();
    java.lang.String str8 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str6.equals("?---------    0                          0 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 null"+ "'", str8.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test220"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1                  0 null");
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    fTPFile0.setSize((long)(-1));
    boolean b12 = fTPFile0.hasPermission(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test221"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    boolean b7 = fTPFile0.isFile();
    fTPFile0.setName("?---------   -1 ?---------    0                          0 null                 0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test222"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    java.lang.String str7 = fTPFile0.getGroup();
    java.lang.String str8 = fTPFile0.getName();
    java.lang.String str9 = fTPFile0.getName();
    fTPFile0.setName("?---------    2                         -1 null");
    fTPFile0.setName("?---------    0 ?---------    0                          0 null                 0 null");
    java.lang.String str14 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                          0 null"+ "'", str8.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                          0 null"+ "'", str9.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test223"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    int i4 = fTPFile0.getType();
    fTPFile0.setType(3);
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str10 = fTPFile0.toFormattedString("?---------    1                          0 null");
    fTPFile0.setName("?---------   35                         -1 null");
    boolean b13 = fTPFile0.isUnknown();
    
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
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test224"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(short)0);
    boolean b7 = fTPFile0.isFile();
    boolean b8 = fTPFile0.isDirectory();
    long long9 = fTPFile0.getSize();
    fTPFile0.setName("?---------    0                         -1 ");
    java.lang.String str12 = fTPFile0.getName();
    fTPFile0.setHardLinkCount((int)(byte)1);
    boolean b15 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar16 = fTPFile0.getTimestamp();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         -1 "+ "'", str12.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar16);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test225"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    java.lang.String str6 = fTPFile0.toFormattedString();
    boolean b7 = fTPFile0.isUnknown();
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                         -1 ?---------    0                          0 null");
    boolean b10 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 hi!"+ "'", str6.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 hi!"+ "'", str9.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test226"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1                  0 null");
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setLink("?---------    0                          0 ?---------    0                         -1 ");
    int i10 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test227"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    java.lang.String str7 = fTPFile0.getGroup();
    java.lang.String str8 = fTPFile0.getName();
    java.lang.String str9 = fTPFile0.getName();
    fTPFile0.setName("?---------    2                         -1 null");
    fTPFile0.setName("?---------    0 ?---------    0                          0 null                 0 null");
    boolean b14 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                          0 null"+ "'", str8.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                          0 null"+ "'", str9.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test228"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    fTPFile0.setHardLinkCount(2);
    java.lang.String str9 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(byte)1);
    boolean b12 = fTPFile0.isUnknown();
    fTPFile0.setHardLinkCount((int)(byte)-1);
    fTPFile0.setGroup("d---------    0                         -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test229"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    int i4 = fTPFile0.getHardLinkCount();
    boolean b5 = fTPFile0.isSymbolicLink();
    int i6 = fTPFile0.getType();
    boolean b7 = fTPFile0.isUnknown();
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = fTPFile0.hasPermission((int)(byte)100, (int)(byte)-1);
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
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test230"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    fTPFile0.setName("?---------    0                         -1 ");
    java.lang.String str8 = fTPFile0.getGroup();
    java.lang.String str10 = fTPFile0.toFormattedString("?---------    0                         -1 hi!");
    java.lang.String str11 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                          0 ?---------    0                         -1 "+ "'", str10.equals("?---------    0                          0 ?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test231"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(short)0);
    boolean b7 = fTPFile0.isFile();
    boolean b8 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount((-1));
    boolean b11 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test232"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    boolean b2 = fTPFile0.isFile();
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    int i6 = fTPFile0.getHardLinkCount();
    java.lang.String str7 = fTPFile0.getName();
    fTPFile0.setSize(100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test233"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setSize((-1L));
    java.lang.String str7 = fTPFile0.getRawListing();
    fTPFile0.setLink("?---------    0                          0 ?---------    0                         -1 ");
    fTPFile0.setLink("");
    fTPFile0.setHardLinkCount((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test234"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(short)0);
    boolean b7 = fTPFile0.isFile();
    boolean b8 = fTPFile0.isDirectory();
    long long9 = fTPFile0.getSize();
    fTPFile0.setType((int)(short)-1);
    java.lang.String str12 = fTPFile0.getLink();
    
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
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test235"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.hasPermission((int)(byte)1, (int)(short)1);
    java.lang.String str7 = fTPFile0.getRawListing();
    fTPFile0.setGroup("");
    fTPFile0.setType((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test236"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.hasPermission((int)(byte)1, (int)(short)1);
    boolean b7 = fTPFile0.isValid();
    boolean b8 = fTPFile0.isFile();
    boolean b9 = fTPFile0.isFile();
    boolean b10 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test237"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    fTPFile0.setUser("");
    java.lang.String str8 = fTPFile0.getName();
    fTPFile0.setGroup("");
    int i11 = fTPFile0.getType();
    java.lang.String str12 = fTPFile0.getUser();
    fTPFile0.setName("?---------    2 ?---------    0          hi!             0 null                 0 ?---------    0                          0 null");
    java.lang.String str15 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test238"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    boolean b3 = fTPFile0.isUnknown();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.lang.String str6 = fTPFile0.toFormattedString();
    long long7 = fTPFile0.getSize();
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str9 = fTPFile0.getUser();
    boolean b10 = fTPFile0.isSymbolicLink();
    boolean b11 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test239"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str7 = fTPFile0.toFormattedString("?---------    0                          0 ?---------    0                          0 null");
    fTPFile0.setSize((long)10);
    fTPFile0.setLink("?---------    0                          0 ?---------    0                         -1 ");
    java.lang.String str12 = fTPFile0.toString();
    fTPFile0.setLink("?---------   35          hi!            -1 null");
    int i15 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str7.equals("?---------    0                          0 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test240"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setName("?---------    0                         -1 ?---------    0                         -1 ");
    fTPFile0.setLink("?---------    0 ?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null                 0 null");
    fTPFile0.setSize(0L);
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = fTPFile0.hasPermission((int)(short)10, 35);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test241"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    boolean b6 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.toFormattedString("");
    fTPFile0.setType(97);
    fTPFile0.setSize((long)(short)100);
    java.lang.String str13 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         10 hi!"+ "'", str8.equals("?---------    0                         10 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0                        100 hi!"+ "'", str13.equals("?---------    0                        100 hi!"));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test242"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    fTPFile0.setType(35);
    fTPFile0.setGroup("?---------    0                         -1 null");
    java.lang.String str11 = fTPFile0.toFormattedString("?---------   35                         -1 null");
    fTPFile0.setGroup("l---------    0                          0 null");
    java.lang.String str15 = fTPFile0.toFormattedString("?---------    0                          0 ?---------    0          hi!             0 null");
    java.lang.String str16 = fTPFile0.getName();
    fTPFile0.setUser("?---------    0 l---------    0                          0 null                -1 ?---------    0                         -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0          ?---------    0                         -1 null       10 hi!"+ "'", str11.equals("?---------    0          ?---------    0                         -1 null       10 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    0          l---------    0                          0 null       10 hi!"+ "'", str15.equals("?---------    0          l---------    0                          0 null       10 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test243"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    boolean b7 = fTPFile0.isUnknown();
    java.lang.String str8 = fTPFile0.getUser();
    fTPFile0.setType(3);
    fTPFile0.setType((int)(short)-1);
    boolean b13 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test244"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("?---------   35          hi!            -1 null");
    java.lang.String str7 = fTPFile0.toString();
    java.lang.String str8 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------   35          hi!            -1 null"+ "'", str8.equals("?---------   35          hi!            -1 null"));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test245"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    boolean b3 = fTPFile0.isUnknown();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.lang.String str6 = fTPFile0.toFormattedString();
    long long7 = fTPFile0.getSize();
    fTPFile0.setName("");
    fTPFile0.setType(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test246"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str7 = fTPFile0.toFormattedString("?---------    0                          0 ?---------    0                          0 null");
    fTPFile0.setSize((long)10);
    fTPFile0.setLink("?---------    0                          0 ?---------    0                         -1 ");
    java.lang.String str12 = fTPFile0.toString();
    fTPFile0.setLink("?---------   35          hi!            -1 null");
    fTPFile0.setGroup("?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 ?---------    0          hi!             0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str7.equals("?---------    0                          0 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test247"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    fTPFile0.setLink("?---------    0                          0 null");
    fTPFile0.setHardLinkCount(10);
    boolean b10 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test248"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                          0 null");
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    fTPFile0.setHardLinkCount((int)' ');
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = fTPFile0.hasPermission(35, 52);
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
    org.junit.Assert.assertNull(calendar8);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test249"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    java.lang.String str4 = fTPFile0.getUser();
    int i5 = fTPFile0.getType();
    fTPFile0.setType((int)(byte)1);
    fTPFile0.setGroup("?---------   -1          ?---------    0                         -1 hi!       -1 ?---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test250"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    fTPFile0.setSize((long)'#');
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("");
    fTPFile0.setGroup("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test251"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("?---------    0                         -1 ");
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isUnknown();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    boolean b9 = fTPFile0.isFile();
    fTPFile0.setSize((long)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 "+ "'", str5.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test252"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(short)0);
    boolean b7 = fTPFile0.isFile();
    boolean b8 = fTPFile0.isDirectory();
    long long9 = fTPFile0.getSize();
    fTPFile0.setType(0);
    boolean b12 = fTPFile0.isFile();
    int i13 = fTPFile0.getHardLinkCount();
    java.lang.String str14 = fTPFile0.toFormattedString();
    
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
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "----------    0                          0 null"+ "'", str14.equals("----------    0                          0 null"));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test253"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    java.lang.String str7 = fTPFile0.toFormattedString("?---------    0                          0 null");
    fTPFile0.setName("hi!");
    java.lang.String str10 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------   35                         -1 null"+ "'", str5.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   35                         -1 null"+ "'", str7.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test254"); }


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
    // The following exception was thrown during execution in test generation
    try {
    boolean b24 = fTPFile0.hasPermission((int)(short)10, 10);
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
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 97);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test255"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isSymbolicLink();
    java.lang.String str3 = fTPFile0.toFormattedString("?---------    0                          0 ?---------    0                          0 null");
    java.lang.String str4 = fTPFile0.getLink();
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test256"); }


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
    fTPFile0.setSize((long)(short)100);
    
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

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test257"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.getRawListing();
    boolean b4 = fTPFile0.isDirectory();
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.isFile();
    fTPFile0.setUser("");
    long long9 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test258"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    fTPFile0.setHardLinkCount((int)'4');
    fTPFile0.setHardLinkCount((int)(short)100);
    java.lang.String str7 = fTPFile0.toString();
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1                  0 null");
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                          0 ?---------    0                         -1 ");
    java.util.Calendar calendar12 = null;
    fTPFile0.setTimestamp(calendar12);
    fTPFile0.setType((int)(byte)0);
    boolean b16 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount((int)(short)100);
    java.lang.String str20 = fTPFile0.toFormattedString("?---------    2 ?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------  100                         -1 hi!"+ "'", str11.equals("?---------  100                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "----------  100                         -1 hi!"+ "'", str20.equals("----------  100                         -1 hi!"));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test259"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    fTPFile0.setUser("?---------    0                         -1 ");
    fTPFile0.setSize((long)(short)0);
    fTPFile0.setLink("");
    java.lang.String str9 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test260"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    boolean b7 = fTPFile0.isUnknown();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    java.lang.String str9 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test261"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    boolean b6 = fTPFile0.isDirectory();
    boolean b7 = fTPFile0.isValid();
    boolean b8 = fTPFile0.isUnknown();
    fTPFile0.setLink("?---------    0                          0 ?---------    0                          0 null");
    int i11 = fTPFile0.getType();
    long long12 = fTPFile0.getSize();
    java.lang.String str13 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test262"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0                         -1 ");
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    fTPFile0.setSize((long)2);
    boolean b10 = fTPFile0.isFile();
    int i11 = fTPFile0.getType();
    boolean b12 = fTPFile0.isFile();
    fTPFile0.setHardLinkCount((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test263"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setType((int)'#');
    java.lang.String str8 = fTPFile0.toFormattedString("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 hi!"+ "'", str8.equals("?---------    0                         -1 hi!"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test264"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    boolean b3 = fTPFile0.isUnknown();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    int i6 = fTPFile0.getType();
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setHardLinkCount((int)(byte)-1);
    java.lang.String str10 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test265"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    boolean b6 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.toFormattedString("");
    fTPFile0.setGroup("?---------    0 ?---------    0                          0 null                 0 null");
    boolean b11 = fTPFile0.isDirectory();
    fTPFile0.setName("?---------    0 l---------    0                          0 null                -1 ?---------    0                         -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         10 hi!"+ "'", str8.equals("?---------    0                         10 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test266"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    long long5 = fTPFile0.getSize();
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    boolean b8 = fTPFile0.isValid();
    boolean b9 = fTPFile0.isDirectory();
    int i10 = fTPFile0.getHardLinkCount();
    fTPFile0.setHardLinkCount((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test267"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    java.lang.String str4 = fTPFile0.getUser();
    int i5 = fTPFile0.getType();
    fTPFile0.setType((int)(byte)1);
    boolean b8 = fTPFile0.isValid();
    fTPFile0.setLink("?---------    2 ?---------    0          hi!             0 null                 0 ?---------    0                          0 null");
    java.lang.String str11 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test268"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    fTPFile0.setRawListing("?---------   35                         -1 null");
    boolean b6 = fTPFile0.isFile();
    fTPFile0.setHardLinkCount(97);
    boolean b9 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test269"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    boolean b3 = fTPFile0.isUnknown();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    int i6 = fTPFile0.getType();
    boolean b7 = fTPFile0.isUnknown();
    boolean b8 = fTPFile0.isFile();
    java.lang.String str9 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 null"+ "'", str9.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test270"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    long long4 = fTPFile0.getSize();
    java.lang.String str5 = fTPFile0.toFormattedString();
    fTPFile0.setGroup("?---------    0                         -1 null");
    fTPFile0.setUser("l---------    0                          0 null");
    boolean b10 = fTPFile0.isDirectory();
    java.lang.String str11 = fTPFile0.getLink();
    int i12 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                          0 null"+ "'", str5.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test271"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    boolean b7 = fTPFile0.isDirectory();
    boolean b8 = fTPFile0.isDirectory();
    boolean b9 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test272"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                         -1 ");
    fTPFile0.setType(2);
    boolean b14 = fTPFile0.isFile();
    int i15 = fTPFile0.getType();
    boolean b16 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar17 = null;
    fTPFile0.setTimestamp(calendar17);
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str21 = fTPFile0.getRawListing();
    boolean b22 = fTPFile0.isDirectory();
    java.lang.String str23 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          0 null"+ "'", str11.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "l---------    0                          0 ?---------    0                          0 null"+ "'", str23.equals("l---------    0                          0 ?---------    0                          0 null"));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test273"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    int i4 = fTPFile0.getType();
    java.lang.String str5 = fTPFile0.getUser();
    int i6 = fTPFile0.getHardLinkCount();
    fTPFile0.setUser("?---------    0                        100 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test274"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                         -1 ");
    fTPFile0.setType(2);
    boolean b14 = fTPFile0.isFile();
    int i15 = fTPFile0.getType();
    boolean b16 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar17 = null;
    fTPFile0.setTimestamp(calendar17);
    java.lang.String str19 = fTPFile0.getUser();
    int i20 = fTPFile0.getType();
    fTPFile0.setName("?---------    0                          0 ?---------   35          hi!            -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          0 null"+ "'", str11.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 2);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test275"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.lang.String str3 = fTPFile0.getUser();
    int i4 = fTPFile0.getType();
    fTPFile0.setUser("?---------    0                         -1 ?---------    0                         -1 ");
    java.lang.String str8 = fTPFile0.toFormattedString("?---------    0 ?---------   35          hi!            -1 null                -1 hi!");
    fTPFile0.setName("?---------   52                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0 ?---------    0                         -1 ?---------    0                         -1                 -1 "+ "'", str8.equals("?---------    0 ?---------    0                         -1 ?---------    0                         -1                 -1 "));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test276"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    java.lang.String str3 = fTPFile0.toFormattedString();
    java.lang.String str4 = fTPFile0.toString();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isDirectory();
    int i7 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0                         -1 ?---------    0                         -1 ");
    int i10 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test277"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setSize((-1L));
    boolean b7 = fTPFile0.isUnknown();
    java.lang.String str8 = fTPFile0.toFormattedString();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(35, 0, true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 hi!"+ "'", str8.equals("?---------    0                         -1 hi!"));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test278"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    fTPFile0.setRawListing("?---------    0                          0 ?---------    0                         -1 ");
    fTPFile0.setGroup("?---------    1                          0 null");
    java.lang.String str12 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test279"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.lang.String str3 = fTPFile0.getUser();
    int i4 = fTPFile0.getType();
    fTPFile0.setUser("?---------    0                         -1 ?---------    0                         -1 ");
    fTPFile0.setRawListing("?---------    0          hi!             0 null");
    fTPFile0.setGroup("?---------    0 ?---------    0                          0 null                 0 null");
    int i11 = fTPFile0.getHardLinkCount();
    fTPFile0.setType((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test280"); }


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
    fTPFile0.setGroup("?---------    0                         -1 ?---------   35                         -1 null");
    fTPFile0.setPermission((int)(short)0, (int)(byte)0, false);
    
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

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test281"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0                         -1 ");
    boolean b6 = fTPFile0.isUnknown();
    fTPFile0.setGroup("?---------    0                         -1 hi!");
    fTPFile0.setRawListing("?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!");
    fTPFile0.setGroup("?---------    0                          0 null");
    java.lang.String str13 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test282"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    int i5 = fTPFile0.getHardLinkCount();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isDirectory();
    java.lang.String str8 = fTPFile0.getName();
    int i9 = fTPFile0.getHardLinkCount();
    long long10 = fTPFile0.getSize();
    java.lang.String str11 = fTPFile0.getLink();
    java.util.Calendar calendar12 = null;
    fTPFile0.setTimestamp(calendar12);
    
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
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test283"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isSymbolicLink();
    int i5 = fTPFile0.getHardLinkCount();
    boolean b6 = fTPFile0.isDirectory();
    
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
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test284"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("?---------    0                         -1 ");
    java.lang.String str5 = fTPFile0.getUser();
    java.lang.String str6 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------   35                         -1 null"+ "'", str6.equals("?---------   35                         -1 null"));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test285"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    int i4 = fTPFile0.getType();
    java.lang.String str5 = fTPFile0.getRawListing();
    boolean b6 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test286"); }


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
    fTPFile0.setName("?---------    0                         -1 hi!");
    
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

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test287"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    long long6 = fTPFile0.getSize();
    java.lang.String str8 = fTPFile0.toFormattedString("?---------   35          hi!            -1 null");
    boolean b9 = fTPFile0.isDirectory();
    fTPFile0.setName("?---------    0          hi!             0 null");
    java.lang.String str12 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                          0 null"+ "'", str8.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0          hi!             0 null"+ "'", str12.equals("?---------    0          hi!             0 null"));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test288"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                          0 null");
    int i8 = fTPFile0.getType();
    boolean b9 = fTPFile0.isFile();
    java.lang.String str10 = fTPFile0.toString();
    boolean b11 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------  100                         -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test289"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    0                          0 null");
    long long7 = fTPFile0.getSize();
    java.lang.String str8 = fTPFile0.getGroup();
    java.lang.String str9 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 "+ "'", str6.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test290"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    boolean b5 = fTPFile0.isDirectory();
    fTPFile0.setName("?---------    0                         -1 ");
    boolean b8 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test291"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    java.lang.String str7 = fTPFile0.getGroup();
    java.lang.String str8 = fTPFile0.getName();
    fTPFile0.setSize(0L);
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    boolean b12 = fTPFile0.isDirectory();
    java.lang.String str14 = fTPFile0.toFormattedString("?---------    0                          0 ?---------    0          hi!             0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                          0 null"+ "'", str8.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str14.equals("?---------    0                          0 ?---------    0                          0 null"));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test292"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("?---------    0                          0 null");
    boolean b7 = fTPFile0.isValid();
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0          hi!             0 null");
    java.lang.String str10 = fTPFile0.toString();
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str9.equals("?---------    0                          0 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test293"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    int i4 = fTPFile0.getType();
    boolean b5 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("?---------   35                         -1 null");
    fTPFile0.setGroup("?---------    0          hi!             0 null");
    java.lang.String str10 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test294"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    boolean b7 = fTPFile0.isUnknown();
    java.lang.String str8 = fTPFile0.getUser();
    fTPFile0.setType(3);
    fTPFile0.setType((int)(short)-1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = fTPFile0.hasPermission(1, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
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
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test295"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    java.lang.String str7 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                         -1 hi!");
    fTPFile0.setType((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str7.equals("?---------    0                          0 ?---------    0                          0 null"));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test296"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    fTPFile0.setType(35);
    fTPFile0.setGroup("?---------    0                         -1 null");
    java.lang.String str11 = fTPFile0.toFormattedString("?---------   35                         -1 null");
    fTPFile0.setGroup("l---------    0                          0 null");
    fTPFile0.setLink("?---------    0          hi!             0 null");
    fTPFile0.setSize((long)(short)0);
    fTPFile0.setLink("?---------  100                         -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0          ?---------    0                         -1 null       10 hi!"+ "'", str11.equals("?---------    0          ?---------    0                         -1 null       10 hi!"));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test297"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setGroup("?---------    0 ?---------    0                         -1                  0 null");
    fTPFile0.setName("?---------   35                         -1 ?---------    0                          0 ?---------    0                          0 null");
    java.lang.String str9 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0 ?---------    0                         -1                  0 null"+ "'", str9.equals("?---------    0 ?---------    0                         -1                  0 null"));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test298"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    fTPFile0.setName("?---------    0                         -1 ");
    java.lang.String str8 = fTPFile0.getGroup();
    fTPFile0.setGroup("?---------    0                         -1 hi!");
    java.lang.String str11 = fTPFile0.getUser();
    fTPFile0.setUser("?---------    2 ?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null                -1 null");
    java.lang.String str14 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test299"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    fTPFile0.setLink("?---------    0                          0 ?---------    0                          0 null");
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1                  0 null");
    boolean b7 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test300"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isSymbolicLink();
    long long5 = fTPFile0.getSize();
    fTPFile0.setName("?---------    2                          0 ?---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test301"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    java.lang.String str6 = fTPFile0.getRawListing();
    java.lang.String str7 = fTPFile0.getUser();
    java.lang.String str8 = fTPFile0.getRawListing();
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = fTPFile0.hasPermission(0, 97);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test302"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    int i4 = fTPFile0.getHardLinkCount();
    fTPFile0.setGroup("");
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    int i9 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test303"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    long long5 = fTPFile0.getSize();
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    java.lang.String str9 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test304"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    boolean b6 = fTPFile0.isDirectory();
    boolean b7 = fTPFile0.isValid();
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str10 = fTPFile0.toFormattedString("hi!");
    boolean b11 = fTPFile0.isValid();
    fTPFile0.setLink("hi!");
    java.lang.String str14 = fTPFile0.getGroup();
    fTPFile0.setName("?---------  100                         -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                          0 null"+ "'", str10.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test305"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    fTPFile0.setHardLinkCount((int)'4');
    fTPFile0.setGroup("");

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test306"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1                  0 null");
    java.lang.String str6 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toString();
    boolean b8 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0 ?---------    0                         -1                  0 null"+ "'", str6.equals("?---------    0 ?---------    0                         -1                  0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0 ?---------    0                         -1                  0 null"+ "'", str7.equals("?---------    0 ?---------    0                         -1                  0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test307"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------    0                          0 ?---------    0                          0 null");
    fTPFile0.setHardLinkCount((int)'4');
    boolean b9 = fTPFile0.isDirectory();
    fTPFile0.setLink("?---------   35          ?---------   35          hi!            -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test308"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    fTPFile0.setRawListing("?---------   35                         -1 null");
    boolean b4 = fTPFile0.isDirectory();
    int i5 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test309"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    fTPFile0.setUser("");
    java.lang.String str8 = fTPFile0.getUser();
    boolean b9 = fTPFile0.isSymbolicLink();
    fTPFile0.setHardLinkCount((int)(byte)-1);
    fTPFile0.setRawListing("?---------    0                          0 null");
    int i14 = fTPFile0.getType();
    java.lang.String str15 = fTPFile0.getName();
    boolean b16 = fTPFile0.isValid();
    fTPFile0.setUser("?---------    2                          1 ?---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test310"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    java.lang.String str4 = fTPFile0.getLink();
    java.lang.String str5 = fTPFile0.getName();
    boolean b6 = fTPFile0.isUnknown();
    boolean b7 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("?---------  100                         -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test311"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setName("?---------    0                         -1 ?---------    0                         -1 ");
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.toFormattedString();
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = fTPFile0.hasPermission((int)' ', 35);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 ?---------    0                         -1 ?---------    0                         -1 "+ "'", str8.equals("?---------    0                         -1 ?---------    0                         -1 ?---------    0                         -1 "));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test312"); }


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
    int i15 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0 ?---------    0                         -1                  0 null"+ "'", str11.equals("?---------    0 ?---------    0                         -1                  0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test313"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    boolean b8 = fTPFile0.isDirectory();
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                          0 l---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0          hi!            10 hi!"+ "'", str11.equals("?---------    0          hi!            10 hi!"));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test314"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0                          0 ?---------    0                         -1 ");
    boolean b7 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test315"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    java.lang.String str6 = fTPFile0.toString();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getRawListing();
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    java.lang.String str10 = fTPFile0.getUser();
    java.lang.String str11 = fTPFile0.toString();
    boolean b12 = fTPFile0.isUnknown();
    
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test316"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    fTPFile0.setUser("?---------    0                         -1 ");
    fTPFile0.setSize((long)(short)0);
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setName("?---------    0 ?---------    0          hi!             0 null                 0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test317"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isSymbolicLink();
    java.lang.String str3 = fTPFile0.toFormattedString("?---------    0                          0 ?---------    0                          0 null");
    java.lang.String str4 = fTPFile0.getUser();
    long long5 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test318"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b11 = fTPFile0.hasPermission(1, 1);
    fTPFile0.setLink("");
    fTPFile0.setRawListing("?---------    0                          0 ?---------    0                          0 null");
    fTPFile0.setName("?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!");
    java.lang.String str18 = fTPFile0.getName();
    int i19 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!"+ "'", str18.equals("?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test319"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("hi!");
    boolean b3 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    boolean b6 = fTPFile0.isValid();
    long long7 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test320"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                         -1 ");
    fTPFile0.setName("?---------    0                         -1 hi!");
    java.lang.String str10 = fTPFile0.getName();
    java.lang.String str11 = fTPFile0.toString();
    long long12 = fTPFile0.getSize();
    java.lang.String str14 = fTPFile0.toFormattedString("");
    java.lang.String str16 = fTPFile0.toFormattedString("?---------    0 ?---------    0          hi!             0 null                 0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 hi!"+ "'", str10.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    0                         -1 ?---------    0                         -1 hi!"+ "'", str14.equals("?---------    0                         -1 ?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "?---------    0                         -1 ?---------    0                         -1 hi!"+ "'", str16.equals("?---------    0                         -1 ?---------    0                         -1 hi!"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test321"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("?---------    0                         -1 ");
    boolean b5 = fTPFile0.isUnknown();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    fTPFile0.setHardLinkCount((int)(short)-1);
    int i9 = fTPFile0.getType();
    fTPFile0.setName("?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!");
    java.lang.String str12 = fTPFile0.getLink();
    java.util.Calendar calendar13 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         -1 "+ "'", str12.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar13);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test322"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    int i4 = fTPFile0.getType();
    fTPFile0.setUser("?---------    0 ?---------    0                         -1                  0 null");
    fTPFile0.setLink("?---------    0                         -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test323"); }


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
    java.lang.String str13 = fTPFile0.getRawListing();
    fTPFile0.setUser("?---------    0                         -1 ?---------    0                          0 null");
    java.lang.String str16 = fTPFile0.getUser();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "?---------    0                         -1 ?---------    0                          0 null"+ "'", str16.equals("?---------    0                         -1 ?---------    0                          0 null"));

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test324"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.toFormattedString();
    java.lang.String str5 = fTPFile0.toFormattedString();
    java.lang.String str6 = fTPFile0.getUser();
    java.lang.String str7 = fTPFile0.getName();
    boolean b8 = fTPFile0.isDirectory();
    int i9 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test325"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------    0                          0 ?---------    0                          0 null");
    fTPFile0.setPermission((int)(byte)0, (int)(short)0, true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test326"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    int i4 = fTPFile0.getHardLinkCount();
    fTPFile0.setGroup("");
    java.lang.String str7 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.isValid();
    boolean b9 = fTPFile0.isValid();
    fTPFile0.setLink("?---------    0 ?---------    0                          0 null                 0 null");
    java.lang.String str12 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0 ?---------    0                          0 null                 0 null"+ "'", str12.equals("?---------    0 ?---------    0                          0 null                 0 null"));

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test327"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1                  0 null");
    fTPFile0.setHardLinkCount(2);
    boolean b8 = fTPFile0.isDirectory();
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    boolean b11 = fTPFile0.isFile();
    boolean b12 = fTPFile0.isUnknown();
    fTPFile0.setType(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test328"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setHardLinkCount(0);
    java.lang.String str7 = fTPFile0.getLink();
    fTPFile0.setGroup("d---------    0                         -1 hi!");
    boolean b10 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test329"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    fTPFile0.setHardLinkCount(2);
    int i9 = fTPFile0.getHardLinkCount();
    java.lang.String str10 = fTPFile0.getName();
    int i11 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                          0 null"+ "'", str10.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test330"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    0                          0 null");
    fTPFile0.setName("?---------    0                          0 null");
    fTPFile0.setName("?---------   35                         -1 null");
    java.lang.String str11 = fTPFile0.getName();
    boolean b12 = fTPFile0.isSymbolicLink();
    java.lang.String str13 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 "+ "'", str6.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------   35                         -1 null"+ "'", str11.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test331"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    java.lang.String str7 = fTPFile0.getGroup();
    java.lang.String str8 = fTPFile0.getName();
    fTPFile0.setSize(0L);
    boolean b11 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                          0 null"+ "'", str8.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test332"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    0                          0 null");
    fTPFile0.setName("?---------    0                          0 null");
    fTPFile0.setType((int)'4');
    fTPFile0.setUser("?---------    0                          0 ?---------    0                         -1 ");
    java.lang.String str13 = fTPFile0.toString();
    long long14 = fTPFile0.getSize();
    java.lang.String str15 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 "+ "'", str6.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    0                          0 ?---------    0                         -1 "+ "'", str15.equals("?---------    0                          0 ?---------    0                         -1 "));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test333"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    int i5 = fTPFile0.getHardLinkCount();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str10 = fTPFile0.getRawListing();
    java.lang.String str11 = fTPFile0.getLink();
    long long12 = fTPFile0.getSize();
    boolean b13 = fTPFile0.isFile();
    
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
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test334"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    boolean b8 = fTPFile0.isDirectory();
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(short)0, 0, true);
    fTPFile0.setHardLinkCount((int)(short)1);
    boolean b16 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0          hi!            10 hi!"+ "'", str9.equals("?---------    0          hi!            10 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test335"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str8 = fTPFile0.toFormattedString("?---------   35                         -1 null");
    boolean b9 = fTPFile0.isSymbolicLink();
    fTPFile0.setName("?---------    0                          1 null");
    boolean b12 = fTPFile0.isUnknown();
    java.lang.String str13 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 "+ "'", str8.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test336"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    java.lang.String str4 = fTPFile0.getLink();
    fTPFile0.setGroup("?---------    0                         -1 null");
    fTPFile0.setGroup("?---------    0                          1 null");
    fTPFile0.setRawListing("");
    java.lang.String str11 = fTPFile0.getGroup();
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = fTPFile0.hasPermission((int)(short)1, 100);
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
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          1 null"+ "'", str11.equals("?---------    0                          1 null"));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test337"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    boolean b6 = fTPFile0.isDirectory();
    fTPFile0.setName("l---------    0                          0 null");
    fTPFile0.setSize((long)(byte)1);
    boolean b11 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test338"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    boolean b5 = fTPFile0.isSymbolicLink();
    java.lang.String str6 = fTPFile0.getRawListing();
    java.lang.String str7 = fTPFile0.getName();
    boolean b8 = fTPFile0.isDirectory();
    
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
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test339"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    java.lang.String str6 = fTPFile0.toString();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getRawListing();
    java.lang.String str9 = fTPFile0.getName();
    boolean b10 = fTPFile0.isSymbolicLink();
    java.lang.String str12 = fTPFile0.toFormattedString("?---------    0                         -1 ?---------    0                         -1 ");
    java.lang.String str13 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------   35          hi!            -1 null"+ "'", str12.equals("?---------   35          hi!            -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test340"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.toFormattedString();
    java.lang.String str5 = fTPFile0.toFormattedString();
    java.lang.String str6 = fTPFile0.getUser();
    java.lang.String str7 = fTPFile0.getName();
    long long8 = fTPFile0.getSize();
    int i9 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test341"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0                         -1 ");
    boolean b6 = fTPFile0.isUnknown();
    fTPFile0.setLink("?---------    0                         -1 hi!");
    boolean b9 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test342"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    long long4 = fTPFile0.getSize();
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isValid();
    java.lang.String str7 = fTPFile0.getGroup();
    int i8 = fTPFile0.getType();
    fTPFile0.setSize((long)97);
    
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
    org.junit.Assert.assertTrue(i8 == 3);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test343"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    boolean b6 = fTPFile0.isDirectory();
    fTPFile0.setName("l---------    0                          0 null");
    fTPFile0.setName("hi!");
    fTPFile0.setUser("?---------   35          ?---------   35          hi!            -1 null       -1 null");
    fTPFile0.setGroup("?---------    0                         -1 hi!");
    java.lang.String str15 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    0 ?---------   35          ?---------   35          hi!            -1 null       -1 null ?---------    0                         -1 hi!        0 hi!"+ "'", str15.equals("?---------    0 ?---------   35          ?---------   35          hi!            -1 null       -1 null ?---------    0                         -1 hi!        0 hi!"));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test344"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    java.lang.String str5 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test345"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.hasPermission((int)(byte)1, (int)(short)1);
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1                  0 null");
    java.lang.String str9 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test346"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setHardLinkCount((-1));
    java.lang.String str7 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test347"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    boolean b6 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.toFormattedString("");
    fTPFile0.setType(97);
    int i11 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         10 hi!"+ "'", str8.equals("?---------    0                         10 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test348"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0                         -1 ");
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    boolean b8 = fTPFile0.isUnknown();
    fTPFile0.setLink("?---------    0                          0 null");
    fTPFile0.setHardLinkCount((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test349"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setGroup("hi!");
    java.lang.String str7 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test350"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    int i4 = fTPFile0.getHardLinkCount();
    boolean b5 = fTPFile0.isSymbolicLink();
    int i6 = fTPFile0.getType();
    boolean b7 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.toFormattedString();
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 hi!"+ "'", str8.equals("?---------    0                         -1 hi!"));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test351"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0          hi!             0 null");
    boolean b6 = fTPFile0.isFile();
    fTPFile0.setSize((long)3);
    boolean b9 = fTPFile0.isSymbolicLink();
    fTPFile0.setSize((long)10);
    boolean b12 = fTPFile0.isValid();
    int i13 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test352"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    int i4 = fTPFile0.getType();
    fTPFile0.setRawListing("?---------    0                         -1 hi!");
    fTPFile0.setUser("?---------    0                          0 ?---------    0                          0 null");
    fTPFile0.setGroup("hi!");
    java.lang.String str11 = fTPFile0.getLink();
    boolean b12 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test353"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1                  0 null");
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setLink("?---------    0                          0 ?---------    0                         -1 ");
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    2                          0 ?---------    0                          0 null");
    fTPFile0.setUser("?---------    0                          0 ?---------    0                          0 null");
    java.lang.String str14 = fTPFile0.getUser();
    java.lang.String str15 = fTPFile0.getGroup();
    boolean b16 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    2                         -1 null"+ "'", str11.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str14.equals("?---------    0                          0 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test354"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    boolean b8 = fTPFile0.isDirectory();
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    fTPFile0.setType(100);
    fTPFile0.setType((int)' ');
    fTPFile0.setType(35);
    fTPFile0.setRawListing("?---------    0          ?---------    0                         -1 hi!        0 ?---------    0                         -1 ");
    int i18 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test355"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    boolean b7 = fTPFile0.isUnknown();
    boolean b8 = fTPFile0.isDirectory();
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    int i10 = fTPFile0.getHardLinkCount();
    java.lang.String str11 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test356"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    int i5 = fTPFile0.getHardLinkCount();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str10 = fTPFile0.getRawListing();
    fTPFile0.setType((int)(byte)100);
    int i13 = fTPFile0.getHardLinkCount();
    int i14 = fTPFile0.getHardLinkCount();
    
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
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test357"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isSymbolicLink();
    java.lang.String str2 = fTPFile0.getLink();
    fTPFile0.setName("?---------    0          hi!            10 hi!");
    fTPFile0.setUser("?---------    0          ?---------    0          hi!             0 null        0 null");
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test358"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(short)0);
    java.lang.String str7 = fTPFile0.getLink();
    java.lang.String str8 = fTPFile0.toString();
    fTPFile0.setGroup("?---------    0                          0 null");
    java.lang.String str11 = fTPFile0.getRawListing();
    fTPFile0.setHardLinkCount(52);
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(97, 97, true);
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
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test359"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------    0          hi!             0 null");
    java.lang.String str7 = fTPFile0.toFormattedString("?---------   32 ?---------    1                          0 null                -1 ?---------    0                          0 null");
    boolean b10 = fTPFile0.hasPermission(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0          ?---------    0          hi!             0 null        0 null"+ "'", str7.equals("?---------    0          ?---------    0          hi!             0 null        0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test360"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    int i4 = fTPFile0.getType();
    fTPFile0.setType(3);
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    boolean b8 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test361"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setLink("");
    java.lang.String str8 = fTPFile0.getRawListing();
    java.lang.String str9 = fTPFile0.getRawListing();
    fTPFile0.setSize((long)(byte)-1);
    java.lang.String str12 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test362"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("?---------    0                         -1 ");
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isUnknown();
    boolean b7 = fTPFile0.isFile();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 "+ "'", str5.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test363"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    int i4 = fTPFile0.getHardLinkCount();
    boolean b5 = fTPFile0.isValid();
    fTPFile0.setType((-1));
    fTPFile0.setHardLinkCount(35);
    java.lang.String str10 = fTPFile0.getLink();
    fTPFile0.setType((int)(byte)0);
    fTPFile0.setHardLinkCount((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test364"); }


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
    boolean b14 = fTPFile0.isFile();
    boolean b15 = fTPFile0.isFile();
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = fTPFile0.hasPermission((int)(short)-1, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
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
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test365"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    fTPFile0.setHardLinkCount(1);
    boolean b4 = fTPFile0.isFile();
    java.lang.String str5 = fTPFile0.getUser();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test366"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.lang.String str3 = fTPFile0.getUser();
    int i4 = fTPFile0.getType();
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    java.lang.String str6 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 "+ "'", str6.equals("?---------    0                         -1 "));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test367"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    boolean b7 = fTPFile0.isDirectory();
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = fTPFile0.hasPermission(97, (int)(short)-1);
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

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test368"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b11 = fTPFile0.hasPermission(1, 1);
    long long12 = fTPFile0.getSize();
    java.lang.String str13 = fTPFile0.toString();
    java.lang.String str14 = fTPFile0.getUser();
    java.util.Calendar calendar15 = fTPFile0.getTimestamp();
    boolean b16 = fTPFile0.isValid();
    
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
    org.junit.Assert.assertNull(calendar15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test369"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    fTPFile0.setRawListing("?---------   35                         -1 null");
    boolean b6 = fTPFile0.isFile();
    fTPFile0.setSize((long)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test370"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    boolean b4 = fTPFile0.isDirectory();
    java.lang.String str6 = fTPFile0.toFormattedString("?---------   52                         -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------   35                         -1 null"+ "'", str6.equals("?---------   35                         -1 null"));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test371"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("?---------   35          hi!            -1 null");
    long long7 = fTPFile0.getSize();
    fTPFile0.setGroup("----------  100                         -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test372"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    fTPFile0.setUser("");
    java.lang.String str8 = fTPFile0.getName();
    fTPFile0.setGroup("");
    java.lang.String str11 = fTPFile0.getLink();
    fTPFile0.setRawListing("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test373"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    boolean b8 = fTPFile0.isDirectory();
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(short)0, 0, true);
    fTPFile0.setHardLinkCount((int)(short)1);
    java.util.Calendar calendar16 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0          hi!            10 hi!"+ "'", str9.equals("?---------    0          hi!            10 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar16);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test374"); }


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
    fTPFile0.setSize((long)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 "+ "'", str6.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null"+ "'", str15.equals("?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null"));

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test375"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("?---------    0                          0 null");
    boolean b7 = fTPFile0.isValid();
    fTPFile0.setGroup("?---------    0                         -1 hi!");
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setName("?---------    0 ?---------    0                         -1 ?---------    0                         -1                 -1 ");
    fTPFile0.setHardLinkCount(0);
    java.lang.String str16 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test376"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    fTPFile0.setRawListing("?---------    2                          1 ?---------    0                          0 null");
    long long8 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test377"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setLink("");
    java.lang.String str8 = fTPFile0.getRawListing();
    fTPFile0.setRawListing("?---------    0                          0 ?---------    0                          0 null");
    boolean b11 = fTPFile0.isValid();
    boolean b12 = fTPFile0.isUnknown();
    java.lang.String str13 = fTPFile0.toString();
    boolean b14 = fTPFile0.isSymbolicLink();
    int i15 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str13.equals("?---------    0                          0 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test378"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setSize((-1L));
    java.lang.String str7 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.isDirectory();
    java.lang.String str9 = fTPFile0.getName();
    int i10 = fTPFile0.getType();
    fTPFile0.setSize(35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test379"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                         -1 ");
    fTPFile0.setType(2);
    boolean b14 = fTPFile0.isFile();
    int i15 = fTPFile0.getType();
    boolean b16 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar17 = null;
    fTPFile0.setTimestamp(calendar17);
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str21 = fTPFile0.getRawListing();
    fTPFile0.setPermission(0, 2, true);
    int i26 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          0 null"+ "'", str11.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 2);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test380"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.getRawListing();
    boolean b4 = fTPFile0.isDirectory();
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)97);
    int i8 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test381"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("?---------    0                         -1 ");
    java.lang.String str5 = fTPFile0.getLink();
    java.lang.String str6 = fTPFile0.toFormattedString();
    java.lang.String str7 = fTPFile0.getLink();
    java.lang.String str8 = fTPFile0.getGroup();
    java.lang.String str10 = fTPFile0.toFormattedString("?---------   35          ?---------   35          hi!            -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 "+ "'", str5.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------   35                         -1 null"+ "'", str6.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 "+ "'", str7.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------   35                         -1 null"+ "'", str10.equals("?---------   35                         -1 null"));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test382"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setLink("?---------    0                          0 null");
    boolean b7 = fTPFile0.isSymbolicLink();
    boolean b8 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test383"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    boolean b3 = fTPFile0.isUnknown();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    boolean b6 = fTPFile0.isSymbolicLink();
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = fTPFile0.hasPermission(10, 3);
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
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test384"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    fTPFile0.setSize((long)1);
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.toFormattedString();
    java.lang.String str8 = fTPFile0.getRawListing();
    fTPFile0.setGroup("?---------   35          ?---------   35          hi!            -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                          1 null"+ "'", str7.equals("?---------    0                          1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test385"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                         -1 ");
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str9 = fTPFile0.getRawListing();
    java.lang.String str10 = fTPFile0.getGroup();
    boolean b11 = fTPFile0.isUnknown();
    java.lang.String str12 = fTPFile0.getLink();
    boolean b13 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test386"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    int i4 = fTPFile0.getHardLinkCount();
    boolean b5 = fTPFile0.isValid();
    fTPFile0.setType((-1));
    fTPFile0.setHardLinkCount(35);
    fTPFile0.setUser("?---------    0                          0 l---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test387"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    java.lang.String str6 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test388"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setType((int)'#');
    long long7 = fTPFile0.getSize();
    boolean b8 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test389"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    fTPFile0.setSize((long)'#');
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    java.lang.String str7 = fTPFile0.toFormattedString();
    fTPFile0.setType((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         35 null"+ "'", str7.equals("?---------    0                         35 null"));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test390"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(short)0);
    boolean b7 = fTPFile0.isFile();
    fTPFile0.setRawListing("?---------    0                          0 ?---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test391"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                         -1 ");
    fTPFile0.setType(2);
    java.lang.String str14 = fTPFile0.getUser();
    int i15 = fTPFile0.getHardLinkCount();
    int i16 = fTPFile0.getHardLinkCount();
    int i17 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          0 null"+ "'", str11.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test392"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    boolean b3 = fTPFile0.isUnknown();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    boolean b6 = fTPFile0.isSymbolicLink();
    boolean b7 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test393"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    0                          0 null");
    fTPFile0.setName("?---------    0                          0 null");
    fTPFile0.setName("?---------   35                         -1 null");
    java.lang.String str11 = fTPFile0.getName();
    java.lang.String str12 = fTPFile0.getRawListing();
    java.lang.String str14 = fTPFile0.toFormattedString("l---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 "+ "'", str6.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------   35                         -1 null"+ "'", str11.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    0                         -1 ?---------   35                         -1 null"+ "'", str14.equals("?---------    0                         -1 ?---------   35                         -1 null"));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test394"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    0                          0 null");
    fTPFile0.setName("?---------    0                          0 null");
    fTPFile0.setType((int)'4');
    fTPFile0.setUser("?---------    0                          0 ?---------    0                         -1 ");
    java.lang.String str13 = fTPFile0.toString();
    java.lang.String str14 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 "+ "'", str6.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    0                          0 ?---------    0                         -1 "+ "'", str14.equals("?---------    0                          0 ?---------    0                         -1 "));

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test395"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    java.lang.String str5 = fTPFile0.toFormattedString();
    java.lang.String str6 = fTPFile0.getRawListing();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                          0 null"+ "'", str5.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test396"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.getRawListing();
    boolean b4 = fTPFile0.isDirectory();
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    java.lang.String str6 = fTPFile0.getLink();
    java.lang.String str7 = fTPFile0.toFormattedString();
    java.lang.String str8 = fTPFile0.toString();
    boolean b9 = fTPFile0.isValid();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)'4', 0, false);
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
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                          0 null"+ "'", str7.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test397"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    java.lang.String str7 = fTPFile0.toFormattedString();
    long long8 = fTPFile0.getSize();
    fTPFile0.setType(10);
    boolean b11 = fTPFile0.isUnknown();
    java.util.Calendar calendar12 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str7.equals("?---------    0                          0 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar12);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test398"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    fTPFile0.setHardLinkCount(2);
    java.lang.String str9 = fTPFile0.getGroup();
    boolean b10 = fTPFile0.isFile();
    fTPFile0.setUser("?---------   35                         -1 null");
    java.lang.String str13 = fTPFile0.toString();
    fTPFile0.setLink("?---------    0 ?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!                 0 null");
    java.lang.String str16 = fTPFile0.getRawListing();
    fTPFile0.setName("?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test399"); }


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
    boolean b14 = fTPFile0.isFile();
    boolean b15 = fTPFile0.isFile();
    boolean b16 = fTPFile0.isFile();
    
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
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test400"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    boolean b7 = fTPFile0.isUnknown();
    java.lang.String str8 = fTPFile0.getUser();
    boolean b9 = fTPFile0.isDirectory();
    boolean b10 = fTPFile0.isUnknown();
    fTPFile0.setLink("?---------    0 ?---------    0                          0 null                 0 null");
    int i13 = fTPFile0.getHardLinkCount();
    java.lang.String str14 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test401"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    fTPFile0.setHardLinkCount(2);
    java.lang.String str9 = fTPFile0.getGroup();
    boolean b10 = fTPFile0.isFile();
    java.lang.String str11 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test402"); }


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
    fTPFile0.setUser("?---------   -1          ?---------    0                         -1 hi!       -1 ?---------    0                          0 null");
    
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

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test403"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    fTPFile0.setHardLinkCount((int)'4');
    java.lang.String str5 = fTPFile0.getName();
    java.lang.String str6 = fTPFile0.getRawListing();
    fTPFile0.setType((int)'a');
    boolean b9 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test404"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    boolean b4 = fTPFile0.isValid();
    long long5 = fTPFile0.getSize();
    long long6 = fTPFile0.getSize();
    fTPFile0.setUser("?---------    0                          0 null");
    java.lang.String str9 = fTPFile0.toString();
    boolean b10 = fTPFile0.isFile();
    java.lang.String str11 = fTPFile0.getGroup();
    
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test405"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.lang.String str3 = fTPFile0.getUser();
    int i4 = fTPFile0.getType();
    fTPFile0.setUser("?---------    0                         -1 ?---------    0                         -1 ");
    java.lang.String str7 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0 ?---------    0                         -1 ?---------    0                         -1                 -1 "+ "'", str7.equals("?---------    0 ?---------    0                         -1 ?---------    0                         -1                 -1 "));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test406"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("?---------    0                          0 null");
    boolean b7 = fTPFile0.isValid();
    boolean b8 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("");
    fTPFile0.setHardLinkCount(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test407"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    java.lang.String str4 = fTPFile0.getUser();
    int i5 = fTPFile0.getHardLinkCount();
    fTPFile0.setHardLinkCount((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test408"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    int i6 = fTPFile0.getHardLinkCount();
    boolean b7 = fTPFile0.isValid();
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!");
    fTPFile0.setName("?---------    0 ?---------    0                         -1 ?---------    0                         -1                 -1 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------   35                         -1 null"+ "'", str5.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------   35                         -1 null"+ "'", str9.equals("?---------   35                         -1 null"));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test409"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.hasPermission((int)(byte)1, (int)(short)1);
    boolean b7 = fTPFile0.isValid();
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                         -1 hi!");
    fTPFile0.setUser("?---------    0          hi!             0 null");
    java.lang.String str12 = fTPFile0.toFormattedString();
    java.lang.String str13 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                          0 null"+ "'", str9.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0 ?---------    0          hi!             0 null                 0 null"+ "'", str12.equals("?---------    0 ?---------    0          hi!             0 null                 0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test410"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0          hi!             0 null");
    boolean b6 = fTPFile0.isFile();
    fTPFile0.setSize((long)3);
    fTPFile0.setRawListing("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test411"); }


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
    java.lang.String str21 = fTPFile0.getGroup();
    fTPFile0.setGroup("?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null");
    
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
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test412"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str7 = fTPFile0.toFormattedString("?---------    0                          0 ?---------    0                          0 null");
    fTPFile0.setSize((long)10);
    fTPFile0.setLink("?---------    0                          0 ?---------    0                         -1 ");
    java.lang.String str12 = fTPFile0.toString();
    fTPFile0.setLink("?---------   35          hi!            -1 null");
    fTPFile0.setRawListing("?---------    0                         -1 ");
    fTPFile0.setUser("?---------    0                          0 ?---------    0                         -1 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str7.equals("?---------    0                          0 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test413"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.getUser();
    fTPFile0.setUser("?---------    0                         -1 ");
    fTPFile0.setGroup("l---------    0                          0 null");
    java.lang.String str10 = fTPFile0.getName();
    java.lang.String str11 = fTPFile0.toString();
    java.lang.String str12 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test414"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getName();
    boolean b5 = fTPFile0.isUnknown();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)' ', (int)' ', false);
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
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test415"); }


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
    fTPFile0.setUser("?---------   32 ?---------    1                          0 null                -1 ?---------    0                          0 null");
    
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

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test416"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("?---------    0                         -1 ");
    java.lang.String str5 = fTPFile0.getLink();
    java.lang.String str6 = fTPFile0.getLink();
    fTPFile0.setName("?---------    0 ?---------    0                          0 null                 0 null");
    java.lang.String str9 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 "+ "'", str5.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 "+ "'", str6.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test417"); }


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
    java.lang.String str18 = fTPFile0.toFormattedString("?---------    0                         -1 hi!");
    java.lang.String str19 = fTPFile0.getLink();
    boolean b20 = fTPFile0.isSymbolicLink();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "?---------    1                          0 null"+ "'", str18.equals("?---------    1                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test418"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                         -1 ");
    fTPFile0.setName("?---------    0                         -1 hi!");
    fTPFile0.setRawListing("");
    fTPFile0.setRawListing("?---------   35          hi!            -1 ?---------    0          hi!             0 null");
    fTPFile0.setHardLinkCount((int)' ');
    boolean b16 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------    0 ?---------   35          hi!            -1 null                -1 hi!");
    int i19 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 32);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test419"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    fTPFile0.setGroup("?---------    0 ?---------    0                         -1                  0 null");
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    boolean b12 = fTPFile0.isUnknown();
    fTPFile0.setName("?---------   -1          ?---------    2                          0 ?---------    0                          0 null        0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test420"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(short)0);
    boolean b7 = fTPFile0.isFile();
    boolean b8 = fTPFile0.isDirectory();
    java.lang.String str9 = fTPFile0.getUser();
    java.lang.String str10 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test421"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setGroup("?---------   35          hi!            -1 null");
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    0                         -1 ?---------    0                          0 null");
    fTPFile0.setUser("?---------    2                          1 ?---------    0                          0 null");
    java.lang.String str9 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------   35          ?---------   35          hi!            -1 null       -1 null"+ "'", str6.equals("?---------   35          ?---------   35          hi!            -1 null       -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------   35 ?---------    2                          1 ?---------    0                          0 null ?---------   35          hi!            -1 null       -1 null"+ "'", str9.equals("?---------   35 ?---------    2                          1 ?---------    0                          0 null ?---------   35          hi!            -1 null       -1 null"));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test422"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    java.lang.String str7 = fTPFile0.toFormattedString();
    fTPFile0.setRawListing("");
    java.lang.String str10 = fTPFile0.getName();
    java.lang.String str12 = fTPFile0.toFormattedString("?---------    0                          0 ?---------    0                         -1 ");
    java.lang.String str13 = fTPFile0.getGroup();
    fTPFile0.setUser("?---------    0                         -1 ?---------    0                         -1 ?---------    0                         -1 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str7.equals("?---------    0                          0 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                          0 null"+ "'", str10.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str12.equals("?---------    0                          0 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test423"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    java.lang.String str4 = fTPFile0.getUser();
    int i5 = fTPFile0.getType();
    fTPFile0.setType((int)(byte)1);
    boolean b8 = fTPFile0.isValid();
    fTPFile0.setUser("?---------    0          ?---------    0          hi!             0 null        0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test424"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    fTPFile0.setGroup("?---------    0 ?---------    0                         -1                  0 null");
    fTPFile0.setName("?---------    2                          1 ?---------    0                          0 null");
    fTPFile0.setLink("?---------    0                          0 ?---------    0                         -1 ");
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = fTPFile0.hasPermission((int)(byte)10, (int)(byte)0);
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

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test425"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str7 = fTPFile0.toFormattedString("?---------    0                          0 ?---------    0                          0 null");
    java.lang.String str8 = fTPFile0.toFormattedString();
    fTPFile0.setGroup("?---------   35                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str7.equals("?---------    0                          0 ?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                          0 ?---------    0                          0 null"+ "'", str8.equals("?---------    0                          0 ?---------    0                          0 null"));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test426"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    fTPFile0.setName("?---------   35                         -1 null");
    boolean b8 = fTPFile0.isFile();
    fTPFile0.setUser("?---------  100                         -1 hi!");
    java.lang.String str11 = fTPFile0.toString();
    boolean b12 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test427"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    boolean b4 = fTPFile0.isDirectory();
    java.lang.String str5 = fTPFile0.getGroup();
    boolean b6 = fTPFile0.isUnknown();
    long long7 = fTPFile0.getSize();
    boolean b8 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test428"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b11 = fTPFile0.hasPermission(1, 1);
    fTPFile0.setLink("");
    java.lang.String str14 = fTPFile0.toFormattedString();
    boolean b15 = fTPFile0.isUnknown();
    fTPFile0.setUser("l---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    0                          0 null"+ "'", str14.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test429"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    fTPFile0.setUser("?---------    0                         -1 ");
    fTPFile0.setSize((long)(short)0);
    java.lang.String str7 = fTPFile0.getGroup();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test430"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(short)0);
    java.lang.String str7 = fTPFile0.getLink();
    java.lang.String str8 = fTPFile0.toString();
    fTPFile0.setGroup("?---------    0                          0 null");
    java.lang.String str12 = fTPFile0.toFormattedString("?---------    0          ?---------    0                         -1 null        0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0          ?---------    0                          0 null        0 null"+ "'", str12.equals("?---------    0          ?---------    0                          0 null        0 null"));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test431"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                         -1 ");
    fTPFile0.setType(2);
    java.lang.String str14 = fTPFile0.getUser();
    int i15 = fTPFile0.getHardLinkCount();
    int i16 = fTPFile0.getHardLinkCount();
    boolean b17 = fTPFile0.isDirectory();
    java.lang.String str18 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          0 null"+ "'", str11.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test432"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    fTPFile0.setHardLinkCount(2);
    java.lang.String str9 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(byte)1);
    boolean b12 = fTPFile0.isUnknown();
    fTPFile0.setHardLinkCount((int)(byte)-1);
    boolean b15 = fTPFile0.isSymbolicLink();
    fTPFile0.setType(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test433"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    boolean b3 = fTPFile0.isUnknown();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.lang.String str6 = fTPFile0.getGroup();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test434"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setHardLinkCount(0);
    boolean b7 = fTPFile0.isSymbolicLink();
    fTPFile0.setType((int)'#');
    java.lang.String str10 = fTPFile0.toString();
    fTPFile0.setSize((long)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test435"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    int i4 = fTPFile0.getHardLinkCount();
    boolean b5 = fTPFile0.isValid();
    fTPFile0.setType((-1));
    boolean b8 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test436"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(short)0);
    java.lang.String str7 = fTPFile0.getLink();
    fTPFile0.setHardLinkCount(2);
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)-1, 1, false);
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
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test437"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("?---------    0                         -1 ");
    boolean b5 = fTPFile0.isUnknown();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b9 = fTPFile0.hasPermission(0, (int)(byte)1);
    java.lang.String str10 = fTPFile0.getLink();
    boolean b11 = fTPFile0.isValid();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(3, 52, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 "+ "'", str10.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test438"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                          0 null");
    long long8 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test439"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1                  0 null");
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setLink("?---------    0                          0 ?---------    0                         -1 ");
    java.lang.String str10 = fTPFile0.toString();
    boolean b11 = fTPFile0.isUnknown();
    java.lang.String str12 = fTPFile0.getRawListing();
    java.util.Calendar calendar13 = null;
    fTPFile0.setTimestamp(calendar13);
    
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
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test440"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    java.lang.String str4 = fTPFile0.getLink();
    fTPFile0.setGroup("?---------    0                         -1 null");
    int i7 = fTPFile0.getType();
    java.lang.String str8 = fTPFile0.getLink();
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test441"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    0                          0 null");
    fTPFile0.setName("?---------    0                          0 null");
    fTPFile0.setType((int)'4');
    boolean b11 = fTPFile0.isDirectory();
    java.lang.String str12 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------    0          hi!             0 null");
    fTPFile0.setRawListing("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 "+ "'", str6.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test442"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                         -1 ");
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str9 = fTPFile0.getRawListing();
    java.lang.String str10 = fTPFile0.getGroup();
    java.lang.String str12 = fTPFile0.toFormattedString("?---------    0                         -1 ?---------    0                          0 null");
    fTPFile0.setGroup("?---------    0                         -1 ?---------    0                         -1 ");
    boolean b15 = fTPFile0.isUnknown();
    int i16 = fTPFile0.getHardLinkCount();
    fTPFile0.setName("?---------    0                          0 ?---------    0          hi!             0 null");
    java.lang.String str19 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         -1 ?---------    0                         -1 "+ "'", str12.equals("?---------    0                         -1 ?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "?---------    0          ?---------    0                         -1 ?---------    0                         -1        -1 ?---------    0                          0 ?---------    0          hi!             0 null"+ "'", str19.equals("?---------    0          ?---------    0                         -1 ?---------    0                         -1        -1 ?---------    0                          0 ?---------    0          hi!             0 null"));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test443"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.lang.String str3 = fTPFile0.getUser();
    int i4 = fTPFile0.getType();
    fTPFile0.setUser("?---------    0                         -1 ?---------    0                         -1 ");
    fTPFile0.setRawListing("?---------    0          hi!             0 null");
    fTPFile0.setUser("?---------    0 ?---------    0                         -1                  0 null");
    fTPFile0.setHardLinkCount((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test444"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    int i4 = fTPFile0.getType();
    java.lang.String str5 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.hasPermission((int)(short)1, 1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = fTPFile0.hasPermission(32, (int)(short)0);
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
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test445"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    0                          0 null");
    fTPFile0.setHardLinkCount((int)(short)1);
    fTPFile0.setRawListing("");
    java.lang.String str11 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 "+ "'", str6.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test446"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    fTPFile0.setSize((long)'#');
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    java.lang.String str7 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test447"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    fTPFile0.setName("?---------    0          hi!             0 null");
    boolean b8 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test448"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    fTPFile0.setUser("");
    java.lang.String str8 = fTPFile0.getUser();
    fTPFile0.setUser("?---------    1                          0 null");
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    fTPFile0.setUser("?---------    0 ?---------    0                         -1                  0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test449"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setHardLinkCount(0);
    java.lang.String str7 = fTPFile0.getLink();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    boolean b10 = fTPFile0.isValid();
    java.lang.String str12 = fTPFile0.toFormattedString("?---------   52                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         -1 "+ "'", str12.equals("?---------    0                         -1 "));

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test450"); }


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
    boolean b20 = fTPFile0.hasPermission(0, 0);
    java.lang.String str21 = fTPFile0.toFormattedString();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null"+ "'", str21.equals("?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 null"));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test451"); }


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
    java.lang.String str14 = fTPFile0.getName();
    fTPFile0.setGroup("?---------    0                         -1 ?---------    0 ?---------   35          hi!            -1 null                -1 hi!");
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    0                         -1 "+ "'", str14.equals("?---------    0                         -1 "));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test452"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    java.lang.String str6 = fTPFile0.toString();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getRawListing();
    java.lang.String str9 = fTPFile0.toString();
    java.lang.String str10 = fTPFile0.getName();
    boolean b11 = fTPFile0.isDirectory();
    java.lang.String str12 = fTPFile0.getRawListing();
    int i13 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test453"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    int i4 = fTPFile0.getType();
    fTPFile0.setName("?---------   35                         -1 null");
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test454"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    int i5 = fTPFile0.getHardLinkCount();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str10 = fTPFile0.getRawListing();
    java.lang.String str11 = fTPFile0.getLink();
    long long12 = fTPFile0.getSize();
    fTPFile0.setRawListing("d---------    0                         -1 hi!");
    java.lang.String str15 = fTPFile0.getLink();
    
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
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test455"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setLink("?---------    0                          0 ?---------    0                         -1 ");
    java.lang.String str8 = fTPFile0.toFormattedString("?---------    0                          0 ?---------    0                         -1 ");
    boolean b9 = fTPFile0.isUnknown();
    java.lang.String str10 = fTPFile0.getRawListing();
    fTPFile0.setHardLinkCount(97);
    long long13 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------   35                         -1 null"+ "'", str8.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == (-1L));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test456"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    fTPFile0.setName("?---------   35                         -1 null");
    fTPFile0.setName("?---------    0          hi!             0 null");
    boolean b10 = fTPFile0.isFile();
    boolean b11 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test457"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------    0                          0 ?---------    0                          0 null");
    boolean b7 = fTPFile0.isDirectory();
    boolean b8 = fTPFile0.isFile();
    fTPFile0.setUser("?---------    0                         -1 ?---------    0                          0 null");
    fTPFile0.setName("?---------    0          hi!            10 hi!");
    long long13 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == (-1L));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test458"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    java.lang.String str2 = fTPFile0.getName();
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setType((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test459"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str6 = fTPFile0.getUser();
    boolean b7 = fTPFile0.isUnknown();
    java.lang.String str8 = fTPFile0.getUser();
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str10 = fTPFile0.toString();
    boolean b11 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test460"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setLink("?---------    0                         -1 ");
    boolean b5 = fTPFile0.isUnknown();
    boolean b6 = fTPFile0.isFile();
    java.lang.String str7 = fTPFile0.getName();
    boolean b8 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test461"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------    0                          0 ?---------    0                          0 null");
    boolean b7 = fTPFile0.isDirectory();
    java.lang.String str8 = fTPFile0.getLink();
    java.lang.String str9 = fTPFile0.getUser();
    fTPFile0.setLink("?---------    0          ?---------    0                         -1 hi!        0 ?---------    0                         -1 ");
    boolean b12 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test462"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    long long5 = fTPFile0.getSize();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(0);
    java.lang.String str9 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test463"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setHardLinkCount(0);
    java.lang.String str7 = fTPFile0.getLink();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    java.lang.String str10 = fTPFile0.toString();
    java.lang.String str12 = fTPFile0.toFormattedString("?---------    0 ?---------   35          hi!            -1 null                -1 hi!");
    fTPFile0.setHardLinkCount(52);
    fTPFile0.setGroup("?---------    0 ?---------    0                          0 ?---------    0                         -1                 -1 ?---------    0                          0 ?---------    0          hi!             0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         -1 "+ "'", str12.equals("?---------    0                         -1 "));

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test464"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    java.lang.String str4 = fTPFile0.toString();
    fTPFile0.setPermission((int)(byte)1, 0, true);
    boolean b9 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test465"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    java.lang.String str4 = fTPFile0.getRawListing();
    int i5 = fTPFile0.getType();
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    boolean b8 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test466"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b11 = fTPFile0.hasPermission(1, 1);
    fTPFile0.setLink("");
    fTPFile0.setRawListing("?---------    1                         -1 ");
    fTPFile0.setHardLinkCount((int)'a');
    boolean b18 = fTPFile0.isFile();
    boolean b19 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test467"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    long long2 = fTPFile0.getSize();
    boolean b3 = fTPFile0.isUnknown();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.lang.String str6 = fTPFile0.toFormattedString();
    long long7 = fTPFile0.getSize();
    int i8 = fTPFile0.getHardLinkCount();
    java.lang.String str10 = fTPFile0.toFormattedString("?---------    1                         -1 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 null"+ "'", str10.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test468"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    boolean b6 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test469"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    java.lang.String str4 = fTPFile0.getLink();
    fTPFile0.setGroup("?---------    0                         -1 null");
    boolean b7 = fTPFile0.isSymbolicLink();
    fTPFile0.setLink("?---------   -1          ?---------    0                         -1 hi!       -1 ?---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test470"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str8 = fTPFile0.toFormattedString("?---------   35                         -1 null");
    fTPFile0.setRawListing("");
    boolean b11 = fTPFile0.isFile();
    boolean b12 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 "+ "'", str8.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test471"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    java.lang.String str6 = fTPFile0.toString();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getRawListing();
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    java.lang.String str10 = fTPFile0.getUser();
    java.lang.String str11 = fTPFile0.getRawListing();
    
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test472"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setLink("");
    java.lang.String str8 = fTPFile0.getRawListing();
    boolean b9 = fTPFile0.isSymbolicLink();
    java.lang.String str10 = fTPFile0.getLink();
    fTPFile0.setUser("?---------   35          hi!            -1 null");
    java.lang.String str14 = fTPFile0.toFormattedString("?---------    1                          0 null");
    fTPFile0.setUser("?---------    0          ?---------    0                          0 ?---------    0                          0 null       -1 hi!");
    boolean b17 = fTPFile0.isFile();
    fTPFile0.setLink("?---------    0          ?---------    0                         -1 null        0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    0 ?---------   35          hi!            -1 null                -1 hi!"+ "'", str14.equals("?---------    0 ?---------   35          hi!            -1 null                -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test473"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    int i5 = fTPFile0.getHardLinkCount();
    fTPFile0.setHardLinkCount(0);
    java.lang.String str8 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test474"); }


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
    fTPFile0.setName("?---------    0                         10 hi!");
    java.lang.String str15 = fTPFile0.getName();
    boolean b16 = fTPFile0.isValid();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    0                         10 hi!"+ "'", str15.equals("?---------    0                         10 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test475"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b11 = fTPFile0.hasPermission(1, 1);
    fTPFile0.setLink("");
    fTPFile0.setSize((long)(byte)-1);
    fTPFile0.setSize((long)10);
    long long18 = fTPFile0.getSize();
    java.util.Calendar calendar19 = null;
    fTPFile0.setTimestamp(calendar19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 10L);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test476"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("hi!");
    fTPFile0.setUser("");
    java.lang.String str8 = fTPFile0.getUser();
    fTPFile0.setUser("?---------    1                          0 null");
    java.lang.String str11 = fTPFile0.getLink();
    java.lang.String str12 = fTPFile0.toString();
    java.lang.String str13 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test477"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.hasPermission((int)(byte)1, (int)(short)1);
    fTPFile0.setUser("?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test478"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("");
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                         -1 ");
    fTPFile0.setType(2);
    boolean b14 = fTPFile0.isFile();
    int i15 = fTPFile0.getType();
    boolean b16 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("?---------    2                          1 ?---------    0                          0 null");
    java.lang.String str19 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          0 null"+ "'", str11.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "l---------    0          ?---------    2                          1 ?---------    0                          0 null        0 null"+ "'", str19.equals("l---------    0          ?---------    2                          1 ?---------    0                          0 null        0 null"));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test479"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getLink();
    fTPFile0.setType(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test480"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setGroup("hi!");
    java.lang.String str7 = fTPFile0.getUser();
    boolean b8 = fTPFile0.isFile();
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str11 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setType(0);
    java.lang.String str14 = fTPFile0.getGroup();
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test481"); }


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
    java.lang.String str18 = fTPFile0.toFormattedString("?---------    0                         -1 hi!");
    java.lang.String str19 = fTPFile0.getLink();
    long long20 = fTPFile0.getSize();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "?---------    1                          0 null"+ "'", str18.equals("?---------    1                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 0L);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test482"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setSize((-1L));
    boolean b7 = fTPFile0.isUnknown();
    java.lang.String str8 = fTPFile0.toFormattedString();
    boolean b9 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 hi!"+ "'", str8.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test483"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    long long4 = fTPFile0.getSize();
    fTPFile0.setGroup("?---------    0                          0 ?---------    0                          0 null");
    fTPFile0.setName("?---------    0                          0 null");
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    long long10 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)1);
    java.lang.String str13 = fTPFile0.getRawListing();
    fTPFile0.setType(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test484"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    long long4 = fTPFile0.getSize();
    fTPFile0.setRawListing("?---------    0                          0 null");
    fTPFile0.setName("?---------    0 ?---------    0          hi!             0 null                 0 null");
    java.lang.String str9 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------   35                         -1 ?---------    0 ?---------    0          hi!             0 null                 0 null"+ "'", str9.equals("?---------   35                         -1 ?---------    0 ?---------    0          hi!             0 null                 0 null"));

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test485"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    int i4 = fTPFile0.getHardLinkCount();
    boolean b5 = fTPFile0.isSymbolicLink();
    int i6 = fTPFile0.getType();
    boolean b7 = fTPFile0.isUnknown();
    long long8 = fTPFile0.getSize();
    fTPFile0.setLink("hi!");
    int i11 = fTPFile0.getType();
    
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
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test486"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isFile();
    boolean b2 = fTPFile0.isFile();
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    int i6 = fTPFile0.getHardLinkCount();
    fTPFile0.setLink("?---------   35                         -1 ?---------    0                          0 ?---------    0                          0 null");
    java.lang.String str9 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 null"+ "'", str9.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test487"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setName("?---------    0                         -1 ?---------    0                         -1 ");
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test488"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    long long3 = fTPFile0.getSize();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    long long5 = fTPFile0.getSize();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(0);
    boolean b9 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test489"); }


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
    fTPFile0.setGroup("?---------    0                         -1 null");
    java.lang.String str17 = fTPFile0.toFormattedString();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "?---------    0          ?---------    0                         -1 null        0 null"+ "'", str17.equals("?---------    0          ?---------    0                         -1 null        0 null"));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test490"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    long long4 = fTPFile0.getSize();
    java.lang.String str5 = fTPFile0.toFormattedString();
    fTPFile0.setGroup("?---------    0                         -1 null");
    java.lang.String str8 = fTPFile0.toString();
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                          0 null"+ "'", str5.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test491"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.lang.String str3 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toFormattedString("?---------    0                          0 null");
    boolean b6 = fTPFile0.isUnknown();
    fTPFile0.setSize((long)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 "+ "'", str5.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test492"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    int i4 = fTPFile0.getHardLinkCount();
    fTPFile0.setGroup("");
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.getName();
    java.lang.String str10 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 hi!"+ "'", str10.equals("?---------    0                         -1 hi!"));

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test493"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1                  0 null");
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setLink("?---------    0                          0 ?---------    0                         -1 ");
    java.lang.String str10 = fTPFile0.toString();
    boolean b11 = fTPFile0.isValid();
    long long12 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0 ?---------    0                         -1                  0 null"+ "'", str10.equals("?---------    0 ?---------    0                         -1                  0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-1L));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test494"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------    0                          0 null");
    fTPFile0.setName("?---------   35                         -1 null");
    boolean b8 = fTPFile0.isFile();
    fTPFile0.setType(10);
    java.lang.String str11 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                          0 null"+ "'", str3.equals("?---------    0                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test495"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    int i4 = fTPFile0.getType();
    java.lang.String str5 = fTPFile0.getUser();
    fTPFile0.setSize((long)(byte)100);
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                          0 ?---------    0          hi!             0 null");
    java.lang.String str10 = fTPFile0.toFormattedString();
    boolean b13 = fTPFile0.hasPermission((int)(byte)1, 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                        100 null"+ "'", str9.equals("?---------    0                        100 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                        100 null"+ "'", str10.equals("?---------    0                        100 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test496"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    fTPFile0.setType((int)(byte)-1);
    boolean b10 = fTPFile0.isFile();
    boolean b11 = fTPFile0.isUnknown();
    java.lang.String str12 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test497"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                          0 null");
    java.lang.String str8 = fTPFile0.getUser();
    boolean b9 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test498"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    int i8 = fTPFile0.getType();
    int i9 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test499"); }


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
    fTPFile0.setType((int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)10, (int)(short)100, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------  100                         -1 hi!"+ "'", str11.equals("?---------  100                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------  100                         -1 hi!"+ "'", str14.equals("?---------  100                         -1 hi!"));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test500"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0                         -1 ");
    boolean b6 = fTPFile0.isUnknown();
    fTPFile0.setLink("?---------    0                         -1 hi!");
    fTPFile0.setSize((long)(short)10);
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    boolean b12 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

}
