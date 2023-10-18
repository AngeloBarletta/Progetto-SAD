package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1_it4_livello4_it6_livello5 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setGroup("");
    java.lang.String str7 = fTPFile0.toString();
    java.lang.String str8 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getLink();
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    2 ?---------    0                         -1 null                -1 null");
    boolean b7 = fTPFile0.isSymbolicLink();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)100, 0, true);
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
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getRawListing();
    java.lang.String str6 = fTPFile0.getName();
    fTPFile0.setGroup("?---------    2                         -1 null");
    long long9 = fTPFile0.getSize();
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    fTPFile0.setGroup("?---------    2                         -1 null");
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    fTPFile0.setLink("?---------    2                         10 null");
    fTPFile0.setType((int)(short)10);
    fTPFile0.setRawListing("?---------    0                          1 null");
    java.lang.String str16 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("");
    int i9 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'a');
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.getRawListing();
    java.lang.String str5 = fTPFile0.getRawListing();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setUser("");
    fTPFile0.setName("?---------    2                         -1 null");
    long long7 = fTPFile0.getSize();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    fTPFile0.setName("?---------    2                         -1 null");
    int i9 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setGroup("");
    boolean b7 = fTPFile0.isDirectory();
    int i8 = fTPFile0.getHardLinkCount();
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str10 = fTPFile0.getName();
    fTPFile0.setUser("?---------    2                         10 null");
    int i13 = fTPFile0.getHardLinkCount();
    boolean b14 = fTPFile0.isFile();
    int i15 = fTPFile0.getType();
    boolean b16 = fTPFile0.isFile();
    fTPFile0.setType(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.getRawListing();
    fTPFile0.setRawListing("hi!");
    java.lang.String str10 = fTPFile0.getUser();
    java.lang.String str11 = fTPFile0.getLink();
    fTPFile0.setSize((long)(short)0);
    java.lang.String str14 = fTPFile0.toFormattedString();
    fTPFile0.setLink("?---------    0                          1 ?---------    0                         -1 null");
    fTPFile0.setUser("?---------    2                         -1 null");
    java.lang.String str20 = fTPFile0.toFormattedString("?---------    2 ?---------    2                         -1 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    2                          0 null"+ "'", str14.equals("?---------    2                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "?---------    2 ?---------    2                         -1 null                 0 null"+ "'", str20.equals("?---------    2 ?---------    2                         -1 null                 0 null"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    boolean b5 = fTPFile0.isFile();
    boolean b6 = fTPFile0.isFile();
    fTPFile0.setSize(10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    java.lang.String str10 = fTPFile0.toFormattedString();
    boolean b11 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------  100                         -1 null");
    java.lang.String str15 = fTPFile0.toFormattedString("?---------    1                         -1 null");
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = fTPFile0.hasPermission((int)(short)10, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    2                          0 null"+ "'", str10.equals("?---------    2                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    2 ?---------  100                         -1 null                 0 null"+ "'", str15.equals("?---------    2 ?---------  100                         -1 null                 0 null"));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'a');
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.getRawListing();
    java.lang.String str5 = fTPFile0.toFormattedString();
    java.lang.String str7 = fTPFile0.toFormattedString("");
    java.lang.String str8 = fTPFile0.toFormattedString();
    java.lang.String str10 = fTPFile0.toFormattedString("?---------    0                         -1 null");
    fTPFile0.setGroup("?---------  100                         -1 null");
    boolean b13 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------   97                         -1 null"+ "'", str5.equals("?---------   97                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   97                         -1 null"+ "'", str7.equals("?---------   97                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------   97                         -1 null"+ "'", str8.equals("?---------   97                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------   97                         -1 null"+ "'", str10.equals("?---------   97                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'a');
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    java.lang.String str4 = fTPFile0.getUser();
    boolean b5 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    fTPFile0.setName("?---------    2                         -1 null");
    boolean b9 = fTPFile0.isDirectory();
    int i10 = fTPFile0.getType();
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    int i7 = fTPFile0.getType();
    java.lang.String str8 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setName("hi!");
    long long11 = fTPFile0.getSize();
    boolean b12 = fTPFile0.isFile();
    int i13 = fTPFile0.getHardLinkCount();
    fTPFile0.setSize((long)(byte)100);
    java.lang.String str17 = fTPFile0.toFormattedString("?---------    2 ?---------    0                         -1 null                -1 null");
    boolean b18 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "?---------  100                        100 hi!"+ "'", str17.equals("?---------  100                        100 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setName("hi!");
    long long11 = fTPFile0.getSize();
    boolean b12 = fTPFile0.isFile();
    int i13 = fTPFile0.getHardLinkCount();
    int i14 = fTPFile0.getType();
    java.lang.String str15 = fTPFile0.getName();
    boolean b16 = fTPFile0.isFile();
    boolean b17 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setSize((long)(short)-1);
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str10 = fTPFile0.toFormattedString("");
    java.lang.String str11 = fTPFile0.getRawListing();
    boolean b12 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    2                         -1 null"+ "'", str10.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isFile();
    fTPFile0.setName("?---------    0                         -1 null");
    fTPFile0.setGroup("?---------    2 ?---------    2                         -1 null                -1 null");
    java.lang.String str12 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    fTPFile0.setLink("");
    fTPFile0.setHardLinkCount(3);
    fTPFile0.setRawListing("?---------   97          ?---------    2                          0 null       -1 null");
    java.lang.String str13 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------   97          ?---------    2                          0 null       -1 null"+ "'", str13.equals("?---------   97          ?---------    2                          0 null       -1 null"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isFile();
    fTPFile0.setType(0);
    fTPFile0.setGroup("");
    java.lang.String str13 = fTPFile0.toFormattedString("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "----------    2 hi!                     -1 null"+ "'", str13.equals("----------    2 hi!                     -1 null"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getRawListing();
    boolean b6 = fTPFile0.isDirectory();
    int i7 = fTPFile0.getType();
    boolean b8 = fTPFile0.isDirectory();
    java.lang.String str9 = fTPFile0.toString();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)' ', (int)'#', true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    java.lang.String str8 = fTPFile0.toFormattedString("");
    fTPFile0.setLink("?---------    2 ?---------    0                         -1 null                -1 null");
    fTPFile0.setPermission(1, 1, true);
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)100, 10, true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    2                         -1 null"+ "'", str8.equals("?---------    2                         -1 null"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getRawListing();
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.getUser();
    boolean b8 = fTPFile0.isDirectory();
    java.lang.String str9 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    boolean b5 = fTPFile0.isUnknown();
    boolean b6 = fTPFile0.isFile();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.getLink();
    fTPFile0.setGroup("hi!");
    fTPFile0.setHardLinkCount((int)(short)1);
    java.util.Calendar calendar14 = fTPFile0.getTimestamp();
    java.util.Calendar calendar15 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar15);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    fTPFile0.setLink("");
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    boolean b10 = fTPFile0.isValid();
    boolean b11 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getRawListing();
    java.lang.String str6 = fTPFile0.toFormattedString();
    java.lang.String str7 = fTPFile0.toFormattedString();
    boolean b8 = fTPFile0.isDirectory();
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    2 hi!                     -1 null"+ "'", str6.equals("?---------    2 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    2 hi!                     -1 null"+ "'", str7.equals("?---------    2 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getRawListing();
    boolean b6 = fTPFile0.isDirectory();
    int i7 = fTPFile0.getType();
    boolean b8 = fTPFile0.isFile();
    boolean b9 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setUser("");
    fTPFile0.setName("?---------    2                         -1 null");
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getUser();
    boolean b9 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setType((int)(short)10);
    boolean b7 = fTPFile0.isSymbolicLink();
    fTPFile0.setRawListing("?---------   97                         -1 null");
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    fTPFile0.setGroup("?---------   97          ?---------    2                          0 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    boolean b5 = fTPFile0.isFile();
    boolean b6 = fTPFile0.isDirectory();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    boolean b7 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'a');
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.getRawListing();
    java.lang.String str5 = fTPFile0.toFormattedString();
    java.lang.String str6 = fTPFile0.getRawListing();
    boolean b7 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------   97                         -1 null"+ "'", str5.equals("?---------   97                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.getRawListing();
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str10 = fTPFile0.getLink();
    boolean b11 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getLink();
    int i6 = fTPFile0.getHardLinkCount();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setName("?---------    2 ?---------    2 hi!                     -1 ?---------    0                         -1 hi!                -1 ?---------    0                         -1 null");
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                        100 ?---------    2          ?---------    2                         -1 null       -1 null");
    java.lang.String str12 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    2 hi!                     -1 ?---------    2 ?---------    2 hi!                     -1 ?---------    0                         -1 hi!                -1 ?---------    0                         -1 null"+ "'", str11.equals("?---------    2 hi!                     -1 ?---------    2 ?---------    2 hi!                     -1 ?---------    0                         -1 hi!                -1 ?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getRawListing();
    boolean b6 = fTPFile0.isDirectory();
    int i7 = fTPFile0.getType();
    boolean b8 = fTPFile0.isFile();
    java.lang.String str9 = fTPFile0.getLink();
    fTPFile0.setType((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    int i4 = fTPFile0.getType();
    fTPFile0.setSize(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.getRawListing();
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str10 = fTPFile0.getLink();
    java.lang.String str11 = fTPFile0.getLink();
    java.lang.String str12 = fTPFile0.getGroup();
    fTPFile0.setName("?---------   97          ?---------    2                          0 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("");
    boolean b9 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------    2                         10 null");
    fTPFile0.setRawListing("?---------    0                         -1 hi!");
    long long14 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str17 = fTPFile0.getUser();
    fTPFile0.setUser("----------    2                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "?---------    2                         10 null"+ "'", str17.equals("?---------    2                         10 null"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isSymbolicLink();
    int i7 = fTPFile0.getType();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    fTPFile0.setGroup("");
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)10, (int)(short)1, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setHardLinkCount((int)'a');
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.getLink();
    int i10 = fTPFile0.getType();
    java.lang.String str11 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isValid();
    java.lang.String str8 = fTPFile0.toString();
    java.lang.String str9 = fTPFile0.getLink();
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)100, 0, true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(byte)0, (int)(short)1, false);
    int i14 = fTPFile0.getType();
    fTPFile0.setHardLinkCount((int)(short)1);
    long long17 = fTPFile0.getSize();
    boolean b18 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    long long7 = fTPFile0.getSize();
    java.lang.String str8 = fTPFile0.getGroup();
    fTPFile0.setType(2);
    java.lang.String str11 = fTPFile0.getGroup();
    fTPFile0.setGroup("?---------    0                          1 ?---------    0                         -1 null");
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(short)10, (int)(short)10, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.getLink();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)100, (int)(short)100, false);
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
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    java.lang.String str7 = fTPFile0.getRawListing();
    java.lang.String str8 = fTPFile0.getLink();
    java.lang.String str10 = fTPFile0.toFormattedString("?---------    2 ?---------    2                         -1 null                -1 null");
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)-1, 97, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                          1 null"+ "'", str10.equals("?---------    0                          1 null"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setUser("");
    fTPFile0.setName("?---------    2                         -1 null");
    long long7 = fTPFile0.getSize();
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    2 hi!                     -1 null");
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    int i12 = fTPFile0.getType();
    java.lang.String str14 = fTPFile0.toFormattedString("d---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 ?---------    2                         -1 null"+ "'", str9.equals("?---------    0                         -1 ?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    0                         -1 ?---------    2                         -1 null"+ "'", str14.equals("?---------    0                         -1 ?---------    2                         -1 null"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    fTPFile0.setName("?---------    2                         -1 null");
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str10 = fTPFile0.getUser();
    fTPFile0.setType((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }


    FTPFile fTPFile0 = new FTPFile();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)' ', (int)(byte)100, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    int i5 = fTPFile0.getType();
    java.lang.String str6 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    2 hi!                     -1 null"+ "'", str6.equals("?---------    2 hi!                     -1 null"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setType((int)(byte)1);
    int i6 = fTPFile0.getType();
    boolean b7 = fTPFile0.isValid();
    java.lang.String str8 = fTPFile0.toFormattedString();
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "d---------    0                         -1 null"+ "'", str8.equals("d---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    boolean b5 = fTPFile0.isDirectory();
    java.lang.String str6 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setSize((long)(short)-1);
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str10 = fTPFile0.toFormattedString("");
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    java.lang.String str13 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    2                         -1 null"+ "'", str10.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    2                         -1 null"+ "'", str13.equals("?---------    2                         -1 null"));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    fTPFile0.setGroup("?---------    2                         -1 null");
    fTPFile0.setName("?---------   52 hi!                     -1 null");
    int i11 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isValid();
    fTPFile0.setRawListing("?---------    0                         -1 hi!");
    fTPFile0.setRawListing("?---------    2                          0 null");
    fTPFile0.setUser("?---------   97          ?---------    2                          0 null       -1 null");
    long long14 = fTPFile0.getSize();
    java.util.Calendar calendar15 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar15);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.getRawListing();
    java.lang.String str8 = fTPFile0.getGroup();
    boolean b9 = fTPFile0.isUnknown();
    fTPFile0.setRawListing("?---------    0                          1 ?---------    0                         -1 null");
    fTPFile0.setName("?---------    1                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setName("?---------    0                         -1 null");
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = fTPFile0.hasPermission((int)(byte)10, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setName("hi!");
    long long11 = fTPFile0.getSize();
    boolean b12 = fTPFile0.isFile();
    int i13 = fTPFile0.getHardLinkCount();
    int i14 = fTPFile0.getType();
    java.lang.String str15 = fTPFile0.getName();
    boolean b16 = fTPFile0.isFile();
    fTPFile0.setUser("?---------    2 ?---------    2 hi!                     -1 ?---------    0                         -1 hi!                -1 ?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.getRawListing();
    int i8 = fTPFile0.getHardLinkCount();
    java.lang.String str9 = fTPFile0.getLink();
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = fTPFile0.hasPermission((int)' ', (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setType((int)(byte)1);
    int i6 = fTPFile0.getType();
    boolean b7 = fTPFile0.isValid();
    fTPFile0.setName("?---------    2                         -1 ?---------    0                         -1 null");
    boolean b10 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    2 hi!                     -1 ?---------    0                         -1 hi!");
    fTPFile0.setGroup("?---------  100                        100 hi!");
    java.lang.String str14 = fTPFile0.getName();
    int i15 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------  100                         -1 null"+ "'", str11.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setSize((long)(byte)10);
    fTPFile0.setPermission(2, (int)(short)1, true);
    int i12 = fTPFile0.getHardLinkCount();
    fTPFile0.setName("?---------   97          ?---------    2                          0 null       -1 null");
    java.util.Calendar calendar15 = null;
    fTPFile0.setTimestamp(calendar15);
    java.lang.String str18 = fTPFile0.toFormattedString("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "?-------w-    2                         10 ?---------   97          ?---------    2                          0 null       -1 null"+ "'", str18.equals("?-------w-    2                         10 ?---------   97          ?---------    2                          0 null       -1 null"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str6 = fTPFile0.toFormattedString("?-------w-    2                         10 ?---------   97          ?---------    2                          0 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isValid();
    java.lang.String str8 = fTPFile0.toString();
    java.lang.String str9 = fTPFile0.getLink();
    java.lang.String str10 = fTPFile0.getName();
    java.lang.String str11 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    boolean b5 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.toFormattedString("?---------    2 hi!                     -1 ?---------    0                         -1 hi!");
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = fTPFile0.hasPermission(10, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                          1 null"+ "'", str7.equals("?---------    0                          1 null"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getLink();
    long long6 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)100);
    int i9 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.toString();
    fTPFile0.setLink("hi!");
    java.lang.String str10 = fTPFile0.getGroup();
    java.lang.String str11 = fTPFile0.getGroup();
    java.lang.String str12 = fTPFile0.getUser();
    fTPFile0.setSize((long)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setRawListing("?---------    2                         -1 null");
    java.lang.String str5 = fTPFile0.toString();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    fTPFile0.setHardLinkCount((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    2                         -1 null"+ "'", str5.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.getLink();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    boolean b10 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.getRawListing();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    java.lang.String str9 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(byte)0, (int)(short)1, false);
    fTPFile0.setRawListing("?---------    2                         -1 null");
    fTPFile0.setLink("?---------    0                         -1 null");
    java.util.Calendar calendar18 = null;
    fTPFile0.setTimestamp(calendar18);
    java.lang.String str20 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "?---------    0                         -1 null"+ "'", str20.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.getRawListing();
    java.lang.String str9 = fTPFile0.toFormattedString("hi!");
    boolean b10 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    2                         -1 null"+ "'", str9.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'a');
    fTPFile0.setRawListing("?---------    2 hi!                     -1 null");
    fTPFile0.setHardLinkCount((int)(short)-1);
    java.lang.String str7 = fTPFile0.getUser();
    java.lang.String str8 = fTPFile0.getGroup();
    java.lang.String str9 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    java.lang.String str10 = fTPFile0.toFormattedString();
    boolean b11 = fTPFile0.isUnknown();
    boolean b12 = fTPFile0.isFile();
    fTPFile0.setLink("?---------    2                         10 null");
    int i15 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    2                          0 null"+ "'", str10.equals("?---------    2                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getRawListing();
    boolean b4 = fTPFile0.isDirectory();
    boolean b5 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setSize((long)(byte)10);
    fTPFile0.setPermission(2, (int)(short)1, true);
    int i12 = fTPFile0.getHardLinkCount();
    fTPFile0.setName("?---------   97          ?---------    2                          0 null       -1 null");
    java.util.Calendar calendar15 = null;
    fTPFile0.setTimestamp(calendar15);
    java.util.Calendar calendar17 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar17);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    java.lang.String str7 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.toString();
    fTPFile0.setUser("?---------   97                         -1 null");
    java.lang.String str12 = fTPFile0.getName();
    fTPFile0.setUser("?---------    2                         -1 null");
    java.lang.String str16 = fTPFile0.toFormattedString("?---------    0                         -1 null");
    boolean b17 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "?---------    0 ?---------    2                         -1 null                 1 null"+ "'", str16.equals("?---------    0 ?---------    2                         -1 null                 1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.toFormattedString();
    fTPFile0.setHardLinkCount((-1));
    fTPFile0.setUser("?---------    2 hi!                     -1 ?---------    0                         -1 hi!");
    java.lang.String str12 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 hi!"+ "'", str7.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setUser("hi!");
    java.lang.String str7 = fTPFile0.getGroup();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    fTPFile0.setHardLinkCount((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    2 hi!                     -1 ?---------    0                         -1 hi!");
    java.lang.String str12 = fTPFile0.getGroup();
    fTPFile0.setUser("?---------  100                         -1 null");
    java.lang.String str15 = fTPFile0.toFormattedString();
    fTPFile0.setRawListing("?---------    0                         -1 ?---------    2                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------  100                         -1 null"+ "'", str11.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------  100 ?---------  100                         -1 null                -1 null"+ "'", str15.equals("?---------  100 ?---------  100                         -1 null                -1 null"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    long long7 = fTPFile0.getSize();
    java.lang.String str8 = fTPFile0.getGroup();
    java.lang.String str10 = fTPFile0.toFormattedString("?---------    2                         10 null");
    fTPFile0.setRawListing("d---------    0                         -1 null");
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = fTPFile0.hasPermission((int)(short)-1, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    2                         -1 null"+ "'", str10.equals("?---------    2                         -1 null"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    java.lang.String str7 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.toString();
    boolean b10 = fTPFile0.isValid();
    boolean b11 = fTPFile0.isDirectory();
    int i12 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'a');
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.getRawListing();
    java.lang.String str5 = fTPFile0.toFormattedString();
    fTPFile0.setUser("?---------   97                         -1 null");
    fTPFile0.setLink("");
    fTPFile0.setSize((long)3);
    boolean b12 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------   97                         -1 null"+ "'", str5.equals("?---------   97                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setUser("hi!");
    fTPFile0.setType((int)'4');
    fTPFile0.setHardLinkCount(0);
    java.lang.String str11 = fTPFile0.toFormattedString();
    int i12 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0 hi!                     -1 null"+ "'", str11.equals("?---------    0 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setName("hi!");
    long long11 = fTPFile0.getSize();
    boolean b12 = fTPFile0.isFile();
    int i13 = fTPFile0.getHardLinkCount();
    fTPFile0.setSize((long)(byte)100);
    boolean b16 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.toFormattedString();
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str9 = fTPFile0.getUser();
    fTPFile0.setPermission(0, 2, false);
    java.lang.String str14 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 hi!"+ "'", str7.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setGroup("");
    int i7 = fTPFile0.getHardLinkCount();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    fTPFile0.setHardLinkCount((int)' ');
    java.lang.String str12 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    long long7 = fTPFile0.getSize();
    int i8 = fTPFile0.getType();
    java.lang.String str9 = fTPFile0.toFormattedString();
    java.lang.String str10 = fTPFile0.getGroup();
    int i11 = fTPFile0.getHardLinkCount();
    boolean b12 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    2                         -1 null"+ "'", str9.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'a');
    java.util.Calendar calendar3 = fTPFile0.getTimestamp();
    fTPFile0.setGroup("?---------    2          ?---------    0                         -1 hi!       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar3);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    fTPFile0.setGroup("?---------    2                         -1 null");
    int i9 = fTPFile0.getType();
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)-1, 0, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    long long7 = fTPFile0.getSize();
    long long8 = fTPFile0.getSize();
    fTPFile0.setUser("");
    java.lang.String str11 = fTPFile0.toFormattedString();
    fTPFile0.setType((int)(byte)10);
    fTPFile0.setLink("?---------   52 hi!                     -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    2                         -1 null"+ "'", str11.equals("?---------    2                         -1 null"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setType((int)(short)10);
    boolean b7 = fTPFile0.isSymbolicLink();
    boolean b8 = fTPFile0.isSymbolicLink();
    boolean b9 = fTPFile0.isUnknown();
    int i10 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    java.lang.String str8 = fTPFile0.toFormattedString("");
    int i9 = fTPFile0.getType();
    java.lang.String str10 = fTPFile0.toString();
    fTPFile0.setRawListing("?---------    2 ?---------    0                         -1 null                -1 null");
    boolean b13 = fTPFile0.isSymbolicLink();
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = fTPFile0.hasPermission((int)(byte)-1, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    2                         -1 null"+ "'", str8.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    boolean b5 = fTPFile0.isUnknown();
    boolean b6 = fTPFile0.isFile();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.getLink();
    fTPFile0.setType(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = fTPFile0.hasPermission(0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("");
    boolean b9 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------    2                         10 null");
    fTPFile0.setRawListing("?---------    0                         -1 hi!");
    long long14 = fTPFile0.getSize();
    int i15 = fTPFile0.getType();
    fTPFile0.setLink("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.getName();
    fTPFile0.setType((int)(short)100);
    fTPFile0.setType((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.getLink();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    fTPFile0.setGroup("?---------  100          ?---------    0                         -1 hi!       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.getRawListing();
    fTPFile0.setRawListing("hi!");
    java.lang.String str10 = fTPFile0.getUser();
    java.lang.String str11 = fTPFile0.getLink();
    boolean b12 = fTPFile0.isFile();
    long long13 = fTPFile0.getSize();
    java.lang.String str14 = fTPFile0.toFormattedString();
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = fTPFile0.hasPermission((int)' ', 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    2                         -1 null"+ "'", str14.equals("?---------    2                         -1 null"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setUser("");
    fTPFile0.setName("?---------    2                         -1 null");
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getUser();
    boolean b9 = fTPFile0.isUnknown();
    fTPFile0.setName("?---------    2                         -1 ?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    java.lang.String str10 = fTPFile0.toFormattedString();
    int i11 = fTPFile0.getType();
    int i12 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    2                          0 null"+ "'", str10.equals("?---------    2                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.getRawListing();
    fTPFile0.setName("?---------    0                         -1 null");
    boolean b10 = fTPFile0.isSymbolicLink();
    java.lang.String str11 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str7 = fTPFile0.getRawListing();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    fTPFile0.setSize((long)97);
    fTPFile0.setRawListing("?---------    0                         -1 null");
    fTPFile0.setHardLinkCount((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setUser("hi!");
    fTPFile0.setType((int)'4');
    java.lang.String str9 = fTPFile0.getName();
    java.lang.String str10 = fTPFile0.toString();
    boolean b11 = fTPFile0.isUnknown();
    boolean b12 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setGroup("");
    boolean b7 = fTPFile0.isDirectory();
    int i8 = fTPFile0.getHardLinkCount();
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str10 = fTPFile0.getName();
    boolean b11 = fTPFile0.isUnknown();
    java.lang.String str12 = fTPFile0.getGroup();
    java.lang.String str13 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setUser("hi!");
    java.lang.String str7 = fTPFile0.getUser();
    boolean b8 = fTPFile0.isSymbolicLink();
    fTPFile0.setRawListing("?---------    2 hi!                     -1 null");
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    boolean b12 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("");
    boolean b9 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------    2                         10 null");
    fTPFile0.setHardLinkCount((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setUser("");
    fTPFile0.setName("?---------    2                         -1 null");
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    boolean b8 = fTPFile0.isValid();
    fTPFile0.setLink("?---------    2 hi!                     -1 null");
    boolean b11 = fTPFile0.isValid();
    fTPFile0.setGroup("?---------    0                          1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    java.lang.String str10 = fTPFile0.toFormattedString();
    boolean b11 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------  100                         -1 null");
    java.lang.String str15 = fTPFile0.toFormattedString("?---------    1                         -1 null");
    java.lang.String str16 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    2                          0 null"+ "'", str10.equals("?---------    2                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    2 ?---------  100                         -1 null                 0 null"+ "'", str15.equals("?---------    2 ?---------  100                         -1 null                 0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.toFormattedString();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str10 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 hi!"+ "'", str7.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 hi!"+ "'", str10.equals("?---------    0                         -1 hi!"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setRawListing("?---------    2                         -1 null");
    java.lang.String str5 = fTPFile0.toString();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    java.lang.String str7 = fTPFile0.getRawListing();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    2                         -1 null"+ "'", str5.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    2                         -1 null"+ "'", str7.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(byte)0, (int)(short)1, false);
    fTPFile0.setRawListing("?---------    2                         -1 null");
    fTPFile0.setLink("?---------    0                         -1 null");
    int i18 = fTPFile0.getType();
    fTPFile0.setName("?---------    2 hi!                     -1 ?---------    0                         -1 hi!");
    boolean b21 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar22 = null;
    fTPFile0.setTimestamp(calendar22);
    boolean b24 = fTPFile0.isDirectory();
    boolean b25 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.toFormattedString("?---------   97                         -1 null");
    fTPFile0.setHardLinkCount((int)'4');
    java.lang.String str11 = fTPFile0.toString();
    java.lang.String str13 = fTPFile0.toFormattedString("?---------  100                         -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    2 hi!                     -1 null"+ "'", str8.equals("?---------    2 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------   52 hi!                     -1 null"+ "'", str13.equals("?---------   52 hi!                     -1 null"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setUser("hi!");
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setType(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getRawListing();
    java.lang.String str6 = fTPFile0.getName();
    fTPFile0.setGroup("?---------    2                         -1 null");
    java.lang.String str9 = fTPFile0.getRawListing();
    boolean b10 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(byte)0, (int)(short)1, false);
    fTPFile0.setRawListing("?---------    2                         -1 null");
    fTPFile0.setLink("?---------    0                         -1 null");
    java.lang.String str19 = fTPFile0.toFormattedString("hi!");
    java.lang.String str21 = fTPFile0.toFormattedString("?---------    2                          0 null");
    fTPFile0.setLink("?---------    0                         -1 hi!");
    boolean b24 = fTPFile0.isDirectory();
    java.util.Calendar calendar25 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "?---------  100                         -1 null"+ "'", str19.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "?---------  100                         -1 null"+ "'", str21.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar25);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setName("hi!");
    java.lang.String str12 = fTPFile0.toFormattedString("");
    fTPFile0.setHardLinkCount((int)(short)10);
    fTPFile0.setType((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------  100                         -1 hi!"+ "'", str12.equals("?---------  100                         -1 hi!"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("");
    boolean b9 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------    2                         10 null");
    fTPFile0.setRawListing("?---------    0                         -1 hi!");
    long long14 = fTPFile0.getSize();
    java.util.Calendar calendar15 = fTPFile0.getTimestamp();
    fTPFile0.setRawListing("?---------    2 ?---------    2                         -1 null                -1 null");
    fTPFile0.setGroup("?---------    2 ?---------  100                         -1 null                -1 null");
    fTPFile0.setPermission((int)(short)0, (int)(byte)0, true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar15);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    fTPFile0.setLink("");
    java.lang.String str9 = fTPFile0.toString();
    boolean b10 = fTPFile0.isUnknown();
    java.lang.String str11 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    boolean b3 = fTPFile0.isUnknown();
    fTPFile0.setGroup("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'a');
    fTPFile0.setRawListing("?---------    2 hi!                     -1 null");
    fTPFile0.setHardLinkCount((int)(short)-1);
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    long long8 = fTPFile0.getSize();
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getLink();
    java.lang.String str5 = fTPFile0.getLink();
    java.lang.String str6 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString();
    java.lang.String str8 = fTPFile0.toString();
    java.lang.String str9 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setHardLinkCount(3);
    fTPFile0.setRawListing("?---------    0                          1 ?---------    0                         -1 null");
    java.lang.String str14 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    3                         -1 null"+ "'", str14.equals("?---------    3                         -1 null"));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.getRawListing();
    java.lang.String str8 = fTPFile0.getGroup();
    fTPFile0.setHardLinkCount(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(byte)0, (int)(short)1, false);
    fTPFile0.setRawListing("?---------    2                         -1 null");
    fTPFile0.setLink("?---------    0                         -1 null");
    int i18 = fTPFile0.getType();
    fTPFile0.setName("?---------    2 hi!                     -1 ?---------    0                         -1 hi!");
    boolean b21 = fTPFile0.isSymbolicLink();
    boolean b22 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setType(0);
    java.lang.String str7 = fTPFile0.getUser();
    boolean b8 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setUser("");
    fTPFile0.setName("?---------    2                         -1 null");
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    boolean b8 = fTPFile0.isValid();
    java.lang.String str9 = fTPFile0.getRawListing();
    long long10 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == (-1L));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setName("hi!");
    long long11 = fTPFile0.getSize();
    boolean b12 = fTPFile0.isValid();
    fTPFile0.setGroup("?---------    0          ?---------    2 hi!                     -1 null       -1 ?---------    2                         -1 null");
    boolean b15 = fTPFile0.isDirectory();
    boolean b16 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(byte)0, (int)(short)1, false);
    fTPFile0.setGroup("?---------    0                         -1 hi!");
    java.lang.String str16 = fTPFile0.getUser();
    fTPFile0.setSize((long)(short)0);
    java.lang.String str19 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.getLink();
    java.lang.String str8 = fTPFile0.getUser();
    fTPFile0.setLink("?---------   97                         -1 null");
    fTPFile0.setHardLinkCount((int)'4');
    java.util.Calendar calendar13 = null;
    fTPFile0.setTimestamp(calendar13);
    fTPFile0.setSize((long)'#');
    java.lang.String str17 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    java.lang.String str7 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("?---------    2                          0 null");
    java.lang.String str11 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isValid();
    java.lang.String str8 = fTPFile0.toString();
    java.lang.String str9 = fTPFile0.getName();
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    boolean b12 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getRawListing();
    boolean b6 = fTPFile0.isDirectory();
    int i7 = fTPFile0.getType();
    fTPFile0.setGroup("----------    2 hi!                     -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.getRawListing();
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str10 = fTPFile0.getLink();
    boolean b11 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setName("hi!");
    fTPFile0.setName("?---------    2 hi!                     -1 ?---------    2 ?---------    2 hi!                     -1 ?---------    0                         -1 hi!                -1 ?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.getRawListing();
    fTPFile0.setRawListing("hi!");
    java.lang.String str10 = fTPFile0.getUser();
    java.lang.String str11 = fTPFile0.getLink();
    fTPFile0.setSize((long)(short)0);
    java.lang.String str14 = fTPFile0.toFormattedString();
    fTPFile0.setLink("?---------    0                          1 ?---------    0                         -1 null");
    fTPFile0.setUser("?---------    2                         -1 null");
    long long19 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    2                          0 null"+ "'", str14.equals("?---------    2                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 0L);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.isValid();
    java.lang.String str9 = fTPFile0.toString();
    int i10 = fTPFile0.getHardLinkCount();
    fTPFile0.setUser("?---------    2                         10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getRawListing();
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.getUser();
    fTPFile0.setLink("?---------    0                          1 ?---------    0                         -1 null");
    java.lang.String str10 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    java.lang.String str8 = fTPFile0.toFormattedString("");
    long long9 = fTPFile0.getSize();
    fTPFile0.setName("?---------    2 hi!                     -1 null");
    java.lang.String str12 = fTPFile0.getLink();
    fTPFile0.setUser("?---------    0                         -1 null");
    fTPFile0.setSize((long)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    2                         -1 null"+ "'", str8.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setName("hi!");
    java.lang.String str11 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.toString();
    fTPFile0.setLink("hi!");
    java.lang.String str10 = fTPFile0.getGroup();
    java.lang.String str11 = fTPFile0.getGroup();
    boolean b12 = fTPFile0.isDirectory();
    java.util.Calendar calendar13 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar13);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str9 = fTPFile0.toString();
    fTPFile0.setName("?---------    0                          1 ?---------    0                         -1 null");
    java.lang.String str12 = fTPFile0.toString();
    java.lang.String str13 = fTPFile0.getUser();
    fTPFile0.setName("?---------    2 ?---------    0                         -1 null                -1 null");
    fTPFile0.setHardLinkCount(0);
    int i18 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    long long7 = fTPFile0.getSize();
    int i8 = fTPFile0.getType();
    java.lang.String str9 = fTPFile0.toFormattedString();
    java.lang.String str10 = fTPFile0.getGroup();
    int i11 = fTPFile0.getHardLinkCount();
    boolean b12 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    2                         -1 null"+ "'", str9.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setType(3);
    fTPFile0.setUser("hi!");
    java.lang.String str10 = fTPFile0.toFormattedString();
    boolean b11 = fTPFile0.isSymbolicLink();
    fTPFile0.setType((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    2 hi!                     -1 null"+ "'", str10.equals("?---------    2 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    boolean b5 = fTPFile0.isUnknown();
    boolean b6 = fTPFile0.isFile();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.getLink();
    fTPFile0.setGroup("hi!");
    long long12 = fTPFile0.getSize();
    boolean b13 = fTPFile0.isUnknown();
    int i14 = fTPFile0.getType();
    fTPFile0.setUser("hi!");
    fTPFile0.setName("?---------    2 hi!                     -1 ?---------    0                         -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setGroup("");
    fTPFile0.setType((int)(short)-1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = fTPFile0.hasPermission((int)(short)10, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    java.lang.String str3 = fTPFile0.getRawListing();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("?---------    2          ?---------    0                         -1 hi!       -1 null");
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)'#', 2, true);
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

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setUser("");
    fTPFile0.setName("?---------    2                         -1 null");
    long long7 = fTPFile0.getSize();
    boolean b8 = fTPFile0.isValid();
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    int i11 = fTPFile0.getHardLinkCount();
    fTPFile0.setLink("?---------    2          ?---------    2                         -1 null       -1 null");
    boolean b14 = fTPFile0.isSymbolicLink();
    boolean b15 = fTPFile0.isFile();
    fTPFile0.setType((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)100, (int)' ', true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.getRawListing();
    fTPFile0.setHardLinkCount((int)' ');
    fTPFile0.setGroup("?---------    0                          1 ?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setType((int)(byte)1);
    int i6 = fTPFile0.getType();
    boolean b7 = fTPFile0.isValid();
    java.lang.String str8 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    java.lang.String str7 = fTPFile0.getRawListing();
    int i8 = fTPFile0.getHardLinkCount();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((-1), (int)'4', false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    java.lang.String str3 = fTPFile0.getRawListing();
    boolean b4 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(byte)0, (int)(short)1, false);
    fTPFile0.setRawListing("?---------    2                         -1 null");
    fTPFile0.setLink("?---------    0                         -1 null");
    int i18 = fTPFile0.getType();
    java.lang.String str19 = fTPFile0.getUser();
    java.lang.String str20 = fTPFile0.getLink();
    java.lang.String str21 = fTPFile0.getLink();
    fTPFile0.setName("?---------    2 hi!                     -1 ?---------    0                         -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "?---------    0                         -1 null"+ "'", str20.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "?---------    0                         -1 null"+ "'", str21.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str7 = fTPFile0.getName();
    fTPFile0.setUser("?---------    2 hi!                     -1 ?---------    0                         -1 hi!");
    boolean b10 = fTPFile0.isDirectory();
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    java.lang.String str12 = fTPFile0.getRawListing();
    fTPFile0.setSize((long)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    boolean b5 = fTPFile0.isUnknown();
    boolean b6 = fTPFile0.isFile();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    fTPFile0.setUser("?---------  100          ?---------  100                         -1 null      100 hi!");
    java.lang.String str11 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isValid();
    int i4 = fTPFile0.getType();
    fTPFile0.setLink("");
    fTPFile0.setName("----------    2 hi!                     -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setGroup("");
    boolean b7 = fTPFile0.isDirectory();
    boolean b8 = fTPFile0.isFile();
    fTPFile0.setSize(0L);
    fTPFile0.setHardLinkCount((int)'4');
    java.lang.String str13 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------   52 hi!                      0 null"+ "'", str13.equals("?---------   52 hi!                      0 null"));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getLink();
    boolean b5 = fTPFile0.isUnknown();
    java.lang.String str6 = fTPFile0.getGroup();
    fTPFile0.setLink("?---------  100          ?---------    0                         -1 hi!       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    java.lang.String str8 = fTPFile0.toFormattedString("");
    int i9 = fTPFile0.getType();
    long long10 = fTPFile0.getSize();
    long long11 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    2                         -1 null"+ "'", str8.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.getRawListing();
    java.lang.String str8 = fTPFile0.getGroup();
    java.lang.String str9 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    long long7 = fTPFile0.getSize();
    int i8 = fTPFile0.getType();
    java.lang.String str9 = fTPFile0.getGroup();
    boolean b10 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isValid();
    boolean b5 = fTPFile0.isSymbolicLink();
    java.lang.String str6 = fTPFile0.getGroup();
    fTPFile0.setLink("?---------    0                          1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.getName();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    boolean b5 = fTPFile0.isUnknown();
    boolean b6 = fTPFile0.isFile();
    fTPFile0.setSize((long)(short)0);
    java.lang.String str10 = fTPFile0.toFormattedString("?---------  100          ?---------  100                         -1 null      100 hi!");
    fTPFile0.setSize((long)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    2 hi!                      0 null"+ "'", str10.equals("?---------    2 hi!                      0 null"));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    boolean b5 = fTPFile0.isFile();
    boolean b6 = fTPFile0.isSymbolicLink();
    fTPFile0.setHardLinkCount(97);
    boolean b9 = fTPFile0.isSymbolicLink();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(short)-1, (-1), true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("");
    boolean b9 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------    2                         10 null");
    fTPFile0.setRawListing("?---------    0                         -1 hi!");
    long long14 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str17 = fTPFile0.getUser();
    fTPFile0.setName("?---------    2                         -1 d---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "?---------    2                         10 null"+ "'", str17.equals("?---------    2                         10 null"));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(byte)0, (int)(short)1, false);
    fTPFile0.setGroup("?---------    0                         -1 hi!");
    boolean b16 = fTPFile0.isValid();
    boolean b17 = fTPFile0.isFile();
    fTPFile0.setType((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.getName();
    boolean b8 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    long long3 = fTPFile0.getSize();
    fTPFile0.setSize((long)(byte)10);
    fTPFile0.setName("?---------    0                          1 ?---------    0                         -1 null");
    java.lang.String str8 = fTPFile0.getUser();
    boolean b9 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test173"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setHardLinkCount((int)'a');
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.getLink();
    java.lang.String str11 = fTPFile0.toFormattedString("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------   97                         -1 null"+ "'", str11.equals("?---------   97                         -1 null"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test174"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    java.lang.String str7 = fTPFile0.toFormattedString();
    fTPFile0.setHardLinkCount(3);
    fTPFile0.setHardLinkCount(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    2                         -1 null"+ "'", str7.equals("?---------    2                         -1 null"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test175"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setSize((long)(short)-1);
    boolean b8 = fTPFile0.isDirectory();
    java.lang.String str9 = fTPFile0.getLink();
    int i10 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test176"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getLink();
    int i6 = fTPFile0.getHardLinkCount();
    boolean b7 = fTPFile0.isUnknown();
    java.lang.String str8 = fTPFile0.toFormattedString();
    int i9 = fTPFile0.getType();
    java.lang.String str10 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    2 hi!                     -1 null"+ "'", str8.equals("?---------    2 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test177"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    int i7 = fTPFile0.getType();
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str9 = fTPFile0.toString();
    boolean b10 = fTPFile0.isUnknown();
    fTPFile0.setGroup("");
    boolean b13 = fTPFile0.isSymbolicLink();
    fTPFile0.setLink("?---------  100 ?---------  100                         -1 null                -1 null");
    java.lang.String str16 = fTPFile0.toFormattedString();
    fTPFile0.setType((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "?---------    2                         -1 null"+ "'", str16.equals("?---------    2                         -1 null"));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test178"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    java.lang.String str8 = fTPFile0.toFormattedString("");
    int i9 = fTPFile0.getType();
    java.lang.String str10 = fTPFile0.toString();
    fTPFile0.setRawListing("?---------    2 ?---------    0                         -1 null                -1 null");
    fTPFile0.setUser("?---------    2 hi!                      0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    2                         -1 null"+ "'", str8.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test179"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    long long7 = fTPFile0.getSize();
    long long8 = fTPFile0.getSize();
    fTPFile0.setUser("");
    fTPFile0.setRawListing("?---------   97          ?---------    2                          0 null       -1 null");
    fTPFile0.setRawListing("?---------    0 ?---------    2                         -1 null                 1 null");
    java.lang.String str15 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test180"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    boolean b3 = fTPFile0.isUnknown();
    fTPFile0.setHardLinkCount((int)'4');
    boolean b6 = fTPFile0.isUnknown();
    java.lang.String str7 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test181"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    int i5 = fTPFile0.getType();
    boolean b6 = fTPFile0.isFile();
    fTPFile0.setRawListing("?---------    2                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test182"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.toString();
    java.lang.String str8 = fTPFile0.getGroup();
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    java.lang.String str12 = fTPFile0.toFormattedString();
    boolean b13 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    2                         -1 null"+ "'", str12.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test183"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    java.lang.String str10 = fTPFile0.toFormattedString();
    boolean b11 = fTPFile0.isUnknown();
    boolean b12 = fTPFile0.isFile();
    boolean b13 = fTPFile0.isValid();
    java.lang.String str14 = fTPFile0.getGroup();
    java.util.Calendar calendar15 = fTPFile0.getTimestamp();
    fTPFile0.setRawListing("?---------  100                        100 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    2                          0 null"+ "'", str10.equals("?---------    2                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar15);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test184"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getRawListing();
    boolean b6 = fTPFile0.isDirectory();
    int i7 = fTPFile0.getType();
    boolean b8 = fTPFile0.isFile();
    java.lang.String str9 = fTPFile0.getLink();
    java.lang.String str10 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test185"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setGroup("");
    boolean b7 = fTPFile0.isDirectory();
    int i8 = fTPFile0.getHardLinkCount();
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str10 = fTPFile0.getName();
    fTPFile0.setUser("?---------    2                         10 null");
    int i13 = fTPFile0.getHardLinkCount();
    fTPFile0.setLink("?---------   52 hi!                     -1 null");
    long long16 = fTPFile0.getSize();
    java.util.Calendar calendar17 = null;
    fTPFile0.setTimestamp(calendar17);
    java.lang.String str20 = fTPFile0.toFormattedString("?---------  100                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "?---------    2 ?---------    2                         10 null                -1 null"+ "'", str20.equals("?---------    2 ?---------    2                         10 null                -1 null"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test186"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getRawListing();
    java.lang.String str6 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0                         -1 hi!");
    boolean b9 = fTPFile0.isSymbolicLink();
    int i10 = fTPFile0.getType();
    fTPFile0.setHardLinkCount((int)'4');
    java.lang.String str14 = fTPFile0.toFormattedString("");
    boolean b15 = fTPFile0.isValid();
    java.util.Calendar calendar16 = null;
    fTPFile0.setTimestamp(calendar16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------   52 hi!                     -1 null"+ "'", str14.equals("?---------   52 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test187"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setUser("");
    fTPFile0.setName("?---------    2                         -1 null");
    long long7 = fTPFile0.getSize();
    boolean b8 = fTPFile0.isValid();
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    int i11 = fTPFile0.getHardLinkCount();
    fTPFile0.setLink("?---------    2          ?---------    2                         -1 null       -1 null");
    boolean b14 = fTPFile0.isSymbolicLink();
    boolean b15 = fTPFile0.isFile();
    boolean b16 = fTPFile0.isValid();
    java.util.Calendar calendar17 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar17);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test188"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("");
    fTPFile0.setSize(100L);
    fTPFile0.setHardLinkCount(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test189"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setType((int)(byte)1);
    fTPFile0.setRawListing("?---------  100                        100 hi!");
    java.lang.String str8 = fTPFile0.getLink();
    int i9 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test190"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setType((int)(short)10);
    boolean b7 = fTPFile0.isSymbolicLink();
    boolean b8 = fTPFile0.isSymbolicLink();
    boolean b9 = fTPFile0.isUnknown();
    fTPFile0.setName("?---------    0                          1 ?---------    0                         -1 null");
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)-1, (int)(byte)100, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test191"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isValid();
    fTPFile0.setRawListing("?---------    0                         -1 hi!");
    fTPFile0.setRawListing("?---------    2                          0 null");
    fTPFile0.setHardLinkCount((int)(short)0);
    java.lang.String str14 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test192"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setGroup("");
    boolean b7 = fTPFile0.isDirectory();
    java.lang.String str8 = fTPFile0.getRawListing();
    boolean b9 = fTPFile0.isFile();
    fTPFile0.setLink("?---------   52 hi!                     -1 null");
    fTPFile0.setName("?---------    2 hi!                      0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test193"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    java.lang.String str10 = fTPFile0.toFormattedString();
    boolean b11 = fTPFile0.isUnknown();
    boolean b12 = fTPFile0.isFile();
    java.lang.String str13 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    2                          0 null"+ "'", str10.equals("?---------    2                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test194"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setHardLinkCount((int)(byte)1);
    int i7 = fTPFile0.getHardLinkCount();
    boolean b8 = fTPFile0.isDirectory();
    java.lang.String str9 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test195"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setSize((long)97);
    java.lang.String str11 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test196"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isFile();
    fTPFile0.setType(0);
    fTPFile0.setRawListing("?---------    2 ?---------    2 hi!                     -1 ?---------    0                         -1 hi!                -1 ?---------    0                         -1 null");
    java.lang.String str12 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    2 ?---------    2 hi!                     -1 ?---------    0                         -1 hi!                -1 ?---------    0                         -1 null"+ "'", str12.equals("?---------    2 ?---------    2 hi!                     -1 ?---------    0                         -1 hi!                -1 ?---------    0                         -1 null"));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test197"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test198"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    long long7 = fTPFile0.getSize();
    long long8 = fTPFile0.getSize();
    fTPFile0.setUser("");
    fTPFile0.setRawListing("?---------   97          ?---------    2                          0 null       -1 null");
    fTPFile0.setRawListing("?---------    0 ?---------    2                         -1 null                 1 null");
    java.lang.String str15 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test199"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.toFormattedString("?---------   97                         -1 null");
    int i9 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    2 hi!                     -1 null"+ "'", str8.equals("?---------    2 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test200"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setGroup("");
    boolean b7 = fTPFile0.isDirectory();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    boolean b10 = fTPFile0.isValid();
    java.lang.String str11 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test201"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setUser("?---------  100 ?---------  100                         -1 null                -1 null");
    fTPFile0.setGroup("?---------    2 ?---------    2                         -1 null                 0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test202"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setRawListing("?---------    2                         -1 null");
    java.lang.String str5 = fTPFile0.toString();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    java.lang.String str7 = fTPFile0.getName();
    int i8 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    2                         -1 null"+ "'", str5.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test203"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setGroup("");
    java.lang.String str7 = fTPFile0.toString();
    java.lang.String str8 = fTPFile0.getName();
    fTPFile0.setUser("?---------    2 ?---------  100                         -1 null                 0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test204"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    boolean b5 = fTPFile0.isValid();
    int i6 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test205"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.getRawListing();
    java.lang.String str8 = fTPFile0.getGroup();
    int i9 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test206"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setType(3);
    fTPFile0.setUser("hi!");
    boolean b10 = fTPFile0.isDirectory();
    boolean b11 = fTPFile0.isDirectory();
    fTPFile0.setSize((long)(byte)-1);
    java.lang.String str14 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test207"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getLink();
    int i6 = fTPFile0.getHardLinkCount();
    boolean b7 = fTPFile0.isFile();
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str9 = fTPFile0.getUser();
    java.lang.String str10 = fTPFile0.getRawListing();
    long long11 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test208"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setName("hi!");
    long long11 = fTPFile0.getSize();
    fTPFile0.setType((int)'a');
    fTPFile0.setUser("?---------  100                         -1 hi!");
    java.lang.String str16 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test209"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setRawListing("?---------    2                         -1 null");
    java.lang.String str5 = fTPFile0.toString();
    long long6 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    2                         -1 null"+ "'", str5.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test210"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    java.lang.String str7 = fTPFile0.toFormattedString();
    fTPFile0.setType((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    2                         -1 null"+ "'", str7.equals("?---------    2                         -1 null"));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test211"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    java.lang.String str7 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.toString();
    fTPFile0.setUser("?---------   97                         -1 null");
    java.lang.String str12 = fTPFile0.getName();
    fTPFile0.setUser("?---------    2                         -1 null");
    java.lang.String str15 = fTPFile0.getUser();
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = fTPFile0.hasPermission((int)(short)100, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    2                         -1 null"+ "'", str15.equals("?---------    2                         -1 null"));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test212"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setUser("");
    fTPFile0.setName("?---------    2                         -1 null");
    long long7 = fTPFile0.getSize();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str10 = fTPFile0.getRawListing();
    fTPFile0.setUser("");
    java.util.Calendar calendar13 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar13);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test213"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(byte)0, (int)(short)1, false);
    fTPFile0.setGroup("?---------    0                         -1 hi!");
    boolean b16 = fTPFile0.isValid();
    fTPFile0.setUser("?---------    0                          1 ?---------    0                         -1 null");
    fTPFile0.setHardLinkCount((int)(byte)-1);
    fTPFile0.setLink("?---------    2 ?---------    0                         -1 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test214"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str9 = fTPFile0.toString();
    fTPFile0.setName("?---------    0                          1 ?---------    0                         -1 null");
    java.lang.String str12 = fTPFile0.toString();
    long long13 = fTPFile0.getSize();
    java.lang.String str14 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test215"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setUser("");
    fTPFile0.setName("?---------    2                         -1 null");
    fTPFile0.setUser("?---------    2 ?---------    0                         -1 null                -1 null");
    fTPFile0.setName("?---------   52 hi!                     -1 null");
    fTPFile0.setGroup("?---------    2                         -1 null");

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test216"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setUser("");
    fTPFile0.setName("?---------    2                         -1 null");
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    boolean b8 = fTPFile0.isValid();
    java.lang.String str9 = fTPFile0.getRawListing();
    fTPFile0.setGroup("d---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test217"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setGroup("");
    int i7 = fTPFile0.getHardLinkCount();
    java.lang.String str8 = fTPFile0.toFormattedString();
    fTPFile0.setLink("?---------    0          ?---------    2 hi!                     -1 null       -1 ?---------    2                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    2 hi!                     -1 null"+ "'", str8.equals("?---------    2 hi!                     -1 null"));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test218"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    fTPFile0.setName("?---------    2                         -1 null");
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str10 = fTPFile0.getUser();
    boolean b11 = fTPFile0.isSymbolicLink();
    fTPFile0.setType((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test219"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.getLink();
    java.lang.String str8 = fTPFile0.getUser();
    fTPFile0.setLink("?---------   97                         -1 null");
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    java.util.Calendar calendar13 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar13);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test220"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("");
    java.lang.String str9 = fTPFile0.getRawListing();
    fTPFile0.setName("?---------    0                         -1 hi!");
    long long12 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-1L));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test221"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.getRawListing();
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str10 = fTPFile0.getLink();
    java.lang.String str11 = fTPFile0.getLink();
    java.lang.String str12 = fTPFile0.getGroup();
    java.lang.String str13 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test222"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'a');
    boolean b3 = fTPFile0.isValid();
    fTPFile0.setGroup("?---------    2                          0 null");
    int i6 = fTPFile0.getHardLinkCount();
    java.lang.String str7 = fTPFile0.getLink();
    long long8 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test223"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    fTPFile0.setLink("");
    java.lang.String str9 = fTPFile0.toString();
    boolean b10 = fTPFile0.isUnknown();
    boolean b11 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test224"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isValid();
    java.lang.String str8 = fTPFile0.toString();
    fTPFile0.setName("?---------    2 ?---------    2                         -1 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test225"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isValid();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(97, (-1), false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test226"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setGroup("");
    boolean b7 = fTPFile0.isDirectory();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    java.lang.String str10 = fTPFile0.getName();
    java.lang.String str11 = fTPFile0.getRawListing();
    java.lang.String str12 = fTPFile0.getLink();
    int i13 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test227"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setType((int)(byte)1);
    int i6 = fTPFile0.getType();
    java.lang.String str7 = fTPFile0.getGroup();
    fTPFile0.setSize(100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test228"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("");
    boolean b9 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------    2                         10 null");
    fTPFile0.setRawListing("?---------    0                         -1 hi!");
    long long14 = fTPFile0.getSize();
    int i15 = fTPFile0.getType();
    fTPFile0.setGroup("----------    2                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test229"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    boolean b5 = fTPFile0.isUnknown();
    boolean b6 = fTPFile0.isFile();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.getLink();
    fTPFile0.setGroup("hi!");
    long long12 = fTPFile0.getSize();
    fTPFile0.setName("----------    2 hi!                     -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-1L));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test230"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    int i7 = fTPFile0.getType();
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str9 = fTPFile0.toString();
    boolean b10 = fTPFile0.isUnknown();
    fTPFile0.setGroup("");
    boolean b13 = fTPFile0.isSymbolicLink();
    fTPFile0.setSize((long)(byte)1);
    java.lang.String str16 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "?---------    2                          1 null"+ "'", str16.equals("?---------    2                          1 null"));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test231"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    java.lang.String str7 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("?---------    2                          0 null");
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str13 = fTPFile0.toFormattedString();
    fTPFile0.setType((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0 ?---------    2                          0 null                 1 ?---------    0                         -1 null"+ "'", str13.equals("?---------    0 ?---------    2                          0 null                 1 ?---------    0                         -1 null"));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test232"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    long long7 = fTPFile0.getSize();
    long long8 = fTPFile0.getSize();
    fTPFile0.setUser("");
    java.lang.String str12 = fTPFile0.toFormattedString("hi!");
    int i13 = fTPFile0.getType();
    fTPFile0.setHardLinkCount(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    2                         -1 null"+ "'", str12.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test233"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(byte)0, (int)(short)1, false);
    java.lang.String str14 = fTPFile0.getUser();
    boolean b17 = fTPFile0.hasPermission(2, (int)(byte)1);
    long long18 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == (-1L));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test234"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("");
    boolean b9 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------    2                         10 null");
    fTPFile0.setRawListing("?---------    0                         -1 hi!");
    long long14 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str17 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test235"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("");
    boolean b9 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------    2                         10 null");
    java.lang.String str12 = fTPFile0.getGroup();
    fTPFile0.setSize((long)2);
    boolean b15 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test236"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setGroup("");
    boolean b7 = fTPFile0.isDirectory();
    int i8 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("hi!");
    java.lang.String str11 = fTPFile0.getRawListing();
    boolean b12 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test237"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setUser("?---------    2 ?---------  100                         -1 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test238"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    int i7 = fTPFile0.getHardLinkCount();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(100, (int)(short)-1, true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test239"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setName("hi!");
    long long11 = fTPFile0.getSize();
    boolean b12 = fTPFile0.isFile();
    fTPFile0.setRawListing("?---------    2 hi!                     -1 null");
    fTPFile0.setUser("?---------    2 ?---------  100                         -1 null                -1 null");
    int i17 = fTPFile0.getType();
    boolean b18 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test240"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isFile();
    fTPFile0.setUser("?---------    2                         -1 null");
    int i10 = fTPFile0.getHardLinkCount();
    java.lang.String str11 = fTPFile0.getGroup();
    boolean b12 = fTPFile0.isValid();
    long long13 = fTPFile0.getSize();
    java.util.Calendar calendar14 = fTPFile0.getTimestamp();
    fTPFile0.setName("?---------   -1 ?---------  100                         -1 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar14);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test241"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    java.lang.String str7 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.toString();
    boolean b10 = fTPFile0.isValid();
    boolean b11 = fTPFile0.isDirectory();
    boolean b12 = fTPFile0.isDirectory();
    long long13 = fTPFile0.getSize();
    java.util.Calendar calendar14 = null;
    fTPFile0.setTimestamp(calendar14);
    fTPFile0.setUser("?---------    0 ?---------    2                         10 null                -1 ?---------    2                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 1L);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test242"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    long long7 = fTPFile0.getSize();
    int i8 = fTPFile0.getType();
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setGroup("?---------    2 hi!                     -1 ?---------    0                         -1 hi!");
    java.lang.String str12 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------    0                         -1 hi!");
    int i15 = fTPFile0.getType();
    fTPFile0.setHardLinkCount(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    2                         -1 null"+ "'", str9.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test243"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.getRawListing();
    fTPFile0.setRawListing("hi!");
    java.lang.String str10 = fTPFile0.getLink();
    boolean b11 = fTPFile0.isSymbolicLink();
    fTPFile0.setSize((long)(short)10);
    java.lang.String str14 = fTPFile0.toString();
    fTPFile0.setRawListing("?---------    1                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test244"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    boolean b5 = fTPFile0.isDirectory();
    java.lang.String str6 = fTPFile0.getUser();
    java.lang.String str7 = fTPFile0.getName();
    boolean b8 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test245"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setName("hi!");
    long long11 = fTPFile0.getSize();
    boolean b12 = fTPFile0.isFile();
    boolean b13 = fTPFile0.isFile();
    long long14 = fTPFile0.getSize();
    java.lang.String str15 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test246"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    java.lang.String str8 = fTPFile0.toFormattedString("");
    int i9 = fTPFile0.getType();
    java.lang.String str10 = fTPFile0.toString();
    fTPFile0.setRawListing("?---------    2 ?---------    0                         -1 null                -1 null");
    boolean b13 = fTPFile0.isSymbolicLink();
    java.lang.String str14 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    2                         -1 null"+ "'", str8.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test247"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    long long7 = fTPFile0.getSize();
    int i8 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test248"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setUser("");
    fTPFile0.setName("?---------    2                         -1 null");
    long long7 = fTPFile0.getSize();
    fTPFile0.setGroup("?---------    2 hi!                     -1 null");
    boolean b10 = fTPFile0.isUnknown();
    fTPFile0.setType(10);
    fTPFile0.setName("?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test249"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    fTPFile0.setLink("");
    java.lang.String str9 = fTPFile0.toString();
    java.lang.String str10 = fTPFile0.toFormattedString();
    boolean b11 = fTPFile0.isUnknown();
    java.lang.String str12 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 hi!"+ "'", str10.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test250"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setName("hi!");
    long long11 = fTPFile0.getSize();
    boolean b12 = fTPFile0.isFile();
    int i13 = fTPFile0.getHardLinkCount();
    fTPFile0.setSize((long)(byte)100);
    long long16 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 100L);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test251"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    java.lang.String str10 = fTPFile0.toFormattedString();
    boolean b13 = fTPFile0.hasPermission(0, 2);
    fTPFile0.setRawListing("hi!");
    java.lang.String str16 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    2                          0 null"+ "'", str10.equals("?---------    2                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test252"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setSize((long)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = fTPFile0.hasPermission(2, (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test253"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setType((int)(byte)1);
    int i6 = fTPFile0.getType();
    boolean b7 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test254"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    java.lang.String str7 = fTPFile0.getGroup();
    boolean b8 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test255"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    boolean b5 = fTPFile0.isUnknown();
    boolean b6 = fTPFile0.isFile();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.getLink();
    fTPFile0.setGroup("hi!");
    boolean b12 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test256"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setUser("hi!");
    fTPFile0.setType((int)'4');
    fTPFile0.setHardLinkCount(0);
    java.lang.String str11 = fTPFile0.toFormattedString();
    int i12 = fTPFile0.getHardLinkCount();
    fTPFile0.setName("?---------    0                          1 ?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0 hi!                     -1 null"+ "'", str11.equals("?---------    0 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test257"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isValid();
    int i4 = fTPFile0.getType();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test258"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getRawListing();
    boolean b6 = fTPFile0.isDirectory();
    int i7 = fTPFile0.getType();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test259"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setUser("");
    fTPFile0.setName("?---------    2                         -1 null");
    long long7 = fTPFile0.getSize();
    boolean b8 = fTPFile0.isSymbolicLink();
    fTPFile0.setName("?---------    0                         -1 ?---------    2                         -1 null");
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test260"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getRawListing();
    java.lang.String str6 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0                         -1 hi!");
    boolean b9 = fTPFile0.isSymbolicLink();
    int i10 = fTPFile0.getType();
    fTPFile0.setHardLinkCount((int)'4');
    java.lang.String str14 = fTPFile0.toFormattedString("");
    boolean b15 = fTPFile0.isValid();
    java.lang.String str16 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------   52 hi!                     -1 null"+ "'", str14.equals("?---------   52 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test261"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setRawListing("?---------  100                         -1 hi!");
    java.lang.String str7 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------  100                         -1 hi!"+ "'", str7.equals("?---------  100                         -1 hi!"));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test262"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setType(0);
    java.lang.String str7 = fTPFile0.getUser();
    fTPFile0.setLink("?---------   52 hi!                     -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test263"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    fTPFile0.setLink("");
    java.lang.String str9 = fTPFile0.toString();
    java.lang.String str10 = fTPFile0.toFormattedString();
    boolean b11 = fTPFile0.isUnknown();
    fTPFile0.setType((int)(short)100);
    java.util.Calendar calendar14 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 hi!"+ "'", str10.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar14);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test264"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    long long7 = fTPFile0.getSize();
    int i8 = fTPFile0.getType();
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setGroup("?---------    2 hi!                     -1 ?---------    0                         -1 hi!");
    java.lang.String str12 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------    0                         -1 hi!");
    fTPFile0.setSize((long)1);
    java.lang.String str17 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    2                         -1 null"+ "'", str9.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "?---------    0                         -1 hi!"+ "'", str17.equals("?---------    0                         -1 hi!"));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test265"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    java.lang.String str8 = fTPFile0.toFormattedString("");
    long long9 = fTPFile0.getSize();
    java.lang.String str10 = fTPFile0.getGroup();
    java.lang.String str11 = fTPFile0.getName();
    java.lang.String str12 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    2                         -1 null"+ "'", str8.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test266"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.getLink();
    java.lang.String str8 = fTPFile0.getUser();
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test267"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setUser("hi!");
    java.lang.String str7 = fTPFile0.getGroup();
    fTPFile0.setLink("?---------   52 hi!                     -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test268"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    int i7 = fTPFile0.getType();
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str9 = fTPFile0.toString();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    2                         -1 null");
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)' ', 100, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    2                         -1 null"+ "'", str11.equals("?---------    2                         -1 null"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test269"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    fTPFile0.setGroup("?---------    2                         -1 null");
    int i9 = fTPFile0.getType();
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    fTPFile0.setUser("?---------  100          ?---------  100                         -1 null      100 hi!");
    java.util.Calendar calendar14 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar14);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test270"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setType((int)(short)10);
    boolean b7 = fTPFile0.isSymbolicLink();
    fTPFile0.setRawListing("?---------   97                         -1 null");
    fTPFile0.setGroup("");
    fTPFile0.setSize((long)(-1));
    fTPFile0.setUser("?---------    2          ?---------    0                         -1 hi!       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test271"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    int i7 = fTPFile0.getType();
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str9 = fTPFile0.toString();
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    java.lang.String str11 = fTPFile0.getLink();
    java.lang.String str12 = fTPFile0.getName();
    java.lang.String str13 = fTPFile0.toString();
    boolean b14 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test272"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isValid();
    java.lang.String str7 = fTPFile0.getName();
    fTPFile0.setName("?---------    0                         -1 ?---------    2                         -1 null");
    long long10 = fTPFile0.getSize();
    java.lang.String str11 = fTPFile0.getRawListing();
    fTPFile0.setRawListing("?---------    2                         10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test273"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getType();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setLink("?---------  100                         -1 null");
    java.lang.String str7 = fTPFile0.getUser();
    fTPFile0.setSize((long)(short)100);
    java.lang.String str11 = fTPFile0.toFormattedString("?---------  100                         -1 null");
    fTPFile0.setGroup("hi!");
    java.util.Calendar calendar14 = null;
    fTPFile0.setTimestamp(calendar14);
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
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    2                        100 null"+ "'", str11.equals("?---------    2                        100 null"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test274"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    long long10 = fTPFile0.getSize();
    fTPFile0.setRawListing("?---------    1                         -1 null");
    java.lang.String str14 = fTPFile0.toFormattedString("?---------    3                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    2                          0 null"+ "'", str14.equals("?---------    2                          0 null"));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test275"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setName("hi!");
    long long11 = fTPFile0.getSize();
    java.lang.String str12 = fTPFile0.toFormattedString();
    java.lang.String str13 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------  100                         -1 hi!"+ "'", str12.equals("?---------  100                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test276"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getRawListing();
    boolean b6 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("?---------  100                         -1 hi!");
    java.lang.String str9 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test277"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setName("hi!");
    long long11 = fTPFile0.getSize();
    boolean b12 = fTPFile0.isFile();
    int i13 = fTPFile0.getHardLinkCount();
    boolean b14 = fTPFile0.isValid();
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = fTPFile0.hasPermission(3, 3);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test278"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getLink();
    long long6 = fTPFile0.getSize();
    java.lang.String str8 = fTPFile0.toFormattedString("");
    java.lang.String str10 = fTPFile0.toFormattedString("?---------    2 ?---------    2                         -1 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    2 hi!                     -1 null"+ "'", str8.equals("?---------    2 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    2 hi!                     -1 null"+ "'", str10.equals("?---------    2 hi!                     -1 null"));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test279"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isFile();
    fTPFile0.setUser("?---------    2                         -1 null");
    java.lang.String str11 = fTPFile0.toFormattedString("?---------  100 ?---------  100                         -1 null                -1 null");
    java.lang.String str13 = fTPFile0.toFormattedString("?---------    2                         -1 null");
    fTPFile0.setHardLinkCount((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    2 ?---------    2                         -1 null                -1 null"+ "'", str11.equals("?---------    2 ?---------    2                         -1 null                -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    2 ?---------    2                         -1 null                -1 null"+ "'", str13.equals("?---------    2 ?---------    2                         -1 null                -1 null"));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test280"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(byte)0, (int)(short)1, false);
    fTPFile0.setRawListing("?---------    2                         -1 null");
    fTPFile0.setLink("?---------    0                         -1 null");
    java.lang.String str19 = fTPFile0.toFormattedString("hi!");
    int i20 = fTPFile0.getHardLinkCount();
    java.lang.String str21 = fTPFile0.toFormattedString();
    java.lang.String str23 = fTPFile0.toFormattedString("?---------    2 ?---------    2 hi!                     -1 ?---------    0                         -1 hi!                -1 ?---------    0                         -1 null");
    int i24 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "?---------  100                         -1 null"+ "'", str19.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "?---------  100                         -1 null"+ "'", str21.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "?---------  100                         -1 null"+ "'", str23.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test281"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setSize((long)(byte)10);
    java.lang.String str8 = fTPFile0.getGroup();
    fTPFile0.setName("?---------  100          ?---------    0                         -1 hi!       -1 null");
    boolean b11 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test282"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    boolean b5 = fTPFile0.isFile();
    boolean b6 = fTPFile0.isSymbolicLink();
    java.lang.String str7 = fTPFile0.getUser();
    fTPFile0.setHardLinkCount((int)'a');
    long long10 = fTPFile0.getSize();
    boolean b11 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test283"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getRawListing();
    java.lang.String str6 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0                         -1 hi!");
    boolean b9 = fTPFile0.isSymbolicLink();
    int i10 = fTPFile0.getType();
    fTPFile0.setType(0);
    fTPFile0.setType(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test284"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str7 = fTPFile0.getName();
    fTPFile0.setLink("?---------  100                         -1 hi!");
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = fTPFile0.hasPermission(1, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test285"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.getName();
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.getRawListing();
    fTPFile0.setHardLinkCount(100);
    boolean b10 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test286"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    fTPFile0.setUser("?---------   97                         -1 null");

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test287"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    int i5 = fTPFile0.getType();
    fTPFile0.setHardLinkCount((int)(short)100);
    java.lang.String str8 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test288"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    boolean b5 = fTPFile0.isUnknown();
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    fTPFile0.setType((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test289"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str7 = fTPFile0.getRawListing();
    int i8 = fTPFile0.getHardLinkCount();
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = fTPFile0.hasPermission(10, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test290"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setType((int)(byte)1);
    int i6 = fTPFile0.getType();
    boolean b7 = fTPFile0.isValid();
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    2 ?---------    0                         -1 null                -1 null");
    boolean b10 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "d---------    0                         -1 null"+ "'", str9.equals("d---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test291"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    long long7 = fTPFile0.getSize();
    long long8 = fTPFile0.getSize();
    fTPFile0.setUser("");
    fTPFile0.setRawListing("?---------   97          ?---------    2                          0 null       -1 null");
    java.lang.String str13 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------   97          ?---------    2                          0 null       -1 null"+ "'", str13.equals("?---------   97          ?---------    2                          0 null       -1 null"));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test292"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setRawListing("?---------    2                         -1 null");
    java.lang.String str5 = fTPFile0.toString();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    java.lang.String str7 = fTPFile0.getName();
    long long8 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    2                         -1 null"+ "'", str5.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test293"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    java.lang.String str10 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test294"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'a');
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.getRawListing();
    java.lang.String str5 = fTPFile0.toFormattedString();
    java.lang.String str7 = fTPFile0.toFormattedString("");
    java.lang.String str8 = fTPFile0.toFormattedString();
    fTPFile0.setUser("?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------   97                         -1 null"+ "'", str5.equals("?---------   97                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   97                         -1 null"+ "'", str7.equals("?---------   97                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------   97                         -1 null"+ "'", str8.equals("?---------   97                         -1 null"));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test295"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isFile();
    fTPFile0.setUser("?---------    2                         -1 null");
    int i10 = fTPFile0.getHardLinkCount();
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    boolean b13 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test296"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getRawListing();
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.getUser();
    boolean b8 = fTPFile0.isDirectory();
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    2 ?---------    0                         -1 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    2 hi!                     -1 null"+ "'", str11.equals("?---------    2 hi!                     -1 null"));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test297"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setGroup("");
    boolean b7 = fTPFile0.isDirectory();
    fTPFile0.setUser("?---------    2          ?---------    2                         -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test298"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.getRawListing();
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                         -1 hi!");
    fTPFile0.setSize((long)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    2                         -1 null"+ "'", str9.equals("?---------    2                         -1 null"));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test299"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getRawListing();
    fTPFile0.setHardLinkCount(1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = fTPFile0.hasPermission((int)(byte)0, (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test300"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setGroup("");
    boolean b7 = fTPFile0.isDirectory();
    int i8 = fTPFile0.getHardLinkCount();
    fTPFile0.setPermission((int)(byte)0, 0, false);
    java.lang.String str13 = fTPFile0.toString();
    fTPFile0.setName("hi!");
    boolean b16 = fTPFile0.isDirectory();
    int i17 = fTPFile0.getHardLinkCount();
    fTPFile0.setPermission(0, (int)(byte)1, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 2);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test301"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setName("hi!");
    long long11 = fTPFile0.getSize();
    boolean b12 = fTPFile0.isFile();
    int i13 = fTPFile0.getHardLinkCount();
    fTPFile0.setSize((long)(byte)100);
    fTPFile0.setGroup("?---------  100                         -1 null");
    long long18 = fTPFile0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = fTPFile0.hasPermission((int)(short)100, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 100L);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test302"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    fTPFile0.setName("?---------    2 ?---------    2                         -1 null                -1 null");
    java.lang.String str9 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test303"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getLink();
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    2 ?---------    0                         -1 null                -1 null");
    boolean b7 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.getLink();
    boolean b9 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test304"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.toFormattedString();
    boolean b8 = fTPFile0.isFile();
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str10 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 hi!"+ "'", str7.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test305"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    java.lang.String str7 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("?---------    2                          0 null");
    fTPFile0.setUser("hi!");
    java.lang.String str14 = fTPFile0.toFormattedString("?---------    0                          1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    0 hi!                      1 null"+ "'", str14.equals("?---------    0 hi!                      1 null"));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test306"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    long long7 = fTPFile0.getSize();
    long long8 = fTPFile0.getSize();
    fTPFile0.setUser("");
    fTPFile0.setRawListing("?---------   97          ?---------    2                          0 null       -1 null");
    fTPFile0.setRawListing("?---------    0 ?---------    2                         -1 null                 1 null");
    java.lang.String str15 = fTPFile0.getRawListing();
    fTPFile0.setLink("?---------    2                        100 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    0 ?---------    2                         -1 null                 1 null"+ "'", str15.equals("?---------    0 ?---------    2                         -1 null                 1 null"));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test307"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    java.lang.String str10 = fTPFile0.toFormattedString();
    boolean b11 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------  100                         -1 null");
    int i14 = fTPFile0.getType();
    boolean b15 = fTPFile0.isFile();
    boolean b16 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    2                          0 null"+ "'", str10.equals("?---------    2                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test308"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    long long7 = fTPFile0.getSize();
    boolean b8 = fTPFile0.isUnknown();
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    java.lang.String str11 = fTPFile0.getRawListing();
    boolean b12 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test309"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    boolean b5 = fTPFile0.isUnknown();
    boolean b6 = fTPFile0.isFile();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    fTPFile0.setUser("?---------  100          ?---------  100                         -1 null      100 hi!");
    boolean b11 = fTPFile0.isValid();
    long long12 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-1L));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test310"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    java.lang.String str7 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.toString();
    fTPFile0.setUser("?---------   97                         -1 null");
    java.lang.String str12 = fTPFile0.getName();
    fTPFile0.setHardLinkCount((int)(byte)10);
    boolean b15 = fTPFile0.isDirectory();
    int i16 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test311"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.toFormattedString();
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str9 = fTPFile0.getUser();
    long long10 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 hi!"+ "'", str7.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == (-1L));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test312"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setHardLinkCount((int)(byte)1);
    int i7 = fTPFile0.getHardLinkCount();
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    2 ?---------    0                         -1 null                -1 null");
    fTPFile0.setType((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    1 hi!                     -1 null"+ "'", str9.equals("?---------    1 hi!                     -1 null"));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test313"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    java.lang.String str7 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.toString();
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    java.lang.String str11 = fTPFile0.getRawListing();
    fTPFile0.setName("?---------   97                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test314"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.toString();
    fTPFile0.setLink("hi!");
    java.lang.String str10 = fTPFile0.getGroup();
    java.lang.String str11 = fTPFile0.getGroup();
    java.lang.String str12 = fTPFile0.getUser();
    boolean b13 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test315"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.toFormattedString();
    java.lang.String str8 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------    2                         10 null");
    fTPFile0.setRawListing("?---------    2                          0 null");
    java.lang.String str13 = fTPFile0.getUser();
    boolean b14 = fTPFile0.isUnknown();
    java.util.Calendar calendar15 = fTPFile0.getTimestamp();
    java.lang.String str16 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 hi!"+ "'", str7.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test316"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setGroup("");
    int i7 = fTPFile0.getHardLinkCount();
    fTPFile0.setUser("?---------  100                         -1 null");
    java.lang.String str10 = fTPFile0.toFormattedString();
    int i11 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    2 ?---------  100                         -1 null                -1 null"+ "'", str10.equals("?---------    2 ?---------  100                         -1 null                -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test317"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    java.lang.String str7 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.toString();
    fTPFile0.setUser("?---------   97                         -1 null");
    java.lang.String str12 = fTPFile0.getName();
    fTPFile0.setHardLinkCount((int)(byte)10);
    fTPFile0.setSize((long)1);
    fTPFile0.setName("?---------  100          ?---------  100                         -1 null      100 hi!");
    fTPFile0.setGroup("?---------    2                          1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test318"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(byte)0, (int)(short)1, false);
    fTPFile0.setType(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test319"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.getRawListing();
    java.lang.String str9 = fTPFile0.toFormattedString("hi!");
    boolean b10 = fTPFile0.isSymbolicLink();
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = fTPFile0.hasPermission((int)(byte)10, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    2                         -1 null"+ "'", str9.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test320"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    long long7 = fTPFile0.getSize();
    java.lang.String str8 = fTPFile0.getGroup();
    fTPFile0.setType(2);
    boolean b11 = fTPFile0.isDirectory();
    java.lang.String str12 = fTPFile0.getRawListing();
    boolean b13 = fTPFile0.isUnknown();
    java.lang.String str14 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test321"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isValid();
    java.lang.String str8 = fTPFile0.toString();
    java.lang.String str9 = fTPFile0.getName();
    int i10 = fTPFile0.getType();
    java.lang.String str11 = fTPFile0.getRawListing();
    java.lang.String str12 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test322"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    boolean b5 = fTPFile0.isFile();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    2                         -1 null"+ "'", str7.equals("?---------    2                         -1 null"));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test323"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getLink();
    int i6 = fTPFile0.getHardLinkCount();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setName("?---------    2 ?---------    2 hi!                     -1 ?---------    0                         -1 hi!                -1 ?---------    0                         -1 null");
    fTPFile0.setSize(0L);
    java.lang.String str12 = fTPFile0.getName();
    fTPFile0.setHardLinkCount((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    2 ?---------    2 hi!                     -1 ?---------    0                         -1 hi!                -1 ?---------    0                         -1 null"+ "'", str12.equals("?---------    2 ?---------    2 hi!                     -1 ?---------    0                         -1 hi!                -1 ?---------    0                         -1 null"));

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test324"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setName("?---------    0 ?---------    0                         -1 hi!                -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test325"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    long long7 = fTPFile0.getSize();
    int i8 = fTPFile0.getType();
    fTPFile0.setRawListing("?---------    2                        100 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test326"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    java.lang.String str10 = fTPFile0.toFormattedString();
    boolean b11 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------  100                         -1 null");
    int i14 = fTPFile0.getType();
    boolean b15 = fTPFile0.isFile();
    int i16 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    2                          0 null"+ "'", str10.equals("?---------    2                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test327"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    java.lang.String str10 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test328"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    java.lang.String str7 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.isSymbolicLink();
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str11 = fTPFile0.toFormattedString();
    java.lang.String str12 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          1 ?---------    0                         -1 null"+ "'", str11.equals("?---------    0                          1 ?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                          1 ?---------    0                         -1 null"+ "'", str12.equals("?---------    0                          1 ?---------    0                         -1 null"));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test329"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setUser("");
    fTPFile0.setName("?---------    2                         -1 null");
    long long7 = fTPFile0.getSize();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str10 = fTPFile0.getRawListing();
    fTPFile0.setUser("");
    boolean b13 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test330"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.toFormattedString();
    fTPFile0.setPermission(0, (int)(byte)0, false);
    fTPFile0.setRawListing("?---------    2 hi!                     -1 ?---------    2 ?---------    2 hi!                     -1 ?---------    0                         -1 hi!                -1 ?---------    0                         -1 null");
    boolean b14 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 hi!"+ "'", str7.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test331"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.toFormattedString("?---------   97                         -1 null");
    fTPFile0.setHardLinkCount((int)'4');
    java.lang.String str11 = fTPFile0.toString();
    java.lang.String str12 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    2 hi!                     -1 null"+ "'", str8.equals("?---------    2 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test332"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isValid();
    fTPFile0.setRawListing("?---------    0                         -1 hi!");
    fTPFile0.setRawListing("?---------    2                          0 null");
    java.lang.String str12 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test333"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getLink();
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    2 ?---------    0                         -1 null                -1 null");
    fTPFile0.setSize(1L);
    java.lang.String str9 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test334"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setUser("");
    fTPFile0.setName("?---------    2                         -1 null");
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0 hi!                     -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test335"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setType((int)(byte)1);
    fTPFile0.setRawListing("?---------  100                        100 hi!");
    java.lang.String str8 = fTPFile0.getLink();
    fTPFile0.setRawListing("?---------    2 ?---------    0                         -1 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test336"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'a');
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.getRawListing();
    long long5 = fTPFile0.getSize();
    fTPFile0.setUser("?---------    2 ?---------    2                         -1 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test337"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setType((int)(short)10);
    int i7 = fTPFile0.getType();
    long long8 = fTPFile0.getSize();
    boolean b9 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test338"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setName("hi!");
    long long11 = fTPFile0.getSize();
    boolean b12 = fTPFile0.isFile();
    fTPFile0.setRawListing("?---------    2 hi!                     -1 null");
    fTPFile0.setHardLinkCount(1);
    fTPFile0.setHardLinkCount((int)(short)1);
    boolean b19 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test339"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    java.lang.String str7 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.toString();
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    fTPFile0.setSize(0L);
    java.lang.String str13 = fTPFile0.getName();
    boolean b14 = fTPFile0.isSymbolicLink();
    fTPFile0.setLink("?---------    2 ?---------  100                         -1 null                 0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test340"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setName("hi!");
    long long11 = fTPFile0.getSize();
    java.lang.String str12 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test341"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.getLink();
    fTPFile0.setUser("?---------    0                         -1 hi!");
    boolean b10 = fTPFile0.isValid();
    java.lang.String str11 = fTPFile0.toString();
    java.lang.String str13 = fTPFile0.toFormattedString("?---------    3                         -1 null");
    java.lang.String str14 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0 ?---------    0                         -1 hi!                -1 hi!"+ "'", str13.equals("?---------    0 ?---------    0                         -1 hi!                -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test342"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setUser("");
    fTPFile0.setName("?---------    2                         -1 null");
    fTPFile0.setUser("?---------    2 ?---------    0                         -1 null                -1 null");
    fTPFile0.setName("?---------   52 hi!                     -1 null");
    fTPFile0.setType((int)(byte)100);
    java.lang.String str13 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    2 ?---------    0                         -1 null                -1 null"+ "'", str13.equals("?---------    2 ?---------    0                         -1 null                -1 null"));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test343"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isValid();
    java.lang.String str8 = fTPFile0.toString();
    java.lang.String str9 = fTPFile0.getName();
    int i10 = fTPFile0.getType();
    fTPFile0.setUser("?---------    0 ?---------    2                          0 null                 1 ?---------    0                         -1 null");
    java.lang.String str13 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test344"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setName("hi!");
    long long11 = fTPFile0.getSize();
    boolean b12 = fTPFile0.isFile();
    int i13 = fTPFile0.getHardLinkCount();
    boolean b14 = fTPFile0.isValid();
    java.lang.String str15 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test345"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isValid();
    int i4 = fTPFile0.getType();
    fTPFile0.setLink("");
    fTPFile0.setType((int)' ');
    fTPFile0.setType((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test346"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.toFormattedString();
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str9 = fTPFile0.getUser();
    int i10 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 hi!"+ "'", str7.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test347"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'a');
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.getRawListing();
    java.lang.String str5 = fTPFile0.toFormattedString();
    fTPFile0.setUser("?---------   97                         -1 null");
    fTPFile0.setLink("");
    fTPFile0.setSize((long)3);
    fTPFile0.setName("?---------    2                         -1 ?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------   97                         -1 null"+ "'", str5.equals("?---------   97                         -1 null"));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test348"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isValid();
    fTPFile0.setRawListing("?---------    0                         -1 hi!");
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    fTPFile0.setHardLinkCount((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test349"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setSize((long)(byte)10);
    fTPFile0.setPermission(2, (int)(short)1, true);
    int i12 = fTPFile0.getType();
    fTPFile0.setGroup("");
    java.lang.String str15 = fTPFile0.toFormattedString();
    java.util.Calendar calendar16 = null;
    fTPFile0.setTimestamp(calendar16);
    int i18 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?-------w-    2                         10 null"+ "'", str15.equals("?-------w-    2                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test350"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    boolean b5 = fTPFile0.isUnknown();
    boolean b6 = fTPFile0.isFile();
    fTPFile0.setSize((long)(short)0);
    java.lang.String str10 = fTPFile0.toFormattedString("?---------  100          ?---------  100                         -1 null      100 hi!");
    fTPFile0.setSize((long)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    2 hi!                      0 null"+ "'", str10.equals("?---------    2 hi!                      0 null"));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test351"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    long long7 = fTPFile0.getSize();
    java.lang.String str8 = fTPFile0.getGroup();
    boolean b9 = fTPFile0.isSymbolicLink();
    java.lang.String str10 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test352"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    fTPFile0.setSize((long)'#');

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test353"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setRawListing("?---------    2                         -1 null");
    java.lang.String str5 = fTPFile0.toString();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    fTPFile0.setUser("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    2                         -1 null"+ "'", str5.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test354"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'a');
    boolean b3 = fTPFile0.isValid();
    fTPFile0.setGroup("?---------    2                          0 null");
    int i6 = fTPFile0.getHardLinkCount();
    boolean b7 = fTPFile0.isDirectory();
    int i8 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test355"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setName("hi!");
    long long11 = fTPFile0.getSize();
    boolean b12 = fTPFile0.isFile();
    fTPFile0.setLink("?---------    0 hi!                     -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test356"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'a');
    fTPFile0.setRawListing("?---------    2 hi!                     -1 null");
    fTPFile0.setHardLinkCount((int)(short)-1);
    java.lang.String str7 = fTPFile0.getUser();
    java.lang.String str8 = fTPFile0.getGroup();
    fTPFile0.setSize((long)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test357"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    int i5 = fTPFile0.getHardLinkCount();
    long long6 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test358"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getRawListing();
    java.lang.String str6 = fTPFile0.toFormattedString();
    java.lang.String str7 = fTPFile0.getUser();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    boolean b9 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    2 hi!                     -1 null"+ "'", str6.equals("?---------    2 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test359"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setGroup("");
    int i7 = fTPFile0.getHardLinkCount();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    fTPFile0.setHardLinkCount((int)' ');
    java.lang.String str13 = fTPFile0.toFormattedString("?---------    0 ?---------    0                         -1 hi!                -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------   32 hi!                     -1 null"+ "'", str13.equals("?---------   32 hi!                     -1 null"));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test360"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("");
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    2                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    2                         -1 null"+ "'", str11.equals("?---------    2                         -1 null"));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test361"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    long long7 = fTPFile0.getSize();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test362"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    java.lang.String str7 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.toString();
    fTPFile0.setUser("?---------   97                         -1 null");
    java.lang.String str12 = fTPFile0.getName();
    fTPFile0.setHardLinkCount((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = fTPFile0.hasPermission(3, 52);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test363"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("");
    boolean b9 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------    2                         10 null");
    fTPFile0.setRawListing("?---------    0                         -1 hi!");
    boolean b14 = fTPFile0.isDirectory();
    boolean b15 = fTPFile0.isDirectory();
    boolean b16 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test364"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    java.lang.String str8 = fTPFile0.toFormattedString("");
    long long9 = fTPFile0.getSize();
    fTPFile0.setName("?---------    2 hi!                     -1 null");
    java.lang.String str12 = fTPFile0.getLink();
    fTPFile0.setUser("?---------    0                         -1 null");
    fTPFile0.setHardLinkCount((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    2                         -1 null"+ "'", str8.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test365"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setRawListing("?---------    2                         -1 null");
    java.lang.String str5 = fTPFile0.toString();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    java.lang.String str7 = fTPFile0.getRawListing();
    java.lang.String str8 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    2                         -1 null"+ "'", str5.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    2                         -1 null"+ "'", str7.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 null"+ "'", str8.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test366"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str8 = fTPFile0.toFormattedString("?---------    2 hi!                     -1 ?---------    0                         -1 hi!");
    java.lang.String str10 = fTPFile0.toFormattedString("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    2                         -1 ?---------    0                         -1 null"+ "'", str8.equals("?---------    2                         -1 ?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    2                         -1 ?---------    0                         -1 null"+ "'", str10.equals("?---------    2                         -1 ?---------    0                         -1 null"));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test367"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.getLink();
    java.lang.String str8 = fTPFile0.getUser();
    fTPFile0.setLink("?---------   97                         -1 null");
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test368"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setRawListing("?---------    2                         -1 null");
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.toString();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    2                         -1 null"+ "'", str5.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    2                         -1 null"+ "'", str6.equals("?---------    2                         -1 null"));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test369"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setUser("hi!");
    fTPFile0.setType((int)'4');
    java.lang.String str9 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test370"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getRawListing();
    fTPFile0.setHardLinkCount(1);
    fTPFile0.setType((int)(short)-1);
    fTPFile0.setGroup("?---------    0          ?---------    2 hi!                     -1 null       -1 ?---------    2                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test371"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'a');
    boolean b3 = fTPFile0.isValid();
    fTPFile0.setGroup("?---------    2                          0 null");
    boolean b6 = fTPFile0.isSymbolicLink();
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = fTPFile0.hasPermission(3, 1);
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
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test372"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    java.lang.String str7 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.toString();
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    fTPFile0.setSize(0L);
    fTPFile0.setLink("?---------  100                        100 hi!");
    fTPFile0.setLink("?---------    2          ?---------    2                         -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test373"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(byte)0, (int)(short)1, false);
    fTPFile0.setRawListing("?---------    2                         -1 null");
    fTPFile0.setLink("?---------    0                         -1 null");
    java.util.Calendar calendar18 = null;
    fTPFile0.setTimestamp(calendar18);
    boolean b20 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test374"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isValid();
    int i4 = fTPFile0.getType();
    int i5 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test375"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setType((int)(short)10);
    boolean b7 = fTPFile0.isSymbolicLink();
    fTPFile0.setRawListing("?---------   97                         -1 null");
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    2          ?---------    2                         -1 null       -1 null");
    boolean b12 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    2 hi!                     -1 null"+ "'", str11.equals("?---------    2 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test376"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    boolean b9 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test377"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    2 hi!                     -1 ?---------    0                         -1 hi!");
    boolean b12 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------  100                         -1 null"+ "'", str11.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test378"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setSize((long)(byte)0);
    fTPFile0.setType((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test379"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    int i7 = fTPFile0.getType();
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str9 = fTPFile0.toString();
    boolean b10 = fTPFile0.isUnknown();
    fTPFile0.setGroup("");
    java.util.Calendar calendar13 = fTPFile0.getTimestamp();
    fTPFile0.setName("----------    2 hi!                     -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar13);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test380"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(byte)0, (int)(short)1, false);
    fTPFile0.setRawListing("?---------    2                         -1 null");
    fTPFile0.setLink("?---------    0                         -1 null");
    java.lang.String str18 = fTPFile0.getGroup();
    fTPFile0.setGroup("?---------    2 ?---------    0                         -1 null                -1 null");
    fTPFile0.setUser("?---------    2 hi!                     -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test381"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(byte)0, (int)(short)1, false);
    java.lang.String str15 = fTPFile0.toFormattedString("");
    java.lang.String str16 = fTPFile0.toString();
    int i17 = fTPFile0.getType();
    java.lang.String str19 = fTPFile0.toFormattedString("?---------    2 hi!                     -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------  100                         -1 null"+ "'", str15.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "?---------  100                         -1 null"+ "'", str19.equals("?---------  100                         -1 null"));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test382"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    boolean b5 = fTPFile0.isFile();
    boolean b6 = fTPFile0.isDirectory();
    boolean b7 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test383"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("----------    2                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test384"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setUser("");
    fTPFile0.setName("?---------    2                         -1 null");
    long long7 = fTPFile0.getSize();
    fTPFile0.setGroup("?---------    2 hi!                     -1 null");
    fTPFile0.setSize((long)(short)10);
    boolean b12 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test385"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("");
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    java.lang.String str11 = fTPFile0.getLink();
    fTPFile0.setRawListing("?---------    0                          1 ?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test386"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.toString();
    java.lang.String str8 = fTPFile0.getGroup();
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    java.lang.String str12 = fTPFile0.getRawListing();
    boolean b13 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test387"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setUser("hi!");
    java.lang.String str7 = fTPFile0.getUser();
    boolean b8 = fTPFile0.isSymbolicLink();
    fTPFile0.setRawListing("?---------    2 hi!                     -1 null");
    boolean b11 = fTPFile0.isUnknown();
    fTPFile0.setHardLinkCount(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test388"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setSize((long)(short)-1);
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str10 = fTPFile0.toFormattedString("");
    java.lang.String str11 = fTPFile0.getRawListing();
    java.util.Calendar calendar12 = null;
    fTPFile0.setTimestamp(calendar12);
    int i14 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    2                         -1 null"+ "'", str10.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test389"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    java.lang.String str7 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.toString();
    fTPFile0.setUser("?---------   97                         -1 null");
    java.lang.String str12 = fTPFile0.getName();
    fTPFile0.setUser("?---------    2                         -1 null");
    java.lang.String str15 = fTPFile0.getUser();
    java.lang.String str16 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    2                         -1 null"+ "'", str15.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test390"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    fTPFile0.setGroup("?---------    2                         -1 null");
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    fTPFile0.setLink("?---------    2                         10 null");
    fTPFile0.setType((int)(short)10);
    fTPFile0.setRawListing("?---------    0                          1 null");
    java.lang.String str16 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "?---------    0                          1 null"+ "'", str16.equals("?---------    0                          1 null"));

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test391"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getLink();
    boolean b5 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------    0                         -1 null");
    fTPFile0.setGroup("?---------    0                         -1 ?---------    2                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test392"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.toFormattedString();
    java.lang.String str8 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------    2                         10 null");
    java.lang.String str11 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 hi!"+ "'", str7.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    2                         10 null"+ "'", str11.equals("?---------    2                         10 null"));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test393"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'a');
    boolean b3 = fTPFile0.isValid();
    fTPFile0.setGroup("?---------    2                          0 null");
    int i6 = fTPFile0.getHardLinkCount();
    boolean b7 = fTPFile0.isDirectory();
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = fTPFile0.hasPermission((int)(short)-1, 52);
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
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test394"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    java.lang.String str3 = fTPFile0.getRawListing();
    fTPFile0.setLink("?---------    0 ?---------    2                         10 null                -1 ?---------    2                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test395"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    int i5 = fTPFile0.getType();
    fTPFile0.setType((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test396"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.getLink();
    fTPFile0.setUser("?---------    0                         -1 hi!");
    boolean b10 = fTPFile0.isValid();
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    boolean b12 = fTPFile0.isDirectory();
    fTPFile0.setSize((long)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test397"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setType((int)(short)10);
    int i7 = fTPFile0.getType();
    long long8 = fTPFile0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = fTPFile0.hasPermission(0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test398"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    boolean b5 = fTPFile0.isUnknown();
    boolean b6 = fTPFile0.isFile();
    fTPFile0.setSize((long)(short)0);
    boolean b9 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test399"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setUser("hi!");
    java.lang.String str7 = fTPFile0.getGroup();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    fTPFile0.setType(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test400"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(byte)0, (int)(short)1, false);
    java.lang.String str14 = fTPFile0.getGroup();
    java.util.Calendar calendar15 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0 ?---------    2                          0 null                 1 ?---------    0                         -1 null");
    boolean b18 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test401"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setSize((long)(byte)10);
    fTPFile0.setPermission(2, (int)(short)1, true);
    int i12 = fTPFile0.getType();
    fTPFile0.setGroup("");
    java.lang.String str15 = fTPFile0.toFormattedString();
    int i16 = fTPFile0.getType();
    boolean b17 = fTPFile0.isUnknown();
    long long18 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?-------w-    2                         10 null"+ "'", str15.equals("?-------w-    2                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 10L);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test402"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    long long7 = fTPFile0.getSize();
    long long8 = fTPFile0.getSize();
    fTPFile0.setUser("");
    fTPFile0.setRawListing("?---------   97          ?---------    2                          0 null       -1 null");
    fTPFile0.setRawListing("?---------    0 ?---------    2                         -1 null                 1 null");
    java.lang.String str15 = fTPFile0.getUser();
    boolean b16 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test403"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.getLink();
    fTPFile0.setUser("?---------    0                         -1 hi!");
    fTPFile0.setSize((long)10);
    boolean b12 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test404"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    fTPFile0.setLink("");
    java.lang.String str9 = fTPFile0.toString();
    java.lang.String str10 = fTPFile0.toFormattedString();
    boolean b11 = fTPFile0.isUnknown();
    fTPFile0.setType((int)(short)100);
    boolean b14 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 hi!"+ "'", str10.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test405"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getRawListing();
    java.lang.String str6 = fTPFile0.getName();
    fTPFile0.setGroup("?---------    2                         -1 null");
    long long9 = fTPFile0.getSize();
    java.lang.String str10 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    2                         -1 null"+ "'", str10.equals("?---------    2                         -1 null"));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test406"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isValid();
    java.lang.String str7 = fTPFile0.getName();
    fTPFile0.setName("?---------    0                         -1 ?---------    2                         -1 null");
    long long10 = fTPFile0.getSize();
    fTPFile0.setRawListing("?---------   97                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == (-1L));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test407"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isFile();
    fTPFile0.setType(0);
    java.lang.String str10 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test408"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setGroup("");
    int i7 = fTPFile0.getHardLinkCount();
    fTPFile0.setUser("?---------  100                         -1 null");
    boolean b10 = fTPFile0.isValid();
    boolean b11 = fTPFile0.isUnknown();
    java.lang.String str12 = fTPFile0.getUser();
    fTPFile0.setHardLinkCount((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------  100                         -1 null"+ "'", str12.equals("?---------  100                         -1 null"));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test409"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setName("hi!");
    long long11 = fTPFile0.getSize();
    java.lang.String str12 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test410"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    fTPFile0.setGroup("?---------    2                         -1 null");
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    fTPFile0.setLink("?---------    2                         10 null");
    boolean b12 = fTPFile0.isFile();
    java.util.Calendar calendar13 = null;
    fTPFile0.setTimestamp(calendar13);
    java.lang.String str15 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    2                         10 null"+ "'", str15.equals("?---------    2                         10 null"));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test411"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.toFormattedString();
    java.lang.String str8 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------    2                         10 null");
    fTPFile0.setGroup("?---------   -1 ?---------  100                         -1 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 hi!"+ "'", str7.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test412"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    fTPFile0.setGroup("?---------    2                         -1 null");
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    fTPFile0.setLink("?---------    2                         10 null");
    fTPFile0.setSize((long)(-1));
    fTPFile0.setType((int)'a');
    fTPFile0.setGroup("?---------   97                         -1 null");
    boolean b18 = fTPFile0.isSymbolicLink();
    java.lang.String str19 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test413"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    long long10 = fTPFile0.getSize();
    fTPFile0.setRawListing("?---------    1                         -1 null");
    fTPFile0.setType(97);
    java.lang.String str15 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test414"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    java.lang.String str7 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.toString();
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    java.lang.String str11 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test415"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setUser("hi!");
    fTPFile0.setType((int)'4');
    boolean b9 = fTPFile0.isUnknown();
    fTPFile0.setLink("?---------    0 ?---------    2                          0 null                 1 ?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test416"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getLink();
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    boolean b9 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test417"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(byte)0, (int)(short)1, false);
    fTPFile0.setRawListing("?---------    2                         -1 null");
    fTPFile0.setLink("?---------    0                         -1 null");
    int i18 = fTPFile0.getType();
    long long19 = fTPFile0.getSize();
    java.lang.String str20 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test418"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setSize((long)(short)-1);
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str10 = fTPFile0.toFormattedString("");
    java.lang.String str11 = fTPFile0.getRawListing();
    java.util.Calendar calendar12 = null;
    fTPFile0.setTimestamp(calendar12);
    fTPFile0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    2                         -1 null"+ "'", str10.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test419"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setSize((long)(byte)10);
    fTPFile0.setPermission(2, (int)(short)1, true);
    int i12 = fTPFile0.getType();
    fTPFile0.setHardLinkCount((int)(short)1);
    boolean b15 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test420"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'a');
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.getRawListing();
    long long5 = fTPFile0.getSize();
    java.lang.String str7 = fTPFile0.toFormattedString("?---------    0                        100 ?---------    2          ?---------    2                         -1 null       -1 null");
    fTPFile0.setHardLinkCount((int)(byte)1);
    fTPFile0.setGroup("?---------   97                         -1 null");
    java.lang.String str12 = fTPFile0.getRawListing();
    java.lang.String str14 = fTPFile0.toFormattedString("?---------   32 hi!                     -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   97                         -1 null"+ "'", str7.equals("?---------   97                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    1          ?---------   97                         -1 null       -1 null"+ "'", str14.equals("?---------    1          ?---------   97                         -1 null       -1 null"));

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test421"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    boolean b5 = fTPFile0.isFile();
    java.lang.String str6 = fTPFile0.getUser();
    fTPFile0.setType((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test422"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'a');
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.getRawListing();
    java.lang.String str5 = fTPFile0.toFormattedString();
    java.lang.String str7 = fTPFile0.toFormattedString("");
    java.lang.String str8 = fTPFile0.toFormattedString();
    java.lang.String str10 = fTPFile0.toFormattedString("?---------    0                         -1 null");
    java.lang.String str11 = fTPFile0.toString();
    boolean b12 = fTPFile0.isSymbolicLink();
    boolean b13 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------   97                         -1 null"+ "'", str5.equals("?---------   97                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   97                         -1 null"+ "'", str7.equals("?---------   97                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------   97                         -1 null"+ "'", str8.equals("?---------   97                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------   97                         -1 null"+ "'", str10.equals("?---------   97                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test423"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    fTPFile0.setName("?---------    2                         -1 null");
    java.lang.String str9 = fTPFile0.getGroup();
    fTPFile0.setSize((long)52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test424"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("");
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str10 = fTPFile0.getLink();
    boolean b13 = fTPFile0.hasPermission((int)(byte)0, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test425"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    java.lang.String str7 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.toString();
    fTPFile0.setUser("?---------   97                         -1 null");
    java.lang.String str12 = fTPFile0.getName();
    fTPFile0.setUser("?---------    2                         -1 null");
    long long15 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test426"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getLink();
    fTPFile0.setName("?---------    0                         -1 hi!");
    java.lang.String str8 = fTPFile0.toFormattedString();
    java.lang.String str9 = fTPFile0.getName();
    fTPFile0.setUser("?---------    0                        100 ?---------    2          ?---------    2                         -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    2 hi!                     -1 ?---------    0                         -1 hi!"+ "'", str8.equals("?---------    2 hi!                     -1 ?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 hi!"+ "'", str9.equals("?---------    0                         -1 hi!"));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test427"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.getRawListing();
    int i8 = fTPFile0.getHardLinkCount();
    java.lang.String str9 = fTPFile0.getLink();
    fTPFile0.setLink("?---------    2 ?---------    0                         -1 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test428"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'a');
    fTPFile0.setRawListing("?---------    2 hi!                     -1 null");
    java.lang.String str5 = fTPFile0.getRawListing();
    java.lang.String str6 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    2 hi!                     -1 null"+ "'", str5.equals("?---------    2 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    2 hi!                     -1 null"+ "'", str6.equals("?---------    2 hi!                     -1 null"));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test429"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'a');
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.getRawListing();
    java.lang.String str5 = fTPFile0.toFormattedString();
    java.lang.String str7 = fTPFile0.toFormattedString("");
    fTPFile0.setHardLinkCount((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------   97                         -1 null"+ "'", str5.equals("?---------   97                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   97                         -1 null"+ "'", str7.equals("?---------   97                         -1 null"));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test430"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    boolean b3 = fTPFile0.isUnknown();
    java.lang.String str4 = fTPFile0.getName();
    fTPFile0.setGroup("?---------   97          ?---------    2                          0 null       -1 null");
    boolean b7 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test431"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(byte)0, (int)(short)1, false);
    fTPFile0.setRawListing("?---------    2                         -1 null");
    fTPFile0.setLink("?---------    0                         -1 null");
    int i18 = fTPFile0.getType();
    fTPFile0.setName("?---------    2 hi!                     -1 ?---------    0                         -1 hi!");
    boolean b21 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar22 = null;
    fTPFile0.setTimestamp(calendar22);
    java.util.Calendar calendar24 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar24);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test432"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setSize((long)(byte)10);
    fTPFile0.setPermission(2, (int)(short)1, true);
    int i12 = fTPFile0.getType();
    fTPFile0.setHardLinkCount((int)(short)1);
    java.lang.String str15 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test433"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isValid();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    fTPFile0.setLink("?---------    2                         10 null");
    java.lang.String str11 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test434"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setUser("");
    fTPFile0.setName("?---------    2                         -1 null");
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    2                         10 null");
    boolean b10 = fTPFile0.isValid();
    java.lang.String str11 = fTPFile0.getUser();
    fTPFile0.setType(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    2                         10 null"+ "'", str11.equals("?---------    2                         10 null"));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test435"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setUser("");
    fTPFile0.setName("?---------    2                         -1 null");
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    boolean b8 = fTPFile0.isValid();
    java.lang.String str9 = fTPFile0.getRawListing();
    fTPFile0.setUser("----------    2 hi!                     -1 null");
    java.lang.String str12 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "----------    2 hi!                     -1 null"+ "'", str12.equals("----------    2 hi!                     -1 null"));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test436"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("");
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test437"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'a');
    boolean b3 = fTPFile0.isValid();
    fTPFile0.setGroup("?---------    2                          0 null");
    boolean b6 = fTPFile0.isSymbolicLink();
    java.lang.String str7 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test438"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    int i7 = fTPFile0.getType();
    boolean b8 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test439"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setGroup("");
    fTPFile0.setType((int)(short)-1);
    boolean b9 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test440"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getType();
    int i4 = fTPFile0.getType();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("?---------    0                         -1 null");
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(short)0, (int)(byte)0, true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    2                         -1 null"+ "'", str7.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    2                         -1 null"+ "'", str9.equals("?---------    2                         -1 null"));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test441"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setUser("");
    fTPFile0.setName("?---------    2                         -1 null");
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getUser();
    boolean b9 = fTPFile0.isUnknown();
    int i10 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test442"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setSize((long)(byte)10);
    fTPFile0.setPermission(2, (int)(short)1, true);
    int i12 = fTPFile0.getType();
    fTPFile0.setGroup("");
    java.lang.String str15 = fTPFile0.toFormattedString();
    int i16 = fTPFile0.getType();
    java.util.Calendar calendar17 = null;
    fTPFile0.setTimestamp(calendar17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?-------w-    2                         10 null"+ "'", str15.equals("?-------w-    2                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test443"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.toString();
    fTPFile0.setLink("hi!");
    java.lang.String str10 = fTPFile0.getGroup();
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    java.lang.String str13 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test444"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setRawListing("?---------    2                         -1 null");
    java.lang.String str5 = fTPFile0.toString();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    java.lang.String str7 = fTPFile0.getRawListing();
    java.lang.String str8 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    2                         -1 null"+ "'", str5.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    2                         -1 null"+ "'", str7.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    2                         -1 null"+ "'", str8.equals("?---------    2                         -1 null"));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test445"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(byte)0, (int)(short)1, false);
    fTPFile0.setRawListing("?---------    2                         -1 null");
    fTPFile0.setLink("?---------    0                         -1 null");
    java.lang.String str18 = fTPFile0.getGroup();
    java.lang.String str19 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test446"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setName("hi!");
    java.lang.String str12 = fTPFile0.toFormattedString("");
    fTPFile0.setHardLinkCount((int)(short)10);
    boolean b15 = fTPFile0.isUnknown();
    fTPFile0.setName("?---------    2 ?---------    2                         -1 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------  100                         -1 hi!"+ "'", str12.equals("?---------  100                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test447"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getType();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setLink("?---------  100                         -1 null");
    java.lang.String str7 = fTPFile0.getUser();
    fTPFile0.setSize((long)(short)100);
    java.lang.String str11 = fTPFile0.toFormattedString("?---------  100                         -1 null");
    fTPFile0.setGroup("hi!");
    long long14 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    2                        100 null"+ "'", str11.equals("?---------    2                        100 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 100L);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test448"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(byte)0, (int)(short)1, false);
    java.lang.String str14 = fTPFile0.getGroup();
    java.util.Calendar calendar15 = fTPFile0.getTimestamp();
    int i16 = fTPFile0.getType();
    java.lang.String str17 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test449"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setType((int)(short)10);
    fTPFile0.setSize((long)100);
    fTPFile0.setLink("?---------    0                          1 ?---------    0                         -1 null");
    fTPFile0.setUser("?---------    2 ?---------    2 hi!                     -1 ?---------    0                         -1 hi!                -1 ?---------    0                         -1 null");

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test450"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(byte)0, (int)(short)1, false);
    fTPFile0.setRawListing("?---------    2                         -1 null");
    fTPFile0.setLink("?---------    0                         -1 null");
    java.lang.String str18 = fTPFile0.getGroup();
    fTPFile0.setGroup("?---------    2 ?---------    0                         -1 null                -1 null");
    boolean b21 = fTPFile0.isSymbolicLink();
    java.lang.String str22 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "?---------    2                         -1 null"+ "'", str22.equals("?---------    2                         -1 null"));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test451"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'a');
    boolean b3 = fTPFile0.isValid();
    fTPFile0.setGroup("?---------    2                          0 null");
    java.lang.String str6 = fTPFile0.toFormattedString();
    fTPFile0.setSize(0L);
    fTPFile0.setName("?---------  100                         -1 hi!");
    boolean b11 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------   97          ?---------    2                          0 null       -1 null"+ "'", str6.equals("?---------   97          ?---------    2                          0 null       -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test452"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.getLink();
    int i5 = fTPFile0.getType();
    java.lang.String str6 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test453"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.toFormattedString();
    java.lang.String str8 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------    2                         10 null");
    fTPFile0.setRawListing("?---------    2                          0 null");
    java.lang.String str13 = fTPFile0.getUser();
    boolean b14 = fTPFile0.isUnknown();
    java.lang.String str15 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 hi!"+ "'", str7.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test454"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str7 = fTPFile0.getRawListing();
    int i8 = fTPFile0.getHardLinkCount();
    boolean b9 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test455"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    boolean b3 = fTPFile0.isUnknown();
    java.lang.String str4 = fTPFile0.getName();
    boolean b5 = fTPFile0.isValid();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    java.lang.String str7 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test456"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getRawListing();
    java.lang.String str6 = fTPFile0.toFormattedString();
    java.lang.String str7 = fTPFile0.toFormattedString();
    java.lang.String str8 = fTPFile0.getUser();
    fTPFile0.setType((int)(byte)0);
    int i11 = fTPFile0.getHardLinkCount();
    java.lang.String str12 = fTPFile0.getLink();
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = fTPFile0.hasPermission((int)(short)0, 97);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    2 hi!                     -1 null"+ "'", str6.equals("?---------    2 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    2 hi!                     -1 null"+ "'", str7.equals("?---------    2 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test457"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test458"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str7 = fTPFile0.getRawListing();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    java.lang.String str10 = fTPFile0.getName();
    long long11 = fTPFile0.getSize();
    fTPFile0.setName("?---------    2 ?---------    2                         -1 null                 0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 null"+ "'", str10.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test459"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setType(3);
    fTPFile0.setUser("hi!");
    boolean b10 = fTPFile0.isDirectory();
    boolean b11 = fTPFile0.isDirectory();
    fTPFile0.setSize((long)(byte)-1);
    boolean b14 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test460"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    java.lang.String str7 = fTPFile0.getRawListing();
    java.lang.String str8 = fTPFile0.getLink();
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = fTPFile0.hasPermission(0, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test461"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getRawListing();
    java.lang.String str6 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0                         -1 hi!");
    boolean b9 = fTPFile0.isSymbolicLink();
    int i10 = fTPFile0.getType();
    fTPFile0.setHardLinkCount((int)'4');
    int i13 = fTPFile0.getType();
    fTPFile0.setLink("?---------  100 ?---------  100                         -1 null                -1 null");
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)' ', (int)(short)1, true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test462"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    java.lang.String str4 = fTPFile0.getRawListing();
    boolean b5 = fTPFile0.isFile();
    fTPFile0.setLink("?---------    2 ?---------  100                         -1 null                 0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test463"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    long long7 = fTPFile0.getSize();
    int i8 = fTPFile0.getType();
    long long9 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == (-1L));

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test464"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setType(0);
    boolean b7 = fTPFile0.isFile();
    fTPFile0.setType((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test465"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setType((int)(short)10);
    boolean b7 = fTPFile0.isSymbolicLink();
    boolean b8 = fTPFile0.isSymbolicLink();
    boolean b9 = fTPFile0.isUnknown();
    boolean b10 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test466"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str7 = fTPFile0.getRawListing();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    fTPFile0.setSize((long)97);
    fTPFile0.setGroup("?---------    2                         -1 ?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test467"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    boolean b5 = fTPFile0.isUnknown();
    boolean b6 = fTPFile0.isFile();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.getLink();
    fTPFile0.setGroup("?-------w-    2                         10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test468"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setGroup("");
    boolean b7 = fTPFile0.isDirectory();
    int i8 = fTPFile0.getHardLinkCount();
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str10 = fTPFile0.getName();
    fTPFile0.setUser("?---------    2                         10 null");
    java.lang.String str13 = fTPFile0.getUser();
    long long14 = fTPFile0.getSize();
    java.util.Calendar calendar15 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    2                         10 null"+ "'", str13.equals("?---------    2                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar15);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test469"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    int i5 = fTPFile0.getType();
    long long6 = fTPFile0.getSize();
    boolean b7 = fTPFile0.isUnknown();
    java.lang.String str9 = fTPFile0.toFormattedString("?---------   52 hi!                     -1 null");
    java.lang.String str10 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    2                         -1 null"+ "'", str9.equals("?---------    2                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test470"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.getRawListing();
    fTPFile0.setRawListing("hi!");
    java.lang.String str10 = fTPFile0.getUser();
    java.lang.String str11 = fTPFile0.getLink();
    boolean b12 = fTPFile0.isFile();
    java.lang.String str13 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test471"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setSize((long)(byte)10);
    java.lang.String str8 = fTPFile0.getGroup();
    fTPFile0.setLink("?---------    2                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test472"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    java.lang.String str4 = fTPFile0.getRawListing();
    boolean b5 = fTPFile0.isUnknown();
    long long6 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test473"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    java.lang.String str7 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.toString();
    int i10 = fTPFile0.getType();
    java.lang.String str11 = fTPFile0.getRawListing();
    fTPFile0.setLink("?---------    0                         -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test474"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isSymbolicLink();
    java.lang.String str7 = fTPFile0.toFormattedString();
    int i8 = fTPFile0.getHardLinkCount();
    boolean b9 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    2 hi!                     -1 null"+ "'", str7.equals("?---------    2 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test475"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setName("?---------  100 ?---------  100                         -1 null                -1 null");
    java.lang.String str5 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test476"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str7 = fTPFile0.getRawListing();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    fTPFile0.setSize((long)97);
    fTPFile0.setLink("?---------    0 ?---------    2                         -1 null                 1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test477"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getRawListing();
    java.lang.String str6 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0                         -1 hi!");
    boolean b9 = fTPFile0.isSymbolicLink();
    java.lang.String str10 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test478"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getType();
    int i4 = fTPFile0.getType();
    fTPFile0.setHardLinkCount(0);
    java.lang.String str7 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test479"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("");
    java.lang.String str9 = fTPFile0.getRawListing();
    fTPFile0.setName("?---------    0                         -1 hi!");
    fTPFile0.setLink("hi!");
    java.lang.String str14 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    0                         -1 hi!"+ "'", str14.equals("?---------    0                         -1 hi!"));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test480"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str7 = fTPFile0.getRawListing();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    fTPFile0.setRawListing("?---------    0                          1 ?---------    0                         -1 null");
    java.lang.String str11 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                         -1 null"+ "'", str11.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test481"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str9 = fTPFile0.toFormattedString();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    2 hi!                     -1 ?---------    0                         -1 hi!");
    java.lang.String str12 = fTPFile0.getGroup();
    boolean b13 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------  100                         -1 null"+ "'", str9.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------  100                         -1 null"+ "'", str11.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test482"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("hi!");
    java.lang.String str7 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("?---------    2                          0 null");
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str13 = fTPFile0.toFormattedString();
    boolean b16 = fTPFile0.hasPermission(2, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0 ?---------    2                          0 null                 1 ?---------    0                         -1 null"+ "'", str13.equals("?---------    0 ?---------    2                          0 null                 1 ?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test483"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.getRawListing();
    fTPFile0.setRawListing("hi!");
    java.lang.String str10 = fTPFile0.getLink();
    boolean b11 = fTPFile0.isValid();
    fTPFile0.setName("?---------    0          ?---------    2 hi!                     -1 null       -1 ?---------    2                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test484"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setSize((long)(byte)10);
    fTPFile0.setPermission(2, (int)(short)1, true);
    int i12 = fTPFile0.getType();
    fTPFile0.setGroup("");
    java.lang.String str15 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test485"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("");
    fTPFile0.setRawListing("");
    java.lang.String str10 = fTPFile0.toFormattedString("");
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(short)100, 0, true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    2                         -1 null"+ "'", str10.equals("?---------    2                         -1 null"));

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test486"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize((long)1);
    java.lang.String str3 = fTPFile0.getLink();
    java.lang.String str4 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test487"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setType((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test488"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    long long9 = fTPFile0.getSize();
    int i10 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test489"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    boolean b3 = fTPFile0.isUnknown();
    int i4 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test490"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getType();
    fTPFile0.setHardLinkCount((int)(byte)1);
    fTPFile0.setType((int)(byte)100);
    fTPFile0.setUser("?---------    2 ?---------  100                         -1 null                 0 null");
    int i10 = fTPFile0.getType();
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test491"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setUser("hi!");
    fTPFile0.setType((int)'4');
    java.lang.String str9 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test492"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isSymbolicLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isValid();
    fTPFile0.setRawListing("?---------    0                         -1 hi!");
    fTPFile0.setRawListing("?---------    2                          0 null");
    fTPFile0.setUser("?---------   97          ?---------    2                          0 null       -1 null");
    java.lang.String str14 = fTPFile0.toString();
    int i15 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    2                          0 null"+ "'", str14.equals("?---------    2                          0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test493"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.getRawListing();
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.getUser();
    boolean b10 = fTPFile0.hasPermission((int)(short)0, 0);
    fTPFile0.setName("?---------    0                          1 null");
    java.util.Calendar calendar13 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar13);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test494"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setUser("");
    fTPFile0.setName("?---------    2                         -1 null");
    long long7 = fTPFile0.getSize();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str10 = fTPFile0.getRawListing();
    java.lang.String str11 = fTPFile0.getGroup();
    fTPFile0.setLink("?---------    2 ?---------  100                         -1 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test495"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setUser("hi!");
    boolean b7 = fTPFile0.isUnknown();
    long long8 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test496"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setUser("");
    fTPFile0.setName("?---------    2                         -1 null");
    long long7 = fTPFile0.getSize();
    boolean b8 = fTPFile0.isValid();
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    int i11 = fTPFile0.getHardLinkCount();
    fTPFile0.setLink("?---------    2          ?---------    2                         -1 null       -1 null");
    boolean b14 = fTPFile0.isSymbolicLink();
    boolean b15 = fTPFile0.isFile();
    java.util.Calendar calendar16 = null;
    fTPFile0.setTimestamp(calendar16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test497"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    int i3 = fTPFile0.getHardLinkCount();
    boolean b4 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    int i7 = fTPFile0.getHardLinkCount();
    boolean b8 = fTPFile0.isFile();
    java.lang.String str9 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test498"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.toFormattedString();
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str9 = fTPFile0.getUser();
    boolean b10 = fTPFile0.isUnknown();
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    int i13 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 hi!"+ "'", str7.equals("?---------    0                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test499"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getRawListing();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setHardLinkCount(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    1                         -1 null"+ "'", str7.equals("?---------    1                         -1 null"));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test500"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setUser("hi!");
    fTPFile0.setGroup("");
    boolean b7 = fTPFile0.isDirectory();
    int i8 = fTPFile0.getHardLinkCount();
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str10 = fTPFile0.getName();
    fTPFile0.setType((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

}
