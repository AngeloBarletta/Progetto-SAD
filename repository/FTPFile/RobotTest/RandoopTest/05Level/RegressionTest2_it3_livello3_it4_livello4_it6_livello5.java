package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2_it3_livello3_it4_livello4_it6_livello5 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test001"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    java.util.Calendar calendar2 = fTPFile0.getTimestamp();
    long long3 = fTPFile0.getSize();
    boolean b4 = fTPFile0.isValid();
    boolean b5 = fTPFile0.isValid();
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test002"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("");
    java.lang.String str6 = fTPFile0.getRawListing();
    java.lang.String str7 = fTPFile0.toFormattedString();
    fTPFile0.setSize(0L);
    java.lang.String str10 = fTPFile0.getRawListing();
    java.lang.String str11 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test003"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.toString();
    fTPFile0.setSize((long)(byte)10);
    java.lang.String str8 = fTPFile0.toFormattedString("");
    fTPFile0.setType((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         10 null"+ "'", str8.equals("?---------    0                         10 null"));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test004"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("");
    java.lang.String str6 = fTPFile0.getRawListing();
    java.lang.String str7 = fTPFile0.toFormattedString();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    fTPFile0.setType(0);
    java.lang.String str14 = fTPFile0.toString();
    java.lang.String str15 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test005"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    fTPFile0.setLink("");
    boolean b6 = fTPFile0.isValid();
    java.lang.String str7 = fTPFile0.getUser();
    boolean b8 = fTPFile0.isValid();
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test006"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test007"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    fTPFile0.setLink("");
    java.lang.String str6 = fTPFile0.getGroup();
    fTPFile0.setHardLinkCount((int)'4');
    java.lang.String str9 = fTPFile0.getName();
    java.lang.String str10 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------   -1          ?---------    0 ?---------    0                         -1 null                -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test008"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    fTPFile0.setGroup("d---------    0                         -1 null");
    fTPFile0.setRawListing("?r--------    0 hi!                      0 null");

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test009"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    java.lang.String str6 = fTPFile0.toFormattedString();
    int i7 = fTPFile0.getType();
    fTPFile0.setPermission((int)(byte)1, (int)(short)0, true);
    int i12 = fTPFile0.getType();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str16 = fTPFile0.toFormattedString("?---------    0 hi!                     52 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "?---r-----  100                         -1 null"+ "'", str16.equals("?---r-----  100                         -1 null"));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test010"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("");
    java.lang.String str6 = fTPFile0.getRawListing();
    java.lang.String str7 = fTPFile0.toFormattedString();
    fTPFile0.setType((int)'a');
    java.lang.String str10 = fTPFile0.getRawListing();
    java.lang.String str12 = fTPFile0.toFormattedString("?---------    0                         -1 ?---------    0 hi!                     -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         -1 null"+ "'", str12.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test011"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1 null                -1 null");
    java.lang.String str5 = fTPFile0.getGroup();
    fTPFile0.setLink("?---------    0                          3 ");
    java.lang.String str8 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                          3 "+ "'", str8.equals("?---------    0                          3 "));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test012"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isValid();
    fTPFile0.setLink("?---------    0 hi!                     -1 null");
    boolean b10 = fTPFile0.isValid();
    java.lang.String str11 = fTPFile0.toString();
    java.lang.String str13 = fTPFile0.toFormattedString("?---------    0 hi!                     -1 null");
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
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0                         -1 null"+ "'", str13.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test013"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    java.util.Calendar calendar2 = fTPFile0.getTimestamp();
    long long3 = fTPFile0.getSize();
    boolean b4 = fTPFile0.isValid();
    fTPFile0.setName("?---------    0 hi!                     -1 null");
    java.lang.String str7 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test014"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    fTPFile0.setUser("");
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    int i9 = fTPFile0.getType();
    java.lang.String str10 = fTPFile0.toString();
    int i11 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test015"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isValid();
    fTPFile0.setLink("?---------    0 hi!                     -1 null");
    boolean b10 = fTPFile0.isValid();
    java.lang.String str11 = fTPFile0.toString();
    java.lang.String str13 = fTPFile0.toFormattedString("?---------    0 hi!                     -1 null");
    fTPFile0.setSize((long)(short)-1);
    java.lang.String str16 = fTPFile0.getRawListing();
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = fTPFile0.hasPermission((int)(short)1, (int)(short)-1);
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
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0                         -1 null"+ "'", str13.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test016"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    fTPFile0.setUser("hi!");
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                         -1 null");
    boolean b10 = fTPFile0.isUnknown();
    java.lang.String str11 = fTPFile0.toFormattedString();
    fTPFile0.setUser("?---------    0                         -1 null");
    boolean b14 = fTPFile0.isValid();
    java.lang.String str15 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0 hi!                     -1 null"+ "'", str9.equals("?---------    0 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0 hi!                     -1 null"+ "'", str11.equals("?---------    0 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test017"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("");
    long long6 = fTPFile0.getSize();
    java.lang.String str8 = fTPFile0.toFormattedString("?---------    0 hi!                     -1 null");
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    int i10 = fTPFile0.getType();
    fTPFile0.setHardLinkCount((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 null"+ "'", str8.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test018"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setHardLinkCount((int)(short)1);
    long long7 = fTPFile0.getSize();
    fTPFile0.setLink("?---------    0                         -1 null");
    boolean b10 = fTPFile0.isFile();
    boolean b11 = fTPFile0.isDirectory();
    fTPFile0.setName("?---------    0          hi!            -1 ?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test019"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.lang.String str4 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------    0                         -1 null");
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    fTPFile0.setGroup("?---------    0 hi!                     -1 null");
    boolean b11 = fTPFile0.isDirectory();
    boolean b12 = fTPFile0.isDirectory();
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = fTPFile0.hasPermission((int)'4', (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test020"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    long long2 = fTPFile0.getSize();
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("?---------    0                         10 null");
    fTPFile0.setHardLinkCount((int)(short)-1);
    java.lang.String str8 = fTPFile0.getRawListing();
    java.lang.String str9 = fTPFile0.toFormattedString();
    int i10 = fTPFile0.getType();
    boolean b11 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------   -1          ?---------    0                         10 null       -1 null"+ "'", str9.equals("?---------   -1          ?---------    0                         10 null       -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test021"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.lang.String str7 = fTPFile0.toFormattedString("?---------    0 hi!                     -1 null");
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str9 = fTPFile0.getRawListing();
    fTPFile0.setRawListing("?---------    0                          1 ?---------    0 hi!                     -1 null");
    fTPFile0.setSize(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test022"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    fTPFile0.setHardLinkCount((int)(short)0);
    java.lang.String str8 = fTPFile0.getRawListing();
    java.lang.String str9 = fTPFile0.getName();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                         -1 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                         -1 null"+ "'", str11.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test023"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.toString();
    fTPFile0.setSize((long)(byte)10);
    java.lang.String str7 = fTPFile0.getUser();
    fTPFile0.setSize(100L);
    fTPFile0.setUser("?---------    1 hi!                     -1 hi!");
    java.util.Calendar calendar12 = null;
    fTPFile0.setTimestamp(calendar12);
    boolean b14 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test024"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0                         -1 null");
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str10 = fTPFile0.getRawListing();
    java.lang.String str11 = fTPFile0.toFormattedString();
    java.lang.String str12 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0 ?---------    0                         -1 null                -1 null"+ "'", str11.equals("?---------    0 ?---------    0                         -1 null                -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test025"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    long long2 = fTPFile0.getSize();
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("?---------    0                         10 null");
    fTPFile0.setHardLinkCount((int)(short)-1);
    java.lang.String str8 = fTPFile0.toFormattedString();
    fTPFile0.setHardLinkCount((int)(byte)0);
    boolean b11 = fTPFile0.isDirectory();
    fTPFile0.setName("?---------    0                         -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------   -1          ?---------    0                         10 null       -1 null"+ "'", str8.equals("?---------   -1          ?---------    0                         10 null       -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test026"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    java.lang.String str6 = fTPFile0.toFormattedString();
    int i7 = fTPFile0.getType();
    fTPFile0.setPermission((int)(byte)1, (int)(short)0, true);
    boolean b12 = fTPFile0.isUnknown();
    boolean b13 = fTPFile0.isSymbolicLink();
    fTPFile0.setLink("?---------    0                         -1 ?---------    0                         -1 null");
    int i16 = fTPFile0.getHardLinkCount();
    fTPFile0.setUser("?---------    0 ?---------    0                         -1 null                10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test027"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    fTPFile0.setUser("hi!");
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                         -1 null");
    java.lang.String str11 = fTPFile0.toFormattedString("hi!");
    boolean b12 = fTPFile0.isSymbolicLink();
    fTPFile0.setLink("?---------    0                        100 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0 hi!                     -1 null"+ "'", str9.equals("?---------    0 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0 hi!                     -1 null"+ "'", str11.equals("?---------    0 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test028"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    fTPFile0.setGroup("");
    fTPFile0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test029"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setHardLinkCount((int)(short)1);
    boolean b7 = fTPFile0.isValid();
    fTPFile0.setSize((long)1);
    long long10 = fTPFile0.getSize();
    java.lang.String str11 = fTPFile0.getUser();
    fTPFile0.setSize((long)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test030"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    java.lang.String str6 = fTPFile0.toFormattedString();
    int i7 = fTPFile0.getType();
    fTPFile0.setLink("?---------    0                         -1 null");
    boolean b10 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount((int)(short)10);
    fTPFile0.setGroup("d---------    1                          1 null");
    fTPFile0.setSize((long)3);
    fTPFile0.setRawListing("?---------    0 hi!      ?---------    0                        100 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test031"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    int i7 = fTPFile0.getType();
    fTPFile0.setSize((long)(byte)1);
    boolean b10 = fTPFile0.isUnknown();
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test032"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    java.lang.String str2 = fTPFile0.toString();
    fTPFile0.setSize((long)(byte)1);
    fTPFile0.setRawListing("");
    fTPFile0.setLink("?---------    0                         -1 ");
    int i9 = fTPFile0.getHardLinkCount();
    int i10 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test033"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("");
    java.lang.String str6 = fTPFile0.getRawListing();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    fTPFile0.setUser("?---------    0                         -1 null");
    fTPFile0.setUser("?---------    0                         -1 ");
    java.util.Calendar calendar13 = fTPFile0.getTimestamp();
    java.util.Calendar calendar14 = fTPFile0.getTimestamp();
    boolean b15 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test034"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str6 = fTPFile0.getGroup();
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setUser("");
    boolean b10 = fTPFile0.isDirectory();
    fTPFile0.setSize((long)(short)10);
    boolean b13 = fTPFile0.isFile();
    java.lang.String str14 = fTPFile0.getGroup();
    boolean b15 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test035"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    long long2 = fTPFile0.getSize();
    java.lang.String str3 = fTPFile0.toFormattedString();
    fTPFile0.setPermission((int)(short)1, (int)(short)0, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test036"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setHardLinkCount((int)(byte)0);
    java.lang.String str7 = fTPFile0.toFormattedString("?---------    0                          1 ?---------    0 hi!                     -1 null");
    fTPFile0.setGroup("?---------    0                        100 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 ?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 ?---------    0                         -1 null"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test037"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    java.util.Calendar calendar2 = fTPFile0.getTimestamp();
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.getName();
    long long5 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test038"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setRawListing("?---------    1                         -1 hi!");
    boolean b4 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test039"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    fTPFile0.setLink("");
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setUser("");
    fTPFile0.setLink("?---------    0                         -1 null");
    java.lang.String str12 = fTPFile0.getName();
    java.lang.String str13 = fTPFile0.getName();
    long long14 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == (-1L));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test040"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.toString();
    java.lang.String str5 = fTPFile0.toFormattedString();
    java.lang.String str7 = fTPFile0.toFormattedString("?---------    0 hi!                     -1 null");
    fTPFile0.setName("?---------  100                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test041"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isUnknown();
    java.lang.String str8 = fTPFile0.toFormattedString();
    java.lang.String str9 = fTPFile0.toFormattedString();
    java.lang.String str10 = fTPFile0.getLink();
    int i11 = fTPFile0.getHardLinkCount();
    int i12 = fTPFile0.getHardLinkCount();
    fTPFile0.setHardLinkCount(52);
    long long15 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 null"+ "'", str8.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 null"+ "'", str9.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == (-1L));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test042"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    long long6 = fTPFile0.getSize();
    java.lang.String str7 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    1 hi!                     -1 hi!");
    fTPFile0.setSize((long)(byte)0);
    java.util.Calendar calendar12 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar12);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test043"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    java.lang.String str6 = fTPFile0.toFormattedString();
    fTPFile0.setSize(0L);
    fTPFile0.setHardLinkCount((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test044"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    fTPFile0.setHardLinkCount((int)(short)0);
    java.lang.String str8 = fTPFile0.getRawListing();
    fTPFile0.setType((-1));
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str13 = fTPFile0.toFormattedString();
    fTPFile0.setPermission(2, (int)(short)1, true);
    java.lang.String str18 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0                         -1 ?---------    0                         -1 null"+ "'", str13.equals("?---------    0                         -1 ?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test045"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("");
    java.lang.String str6 = fTPFile0.getRawListing();
    java.lang.String str7 = fTPFile0.toFormattedString();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    fTPFile0.setGroup("hi!");
    int i12 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test046"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.lang.String str4 = fTPFile0.toFormattedString("hi!");
    long long5 = fTPFile0.getSize();
    int i6 = fTPFile0.getType();
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setLink("?---------    0          ?---------    0                         -1 ?---------    0 hi!                     -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test047"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str6 = fTPFile0.getGroup();
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setUser("");
    java.lang.String str10 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 null"+ "'", str10.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test048"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    java.util.Calendar calendar2 = fTPFile0.getTimestamp();
    long long3 = fTPFile0.getSize();
    boolean b4 = fTPFile0.isValid();
    boolean b5 = fTPFile0.isValid();
    boolean b6 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test049"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    java.util.Calendar calendar2 = fTPFile0.getTimestamp();
    long long3 = fTPFile0.getSize();
    boolean b4 = fTPFile0.isValid();
    fTPFile0.setName("?---------    0 hi!                     -1 null");
    fTPFile0.setType(3);
    java.lang.String str9 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0 hi!                     -1 null"+ "'", str9.equals("?---------    0 hi!                     -1 null"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test050"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.lang.String str4 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------    0                         -1 null");
    long long7 = fTPFile0.getSize();
    boolean b8 = fTPFile0.isFile();
    fTPFile0.setUser("hi!");
    int i11 = fTPFile0.getHardLinkCount();
    int i12 = fTPFile0.getHardLinkCount();
    fTPFile0.setLink("?---------   32                          1 null");
    fTPFile0.setName("?---------    0 ?---------    0                         -1 null                10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test051"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    java.lang.String str6 = fTPFile0.toFormattedString();
    java.lang.String str7 = fTPFile0.getUser();
    long long8 = fTPFile0.getSize();
    boolean b9 = fTPFile0.isValid();
    boolean b10 = fTPFile0.isDirectory();
    java.lang.String str11 = fTPFile0.getGroup();
    java.lang.String str12 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test052"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.lang.String str4 = fTPFile0.toFormattedString("hi!");
    boolean b5 = fTPFile0.isSymbolicLink();
    boolean b6 = fTPFile0.isUnknown();
    boolean b7 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test053"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0                         -1 null");
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str10 = fTPFile0.getRawListing();
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = fTPFile0.hasPermission((int)(short)100, 0);
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
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test054"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str2 = fTPFile0.toFormattedString("?---------    1 hi!                     -1 null");
    boolean b3 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "?---------    0                         -1 null"+ "'", str2.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test055"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    fTPFile0.setName("");
    fTPFile0.setRawListing("?---------    0 hi!                     -1 null");
    fTPFile0.setSize((long)(short)-1);
    java.lang.String str12 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test056"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("");
    long long6 = fTPFile0.getSize();
    java.lang.String str8 = fTPFile0.toFormattedString("?---------    0 hi!                     -1 null");
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1 null                10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 null"+ "'", str8.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test057"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.toString();
    fTPFile0.setSize((long)(byte)10);
    java.lang.String str8 = fTPFile0.toFormattedString("");
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(100, (int)(short)1, true);
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
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         10 null"+ "'", str8.equals("?---------    0                         10 null"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test058"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str6 = fTPFile0.getGroup();
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setUser("");
    fTPFile0.setLink("?---------    0 hi!                     -1 null");
    java.util.Calendar calendar12 = null;
    fTPFile0.setTimestamp(calendar12);
    java.lang.String str14 = fTPFile0.getGroup();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(52, (int)'#', true);
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
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test059"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    java.lang.String str6 = fTPFile0.toFormattedString();
    int i7 = fTPFile0.getType();
    fTPFile0.setPermission((int)(byte)1, (int)(short)0, true);
    fTPFile0.setGroup("?---------    1                          1 null");
    java.lang.String str14 = fTPFile0.getUser();
    java.lang.String str15 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test060"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    fTPFile0.setLink("hi!");
    java.lang.String str8 = fTPFile0.toString();
    boolean b9 = fTPFile0.isUnknown();
    fTPFile0.setType(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test061"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    fTPFile0.setUser("");
    java.lang.String str8 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test062"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("");
    java.lang.String str6 = fTPFile0.getRawListing();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    fTPFile0.setType(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test063"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("");
    java.lang.String str6 = fTPFile0.getName();
    java.lang.String str7 = fTPFile0.getGroup();
    boolean b8 = fTPFile0.isUnknown();
    boolean b9 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test064"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isValid();
    fTPFile0.setLink("?---------    0 hi!                     -1 null");
    boolean b10 = fTPFile0.isValid();
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    java.lang.String str13 = fTPFile0.getUser();
    boolean b14 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("?---------    0                         -1 ?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test065"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    java.lang.String str6 = fTPFile0.toFormattedString();
    java.lang.String str7 = fTPFile0.getUser();
    long long8 = fTPFile0.getSize();
    boolean b9 = fTPFile0.isValid();
    boolean b10 = fTPFile0.isFile();
    boolean b11 = fTPFile0.isUnknown();
    int i12 = fTPFile0.getHardLinkCount();
    boolean b13 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test066"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    fTPFile0.setLink("");
    boolean b6 = fTPFile0.isValid();
    java.lang.String str7 = fTPFile0.getUser();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    fTPFile0.setSize(52L);
    java.lang.String str12 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test067"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    fTPFile0.setUser("hi!");
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                         -1 null");
    fTPFile0.setGroup("?---------    0                        100 null");
    fTPFile0.setLink("?---------    0          ?---------    0 hi!                     -1 null       -1 null");
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(short)0, (int)(byte)100, true);
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0 hi!                     -1 null"+ "'", str9.equals("?---------    0 hi!                     -1 null"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test068"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.toString();
    fTPFile0.setSize((long)(byte)10);
    java.lang.String str7 = fTPFile0.getName();
    long long8 = fTPFile0.getSize();
    java.lang.String str9 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         10 null"+ "'", str9.equals("?---------    0                         10 null"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test069"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str6 = fTPFile0.getGroup();
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setUser("");
    fTPFile0.setLink("?---------    0 hi!                     -1 null");
    fTPFile0.setType((-1));
    java.util.Calendar calendar14 = fTPFile0.getTimestamp();
    java.lang.String str15 = fTPFile0.getUser();
    java.util.Calendar calendar16 = null;
    fTPFile0.setTimestamp(calendar16);
    java.lang.String str18 = fTPFile0.getRawListing();
    fTPFile0.setName("?---r-----  100                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "?---------    0                         -1 null"+ "'", str18.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test070"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    fTPFile0.setUser("hi!");
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    boolean b10 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test071"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str6 = fTPFile0.getGroup();
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setUser("");
    boolean b10 = fTPFile0.isDirectory();
    fTPFile0.setSize((long)(short)10);
    boolean b13 = fTPFile0.isFile();
    java.lang.String str14 = fTPFile0.getGroup();
    fTPFile0.setName("?---------    1 hi!                     -1 hi!");
    boolean b17 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test072"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    fTPFile0.setLink("");
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setUser("");
    fTPFile0.setLink("?---------    0                         -1 null");
    java.lang.String str12 = fTPFile0.toString();
    boolean b13 = fTPFile0.isValid();
    fTPFile0.setRawListing("?---------    1 hi!                     -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test073"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.toString();
    fTPFile0.setSize((long)(byte)10);
    java.lang.String str7 = fTPFile0.getUser();
    fTPFile0.setHardLinkCount((int)(short)10);
    fTPFile0.setHardLinkCount((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test074"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("?---------    0                         -1 null");
    boolean b3 = fTPFile0.isSymbolicLink();
    java.lang.String str4 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test075"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.lang.String str4 = fTPFile0.toFormattedString("hi!");
    int i5 = fTPFile0.getHardLinkCount();
    fTPFile0.setName("");
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    boolean b10 = fTPFile0.isDirectory();
    fTPFile0.setSize((long)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test076"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    int i2 = fTPFile0.getType();
    fTPFile0.setLink("?---------    0                         -1 null");
    boolean b5 = fTPFile0.isValid();
    fTPFile0.setName("?---------    0 hi!                     -1 null");
    java.lang.String str8 = fTPFile0.getName();
    java.lang.String str10 = fTPFile0.toFormattedString("?---------    1                         -1 hi!");
    long long11 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0 hi!                     -1 null"+ "'", str8.equals("?---------    0 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 ?---------    0 hi!                     -1 null"+ "'", str10.equals("?---------    0                         -1 ?---------    0 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test077"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    long long6 = fTPFile0.getSize();
    java.lang.String str7 = fTPFile0.getGroup();
    java.lang.String str9 = fTPFile0.toFormattedString("");
    fTPFile0.setHardLinkCount(1);
    fTPFile0.setType((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 null"+ "'", str9.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test078"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    fTPFile0.setUser("");
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    int i9 = fTPFile0.getHardLinkCount();
    java.lang.String str10 = fTPFile0.getUser();
    long long11 = fTPFile0.getSize();
    int i12 = fTPFile0.getType();
    int i13 = fTPFile0.getHardLinkCount();
    boolean b14 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test079"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    long long6 = fTPFile0.getSize();
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setPermission(0, (int)(short)0, false);
    fTPFile0.setUser("?---------   -1          ?---------    0 ?---------    0                         -1 null                -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test080"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0                         -1 null");
    fTPFile0.setGroup("?---------    0                         -1 ");
    java.lang.String str11 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test081"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    boolean b4 = fTPFile0.isDirectory();
    fTPFile0.setUser("?---------  100                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test082"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    fTPFile0.setUser("hi!");
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                         -1 null");
    boolean b10 = fTPFile0.isUnknown();
    java.lang.String str11 = fTPFile0.toFormattedString();
    java.lang.String str12 = fTPFile0.getName();
    fTPFile0.setSize((long)(byte)1);
    java.util.Calendar calendar15 = null;
    fTPFile0.setTimestamp(calendar15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0 hi!                     -1 null"+ "'", str9.equals("?---------    0 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0 hi!                     -1 null"+ "'", str11.equals("?---------    0 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test083"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    java.lang.String str2 = fTPFile0.toString();
    fTPFile0.setSize((long)(byte)1);
    fTPFile0.setRawListing("");
    fTPFile0.setLink("?---------    0                         -1 ");
    java.lang.String str9 = fTPFile0.getLink();
    java.lang.String str10 = fTPFile0.toString();
    fTPFile0.setSize((long)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 "+ "'", str9.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test084"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    fTPFile0.setUser("");
    fTPFile0.setGroup("?---------    0 hi!                     -1 null");
    boolean b10 = fTPFile0.isFile();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)'#', (int)(byte)100, false);
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
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test085"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("");
    java.lang.String str6 = fTPFile0.getName();
    java.lang.String str7 = fTPFile0.toString();
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str9 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test086"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.toString();
    boolean b5 = fTPFile0.isDirectory();
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    java.lang.String str8 = fTPFile0.getUser();
    fTPFile0.setHardLinkCount((int)(byte)100);
    int i11 = fTPFile0.getHardLinkCount();
    fTPFile0.setGroup("?---------   10                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test087"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    java.lang.String str6 = fTPFile0.toFormattedString();
    java.lang.String str7 = fTPFile0.getUser();
    long long8 = fTPFile0.getSize();
    boolean b9 = fTPFile0.isValid();
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    long long11 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test088"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    fTPFile0.setName("");
    int i8 = fTPFile0.getType();
    fTPFile0.setLink("?---------    0 hi!                     -1 null");
    fTPFile0.setLink("?---------    0                         -1 ");
    fTPFile0.setHardLinkCount(0);
    int i15 = fTPFile0.getHardLinkCount();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(52, (int)(byte)0, false);
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
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test089"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    java.util.Calendar calendar2 = fTPFile0.getTimestamp();
    long long3 = fTPFile0.getSize();
    boolean b4 = fTPFile0.isFile();
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    fTPFile0.setRawListing("?---r-----  100                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test090"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.lang.String str3 = fTPFile0.getLink();
    int i4 = fTPFile0.getType();
    int i5 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test091"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    int i7 = fTPFile0.getType();
    java.lang.String str8 = fTPFile0.getRawListing();
    java.lang.String str9 = fTPFile0.getUser();
    boolean b10 = fTPFile0.isUnknown();
    fTPFile0.setPermission(0, (int)(byte)1, false);
    java.lang.String str15 = fTPFile0.toString();
    boolean b16 = fTPFile0.isUnknown();
    java.lang.String str17 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test092"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("?---------    0                         -1 null");
    fTPFile0.setUser("");
    int i5 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test093"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    java.util.Calendar calendar2 = fTPFile0.getTimestamp();
    long long3 = fTPFile0.getSize();
    boolean b4 = fTPFile0.isValid();
    fTPFile0.setName("?---------    0 hi!                     -1 null");
    java.lang.String str7 = fTPFile0.getRawListing();
    fTPFile0.setHardLinkCount(3);
    boolean b12 = fTPFile0.hasPermission((int)(byte)1, 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test094"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    fTPFile0.setLink("hi!");
    java.lang.String str8 = fTPFile0.toString();
    java.lang.String str10 = fTPFile0.toFormattedString("?---------    0                         -1 ");
    java.lang.String str11 = fTPFile0.toString();
    boolean b12 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 null"+ "'", str10.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test095"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    long long6 = fTPFile0.getSize();
    java.lang.String str7 = fTPFile0.getName();
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                         -1 null");
    fTPFile0.setName("?---------    0                          1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 null"+ "'", str9.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test096"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    int i7 = fTPFile0.getType();
    boolean b8 = fTPFile0.isDirectory();
    java.lang.String str9 = fTPFile0.toString();
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    boolean b13 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test097"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str6 = fTPFile0.getGroup();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.getUser();
    int i10 = fTPFile0.getHardLinkCount();
    boolean b11 = fTPFile0.isValid();
    java.lang.String str12 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         -1 null"+ "'", str12.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test098"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str6 = fTPFile0.getGroup();
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setUser("");
    boolean b10 = fTPFile0.isDirectory();
    fTPFile0.setSize((long)(short)10);
    boolean b13 = fTPFile0.isFile();
    java.lang.String str14 = fTPFile0.getGroup();
    java.util.Calendar calendar15 = null;
    fTPFile0.setTimestamp(calendar15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test099"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    int i7 = fTPFile0.getType();
    boolean b8 = fTPFile0.isDirectory();
    java.lang.String str9 = fTPFile0.getRawListing();
    java.lang.String str10 = fTPFile0.getLink();
    boolean b11 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test100"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    fTPFile0.setUser("hi!");
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                         -1 null");
    java.lang.String str11 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setName("hi!");
    fTPFile0.setGroup("");
    java.lang.String str16 = fTPFile0.getName();
    java.lang.String str17 = fTPFile0.getGroup();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)100, 1, false);
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0 hi!                     -1 null"+ "'", str9.equals("?---------    0 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0 hi!                     -1 null"+ "'", str11.equals("?---------    0 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test101"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    fTPFile0.setName("");
    boolean b8 = fTPFile0.isDirectory();
    boolean b9 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    boolean b11 = fTPFile0.isValid();
    int i12 = fTPFile0.getType();
    int i13 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test102"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.toString();
    java.lang.String str5 = fTPFile0.toFormattedString();
    java.lang.String str7 = fTPFile0.toFormattedString("?---------    0 hi!                     -1 null");
    fTPFile0.setGroup("?---------    1                          1 null");
    java.lang.String str10 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test103"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    long long6 = fTPFile0.getSize();
    java.lang.String str7 = fTPFile0.toFormattedString();
    fTPFile0.setSize((long)(byte)1);
    fTPFile0.setHardLinkCount((int)' ');
    fTPFile0.setUser("?---------    0                         -1 ");
    java.lang.String str14 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test104"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.toString();
    boolean b5 = fTPFile0.isDirectory();
    java.lang.String str6 = fTPFile0.getGroup();
    int i7 = fTPFile0.getType();
    fTPFile0.setName("?---------    0 hi!                     -1 null");
    fTPFile0.setName("?---------  100                         -1 null");
    java.util.Calendar calendar12 = null;
    fTPFile0.setTimestamp(calendar12);
    java.lang.String str14 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test105"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.toString();
    fTPFile0.setSize((long)(byte)10);
    java.lang.String str7 = fTPFile0.getName();
    fTPFile0.setLink("hi!");
    java.lang.String str10 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test106"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    long long6 = fTPFile0.getSize();
    java.lang.String str7 = fTPFile0.getGroup();
    java.lang.String str9 = fTPFile0.toFormattedString("");
    java.lang.String str10 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 null"+ "'", str9.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test107"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isFile();
    int i8 = fTPFile0.getHardLinkCount();
    int i9 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test108"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isFile();
    java.lang.String str8 = fTPFile0.getLink();
    fTPFile0.setHardLinkCount(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test109"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    java.lang.String str6 = fTPFile0.toFormattedString();
    java.lang.String str7 = fTPFile0.getUser();
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test110"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0                         -1 null");
    boolean b9 = fTPFile0.isFile();
    java.lang.String str10 = fTPFile0.getUser();
    boolean b13 = fTPFile0.hasPermission((int)(byte)0, 0);
    java.util.Calendar calendar14 = fTPFile0.getTimestamp();
    java.lang.String str15 = fTPFile0.getUser();
    int i16 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 null"+ "'", str10.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    0                         -1 null"+ "'", str15.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test111"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setSize((long)(short)1);
    java.lang.String str7 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test112"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setRawListing("?---------    1                         -1 hi!");
    boolean b4 = fTPFile0.isValid();
    int i5 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test113"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    fTPFile0.setUser("");
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    int i9 = fTPFile0.getHardLinkCount();
    fTPFile0.setGroup("?---------   32                          1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test114"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str6 = fTPFile0.getGroup();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.toString();
    java.lang.String str10 = fTPFile0.getGroup();
    java.lang.String str11 = fTPFile0.getGroup();
    boolean b12 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 null"+ "'", str9.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test115"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isValid();
    fTPFile0.setLink("?---------    0 hi!                     -1 null");
    boolean b10 = fTPFile0.isValid();
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    boolean b12 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test116"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    long long2 = fTPFile0.getSize();
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("?---------    0                         10 null");
    fTPFile0.setHardLinkCount((int)(short)-1);
    fTPFile0.setLink("?---------    0 hi!                     -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test117"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    long long2 = fTPFile0.getSize();
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("?---------    0                         10 null");
    fTPFile0.setHardLinkCount((int)(short)100);
    java.lang.String str8 = fTPFile0.toString();
    boolean b9 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test118"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    long long2 = fTPFile0.getSize();
    int i3 = fTPFile0.getType();
    fTPFile0.setLink("?---------    0                         -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test119"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    fTPFile0.setUser("hi!");
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                         -1 null");
    boolean b10 = fTPFile0.isUnknown();
    java.lang.String str11 = fTPFile0.toFormattedString();
    java.lang.String str12 = fTPFile0.getName();
    boolean b13 = fTPFile0.isDirectory();
    fTPFile0.setSize((long)'4');
    long long16 = fTPFile0.getSize();
    java.util.Calendar calendar17 = null;
    fTPFile0.setTimestamp(calendar17);
    java.util.Calendar calendar19 = null;
    fTPFile0.setTimestamp(calendar19);
    long long21 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0 hi!                     -1 null"+ "'", str9.equals("?---------    0 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0 hi!                     -1 null"+ "'", str11.equals("?---------    0 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 52L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 52L);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test120"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    fTPFile0.setUser("hi!");
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                         -1 null");
    boolean b10 = fTPFile0.isUnknown();
    fTPFile0.setHardLinkCount((int)(short)1);
    fTPFile0.setSize((long)' ');
    java.lang.String str15 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0 hi!                     -1 null"+ "'", str9.equals("?---------    0 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test121"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.lang.String str4 = fTPFile0.toFormattedString("hi!");
    int i5 = fTPFile0.getHardLinkCount();
    fTPFile0.setName("");
    boolean b8 = fTPFile0.isFile();
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str10 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test122"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    java.lang.String str6 = fTPFile0.toFormattedString();
    int i7 = fTPFile0.getType();
    fTPFile0.setPermission((int)(byte)1, (int)(short)0, true);
    fTPFile0.setSize(52L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test123"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    int i6 = fTPFile0.getType();
    java.lang.String str7 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test124"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    int i7 = fTPFile0.getType();
    java.lang.String str8 = fTPFile0.getRawListing();
    java.lang.String str9 = fTPFile0.getUser();
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    fTPFile0.setRawListing("?---------    0 hi!                     -1 null");
    fTPFile0.setType((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test125"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    long long2 = fTPFile0.getSize();
    int i3 = fTPFile0.getType();
    boolean b4 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test126"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.lang.String str4 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------    0                         -1 null");
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    int i9 = fTPFile0.getHardLinkCount();
    boolean b10 = fTPFile0.isUnknown();
    java.lang.String str11 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test127"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.toString();
    fTPFile0.setSize((long)(byte)10);
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.getRawListing();
    fTPFile0.setRawListing("?---------    0                          1 ?---------    0 hi!                     -1 null");
    fTPFile0.setHardLinkCount(52);
    java.lang.String str14 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test128"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    int i7 = fTPFile0.getType();
    java.lang.String str8 = fTPFile0.getRawListing();
    java.lang.String str9 = fTPFile0.getUser();
    fTPFile0.setSize((long)(short)10);
    java.lang.String str12 = fTPFile0.getRawListing();
    boolean b13 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test129"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    fTPFile0.setLink("");
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setGroup("hi!");
    fTPFile0.setLink("?---------    0          hi!            -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test130"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    fTPFile0.setLink("");
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setUser("");
    fTPFile0.setLink("?---------    0                         -1 null");
    java.lang.String str12 = fTPFile0.getName();
    long long13 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == (-1L));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test131"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isValid();
    fTPFile0.setLink("?---------    0 hi!                     -1 null");
    long long10 = fTPFile0.getSize();
    fTPFile0.setGroup("?---------    0 hi!                     -1 null");
    int i13 = fTPFile0.getHardLinkCount();
    java.lang.String str14 = fTPFile0.toString();
    java.util.Calendar calendar15 = null;
    fTPFile0.setTimestamp(calendar15);
    boolean b17 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test132"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str6 = fTPFile0.getGroup();
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setUser("");
    boolean b10 = fTPFile0.isDirectory();
    java.lang.String str12 = fTPFile0.toFormattedString("?---------   52                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         -1 null"+ "'", str12.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test133"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.toString();
    fTPFile0.setGroup("?---------    0                         -1 ");
    int i7 = fTPFile0.getType();
    int i8 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test134"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.lang.String str4 = fTPFile0.toFormattedString("hi!");
    int i5 = fTPFile0.getHardLinkCount();
    fTPFile0.setName("");
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    int i10 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test135"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.toString();
    fTPFile0.setSize((long)(byte)10);
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.getRawListing();
    java.lang.String str10 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test136"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    fTPFile0.setLink("");
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setUser("");
    java.lang.String str10 = fTPFile0.toFormattedString();
    int i11 = fTPFile0.getHardLinkCount();
    boolean b12 = fTPFile0.isFile();
    fTPFile0.setRawListing("?---------    0                         -1 d---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 null"+ "'", str10.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test137"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    long long2 = fTPFile0.getSize();
    java.lang.String str3 = fTPFile0.toFormattedString();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setRawListing("?---------    0                         -1 ");
    java.lang.String str7 = fTPFile0.toString();
    java.lang.String str8 = fTPFile0.toString();
    java.lang.String str9 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 "+ "'", str7.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 "+ "'", str8.equals("?---------    0                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test138"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    fTPFile0.setUser("");
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    int i9 = fTPFile0.getHardLinkCount();
    java.lang.String str10 = fTPFile0.getUser();
    long long11 = fTPFile0.getSize();
    int i12 = fTPFile0.getType();
    int i13 = fTPFile0.getHardLinkCount();
    int i14 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test139"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str6 = fTPFile0.getGroup();
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setUser("");
    fTPFile0.setLink("?---------    0 hi!                     -1 null");
    fTPFile0.setType((-1));
    java.util.Calendar calendar14 = fTPFile0.getTimestamp();
    java.lang.String str15 = fTPFile0.getUser();
    fTPFile0.setRawListing("?---------    1 hi!                     -1 hi!");
    java.lang.String str18 = fTPFile0.getUser();
    boolean b19 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test140"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    long long6 = fTPFile0.getSize();
    java.lang.String str7 = fTPFile0.toFormattedString();
    fTPFile0.setSize((long)(byte)1);
    fTPFile0.setHardLinkCount((int)' ');
    java.lang.String str12 = fTPFile0.toString();
    java.lang.String str13 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         -1 null"+ "'", str12.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0                         -1 null"+ "'", str13.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test141"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.lang.String str6 = fTPFile0.toFormattedString();
    java.lang.String str7 = fTPFile0.toString();
    boolean b8 = fTPFile0.isValid();
    java.lang.String str9 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 null"+ "'", str9.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test142"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    long long6 = fTPFile0.getSize();
    java.lang.String str7 = fTPFile0.toFormattedString();
    fTPFile0.setSize((long)(byte)1);
    java.lang.String str10 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test143"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    fTPFile0.setUser("");
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    int i9 = fTPFile0.getHardLinkCount();
    boolean b10 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test144"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str6 = fTPFile0.getGroup();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.toString();
    java.lang.String str10 = fTPFile0.getLink();
    fTPFile0.setLink("?---------    0          ?---------    0                         -1 ?---------    0 hi!                     -1 null       -1 null");
    fTPFile0.setRawListing("?---------  100                         -1 null");
    java.util.Calendar calendar15 = null;
    fTPFile0.setTimestamp(calendar15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 null"+ "'", str9.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test145"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.toString();
    boolean b5 = fTPFile0.isDirectory();
    java.lang.String str6 = fTPFile0.getGroup();
    int i7 = fTPFile0.getType();
    java.lang.String str8 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test146"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setHardLinkCount((int)(short)100);
    fTPFile0.setName("?---------    0                          1 ?---------    0 hi!                     -1 null");
    java.lang.String str9 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                          1 ?---------    0 hi!                     -1 null"+ "'", str9.equals("?---------    0                          1 ?---------    0 hi!                     -1 null"));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test147"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    fTPFile0.setUser("hi!");
    long long8 = fTPFile0.getSize();
    fTPFile0.setName("?---------    0                         -1 ");
    fTPFile0.setGroup("?---------    0                         -1 ?---------    0 hi!                     -1 null");
    fTPFile0.setLink("?---------    0 ?---------    0                         -1 null                10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test148"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    int i2 = fTPFile0.getType();
    fTPFile0.setLink("?---------    0                         -1 null");
    boolean b5 = fTPFile0.isValid();
    fTPFile0.setSize((long)100);
    java.lang.String str8 = fTPFile0.getGroup();
    java.lang.String str10 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setGroup("?---------    0                        100 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                        100 null"+ "'", str10.equals("?---------    0                        100 null"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test149"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isUnknown();
    java.lang.String str8 = fTPFile0.toFormattedString();
    java.lang.String str9 = fTPFile0.toFormattedString();
    boolean b10 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 null"+ "'", str8.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 null"+ "'", str9.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test150"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    fTPFile0.setLink("hi!");
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str9 = fTPFile0.getUser();
    fTPFile0.setHardLinkCount((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test151"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.lang.String str7 = fTPFile0.toFormattedString("?---------    0 hi!                     -1 null");
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str9 = fTPFile0.getRawListing();
    fTPFile0.setRawListing("?---------    0                          1 ?---------    0 hi!                     -1 null");
    long long12 = fTPFile0.getSize();
    fTPFile0.setUser("?---------    0 hi!      ?---------    0                        100 null       -1 null");
    boolean b15 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test152"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    java.lang.String str6 = fTPFile0.toFormattedString();
    java.lang.String str7 = fTPFile0.getUser();
    java.lang.String str9 = fTPFile0.toFormattedString("");
    boolean b10 = fTPFile0.isValid();
    java.lang.String str11 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 null"+ "'", str9.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test153"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    fTPFile0.setUser("hi!");
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                         -1 null");
    boolean b10 = fTPFile0.isUnknown();
    java.lang.String str11 = fTPFile0.toFormattedString();
    fTPFile0.setUser("?---------    0                         -1 null");
    java.lang.String str14 = fTPFile0.getRawListing();
    fTPFile0.setHardLinkCount((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0 hi!                     -1 null"+ "'", str9.equals("?---------    0 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0 hi!                     -1 null"+ "'", str11.equals("?---------    0 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test154"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isFile();
    java.lang.String str8 = fTPFile0.getLink();
    java.lang.String str9 = fTPFile0.toString();
    boolean b10 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test155"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    fTPFile0.setLink("");
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setUser("");
    java.lang.String str10 = fTPFile0.toFormattedString();
    int i11 = fTPFile0.getType();
    java.lang.String str12 = fTPFile0.getLink();
    long long13 = fTPFile0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(1, (int)(byte)-1, true);
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
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 null"+ "'", str10.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == (-1L));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test156"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setHardLinkCount((int)(short)1);
    boolean b7 = fTPFile0.isValid();
    fTPFile0.setSize((long)1);
    java.lang.String str10 = fTPFile0.getUser();
    fTPFile0.setUser("");
    boolean b13 = fTPFile0.isDirectory();
    boolean b14 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test157"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    int i7 = fTPFile0.getType();
    java.lang.String str8 = fTPFile0.getRawListing();
    java.lang.String str9 = fTPFile0.getUser();
    fTPFile0.setSize((long)(short)10);
    java.lang.String str12 = fTPFile0.getRawListing();
    int i13 = fTPFile0.getType();
    java.lang.String str14 = fTPFile0.toString();
    fTPFile0.setUser("?---------    0 ?---------    0                         -1 null                10 null");
    boolean b17 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test158"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str6 = fTPFile0.getGroup();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    fTPFile0.setName("");
    fTPFile0.setName("hi!");
    fTPFile0.setLink("hi!");
    boolean b17 = fTPFile0.hasPermission((int)(byte)1, (int)(byte)0);
    long long18 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == (-1L));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test159"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isFile();
    java.lang.String str8 = fTPFile0.getLink();
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    int i11 = fTPFile0.getHardLinkCount();
    java.lang.String str12 = fTPFile0.toFormattedString();
    java.lang.String str13 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         -1 null"+ "'", str12.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test160"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    long long2 = fTPFile0.getSize();
    java.lang.String str3 = fTPFile0.getName();
    fTPFile0.setGroup("?---------    0                         10 null");
    fTPFile0.setHardLinkCount((int)(short)100);
    java.lang.String str8 = fTPFile0.toString();
    fTPFile0.setName("?---------    0          hi!            -1 ?---------    0                         -1 null");
    fTPFile0.setName("");
    java.lang.String str14 = fTPFile0.toFormattedString("?---------    1 hi!                     -1 null");
    boolean b15 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------  100          ?---------    0                         10 null       -1 "+ "'", str14.equals("?---------  100          ?---------    0                         10 null       -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test161"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isValid();
    fTPFile0.setLink("?---------    0 hi!                     -1 null");
    long long10 = fTPFile0.getSize();
    fTPFile0.setGroup("?---------    0 hi!                     -1 null");
    int i13 = fTPFile0.getHardLinkCount();
    java.lang.String str14 = fTPFile0.toString();
    boolean b15 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test162"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("");
    java.lang.String str6 = fTPFile0.getRawListing();
    fTPFile0.setRawListing("?---------    0                         -1 ?---------    0                         -1 null");
    boolean b9 = fTPFile0.isFile();
    java.lang.String str10 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test163"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.lang.String str7 = fTPFile0.toFormattedString("?---------    0 hi!                     -1 null");
    java.lang.String str9 = fTPFile0.toFormattedString("");
    fTPFile0.setHardLinkCount(10);
    fTPFile0.setHardLinkCount((int)(byte)100);
    boolean b16 = fTPFile0.hasPermission((int)(short)0, 2);
    int i17 = fTPFile0.getHardLinkCount();
    fTPFile0.setLink("?---------    0                         -1 null");
    int i20 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 null"+ "'", str9.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 100);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test164"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    java.lang.String str2 = fTPFile0.toString();
    fTPFile0.setSize((long)(byte)1);
    boolean b5 = fTPFile0.isValid();
    java.lang.String str6 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.getName();
    boolean b8 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test165"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    fTPFile0.setUser("");
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    int i9 = fTPFile0.getType();
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    java.lang.String str11 = fTPFile0.getLink();
    fTPFile0.setUser("?---------    0                         -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test166"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    fTPFile0.setUser("hi!");
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    int i10 = fTPFile0.getType();
    fTPFile0.setName("?---------    0 hi!                     -1 null");
    fTPFile0.setSize((long)'#');
    boolean b15 = fTPFile0.isUnknown();
    fTPFile0.setRawListing("?---------   -1          ?---------    0                         10 null       -1 null");
    boolean b18 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test167"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    fTPFile0.setLink("");
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setSize((long)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test168"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str6 = fTPFile0.getGroup();
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setUser("");
    fTPFile0.setLink("?---------    0 hi!                     -1 null");
    fTPFile0.setType((-1));
    java.util.Calendar calendar14 = fTPFile0.getTimestamp();
    java.util.Calendar calendar15 = null;
    fTPFile0.setTimestamp(calendar15);
    boolean b17 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test169"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setHardLinkCount((int)(short)1);
    boolean b7 = fTPFile0.isValid();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    fTPFile0.setName("hi!");
    boolean b12 = fTPFile0.isDirectory();
    boolean b13 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test170"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.toString();
    fTPFile0.setSize((long)(byte)10);
    java.lang.String str7 = fTPFile0.getName();
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount((int)(short)100);
    boolean b12 = fTPFile0.isFile();
    int i13 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test171"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    int i7 = fTPFile0.getType();
    java.lang.String str8 = fTPFile0.getRawListing();
    fTPFile0.setName("hi!");
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    fTPFile0.setUser("");
    fTPFile0.setRawListing("?---------   -1          ?---------    0                         10 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test172"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    fTPFile0.setLink("");
    java.lang.String str6 = fTPFile0.getGroup();
    boolean b7 = fTPFile0.isFile();
    long long8 = fTPFile0.getSize();
    boolean b9 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test173"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("");
    java.lang.String str6 = fTPFile0.getName();
    java.lang.String str7 = fTPFile0.toString();
    boolean b8 = fTPFile0.isUnknown();
    fTPFile0.setType((int)(byte)100);
    java.lang.String str11 = fTPFile0.getGroup();
    java.lang.String str12 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test174"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getName();
    java.lang.String str6 = fTPFile0.toFormattedString();
    java.lang.String str7 = fTPFile0.getUser();
    java.lang.String str9 = fTPFile0.toFormattedString("");
    long long10 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 null"+ "'", str9.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == (-1L));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test175"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isValid();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    int i7 = fTPFile0.getType();
    java.lang.String str8 = fTPFile0.getRawListing();
    fTPFile0.setName("hi!");
    long long11 = fTPFile0.getSize();
    long long12 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-1L));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test176"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    long long6 = fTPFile0.getSize();
    java.lang.String str7 = fTPFile0.getGroup();
    java.lang.String str9 = fTPFile0.toFormattedString("");
    fTPFile0.setHardLinkCount(100);
    boolean b12 = fTPFile0.isUnknown();
    int i13 = fTPFile0.getHardLinkCount();
    boolean b16 = fTPFile0.hasPermission(0, (int)(short)1);
    java.lang.String str17 = fTPFile0.getName();
    java.util.Calendar calendar18 = null;
    fTPFile0.setTimestamp(calendar18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 null"+ "'", str9.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test177"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setHardLinkCount((int)(short)1);
    boolean b7 = fTPFile0.isValid();
    fTPFile0.setSize((long)1);
    boolean b12 = fTPFile0.hasPermission((int)(short)1, (int)(byte)1);
    long long13 = fTPFile0.getSize();
    java.lang.String str14 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test178"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setLink("");
    int i3 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str6 = fTPFile0.getGroup();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    fTPFile0.setName("");
    fTPFile0.setName("hi!");
    fTPFile0.setLink("hi!");
    java.lang.String str15 = fTPFile0.getRawListing();
    java.lang.String str16 = fTPFile0.getLink();
    boolean b17 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    0                         -1 null"+ "'", str15.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

}
