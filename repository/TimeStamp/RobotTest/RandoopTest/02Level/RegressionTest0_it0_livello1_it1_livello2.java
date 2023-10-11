
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    java.lang.String str1 = TimeStamp.toString((long)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000000"+ "'", str1.equals("00000000.00000000"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    java.lang.String str1 = TimeStamp.toString(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000000"+ "'", str1.equals("00000000.00000000"));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    long long1 = TimeStamp.getTime((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    java.lang.String str0 = TimeStamp.NTP_DATE_FORMAT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "EEE, MMM dd yyyy HH:mm:ss.SSS"+ "'", str0.equals("EEE, MMM dd yyyy HH:mm:ss.SSS"));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    long long1 = TimeStamp.getTime((long)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    java.lang.String str1 = TimeStamp.toString(100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000064"+ "'", str1.equals("00000000.00000064"));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Thu, Jan 01 1970 00:00:00.052");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    java.lang.String str1 = TimeStamp.toString((long)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000001"+ "'", str1.equals("00000000.00000001"));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    long long1 = TimeStamp.getTime((long)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    TimeStamp timeStamp1 = new TimeStamp((long)'#');
    java.lang.Object obj2 = new java.lang.Object();
    boolean b3 = timeStamp1.equals(obj2);
    long long4 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Thu, Feb 07 2036 06:28:16.000 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)1);
    long long2 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 1L);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toUTCString();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    int i11 = timeStamp8.compareTo(timeStamp10);
    long long12 = timeStamp8.ntpValue();
    java.lang.String str13 = timeStamp8.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp8);
    TimeStamp timeStamp16 = TimeStamp.getNtpTime((long)(short)1);
    long long17 = timeStamp16.getFraction();
    int i18 = timeStamp1.compareTo(timeStamp16);
    long long19 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str6.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str13.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 1L);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    long long6 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1L);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    java.lang.String str1 = TimeStamp.toString((long)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000023"+ "'", str1.equals("00000000.00000023"));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(byte)10);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    TimeStamp timeStamp1 = new TimeStamp("00000000.00000064");

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    long long1 = timeStamp0.getTime();
    long long2 = timeStamp0.getFraction();
    long long3 = timeStamp0.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018564972L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 4174708211L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 4174708211L);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    java.lang.String str1 = TimeStamp.toString((long)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000064"+ "'", str1.equals("00000000.00000064"));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(4166118277L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    long long1 = TimeStamp.getTime((-8959209420255928517L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 52L);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    java.lang.String str1 = TimeStamp.toString((long)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ffffffff.ffffffff"+ "'", str1.equals("ffffffff.ffffffff"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toUTCString();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    int i11 = timeStamp8.compareTo(timeStamp10);
    long long12 = timeStamp8.ntpValue();
    java.lang.String str13 = timeStamp8.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp8);
    TimeStamp timeStamp16 = new TimeStamp((long)'#');
    boolean b17 = timeStamp8.equals((java.lang.Object)timeStamp16);
    long long18 = timeStamp8.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str6.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str13.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 4294967L);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    TimeStamp timeStamp1 = new TimeStamp((long)100);
    TimeStamp timeStamp3 = new TimeStamp((long)(byte)1);
    long long4 = timeStamp3.getTime();
    int i5 = timeStamp1.compareTo(timeStamp3);
    TimeStamp timeStamp7 = new TimeStamp((long)' ');
    int i8 = timeStamp3.compareTo(timeStamp7);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp12 = TimeStamp.getNtpTime((long)(short)1);
    int i13 = timeStamp10.compareTo(timeStamp12);
    long long14 = timeStamp10.ntpValue();
    java.lang.String str15 = timeStamp10.toUTCString();
    TimeStamp timeStamp17 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp19 = TimeStamp.getNtpTime((long)(short)1);
    int i20 = timeStamp17.compareTo(timeStamp19);
    long long21 = timeStamp17.ntpValue();
    java.lang.String str22 = timeStamp17.toUTCString();
    int i23 = timeStamp10.compareTo(timeStamp17);
    TimeStamp timeStamp25 = TimeStamp.getNtpTime((long)(short)1);
    long long26 = timeStamp25.getFraction();
    int i27 = timeStamp10.compareTo(timeStamp25);
    java.lang.String str28 = timeStamp25.toString();
    long long29 = timeStamp25.getFraction();
    boolean b31 = timeStamp25.equals((java.lang.Object)1.0f);
    TimeStamp timeStamp33 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date34 = timeStamp33.getDate();
    int i35 = timeStamp25.compareTo(timeStamp33);
    int i36 = timeStamp3.compareTo(timeStamp33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str15.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str22.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long26 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "83aa7e80.00418937"+ "'", str28.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long29 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    java.lang.String str1 = TimeStamp.toString(4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00418937"+ "'", str1.equals("00000000.00418937"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    TimeStamp timeStamp1 = new TimeStamp((long)100);
    java.lang.String str2 = timeStamp1.toUTCString();
    java.lang.String str3 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toUTCString();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    int i11 = timeStamp8.compareTo(timeStamp10);
    long long12 = timeStamp8.ntpValue();
    java.lang.String str13 = timeStamp8.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp8);
    TimeStamp timeStamp16 = TimeStamp.getNtpTime((long)(short)1);
    long long17 = timeStamp16.getFraction();
    int i18 = timeStamp1.compareTo(timeStamp16);
    java.lang.String str19 = timeStamp16.toString();
    long long20 = timeStamp16.getFraction();
    boolean b22 = timeStamp16.equals((java.lang.Object)1.0f);
    TimeStamp timeStamp24 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date25 = timeStamp24.getDate();
    int i26 = timeStamp16.compareTo(timeStamp24);
    long long27 = timeStamp16.getSeconds();
    java.lang.String str28 = timeStamp16.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str6.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str13.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "83aa7e80.00418937"+ "'", str19.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == 2208988800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str28.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toUTCString();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    int i11 = timeStamp8.compareTo(timeStamp10);
    long long12 = timeStamp8.ntpValue();
    java.lang.String str13 = timeStamp8.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp8);
    java.lang.String str15 = timeStamp8.toString();
    long long16 = timeStamp8.ntpValue();
    java.util.Date date17 = timeStamp8.getDate();
    long long18 = timeStamp8.getSeconds();
    TimeStamp timeStamp20 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp22 = TimeStamp.getNtpTime((long)(short)1);
    int i23 = timeStamp20.compareTo(timeStamp22);
    long long24 = timeStamp20.ntpValue();
    java.lang.String str25 = timeStamp20.toUTCString();
    TimeStamp timeStamp27 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp29 = TimeStamp.getNtpTime((long)(short)1);
    int i30 = timeStamp27.compareTo(timeStamp29);
    long long31 = timeStamp27.ntpValue();
    java.lang.String str32 = timeStamp27.toUTCString();
    int i33 = timeStamp20.compareTo(timeStamp27);
    java.lang.String str34 = timeStamp27.toString();
    java.lang.String str35 = timeStamp27.toDateString();
    long long36 = timeStamp27.getFraction();
    int i37 = timeStamp8.compareTo(timeStamp27);
    TimeStamp timeStamp39 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp41 = TimeStamp.getNtpTime((long)(short)1);
    int i42 = timeStamp39.compareTo(timeStamp41);
    long long43 = timeStamp39.ntpValue();
    java.lang.String str44 = timeStamp39.toUTCString();
    TimeStamp timeStamp46 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp48 = TimeStamp.getNtpTime((long)(short)1);
    int i49 = timeStamp46.compareTo(timeStamp48);
    long long50 = timeStamp46.ntpValue();
    java.lang.String str51 = timeStamp46.toUTCString();
    int i52 = timeStamp39.compareTo(timeStamp46);
    TimeStamp timeStamp54 = TimeStamp.getNtpTime((long)(short)1);
    long long55 = timeStamp54.getFraction();
    int i56 = timeStamp39.compareTo(timeStamp54);
    java.lang.String str57 = timeStamp54.toString();
    long long58 = timeStamp54.getFraction();
    boolean b60 = timeStamp54.equals((java.lang.Object)1.0f);
    TimeStamp timeStamp62 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date63 = timeStamp62.getDate();
    int i64 = timeStamp54.compareTo(timeStamp62);
    boolean b65 = timeStamp8.equals((java.lang.Object)timeStamp54);
    TimeStamp timeStamp67 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp69 = TimeStamp.getNtpTime((long)(short)1);
    int i70 = timeStamp67.compareTo(timeStamp69);
    long long71 = timeStamp67.ntpValue();
    java.lang.String str72 = timeStamp67.toUTCString();
    TimeStamp timeStamp74 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp76 = TimeStamp.getNtpTime((long)(short)1);
    int i77 = timeStamp74.compareTo(timeStamp76);
    long long78 = timeStamp74.ntpValue();
    java.lang.String str79 = timeStamp74.toUTCString();
    int i80 = timeStamp67.compareTo(timeStamp74);
    TimeStamp timeStamp82 = TimeStamp.getNtpTime((long)(short)1);
    long long83 = timeStamp82.getFraction();
    int i84 = timeStamp67.compareTo(timeStamp82);
    java.lang.String str85 = timeStamp82.toString();
    long long86 = timeStamp82.getFraction();
    boolean b88 = timeStamp82.equals((java.lang.Object)1.0f);
    TimeStamp timeStamp90 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date91 = timeStamp90.getDate();
    int i92 = timeStamp82.compareTo(timeStamp90);
    long long93 = timeStamp82.getSeconds();
    int i94 = timeStamp8.compareTo(timeStamp82);
    long long95 = timeStamp82.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str6.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str13.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "83aa7e80.00418937"+ "'", str15.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 2208988800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long24 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str25.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long31 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str32.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "83aa7e80.00418937"+ "'", str34.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Thu, Jan 01 1970 00:00:00.001"+ "'", str35.equals("Thu, Jan 01 1970 00:00:00.001"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long36 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long43 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str44.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long50 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str51.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long55 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "83aa7e80.00418937"+ "'", str57.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long58 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long71 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str72.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long78 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str79.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long83 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str85 + "' != '" + "83aa7e80.00418937"+ "'", str85.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long86 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long93 == 2208988800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long95 == 1L);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    long long1 = TimeStamp.getTime((long)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Thu, Jan 01 1970 00:00:00.010 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toUTCString();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    int i11 = timeStamp8.compareTo(timeStamp10);
    long long12 = timeStamp8.ntpValue();
    java.lang.String str13 = timeStamp8.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp8);
    java.lang.String str15 = timeStamp8.toString();
    java.lang.String str16 = timeStamp8.toDateString();
    long long17 = timeStamp8.getFraction();
    long long18 = timeStamp8.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str6.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str13.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "83aa7e80.00418937"+ "'", str15.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Thu, Jan 01 1970 00:00:00.001"+ "'", str16.equals("Thu, Jan 01 1970 00:00:00.001"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == (-8959209420474971849L));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    TimeStamp timeStamp1 = new TimeStamp((long)100);
    TimeStamp timeStamp3 = new TimeStamp((long)(byte)1);
    long long4 = timeStamp3.getTime();
    int i5 = timeStamp1.compareTo(timeStamp3);
    java.lang.String str6 = timeStamp3.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str6.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toUTCString();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    int i11 = timeStamp8.compareTo(timeStamp10);
    long long12 = timeStamp8.ntpValue();
    java.lang.String str13 = timeStamp8.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp8);
    java.lang.String str15 = timeStamp8.toString();
    java.lang.String str16 = timeStamp8.toDateString();
    long long17 = timeStamp8.getFraction();
    TimeStamp timeStamp19 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp21 = TimeStamp.getNtpTime((long)(short)1);
    int i22 = timeStamp19.compareTo(timeStamp21);
    long long23 = timeStamp19.ntpValue();
    java.lang.String str24 = timeStamp19.toUTCString();
    TimeStamp timeStamp26 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp28 = TimeStamp.getNtpTime((long)(short)1);
    int i29 = timeStamp26.compareTo(timeStamp28);
    long long30 = timeStamp26.ntpValue();
    java.lang.String str31 = timeStamp26.toUTCString();
    int i32 = timeStamp19.compareTo(timeStamp26);
    TimeStamp timeStamp34 = TimeStamp.getNtpTime((long)(short)1);
    long long35 = timeStamp34.getFraction();
    int i36 = timeStamp19.compareTo(timeStamp34);
    java.lang.String str37 = timeStamp34.toString();
    long long38 = timeStamp34.getFraction();
    boolean b40 = timeStamp34.equals((java.lang.Object)1.0f);
    TimeStamp timeStamp42 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date43 = timeStamp42.getDate();
    int i44 = timeStamp34.compareTo(timeStamp42);
    int i45 = timeStamp8.compareTo(timeStamp42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str6.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str13.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "83aa7e80.00418937"+ "'", str15.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Thu, Jan 01 1970 00:00:00.001"+ "'", str16.equals("Thu, Jan 01 1970 00:00:00.001"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str24.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str31.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long35 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "83aa7e80.00418937"+ "'", str37.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long38 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp3.getFraction();
    long long6 = timeStamp3.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 4294967L);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toUTCString();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    int i11 = timeStamp8.compareTo(timeStamp10);
    long long12 = timeStamp8.ntpValue();
    java.lang.String str13 = timeStamp8.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp8);
    TimeStamp timeStamp16 = TimeStamp.getNtpTime((long)(short)1);
    long long17 = timeStamp16.getFraction();
    int i18 = timeStamp1.compareTo(timeStamp16);
    java.lang.String str19 = timeStamp16.toString();
    long long20 = timeStamp16.getFraction();
    java.lang.String str21 = timeStamp16.toUTCString();
    long long22 = timeStamp16.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str6.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str13.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "83aa7e80.00418937"+ "'", str19.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str21.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 2208988800L);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toUTCString();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    int i11 = timeStamp8.compareTo(timeStamp10);
    long long12 = timeStamp8.ntpValue();
    java.lang.String str13 = timeStamp8.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp8);
    java.lang.String str15 = timeStamp8.toString();
    long long16 = timeStamp8.ntpValue();
    java.util.Date date17 = timeStamp8.getDate();
    long long18 = timeStamp8.getSeconds();
    TimeStamp timeStamp20 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp22 = TimeStamp.getNtpTime((long)(short)1);
    int i23 = timeStamp20.compareTo(timeStamp22);
    long long24 = timeStamp20.ntpValue();
    java.lang.String str25 = timeStamp20.toUTCString();
    TimeStamp timeStamp27 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp29 = TimeStamp.getNtpTime((long)(short)1);
    int i30 = timeStamp27.compareTo(timeStamp29);
    long long31 = timeStamp27.ntpValue();
    java.lang.String str32 = timeStamp27.toUTCString();
    int i33 = timeStamp20.compareTo(timeStamp27);
    java.lang.String str34 = timeStamp27.toString();
    java.lang.String str35 = timeStamp27.toDateString();
    long long36 = timeStamp27.getFraction();
    int i37 = timeStamp8.compareTo(timeStamp27);
    long long38 = timeStamp8.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str6.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str13.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "83aa7e80.00418937"+ "'", str15.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 2208988800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long24 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str25.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long31 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str32.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "83aa7e80.00418937"+ "'", str34.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Thu, Jan 01 1970 00:00:00.001"+ "'", str35.equals("Thu, Jan 01 1970 00:00:00.001"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long36 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long38 == 4294967L);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(1697018564385L);
    long long2 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 1653562408L);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    TimeStamp timeStamp1 = new TimeStamp((long)100);
    TimeStamp timeStamp3 = new TimeStamp((long)(byte)1);
    long long4 = timeStamp3.getTime();
    int i5 = timeStamp1.compareTo(timeStamp3);
    TimeStamp timeStamp7 = new TimeStamp((long)' ');
    int i8 = timeStamp3.compareTo(timeStamp7);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp12 = TimeStamp.getNtpTime((long)(short)1);
    int i13 = timeStamp10.compareTo(timeStamp12);
    long long14 = timeStamp10.ntpValue();
    java.lang.String str15 = timeStamp10.toDateString();
    TimeStamp timeStamp17 = new TimeStamp((long)100);
    long long18 = timeStamp17.getFraction();
    java.lang.String str19 = timeStamp17.toUTCString();
    TimeStamp timeStamp21 = new TimeStamp((long)100);
    long long22 = timeStamp21.getFraction();
    java.lang.String str23 = timeStamp21.toUTCString();
    boolean b24 = timeStamp17.equals((java.lang.Object)timeStamp21);
    int i25 = timeStamp10.compareTo(timeStamp17);
    boolean b26 = timeStamp7.equals((java.lang.Object)timeStamp17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Thu, Jan 01 1970 00:00:00.001"+ "'", str15.equals("Thu, Jan 01 1970 00:00:00.001"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str19.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str23.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    TimeStamp timeStamp1 = new TimeStamp((long)100);
    long long2 = timeStamp1.getFraction();
    java.lang.String str3 = timeStamp1.toUTCString();
    java.lang.String str4 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000064"+ "'", str4.equals("00000000.00000064"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(10L);
    java.lang.String str2 = timeStamp1.toDateString();
    long long3 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Jan 01 1970 00:00:00.010"+ "'", str2.equals("Thu, Jan 01 1970 00:00:00.010"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 10L);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    TimeStamp timeStamp1 = new TimeStamp(1L);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toUTCString();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    int i11 = timeStamp8.compareTo(timeStamp10);
    long long12 = timeStamp8.ntpValue();
    java.lang.String str13 = timeStamp8.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp8);
    TimeStamp timeStamp16 = new TimeStamp((long)'#');
    boolean b17 = timeStamp8.equals((java.lang.Object)timeStamp16);
    long long18 = timeStamp8.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str6.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str13.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 2208988800L);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(10L);
    java.lang.String str2 = timeStamp1.toString();
    long long3 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "83aa7e80.028f5c28"+ "'", str2.equals("83aa7e80.028f5c28"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 2208988800L);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Thu, Jan 01 1970 00:00:00.001 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toUTCString();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    int i11 = timeStamp8.compareTo(timeStamp10);
    long long12 = timeStamp8.ntpValue();
    java.lang.String str13 = timeStamp8.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp8);
    java.lang.String str15 = timeStamp8.toString();
    long long16 = timeStamp8.ntpValue();
    java.util.Date date17 = timeStamp8.getDate();
    java.lang.String str18 = timeStamp8.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str6.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str13.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "83aa7e80.00418937"+ "'", str15.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str18.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)100);
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    java.lang.String str4 = timeStamp3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "83aa7e80.19999999"+ "'", str4.equals("83aa7e80.19999999"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toUTCString();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    int i11 = timeStamp8.compareTo(timeStamp10);
    long long12 = timeStamp8.ntpValue();
    java.lang.String str13 = timeStamp8.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp8);
    TimeStamp timeStamp16 = TimeStamp.getNtpTime((long)(short)1);
    long long17 = timeStamp16.getFraction();
    int i18 = timeStamp1.compareTo(timeStamp16);
    java.lang.String str19 = timeStamp16.toString();
    long long20 = timeStamp16.getFraction();
    boolean b22 = timeStamp16.equals((java.lang.Object)1.0f);
    TimeStamp timeStamp24 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date25 = timeStamp24.getDate();
    int i26 = timeStamp16.compareTo(timeStamp24);
    long long27 = timeStamp16.getSeconds();
    long long28 = timeStamp16.getSeconds();
    java.util.Date date29 = timeStamp16.getDate();
    TimeStamp timeStamp30 = new TimeStamp(date29);
    java.lang.String str31 = timeStamp30.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str6.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str13.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "83aa7e80.00418937"+ "'", str19.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == 2208988800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long28 == 2208988800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str31.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(10L);
    java.lang.String str2 = timeStamp1.toString();
    java.lang.String str3 = timeStamp1.toDateString();
    long long4 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "83aa7e80.028f5c28"+ "'", str2.equals("83aa7e80.028f5c28"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Jan 01 1970 00:00:00.010"+ "'", str3.equals("Thu, Jan 01 1970 00:00:00.010"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 42949672L);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    java.lang.String str1 = TimeStamp.toString((-1670570185740821464L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f144.628f5c28"+ "'", str1.equals("e8d0f144.628f5c28"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    TimeStamp timeStamp1 = new TimeStamp((long)' ');
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp5 = TimeStamp.getNtpTime((long)(short)1);
    int i6 = timeStamp3.compareTo(timeStamp5);
    long long7 = timeStamp3.ntpValue();
    java.lang.String str8 = timeStamp3.toUTCString();
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp12 = TimeStamp.getNtpTime((long)(short)1);
    int i13 = timeStamp10.compareTo(timeStamp12);
    long long14 = timeStamp10.ntpValue();
    java.lang.String str15 = timeStamp10.toUTCString();
    int i16 = timeStamp3.compareTo(timeStamp10);
    TimeStamp timeStamp18 = TimeStamp.getNtpTime((long)(short)1);
    long long19 = timeStamp18.getFraction();
    int i20 = timeStamp3.compareTo(timeStamp18);
    java.lang.String str21 = timeStamp18.toString();
    long long22 = timeStamp18.getFraction();
    boolean b24 = timeStamp18.equals((java.lang.Object)1.0f);
    TimeStamp timeStamp26 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date27 = timeStamp26.getDate();
    int i28 = timeStamp18.compareTo(timeStamp26);
    boolean b29 = timeStamp1.equals((java.lang.Object)i28);
    long long30 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str8.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str15.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "83aa7e80.00418937"+ "'", str21.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == 0L);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toUTCString();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    int i11 = timeStamp8.compareTo(timeStamp10);
    long long12 = timeStamp8.ntpValue();
    java.lang.String str13 = timeStamp8.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp8);
    TimeStamp timeStamp16 = TimeStamp.getNtpTime((long)(short)1);
    long long17 = timeStamp16.getFraction();
    int i18 = timeStamp1.compareTo(timeStamp16);
    java.lang.String str19 = timeStamp16.toString();
    long long20 = timeStamp16.getFraction();
    boolean b22 = timeStamp16.equals((java.lang.Object)1.0f);
    TimeStamp timeStamp24 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date25 = timeStamp24.getDate();
    int i26 = timeStamp16.compareTo(timeStamp24);
    long long27 = timeStamp16.getSeconds();
    TimeStamp timeStamp29 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp31 = TimeStamp.getNtpTime((long)(short)1);
    int i32 = timeStamp29.compareTo(timeStamp31);
    long long33 = timeStamp29.ntpValue();
    java.lang.String str34 = timeStamp29.toUTCString();
    TimeStamp timeStamp36 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp38 = TimeStamp.getNtpTime((long)(short)1);
    int i39 = timeStamp36.compareTo(timeStamp38);
    long long40 = timeStamp36.ntpValue();
    java.lang.String str41 = timeStamp36.toUTCString();
    int i42 = timeStamp29.compareTo(timeStamp36);
    TimeStamp timeStamp44 = TimeStamp.getNtpTime((long)(short)1);
    long long45 = timeStamp44.getFraction();
    int i46 = timeStamp29.compareTo(timeStamp44);
    java.lang.String str47 = timeStamp44.toString();
    long long48 = timeStamp44.getFraction();
    boolean b50 = timeStamp44.equals((java.lang.Object)1.0f);
    TimeStamp timeStamp52 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date53 = timeStamp52.getDate();
    int i54 = timeStamp44.compareTo(timeStamp52);
    long long55 = timeStamp44.getSeconds();
    boolean b56 = timeStamp16.equals((java.lang.Object)timeStamp44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str6.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str13.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "83aa7e80.00418937"+ "'", str19.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == 2208988800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str34.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long40 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str41.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long45 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "83aa7e80.00418937"+ "'", str47.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long48 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long55 == 2208988800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    java.lang.String str1 = TimeStamp.toString((long)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000064"+ "'", str1.equals("00000000.00000064"));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    TimeStamp timeStamp1 = new TimeStamp((long)100);
    long long2 = timeStamp1.getFraction();
    java.lang.String str3 = timeStamp1.toUTCString();
    TimeStamp timeStamp5 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp7 = TimeStamp.getNtpTime((long)(short)1);
    int i8 = timeStamp5.compareTo(timeStamp7);
    long long9 = timeStamp5.ntpValue();
    java.lang.String str10 = timeStamp5.toUTCString();
    TimeStamp timeStamp12 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp14 = TimeStamp.getNtpTime((long)(short)1);
    int i15 = timeStamp12.compareTo(timeStamp14);
    long long16 = timeStamp12.ntpValue();
    java.lang.String str17 = timeStamp12.toUTCString();
    int i18 = timeStamp5.compareTo(timeStamp12);
    TimeStamp timeStamp20 = TimeStamp.getNtpTime((long)(short)1);
    long long21 = timeStamp20.getFraction();
    int i22 = timeStamp5.compareTo(timeStamp20);
    java.lang.String str23 = timeStamp20.toString();
    long long24 = timeStamp20.getFraction();
    boolean b26 = timeStamp20.equals((java.lang.Object)1.0f);
    TimeStamp timeStamp28 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date29 = timeStamp28.getDate();
    int i30 = timeStamp20.compareTo(timeStamp28);
    long long31 = timeStamp20.getSeconds();
    long long32 = timeStamp20.ntpValue();
    java.lang.String str33 = timeStamp20.toDateString();
    int i34 = timeStamp1.compareTo(timeStamp20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str10.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str17.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "83aa7e80.00418937"+ "'", str23.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long24 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long31 == 2208988800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long32 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Thu, Jan 01 1970 00:00:00.001"+ "'", str33.equals("Thu, Jan 01 1970 00:00:00.001"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    java.lang.String str1 = TimeStamp.toString((-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "83aa7e80.00418937"+ "'", str1.equals("83aa7e80.00418937"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toUTCString();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    int i11 = timeStamp8.compareTo(timeStamp10);
    long long12 = timeStamp8.ntpValue();
    java.lang.String str13 = timeStamp8.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp8);
    java.lang.String str15 = timeStamp8.toString();
    long long16 = timeStamp8.ntpValue();
    java.util.Date date17 = timeStamp8.getDate();
    long long18 = timeStamp8.getSeconds();
    TimeStamp timeStamp20 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp22 = TimeStamp.getNtpTime((long)(short)1);
    int i23 = timeStamp20.compareTo(timeStamp22);
    long long24 = timeStamp20.ntpValue();
    java.lang.String str25 = timeStamp20.toUTCString();
    TimeStamp timeStamp27 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp29 = TimeStamp.getNtpTime((long)(short)1);
    int i30 = timeStamp27.compareTo(timeStamp29);
    long long31 = timeStamp27.ntpValue();
    java.lang.String str32 = timeStamp27.toUTCString();
    int i33 = timeStamp20.compareTo(timeStamp27);
    java.lang.String str34 = timeStamp27.toString();
    java.lang.String str35 = timeStamp27.toDateString();
    long long36 = timeStamp27.getFraction();
    int i37 = timeStamp8.compareTo(timeStamp27);
    TimeStamp timeStamp39 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp41 = TimeStamp.getNtpTime((long)(short)1);
    int i42 = timeStamp39.compareTo(timeStamp41);
    long long43 = timeStamp39.ntpValue();
    java.lang.String str44 = timeStamp39.toUTCString();
    TimeStamp timeStamp46 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp48 = TimeStamp.getNtpTime((long)(short)1);
    int i49 = timeStamp46.compareTo(timeStamp48);
    long long50 = timeStamp46.ntpValue();
    java.lang.String str51 = timeStamp46.toUTCString();
    int i52 = timeStamp39.compareTo(timeStamp46);
    TimeStamp timeStamp54 = TimeStamp.getNtpTime((long)(short)1);
    long long55 = timeStamp54.getFraction();
    int i56 = timeStamp39.compareTo(timeStamp54);
    java.lang.String str57 = timeStamp54.toString();
    long long58 = timeStamp54.getFraction();
    boolean b60 = timeStamp54.equals((java.lang.Object)1.0f);
    TimeStamp timeStamp62 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date63 = timeStamp62.getDate();
    int i64 = timeStamp54.compareTo(timeStamp62);
    boolean b65 = timeStamp8.equals((java.lang.Object)timeStamp54);
    TimeStamp timeStamp67 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp69 = TimeStamp.getNtpTime((long)(short)1);
    int i70 = timeStamp67.compareTo(timeStamp69);
    long long71 = timeStamp67.ntpValue();
    java.lang.String str72 = timeStamp67.toUTCString();
    TimeStamp timeStamp74 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp76 = TimeStamp.getNtpTime((long)(short)1);
    int i77 = timeStamp74.compareTo(timeStamp76);
    long long78 = timeStamp74.ntpValue();
    java.lang.String str79 = timeStamp74.toUTCString();
    int i80 = timeStamp67.compareTo(timeStamp74);
    TimeStamp timeStamp82 = TimeStamp.getNtpTime((long)(short)1);
    long long83 = timeStamp82.getFraction();
    int i84 = timeStamp67.compareTo(timeStamp82);
    java.lang.String str85 = timeStamp82.toString();
    long long86 = timeStamp82.getFraction();
    boolean b88 = timeStamp82.equals((java.lang.Object)1.0f);
    TimeStamp timeStamp90 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date91 = timeStamp90.getDate();
    int i92 = timeStamp82.compareTo(timeStamp90);
    long long93 = timeStamp82.getSeconds();
    int i94 = timeStamp8.compareTo(timeStamp82);
    boolean b96 = timeStamp8.equals((java.lang.Object)"Thu, Feb 07 2036 06:28:16.000 UTC");
    long long97 = timeStamp8.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str6.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str13.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "83aa7e80.00418937"+ "'", str15.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 2208988800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long24 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str25.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long31 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str32.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "83aa7e80.00418937"+ "'", str34.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Thu, Jan 01 1970 00:00:00.001"+ "'", str35.equals("Thu, Jan 01 1970 00:00:00.001"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long36 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long43 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str44.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long50 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str51.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long55 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "83aa7e80.00418937"+ "'", str57.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long58 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long71 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str72.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long78 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str79.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long83 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str85 + "' != '" + "83aa7e80.00418937"+ "'", str85.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long86 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long93 == 2208988800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long97 == 1L);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    TimeStamp timeStamp1 = new TimeStamp((long)100);
    java.lang.String str2 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000064"+ "'", str2.equals("00000000.00000064"));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    TimeStamp timeStamp1 = new TimeStamp((long)'4');

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    TimeStamp timeStamp1 = new TimeStamp((long)100);
    TimeStamp timeStamp3 = new TimeStamp((long)(byte)1);
    long long4 = timeStamp3.getTime();
    int i5 = timeStamp1.compareTo(timeStamp3);
    java.lang.String str6 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str6.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)'4');
    boolean b3 = timeStamp1.equals((java.lang.Object)"e8d0f144.628f5c28");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    TimeStamp timeStamp1 = new TimeStamp((long)100);
    long long2 = timeStamp1.getFraction();
    long long3 = timeStamp1.getTime();
    long long4 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    java.lang.String str1 = TimeStamp.toString((-8959209420255928517L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "83aa7e80.0d4fdf3b"+ "'", str1.equals("83aa7e80.0d4fdf3b"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toUTCString();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    int i11 = timeStamp8.compareTo(timeStamp10);
    long long12 = timeStamp8.ntpValue();
    java.lang.String str13 = timeStamp8.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp8);
    java.lang.String str15 = timeStamp8.toString();
    java.lang.String str16 = timeStamp8.toDateString();
    long long17 = timeStamp8.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str6.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str13.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "83aa7e80.00418937"+ "'", str15.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Thu, Jan 01 1970 00:00:00.001"+ "'", str16.equals("Thu, Jan 01 1970 00:00:00.001"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 1L);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)'4');
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp5 = TimeStamp.getNtpTime((long)(short)1);
    int i6 = timeStamp3.compareTo(timeStamp5);
    long long7 = timeStamp3.ntpValue();
    java.lang.String str8 = timeStamp3.toDateString();
    TimeStamp timeStamp10 = new TimeStamp((long)100);
    long long11 = timeStamp10.getFraction();
    java.lang.String str12 = timeStamp10.toUTCString();
    TimeStamp timeStamp14 = new TimeStamp((long)100);
    long long15 = timeStamp14.getFraction();
    java.lang.String str16 = timeStamp14.toUTCString();
    boolean b17 = timeStamp10.equals((java.lang.Object)timeStamp14);
    int i18 = timeStamp3.compareTo(timeStamp10);
    int i19 = timeStamp1.compareTo(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Thu, Jan 01 1970 00:00:00.001"+ "'", str8.equals("Thu, Jan 01 1970 00:00:00.001"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str12.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str16.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Thu, Feb 07 2036 06:28:16.000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    java.lang.String str1 = TimeStamp.toString(10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.0000000a"+ "'", str1.equals("00000000.0000000a"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)'4');
    boolean b3 = timeStamp1.equals((java.lang.Object)(-1.0f));
    long long4 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2208988800L);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)'4');
    java.lang.String str2 = timeStamp1.toDateString();
    long long3 = timeStamp1.ntpValue();
    long long4 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Jan 01 1970 00:00:00.052"+ "'", str2.equals("Thu, Jan 01 1970 00:00:00.052"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-8959209420255928517L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 223338299L);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toUTCString();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    int i11 = timeStamp8.compareTo(timeStamp10);
    long long12 = timeStamp8.ntpValue();
    java.lang.String str13 = timeStamp8.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp8);
    TimeStamp timeStamp16 = TimeStamp.getNtpTime((long)(short)1);
    long long17 = timeStamp16.getFraction();
    int i18 = timeStamp1.compareTo(timeStamp16);
    java.lang.String str19 = timeStamp16.toString();
    long long20 = timeStamp16.getFraction();
    boolean b22 = timeStamp16.equals((java.lang.Object)1.0f);
    TimeStamp timeStamp24 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date25 = timeStamp24.getDate();
    int i26 = timeStamp16.compareTo(timeStamp24);
    long long27 = timeStamp24.getFraction();
    long long28 = timeStamp24.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str6.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str13.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "83aa7e80.00418937"+ "'", str19.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long28 == 2208988800L);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toUTCString();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    int i11 = timeStamp8.compareTo(timeStamp10);
    long long12 = timeStamp8.ntpValue();
    java.lang.String str13 = timeStamp8.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp8);
    TimeStamp timeStamp16 = TimeStamp.getNtpTime((long)(short)1);
    long long17 = timeStamp16.getFraction();
    int i18 = timeStamp1.compareTo(timeStamp16);
    java.lang.String str19 = timeStamp16.toString();
    long long20 = timeStamp16.getFraction();
    boolean b22 = timeStamp16.equals((java.lang.Object)1.0f);
    long long23 = timeStamp16.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str6.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str13.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "83aa7e80.00418937"+ "'", str19.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 4294967L);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000064");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    TimeStamp timeStamp1 = new TimeStamp((long)100);
    long long2 = timeStamp1.getFraction();
    long long3 = timeStamp1.getSeconds();
    java.lang.String str4 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str4.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    TimeStamp timeStamp1 = new TimeStamp("e8d0f144.628f5c28");

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp4 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp6 = TimeStamp.getNtpTime((long)(short)1);
    int i7 = timeStamp4.compareTo(timeStamp6);
    long long8 = timeStamp4.ntpValue();
    java.lang.String str9 = timeStamp4.toUTCString();
    TimeStamp timeStamp11 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp13 = TimeStamp.getNtpTime((long)(short)1);
    int i14 = timeStamp11.compareTo(timeStamp13);
    long long15 = timeStamp11.ntpValue();
    java.lang.String str16 = timeStamp11.toUTCString();
    int i17 = timeStamp4.compareTo(timeStamp11);
    java.lang.String str18 = timeStamp11.toDateString();
    int i19 = timeStamp1.compareTo(timeStamp11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str9.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str16.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Thu, Jan 01 1970 00:00:00.001"+ "'", str18.equals("Thu, Jan 01 1970 00:00:00.001"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toUTCString();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    int i11 = timeStamp8.compareTo(timeStamp10);
    long long12 = timeStamp8.ntpValue();
    java.lang.String str13 = timeStamp8.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp8);
    TimeStamp timeStamp16 = TimeStamp.getNtpTime((long)(short)1);
    long long17 = timeStamp16.getFraction();
    int i18 = timeStamp1.compareTo(timeStamp16);
    java.lang.String str19 = timeStamp16.toString();
    long long20 = timeStamp16.getFraction();
    boolean b22 = timeStamp16.equals((java.lang.Object)1.0f);
    TimeStamp timeStamp24 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date25 = timeStamp24.getDate();
    int i26 = timeStamp16.compareTo(timeStamp24);
    long long27 = timeStamp16.getSeconds();
    long long28 = timeStamp16.ntpValue();
    TimeStamp timeStamp30 = TimeStamp.getNtpTime(10L);
    java.lang.String str31 = timeStamp30.toUTCString();
    java.lang.String str32 = timeStamp30.toUTCString();
    int i33 = timeStamp16.compareTo(timeStamp30);
    java.lang.String str34 = timeStamp30.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str6.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str13.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "83aa7e80.00418937"+ "'", str19.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == 2208988800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long28 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Thu, Jan 01 1970 00:00:00.010 UTC"+ "'", str31.equals("Thu, Jan 01 1970 00:00:00.010 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Thu, Jan 01 1970 00:00:00.010 UTC"+ "'", str32.equals("Thu, Jan 01 1970 00:00:00.010 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Thu, Jan 01 1970 00:00:00.010 UTC"+ "'", str34.equals("Thu, Jan 01 1970 00:00:00.010 UTC"));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    long long1 = TimeStamp.getTime(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(1697018564385L);
    long long2 = timeStamp1.ntpValue();
    java.lang.String str3 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1670570185740821464L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Wed, Oct 11 2023 10:02:44.385"+ "'", str3.equals("Wed, Oct 11 2023 10:02:44.385"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    TimeStamp timeStamp4 = new TimeStamp(date2);
    TimeStamp timeStamp6 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)1);
    int i9 = timeStamp6.compareTo(timeStamp8);
    long long10 = timeStamp6.ntpValue();
    java.lang.String str11 = timeStamp6.toUTCString();
    TimeStamp timeStamp13 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp15 = TimeStamp.getNtpTime((long)(short)1);
    int i16 = timeStamp13.compareTo(timeStamp15);
    long long17 = timeStamp13.ntpValue();
    java.lang.String str18 = timeStamp13.toUTCString();
    int i19 = timeStamp6.compareTo(timeStamp13);
    java.lang.String str20 = timeStamp13.toString();
    long long21 = timeStamp13.ntpValue();
    int i22 = timeStamp4.compareTo(timeStamp13);
    java.lang.String str23 = timeStamp13.toUTCString();
    java.lang.String str24 = timeStamp13.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str11.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str18.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "83aa7e80.00418937"+ "'", str20.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str23.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str24.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toUTCString();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    int i11 = timeStamp8.compareTo(timeStamp10);
    long long12 = timeStamp8.ntpValue();
    java.lang.String str13 = timeStamp8.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp8);
    java.lang.String str15 = timeStamp8.toDateString();
    TimeStamp timeStamp17 = new TimeStamp((long)' ');
    TimeStamp timeStamp19 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp21 = TimeStamp.getNtpTime((long)(short)1);
    int i22 = timeStamp19.compareTo(timeStamp21);
    long long23 = timeStamp19.ntpValue();
    java.lang.String str24 = timeStamp19.toUTCString();
    TimeStamp timeStamp26 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp28 = TimeStamp.getNtpTime((long)(short)1);
    int i29 = timeStamp26.compareTo(timeStamp28);
    long long30 = timeStamp26.ntpValue();
    java.lang.String str31 = timeStamp26.toUTCString();
    int i32 = timeStamp19.compareTo(timeStamp26);
    TimeStamp timeStamp34 = TimeStamp.getNtpTime((long)(short)1);
    long long35 = timeStamp34.getFraction();
    int i36 = timeStamp19.compareTo(timeStamp34);
    java.lang.String str37 = timeStamp34.toString();
    long long38 = timeStamp34.getFraction();
    boolean b40 = timeStamp34.equals((java.lang.Object)1.0f);
    TimeStamp timeStamp42 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date43 = timeStamp42.getDate();
    int i44 = timeStamp34.compareTo(timeStamp42);
    boolean b45 = timeStamp17.equals((java.lang.Object)i44);
    boolean b46 = timeStamp8.equals((java.lang.Object)b45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str6.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str13.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Thu, Jan 01 1970 00:00:00.001"+ "'", str15.equals("Thu, Jan 01 1970 00:00:00.001"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str24.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str31.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long35 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "83aa7e80.00418937"+ "'", str37.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long38 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    long long1 = TimeStamp.getTime(1697018564972L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978891118L);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    TimeStamp timeStamp1 = new TimeStamp((long)'#');
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp5 = TimeStamp.getNtpTime((long)(short)1);
    int i6 = timeStamp3.compareTo(timeStamp5);
    long long7 = timeStamp3.ntpValue();
    java.lang.String str8 = timeStamp3.toUTCString();
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp12 = TimeStamp.getNtpTime((long)(short)1);
    int i13 = timeStamp10.compareTo(timeStamp12);
    long long14 = timeStamp10.ntpValue();
    java.lang.String str15 = timeStamp10.toUTCString();
    int i16 = timeStamp3.compareTo(timeStamp10);
    TimeStamp timeStamp18 = TimeStamp.getNtpTime((long)(short)1);
    long long19 = timeStamp18.getFraction();
    int i20 = timeStamp3.compareTo(timeStamp18);
    java.lang.String str21 = timeStamp18.toString();
    long long22 = timeStamp18.getFraction();
    java.lang.String str23 = timeStamp18.toUTCString();
    int i24 = timeStamp1.compareTo(timeStamp18);
    java.lang.String str25 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str8.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str15.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "83aa7e80.00418937"+ "'", str21.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str23.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str25.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toUTCString();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    int i11 = timeStamp8.compareTo(timeStamp10);
    long long12 = timeStamp8.ntpValue();
    java.lang.String str13 = timeStamp8.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp8);
    long long15 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str6.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str13.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == (-8959209420474971849L));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)0);
    java.lang.String str2 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Jan 01 1970 00:00:00.000"+ "'", str2.equals("Thu, Jan 01 1970 00:00:00.000"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    long long1 = TimeStamp.getTime(1697018564385L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978891118L);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    java.lang.String str1 = TimeStamp.toString((long)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000020"+ "'", str1.equals("00000000.00000020"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(10L);
    java.lang.String str2 = timeStamp1.toDateString();
    java.util.Date date3 = timeStamp1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Jan 01 1970 00:00:00.010"+ "'", str2.equals("Thu, Jan 01 1970 00:00:00.010"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    TimeStamp timeStamp1 = new TimeStamp((long)100);
    long long2 = timeStamp1.getFraction();
    java.lang.String str3 = timeStamp1.toUTCString();
    long long4 = timeStamp1.getFraction();
    java.util.Date date5 = timeStamp1.getDate();
    TimeStamp timeStamp7 = new TimeStamp((long)100);
    TimeStamp timeStamp9 = new TimeStamp((long)(byte)1);
    long long10 = timeStamp9.getTime();
    int i11 = timeStamp7.compareTo(timeStamp9);
    boolean b13 = timeStamp9.equals((java.lang.Object)100.0f);
    int i14 = timeStamp1.compareTo(timeStamp9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    long long1 = TimeStamp.getTime(100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    TimeStamp timeStamp1 = new TimeStamp(42949672L);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    TimeStamp timeStamp1 = new TimeStamp(0L);
    java.lang.String str2 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000000"+ "'", str2.equals("00000000.00000000"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    long long1 = TimeStamp.getTime(1653562408L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496385L);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    TimeStamp timeStamp1 = new TimeStamp((long)100);
    long long2 = timeStamp1.getFraction();
    java.util.Date date3 = timeStamp1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    TimeStamp timeStamp1 = new TimeStamp(2085978496000L);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date4 = timeStamp3.getDate();
    TimeStamp timeStamp5 = new TimeStamp(date4);
    TimeStamp timeStamp6 = new TimeStamp(date4);
    TimeStamp timeStamp7 = new TimeStamp(date4);
    int i8 = timeStamp1.compareTo(timeStamp7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    java.util.Date date4 = timeStamp3.getDate();
    TimeStamp timeStamp5 = new TimeStamp(date4);
    TimeStamp timeStamp6 = new TimeStamp(date4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date4);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000001");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    TimeStamp timeStamp1 = new TimeStamp((long)'#');
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp5 = TimeStamp.getNtpTime((long)(short)1);
    int i6 = timeStamp3.compareTo(timeStamp5);
    long long7 = timeStamp3.ntpValue();
    java.lang.String str8 = timeStamp3.toUTCString();
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp12 = TimeStamp.getNtpTime((long)(short)1);
    int i13 = timeStamp10.compareTo(timeStamp12);
    long long14 = timeStamp10.ntpValue();
    java.lang.String str15 = timeStamp10.toUTCString();
    int i16 = timeStamp3.compareTo(timeStamp10);
    TimeStamp timeStamp18 = TimeStamp.getNtpTime((long)(short)1);
    long long19 = timeStamp18.getFraction();
    int i20 = timeStamp3.compareTo(timeStamp18);
    java.lang.String str21 = timeStamp18.toString();
    long long22 = timeStamp18.getFraction();
    java.lang.String str23 = timeStamp18.toUTCString();
    int i24 = timeStamp1.compareTo(timeStamp18);
    long long25 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str8.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str15.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "83aa7e80.00418937"+ "'", str21.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str23.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 35L);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    java.util.Date date6 = timeStamp1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date6);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    long long1 = TimeStamp.getTime((long)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    TimeStamp timeStamp1 = new TimeStamp((long)100);
    TimeStamp timeStamp3 = new TimeStamp((long)(byte)1);
    long long4 = timeStamp3.getTime();
    int i5 = timeStamp1.compareTo(timeStamp3);
    TimeStamp timeStamp7 = new TimeStamp((long)' ');
    int i8 = timeStamp3.compareTo(timeStamp7);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp12 = TimeStamp.getNtpTime((long)(short)1);
    int i13 = timeStamp10.compareTo(timeStamp12);
    long long14 = timeStamp10.ntpValue();
    java.lang.String str15 = timeStamp10.toUTCString();
    TimeStamp timeStamp17 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp19 = TimeStamp.getNtpTime((long)(short)1);
    int i20 = timeStamp17.compareTo(timeStamp19);
    long long21 = timeStamp17.ntpValue();
    java.lang.String str22 = timeStamp17.toUTCString();
    int i23 = timeStamp10.compareTo(timeStamp17);
    java.lang.String str24 = timeStamp17.toString();
    long long25 = timeStamp17.ntpValue();
    java.util.Date date26 = timeStamp17.getDate();
    long long27 = timeStamp17.getSeconds();
    int i28 = timeStamp7.compareTo(timeStamp17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str15.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str22.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "83aa7e80.00418937"+ "'", str24.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == 2208988800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toUTCString();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    int i11 = timeStamp8.compareTo(timeStamp10);
    long long12 = timeStamp8.ntpValue();
    java.lang.String str13 = timeStamp8.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp8);
    TimeStamp timeStamp16 = TimeStamp.getNtpTime((long)(short)1);
    long long17 = timeStamp16.getFraction();
    int i18 = timeStamp1.compareTo(timeStamp16);
    java.lang.String str19 = timeStamp16.toString();
    long long20 = timeStamp16.getFraction();
    boolean b22 = timeStamp16.equals((java.lang.Object)1.0f);
    TimeStamp timeStamp24 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date25 = timeStamp24.getDate();
    int i26 = timeStamp16.compareTo(timeStamp24);
    long long27 = timeStamp24.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str6.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str13.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "83aa7e80.00418937"+ "'", str19.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == 2208988800L);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    TimeStamp timeStamp1 = new TimeStamp((long)100);
    TimeStamp timeStamp3 = new TimeStamp((long)(byte)1);
    long long4 = timeStamp3.getTime();
    int i5 = timeStamp1.compareTo(timeStamp3);
    boolean b7 = timeStamp3.equals((java.lang.Object)100.0f);
    TimeStamp timeStamp9 = TimeStamp.getNtpTime((long)'4');
    boolean b11 = timeStamp9.equals((java.lang.Object)(-1.0f));
    int i12 = timeStamp3.compareTo(timeStamp9);
    java.lang.String str13 = timeStamp3.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str13.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    TimeStamp timeStamp1 = new TimeStamp((long)1);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date4 = timeStamp3.getDate();
    boolean b5 = timeStamp1.equals((java.lang.Object)timeStamp3);
    java.util.Date date6 = timeStamp3.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date6);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toUTCString();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    int i11 = timeStamp8.compareTo(timeStamp10);
    long long12 = timeStamp8.ntpValue();
    java.lang.String str13 = timeStamp8.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp8);
    java.lang.String str15 = timeStamp8.toString();
    java.lang.String str16 = timeStamp8.toDateString();
    boolean b18 = timeStamp8.equals((java.lang.Object)"hi!");
    java.util.Date date19 = timeStamp8.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str6.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str13.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "83aa7e80.00418937"+ "'", str15.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Thu, Jan 01 1970 00:00:00.001"+ "'", str16.equals("Thu, Jan 01 1970 00:00:00.001"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date19);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)100);
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    TimeStamp timeStamp4 = new TimeStamp(date2);
    TimeStamp timeStamp5 = new TimeStamp(date2);
    java.util.Date date6 = timeStamp5.getDate();
    TimeStamp timeStamp7 = new TimeStamp(date6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date6);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toUTCString();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    int i11 = timeStamp8.compareTo(timeStamp10);
    long long12 = timeStamp8.ntpValue();
    java.lang.String str13 = timeStamp8.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp8);
    java.lang.String str15 = timeStamp8.toString();
    long long16 = timeStamp8.ntpValue();
    java.util.Date date17 = timeStamp8.getDate();
    long long18 = timeStamp8.getSeconds();
    TimeStamp timeStamp20 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp22 = TimeStamp.getNtpTime((long)(short)1);
    int i23 = timeStamp20.compareTo(timeStamp22);
    long long24 = timeStamp20.ntpValue();
    java.lang.String str25 = timeStamp20.toUTCString();
    TimeStamp timeStamp27 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp29 = TimeStamp.getNtpTime((long)(short)1);
    int i30 = timeStamp27.compareTo(timeStamp29);
    long long31 = timeStamp27.ntpValue();
    java.lang.String str32 = timeStamp27.toUTCString();
    int i33 = timeStamp20.compareTo(timeStamp27);
    java.lang.String str34 = timeStamp27.toString();
    java.lang.String str35 = timeStamp27.toDateString();
    long long36 = timeStamp27.getFraction();
    int i37 = timeStamp8.compareTo(timeStamp27);
    TimeStamp timeStamp39 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp41 = TimeStamp.getNtpTime((long)(short)1);
    int i42 = timeStamp39.compareTo(timeStamp41);
    long long43 = timeStamp39.ntpValue();
    java.lang.String str44 = timeStamp39.toUTCString();
    TimeStamp timeStamp46 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp48 = TimeStamp.getNtpTime((long)(short)1);
    int i49 = timeStamp46.compareTo(timeStamp48);
    long long50 = timeStamp46.ntpValue();
    java.lang.String str51 = timeStamp46.toUTCString();
    int i52 = timeStamp39.compareTo(timeStamp46);
    TimeStamp timeStamp54 = TimeStamp.getNtpTime((long)(short)1);
    long long55 = timeStamp54.getFraction();
    int i56 = timeStamp39.compareTo(timeStamp54);
    java.lang.String str57 = timeStamp54.toString();
    long long58 = timeStamp54.getFraction();
    boolean b60 = timeStamp54.equals((java.lang.Object)1.0f);
    TimeStamp timeStamp62 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date63 = timeStamp62.getDate();
    int i64 = timeStamp54.compareTo(timeStamp62);
    boolean b65 = timeStamp8.equals((java.lang.Object)timeStamp54);
    TimeStamp timeStamp67 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp69 = TimeStamp.getNtpTime((long)(short)1);
    int i70 = timeStamp67.compareTo(timeStamp69);
    long long71 = timeStamp67.ntpValue();
    java.lang.String str72 = timeStamp67.toUTCString();
    TimeStamp timeStamp74 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp76 = TimeStamp.getNtpTime((long)(short)1);
    int i77 = timeStamp74.compareTo(timeStamp76);
    long long78 = timeStamp74.ntpValue();
    java.lang.String str79 = timeStamp74.toUTCString();
    int i80 = timeStamp67.compareTo(timeStamp74);
    TimeStamp timeStamp82 = TimeStamp.getNtpTime((long)(short)1);
    long long83 = timeStamp82.getFraction();
    int i84 = timeStamp67.compareTo(timeStamp82);
    java.lang.String str85 = timeStamp82.toString();
    long long86 = timeStamp82.getFraction();
    boolean b88 = timeStamp82.equals((java.lang.Object)1.0f);
    TimeStamp timeStamp90 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date91 = timeStamp90.getDate();
    int i92 = timeStamp82.compareTo(timeStamp90);
    long long93 = timeStamp82.getSeconds();
    int i94 = timeStamp8.compareTo(timeStamp82);
    long long95 = timeStamp82.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str6.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str13.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "83aa7e80.00418937"+ "'", str15.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 2208988800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long24 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str25.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long31 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str32.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "83aa7e80.00418937"+ "'", str34.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Thu, Jan 01 1970 00:00:00.001"+ "'", str35.equals("Thu, Jan 01 1970 00:00:00.001"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long36 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long43 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str44.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long50 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str51.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long55 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "83aa7e80.00418937"+ "'", str57.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long58 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long71 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str72.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long78 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str79.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long83 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str85 + "' != '" + "83aa7e80.00418937"+ "'", str85.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long86 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long93 == 2208988800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long95 == (-8959209420474971849L));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    TimeStamp timeStamp1 = new TimeStamp((long)'#');
    java.lang.Object obj2 = new java.lang.Object();
    boolean b3 = timeStamp1.equals(obj2);
    TimeStamp timeStamp5 = new TimeStamp(2085978496000L);
    int i6 = timeStamp1.compareTo(timeStamp5);
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)100);
    java.util.Date date9 = timeStamp8.getDate();
    TimeStamp timeStamp10 = new TimeStamp(date9);
    boolean b11 = timeStamp5.equals((java.lang.Object)timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(short)10);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    TimeStamp timeStamp1 = new TimeStamp("00000000.00000020");

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((long)(short)1);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toUTCString();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)1);
    int i11 = timeStamp8.compareTo(timeStamp10);
    long long12 = timeStamp8.ntpValue();
    java.lang.String str13 = timeStamp8.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp8);
    java.lang.String str15 = timeStamp8.toString();
    long long16 = timeStamp8.ntpValue();
    java.util.Date date17 = timeStamp8.getDate();
    long long18 = timeStamp8.getSeconds();
    TimeStamp timeStamp20 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp22 = TimeStamp.getNtpTime((long)(short)1);
    int i23 = timeStamp20.compareTo(timeStamp22);
    long long24 = timeStamp20.ntpValue();
    java.lang.String str25 = timeStamp20.toUTCString();
    TimeStamp timeStamp27 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp29 = TimeStamp.getNtpTime((long)(short)1);
    int i30 = timeStamp27.compareTo(timeStamp29);
    long long31 = timeStamp27.ntpValue();
    java.lang.String str32 = timeStamp27.toUTCString();
    int i33 = timeStamp20.compareTo(timeStamp27);
    java.lang.String str34 = timeStamp27.toString();
    java.lang.String str35 = timeStamp27.toDateString();
    long long36 = timeStamp27.getFraction();
    int i37 = timeStamp8.compareTo(timeStamp27);
    TimeStamp timeStamp39 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp41 = TimeStamp.getNtpTime((long)(short)1);
    int i42 = timeStamp39.compareTo(timeStamp41);
    long long43 = timeStamp39.ntpValue();
    java.lang.String str44 = timeStamp39.toUTCString();
    TimeStamp timeStamp46 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp48 = TimeStamp.getNtpTime((long)(short)1);
    int i49 = timeStamp46.compareTo(timeStamp48);
    long long50 = timeStamp46.ntpValue();
    java.lang.String str51 = timeStamp46.toUTCString();
    int i52 = timeStamp39.compareTo(timeStamp46);
    TimeStamp timeStamp54 = TimeStamp.getNtpTime((long)(short)1);
    long long55 = timeStamp54.getFraction();
    int i56 = timeStamp39.compareTo(timeStamp54);
    java.lang.String str57 = timeStamp54.toString();
    long long58 = timeStamp54.getFraction();
    boolean b60 = timeStamp54.equals((java.lang.Object)1.0f);
    TimeStamp timeStamp62 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date63 = timeStamp62.getDate();
    int i64 = timeStamp54.compareTo(timeStamp62);
    boolean b65 = timeStamp8.equals((java.lang.Object)timeStamp54);
    TimeStamp timeStamp67 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp69 = TimeStamp.getNtpTime((long)(short)1);
    int i70 = timeStamp67.compareTo(timeStamp69);
    long long71 = timeStamp67.ntpValue();
    java.lang.String str72 = timeStamp67.toUTCString();
    TimeStamp timeStamp74 = TimeStamp.getNtpTime((long)(short)1);
    TimeStamp timeStamp76 = TimeStamp.getNtpTime((long)(short)1);
    int i77 = timeStamp74.compareTo(timeStamp76);
    long long78 = timeStamp74.ntpValue();
    java.lang.String str79 = timeStamp74.toUTCString();
    int i80 = timeStamp67.compareTo(timeStamp74);
    TimeStamp timeStamp82 = TimeStamp.getNtpTime((long)(short)1);
    long long83 = timeStamp82.getFraction();
    int i84 = timeStamp67.compareTo(timeStamp82);
    java.lang.String str85 = timeStamp82.toString();
    long long86 = timeStamp82.getFraction();
    boolean b88 = timeStamp82.equals((java.lang.Object)1.0f);
    TimeStamp timeStamp90 = TimeStamp.getNtpTime((long)(short)1);
    java.util.Date date91 = timeStamp90.getDate();
    int i92 = timeStamp82.compareTo(timeStamp90);
    long long93 = timeStamp82.getSeconds();
    int i94 = timeStamp8.compareTo(timeStamp82);
    java.lang.Object obj95 = null;
    boolean b96 = timeStamp8.equals(obj95);
    long long97 = timeStamp8.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str6.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str13.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "83aa7e80.00418937"+ "'", str15.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 2208988800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long24 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str25.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long31 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str32.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "83aa7e80.00418937"+ "'", str34.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Thu, Jan 01 1970 00:00:00.001"+ "'", str35.equals("Thu, Jan 01 1970 00:00:00.001"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long36 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long43 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str44.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long50 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str51.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long55 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "83aa7e80.00418937"+ "'", str57.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long58 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long71 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str72.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long78 == (-8959209420474971849L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str79.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long83 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str85 + "' != '" + "83aa7e80.00418937"+ "'", str85.equals("83aa7e80.00418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long86 == 4294967L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long93 == 2208988800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long97 == (-8959209420474971849L));

  }

}
