package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_it0_livello1_it1_livello2_it3_livello3 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    int i0 = FTPFile.READ_PERMISSION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    int i0 = FTPFile.WORLD_ACCESS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    int i0 = FTPFile.DIRECTORY_TYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    int i0 = FTPFile.GROUP_ACCESS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    int i0 = FTPFile.WRITE_PERMISSION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    int i0 = FTPFile.USER_ACCESS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    FTPFile fTPFile0 = new FTPFile();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(short)10, 0, true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    int i0 = FTPFile.UNKNOWN_TYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 3);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    int i0 = FTPFile.EXECUTE_PERMISSION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(short)100, (int)'a', false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    fTPFile0.setUser("");
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = fTPFile0.hasPermission(100, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = fTPFile0.hasPermission((int)' ', (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    int i0 = FTPFile.FILE_TYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    boolean b5 = fTPFile0.isDirectory();
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = fTPFile0.hasPermission((int)(short)-1, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    boolean b5 = fTPFile0.isValid();
    java.lang.String str6 = fTPFile0.getGroup();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)100, (int)(short)1, false);
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
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    int i0 = FTPFile.SYMBOLIC_LINK_TYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    boolean b5 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)'4', (int)(short)-1, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)'#');
    java.lang.String str7 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setRawListing("");
    fTPFile0.setSize((long)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    fTPFile0.setName("hi!");
    java.lang.String str6 = fTPFile0.toString();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(100, (int)(byte)10, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    fTPFile0.setName("hi!");
    java.lang.String str6 = fTPFile0.toString();
    fTPFile0.setGroup("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    java.lang.String str5 = fTPFile0.getRawListing();
    fTPFile0.setType((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    boolean b3 = fTPFile0.isSymbolicLink();
    fTPFile0.setPermission((int)(byte)0, 1, false);
    java.lang.String str8 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = fTPFile0.hasPermission(2, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    boolean b5 = fTPFile0.isFile();
    java.lang.String str7 = fTPFile0.toFormattedString("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    boolean b3 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    java.lang.String str4 = fTPFile0.toString();
    fTPFile0.setType((int)(byte)1);
    fTPFile0.setGroup("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setUser("");
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = fTPFile0.hasPermission((int)(short)1, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    fTPFile0.setUser("?---------  100                         -1 hi!");
    java.lang.String str7 = fTPFile0.toFormattedString("?---------  100                         -1 hi!");
    java.lang.String str8 = fTPFile0.toString();
    java.lang.String str9 = fTPFile0.getName();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0 ?---------  100                         -1 hi!                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0 ?---------  100                         -1 hi!                -1 null"+ "'", str7.equals("?---------    0 ?---------  100                         -1 hi!                -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0 ?---------  100                         -1 hi!                -1 null"+ "'", str11.equals("?---------    0 ?---------  100                         -1 hi!                -1 null"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isDirectory();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    fTPFile0.setGroup("hi!");
    fTPFile0.setName("");
    fTPFile0.setLink("?---------  100                         -1 hi!");
    java.lang.String str13 = fTPFile0.getGroup();
    java.lang.String str14 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------  100                         -1 hi!"+ "'", str14.equals("?---------  100                         -1 hi!"));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    boolean b5 = fTPFile0.isDirectory();
    fTPFile0.setSize((long)(-1));
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str9 = fTPFile0.getGroup();
    fTPFile0.setLink("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount(1);
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    boolean b5 = fTPFile0.isDirectory();
    fTPFile0.setSize((long)(-1));
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str9 = fTPFile0.getGroup();
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = fTPFile0.hasPermission((int)(byte)0, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    boolean b5 = fTPFile0.isValid();
    java.lang.String str6 = fTPFile0.getGroup();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = fTPFile0.hasPermission((int)(short)0, 3);
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
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.getUser();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    java.lang.String str5 = fTPFile0.getRawListing();
    java.lang.String str6 = fTPFile0.toString();
    fTPFile0.setName("?---------   10                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.getUser();
    fTPFile0.setGroup("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.toString();
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = fTPFile0.hasPermission((int)(short)10, (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setType((int)'a');
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)-1, (int)(short)100, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)'#');
    java.lang.String str7 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    boolean b3 = fTPFile0.isSymbolicLink();
    fTPFile0.setPermission((int)(byte)0, 1, false);
    int i8 = fTPFile0.getType();
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    fTPFile0.setRawListing("");
    java.lang.String str9 = fTPFile0.getName();
    java.lang.String str10 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    boolean b5 = fTPFile0.isValid();
    java.lang.String str6 = fTPFile0.getGroup();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    fTPFile0.setName("");
    int i4 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    boolean b5 = fTPFile0.isDirectory();
    fTPFile0.setSize((long)(-1));
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str9 = fTPFile0.getGroup();
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    fTPFile0.setRawListing("");
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    int i11 = fTPFile0.getType();
    java.lang.String str13 = fTPFile0.toFormattedString("?---------    0 ?---------  100                         -1 hi!                -1 null");
    java.lang.String str14 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------   10                         -1 null"+ "'", str13.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.toString();
    boolean b8 = fTPFile0.isValid();
    boolean b9 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    java.lang.String str5 = fTPFile0.toFormattedString();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)100, (int)(short)-1, false);
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
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------  100                         -1 null"+ "'", str5.equals("?---------  100                         -1 null"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    fTPFile0.setUser("?---------  100                         -1 hi!");
    java.lang.String str7 = fTPFile0.toFormattedString("?---------  100                         -1 hi!");
    java.lang.String str8 = fTPFile0.toString();
    int i9 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0 ?---------  100                         -1 hi!                -1 null"+ "'", str7.equals("?---------    0 ?---------  100                         -1 hi!                -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    fTPFile0.setUser("");
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.getName();
    boolean b10 = fTPFile0.isValid();
    java.lang.String str12 = fTPFile0.toFormattedString("?---------    0 ?---------  100                         -1 hi!                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------  100                         -1 null"+ "'", str12.equals("?---------  100                         -1 null"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isUnknown();
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = fTPFile0.hasPermission((int)' ', (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    boolean b3 = fTPFile0.isSymbolicLink();
    java.lang.String str4 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = fTPFile0.hasPermission(0, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    fTPFile0.setUser("");
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.getName();
    fTPFile0.setType((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    boolean b3 = fTPFile0.isValid();
    fTPFile0.setLink("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    boolean b5 = fTPFile0.isUnknown();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    long long5 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    java.lang.String str5 = fTPFile0.getRawListing();
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    fTPFile0.setRawListing("");
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)-1, (int)(short)0, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    boolean b5 = fTPFile0.isDirectory();
    fTPFile0.setSize((long)(-1));
    fTPFile0.setType((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setUser("");
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)'#');
    boolean b7 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("?---------   10                         -1 null");
    boolean b10 = fTPFile0.isSymbolicLink();
    fTPFile0.setRawListing("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    java.lang.String str4 = fTPFile0.toString();
    fTPFile0.setType((int)(byte)1);
    java.lang.String str7 = fTPFile0.getGroup();
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "d---------    0                         -1 null"+ "'", str9.equals("d---------    0                         -1 null"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = fTPFile0.hasPermission(3, 2);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.toString();
    java.lang.String str10 = fTPFile0.getRawListing();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(10, 1, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isDirectory();
    boolean b5 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getRawListing();
    fTPFile0.setName("?---------    0 ?---------  100                         -1 hi!                -1 null");
    java.lang.String str8 = fTPFile0.getRawListing();
    boolean b9 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    fTPFile0.setSize((long)0);
    boolean b6 = fTPFile0.isValid();
    java.lang.String str7 = fTPFile0.toString();
    java.lang.String str8 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                          0 null"+ "'", str8.equals("?---------    0                          0 null"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = fTPFile0.hasPermission(0, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    boolean b5 = fTPFile0.isValid();
    java.lang.String str6 = fTPFile0.getGroup();
    java.lang.String str7 = fTPFile0.getRawListing();
    fTPFile0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    java.lang.String str5 = fTPFile0.getRawListing();
    java.lang.String str6 = fTPFile0.toString();
    fTPFile0.setUser("?---------  100                         -1 hi!");
    boolean b9 = fTPFile0.isValid();
    fTPFile0.setRawListing("?---------    0 ?---------  100                         -1 hi!                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)'#');
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str9 = fTPFile0.getLink();
    boolean b10 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)'#');
    boolean b7 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("?---------   10                         -1 null");
    fTPFile0.setUser("?---------   10                         -1 null");
    fTPFile0.setHardLinkCount(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    boolean b5 = fTPFile0.isDirectory();
    fTPFile0.setSize((long)(-1));
    boolean b8 = fTPFile0.isDirectory();
    fTPFile0.setLink("?---------  100                         -1 hi!");
    boolean b11 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    fTPFile0.setUser("?---------  100                         -1 hi!");
    java.lang.String str6 = fTPFile0.getLink();
    boolean b7 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setRawListing("?---------  100                         -1 hi!");
    boolean b5 = fTPFile0.isUnknown();
    java.lang.String str6 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    fTPFile0.setGroup("hi!");
    fTPFile0.setName("");
    fTPFile0.setLink("?---------  100                         -1 hi!");
    java.lang.String str13 = fTPFile0.getGroup();
    int i14 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    fTPFile0.setSize((long)0);
    java.lang.String str6 = fTPFile0.getRawListing();
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = fTPFile0.hasPermission((int)(byte)1, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    fTPFile0.setName("hi!");
    java.lang.String str6 = fTPFile0.toString();
    fTPFile0.setType(100);
    fTPFile0.setName("?---------  100                         -1 hi!");
    java.lang.String str11 = fTPFile0.getLink();
    java.lang.String str12 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         -1 ?---------  100                         -1 hi!"+ "'", str12.equals("?---------    0                         -1 ?---------  100                         -1 hi!"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)10, (int)' ', false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    fTPFile0.setRawListing("");
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    int i11 = fTPFile0.getType();
    java.lang.String str13 = fTPFile0.toFormattedString("?---------    0 ?---------  100                         -1 hi!                -1 null");
    boolean b14 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------   10                         -1 null"+ "'", str13.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)'#');
    java.lang.String str7 = fTPFile0.getUser();
    java.lang.String str8 = fTPFile0.getGroup();
    java.lang.String str9 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.toString();
    java.lang.String str8 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    fTPFile0.setGroup("hi!");
    fTPFile0.setName("");
    fTPFile0.setLink("?---------  100                         -1 hi!");
    java.lang.String str13 = fTPFile0.getGroup();
    java.lang.String str14 = fTPFile0.getName();
    java.util.Calendar calendar15 = null;
    fTPFile0.setTimestamp(calendar15);
    java.lang.String str17 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    java.lang.String str5 = fTPFile0.getRawListing();
    java.lang.String str6 = fTPFile0.toString();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    fTPFile0.setSize((long)'#');
    fTPFile0.setGroup("?---------  100                         -1 hi!");
    fTPFile0.setUser("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    fTPFile0.setSize((long)0);
    fTPFile0.setSize((long)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    fTPFile0.setRawListing("");
    java.lang.String str9 = fTPFile0.getName();
    java.lang.String str10 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    boolean b5 = fTPFile0.isFile();
    boolean b6 = fTPFile0.isValid();
    int i7 = fTPFile0.getType();
    fTPFile0.setLink("?---------   35                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)'#');
    fTPFile0.setHardLinkCount((int)(short)10);
    boolean b9 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    fTPFile0.setRawListing("");
    java.lang.String str9 = fTPFile0.getName();
    java.lang.String str10 = fTPFile0.getUser();
    fTPFile0.setHardLinkCount((int)(short)0);
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str15 = fTPFile0.toFormattedString();
    java.util.Calendar calendar16 = null;
    fTPFile0.setTimestamp(calendar16);
    java.lang.String str18 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------   35                         -1 null"+ "'", str15.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setUser("");
    fTPFile0.setLink("?---------  100                         -1 hi!");
    boolean b10 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.getUser();
    fTPFile0.setSize((long)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    boolean b5 = fTPFile0.isValid();
    int i6 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)'#');
    boolean b7 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("?---------   10                         -1 null");
    fTPFile0.setHardLinkCount((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isDirectory();
    int i4 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    boolean b6 = fTPFile0.isSymbolicLink();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(100, (int)(byte)10, true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setType((int)'a');
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    java.lang.String str9 = fTPFile0.getRawListing();
    java.lang.String str10 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    java.lang.String str5 = fTPFile0.getRawListing();
    java.lang.String str6 = fTPFile0.toString();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    boolean b9 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setHardLinkCount((-1));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    boolean b5 = fTPFile0.isValid();
    boolean b6 = fTPFile0.isUnknown();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    java.lang.String str4 = fTPFile0.toString();
    int i5 = fTPFile0.getHardLinkCount();
    fTPFile0.setType(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    boolean b5 = fTPFile0.isFile();
    boolean b6 = fTPFile0.isValid();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(short)1, (int)'#', true);
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
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setUser("");
    int i7 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    boolean b6 = fTPFile0.isSymbolicLink();
    java.lang.String str7 = fTPFile0.getUser();
    fTPFile0.setType((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    fTPFile0.setGroup("hi!");
    fTPFile0.setName("");
    fTPFile0.setLink("?---------  100                         -1 hi!");
    boolean b13 = fTPFile0.isUnknown();
    int i14 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    fTPFile0.setGroup("hi!");
    fTPFile0.setName("");
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    fTPFile0.setHardLinkCount(10);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    boolean b6 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setType((int)'a');
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    java.lang.String str9 = fTPFile0.getRawListing();
    fTPFile0.setRawListing("?---------  100                         -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setUser("?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    boolean b5 = fTPFile0.isDirectory();
    fTPFile0.setSize((long)(-1));
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str10 = fTPFile0.toFormattedString("?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 null"+ "'", str10.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    fTPFile0.setGroup("hi!");
    fTPFile0.setName("");
    fTPFile0.setLink("?---------  100                         -1 hi!");
    fTPFile0.setHardLinkCount((int)'4');
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(1, 3, true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setUser("");
    fTPFile0.setSize((long)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    boolean b5 = fTPFile0.isFile();
    boolean b6 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setType((int)(byte)1);
    boolean b7 = fTPFile0.isDirectory();
    fTPFile0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    fTPFile0.setUser("");
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.getName();
    boolean b10 = fTPFile0.isValid();
    fTPFile0.setRawListing("?---------  100 hi!                     -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)'#');
    fTPFile0.setHardLinkCount((int)(short)10);
    fTPFile0.setRawListing("?---------  100                         -1 null");
    boolean b11 = fTPFile0.isValid();
    fTPFile0.setUser("?---------   35                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    java.lang.String str4 = fTPFile0.toString();
    fTPFile0.setUser("?---------    0                          0 null");
    java.lang.String str8 = fTPFile0.toFormattedString("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0 ?---------    0                          0 null                -1 null"+ "'", str8.equals("?---------    0 ?---------    0                          0 null                -1 null"));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    int i6 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    fTPFile0.setUser("");
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.getName();
    boolean b10 = fTPFile0.isValid();
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    java.util.Calendar calendar12 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar12);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setRawListing("");
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    fTPFile0.setRawListing("?---------    0 ?---------  100                         -1 hi!                -1 null");
    java.util.Calendar calendar12 = fTPFile0.getTimestamp();
    java.lang.String str13 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    boolean b5 = fTPFile0.isFile();
    boolean b6 = fTPFile0.isDirectory();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(short)0, (int)(byte)10, false);
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

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    java.lang.String str5 = fTPFile0.toFormattedString();
    java.lang.String str6 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------  100                         -1 null"+ "'", str5.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    java.lang.String str5 = fTPFile0.getUser();
    java.lang.String str6 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------  100                         -1 null"+ "'", str6.equals("?---------  100                         -1 null"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    java.lang.String str5 = fTPFile0.getRawListing();
    java.lang.String str6 = fTPFile0.toString();
    fTPFile0.setUser("?---------  100                         -1 hi!");
    fTPFile0.setSize(10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    java.lang.String str4 = fTPFile0.toString();
    boolean b5 = fTPFile0.isSymbolicLink();
    boolean b6 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    fTPFile0.setGroup("hi!");
    fTPFile0.setName("");
    boolean b11 = fTPFile0.isUnknown();
    java.lang.String str12 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    java.lang.String str8 = fTPFile0.toFormattedString("");
    fTPFile0.setLink("?---------  100                         -1 null");
    boolean b11 = fTPFile0.isDirectory();
    boolean b12 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------  100                         -1 hi!"+ "'", str8.equals("?---------  100                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    boolean b6 = fTPFile0.isSymbolicLink();
    boolean b7 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    fTPFile0.setUser("?---------  100                         -1 hi!");
    java.lang.String str7 = fTPFile0.toFormattedString("?---------  100                         -1 hi!");
    java.lang.String str8 = fTPFile0.toString();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0 ?---------  100                         -1 hi!                -1 null"+ "'", str7.equals("?---------    0 ?---------  100                         -1 hi!                -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.getUser();
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = fTPFile0.hasPermission(0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)'#');
    fTPFile0.setHardLinkCount((int)(short)10);
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    fTPFile0.setSize((long)(short)-1);
    fTPFile0.setType((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    fTPFile0.setGroup("hi!");
    fTPFile0.setName("");
    fTPFile0.setLink("?---------  100                         -1 hi!");
    boolean b13 = fTPFile0.isUnknown();
    boolean b14 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setRawListing("");
    fTPFile0.setGroup("hi!");
    fTPFile0.setRawListing("?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    boolean b3 = fTPFile0.isDirectory();
    java.lang.String str4 = fTPFile0.getUser();
    fTPFile0.setHardLinkCount((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount(1);
    fTPFile0.setName("?---------    0 ?---------  100                         -1 hi!                -1 null");
    java.lang.String str10 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    boolean b5 = fTPFile0.isDirectory();
    fTPFile0.setSize((long)(-1));
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str10 = fTPFile0.getGroup();
    boolean b11 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    fTPFile0.setGroup("hi!");
    fTPFile0.setName("");
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    fTPFile0.setGroup("?---------    0 ?---------  100                         -1 hi!                -1 null");
    fTPFile0.setUser("");

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setUser("");
    boolean b7 = fTPFile0.isSymbolicLink();
    long long8 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    fTPFile0.setUser("");
    boolean b8 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("hi!");
    java.lang.String str11 = fTPFile0.getName();
    boolean b12 = fTPFile0.isValid();
    java.lang.String str13 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setType((int)'a');
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    java.lang.String str10 = fTPFile0.getLink();
    java.lang.String str11 = fTPFile0.toFormattedString();
    boolean b12 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                         -1 null"+ "'", str11.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    fTPFile0.setSize((long)0);
    java.lang.String str6 = fTPFile0.getRawListing();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)'#');
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str9 = fTPFile0.getLink();
    fTPFile0.setName("hi!");
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = fTPFile0.hasPermission((int)' ', (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    fTPFile0.setUser("?---------  100                         -1 hi!");
    java.lang.String str7 = fTPFile0.toFormattedString("?---------  100                         -1 hi!");
    java.lang.String str8 = fTPFile0.toString();
    java.lang.String str9 = fTPFile0.getName();
    fTPFile0.setType((int)(byte)0);
    fTPFile0.setName("?---------   35                         -1 null");
    fTPFile0.setHardLinkCount(3);
    java.util.Calendar calendar16 = null;
    fTPFile0.setTimestamp(calendar16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0 ?---------  100                         -1 hi!                -1 null"+ "'", str7.equals("?---------    0 ?---------  100                         -1 hi!                -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setType((int)(byte)1);
    int i7 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    fTPFile0.setName("hi!");
    fTPFile0.setRawListing("hi!");
    fTPFile0.setName("?---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.toString();
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    fTPFile0.setRawListing("?---------  100                         -1 hi!");
    boolean b14 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    boolean b5 = fTPFile0.isDirectory();
    fTPFile0.setSize((long)(-1));
    boolean b8 = fTPFile0.isDirectory();
    fTPFile0.setUser("?---------    0                         -1 ?---------  100                         -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)'#');
    fTPFile0.setHardLinkCount((int)(short)10);
    fTPFile0.setRawListing("?---------  100                         -1 null");
    long long11 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 35L);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    fTPFile0.setName("hi!");
    java.lang.String str6 = fTPFile0.toString();
    fTPFile0.setType(100);
    fTPFile0.setName("?---------  100                         -1 hi!");
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    java.lang.String str13 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    fTPFile0.setUser("");
    boolean b8 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("hi!");
    java.lang.String str11 = fTPFile0.getName();
    int i12 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    fTPFile0.setName("hi!");
    java.lang.String str6 = fTPFile0.toString();
    fTPFile0.setType(100);
    boolean b9 = fTPFile0.isSymbolicLink();
    java.lang.String str10 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    boolean b5 = fTPFile0.isValid();
    java.lang.String str6 = fTPFile0.getGroup();
    java.lang.String str7 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    fTPFile0.setGroup("hi!");
    java.lang.String str9 = fTPFile0.getLink();
    java.lang.String str10 = fTPFile0.toFormattedString();
    boolean b11 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------  100          hi!            -1 hi!"+ "'", str10.equals("?---------  100          hi!            -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    fTPFile0.setRawListing("");
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    fTPFile0.setPermission((int)(short)0, 0, false);
    boolean b16 = fTPFile0.isFile();
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = fTPFile0.hasPermission((int)'#', 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    java.lang.String str4 = fTPFile0.toString();
    boolean b5 = fTPFile0.isSymbolicLink();
    boolean b6 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str8 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    java.lang.String str5 = fTPFile0.getRawListing();
    java.lang.String str6 = fTPFile0.toString();
    fTPFile0.setUser("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    java.lang.String str4 = fTPFile0.toString();
    int i5 = fTPFile0.getHardLinkCount();
    java.lang.String str6 = fTPFile0.getRawListing();
    fTPFile0.setGroup("?---------   10                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setUser("");
    int i8 = fTPFile0.getHardLinkCount();
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    boolean b11 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    java.lang.String str8 = fTPFile0.toFormattedString("");
    fTPFile0.setLink("?---------  100                         -1 null");
    boolean b11 = fTPFile0.isDirectory();
    long long12 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------  100                         -1 hi!"+ "'", str8.equals("?---------  100                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-1L));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.getUser();
    boolean b8 = fTPFile0.isDirectory();
    int i9 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    java.lang.String str8 = fTPFile0.toFormattedString("");
    boolean b9 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------  100                         -1 hi!"+ "'", str8.equals("?---------  100                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    java.lang.String str5 = fTPFile0.getRawListing();
    java.lang.String str6 = fTPFile0.toString();
    boolean b7 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    java.lang.String str4 = fTPFile0.toString();
    boolean b5 = fTPFile0.isSymbolicLink();
    long long6 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    fTPFile0.setSize((long)0);
    java.lang.String str6 = fTPFile0.getRawListing();
    int i7 = fTPFile0.getHardLinkCount();
    int i8 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    boolean b6 = fTPFile0.isSymbolicLink();
    java.lang.String str7 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isDirectory();
    java.lang.String str5 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    java.lang.String str7 = fTPFile0.getGroup();
    java.lang.String str8 = fTPFile0.getGroup();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)10, (int)(short)-1, true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    java.lang.String str4 = fTPFile0.toString();
    fTPFile0.setType((int)(byte)1);
    long long7 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    fTPFile0.setName("hi!");
    boolean b6 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("?---------    0                         -1 null");
    boolean b9 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    fTPFile0.setUser("");
    boolean b8 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("hi!");
    java.lang.String str12 = fTPFile0.toFormattedString("?---------    0 ?---------  100                         -1 hi!                -1 null");
    fTPFile0.setLink("?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------  100 hi!                     -1 null"+ "'", str12.equals("?---------  100 hi!                     -1 null"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.toString();
    fTPFile0.setType(100);
    boolean b11 = fTPFile0.hasPermission((int)(short)1, 1);
    fTPFile0.setUser("?---------  100                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    fTPFile0.setUser("");
    boolean b8 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("hi!");
    java.lang.String str12 = fTPFile0.toFormattedString("?---------    0 ?---------  100                         -1 hi!                -1 null");
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = fTPFile0.hasPermission((int)(short)0, (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------  100 hi!                     -1 null"+ "'", str12.equals("?---------  100 hi!                     -1 null"));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    fTPFile0.setName("hi!");
    boolean b6 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("?---------   35                         -1 null");
    fTPFile0.setRawListing("?---------    0 ?---------  100                         -1 hi!                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setRawListing("?---------  100                         -1 hi!");
    boolean b5 = fTPFile0.isUnknown();
    fTPFile0.setType(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    boolean b5 = fTPFile0.isUnknown();
    boolean b6 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.toString();
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    fTPFile0.setSize((long)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    boolean b5 = fTPFile0.isDirectory();
    fTPFile0.setSize((long)(-1));
    boolean b8 = fTPFile0.isDirectory();
    boolean b9 = fTPFile0.isValid();
    fTPFile0.setSize((long)2);
    java.lang.String str12 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    java.lang.String str4 = fTPFile0.toString();
    fTPFile0.setType((int)(byte)1);
    java.lang.String str8 = fTPFile0.toFormattedString("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "d---------    0                         -1 null"+ "'", str8.equals("d---------    0                         -1 null"));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    boolean b5 = fTPFile0.isFile();
    boolean b6 = fTPFile0.isValid();
    int i7 = fTPFile0.getType();
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                          0 null");
    boolean b10 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 null"+ "'", str9.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    java.lang.String str7 = fTPFile0.getGroup();
    int i8 = fTPFile0.getHardLinkCount();
    java.lang.String str9 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.toString();
    boolean b8 = fTPFile0.isValid();
    fTPFile0.setPermission(0, 2, true);
    fTPFile0.setSize((long)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    fTPFile0.setGroup("hi!");
    fTPFile0.setName("");
    fTPFile0.setLink("?---------  100                         -1 hi!");
    java.lang.String str13 = fTPFile0.getGroup();
    java.lang.String str14 = fTPFile0.getName();
    java.lang.String str15 = fTPFile0.toFormattedString();
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = fTPFile0.hasPermission(2, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------  100          hi!            -1 "+ "'", str15.equals("?---------  100          hi!            -1 "));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setUser("");
    boolean b8 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    fTPFile0.setGroup("hi!");
    java.lang.String str9 = fTPFile0.getLink();
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    boolean b11 = fTPFile0.isDirectory();
    boolean b12 = fTPFile0.isFile();
    fTPFile0.setSize(35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    java.lang.String str4 = fTPFile0.toString();
    int i5 = fTPFile0.getHardLinkCount();
    java.lang.String str6 = fTPFile0.getRawListing();
    java.lang.String str7 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.toString();
    boolean b8 = fTPFile0.isValid();
    fTPFile0.setPermission(0, 2, true);
    fTPFile0.setLink("?---------  100 hi!                     -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    fTPFile0.setGroup("hi!");
    java.lang.String str9 = fTPFile0.getLink();
    fTPFile0.setGroup("?---------  100                         -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    java.lang.String str7 = fTPFile0.getGroup();
    int i8 = fTPFile0.getHardLinkCount();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)-1, (int)(short)10, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    fTPFile0.setRawListing("");
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    boolean b11 = fTPFile0.isValid();
    fTPFile0.setUser("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    fTPFile0.setRawListing("");
    java.lang.String str9 = fTPFile0.getName();
    java.lang.String str10 = fTPFile0.getUser();
    fTPFile0.setHardLinkCount((int)(short)0);
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str15 = fTPFile0.toFormattedString();
    java.util.Calendar calendar16 = null;
    fTPFile0.setTimestamp(calendar16);
    boolean b18 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------   35                         -1 null"+ "'", str15.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    boolean b5 = fTPFile0.isDirectory();
    fTPFile0.setSize((long)(-1));
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str10 = fTPFile0.getGroup();
    int i11 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    java.lang.String str8 = fTPFile0.toFormattedString("");
    boolean b9 = fTPFile0.isValid();
    java.lang.String str10 = fTPFile0.getName();
    fTPFile0.setLink("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------  100                         -1 hi!"+ "'", str8.equals("?---------  100                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setUser("");
    fTPFile0.setLink("?---------  100                         -1 hi!");
    fTPFile0.setSize((long)(byte)-1);
    long long12 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-1L));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    boolean b5 = fTPFile0.isFile();
    boolean b6 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)'#');
    fTPFile0.setHardLinkCount((int)(short)10);
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    java.lang.String str11 = fTPFile0.toFormattedString();
    int i12 = fTPFile0.getType();
    java.lang.String str13 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------   10                         35 null"+ "'", str11.equals("?---------   10                         35 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount(1);
    long long8 = fTPFile0.getSize();
    java.lang.String str9 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    fTPFile0.setUser("");
    boolean b8 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("hi!");
    java.lang.String str11 = fTPFile0.getName();
    boolean b12 = fTPFile0.isValid();
    fTPFile0.setSize(0L);
    java.lang.String str16 = fTPFile0.toFormattedString("?---------  100 hi!                     -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "?---------  100 hi!                      0 null"+ "'", str16.equals("?---------  100 hi!                      0 null"));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    fTPFile0.setUser("?---------  100                         -1 hi!");
    java.lang.String str7 = fTPFile0.toFormattedString("?---------  100                         -1 hi!");
    java.lang.String str8 = fTPFile0.toString();
    java.lang.String str9 = fTPFile0.getName();
    fTPFile0.setType((int)(byte)0);
    fTPFile0.setName("?---------   35                         -1 null");
    java.lang.String str14 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0 ?---------  100                         -1 hi!                -1 null"+ "'", str7.equals("?---------    0 ?---------  100                         -1 hi!                -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    java.lang.String str5 = fTPFile0.getGroup();
    fTPFile0.setName("hi!");
    fTPFile0.setSize((long)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.toString();
    fTPFile0.setType(100);
    boolean b11 = fTPFile0.hasPermission((int)(short)1, 1);
    fTPFile0.setRawListing("?---------    0                          0 null");
    boolean b14 = fTPFile0.isFile();
    boolean b15 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    boolean b5 = fTPFile0.isDirectory();
    fTPFile0.setSize((long)(-1));
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str10 = fTPFile0.getGroup();
    boolean b13 = fTPFile0.hasPermission((int)(byte)0, 1);
    fTPFile0.setRawListing("?---------   35                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    boolean b6 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.toFormattedString("?---------   10                         35 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------  100                         -1 null"+ "'", str8.equals("?---------  100                         -1 null"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    fTPFile0.setSize((long)0);
    java.lang.String str6 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                          0 null"+ "'", str6.equals("?---------    0                          0 null"));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    java.lang.String str5 = fTPFile0.toString();
    int i6 = fTPFile0.getType();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    java.lang.String str4 = fTPFile0.toString();
    boolean b5 = fTPFile0.isSymbolicLink();
    fTPFile0.setLink("?---------  100                         -1 hi!");
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setType((int)'a');
    java.lang.String str8 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.toString();
    boolean b8 = fTPFile0.isValid();
    fTPFile0.setPermission(0, 2, true);
    boolean b13 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    java.lang.String str7 = fTPFile0.getGroup();
    java.lang.String str8 = fTPFile0.getGroup();
    int i9 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    fTPFile0.setName("hi!");
    java.lang.String str6 = fTPFile0.toString();
    fTPFile0.setType(100);
    fTPFile0.setName("?---------  100                         -1 hi!");
    fTPFile0.setName("?---------  100                         -1 null");
    int i13 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str6 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.toString();
    java.lang.String str10 = fTPFile0.getRawListing();
    fTPFile0.setSize((long)' ');
    boolean b13 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.toString();
    fTPFile0.setType(100);
    fTPFile0.setType((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    boolean b5 = fTPFile0.isValid();
    java.lang.String str6 = fTPFile0.getGroup();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
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
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    fTPFile0.setRawListing("");
    java.lang.String str9 = fTPFile0.getName();
    java.lang.String str10 = fTPFile0.getUser();
    fTPFile0.setUser("hi!");
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = fTPFile0.hasPermission(1, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    java.lang.String str8 = fTPFile0.toFormattedString("");
    boolean b9 = fTPFile0.isValid();
    java.lang.String str10 = fTPFile0.getName();
    java.lang.String str11 = fTPFile0.toFormattedString();
    java.lang.String str12 = fTPFile0.getUser();
    java.lang.String str13 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------  100                         -1 hi!"+ "'", str8.equals("?---------  100                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------  100                         -1 hi!"+ "'", str11.equals("?---------  100                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    java.lang.String str8 = fTPFile0.toFormattedString("");
    boolean b9 = fTPFile0.isValid();
    java.lang.String str10 = fTPFile0.getName();
    boolean b11 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------  100                         -1 hi!"+ "'", str8.equals("?---------  100                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str3 = fTPFile0.toString();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.lang.String str6 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)'#');
    java.lang.String str7 = fTPFile0.getUser();
    boolean b8 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    boolean b3 = fTPFile0.isSymbolicLink();
    boolean b4 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    boolean b5 = fTPFile0.isDirectory();
    fTPFile0.setSize((long)(-1));
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str10 = fTPFile0.getGroup();
    boolean b13 = fTPFile0.hasPermission((int)(byte)0, 1);
    java.lang.String str14 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setRawListing("");
    fTPFile0.setGroup("hi!");
    fTPFile0.setName("");
    java.util.Calendar calendar12 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar12);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    fTPFile0.setUser("");
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.getName();
    boolean b10 = fTPFile0.isDirectory();
    java.lang.String str11 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setRawListing("");
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    fTPFile0.setRawListing("?---------    0 ?---------  100                         -1 hi!                -1 null");
    java.util.Calendar calendar12 = fTPFile0.getTimestamp();
    long long13 = fTPFile0.getSize();
    java.lang.String str15 = fTPFile0.toFormattedString("d---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    0                         -1 null"+ "'", str15.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    boolean b5 = fTPFile0.isDirectory();
    fTPFile0.setSize((long)(-1));
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str9 = fTPFile0.getGroup();
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------  100          hi!            -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setHardLinkCount(2);
    fTPFile0.setGroup("?---------    0                          0 null");
    boolean b7 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)'#');
    java.lang.String str7 = fTPFile0.getUser();
    java.lang.String str8 = fTPFile0.getGroup();
    int i9 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    fTPFile0.setName("hi!");
    boolean b6 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("?---------    0                         -1 null");
    java.lang.String str9 = fTPFile0.toString();
    java.lang.String str11 = fTPFile0.toFormattedString("d---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0 ?---------    0                         -1 null                -1 hi!"+ "'", str11.equals("?---------    0 ?---------    0                         -1 null                -1 hi!"));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.toString();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    long long5 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    java.lang.String str5 = fTPFile0.getRawListing();
    java.lang.String str6 = fTPFile0.toString();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    fTPFile0.setName("?---------  100 hi!                     -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)'#');
    fTPFile0.setHardLinkCount((int)(short)10);
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    fTPFile0.setSize((long)(short)-1);
    java.lang.String str13 = fTPFile0.getRawListing();
    boolean b14 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    fTPFile0.setGroup("hi!");
    fTPFile0.setName("");
    fTPFile0.setLink("?---------  100                         -1 hi!");
    java.lang.String str13 = fTPFile0.getGroup();
    java.lang.String str14 = fTPFile0.getName();
    boolean b15 = fTPFile0.isUnknown();
    java.util.Calendar calendar16 = null;
    fTPFile0.setTimestamp(calendar16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    fTPFile0.setUser("");
    boolean b8 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("hi!");
    java.lang.String str12 = fTPFile0.toFormattedString("?---------    0 ?---------  100                         -1 hi!                -1 null");
    boolean b13 = fTPFile0.isValid();
    fTPFile0.setName("?---------   10                         -1 null");
    boolean b16 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------  100 hi!                     -1 null"+ "'", str12.equals("?---------  100 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    fTPFile0.setName("hi!");
    boolean b6 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("?---------   35                         -1 null");
    int i9 = fTPFile0.getType();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0 ?---------    0                         -1 null                -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0 ?---------   35                         -1 null                -1 hi!"+ "'", str11.equals("?---------    0 ?---------   35                         -1 null                -1 hi!"));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    fTPFile0.setName("hi!");
    boolean b6 = fTPFile0.isDirectory();
    boolean b7 = fTPFile0.isSymbolicLink();
    boolean b8 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    fTPFile0.setName("hi!");
    java.lang.String str6 = fTPFile0.toString();
    fTPFile0.setType(100);
    fTPFile0.setName("?---------  100                         -1 hi!");
    fTPFile0.setName("?---------  100                         -1 null");
    java.lang.String str13 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------  100                         -1 null"+ "'", str13.equals("?---------  100                         -1 null"));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)'#');
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str9 = fTPFile0.toString();
    boolean b10 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    fTPFile0.setSize((long)0);
    java.lang.String str6 = fTPFile0.getUser();
    long long7 = fTPFile0.getSize();
    long long8 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setHardLinkCount(2);
    boolean b5 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "?---------    0                         -1 null"+ "'", str1.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    java.lang.String str5 = fTPFile0.getRawListing();
    long long6 = fTPFile0.getSize();
    fTPFile0.setRawListing("?---------    0                         -1 ?---------  100                         -1 hi!");
    fTPFile0.setType(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setType((int)'a');
    fTPFile0.setHardLinkCount(0);
    java.lang.String str10 = fTPFile0.getGroup();
    java.lang.String str11 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    fTPFile0.setUser("");
    java.lang.String str8 = fTPFile0.getRawListing();
    java.lang.String str9 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    fTPFile0.setRawListing("");
    boolean b9 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    boolean b6 = fTPFile0.isSymbolicLink();
    java.lang.String str7 = fTPFile0.getUser();
    java.lang.String str8 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------  100                         -1 null"+ "'", str8.equals("?---------  100                         -1 null"));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    fTPFile0.setGroup("hi!");
    fTPFile0.setName("");
    fTPFile0.setLink("?---------  100                         -1 hi!");
    java.lang.String str13 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    fTPFile0.setRawListing("");
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    fTPFile0.setPermission((int)(short)0, 0, false);
    boolean b16 = fTPFile0.isFile();
    java.lang.String str17 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    fTPFile0.setUser("");
    boolean b8 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("hi!");
    java.lang.String str12 = fTPFile0.toFormattedString("?---------    0 ?---------  100                         -1 hi!                -1 null");
    long long13 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------  100 hi!                     -1 null"+ "'", str12.equals("?---------  100 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == (-1L));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    java.lang.String str8 = fTPFile0.toFormattedString("");
    boolean b9 = fTPFile0.isValid();
    java.lang.String str10 = fTPFile0.getName();
    java.lang.String str11 = fTPFile0.getRawListing();
    fTPFile0.setLink("?---------  100 hi!                     -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------  100                         -1 hi!"+ "'", str8.equals("?---------  100                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isDirectory();
    java.lang.String str5 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setSize((long)'#');
    java.lang.String str7 = fTPFile0.getUser();
    java.lang.String str8 = fTPFile0.getGroup();
    long long9 = fTPFile0.getSize();
    java.lang.String str10 = fTPFile0.getRawListing();
    fTPFile0.setLink("?---------   10                         35 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setRawListing("?---------  100                         -1 hi!");
    boolean b7 = fTPFile0.hasPermission(1, 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    java.lang.String str8 = fTPFile0.toFormattedString("");
    boolean b9 = fTPFile0.isValid();
    java.lang.String str10 = fTPFile0.getName();
    java.lang.String str11 = fTPFile0.toFormattedString();
    java.lang.String str12 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------  100                         -1 hi!"+ "'", str8.equals("?---------  100                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------  100                         -1 hi!"+ "'", str11.equals("?---------  100                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    java.lang.String str4 = fTPFile0.toString();
    fTPFile0.setType((int)(byte)1);
    java.lang.String str7 = fTPFile0.getGroup();
    int i8 = fTPFile0.getHardLinkCount();
    java.lang.String str9 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    boolean b3 = fTPFile0.isSymbolicLink();
    fTPFile0.setPermission((int)(byte)0, 1, false);
    java.lang.String str8 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.toString();
    java.lang.String str10 = fTPFile0.getRawListing();
    fTPFile0.setSize((long)' ');
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = fTPFile0.hasPermission((int)'#', 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount(1);
    long long8 = fTPFile0.getSize();
    boolean b9 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str6 = fTPFile0.getName();
    java.lang.String str8 = fTPFile0.toFormattedString("?---------   10                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 null"+ "'", str8.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    java.lang.String str7 = fTPFile0.getUser();
    boolean b8 = fTPFile0.isDirectory();
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str5 = fTPFile0.getRawListing();
    fTPFile0.setName("?---------    0 ?---------  100                         -1 hi!                -1 null");
    java.lang.String str8 = fTPFile0.getRawListing();
    boolean b9 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------  100          hi!            -1 ");
    java.util.Calendar calendar12 = null;
    fTPFile0.setTimestamp(calendar12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    java.lang.String str4 = fTPFile0.toString();
    fTPFile0.setType((int)(byte)1);
    java.lang.String str7 = fTPFile0.getGroup();
    int i8 = fTPFile0.getHardLinkCount();
    java.lang.String str9 = fTPFile0.getGroup();
    boolean b10 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setType((int)'a');
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    java.lang.String str9 = fTPFile0.getRawListing();
    fTPFile0.setUser("?---------  100 hi!                     -1 null");
    fTPFile0.setType((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setRawListing("");
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    fTPFile0.setRawListing("?---------    0 ?---------  100                         -1 hi!                -1 null");
    java.util.Calendar calendar12 = fTPFile0.getTimestamp();
    long long13 = fTPFile0.getSize();
    fTPFile0.setSize((long)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == (-1L));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    long long5 = fTPFile0.getSize();
    fTPFile0.setUser("");
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.getName();
    boolean b10 = fTPFile0.isValid();
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    fTPFile0.setType(10);
    boolean b14 = fTPFile0.isFile();
    java.util.Calendar calendar15 = null;
    fTPFile0.setTimestamp(calendar15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    java.lang.String str5 = fTPFile0.toString();
    int i6 = fTPFile0.getType();
    fTPFile0.setRawListing("?---------  100          hi!            -1 ");
    java.lang.String str9 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    fTPFile0.setName("hi!");
    java.lang.String str6 = fTPFile0.toString();
    fTPFile0.setType(100);
    fTPFile0.setName("?---------  100                         -1 hi!");
    fTPFile0.setRawListing("?---------    0                         -1 null");
    fTPFile0.setName("hi!");
    java.lang.String str16 = fTPFile0.toFormattedString("?---------    0 ?---------   35                         -1 null                -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "?---------    0                         -1 hi!"+ "'", str16.equals("?---------    0                         -1 hi!"));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    fTPFile0.setGroup("hi!");
    fTPFile0.setName("");
    java.lang.String str11 = fTPFile0.getName();
    java.lang.String str12 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------  100          hi!            -1 "+ "'", str12.equals("?---------  100          hi!            -1 "));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(100, (int)'a', false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    java.lang.String str8 = fTPFile0.toFormattedString("");
    boolean b9 = fTPFile0.isValid();
    java.lang.String str10 = fTPFile0.getName();
    java.lang.String str11 = fTPFile0.toFormattedString();
    java.lang.String str12 = fTPFile0.getUser();
    int i13 = fTPFile0.getType();
    boolean b14 = fTPFile0.isFile();
    java.lang.String str15 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------  100                         -1 hi!"+ "'", str8.equals("?---------  100                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------  100                         -1 hi!"+ "'", str11.equals("?---------  100                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------  100                         -1 hi!"+ "'", str15.equals("?---------  100                         -1 hi!"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    fTPFile0.setRawListing("?---------    0                         -1 null");
    boolean b6 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    boolean b3 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("?---------    0                         -1 hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.getUser();
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    boolean b6 = fTPFile0.isUnknown();
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = fTPFile0.hasPermission(0, (int)(byte)-1);
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
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setType((int)'a');
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    java.lang.String str10 = fTPFile0.getLink();
    java.lang.String str11 = fTPFile0.toFormattedString();
    fTPFile0.setHardLinkCount((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                         -1 null"+ "'", str11.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.toString();
    java.lang.String str10 = fTPFile0.getRawListing();
    fTPFile0.setSize((long)' ');
    java.lang.String str13 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = fTPFile0.getTimestamp();
    java.util.Calendar calendar2 = null;
    fTPFile0.setTimestamp(calendar2);
    boolean b4 = fTPFile0.isFile();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.toString();
    fTPFile0.setType(100);
    boolean b11 = fTPFile0.hasPermission((int)(short)1, 1);
    fTPFile0.setRawListing("?---------    0                          0 null");
    boolean b14 = fTPFile0.isFile();
    boolean b15 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    java.lang.String str3 = fTPFile0.getUser();
    fTPFile0.setUser("?---------  100                         -1 hi!");
    java.lang.String str7 = fTPFile0.toFormattedString("?---------  100                         -1 hi!");
    boolean b10 = fTPFile0.hasPermission(0, (int)(byte)0);
    boolean b11 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0 ?---------  100                         -1 hi!                -1 null"+ "'", str7.equals("?---------    0 ?---------  100                         -1 hi!                -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    fTPFile0.setGroup("hi!");
    java.lang.String str9 = fTPFile0.getLink();
    java.lang.String str10 = fTPFile0.toFormattedString();
    boolean b11 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------   10                         -1 null");
    java.lang.String str14 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------  100          hi!            -1 hi!"+ "'", str10.equals("?---------  100          hi!            -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setHardLinkCount(10);
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.toString();
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    boolean b12 = fTPFile0.isUnknown();
    fTPFile0.setSize((long)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }


    FTPFile fTPFile0 = new FTPFile();
    java.util.Calendar calendar1 = null;
    fTPFile0.setTimestamp(calendar1);
    fTPFile0.setHardLinkCount((int)(short)1);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    fTPFile0.setGroup("?---------    0 ?---------    0                          0 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setLink("hi!");
    fTPFile0.setName("hi!");
    fTPFile0.setGroup("hi!");
    fTPFile0.setName("");
    fTPFile0.setLink("?---------  100                         -1 hi!");
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = fTPFile0.hasPermission((-1), (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

}
