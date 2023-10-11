
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test001"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    long long2 = fTPFile0.getSize();
    fTPFile0.setUser("?---------    0                         -1 null");
    boolean b5 = fTPFile0.isDirectory();
    java.lang.String str6 = fTPFile0.toFormattedString();
    fTPFile0.setLink("?---------   10                         -1 ?---------    0                         -1 null");
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = fTPFile0.hasPermission(100, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0 ?---------    0                         -1 null                -1 null"+ "'", str6.equals("?---------    0 ?---------    0                         -1 null                -1 null"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test002"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setRawListing("hi!");
    java.lang.String str4 = fTPFile0.toString();
    java.lang.String str5 = fTPFile0.toFormattedString();
    fTPFile0.setType(0);
    fTPFile0.setPermission(0, (int)(short)1, true);
    fTPFile0.setName("?---------    3                          0 null");
    java.lang.String str14 = fTPFile0.getRawListing();
    fTPFile0.setName("?---------    0          ?---------    0                         -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test003"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setName("hi!");
    java.lang.String str5 = fTPFile0.getGroup();
    fTPFile0.setSize((long)(short)100);
    java.lang.String str8 = fTPFile0.getName();
    int i9 = fTPFile0.getHardLinkCount();
    int i10 = fTPFile0.getType();
    fTPFile0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test004"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str4 = fTPFile0.getLink();
    fTPFile0.setName("?---------    0          ?---------   32 ?---------    1                         -1 null                -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test005"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setType((int)'a');
    fTPFile0.setRawListing("");
    int i6 = fTPFile0.getType();
    java.lang.String str7 = fTPFile0.getLink();
    fTPFile0.setHardLinkCount(97);
    java.lang.String str10 = fTPFile0.getRawListing();
    fTPFile0.setType(35);
    java.util.Calendar calendar13 = fTPFile0.getTimestamp();
    java.util.Calendar calendar14 = null;
    fTPFile0.setTimestamp(calendar14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar13);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test006"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setType((int)'a');
    fTPFile0.setRawListing("");
    fTPFile0.setType(97);
    boolean b8 = fTPFile0.isDirectory();
    java.lang.String str9 = fTPFile0.toString();
    java.lang.String str10 = fTPFile0.getGroup();
    boolean b13 = fTPFile0.hasPermission((int)(byte)0, (int)(short)0);
    java.lang.String str14 = fTPFile0.getGroup();
    boolean b15 = fTPFile0.isFile();
    fTPFile0.setName("?---------    0                         -1 hi!");
    fTPFile0.setRawListing("?---------    0                         -1 ?---------    0 ?---------    0                         -1 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test007"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isFile();
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.getLink();
    boolean b6 = fTPFile0.isFile();
    boolean b7 = fTPFile0.isDirectory();
    java.lang.String str8 = fTPFile0.getRawListing();
    long long9 = fTPFile0.getSize();
    fTPFile0.setRawListing("?---------    0          ?---------   10                         -1 null        2 ?---------    0                         -1 hi!");
    int i12 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test008"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setUser("hi!");
    boolean b4 = fTPFile0.isValid();
    fTPFile0.setSize((long)'#');
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.toString();
    int i9 = fTPFile0.getHardLinkCount();
    fTPFile0.setType((-1));
    boolean b12 = fTPFile0.isDirectory();
    fTPFile0.setSize(10L);
    fTPFile0.setLink("?---------  100                         -1 hi!");
    fTPFile0.setType((int)(short)-1);
    java.util.Calendar calendar19 = fTPFile0.getTimestamp();
    long long20 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 10L);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test009"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str4 = fTPFile0.getLink();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.toFormattedString();
    fTPFile0.setGroup("hi!");
    fTPFile0.setSize((long)100);
    boolean b12 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    1                         -1 null"+ "'", str7.equals("?---------    1                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test010"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getLink();
    fTPFile0.setRawListing("?---------    3                         -1 null");
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setLink("?---------    1          ?---r-----    0                         -1 hi!       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test011"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setHardLinkCount((int)(short)0);
    long long5 = fTPFile0.getSize();
    int i6 = fTPFile0.getType();
    java.lang.String str7 = fTPFile0.toString();
    int i8 = fTPFile0.getHardLinkCount();
    fTPFile0.setLink("?---------   97                        100 null");
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test012"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str4 = fTPFile0.getLink();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    fTPFile0.setName("?---------    0                         -1 null");
    fTPFile0.setHardLinkCount(32);
    fTPFile0.setType((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test013"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getRawListing();
    fTPFile0.setHardLinkCount((int)(short)0);
    fTPFile0.setUser("?---------    1                         -1 null");
    java.lang.String str6 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test014"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setHardLinkCount(0);
    java.lang.String str5 = fTPFile0.getName();
    java.lang.String str6 = fTPFile0.getName();
    boolean b7 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("?---------   35                         -1 null");
    boolean b10 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("?---------    1                         -1 null");
    boolean b13 = fTPFile0.isFile();
    fTPFile0.setSize(2L);
    fTPFile0.setName("?---------    1 ?---------    0 hi!                     35 null ?---------    0                         -1 ?---------    1                         -1 null       -1 null");
    int i18 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test015"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setType((int)'a');
    fTPFile0.setRawListing("");
    int i6 = fTPFile0.getType();
    java.lang.String str7 = fTPFile0.getLink();
    fTPFile0.setName("?---------    1                         -1 null");
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0 ?---------    0                         -1 null                -1 null");
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)' ', (int)(byte)10, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test016"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    boolean b4 = fTPFile0.isDirectory();
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    0                         -1 null");
    boolean b7 = fTPFile0.isFile();
    java.lang.String str8 = fTPFile0.getUser();
    boolean b9 = fTPFile0.isSymbolicLink();
    int i10 = fTPFile0.getHardLinkCount();
    fTPFile0.setSize((long)'#');
    long long13 = fTPFile0.getSize();
    boolean b14 = fTPFile0.isDirectory();
    java.lang.String str15 = fTPFile0.getName();
    long long16 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    1                         -1 null"+ "'", str6.equals("?---------    1                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 35L);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test017"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setHardLinkCount((int)(short)0);
    fTPFile0.setGroup("?---------    1 hi!                     -1 null");
    boolean b9 = fTPFile0.hasPermission((int)(short)1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test018"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    int i3 = fTPFile0.getType();
    fTPFile0.setGroup("hi!");
    fTPFile0.setSize((long)'4');
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str10 = fTPFile0.toFormattedString("?---------    1                         35 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------   35          hi!            52 null"+ "'", str10.equals("?---------   35          hi!            52 null"));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test019"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setType((int)'a');
    boolean b4 = fTPFile0.isValid();
    fTPFile0.setUser("");
    fTPFile0.setGroup("?---------    0                         -1 ?---------    0 hi!                     -1 null");
    boolean b9 = fTPFile0.isValid();
    boolean b10 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test020"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    int i3 = fTPFile0.getType();
    fTPFile0.setGroup("hi!");
    fTPFile0.setRawListing("?---------    0                         -1 hi!");
    int i8 = fTPFile0.getType();
    boolean b9 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test021"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    fTPFile0.setHardLinkCount((int)(short)10);
    fTPFile0.setGroup("");
    java.lang.String str6 = fTPFile0.getLink();
    fTPFile0.setHardLinkCount((-1));
    boolean b9 = fTPFile0.isSymbolicLink();
    fTPFile0.setName("?---------    0 hi!                     35 ?---------    1                         -1 null");
    fTPFile0.setHardLinkCount((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test022"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setHardLinkCount(0);
    java.lang.String str5 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str8 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 null"+ "'", str8.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test023"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setType((int)'a');
    boolean b4 = fTPFile0.isValid();
    fTPFile0.setUser("");
    fTPFile0.setGroup("?---------    0                         -1 ?---------    0 hi!                     -1 null");
    fTPFile0.setSize((long)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test024"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setType((int)'a');
    fTPFile0.setRawListing("");
    int i6 = fTPFile0.getType();
    java.lang.String str7 = fTPFile0.getLink();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    boolean b10 = fTPFile0.isValid();
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------    0                         -1 hi!");
    java.lang.String str15 = fTPFile0.toFormattedString("?---------    1 ?---------    0 hi!                     35 null ?---------    0                         -1 ?---------    1                         -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    0 ?---------    0                         -1 hi!                -1 null"+ "'", str15.equals("?---------    0 ?---------    0                         -1 hi!                -1 null"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test025"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    fTPFile0.setHardLinkCount((int)(short)10);
    fTPFile0.setGroup("");
    java.lang.String str6 = fTPFile0.getLink();
    boolean b7 = fTPFile0.isFile();
    java.lang.String str8 = fTPFile0.toString();
    int i9 = fTPFile0.getType();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)100, (int)'a', false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test026"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    boolean b3 = fTPFile0.isSymbolicLink();
    long long4 = fTPFile0.getSize();
    boolean b5 = fTPFile0.isFile();
    fTPFile0.setUser("d---------    0                         -1 null");
    fTPFile0.setType((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test027"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setRawListing("hi!");
    java.lang.String str4 = fTPFile0.toString();
    fTPFile0.setGroup("?---------    1          l---------    1          hi!            -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test028"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str4 = fTPFile0.getLink();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    fTPFile0.setType(2);
    fTPFile0.setGroup("hi!");
    int i11 = fTPFile0.getType();
    java.lang.String str13 = fTPFile0.toFormattedString("?---------    0 hi!                     -1 null");
    int i14 = fTPFile0.getHardLinkCount();
    java.lang.String str15 = fTPFile0.getRawListing();
    java.lang.String str16 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "l---------    1          hi!            -1 null"+ "'", str13.equals("l---------    1          hi!            -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test029"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setHardLinkCount((int)(short)0);
    int i5 = fTPFile0.getType();
    fTPFile0.setName("?---------   10                         -1 null");
    fTPFile0.setLink("?---------    1 ?---------    0                         -1 hi!                -1 null");
    java.lang.String str10 = fTPFile0.toString();
    boolean b11 = fTPFile0.isValid();
    fTPFile0.setUser("?---------    0 hi!                     35 null");
    boolean b14 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test030"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setHardLinkCount((int)(short)0);
    fTPFile0.setGroup("hi!");
    boolean b7 = fTPFile0.isFile();
    java.lang.String str8 = fTPFile0.getGroup();
    boolean b9 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test031"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setType((int)'a');
    boolean b4 = fTPFile0.isValid();
    java.lang.String str5 = fTPFile0.getRawListing();
    fTPFile0.setName("?---------    1                         -1 null");
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test032"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isFile();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isDirectory();
    boolean b8 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test033"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount((int)(short)0);
    fTPFile0.setRawListing("hi!");
    boolean b7 = fTPFile0.isValid();
    fTPFile0.setName("?---------    1 ?---------   35                         -1 null                35 null");
    int i10 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test034"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setHardLinkCount(0);
    java.lang.String str5 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    fTPFile0.setLink("?---------   10                         -1 null");
    java.lang.String str10 = fTPFile0.toFormattedString();
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 null"+ "'", str10.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test035"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    int i3 = fTPFile0.getType();
    fTPFile0.setGroup("hi!");
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isUnknown();
    java.lang.String str8 = fTPFile0.toString();
    boolean b9 = fTPFile0.isUnknown();
    fTPFile0.setType((int)(short)10);
    java.util.Calendar calendar12 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar12);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test036"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    fTPFile0.setHardLinkCount((int)(short)10);
    fTPFile0.setGroup("");
    java.lang.String str6 = fTPFile0.getLink();
    java.lang.String str7 = fTPFile0.getGroup();
    boolean b8 = fTPFile0.isFile();
    fTPFile0.setGroup("?---------   35                         -1 null");
    fTPFile0.setType((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test037"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    long long2 = fTPFile0.getSize();
    fTPFile0.setUser("?---------    0                         -1 null");
    boolean b5 = fTPFile0.isValid();
    java.lang.String str7 = fTPFile0.toFormattedString("?---------  100                         -1 hi!");
    boolean b8 = fTPFile0.isValid();
    fTPFile0.setType(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0 ?---------    0                         -1 null                -1 null"+ "'", str7.equals("?---------    0 ?---------    0                         -1 null                -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test038"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    java.lang.String str2 = fTPFile0.getRawListing();
    fTPFile0.setHardLinkCount((int)'4');
    boolean b5 = fTPFile0.isUnknown();
    boolean b6 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test039"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    boolean b4 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount((int)(byte)10);
    fTPFile0.setHardLinkCount(3);
    java.lang.String str9 = fTPFile0.getLink();
    boolean b10 = fTPFile0.isDirectory();
    java.lang.String str12 = fTPFile0.toFormattedString("?---------    1                         97 null");
    fTPFile0.setRawListing("?---------    0                         -1 ?---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    3                         -1 null"+ "'", str12.equals("?---------    3                         -1 null"));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test040"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setType((int)'a');
    boolean b4 = fTPFile0.isValid();
    java.lang.String str5 = fTPFile0.getRawListing();
    fTPFile0.setName("?---------    1                         -1 null");
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    fTPFile0.setUser("hi!");
    fTPFile0.setName("?---------    0                         -1 hi!");
    fTPFile0.setHardLinkCount(2);
    java.lang.String str15 = fTPFile0.getName();
    fTPFile0.setRawListing("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    0                         -1 hi!"+ "'", str15.equals("?---------    0                         -1 hi!"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test041"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setType((int)'a');
    boolean b4 = fTPFile0.isValid();
    java.lang.String str5 = fTPFile0.getRawListing();
    fTPFile0.setName("?---------    1                         -1 null");
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    fTPFile0.setUser("hi!");
    java.lang.String str11 = fTPFile0.getUser();
    java.lang.String str12 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    1                         -1 null"+ "'", str12.equals("?---------    1                         -1 null"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test042"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    boolean b4 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount((int)(byte)10);
    fTPFile0.setHardLinkCount(3);
    java.lang.String str9 = fTPFile0.getLink();
    java.lang.String str10 = fTPFile0.getRawListing();
    java.lang.String str11 = fTPFile0.toString();
    fTPFile0.setName("?---------    0 hi!                     35 ?---------    1                         -1 null");
    java.util.Calendar calendar14 = null;
    fTPFile0.setTimestamp(calendar14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test043"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setUser("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString("?---------   10                         -1 null");
    fTPFile0.setHardLinkCount((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0 hi!                     -1 null"+ "'", str5.equals("?---------    0 hi!                     -1 null"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test044"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str4 = fTPFile0.getLink();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    fTPFile0.setType(2);
    fTPFile0.setGroup("hi!");
    int i11 = fTPFile0.getType();
    java.lang.String str13 = fTPFile0.toFormattedString("?---------    0 hi!                     -1 null");
    int i14 = fTPFile0.getHardLinkCount();
    long long15 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "l---------    1          hi!            -1 null"+ "'", str13.equals("l---------    1          hi!            -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == (-1L));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test045"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    boolean b4 = fTPFile0.isDirectory();
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    0                         -1 null");
    boolean b7 = fTPFile0.isFile();
    java.lang.String str8 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    boolean b11 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(2);
    long long14 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    1                         -1 null"+ "'", str6.equals("?---------    1                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == (-1L));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test046"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setName("hi!");
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str7 = fTPFile0.toString();
    boolean b8 = fTPFile0.isValid();
    java.lang.String str9 = fTPFile0.getGroup();
    fTPFile0.setHardLinkCount(3);
    boolean b12 = fTPFile0.isUnknown();
    fTPFile0.setName("?---------   32 ?---------    1                         -1 null                -1 null");
    java.lang.String str15 = fTPFile0.toFormattedString();
    boolean b16 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    3                         -1 ?---------   32 ?---------    1                         -1 null                -1 null"+ "'", str15.equals("?---------    3                         -1 ?---------   32 ?---------    1                         -1 null                -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test047"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str4 = fTPFile0.getLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isDirectory();
    boolean b7 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    fTPFile0.setHardLinkCount(0);
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test048"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setType(3);
    java.lang.String str4 = fTPFile0.toString();
    fTPFile0.setLink("?---------    1 ?---------    0                         -1 null                -1 hi!");
    java.lang.String str7 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test049"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    fTPFile0.setGroup("");
    java.lang.String str6 = fTPFile0.getUser();
    boolean b7 = fTPFile0.isUnknown();
    java.lang.String str8 = fTPFile0.getUser();
    boolean b9 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test050"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str4 = fTPFile0.getLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isDirectory();
    boolean b7 = fTPFile0.isSymbolicLink();
    fTPFile0.setRawListing("?---------    1          ?---------    0                         -1 hi!       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test051"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    fTPFile0.setGroup("");
    long long6 = fTPFile0.getSize();
    java.lang.String str7 = fTPFile0.getUser();
    boolean b8 = fTPFile0.isSymbolicLink();
    fTPFile0.setName("?---------   10                         -1 null");
    java.lang.String str11 = fTPFile0.toString();
    java.lang.String str12 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test052"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getName();
    fTPFile0.setUser("?---------    0                         35 null");
    java.lang.String str7 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test053"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setType((int)'a');
    boolean b4 = fTPFile0.isValid();
    java.lang.String str5 = fTPFile0.getRawListing();
    java.lang.String str6 = fTPFile0.getLink();
    java.lang.String str7 = fTPFile0.getName();
    fTPFile0.setUser("?---------   35                         -1 null");
    int i10 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test054"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isUnknown();
    fTPFile0.setName("");
    java.lang.String str4 = fTPFile0.toString();
    fTPFile0.setGroup("?---r-----    0                         -1 hi!");
    fTPFile0.setHardLinkCount((int)(byte)-1);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setType((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------   -1          ?---r-----    0                         -1 hi!       -1 "+ "'", str9.equals("?---------   -1          ?---r-----    0                         -1 hi!       -1 "));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test055"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setName("hi!");
    fTPFile0.setHardLinkCount((int)(byte)100);
    boolean b7 = fTPFile0.isDirectory();
    java.lang.String str8 = fTPFile0.toFormattedString();
    boolean b9 = fTPFile0.isDirectory();
    boolean b10 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------  100                         -1 hi!"+ "'", str8.equals("?---------  100                         -1 hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test056"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setGroup("?---------    0                         -1 null");
    java.lang.String str4 = fTPFile0.getUser();
    boolean b5 = fTPFile0.isFile();
    boolean b6 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.toFormattedString("?---------    0                         35 null");
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setGroup("?---------    1                         97 null");
    java.lang.String str12 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0          ?---------    0                         -1 null       -1 null"+ "'", str8.equals("?---------    0          ?---------    0                         -1 null       -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0          ?---------    0                         -1 null       -1 null"+ "'", str9.equals("?---------    0          ?---------    0                         -1 null       -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test057"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    long long2 = fTPFile0.getSize();
    fTPFile0.setUser("?---------    0                         -1 null");
    boolean b5 = fTPFile0.isValid();
    fTPFile0.setUser("?---------   35          hi!            52 null");
    int i8 = fTPFile0.getType();
    java.lang.String str9 = fTPFile0.getGroup();
    int i10 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test058"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str4 = fTPFile0.getLink();
    java.lang.String str5 = fTPFile0.toString();
    long long6 = fTPFile0.getSize();
    java.lang.String str7 = fTPFile0.toFormattedString();
    fTPFile0.setLink("?---------    1                         -1 null");
    fTPFile0.setUser("hi!");
    java.lang.String str12 = fTPFile0.toFormattedString();
    java.lang.String str14 = fTPFile0.toFormattedString("?---------   35                         35 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    1                         -1 null"+ "'", str7.equals("?---------    1                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    1 hi!                     -1 null"+ "'", str12.equals("?---------    1 hi!                     -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    1 hi!                     -1 null"+ "'", str14.equals("?---------    1 hi!                     -1 null"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test059"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str4 = fTPFile0.getLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isDirectory();
    boolean b7 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    fTPFile0.setSize((long)0);
    boolean b14 = fTPFile0.isSymbolicLink();
    boolean b15 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test060"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    long long4 = fTPFile0.getSize();
    boolean b5 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test061"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    int i4 = fTPFile0.getHardLinkCount();
    java.lang.String str5 = fTPFile0.getGroup();
    java.lang.String str6 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test062"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str4 = fTPFile0.getLink();
    java.lang.String str5 = fTPFile0.toString();
    long long6 = fTPFile0.getSize();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test063"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str4 = fTPFile0.getLink();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    int i7 = fTPFile0.getHardLinkCount();
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = fTPFile0.hasPermission((int)(short)1, 3);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test064"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getLink();
    java.lang.String str4 = fTPFile0.getLink();
    fTPFile0.setType(97);
    fTPFile0.setSize((long)35);
    java.lang.String str9 = fTPFile0.toFormattedString();
    fTPFile0.setUser("?---------   35                         35 null");
    fTPFile0.setRawListing("?---------    0                          2 null");
    boolean b14 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------   35                         35 null"+ "'", str9.equals("?---------   35                         35 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test065"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setRawListing("hi!");
    int i4 = fTPFile0.getHardLinkCount();
    fTPFile0.setGroup("");
    fTPFile0.setHardLinkCount(97);
    boolean b9 = fTPFile0.isValid();
    fTPFile0.setName("?---------    1                         97 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test066"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setHardLinkCount((int)(short)0);
    java.lang.String str5 = fTPFile0.getName();
    boolean b6 = fTPFile0.isFile();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.getRawListing();
    java.lang.String str10 = fTPFile0.getGroup();
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    java.lang.String str12 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test067"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setUser("hi!");
    boolean b4 = fTPFile0.isValid();
    java.lang.String str5 = fTPFile0.getRawListing();
    java.lang.String str6 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test068"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setUser("hi!");
    boolean b4 = fTPFile0.isValid();
    fTPFile0.setSize((long)'#');
    boolean b9 = fTPFile0.hasPermission(0, (int)(short)0);
    java.lang.String str10 = fTPFile0.getUser();
    java.lang.String str11 = fTPFile0.toFormattedString();
    fTPFile0.setRawListing("?---------    0          ?---------  100                         -1 hi!       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0 hi!                     35 null"+ "'", str11.equals("?---------    0 hi!                     35 null"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test069"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setUser("hi!");
    boolean b4 = fTPFile0.isValid();
    fTPFile0.setSize((long)'#');
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.toString();
    fTPFile0.setName("?---------    1                         -1 null");
    java.lang.String str11 = fTPFile0.getUser();
    fTPFile0.setType(10);
    fTPFile0.setUser("?---------    0                         -1 ?---------    0 hi!                     -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test070"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setType((int)'a');
    boolean b4 = fTPFile0.isValid();
    java.lang.String str5 = fTPFile0.getRawListing();
    fTPFile0.setName("?---------    1                         -1 null");
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    int i9 = fTPFile0.getType();
    boolean b10 = fTPFile0.isSymbolicLink();
    boolean b11 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test071"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setSize((long)2);
    int i6 = fTPFile0.getHardLinkCount();
    fTPFile0.setLink("?---------    1                         -1 null");
    boolean b9 = fTPFile0.isUnknown();
    int i10 = fTPFile0.getHardLinkCount();
    fTPFile0.setUser("?---------   -1                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test072"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setHardLinkCount((int)(short)0);
    java.lang.String str5 = fTPFile0.getName();
    fTPFile0.setRawListing("");
    java.lang.String str8 = fTPFile0.toFormattedString();
    fTPFile0.setLink("?---------    0 hi!      ?---------   10                         -1 null       -1 null");
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    fTPFile0.setLink("?-----x---    0          hi!            52 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 null"+ "'", str8.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test073"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    boolean b4 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount((int)(byte)10);
    fTPFile0.setHardLinkCount(3);
    java.lang.String str9 = fTPFile0.getLink();
    boolean b10 = fTPFile0.isDirectory();
    java.lang.String str11 = fTPFile0.getLink();
    java.lang.String str12 = fTPFile0.toFormattedString();
    fTPFile0.setRawListing("?---------    0 ?---------   35          hi!            52 null                -1 null");
    fTPFile0.setName("?---------    0 ?---------    0                         -1 hi!                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    3                         -1 null"+ "'", str12.equals("?---------    3                         -1 null"));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test074"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setHardLinkCount((int)(short)0);
    int i5 = fTPFile0.getType();
    fTPFile0.setGroup("?---------    0                         -1 null");
    boolean b8 = fTPFile0.isFile();
    boolean b9 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test075"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str4 = fTPFile0.getLink();
    java.lang.String str5 = fTPFile0.toString();
    long long6 = fTPFile0.getSize();
    java.lang.String str7 = fTPFile0.toFormattedString();
    fTPFile0.setSize(52L);
    int i10 = fTPFile0.getType();
    java.lang.String str11 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    1                         -1 null"+ "'", str7.equals("?---------    1                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test076"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setHardLinkCount((int)(short)0);
    java.lang.String str5 = fTPFile0.getName();
    boolean b6 = fTPFile0.isDirectory();
    boolean b7 = fTPFile0.isFile();
    java.lang.String str8 = fTPFile0.toFormattedString();
    int i9 = fTPFile0.getHardLinkCount();
    boolean b10 = fTPFile0.isValid();
    java.lang.String str11 = fTPFile0.toFormattedString();
    fTPFile0.setSize((long)32);
    java.lang.String str14 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 null"+ "'", str8.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                         -1 null"+ "'", str11.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test077"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setLink("");
    fTPFile0.setRawListing("?---------    0                         -1 null");
    boolean b6 = fTPFile0.isFile();
    java.lang.String str7 = fTPFile0.getRawListing();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str10 = fTPFile0.getGroup();
    int i11 = fTPFile0.getHardLinkCount();
    fTPFile0.setType((int)(short)-1);
    java.lang.String str14 = fTPFile0.toFormattedString();
    fTPFile0.setLink("?---------   -1 hi!                     -1 ?---------    1                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------  100                         -1 null"+ "'", str14.equals("?---------  100                         -1 null"));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test078"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    fTPFile0.setGroup("");
    java.lang.String str6 = fTPFile0.getUser();
    int i7 = fTPFile0.getType();
    boolean b8 = fTPFile0.isUnknown();
    boolean b11 = fTPFile0.hasPermission(2, 0);
    boolean b12 = fTPFile0.isValid();
    java.lang.String str13 = fTPFile0.getRawListing();
    boolean b14 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test079"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str4 = fTPFile0.getLink();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    fTPFile0.setType(2);
    fTPFile0.setGroup("hi!");
    int i11 = fTPFile0.getType();
    java.lang.String str13 = fTPFile0.toFormattedString("?---------    0 hi!                     -1 null");
    java.util.Calendar calendar14 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "l---------    1          hi!            -1 null"+ "'", str13.equals("l---------    1          hi!            -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar14);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test080"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str4 = fTPFile0.getLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isDirectory();
    boolean b7 = fTPFile0.isSymbolicLink();
    fTPFile0.setRawListing("?---------    1                         -1 null");
    fTPFile0.setGroup("?---r-----    0                         -1 hi!");
    boolean b12 = fTPFile0.isDirectory();
    fTPFile0.setGroup("?---------    0                         35 null");
    fTPFile0.setLink("?---------    0 hi!                     -1 ?---------    1                         -1 null");
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = fTPFile0.hasPermission((int)'4', 52);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test081"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    boolean b4 = fTPFile0.isDirectory();
    fTPFile0.setSize((long)'#');
    int i7 = fTPFile0.getType();
    fTPFile0.setUser("?---------   35                         -1 null");
    fTPFile0.setType((int)'a');
    fTPFile0.setGroup("?---------    0          ?---------    0                         -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test082"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str3 = fTPFile0.getLink();
    java.lang.String str4 = fTPFile0.getLink();
    fTPFile0.setType(97);
    java.lang.String str7 = fTPFile0.getGroup();
    int i8 = fTPFile0.getType();
    int i9 = fTPFile0.getHardLinkCount();
    boolean b10 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test083"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount((int)(short)0);
    boolean b5 = fTPFile0.isSymbolicLink();
    java.lang.String str6 = fTPFile0.getRawListing();
    fTPFile0.setName("hi!");
    java.lang.String str9 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test084"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setHardLinkCount((int)(short)0);
    fTPFile0.setGroup("hi!");
    long long7 = fTPFile0.getSize();
    java.lang.String str8 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test085"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    java.lang.String str3 = fTPFile0.toString();
    boolean b4 = fTPFile0.isFile();
    int i5 = fTPFile0.getType();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)100, 100, false);
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
    org.junit.Assert.assertTrue(i5 == 3);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test086"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isFile();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    fTPFile0.setRawListing("hi!");
    fTPFile0.setGroup("");
    fTPFile0.setSize((long)2);
    java.lang.String str12 = fTPFile0.getLink();
    fTPFile0.setUser("?---------    1                         -1 ");
    fTPFile0.setHardLinkCount(97);
    java.lang.String str17 = fTPFile0.getUser();
    java.util.Calendar calendar18 = null;
    fTPFile0.setTimestamp(calendar18);
    boolean b20 = fTPFile0.isValid();
    boolean b21 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "?---------    1                         -1 "+ "'", str17.equals("?---------    1                         -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test087"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    java.lang.String str2 = fTPFile0.getGroup();
    boolean b3 = fTPFile0.isValid();
    fTPFile0.setName("hi!");
    fTPFile0.setSize((-1L));
    fTPFile0.setType((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test088"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    boolean b4 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount((int)(byte)10);
    fTPFile0.setHardLinkCount(3);
    java.lang.String str9 = fTPFile0.getLink();
    boolean b10 = fTPFile0.isDirectory();
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    fTPFile0.setRawListing("?---------    1 ?---------    0                         -1 hi!                -1 null");
    java.lang.String str14 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test089"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setType((int)'a');
    boolean b4 = fTPFile0.isValid();
    java.lang.String str5 = fTPFile0.getRawListing();
    fTPFile0.setName("?---------    1                         -1 null");
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    fTPFile0.setUser("hi!");
    fTPFile0.setHardLinkCount((int)(short)-1);
    fTPFile0.setLink("?---------    0                          2 null");
    boolean b15 = fTPFile0.isSymbolicLink();
    int i16 = fTPFile0.getHardLinkCount();
    boolean b17 = fTPFile0.isUnknown();
    java.util.Calendar calendar18 = null;
    fTPFile0.setTimestamp(calendar18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test090"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    int i3 = fTPFile0.getType();
    fTPFile0.setGroup("hi!");
    fTPFile0.setSize((long)'4');
    boolean b8 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("?---------    0                         -1 ?---------    0                         -1 null");
    fTPFile0.setPermission(0, 0, true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test091"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("hi!");
    boolean b3 = fTPFile0.isFile();
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.getLink();
    java.lang.String str6 = fTPFile0.getName();
    boolean b7 = fTPFile0.isSymbolicLink();
    boolean b8 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test092"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setSize((long)'#');
    boolean b4 = fTPFile0.isDirectory();
    fTPFile0.setLink("?---------   35                         -1 null");
    boolean b7 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    1                         -1 ");
    long long10 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         35 null"+ "'", str9.equals("?---------    0                         35 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 35L);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test093"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    fTPFile0.setRawListing("hi!");
    fTPFile0.setSize((long)2);
    boolean b6 = fTPFile0.isSymbolicLink();
    java.lang.String str7 = fTPFile0.toFormattedString();
    fTPFile0.setSize((long)(short)1);
    fTPFile0.setHardLinkCount((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                          2 null"+ "'", str7.equals("?---------    0                          2 null"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test094"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setName("hi!");
    fTPFile0.setPermission((int)(short)1, 0, true);
    java.lang.String str9 = fTPFile0.getUser();
    boolean b10 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test095"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str4 = fTPFile0.getLink();
    java.lang.String str5 = fTPFile0.toString();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    java.lang.String str7 = fTPFile0.getGroup();
    java.lang.String str8 = fTPFile0.getLink();
    fTPFile0.setUser("?---------    0 hi!      ?---------   10                         -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test096"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    int i3 = fTPFile0.getType();
    fTPFile0.setGroup("hi!");
    fTPFile0.setSize((long)'4');
    fTPFile0.setHardLinkCount(0);
    fTPFile0.setPermission((int)(short)1, 2, true);
    java.util.Calendar calendar14 = null;
    fTPFile0.setTimestamp(calendar14);
    fTPFile0.setName("l---------    1                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test097"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    int i3 = fTPFile0.getType();
    fTPFile0.setGroup("hi!");
    java.lang.String str6 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.getName();
    java.lang.String str8 = fTPFile0.getUser();
    boolean b9 = fTPFile0.isFile();
    boolean b10 = fTPFile0.isSymbolicLink();
    boolean b11 = fTPFile0.isFile();
    fTPFile0.setSize((long)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test098"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setHardLinkCount(0);
    java.lang.String str5 = fTPFile0.getName();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    fTPFile0.setLink("?---------   10                         -1 null");
    int i10 = fTPFile0.getHardLinkCount();
    java.lang.String str12 = fTPFile0.toFormattedString("?---------    3                         -1 null");
    boolean b13 = fTPFile0.isSymbolicLink();
    java.lang.String str15 = fTPFile0.toFormattedString("?---------    0                         -1 ?---------    0                         -1 null");
    boolean b16 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         -1 null"+ "'", str12.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    0                         -1 null"+ "'", str15.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test099"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str4 = fTPFile0.getLink();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    fTPFile0.setType(2);
    fTPFile0.setUser("?---------   10                         -1 null");
    boolean b11 = fTPFile0.isSymbolicLink();
    java.lang.String str12 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test100"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    fTPFile0.setGroup("");
    java.lang.String str6 = fTPFile0.getUser();
    int i7 = fTPFile0.getType();
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str9 = fTPFile0.getName();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    1          l---------    1          hi!            -1 null       -1 null");
    java.lang.String str12 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    1                         -1 null"+ "'", str11.equals("?---------    1                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test101"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    int i2 = fTPFile0.getType();
    long long3 = fTPFile0.getSize();
    java.lang.String str4 = fTPFile0.toFormattedString();
    boolean b5 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test102"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    java.lang.String str2 = fTPFile0.getRawListing();
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    boolean b5 = fTPFile0.isDirectory();
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    fTPFile0.setName("----------    0                         -1 null");
    java.lang.String str10 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test103"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    int i3 = fTPFile0.getType();
    int i4 = fTPFile0.getType();
    java.lang.String str5 = fTPFile0.getUser();
    boolean b6 = fTPFile0.isUnknown();
    java.lang.String str7 = fTPFile0.getGroup();
    java.lang.String str8 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test104"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    int i2 = fTPFile0.getType();
    fTPFile0.setRawListing("?---------    0                         -1 hi!");
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    fTPFile0.setLink("?---------   35                         35 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test105"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    java.lang.String str2 = fTPFile0.getRawListing();
    fTPFile0.setSize((long)'a');
    fTPFile0.setPermission((int)(byte)0, 0, false);
    fTPFile0.setHardLinkCount((int)(short)0);
    boolean b11 = fTPFile0.isValid();
    java.lang.String str12 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test106"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    fTPFile0.setGroup("");
    java.lang.String str6 = fTPFile0.getUser();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getGroup();
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    fTPFile0.setUser("?---------    0                         -1 hi!");
    java.util.Calendar calendar13 = fTPFile0.getTimestamp();
    java.lang.String str14 = fTPFile0.toFormattedString();
    int i15 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    1 ?---------    0                         -1 hi!                -1 null"+ "'", str14.equals("?---------    1 ?---------    0                         -1 hi!                -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test107"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str4 = fTPFile0.getLink();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    fTPFile0.setType(2);
    fTPFile0.setGroup("hi!");
    int i11 = fTPFile0.getType();
    boolean b12 = fTPFile0.isSymbolicLink();
    fTPFile0.setRawListing("?---------   35                         -1 null");
    java.lang.String str15 = fTPFile0.toString();
    boolean b16 = fTPFile0.isSymbolicLink();
    java.lang.String str17 = fTPFile0.getGroup();
    fTPFile0.setLink("?---------    0 ?---------   35                         -1 null                -1 null");
    java.lang.String str20 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------   35                         -1 null"+ "'", str15.equals("?---------   35                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "?---------    0 ?---------   35                         -1 null                -1 null"+ "'", str20.equals("?---------    0 ?---------   35                         -1 null                -1 null"));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test108"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setHardLinkCount(0);
    java.lang.String str5 = fTPFile0.getName();
    java.lang.String str6 = fTPFile0.getName();
    boolean b7 = fTPFile0.isSymbolicLink();
    boolean b8 = fTPFile0.isUnknown();
    fTPFile0.setRawListing("?---------    0 ?---------    0                         -1 null                -1 null");
    fTPFile0.setHardLinkCount(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test109"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    fTPFile0.setGroup("");
    long long6 = fTPFile0.getSize();
    java.lang.String str7 = fTPFile0.getUser();
    fTPFile0.setRawListing("?---------    1                         97 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test110"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isUnknown();
    fTPFile0.setName("");
    java.lang.String str4 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test111"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str4 = fTPFile0.getLink();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    fTPFile0.setType(2);
    fTPFile0.setGroup("hi!");
    java.lang.String str11 = fTPFile0.getName();
    java.util.Calendar calendar12 = fTPFile0.getTimestamp();
    fTPFile0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar12);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test112"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str4 = fTPFile0.getLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isDirectory();
    boolean b7 = fTPFile0.isSymbolicLink();
    fTPFile0.setRawListing("?---------    1                         -1 null");
    fTPFile0.setGroup("?---r-----    0                         -1 hi!");
    long long12 = fTPFile0.getSize();
    long long13 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == (-1L));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test113"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    long long2 = fTPFile0.getSize();
    fTPFile0.setUser("?---------    0                         -1 null");
    boolean b5 = fTPFile0.isFile();
    fTPFile0.setType(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test114"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    java.lang.String str2 = fTPFile0.getGroup();
    java.lang.String str3 = fTPFile0.getGroup();
    fTPFile0.setSize((long)1);
    java.lang.String str6 = fTPFile0.toFormattedString();
    int i7 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                          1 null"+ "'", str6.equals("?---------    0                          1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test115"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str4 = fTPFile0.getLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isDirectory();
    boolean b7 = fTPFile0.isUnknown();
    java.lang.String str8 = fTPFile0.toFormattedString();
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str10 = fTPFile0.getRawListing();
    long long11 = fTPFile0.getSize();
    boolean b12 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    1                         -1 null"+ "'", str8.equals("?---------    1                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test116"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str4 = fTPFile0.getLink();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isDirectory();
    boolean b7 = fTPFile0.isUnknown();
    java.lang.String str8 = fTPFile0.toFormattedString();
    java.lang.String str9 = fTPFile0.getGroup();
    boolean b10 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    1                         -1 null"+ "'", str8.equals("?---------    1                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test117"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    long long2 = fTPFile0.getSize();
    fTPFile0.setUser("?---------    0                         -1 null");
    boolean b5 = fTPFile0.isDirectory();
    java.lang.String str6 = fTPFile0.toFormattedString();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.toString();
    fTPFile0.setType(97);
    fTPFile0.setGroup("?---------    2                         -1 null");
    java.util.Calendar calendar13 = null;
    fTPFile0.setTimestamp(calendar13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0 ?---------    0                         -1 null                -1 null"+ "'", str6.equals("?---------    0 ?---------    0                         -1 null                -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test118"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    java.lang.String str2 = fTPFile0.getRawListing();
    java.lang.String str3 = fTPFile0.getUser();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setName("?---------  100                         -1 hi!");
    boolean b7 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test119"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str4 = fTPFile0.getLink();
    java.util.Calendar calendar5 = null;
    fTPFile0.setTimestamp(calendar5);
    java.lang.String str7 = fTPFile0.getGroup();
    java.lang.String str9 = fTPFile0.toFormattedString("");
    int i10 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    1                         -1 null"+ "'", str9.equals("?---------    1                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test120"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setHardLinkCount((int)(short)0);
    java.lang.String str5 = fTPFile0.getName();
    fTPFile0.setRawListing("");
    java.lang.String str8 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test121"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getUser();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setName("hi!");
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str7 = fTPFile0.toString();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    long long10 = fTPFile0.getSize();
    boolean b11 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test122"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    int i3 = fTPFile0.getType();
    long long4 = fTPFile0.getSize();
    java.lang.String str5 = fTPFile0.getLink();
    java.lang.String str6 = fTPFile0.getName();
    fTPFile0.setUser("?---------    0 ?---------   10                         -1 null                -1 null");
    fTPFile0.setHardLinkCount((int)(byte)-1);
    java.lang.String str11 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test123"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setHardLinkCount((int)(short)0);
    fTPFile0.setSize((long)(byte)100);
    boolean b7 = fTPFile0.isDirectory();
    boolean b8 = fTPFile0.isSymbolicLink();
    fTPFile0.setLink("?---------   35                         -1 null");
    boolean b11 = fTPFile0.isDirectory();
    boolean b12 = fTPFile0.isValid();
    java.util.Calendar calendar13 = null;
    fTPFile0.setTimestamp(calendar13);
    boolean b15 = fTPFile0.isDirectory();
    java.lang.String str16 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "?---------    0                        100 null"+ "'", str16.equals("?---------    0                        100 null"));

  }

}
