package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_it0_livello1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


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
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    java.lang.String str0 = TimeStamp.NTP_DATE_FORMAT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "EEE, MMM dd yyyy HH:mm:ss.SSS"+ "'", str0.equals("EEE, MMM dd yyyy HH:mm:ss.SSS"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    long long1 = TimeStamp.getTime((long)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    java.lang.String str1 = TimeStamp.toString((long)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000020"+ "'", str1.equals("00000000.00000020"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("EEE, MMM dd yyyy HH:mm:ss.SSS");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    java.lang.String str2 = timeStamp1.toDateString();
    long long3 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("EEE, MMM dd yyyy HH:mm:ss.SSS");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


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
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    java.lang.String str1 = TimeStamp.toString((long)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ffffffff.ffffffff"+ "'", str1.equals("ffffffff.ffffffff"));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    java.lang.String str1 = TimeStamp.toString((long)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000064"+ "'", str1.equals("00000000.00000064"));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(-1));
    java.lang.String str2 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Wed, Dec 31 1969 23:59:59.999"+ "'", str2.equals("Wed, Dec 31 1969 23:59:59.999"));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Dec 31 1969 23:59:59.999");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    long long1 = TimeStamp.getTime(2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978981680L);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getFraction();
    boolean b4 = timeStamp1.equals((java.lang.Object)1.0f);
    java.lang.String str5 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str5.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000000");
    long long2 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000020");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000000");
    java.lang.String str2 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    long long3 = timeStamp1.ntpValue();
    java.lang.String str4 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str4.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    TimeStamp timeStamp1 = new TimeStamp(0L);
    long long2 = timeStamp1.ntpValue();
    TimeStamp timeStamp3 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = timeStamp1.compareTo(timeStamp3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    TimeStamp timeStamp1 = new TimeStamp((long)'a');
    long long2 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 97L);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getFraction();
    java.util.Date date3 = null;
    TimeStamp timeStamp4 = new TimeStamp(date3);
    int i5 = timeStamp1.compareTo(timeStamp4);
    java.lang.String str6 = timeStamp1.toDateString();
    long long7 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str6.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    java.lang.String str1 = TimeStamp.toString(1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000001"+ "'", str1.equals("00000000.00000001"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    TimeStamp timeStamp1 = new TimeStamp((long)100);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    long long1 = TimeStamp.getTime((long)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    TimeStamp timeStamp1 = new TimeStamp("00000000.00000000");
    long long2 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getFraction();
    java.util.Date date3 = null;
    TimeStamp timeStamp4 = new TimeStamp(date3);
    int i5 = timeStamp1.compareTo(timeStamp4);
    long long6 = timeStamp1.getFraction();
    long long7 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000064");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getFraction();
    java.util.Date date3 = null;
    TimeStamp timeStamp4 = new TimeStamp(date3);
    int i5 = timeStamp1.compareTo(timeStamp4);
    long long6 = timeStamp1.getFraction();
    java.lang.String str7 = timeStamp1.toString();
    long long8 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 2085978496000L);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    long long1 = TimeStamp.getTime((long)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    java.lang.String str1 = TimeStamp.toString((long)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000061"+ "'", str1.equals("00000000.00000061"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    java.lang.String str1 = TimeStamp.toString((long)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000000"+ "'", str1.equals("00000000.00000000"));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    long long1 = TimeStamp.getTime(1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    TimeStamp timeStamp1 = new TimeStamp(100L);
    long long2 = timeStamp1.ntpValue();
    java.lang.String str3 = timeStamp1.toString();
    boolean b5 = timeStamp1.equals((java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000064"+ "'", str3.equals("00000000.00000064"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getFraction();
    java.util.Date date3 = null;
    TimeStamp timeStamp4 = new TimeStamp(date3);
    int i5 = timeStamp1.compareTo(timeStamp4);
    long long6 = timeStamp1.getFraction();
    long long7 = timeStamp1.ntpValue();
    long long8 = timeStamp1.getFraction();
    java.lang.String str9 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00000000.00000000"+ "'", str9.equals("00000000.00000000"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    long long1 = TimeStamp.getTime(2085978981680L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978981680L);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    java.lang.String str1 = TimeStamp.toString((long)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000001"+ "'", str1.equals("00000000.00000001"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    java.lang.String str1 = TimeStamp.toString((long)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.0000000a"+ "'", str1.equals("00000000.0000000a"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    long long3 = timeStamp1.getTime();
    java.util.Date date4 = null;
    TimeStamp timeStamp5 = new TimeStamp(date4);
    long long6 = timeStamp5.getFraction();
    java.util.Date date7 = null;
    TimeStamp timeStamp8 = new TimeStamp(date7);
    int i9 = timeStamp5.compareTo(timeStamp8);
    long long10 = timeStamp5.getTime();
    int i11 = timeStamp1.compareTo(timeStamp5);
    java.lang.String str12 = timeStamp1.toString();
    TimeStamp timeStamp14 = new TimeStamp((long)' ');
    boolean b15 = timeStamp1.equals((java.lang.Object)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "00000000.00000000"+ "'", str12.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    java.lang.String str1 = TimeStamp.toString((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ffffffff.ffffffff"+ "'", str1.equals("ffffffff.ffffffff"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)0);
    long long2 = timeStamp1.getTime();
    long long3 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 2208988800L);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    TimeStamp timeStamp1 = new TimeStamp((long)' ');
    java.lang.String str2 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000020"+ "'", str2.equals("00000000.00000020"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    long long1 = TimeStamp.getTime((long)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(short)1);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    java.util.Date date3 = timeStamp1.getDate();
    java.util.Date date4 = null;
    TimeStamp timeStamp5 = new TimeStamp(date4);
    boolean b6 = timeStamp1.equals((java.lang.Object)timeStamp5);
    java.lang.String str7 = timeStamp5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getFraction();
    java.util.Date date3 = null;
    TimeStamp timeStamp4 = new TimeStamp(date3);
    int i5 = timeStamp1.compareTo(timeStamp4);
    long long6 = timeStamp1.getFraction();
    long long7 = timeStamp1.ntpValue();
    long long8 = timeStamp1.getFraction();
    long long9 = timeStamp1.getTime();
    long long10 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    TimeStamp timeStamp1 = new TimeStamp(0L);
    java.lang.String str2 = timeStamp1.toDateString();
    TimeStamp timeStamp4 = TimeStamp.getNtpTime(100L);
    long long5 = timeStamp4.ntpValue();
    int i6 = timeStamp1.compareTo(timeStamp4);
    java.lang.String str7 = timeStamp4.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420049770087L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Thu, Jan 01 1970 00:00:00.100 UTC"+ "'", str7.equals("Thu, Jan 01 1970 00:00:00.100 UTC"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    long long1 = TimeStamp.getTime((long)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getFraction();
    boolean b4 = timeStamp1.equals((java.lang.Object)"Thu, Feb 07 2036 06:28:16.000");
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toDateString();
    java.lang.String str7 = timeStamp1.toUTCString();
    java.lang.String str8 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str6.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str7.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    long long3 = timeStamp1.getTime();
    java.util.Date date4 = null;
    TimeStamp timeStamp5 = new TimeStamp(date4);
    long long6 = timeStamp5.getFraction();
    java.util.Date date7 = null;
    TimeStamp timeStamp8 = new TimeStamp(date7);
    int i9 = timeStamp5.compareTo(timeStamp8);
    long long10 = timeStamp5.getTime();
    int i11 = timeStamp1.compareTo(timeStamp5);
    long long12 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getFraction();
    java.util.Date date3 = timeStamp1.getDate();
    TimeStamp timeStamp5 = new TimeStamp(0L);
    boolean b6 = timeStamp1.equals((java.lang.Object)timeStamp5);
    java.util.Date date7 = null;
    TimeStamp timeStamp8 = new TimeStamp(date7);
    long long9 = timeStamp8.getFraction();
    java.util.Date date10 = null;
    TimeStamp timeStamp11 = new TimeStamp(date10);
    int i12 = timeStamp8.compareTo(timeStamp11);
    long long13 = timeStamp8.getTime();
    java.util.Date date14 = timeStamp8.getDate();
    TimeStamp timeStamp15 = new TimeStamp(date14);
    TimeStamp timeStamp17 = TimeStamp.getNtpTime((long)'4');
    java.lang.String str18 = timeStamp17.toUTCString();
    int i19 = timeStamp15.compareTo(timeStamp17);
    boolean b20 = timeStamp5.equals((java.lang.Object)i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Thu, Jan 01 1970 00:00:00.052 UTC"+ "'", str18.equals("Thu, Jan 01 1970 00:00:00.052 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    java.util.Date date3 = timeStamp1.getDate();
    java.lang.String str4 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str4.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    java.util.Date date3 = timeStamp1.getDate();
    java.util.Date date4 = null;
    TimeStamp timeStamp5 = new TimeStamp(date4);
    long long6 = timeStamp5.ntpValue();
    int i7 = timeStamp1.compareTo(timeStamp5);
    java.lang.String str8 = timeStamp5.toString();
    long long9 = timeStamp5.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000001");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    TimeStamp timeStamp1 = new TimeStamp(97L);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    long long3 = timeStamp1.ntpValue();
    boolean b5 = timeStamp1.equals((java.lang.Object)100L);
    java.util.Date date6 = timeStamp1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date6);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(0L);
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("ffffffff.ffffffff");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getFraction();
    java.util.Date date3 = timeStamp1.getDate();
    java.util.Date date4 = timeStamp1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date4);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    long long1 = TimeStamp.getTime((long)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getFraction();
    boolean b4 = timeStamp1.equals((java.lang.Object)"Thu, Feb 07 2036 06:28:16.000");
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toDateString();
    java.util.Date date7 = null;
    TimeStamp timeStamp8 = new TimeStamp(date7);
    long long9 = timeStamp8.getFraction();
    java.util.Date date10 = null;
    TimeStamp timeStamp11 = new TimeStamp(date10);
    int i12 = timeStamp8.compareTo(timeStamp11);
    long long13 = timeStamp8.ntpValue();
    int i14 = timeStamp1.compareTo(timeStamp8);
    long long15 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str6.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    java.util.Date date1 = null;
    TimeStamp timeStamp2 = new TimeStamp(date1);
    long long3 = timeStamp2.ntpValue();
    java.util.Date date4 = timeStamp2.getDate();
    java.util.Date date5 = null;
    TimeStamp timeStamp6 = new TimeStamp(date5);
    long long7 = timeStamp6.ntpValue();
    int i8 = timeStamp2.compareTo(timeStamp6);
    java.lang.String str9 = timeStamp6.toString();
    int i10 = timeStamp0.compareTo(timeStamp6);
    long long11 = timeStamp6.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00000000.00000000"+ "'", str9.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 2085978496000L);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(-1));
    java.lang.String str2 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    TimeStamp timeStamp1 = new TimeStamp((long)'4');

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    java.util.Date date3 = timeStamp1.getDate();
    java.util.Date date4 = null;
    TimeStamp timeStamp5 = new TimeStamp(date4);
    long long6 = timeStamp5.ntpValue();
    int i7 = timeStamp1.compareTo(timeStamp5);
    long long8 = timeStamp5.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    TimeStamp timeStamp1 = new TimeStamp(0L);
    java.lang.String str2 = timeStamp1.toDateString();
    TimeStamp timeStamp4 = TimeStamp.getNtpTime(100L);
    long long5 = timeStamp4.ntpValue();
    int i6 = timeStamp1.compareTo(timeStamp4);
    java.lang.String str7 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-8959209420049770087L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    long long3 = timeStamp1.getTime();
    java.util.Date date4 = null;
    TimeStamp timeStamp5 = new TimeStamp(date4);
    long long6 = timeStamp5.getFraction();
    java.util.Date date7 = null;
    TimeStamp timeStamp8 = new TimeStamp(date7);
    int i9 = timeStamp5.compareTo(timeStamp8);
    long long10 = timeStamp5.getTime();
    int i11 = timeStamp1.compareTo(timeStamp5);
    long long12 = timeStamp1.getSeconds();
    long long13 = timeStamp1.getSeconds();
    java.lang.String str14 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "00000000.00000000"+ "'", str14.equals("00000000.00000000"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(short)10);
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.getFraction();
    java.util.Date date5 = timeStamp3.getDate();
    TimeStamp timeStamp7 = new TimeStamp(0L);
    boolean b8 = timeStamp3.equals((java.lang.Object)timeStamp7);
    int i9 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date10 = timeStamp1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date10);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)0);
    long long2 = timeStamp1.getTime();
    java.util.Date date3 = null;
    TimeStamp timeStamp4 = new TimeStamp(date3);
    long long5 = timeStamp4.getFraction();
    java.util.Date date6 = null;
    TimeStamp timeStamp7 = new TimeStamp(date6);
    int i8 = timeStamp4.compareTo(timeStamp7);
    java.lang.String str9 = timeStamp4.toDateString();
    java.lang.String str10 = timeStamp4.toString();
    int i11 = timeStamp1.compareTo(timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00000000.00000000"+ "'", str10.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    TimeStamp timeStamp1 = new TimeStamp(0L);
    long long2 = timeStamp1.ntpValue();
    java.lang.String str3 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    java.util.Date date3 = timeStamp1.getDate();
    java.util.Date date4 = null;
    TimeStamp timeStamp5 = new TimeStamp(date4);
    boolean b6 = timeStamp1.equals((java.lang.Object)timeStamp5);
    boolean b8 = timeStamp5.equals((java.lang.Object)"00000000.0000000a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(-1));
    long long2 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 4290672328L);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getFraction();
    java.util.Date date3 = null;
    TimeStamp timeStamp4 = new TimeStamp(date3);
    int i5 = timeStamp1.compareTo(timeStamp4);
    long long6 = timeStamp1.getTime();
    java.util.Date date7 = timeStamp1.getDate();
    TimeStamp timeStamp8 = new TimeStamp(date7);
    java.lang.String str9 = timeStamp8.toUTCString();
    long long10 = timeStamp8.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    TimeStamp timeStamp1 = new TimeStamp("00000000.00000064");

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    TimeStamp timeStamp1 = new TimeStamp("00000000.00000000");
    long long2 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getFraction();
    java.util.Date date3 = timeStamp1.getDate();
    TimeStamp timeStamp4 = new TimeStamp(date3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    java.lang.String str1 = TimeStamp.toString(2085978981680L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "000001e5.ae094530"+ "'", str1.equals("000001e5.ae094530"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(short)10);
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.getFraction();
    java.util.Date date5 = timeStamp3.getDate();
    TimeStamp timeStamp7 = new TimeStamp(0L);
    boolean b8 = timeStamp3.equals((java.lang.Object)timeStamp7);
    int i9 = timeStamp1.compareTo(timeStamp3);
    java.lang.String str10 = timeStamp3.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str10.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    TimeStamp timeStamp1 = new TimeStamp("ffffffff.ffffffff");
    long long2 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    long long1 = TimeStamp.getTime((long)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    java.lang.String str1 = TimeStamp.toString((long)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000000"+ "'", str1.equals("00000000.00000000"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(byte)100);
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.getFraction();
    boolean b6 = timeStamp3.equals((java.lang.Object)"Thu, Feb 07 2036 06:28:16.000");
    long long7 = timeStamp3.ntpValue();
    java.util.Date date8 = timeStamp3.getDate();
    TimeStamp timeStamp9 = new TimeStamp(date8);
    int i10 = timeStamp1.compareTo(timeStamp9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getFraction();
    boolean b4 = timeStamp1.equals((java.lang.Object)"Thu, Feb 07 2036 06:28:16.000");
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toDateString();
    java.util.Date date7 = null;
    TimeStamp timeStamp8 = new TimeStamp(date7);
    long long9 = timeStamp8.getFraction();
    java.util.Date date10 = null;
    TimeStamp timeStamp11 = new TimeStamp(date10);
    int i12 = timeStamp8.compareTo(timeStamp11);
    long long13 = timeStamp8.ntpValue();
    int i14 = timeStamp1.compareTo(timeStamp8);
    long long15 = timeStamp8.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str6.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getFraction();
    boolean b4 = timeStamp1.equals((java.lang.Object)"Thu, Feb 07 2036 06:28:16.000");
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "00000000.00000000"+ "'", str6.equals("00000000.00000000"));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(0L);
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp4 = new TimeStamp(100L);
    long long5 = timeStamp4.ntpValue();
    java.lang.String str6 = timeStamp4.toString();
    java.util.Date date7 = null;
    TimeStamp timeStamp8 = new TimeStamp(date7);
    long long9 = timeStamp8.getFraction();
    java.util.Date date10 = null;
    TimeStamp timeStamp11 = new TimeStamp(date10);
    int i12 = timeStamp8.compareTo(timeStamp11);
    long long13 = timeStamp8.getTime();
    java.util.Date date14 = timeStamp8.getDate();
    java.lang.String str15 = timeStamp8.toDateString();
    int i16 = timeStamp4.compareTo(timeStamp8);
    int i17 = timeStamp1.compareTo(timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "00000000.00000064"+ "'", str6.equals("00000000.00000064"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str15.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    long long1 = TimeStamp.getTime((long)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Dec 31 1969 23:59:59.999");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Thu, Feb 07 2036 06:28:16.000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getFraction();
    java.util.Date date3 = null;
    TimeStamp timeStamp4 = new TimeStamp(date3);
    int i5 = timeStamp1.compareTo(timeStamp4);
    long long6 = timeStamp1.getFraction();
    java.util.Date date7 = timeStamp1.getDate();
    long long8 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    TimeStamp timeStamp1 = new TimeStamp((long)10);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)'4');
    java.lang.String str2 = timeStamp1.toUTCString();
    java.lang.String str3 = timeStamp1.toDateString();
    long long4 = timeStamp1.getSeconds();
    java.lang.String str5 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Jan 01 1970 00:00:00.052 UTC"+ "'", str2.equals("Thu, Jan 01 1970 00:00:00.052 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Jan 01 1970 00:00:00.052"+ "'", str3.equals("Thu, Jan 01 1970 00:00:00.052"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2208988800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Thu, Jan 01 1970 00:00:00.052 UTC"+ "'", str5.equals("Thu, Jan 01 1970 00:00:00.052 UTC"));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    java.util.Date date3 = timeStamp1.getDate();
    java.util.Date date4 = null;
    TimeStamp timeStamp5 = new TimeStamp(date4);
    long long6 = timeStamp5.ntpValue();
    int i7 = timeStamp1.compareTo(timeStamp5);
    java.util.Date date8 = timeStamp5.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(0L);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Jan 01 1970 00:00:00.000"+ "'", str3.equals("Thu, Jan 01 1970 00:00:00.000"));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    long long1 = TimeStamp.getTime((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    long long1 = TimeStamp.getTime(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    TimeStamp timeStamp1 = new TimeStamp((long)1);
    long long2 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getFraction();
    boolean b4 = timeStamp1.equals((java.lang.Object)"Thu, Feb 07 2036 06:28:16.000");
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toDateString();
    java.util.Date date7 = null;
    TimeStamp timeStamp8 = new TimeStamp(date7);
    long long9 = timeStamp8.getFraction();
    boolean b11 = timeStamp8.equals((java.lang.Object)"Thu, Feb 07 2036 06:28:16.000");
    long long12 = timeStamp8.ntpValue();
    java.lang.String str13 = timeStamp8.toDateString();
    java.lang.String str14 = timeStamp8.toUTCString();
    int i15 = timeStamp1.compareTo(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str6.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str13.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str14.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000061");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    java.lang.String str3 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(0L);
    java.util.Date date2 = timeStamp1.getDate();
    long long3 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 2208988800L);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Thu, Jan 01 1970 00:00:00.052 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    TimeStamp timeStamp1 = new TimeStamp(0L);
    java.util.Date date2 = timeStamp1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    TimeStamp timeStamp1 = new TimeStamp("00000000.00000020");
    long long2 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    java.util.Date date1 = null;
    TimeStamp timeStamp2 = new TimeStamp(date1);
    long long3 = timeStamp2.ntpValue();
    java.util.Date date4 = timeStamp2.getDate();
    java.util.Date date5 = null;
    TimeStamp timeStamp6 = new TimeStamp(date5);
    long long7 = timeStamp6.ntpValue();
    int i8 = timeStamp2.compareTo(timeStamp6);
    java.lang.String str9 = timeStamp6.toString();
    int i10 = timeStamp0.compareTo(timeStamp6);
    java.lang.String str11 = timeStamp0.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00000000.00000000"+ "'", str9.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Wed, Oct 11 2023 15:31:31.701"+ "'", str11.equals("Wed, Oct 11 2023 15:31:31.701"));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    java.util.Date date1 = timeStamp0.getDate();
    TimeStamp timeStamp2 = new TimeStamp(date1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date1);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)1);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Jan 01 1970 00:00:00.001 UTC"+ "'", str3.equals("Thu, Jan 01 1970 00:00:00.001 UTC"));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getFraction();
    java.util.Date date3 = null;
    TimeStamp timeStamp4 = new TimeStamp(date3);
    int i5 = timeStamp1.compareTo(timeStamp4);
    long long6 = timeStamp1.ntpValue();
    long long7 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Thu, Jan 01 1970 00:00:00.000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    TimeStamp timeStamp1 = new TimeStamp(0L);
    java.lang.String str2 = timeStamp1.toDateString();
    long long3 = timeStamp1.getFraction();
    java.lang.String str4 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str4.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    TimeStamp timeStamp1 = new TimeStamp(2085978496000L);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    java.lang.String str1 = TimeStamp.toString(4290672328L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.ffbe76c8"+ "'", str1.equals("00000000.ffbe76c8"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getFraction();
    java.util.Date date3 = null;
    TimeStamp timeStamp4 = new TimeStamp(date3);
    int i5 = timeStamp1.compareTo(timeStamp4);
    java.lang.String str6 = timeStamp1.toDateString();
    java.lang.String str7 = timeStamp1.toDateString();
    java.util.Date date8 = timeStamp1.getDate();
    TimeStamp timeStamp9 = new TimeStamp(date8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str6.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str7.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getFraction();
    java.util.Date date3 = null;
    TimeStamp timeStamp4 = new TimeStamp(date3);
    int i5 = timeStamp1.compareTo(timeStamp4);
    long long6 = timeStamp1.getFraction();
    long long7 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 2085978496000L);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(2208988800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    long long2 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    long long3 = timeStamp1.getTime();
    long long4 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    java.lang.String str2 = timeStamp1.toDateString();
    java.lang.String str3 = timeStamp1.toUTCString();
    TimeStamp timeStamp5 = new TimeStamp(0L);
    java.lang.String str6 = timeStamp5.toUTCString();
    int i7 = timeStamp1.compareTo(timeStamp5);
    java.lang.String str8 = timeStamp1.toString();
    java.lang.String str9 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str6.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00000000.00000000"+ "'", str9.equals("00000000.00000000"));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.util.Date date2 = timeStamp1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    long long1 = TimeStamp.getTime(10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    java.lang.String str2 = timeStamp1.toDateString();
    java.lang.String str3 = timeStamp1.toUTCString();
    long long4 = timeStamp1.getTime();
    long long5 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 2085978496000L);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getFraction();
    java.util.Date date3 = null;
    TimeStamp timeStamp4 = new TimeStamp(date3);
    int i5 = timeStamp1.compareTo(timeStamp4);
    java.lang.String str6 = timeStamp1.toDateString();
    TimeStamp timeStamp8 = new TimeStamp(0L);
    java.lang.String str9 = timeStamp8.toDateString();
    long long10 = timeStamp8.getFraction();
    boolean b11 = timeStamp1.equals((java.lang.Object)long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str6.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    java.lang.String str1 = TimeStamp.toString((long)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000064"+ "'", str1.equals("00000000.00000064"));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getFraction();
    boolean b4 = timeStamp1.equals((java.lang.Object)"Thu, Feb 07 2036 06:28:16.000");
    long long5 = timeStamp1.ntpValue();
    java.lang.String str6 = timeStamp1.toDateString();
    java.lang.String str7 = timeStamp1.toUTCString();
    long long8 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str6.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str7.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    long long1 = TimeStamp.getTime((-8959209420049770087L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 100L);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getFraction();
    java.util.Date date3 = null;
    TimeStamp timeStamp4 = new TimeStamp(date3);
    int i5 = timeStamp1.compareTo(timeStamp4);
    java.lang.String str6 = timeStamp4.toUTCString();
    java.util.Date date7 = timeStamp4.getDate();
    TimeStamp timeStamp8 = new TimeStamp(date7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str6.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date7);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(short)10);
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.getFraction();
    java.util.Date date5 = timeStamp3.getDate();
    TimeStamp timeStamp7 = new TimeStamp(0L);
    boolean b8 = timeStamp3.equals((java.lang.Object)timeStamp7);
    int i9 = timeStamp1.compareTo(timeStamp3);
    java.lang.String str10 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00000000.0000000a"+ "'", str10.equals("00000000.0000000a"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    TimeStamp timeStamp1 = new TimeStamp("00000000.ffbe76c8");

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    boolean b4 = timeStamp1.equals((java.lang.Object)"hi!");
    java.util.Date date5 = null;
    TimeStamp timeStamp6 = new TimeStamp(date5);
    long long7 = timeStamp6.getFraction();
    boolean b9 = timeStamp6.equals((java.lang.Object)"Thu, Feb 07 2036 06:28:16.000");
    long long10 = timeStamp6.ntpValue();
    java.lang.String str11 = timeStamp6.toDateString();
    java.util.Date date12 = null;
    TimeStamp timeStamp13 = new TimeStamp(date12);
    long long14 = timeStamp13.getFraction();
    java.util.Date date15 = null;
    TimeStamp timeStamp16 = new TimeStamp(date15);
    int i17 = timeStamp13.compareTo(timeStamp16);
    long long18 = timeStamp13.ntpValue();
    int i19 = timeStamp6.compareTo(timeStamp13);
    long long20 = timeStamp13.ntpValue();
    int i21 = timeStamp1.compareTo(timeStamp13);
    java.util.Date date22 = null;
    TimeStamp timeStamp23 = new TimeStamp(date22);
    long long24 = timeStamp23.getFraction();
    boolean b26 = timeStamp23.equals((java.lang.Object)"Thu, Feb 07 2036 06:28:16.000");
    long long27 = timeStamp23.ntpValue();
    java.lang.String str28 = timeStamp23.toDateString();
    java.lang.String str29 = timeStamp23.toUTCString();
    boolean b30 = timeStamp13.equals((java.lang.Object)timeStamp23);
    java.lang.String str31 = timeStamp23.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str11.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long24 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str28.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str29.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str31.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getFraction();
    java.util.Date date3 = null;
    TimeStamp timeStamp4 = new TimeStamp(date3);
    int i5 = timeStamp1.compareTo(timeStamp4);
    long long6 = timeStamp1.getFraction();
    java.util.Date date7 = timeStamp1.getDate();
    long long8 = timeStamp1.getTime();
    java.lang.String str9 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

}
