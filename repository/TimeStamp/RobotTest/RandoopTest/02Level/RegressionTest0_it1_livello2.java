
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


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


    java.lang.String str0 = TimeStamp.NTP_DATE_FORMAT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "EEE, MMM dd yyyy HH:mm:ss.SSS"+ "'", str0.equals("EEE, MMM dd yyyy HH:mm:ss.SSS"));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    java.lang.String str1 = TimeStamp.toString((long)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000064"+ "'", str1.equals("00000000.00000064"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    java.lang.String str1 = TimeStamp.toString((long)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ffffffff.ffffffff"+ "'", str1.equals("ffffffff.ffffffff"));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


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
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    java.lang.String str1 = TimeStamp.toString((long)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.0000000a"+ "'", str1.equals("00000000.0000000a"));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    long long1 = TimeStamp.getTime((long)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

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


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000000");
    java.lang.String str2 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000000"+ "'", str2.equals("00000000.00000000"));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    java.lang.String str1 = TimeStamp.toString((long)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000064"+ "'", str1.equals("00000000.00000064"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


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
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.lang.String str7 = timeStamp3.toUTCString();
    boolean b9 = timeStamp3.equals((java.lang.Object)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str7.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    long long1 = TimeStamp.getTime((-1670570142511975629L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018574450L);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    java.lang.String str1 = TimeStamp.toString((long)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000061"+ "'", str1.equals("00000000.00000061"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    long long1 = TimeStamp.getTime((long)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    long long1 = timeStamp0.ntpValue();
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.ntpValue();
    java.lang.String str5 = timeStamp3.toString();
    boolean b6 = timeStamp0.equals((java.lang.Object)timeStamp3);
    long long7 = timeStamp0.getTime();
    java.lang.String str8 = timeStamp0.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1670570141670162039L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1697018574646L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Wed, Oct 11 2023 10:02:54.646"+ "'", str8.equals("Wed, Oct 11 2023 10:02:54.646"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    java.lang.String str1 = TimeStamp.toString(2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "000001e5.ae01dc00"+ "'", str1.equals("000001e5.ae01dc00"));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    long long1 = TimeStamp.getTime(100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    long long1 = TimeStamp.getTime((-1670570141670162039L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018574646L);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:54.543 UTC");
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


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:54.646");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    java.lang.String str1 = TimeStamp.toString((long)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000023"+ "'", str1.equals("00000000.00000023"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    java.lang.String str1 = TimeStamp.toString((long)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000034"+ "'", str1.equals("00000000.00000034"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    TimeStamp timeStamp1 = new TimeStamp((long)100);
    java.lang.String str2 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Thu, Feb 07 2036 06:28:16.000 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    long long1 = TimeStamp.getTime((long)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.lang.String str2 = timeStamp1.toString();
    java.lang.String str3 = timeStamp1.toString();
    TimeStamp timeStamp5 = new TimeStamp((long)100);
    boolean b6 = timeStamp1.equals((java.lang.Object)100);
    long long7 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000000"+ "'", str2.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000000"+ "'", str3.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 2085978496000L);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    java.lang.String str1 = TimeStamp.toString((-1670570142511975629L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f14e.73333333"+ "'", str1.equals("e8d0f14e.73333333"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    boolean b6 = timeStamp1.equals((java.lang.Object)100.0f);
    long long7 = timeStamp1.getTime();
    long long8 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    long long1 = TimeStamp.getTime((long)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    java.lang.String str1 = TimeStamp.toString((long)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000001"+ "'", str1.equals("00000000.00000001"));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date7 = null;
    TimeStamp timeStamp8 = new TimeStamp(date7);
    long long9 = timeStamp8.ntpValue();
    java.lang.String str10 = timeStamp8.toString();
    boolean b11 = timeStamp3.equals((java.lang.Object)str10);
    java.lang.String str12 = timeStamp3.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00000000.00000000"+ "'", str10.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str12.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570141670162039L));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    long long1 = TimeStamp.getTime((long)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:54.795 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    long long1 = timeStamp0.ntpValue();
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.ntpValue();
    java.lang.String str5 = timeStamp3.toString();
    boolean b6 = timeStamp0.equals((java.lang.Object)timeStamp3);
    long long7 = timeStamp0.getTime();
    long long8 = timeStamp0.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1670570140867003155L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1697018574833L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 3577707757L);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    long long1 = TimeStamp.getTime((long)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.lang.String str2 = timeStamp1.toString();
    java.util.Date date3 = null;
    TimeStamp timeStamp4 = new TimeStamp(date3);
    long long5 = timeStamp4.getTime();
    int i6 = timeStamp1.compareTo(timeStamp4);
    long long7 = timeStamp4.getTime();
    TimeStamp timeStamp8 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i9 = timeStamp4.compareTo(timeStamp8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000000"+ "'", str2.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 2085978496000L);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    java.lang.String str6 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "00000000.00000000"+ "'", str6.equals("00000000.00000000"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    java.lang.String str2 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.lang.String str2 = timeStamp1.toString();
    java.util.Date date3 = null;
    TimeStamp timeStamp4 = new TimeStamp(date3);
    long long5 = timeStamp4.getTime();
    int i6 = timeStamp1.compareTo(timeStamp4);
    java.lang.String str7 = timeStamp4.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000000"+ "'", str2.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str7.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Dec 31 1969 23:59:59.999 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    java.lang.String str1 = TimeStamp.toString((-1670570141244960277L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f14e.beb851eb"+ "'", str1.equals("e8d0f14e.beb851eb"));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570141296499885L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000000");
    java.lang.String str2 = timeStamp1.toDateString();
    java.util.Date date3 = timeStamp1.getDate();
    long long4 = timeStamp1.getFraction();
    java.lang.String str5 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str5.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    long long6 = timeStamp1.getSeconds();
    java.lang.String str7 = timeStamp1.toUTCString();
    long long8 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str7.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    boolean b6 = timeStamp1.equals((java.lang.Object)100.0f);
    long long7 = timeStamp1.getTime();
    java.lang.String str8 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str8.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570141098931389L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    TimeStamp timeStamp1 = new TimeStamp(3577707757L);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570141356629427L));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    long long1 = TimeStamp.getTime((long)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    boolean b4 = timeStamp1.equals((java.lang.Object)(byte)10);
    long long5 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    long long1 = TimeStamp.getTime(1697018574767L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978891118L);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    boolean b6 = timeStamp1.equals((java.lang.Object)100.0f);
    long long7 = timeStamp1.getFraction();
    long long8 = timeStamp1.ntpValue();
    java.lang.String str9 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00000000.00000000"+ "'", str9.equals("00000000.00000000"));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    TimeStamp timeStamp1 = new TimeStamp("83aa7e80.19999999");

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:54.543 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Dec 31 1969 23:59:59.999 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


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
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("e8d0f14e.73333333");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1L));
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.getTime();
    java.lang.String str5 = timeStamp3.toDateString();
    long long6 = timeStamp3.getTime();
    java.lang.String str7 = timeStamp3.toString();
    int i8 = timeStamp1.compareTo(timeStamp3);
    java.lang.String str9 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str5.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "83aa7e7f.ffbe76c8"+ "'", str9.equals("83aa7e7f.ffbe76c8"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1L));
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.getTime();
    java.lang.String str5 = timeStamp3.toDateString();
    long long6 = timeStamp3.getTime();
    java.lang.String str7 = timeStamp3.toString();
    int i8 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date9 = timeStamp3.getDate();
    TimeStamp timeStamp10 = new TimeStamp(date9);
    java.util.Date date11 = timeStamp10.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str5.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date11);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    java.lang.String str1 = TimeStamp.toString((long)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.0000000a"+ "'", str1.equals("00000000.0000000a"));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date7 = null;
    TimeStamp timeStamp8 = new TimeStamp(date7);
    long long9 = timeStamp8.getTime();
    java.lang.String str10 = timeStamp8.toDateString();
    java.lang.String str11 = timeStamp8.toString();
    boolean b13 = timeStamp8.equals((java.lang.Object)100.0f);
    int i14 = timeStamp1.compareTo(timeStamp8);
    java.util.Date date15 = null;
    TimeStamp timeStamp16 = new TimeStamp(date15);
    long long17 = timeStamp16.getTime();
    java.lang.String str18 = timeStamp16.toDateString();
    java.lang.String str19 = timeStamp16.toString();
    java.lang.String str20 = timeStamp16.toString();
    boolean b22 = timeStamp16.equals((java.lang.Object)0);
    java.lang.String str23 = timeStamp16.toString();
    int i24 = timeStamp1.compareTo(timeStamp16);
    long long25 = timeStamp1.getSeconds();
    long long26 = timeStamp1.getSeconds();
    long long27 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str10.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "00000000.00000000"+ "'", str11.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str18.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "00000000.00000000"+ "'", str19.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "00000000.00000000"+ "'", str20.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "00000000.00000000"+ "'", str23.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long26 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == 0L);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


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
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    long long1 = TimeStamp.getTime(3199750635L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496745L);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    TimeStamp timeStamp1 = new TimeStamp("00000000.00000000");
    long long2 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(1697018574450L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


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
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:54.795 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    long long1 = TimeStamp.getTime((-1670570140368786949L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018574949L);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    long long4 = timeStamp1.getFraction();
    long long5 = timeStamp1.getTime();
    java.lang.String str6 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str6.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:54.875");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    TimeStamp timeStamp1 = new TimeStamp("00000000.00000034");
    long long2 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)0);
    java.lang.String str2 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Jan 01 1970 00:00:00.000 UTC"+ "'", str2.equals("Thu, Jan 01 1970 00:00:00.000 UTC"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    TimeStamp timeStamp1 = new TimeStamp("00000000.00000061");
    boolean b3 = timeStamp1.equals((java.lang.Object)287762808L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    long long4 = timeStamp1.getFraction();
    TimeStamp timeStamp5 = TimeStamp.getCurrentTime();
    long long6 = timeStamp5.ntpValue();
    java.util.Date date7 = null;
    TimeStamp timeStamp8 = new TimeStamp(date7);
    long long9 = timeStamp8.ntpValue();
    java.lang.String str10 = timeStamp8.toString();
    boolean b11 = timeStamp5.equals((java.lang.Object)timeStamp8);
    long long12 = timeStamp5.getTime();
    boolean b13 = timeStamp1.equals((java.lang.Object)long12);
    TimeStamp timeStamp15 = new TimeStamp("");
    java.lang.String str16 = timeStamp15.toString();
    java.lang.String str17 = timeStamp15.toUTCString();
    boolean b18 = timeStamp1.equals((java.lang.Object)str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1670570139479728718L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00000000.00000000"+ "'", str10.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 1697018575156L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "00000000.00000000"+ "'", str16.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str17.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    long long1 = timeStamp0.ntpValue();
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.ntpValue();
    java.lang.String str5 = timeStamp3.toString();
    boolean b6 = timeStamp0.equals((java.lang.Object)timeStamp3);
    java.lang.String str7 = timeStamp0.toDateString();
    java.util.Date date8 = timeStamp0.getDate();
    long long9 = timeStamp0.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1670570139432484078L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Wed, Oct 11 2023 10:02:55.167"+ "'", str7.equals("Wed, Oct 11 2023 10:02:55.167"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == (-1670570139432484078L));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Thu, Jan 01 1970 00:00:00.100");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(10L);
    long long2 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 42949672L);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570140570650412L));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    TimeStamp timeStamp4 = new TimeStamp(date2);
    java.util.Date date5 = null;
    TimeStamp timeStamp6 = new TimeStamp(date5);
    long long7 = timeStamp6.getTime();
    java.lang.String str8 = timeStamp6.toDateString();
    long long9 = timeStamp6.getTime();
    java.lang.String str10 = timeStamp6.toString();
    boolean b12 = timeStamp6.equals((java.lang.Object)(short)10);
    int i13 = timeStamp4.compareTo(timeStamp6);
    java.lang.String str14 = timeStamp4.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str8.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00000000.00000000"+ "'", str10.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str14.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(byte)1);
    long long2 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2208988800L);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(short)0);
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    TimeStamp timeStamp5 = new TimeStamp("");
    java.lang.String str6 = timeStamp5.toString();
    java.lang.String str7 = timeStamp5.toString();
    int i8 = timeStamp3.compareTo(timeStamp5);
    long long9 = timeStamp3.getSeconds();
    boolean b10 = timeStamp1.equals((java.lang.Object)timeStamp3);
    TimeStamp timeStamp12 = TimeStamp.parseNtpString("00000000.00000000");
    int i13 = timeStamp3.compareTo(timeStamp12);
    long long14 = timeStamp12.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "00000000.00000000"+ "'", str6.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 2085978496000L);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.lang.String str2 = timeStamp1.toString();
    java.lang.String str3 = timeStamp1.toString();
    TimeStamp timeStamp5 = new TimeStamp("");
    long long6 = timeStamp5.getFraction();
    int i7 = timeStamp1.compareTo(timeStamp5);
    TimeStamp timeStamp9 = new TimeStamp("000001e5.ae01dc00");
    int i10 = timeStamp5.compareTo(timeStamp9);
    long long11 = timeStamp5.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000000"+ "'", str2.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000000"+ "'", str3.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    java.lang.String str1 = TimeStamp.toString((-1670570139887750611L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f14f.0f9db22d"+ "'", str1.equals("e8d0f14f.0f9db22d"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.lang.String str2 = timeStamp1.toString();
    java.lang.String str3 = timeStamp1.toString();
    java.util.Date date4 = timeStamp1.getDate();
    long long5 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000000"+ "'", str2.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000000"+ "'", str3.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    java.lang.String str1 = TimeStamp.toString(10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.0000000a"+ "'", str1.equals("00000000.0000000a"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.0000000a");
    boolean b3 = timeStamp1.equals((java.lang.Object)(-1670570141244960277L));
    long long4 = timeStamp1.ntpValue();
    long long5 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 2085978496000L);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    long long5 = timeStamp1.ntpValue();
    TimeStamp timeStamp7 = new TimeStamp((long)'#');
    long long8 = timeStamp7.getTime();
    int i9 = timeStamp1.compareTo(timeStamp7);
    long long10 = timeStamp1.ntpValue();
    TimeStamp timeStamp12 = new TimeStamp(1697018574450L);
    long long13 = timeStamp12.ntpValue();
    boolean b14 = timeStamp1.equals((java.lang.Object)long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 1697018574450L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    TimeStamp timeStamp4 = new TimeStamp(date2);
    TimeStamp timeStamp5 = new TimeStamp(date2);
    long long6 = timeStamp5.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 2085978496000L);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:55.120");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    long long1 = TimeStamp.getTime(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)10);
    long long2 = timeStamp1.getFraction();
    long long3 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 42949672L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 10L);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    TimeStamp timeStamp1 = new TimeStamp((long)' ');

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.lang.String str2 = timeStamp1.toString();
    java.lang.String str3 = timeStamp1.toString();
    TimeStamp timeStamp5 = new TimeStamp("");
    long long6 = timeStamp5.getFraction();
    int i7 = timeStamp1.compareTo(timeStamp5);
    java.util.Date date8 = timeStamp1.getDate();
    TimeStamp timeStamp9 = new TimeStamp(date8);
    java.lang.String str10 = timeStamp9.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000000"+ "'", str2.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000000"+ "'", str3.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str10.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    long long1 = TimeStamp.getTime((-1670570140570650412L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018574902L);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.lang.String str7 = timeStamp3.toString();
    java.util.Date date8 = timeStamp3.getDate();
    TimeStamp timeStamp9 = new TimeStamp(date8);
    TimeStamp timeStamp10 = new TimeStamp(date8);
    java.util.Date date11 = null;
    TimeStamp timeStamp12 = new TimeStamp(date11);
    long long13 = timeStamp12.getTime();
    java.lang.String str14 = timeStamp12.toDateString();
    java.lang.String str15 = timeStamp12.toString();
    java.lang.String str16 = timeStamp12.toString();
    boolean b18 = timeStamp12.equals((java.lang.Object)0);
    java.lang.String str19 = timeStamp12.toString();
    java.lang.String str20 = timeStamp12.toDateString();
    long long21 = timeStamp12.getTime();
    long long22 = timeStamp12.getSeconds();
    java.lang.String str23 = timeStamp12.toDateString();
    long long24 = timeStamp12.ntpValue();
    boolean b25 = timeStamp10.equals((java.lang.Object)long24);
    java.util.Date date26 = timeStamp10.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str14.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "00000000.00000000"+ "'", str15.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "00000000.00000000"+ "'", str16.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "00000000.00000000"+ "'", str19.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str20.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str23.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long24 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date26);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570140368786949L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    java.lang.String str1 = TimeStamp.toString(1697018575156L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0000018b.1e307934"+ "'", str1.equals("0000018b.1e307934"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570139861980808L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    long long1 = TimeStamp.getTime((-1670570140678024594L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018574877L);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:54.902 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000000");
    java.lang.String str2 = timeStamp1.toDateString();
    java.util.Date date3 = timeStamp1.getDate();
    TimeStamp timeStamp4 = new TimeStamp(date3);
    TimeStamp timeStamp5 = new TimeStamp(date3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    TimeStamp timeStamp1 = new TimeStamp((long)'#');
    long long2 = timeStamp1.getTime();
    TimeStamp timeStamp3 = TimeStamp.getCurrentTime();
    long long4 = timeStamp3.ntpValue();
    java.lang.String str5 = timeStamp3.toUTCString();
    java.lang.String str6 = timeStamp3.toDateString();
    int i7 = timeStamp1.compareTo(timeStamp3);
    long long8 = timeStamp3.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1670570138002259968L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wed, Oct 11 2023 10:02:55.500 UTC"+ "'", str5.equals("Wed, Oct 11 2023 10:02:55.500 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Wed, Oct 11 2023 10:02:55.500"+ "'", str6.equals("Wed, Oct 11 2023 10:02:55.500"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1670570138002259968L));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000061");
    java.lang.String str2 = timeStamp1.toDateString();
    java.lang.String str3 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000061"+ "'", str3.equals("00000000.00000061"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    TimeStamp timeStamp1 = new TimeStamp(2085978496000L);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)10);
    java.util.Date date2 = timeStamp1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)10);
    long long2 = timeStamp1.getSeconds();
    java.lang.String str3 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2208988800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "83aa7e80.028f5c28"+ "'", str3.equals("83aa7e80.028f5c28"));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    long long5 = timeStamp1.ntpValue();
    java.util.Date date6 = null;
    TimeStamp timeStamp7 = new TimeStamp(date6);
    TimeStamp timeStamp9 = new TimeStamp("");
    java.lang.String str10 = timeStamp9.toString();
    java.lang.String str11 = timeStamp9.toString();
    int i12 = timeStamp7.compareTo(timeStamp9);
    java.lang.String str13 = timeStamp9.toString();
    java.lang.String str14 = timeStamp9.toDateString();
    java.lang.String str15 = timeStamp9.toString();
    boolean b16 = timeStamp1.equals((java.lang.Object)str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00000000.00000000"+ "'", str10.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "00000000.00000000"+ "'", str11.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "00000000.00000000"+ "'", str13.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str14.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "00000000.00000000"+ "'", str15.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    TimeStamp timeStamp4 = TimeStamp.getNtpTime((long)(short)10);
    long long5 = timeStamp4.getFraction();
    int i6 = timeStamp1.compareTo(timeStamp4);
    long long7 = timeStamp4.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 42949672L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 2208988800L);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.lang.String str2 = timeStamp1.toString();
    java.util.Date date3 = null;
    TimeStamp timeStamp4 = new TimeStamp(date3);
    long long5 = timeStamp4.getTime();
    int i6 = timeStamp1.compareTo(timeStamp4);
    TimeStamp timeStamp8 = TimeStamp.getNtpTime(10L);
    int i9 = timeStamp4.compareTo(timeStamp8);
    java.lang.String str10 = timeStamp4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000000"+ "'", str2.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00000000.00000000"+ "'", str10.equals("00000000.00000000"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    long long1 = TimeStamp.getTime((long)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    TimeStamp timeStamp1 = new TimeStamp((long)'a');
    TimeStamp timeStamp3 = TimeStamp.parseNtpString("00000000.00000000");
    java.lang.String str4 = timeStamp3.toDateString();
    java.util.Date date5 = timeStamp3.getDate();
    int i6 = timeStamp1.compareTo(timeStamp3);
    TimeStamp timeStamp7 = TimeStamp.getCurrentTime();
    long long8 = timeStamp7.ntpValue();
    java.lang.String str9 = timeStamp7.toUTCString();
    boolean b10 = timeStamp1.equals((java.lang.Object)timeStamp7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str4.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1670570137512633697L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Wed, Oct 11 2023 10:02:55.614 UTC"+ "'", str9.equals("Wed, Oct 11 2023 10:02:55.614 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:54.795");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    long long1 = TimeStamp.getTime((long)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.lang.String str7 = timeStamp3.toString();
    java.util.Date date8 = timeStamp3.getDate();
    TimeStamp timeStamp9 = new TimeStamp(date8);
    long long10 = timeStamp9.getSeconds();
    long long11 = timeStamp9.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    long long1 = TimeStamp.getTime((long)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    TimeStamp timeStamp1 = new TimeStamp((long)'#');
    long long2 = timeStamp1.getTime();
    TimeStamp timeStamp3 = TimeStamp.getCurrentTime();
    long long4 = timeStamp3.ntpValue();
    java.lang.String str5 = timeStamp3.toUTCString();
    java.lang.String str6 = timeStamp3.toDateString();
    int i7 = timeStamp1.compareTo(timeStamp3);
    TimeStamp timeStamp9 = TimeStamp.parseNtpString("00000000.00000061");
    java.lang.String str10 = timeStamp9.toDateString();
    long long11 = timeStamp9.ntpValue();
    boolean b12 = timeStamp1.equals((java.lang.Object)timeStamp9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1670570137319360168L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wed, Oct 11 2023 10:02:55.659 UTC"+ "'", str5.equals("Wed, Oct 11 2023 10:02:55.659 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Wed, Oct 11 2023 10:02:55.659"+ "'", str6.equals("Wed, Oct 11 2023 10:02:55.659"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str10.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 97L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:55.067 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    java.lang.String str1 = TimeStamp.toString((-1670570137512633697L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f14f.9d2f1a9f"+ "'", str1.equals("e8d0f14f.9d2f1a9f"));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    java.lang.String str1 = TimeStamp.toString((-1670570140368786949L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f14e.f2f1a9fb"+ "'", str1.equals("e8d0f14e.f2f1a9fb"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    java.lang.String str1 = TimeStamp.toString((-1670570139694477083L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f14f.1b22d0e5"+ "'", str1.equals("e8d0f14f.1b22d0e5"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(0L);
    long long2 = timeStamp1.getFraction();
    java.lang.String str3 = timeStamp1.toDateString();
    long long4 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Jan 01 1970 00:00:00.000"+ "'", str3.equals("Thu, Jan 01 1970 00:00:00.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    java.lang.String str4 = timeStamp3.toDateString();
    long long5 = timeStamp3.getSeconds();
    java.lang.String str6 = timeStamp3.toDateString();
    java.util.Date date7 = timeStamp3.getDate();
    TimeStamp timeStamp8 = new TimeStamp(date7);
    TimeStamp timeStamp9 = new TimeStamp(date7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str4.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str6.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date7);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570138796828918L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.lang.String str2 = timeStamp1.toString();
    java.lang.String str3 = timeStamp1.toString();
    TimeStamp timeStamp5 = new TimeStamp("");
    long long6 = timeStamp5.getFraction();
    int i7 = timeStamp1.compareTo(timeStamp5);
    long long8 = timeStamp5.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000000"+ "'", str2.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000000"+ "'", str3.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    boolean b7 = timeStamp1.equals((java.lang.Object)0);
    java.lang.String str8 = timeStamp1.toString();
    java.lang.String str9 = timeStamp1.toDateString();
    long long10 = timeStamp1.ntpValue();
    long long11 = timeStamp1.getFraction();
    long long12 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 2085978496000L);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:55.317 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570137383784678L));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    TimeStamp timeStamp1 = new TimeStamp(100L);
    java.lang.String str2 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000064"+ "'", str2.equals("00000000.00000064"));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    java.lang.String str1 = TimeStamp.toString((-1670570137491158860L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f14f.9e76c8b4"+ "'", str1.equals("e8d0f14f.9e76c8b4"));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    java.lang.String str1 = TimeStamp.toString(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000000"+ "'", str1.equals("00000000.00000000"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:55.659 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    java.lang.String str1 = TimeStamp.toString(2658584756L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.9e76c8b4"+ "'", str1.equals("00000000.9e76c8b4"));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    long long1 = timeStamp0.ntpValue();
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.ntpValue();
    java.lang.String str5 = timeStamp3.toString();
    boolean b6 = timeStamp0.equals((java.lang.Object)timeStamp3);
    long long7 = timeStamp3.ntpValue();
    boolean b9 = timeStamp3.equals((java.lang.Object)10.0f);
    java.util.Date date10 = timeStamp3.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1670570136606395597L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date10);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    TimeStamp timeStamp1 = new TimeStamp((-8959209420436317144L));
    java.lang.String str2 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "83aa7e80.028f5c28"+ "'", str2.equals("83aa7e80.028f5c28"));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    long long1 = TimeStamp.getTime(1314259992L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496306L);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    java.lang.String str1 = TimeStamp.toString(4290672328L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.ffbe76c8"+ "'", str1.equals("00000000.ffbe76c8"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:54.877 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.util.Date date4 = null;
    TimeStamp timeStamp5 = new TimeStamp(date4);
    TimeStamp timeStamp7 = new TimeStamp("");
    java.lang.String str8 = timeStamp7.toString();
    java.lang.String str9 = timeStamp7.toString();
    int i10 = timeStamp5.compareTo(timeStamp7);
    java.util.Date date11 = null;
    TimeStamp timeStamp12 = new TimeStamp(date11);
    long long13 = timeStamp12.getTime();
    java.lang.String str14 = timeStamp12.toDateString();
    java.lang.String str15 = timeStamp12.toString();
    boolean b17 = timeStamp12.equals((java.lang.Object)100.0f);
    int i18 = timeStamp5.compareTo(timeStamp12);
    java.util.Date date19 = null;
    TimeStamp timeStamp20 = new TimeStamp(date19);
    long long21 = timeStamp20.getTime();
    java.lang.String str22 = timeStamp20.toDateString();
    java.lang.String str23 = timeStamp20.toString();
    java.lang.String str24 = timeStamp20.toString();
    boolean b26 = timeStamp20.equals((java.lang.Object)0);
    java.lang.String str27 = timeStamp20.toString();
    int i28 = timeStamp5.compareTo(timeStamp20);
    int i29 = timeStamp1.compareTo(timeStamp5);
    java.lang.String str30 = timeStamp5.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00000000.00000000"+ "'", str9.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str14.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "00000000.00000000"+ "'", str15.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str22.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "00000000.00000000"+ "'", str23.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "00000000.00000000"+ "'", str24.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "00000000.00000000"+ "'", str27.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str30.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    java.lang.String str1 = TimeStamp.toString((long)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000000"+ "'", str1.equals("00000000.00000000"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    long long1 = TimeStamp.getTime((-1670570136885568472L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018575760L);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    boolean b7 = timeStamp1.equals((java.lang.Object)0);
    java.lang.String str8 = timeStamp1.toString();
    java.lang.String str9 = timeStamp1.toDateString();
    long long10 = timeStamp1.ntpValue();
    java.lang.String str11 = timeStamp1.toUTCString();
    long long12 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str11.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:55.067 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000000");
    java.lang.String str2 = timeStamp1.toDateString();
    java.util.Date date3 = timeStamp1.getDate();
    long long4 = timeStamp1.ntpValue();
    long long5 = timeStamp1.ntpValue();
    long long6 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    TimeStamp timeStamp1 = new TimeStamp(3199750635L);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    long long1 = TimeStamp.getTime((-1670570141098931389L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018574779L);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(1697018574767L);
    long long2 = timeStamp1.ntpValue();
    long long3 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1670570141150470996L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 3294239916L);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(0L);
    long long2 = timeStamp1.getFraction();
    java.lang.String str3 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Jan 01 1970 00:00:00.000 UTC"+ "'", str3.equals("Thu, Jan 01 1970 00:00:00.000 UTC"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    java.lang.String str1 = TimeStamp.toString((-1670570140759628973L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f14e.dba5e353"+ "'", str1.equals("e8d0f14e.dba5e353"));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:55.789");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    long long1 = TimeStamp.getTime(1697018574646L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978891118L);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:55.865");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:55.659 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    long long1 = timeStamp0.ntpValue();
    java.lang.String str2 = timeStamp0.toUTCString();
    long long3 = timeStamp0.getFraction();
    long long4 = timeStamp0.getTime();
    java.lang.String str5 = timeStamp0.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1670570136095294489L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Wed, Oct 11 2023 10:02:55.944 UTC"+ "'", str2.equals("Wed, Oct 11 2023 10:02:55.944 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 4054449127L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1697018575944L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wed, Oct 11 2023 10:02:55.944 UTC"+ "'", str5.equals("Wed, Oct 11 2023 10:02:55.944 UTC"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    long long1 = TimeStamp.getTime(3906007374L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496909L);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570140867003155L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000061");
    long long2 = timeStamp1.getSeconds();
    java.lang.String str3 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("83aa7e80.028f5c28");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    boolean b7 = timeStamp1.equals((java.lang.Object)0);
    java.lang.String str8 = timeStamp1.toString();
    java.lang.String str9 = timeStamp1.toDateString();
    long long10 = timeStamp1.ntpValue();
    long long11 = timeStamp1.getFraction();
    java.util.Date date12 = null;
    TimeStamp timeStamp13 = new TimeStamp(date12);
    long long14 = timeStamp13.ntpValue();
    boolean b16 = timeStamp13.equals((java.lang.Object)(byte)10);
    int i17 = timeStamp1.compareTo(timeStamp13);
    java.lang.String str18 = timeStamp13.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "00000000.00000000"+ "'", str18.equals("00000000.00000000"));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


    TimeStamp timeStamp1 = new TimeStamp((long)'a');
    TimeStamp timeStamp3 = TimeStamp.parseNtpString("00000000.00000000");
    java.lang.String str4 = timeStamp3.toDateString();
    java.util.Date date5 = timeStamp3.getDate();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date7 = timeStamp3.getDate();
    long long8 = timeStamp3.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str4.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 2085978496000L);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }


    TimeStamp timeStamp1 = new TimeStamp((long)'#');
    long long2 = timeStamp1.getFraction();
    long long3 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }


    long long1 = TimeStamp.getTime((long)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }


    TimeStamp timeStamp1 = new TimeStamp(2680059592L);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)10);
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
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    TimeStamp timeStamp4 = new TimeStamp(date2);
    java.util.Date date5 = null;
    TimeStamp timeStamp6 = new TimeStamp(date5);
    long long7 = timeStamp6.getTime();
    java.lang.String str8 = timeStamp6.toDateString();
    long long9 = timeStamp6.getTime();
    java.lang.String str10 = timeStamp6.toString();
    boolean b12 = timeStamp6.equals((java.lang.Object)(short)10);
    int i13 = timeStamp4.compareTo(timeStamp6);
    TimeStamp timeStamp15 = TimeStamp.getNtpTime(2085978496909L);
    int i16 = timeStamp4.compareTo(timeStamp15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str8.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00000000.00000000"+ "'", str10.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }


    long long1 = TimeStamp.getTime((-1670570136434596905L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018575865L);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }


    TimeStamp timeStamp1 = new TimeStamp("83aa7e80.028f5c28");
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((-1670570141670162039L));
    int i4 = timeStamp1.compareTo(timeStamp3);
    TimeStamp timeStamp6 = new TimeStamp("83aa7e80.028f5c28");
    java.util.Date date7 = timeStamp6.getDate();
    int i8 = timeStamp3.compareTo(timeStamp6);
    long long9 = timeStamp6.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 2208988800L);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }


    TimeStamp timeStamp1 = new TimeStamp("83aa7e80.028f5c28");
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((-1670570141670162039L));
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 42949672L);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    java.lang.String str3 = timeStamp1.toDateString();
    java.util.Date date4 = timeStamp1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date4);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.util.Date date2 = timeStamp1.getDate();
    java.lang.String str3 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000000"+ "'", str3.equals("00000000.00000000"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(0L);
    long long2 = timeStamp1.getFraction();
    java.lang.String str3 = timeStamp1.toDateString();
    long long4 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Jan 01 1970 00:00:00.000"+ "'", str3.equals("Thu, Jan 01 1970 00:00:00.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-8959209420479266816L));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)'4');
    java.lang.String str2 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Jan 01 1970 00:00:00.052"+ "'", str2.equals("Thu, Jan 01 1970 00:00:00.052"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570140368786949L));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }


    long long1 = TimeStamp.getTime((-1670570141683046941L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018574643L);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.lang.String str7 = timeStamp3.toString();
    java.util.Date date8 = timeStamp3.getDate();
    TimeStamp timeStamp9 = new TimeStamp(date8);
    long long10 = timeStamp9.getSeconds();
    boolean b12 = timeStamp9.equals((java.lang.Object)2085978496909L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }


    java.lang.String str1 = TimeStamp.toString(1697018575496L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0000018b.1e307a88"+ "'", str1.equals("0000018b.1e307a88"));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(1697018574767L);
    long long2 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 3294239916L);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:54.875");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:55.500");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    TimeStamp timeStamp4 = TimeStamp.getNtpTime((long)(short)10);
    long long5 = timeStamp4.getFraction();
    int i6 = timeStamp1.compareTo(timeStamp4);
    boolean b8 = timeStamp4.equals((java.lang.Object)(-1670570138569195652L));
    java.lang.String str9 = timeStamp4.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 42949672L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Jan 01 1970 00:00:00.010"+ "'", str9.equals("Thu, Jan 01 1970 00:00:00.010"));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)10);
    java.lang.String str2 = timeStamp1.toString();
    TimeStamp timeStamp4 = TimeStamp.getNtpTime((long)(short)-1);
    long long5 = timeStamp4.getFraction();
    java.util.Date date6 = timeStamp4.getDate();
    boolean b7 = timeStamp1.equals((java.lang.Object)date6);
    TimeStamp timeStamp8 = new TimeStamp(date6);
    TimeStamp timeStamp9 = new TimeStamp(date6);
    TimeStamp timeStamp10 = new TimeStamp(date6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "83aa7e80.028f5c28"+ "'", str2.equals("83aa7e80.028f5c28"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 4290672328L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Thu, Jan 01 1970 00:00:00.100 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    long long6 = timeStamp1.getSeconds();
    java.util.Date date7 = timeStamp1.getDate();
    TimeStamp timeStamp8 = new TimeStamp(date7);
    java.lang.String str9 = timeStamp8.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }


    TimeStamp timeStamp1 = new TimeStamp("83aa7e7f.ffbe76c8");
    java.lang.String str2 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Wed, Dec 31 1969 23:59:59.999"+ "'", str2.equals("Wed, Dec 31 1969 23:59:59.999"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570140759628973L));
    java.lang.String str2 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Wed, Oct 11 2023 10:02:54.858 UTC"+ "'", str2.equals("Wed, Oct 11 2023 10:02:54.858 UTC"));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date7 = timeStamp3.getDate();
    java.lang.String str8 = timeStamp3.toUTCString();
    long long9 = timeStamp3.getSeconds();
    java.lang.String str10 = timeStamp3.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str8.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str10.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }


    java.lang.String str1 = TimeStamp.toString((-1670570138680864801L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f14f.578d4fdf"+ "'", str1.equals("e8d0f14f.578d4fdf"));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    boolean b7 = timeStamp1.equals((java.lang.Object)0);
    java.lang.String str8 = timeStamp1.toString();
    long long9 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }


    long long1 = TimeStamp.getTime((-1670570136301452919L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018575896L);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570141244960277L));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570140184103355L));
    long long2 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2770253906L);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }


    TimeStamp timeStamp1 = new TimeStamp("00000000.00000001");

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570139479728718L));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:55.500 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    java.lang.String str2 = timeStamp1.toDateString();
    TimeStamp timeStamp4 = TimeStamp.parseNtpString("00000000.00000061");
    long long5 = timeStamp4.getSeconds();
    long long6 = timeStamp4.ntpValue();
    int i7 = timeStamp1.compareTo(timeStamp4);
    long long8 = timeStamp4.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 97L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 97L);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570138096749249L));
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }


    java.lang.String str1 = TimeStamp.toString((-1670570139479728718L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f14f.27ef9db2"+ "'", str1.equals("e8d0f14f.27ef9db2"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }


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
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570141244960277L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("e8d0f14f.578d4fdf");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(1697018574877L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }


    long long1 = TimeStamp.getTime(3672197038L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496855L);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(3002182139L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1L));
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.getTime();
    java.lang.String str5 = timeStamp3.toDateString();
    long long6 = timeStamp3.getTime();
    java.lang.String str7 = timeStamp3.toString();
    int i8 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date9 = timeStamp3.getDate();
    TimeStamp timeStamp10 = new TimeStamp(date9);
    long long11 = timeStamp10.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str5.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }


    java.lang.String str1 = TimeStamp.toString((long)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ffffffff.ffffffff"+ "'", str1.equals("ffffffff.ffffffff"));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date7 = null;
    TimeStamp timeStamp8 = new TimeStamp(date7);
    long long9 = timeStamp8.ntpValue();
    java.lang.String str10 = timeStamp8.toString();
    boolean b11 = timeStamp3.equals((java.lang.Object)str10);
    long long12 = timeStamp3.getSeconds();
    java.lang.String str13 = timeStamp3.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00000000.00000000"+ "'", str10.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str13.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:55.496 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }


    long long1 = TimeStamp.getTime(2658584756L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496619L);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    long long2 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }


    TimeStamp timeStamp1 = new TimeStamp("000001e5.ae01dc00");
    long long2 = timeStamp1.ntpValue();
    long long3 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 2919357440L);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1L));
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.getTime();
    java.lang.String str5 = timeStamp3.toDateString();
    long long6 = timeStamp3.getTime();
    java.lang.String str7 = timeStamp3.toString();
    int i8 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date9 = timeStamp3.getDate();
    long long10 = timeStamp3.ntpValue();
    java.util.Date date11 = timeStamp3.getDate();
    TimeStamp timeStamp12 = new TimeStamp(date11);
    TimeStamp timeStamp13 = new TimeStamp(date11);
    long long14 = timeStamp13.getFraction();
    long long15 = timeStamp13.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str5.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }


    long long1 = TimeStamp.getTime(3906007375L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496909L);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("83aa7e80.19999999");
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((-1L));
    java.util.Date date4 = null;
    TimeStamp timeStamp5 = new TimeStamp(date4);
    long long6 = timeStamp5.getTime();
    java.lang.String str7 = timeStamp5.toDateString();
    long long8 = timeStamp5.getTime();
    java.lang.String str9 = timeStamp5.toString();
    int i10 = timeStamp3.compareTo(timeStamp5);
    boolean b11 = timeStamp1.equals((java.lang.Object)timeStamp3);
    long long12 = timeStamp1.ntpValue();
    java.util.Date date13 = null;
    TimeStamp timeStamp14 = new TimeStamp(date13);
    long long15 = timeStamp14.ntpValue();
    java.lang.String str16 = timeStamp14.toString();
    boolean b17 = timeStamp1.equals((java.lang.Object)str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str7.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00000000.00000000"+ "'", str9.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420049770087L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "00000000.00000000"+ "'", str16.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(1697018575760L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000061");
    long long2 = timeStamp1.getSeconds();
    TimeStamp timeStamp3 = TimeStamp.getCurrentTime();
    long long4 = timeStamp3.ntpValue();
    long long5 = timeStamp3.getSeconds();
    int i6 = timeStamp1.compareTo(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1670570133896271234L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 3906007376L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000001");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }


    java.lang.String str1 = TimeStamp.toString((-1670570135356560114L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f150.1db22d0e"+ "'", str1.equals("e8d0f150.1db22d0e"));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570136434596905L));
    java.lang.String str2 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "e8d0f14f.dd70a3d7"+ "'", str2.equals("e8d0f14f.dd70a3d7"));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }


    TimeStamp timeStamp1 = new TimeStamp("00000000.00000000");
    TimeStamp timeStamp2 = TimeStamp.getCurrentTime();
    long long3 = timeStamp2.ntpValue();
    java.lang.String str4 = timeStamp2.toUTCString();
    boolean b5 = timeStamp1.equals((java.lang.Object)str4);
    java.lang.String str6 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1670570133664343000L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Wed, Oct 11 2023 10:02:56.510 UTC"+ "'", str4.equals("Wed, Oct 11 2023 10:02:56.510 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str6.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    java.lang.String str4 = timeStamp3.toDateString();
    long long5 = timeStamp3.getSeconds();
    java.lang.String str6 = timeStamp3.toString();
    java.lang.String str7 = timeStamp3.toUTCString();
    long long8 = timeStamp3.ntpValue();
    long long9 = timeStamp3.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str4.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "00000000.00000000"+ "'", str6.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str7.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.lang.String str2 = timeStamp1.toString();
    java.lang.String str3 = timeStamp1.toString();
    TimeStamp timeStamp5 = new TimeStamp("");
    long long6 = timeStamp5.getFraction();
    int i7 = timeStamp1.compareTo(timeStamp5);
    java.util.Date date8 = timeStamp1.getDate();
    long long9 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000000"+ "'", str2.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000000"+ "'", str3.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(short)10);
    long long2 = timeStamp1.ntpValue();
    java.lang.String str3 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    boolean b7 = timeStamp1.equals((java.lang.Object)0);
    java.lang.String str8 = timeStamp1.toString();
    java.lang.String str9 = timeStamp1.toDateString();
    long long10 = timeStamp1.ntpValue();
    java.util.Date date11 = timeStamp1.getDate();
    java.util.Date date12 = null;
    TimeStamp timeStamp13 = new TimeStamp(date12);
    long long14 = timeStamp13.ntpValue();
    boolean b16 = timeStamp13.equals((java.lang.Object)(byte)10);
    java.util.Date date17 = null;
    TimeStamp timeStamp18 = new TimeStamp(date17);
    long long19 = timeStamp18.getTime();
    java.lang.String str20 = timeStamp18.toDateString();
    java.lang.String str21 = timeStamp18.toString();
    java.lang.String str22 = timeStamp18.toString();
    boolean b24 = timeStamp18.equals((java.lang.Object)0);
    int i25 = timeStamp13.compareTo(timeStamp18);
    int i26 = timeStamp1.compareTo(timeStamp13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str20.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "00000000.00000000"+ "'", str21.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "00000000.00000000"+ "'", str22.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }


    TimeStamp timeStamp1 = new TimeStamp(3294239916L);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(short)0);
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    TimeStamp timeStamp5 = new TimeStamp("");
    java.lang.String str6 = timeStamp5.toString();
    java.lang.String str7 = timeStamp5.toString();
    int i8 = timeStamp3.compareTo(timeStamp5);
    long long9 = timeStamp3.getSeconds();
    boolean b10 = timeStamp1.equals((java.lang.Object)timeStamp3);
    TimeStamp timeStamp12 = TimeStamp.parseNtpString("00000000.00000000");
    int i13 = timeStamp3.compareTo(timeStamp12);
    long long14 = timeStamp3.getTime();
    long long15 = timeStamp3.getSeconds();
    java.lang.String str16 = timeStamp3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "00000000.00000000"+ "'", str6.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "00000000.00000000"+ "'", str16.equals("00000000.00000000"));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }


    long long1 = TimeStamp.getTime((-1670570142215622886L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018574519L);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }


    long long1 = TimeStamp.getTime(1697018575896L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978891118L);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }


    long long1 = TimeStamp.getTime((long)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    long long1 = timeStamp0.ntpValue();
    java.lang.String str2 = timeStamp0.toUTCString();
    long long3 = timeStamp0.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1670570133518314111L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Wed, Oct 11 2023 10:02:56.544 UTC"+ "'", str2.equals("Wed, Oct 11 2023 10:02:56.544 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 1697018576544L);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:55.317");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.getSeconds();
    java.lang.String str5 = timeStamp3.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str5.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }


    java.lang.String str1 = TimeStamp.toString((-1670570139565628064L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f14f.22d0e560"+ "'", str1.equals("e8d0f14f.22d0e560"));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }


    TimeStamp timeStamp1 = new TimeStamp("83aa7e80.028f5c28");
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((-1670570141670162039L));
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp3.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 4127463572L);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date7 = null;
    TimeStamp timeStamp8 = new TimeStamp(date7);
    long long9 = timeStamp8.getTime();
    java.lang.String str10 = timeStamp8.toDateString();
    java.lang.String str11 = timeStamp8.toString();
    boolean b13 = timeStamp8.equals((java.lang.Object)100.0f);
    int i14 = timeStamp1.compareTo(timeStamp8);
    java.util.Date date15 = null;
    TimeStamp timeStamp16 = new TimeStamp(date15);
    long long17 = timeStamp16.getTime();
    java.lang.String str18 = timeStamp16.toDateString();
    java.lang.String str19 = timeStamp16.toString();
    java.lang.String str20 = timeStamp16.toString();
    boolean b22 = timeStamp16.equals((java.lang.Object)0);
    java.lang.String str23 = timeStamp16.toString();
    int i24 = timeStamp1.compareTo(timeStamp16);
    long long25 = timeStamp1.getSeconds();
    long long26 = timeStamp1.getSeconds();
    TimeStamp timeStamp28 = new TimeStamp((long)'a');
    TimeStamp timeStamp30 = TimeStamp.parseNtpString("00000000.00000000");
    java.lang.String str31 = timeStamp30.toDateString();
    java.util.Date date32 = timeStamp30.getDate();
    int i33 = timeStamp28.compareTo(timeStamp30);
    java.util.Date date34 = timeStamp30.getDate();
    boolean b35 = timeStamp1.equals((java.lang.Object)date34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str10.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "00000000.00000000"+ "'", str11.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str18.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "00000000.00000000"+ "'", str19.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "00000000.00000000"+ "'", str20.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "00000000.00000000"+ "'", str23.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long26 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str31.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }


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
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }


    java.lang.String str1 = TimeStamp.toString((-1670570141232075375L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f14e.bf7ced91"+ "'", str1.equals("e8d0f14e.bf7ced91"));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    long long1 = timeStamp0.ntpValue();
    java.lang.String str2 = timeStamp0.toUTCString();
    java.util.Date date3 = timeStamp0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1670570132899838821L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Wed, Oct 11 2023 10:02:56.688 UTC"+ "'", str2.equals("Wed, Oct 11 2023 10:02:56.688 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("e8d0f14e.dba5e353");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1L));
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.getTime();
    java.lang.String str5 = timeStamp3.toDateString();
    long long6 = timeStamp3.getTime();
    java.lang.String str7 = timeStamp3.toString();
    int i8 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date9 = timeStamp1.getDate();
    java.lang.String str10 = timeStamp1.toDateString();
    java.lang.String str11 = timeStamp1.toDateString();
    long long12 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str5.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Wed, Dec 31 1969 23:59:59.999"+ "'", str10.equals("Wed, Dec 31 1969 23:59:59.999"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Wed, Dec 31 1969 23:59:59.999"+ "'", str11.equals("Wed, Dec 31 1969 23:59:59.999"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 2208988799L);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570138680864801L));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570137512633697L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:55.500 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }


    TimeStamp timeStamp1 = new TimeStamp("e8d0f14f.578d4fdf");

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }


    long long1 = TimeStamp.getTime((-1670570133058752611L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018576651L);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570139264980354L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }


    TimeStamp timeStamp1 = new TimeStamp(10L);
    long long2 = timeStamp1.getSeconds();
    java.lang.String str3 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.lang.String str2 = timeStamp1.toString();
    java.lang.String str3 = timeStamp1.toString();
    long long4 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000000"+ "'", str2.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000000"+ "'", str3.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("ffffffff.ffffffff");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570139861980808L));
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.getTime();
    java.lang.String str5 = timeStamp3.toDateString();
    long long6 = timeStamp3.ntpValue();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)-1);
    java.lang.String str9 = timeStamp8.toUTCString();
    int i10 = timeStamp3.compareTo(timeStamp8);
    boolean b11 = timeStamp1.equals((java.lang.Object)i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str5.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Wed, Dec 31 1969 23:59:59.999 UTC"+ "'", str9.equals("Wed, Dec 31 1969 23:59:59.999 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.util.Date date4 = null;
    TimeStamp timeStamp5 = new TimeStamp(date4);
    TimeStamp timeStamp7 = new TimeStamp("");
    java.lang.String str8 = timeStamp7.toString();
    java.lang.String str9 = timeStamp7.toString();
    int i10 = timeStamp5.compareTo(timeStamp7);
    java.util.Date date11 = null;
    TimeStamp timeStamp12 = new TimeStamp(date11);
    long long13 = timeStamp12.getTime();
    java.lang.String str14 = timeStamp12.toDateString();
    java.lang.String str15 = timeStamp12.toString();
    boolean b17 = timeStamp12.equals((java.lang.Object)100.0f);
    int i18 = timeStamp5.compareTo(timeStamp12);
    java.util.Date date19 = null;
    TimeStamp timeStamp20 = new TimeStamp(date19);
    long long21 = timeStamp20.getTime();
    java.lang.String str22 = timeStamp20.toDateString();
    java.lang.String str23 = timeStamp20.toString();
    java.lang.String str24 = timeStamp20.toString();
    boolean b26 = timeStamp20.equals((java.lang.Object)0);
    java.lang.String str27 = timeStamp20.toString();
    int i28 = timeStamp5.compareTo(timeStamp20);
    int i29 = timeStamp1.compareTo(timeStamp5);
    TimeStamp timeStamp31 = new TimeStamp((long)'a');
    int i32 = timeStamp5.compareTo(timeStamp31);
    java.lang.String str33 = timeStamp5.toUTCString();
    TimeStamp timeStamp35 = new TimeStamp("");
    java.lang.String str36 = timeStamp35.toString();
    java.lang.String str37 = timeStamp35.toString();
    TimeStamp timeStamp39 = new TimeStamp("");
    long long40 = timeStamp39.getFraction();
    int i41 = timeStamp35.compareTo(timeStamp39);
    TimeStamp timeStamp43 = new TimeStamp("000001e5.ae01dc00");
    int i44 = timeStamp39.compareTo(timeStamp43);
    boolean b45 = timeStamp5.equals((java.lang.Object)i44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00000000.00000000"+ "'", str9.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str14.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "00000000.00000000"+ "'", str15.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str22.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "00000000.00000000"+ "'", str23.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "00000000.00000000"+ "'", str24.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "00000000.00000000"+ "'", str27.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str33.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "00000000.00000000"+ "'", str36.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "00000000.00000000"+ "'", str37.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long40 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    long long1 = timeStamp0.ntpValue();
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.ntpValue();
    java.lang.String str5 = timeStamp3.toString();
    boolean b6 = timeStamp0.equals((java.lang.Object)timeStamp3);
    long long7 = timeStamp3.ntpValue();
    java.lang.String str8 = timeStamp3.toDateString();
    long long9 = timeStamp3.getTime();
    long long10 = timeStamp3.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1670570132255593726L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str8.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 2085978496000L);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570141150470996L));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(42949672L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570142511975629L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }


    long long1 = TimeStamp.getTime((-8959209420483561784L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(1697018574646L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    boolean b4 = timeStamp1.equals((java.lang.Object)(byte)10);
    java.util.Date date5 = null;
    TimeStamp timeStamp6 = new TimeStamp(date5);
    long long7 = timeStamp6.getTime();
    java.lang.String str8 = timeStamp6.toDateString();
    java.lang.String str9 = timeStamp6.toString();
    java.lang.String str10 = timeStamp6.toString();
    boolean b12 = timeStamp6.equals((java.lang.Object)0);
    int i13 = timeStamp1.compareTo(timeStamp6);
    java.util.Date date14 = null;
    TimeStamp timeStamp15 = new TimeStamp(date14);
    long long16 = timeStamp15.getTime();
    java.lang.String str17 = timeStamp15.toDateString();
    long long18 = timeStamp15.getTime();
    java.lang.String str19 = timeStamp15.toString();
    java.util.Date date20 = null;
    TimeStamp timeStamp21 = new TimeStamp(date20);
    long long22 = timeStamp21.getTime();
    java.lang.String str23 = timeStamp21.toDateString();
    java.lang.String str24 = timeStamp21.toString();
    java.lang.String str25 = timeStamp21.toString();
    long long26 = timeStamp21.getSeconds();
    java.lang.String str27 = timeStamp21.toUTCString();
    int i28 = timeStamp15.compareTo(timeStamp21);
    boolean b29 = timeStamp1.equals((java.lang.Object)timeStamp15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str8.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00000000.00000000"+ "'", str9.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00000000.00000000"+ "'", str10.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str17.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "00000000.00000000"+ "'", str19.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str23.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "00000000.00000000"+ "'", str24.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "00000000.00000000"+ "'", str25.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long26 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str27.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(short)0);
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    TimeStamp timeStamp5 = new TimeStamp("");
    java.lang.String str6 = timeStamp5.toString();
    java.lang.String str7 = timeStamp5.toString();
    int i8 = timeStamp3.compareTo(timeStamp5);
    long long9 = timeStamp3.getSeconds();
    boolean b10 = timeStamp1.equals((java.lang.Object)timeStamp3);
    java.lang.String str11 = timeStamp3.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "00000000.00000000"+ "'", str6.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str11.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }


    java.lang.String str1 = TimeStamp.toString(1697018575865L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0000018b.1e307bf9"+ "'", str1.equals("0000018b.1e307bf9"));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }


    TimeStamp timeStamp1 = new TimeStamp("83aa7e80.028f5c28");
    java.util.Date date2 = timeStamp1.getDate();
    long long3 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 10L);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(1697018574767L);
    long long2 = timeStamp1.getSeconds();
    java.lang.String str3 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 3906007374L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "e8d0f14e.c45a1cac"+ "'", str3.equals("e8d0f14e.c45a1cac"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    long long4 = timeStamp1.getFraction();
    java.lang.String str5 = timeStamp1.toUTCString();
    java.lang.String str6 = timeStamp1.toUTCString();
    long long7 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str5.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str6.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(10L);
    java.lang.String str2 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Jan 01 1970 00:00:00.010 UTC"+ "'", str2.equals("Thu, Jan 01 1970 00:00:00.010 UTC"));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }


    java.lang.String str1 = TimeStamp.toString(3959959846L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.ec083126"+ "'", str1.equals("00000000.ec083126"));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Thu, Jan 01 1970 00:00:00.010");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    TimeStamp timeStamp5 = new TimeStamp("");
    java.lang.String str6 = timeStamp5.toString();
    java.lang.String str7 = timeStamp5.toString();
    int i8 = timeStamp3.compareTo(timeStamp5);
    java.util.Date date9 = null;
    TimeStamp timeStamp10 = new TimeStamp(date9);
    long long11 = timeStamp10.getTime();
    java.lang.String str12 = timeStamp10.toDateString();
    java.lang.String str13 = timeStamp10.toString();
    boolean b15 = timeStamp10.equals((java.lang.Object)100.0f);
    int i16 = timeStamp3.compareTo(timeStamp10);
    java.util.Date date17 = null;
    TimeStamp timeStamp18 = new TimeStamp(date17);
    long long19 = timeStamp18.getTime();
    java.lang.String str20 = timeStamp18.toDateString();
    java.lang.String str21 = timeStamp18.toString();
    java.lang.String str22 = timeStamp18.toString();
    boolean b24 = timeStamp18.equals((java.lang.Object)0);
    java.lang.String str25 = timeStamp18.toString();
    int i26 = timeStamp3.compareTo(timeStamp18);
    long long27 = timeStamp3.getSeconds();
    boolean b29 = timeStamp3.equals((java.lang.Object)2208988800L);
    int i30 = timeStamp1.compareTo(timeStamp3);
    long long31 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "00000000.00000000"+ "'", str6.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str12.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "00000000.00000000"+ "'", str13.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str20.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "00000000.00000000"+ "'", str21.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "00000000.00000000"+ "'", str22.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "00000000.00000000"+ "'", str25.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long31 == 0L);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date7 = null;
    TimeStamp timeStamp8 = new TimeStamp(date7);
    long long9 = timeStamp8.getTime();
    java.lang.String str10 = timeStamp8.toDateString();
    java.lang.String str11 = timeStamp8.toString();
    boolean b13 = timeStamp8.equals((java.lang.Object)100.0f);
    int i14 = timeStamp1.compareTo(timeStamp8);
    long long15 = timeStamp8.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str10.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "00000000.00000000"+ "'", str11.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:56.427 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }


    TimeStamp timeStamp1 = new TimeStamp((-8959209420436317144L));
    long long2 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2208988800L);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(1697018574902L);
    long long2 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1670570140570650412L));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    long long4 = timeStamp1.getFraction();
    java.lang.String str5 = timeStamp1.toUTCString();
    java.lang.String str6 = timeStamp1.toUTCString();
    java.lang.String str7 = timeStamp1.toDateString();
    java.lang.String str8 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str5.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str6.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str7.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000000");
    java.lang.String str2 = timeStamp1.toDateString();
    java.util.Date date3 = timeStamp1.getDate();
    long long4 = timeStamp1.ntpValue();
    long long5 = timeStamp1.ntpValue();
    TimeStamp timeStamp6 = TimeStamp.getCurrentTime();
    long long7 = timeStamp6.ntpValue();
    java.lang.String str8 = timeStamp6.toUTCString();
    long long9 = timeStamp6.ntpValue();
    int i10 = timeStamp1.compareTo(timeStamp6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1670570131229096543L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Wed, Oct 11 2023 10:02:57.077 UTC"+ "'", str8.equals("Wed, Oct 11 2023 10:02:57.077 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == (-1670570131229096543L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }


    TimeStamp timeStamp1 = new TimeStamp("e8d0f150.1db22d0e");

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(10L);
    long long2 = timeStamp1.ntpValue();
    long long3 = timeStamp1.getSeconds();
    java.lang.String str4 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-8959209420436317144L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 2208988800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "83aa7e80.028f5c28"+ "'", str4.equals("83aa7e80.028f5c28"));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }


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
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }


    TimeStamp timeStamp1 = new TimeStamp((long)'#');
    long long2 = timeStamp1.getFraction();
    java.lang.String str3 = timeStamp1.toString();
    TimeStamp timeStamp4 = TimeStamp.getCurrentTime();
    long long5 = timeStamp4.ntpValue();
    java.util.Date date6 = null;
    TimeStamp timeStamp7 = new TimeStamp(date6);
    long long8 = timeStamp7.ntpValue();
    java.lang.String str9 = timeStamp7.toString();
    boolean b10 = timeStamp4.equals((java.lang.Object)timeStamp7);
    long long11 = timeStamp4.getFraction();
    boolean b12 = timeStamp1.equals((java.lang.Object)timeStamp4);
    java.lang.String str13 = timeStamp4.toDateString();
    java.util.Date date14 = timeStamp4.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000023"+ "'", str3.equals("00000000.00000023"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1670570131087362622L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00000000.00000000"+ "'", str9.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 472446402L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Wed, Oct 11 2023 10:02:57.110"+ "'", str13.equals("Wed, Oct 11 2023 10:02:57.110"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date14);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }


    TimeStamp timeStamp1 = new TimeStamp(0L);
    long long2 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(byte)10);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    long long4 = timeStamp1.getTime();
    long long5 = timeStamp1.getSeconds();
    java.util.Date date6 = null;
    TimeStamp timeStamp7 = new TimeStamp(date6);
    TimeStamp timeStamp9 = new TimeStamp("");
    java.lang.String str10 = timeStamp9.toString();
    java.lang.String str11 = timeStamp9.toString();
    int i12 = timeStamp7.compareTo(timeStamp9);
    java.lang.String str13 = timeStamp9.toString();
    java.util.Date date14 = timeStamp9.getDate();
    boolean b16 = timeStamp9.equals((java.lang.Object)(byte)1);
    java.lang.String str17 = timeStamp9.toDateString();
    java.util.Date date18 = null;
    TimeStamp timeStamp19 = new TimeStamp(date18);
    TimeStamp timeStamp21 = new TimeStamp("");
    java.lang.String str22 = timeStamp21.toString();
    java.lang.String str23 = timeStamp21.toString();
    int i24 = timeStamp19.compareTo(timeStamp21);
    java.util.Date date25 = timeStamp21.getDate();
    TimeStamp timeStamp26 = new TimeStamp(date25);
    TimeStamp timeStamp27 = new TimeStamp(date25);
    java.lang.String str28 = timeStamp27.toString();
    boolean b29 = timeStamp9.equals((java.lang.Object)str28);
    boolean b30 = timeStamp1.equals((java.lang.Object)str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00000000.00000000"+ "'", str10.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "00000000.00000000"+ "'", str11.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "00000000.00000000"+ "'", str13.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str17.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "00000000.00000000"+ "'", str22.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "00000000.00000000"+ "'", str23.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "00000000.00000000"+ "'", str28.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000061");
    long long2 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(short)0);
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    TimeStamp timeStamp5 = new TimeStamp("");
    java.lang.String str6 = timeStamp5.toString();
    java.lang.String str7 = timeStamp5.toString();
    int i8 = timeStamp3.compareTo(timeStamp5);
    long long9 = timeStamp3.getSeconds();
    boolean b10 = timeStamp1.equals((java.lang.Object)timeStamp3);
    long long11 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "00000000.00000000"+ "'", str6.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1L));
    long long2 = timeStamp1.ntpValue();
    long long3 = timeStamp1.getTime();
    java.lang.String str4 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-8959209420483561784L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Wed, Dec 31 1969 23:59:59.999 UTC"+ "'", str4.equals("Wed, Dec 31 1969 23:59:59.999 UTC"));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(0L);
    long long2 = timeStamp1.getFraction();
    java.lang.String str3 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "83aa7e80.00000000"+ "'", str3.equals("83aa7e80.00000000"));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }


    TimeStamp timeStamp1 = new TimeStamp(1697018575944L);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }


    java.lang.String str1 = TimeStamp.toString((-1670570136434596905L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f14f.dd70a3d7"+ "'", str1.equals("e8d0f14f.dd70a3d7"));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.lang.String str7 = timeStamp3.toString();
    java.util.Date date8 = timeStamp3.getDate();
    TimeStamp timeStamp9 = new TimeStamp(date8);
    long long10 = timeStamp9.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    long long1 = timeStamp0.ntpValue();
    java.lang.String str2 = timeStamp0.toUTCString();
    long long3 = timeStamp0.getFraction();
    long long4 = timeStamp0.getTime();
    java.util.Date date5 = timeStamp0.getDate();
    TimeStamp timeStamp6 = new TimeStamp(date5);
    TimeStamp timeStamp7 = new TimeStamp(date5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1670570130717995434L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Wed, Oct 11 2023 10:02:57.196 UTC"+ "'", str2.equals("Wed, Oct 11 2023 10:02:57.196 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 841813590L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1697018577196L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date5);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:55.120 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }


    TimeStamp timeStamp1 = new TimeStamp("00000000.0000000a");
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    TimeStamp timeStamp5 = new TimeStamp("");
    java.lang.String str6 = timeStamp5.toString();
    java.lang.String str7 = timeStamp5.toString();
    int i8 = timeStamp3.compareTo(timeStamp5);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)100);
    java.lang.String str11 = timeStamp10.toUTCString();
    boolean b12 = timeStamp3.equals((java.lang.Object)timeStamp10);
    int i13 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date14 = timeStamp1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "00000000.00000000"+ "'", str6.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Thu, Jan 01 1970 00:00:00.100 UTC"+ "'", str11.equals("Thu, Jan 01 1970 00:00:00.100 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date14);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }


    TimeStamp timeStamp1 = new TimeStamp(35L);
    TimeStamp timeStamp3 = TimeStamp.getNtpTime(2085978496909L);
    int i4 = timeStamp1.compareTo(timeStamp3);
    long long5 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 35L);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }


    long long1 = TimeStamp.getTime((-1670570135652912858L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018576047L);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.lang.String str7 = timeStamp3.toString();
    java.util.Date date8 = timeStamp3.getDate();
    boolean b10 = timeStamp3.equals((java.lang.Object)(byte)1);
    java.util.Date date11 = null;
    TimeStamp timeStamp12 = new TimeStamp(date11);
    long long13 = timeStamp12.getTime();
    java.lang.String str14 = timeStamp12.toDateString();
    long long15 = timeStamp12.getTime();
    long long16 = timeStamp12.getSeconds();
    int i17 = timeStamp3.compareTo(timeStamp12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str14.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    TimeStamp timeStamp4 = new TimeStamp(date2);
    java.util.Date date5 = null;
    TimeStamp timeStamp6 = new TimeStamp(date5);
    long long7 = timeStamp6.getTime();
    java.lang.String str8 = timeStamp6.toDateString();
    long long9 = timeStamp6.getTime();
    java.lang.String str10 = timeStamp6.toString();
    boolean b12 = timeStamp6.equals((java.lang.Object)(short)10);
    int i13 = timeStamp4.compareTo(timeStamp6);
    TimeStamp timeStamp15 = TimeStamp.getNtpTime((long)(short)100);
    int i16 = timeStamp6.compareTo(timeStamp15);
    java.util.Date date17 = timeStamp6.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str8.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00000000.00000000"+ "'", str10.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date17);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:56.427 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }


    long long1 = TimeStamp.getTime(10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496000L);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    boolean b7 = timeStamp1.equals((java.lang.Object)0);
    java.lang.String str8 = timeStamp1.toString();
    java.lang.String str9 = timeStamp1.toDateString();
    long long10 = timeStamp1.ntpValue();
    java.lang.String str11 = timeStamp1.toUTCString();
    java.lang.String str12 = timeStamp1.toUTCString();
    long long13 = timeStamp1.getTime();
    long long14 = timeStamp1.getTime();
    TimeStamp timeStamp16 = TimeStamp.getNtpTime((-1L));
    java.util.Date date17 = null;
    TimeStamp timeStamp18 = new TimeStamp(date17);
    long long19 = timeStamp18.getTime();
    java.lang.String str20 = timeStamp18.toDateString();
    long long21 = timeStamp18.getTime();
    java.lang.String str22 = timeStamp18.toString();
    int i23 = timeStamp16.compareTo(timeStamp18);
    java.util.Date date24 = timeStamp16.getDate();
    java.lang.String str25 = timeStamp16.toDateString();
    java.lang.String str26 = timeStamp16.toDateString();
    long long27 = timeStamp16.ntpValue();
    boolean b28 = timeStamp1.equals((java.lang.Object)long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str11.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str12.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str20.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "00000000.00000000"+ "'", str22.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Wed, Dec 31 1969 23:59:59.999"+ "'", str25.equals("Wed, Dec 31 1969 23:59:59.999"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Wed, Dec 31 1969 23:59:59.999"+ "'", str26.equals("Wed, Dec 31 1969 23:59:59.999"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == (-8959209420483561784L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:55.944 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    long long2 = timeStamp1.getFraction();
    TimeStamp timeStamp3 = TimeStamp.getCurrentTime();
    long long4 = timeStamp3.ntpValue();
    java.util.Date date5 = null;
    TimeStamp timeStamp6 = new TimeStamp(date5);
    long long7 = timeStamp6.ntpValue();
    java.lang.String str8 = timeStamp6.toString();
    boolean b9 = timeStamp3.equals((java.lang.Object)timeStamp6);
    java.lang.String str10 = timeStamp3.toString();
    java.lang.String str11 = timeStamp3.toString();
    int i12 = timeStamp1.compareTo(timeStamp3);
    TimeStamp timeStamp13 = TimeStamp.getCurrentTime();
    long long14 = timeStamp13.ntpValue();
    long long15 = timeStamp13.getSeconds();
    int i16 = timeStamp1.compareTo(timeStamp13);
    long long17 = timeStamp13.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1670570130254138967L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "e8d0f151.4dd2f1a9"+ "'", str10.equals("e8d0f151.4dd2f1a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "e8d0f151.4dd2f1a9"+ "'", str11.equals("e8d0f151.4dd2f1a9"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == (-1670570130249843999L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 3906007377L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 3906007377L);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }


    TimeStamp timeStamp1 = new TimeStamp((long)'a');
    TimeStamp timeStamp3 = TimeStamp.parseNtpString("00000000.00000000");
    java.lang.String str4 = timeStamp3.toDateString();
    java.util.Date date5 = timeStamp3.getDate();
    int i6 = timeStamp1.compareTo(timeStamp3);
    long long7 = timeStamp3.getFraction();
    java.lang.String str8 = timeStamp3.toString();
    boolean b10 = timeStamp3.equals((java.lang.Object)"e8d0f151.4dd2f1a9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str4.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)10);
    long long2 = timeStamp1.getFraction();
    long long3 = timeStamp1.getFraction();
    java.util.Date date4 = null;
    TimeStamp timeStamp5 = new TimeStamp(date4);
    long long6 = timeStamp5.getTime();
    java.lang.String str7 = timeStamp5.toDateString();
    java.lang.String str8 = timeStamp5.toString();
    java.lang.String str9 = timeStamp5.toString();
    long long10 = timeStamp5.getSeconds();
    java.util.Date date11 = timeStamp5.getDate();
    TimeStamp timeStamp12 = new TimeStamp(date11);
    TimeStamp timeStamp13 = new TimeStamp(date11);
    TimeStamp timeStamp14 = new TimeStamp(date11);
    TimeStamp timeStamp15 = new TimeStamp(date11);
    boolean b16 = timeStamp1.equals((java.lang.Object)timeStamp15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 42949672L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 42949672L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str7.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00000000.00000000"+ "'", str9.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570141296499885L));
    java.lang.String str2 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "e8d0f14e.bba5e353"+ "'", str2.equals("e8d0f14e.bba5e353"));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1L));
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.getTime();
    java.lang.String str5 = timeStamp3.toDateString();
    long long6 = timeStamp3.getTime();
    java.lang.String str7 = timeStamp3.toString();
    int i8 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date9 = timeStamp1.getDate();
    long long10 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str5.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == (-1L));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }


    long long1 = TimeStamp.getTime((-1670570141150470996L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018574767L);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(0L);
    TimeStamp timeStamp2 = TimeStamp.getCurrentTime();
    long long3 = timeStamp2.ntpValue();
    java.util.Date date4 = null;
    TimeStamp timeStamp5 = new TimeStamp(date4);
    long long6 = timeStamp5.ntpValue();
    java.lang.String str7 = timeStamp5.toString();
    boolean b8 = timeStamp2.equals((java.lang.Object)timeStamp5);
    boolean b9 = timeStamp1.equals((java.lang.Object)timeStamp2);
    java.lang.String str10 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1670570129953491256L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Thu, Jan 01 1970 00:00:00.000 UTC"+ "'", str10.equals("Thu, Jan 01 1970 00:00:00.000 UTC"));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.util.Date date4 = null;
    TimeStamp timeStamp5 = new TimeStamp(date4);
    TimeStamp timeStamp7 = new TimeStamp("");
    java.lang.String str8 = timeStamp7.toString();
    java.lang.String str9 = timeStamp7.toString();
    int i10 = timeStamp5.compareTo(timeStamp7);
    java.util.Date date11 = null;
    TimeStamp timeStamp12 = new TimeStamp(date11);
    long long13 = timeStamp12.getTime();
    java.lang.String str14 = timeStamp12.toDateString();
    java.lang.String str15 = timeStamp12.toString();
    boolean b17 = timeStamp12.equals((java.lang.Object)100.0f);
    int i18 = timeStamp5.compareTo(timeStamp12);
    java.util.Date date19 = null;
    TimeStamp timeStamp20 = new TimeStamp(date19);
    long long21 = timeStamp20.getTime();
    java.lang.String str22 = timeStamp20.toDateString();
    java.lang.String str23 = timeStamp20.toString();
    java.lang.String str24 = timeStamp20.toString();
    boolean b26 = timeStamp20.equals((java.lang.Object)0);
    java.lang.String str27 = timeStamp20.toString();
    int i28 = timeStamp5.compareTo(timeStamp20);
    int i29 = timeStamp1.compareTo(timeStamp5);
    TimeStamp timeStamp31 = new TimeStamp((long)'a');
    int i32 = timeStamp5.compareTo(timeStamp31);
    TimeStamp timeStamp34 = TimeStamp.getNtpTime(1697018574767L);
    long long35 = timeStamp34.getSeconds();
    int i36 = timeStamp5.compareTo(timeStamp34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00000000.00000000"+ "'", str9.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str14.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "00000000.00000000"+ "'", str15.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str22.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "00000000.00000000"+ "'", str23.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "00000000.00000000"+ "'", str24.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "00000000.00000000"+ "'", str27.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long35 == 3906007374L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }


    java.lang.String str1 = TimeStamp.toString(472446402L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.1c28f5c2"+ "'", str1.equals("00000000.1c28f5c2"));

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(3088081485L);
    java.lang.String str2 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "83d99d51.7c28f5c2"+ "'", str2.equals("83d99d51.7c28f5c2"));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }


    java.lang.String str1 = TimeStamp.toString(2770253906L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.a51eb852"+ "'", str1.equals("00000000.a51eb852"));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    long long4 = timeStamp1.getFraction();
    TimeStamp timeStamp6 = new TimeStamp("83aa7e80.028f5c28");
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((-1670570141670162039L));
    int i9 = timeStamp6.compareTo(timeStamp8);
    int i10 = timeStamp1.compareTo(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }


    TimeStamp timeStamp1 = new TimeStamp("00000000.00000064");
    long long2 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }


    java.lang.String str1 = TimeStamp.toString((long)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000000"+ "'", str1.equals("00000000.00000000"));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570136065229718L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    long long1 = timeStamp0.ntpValue();
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.ntpValue();
    java.lang.String str5 = timeStamp3.toString();
    boolean b6 = timeStamp0.equals((java.lang.Object)timeStamp3);
    java.lang.String str7 = timeStamp0.toString();
    java.lang.String str8 = timeStamp0.toString();
    java.lang.String str9 = timeStamp0.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1670570129545469363L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "e8d0f151.7810624d"+ "'", str7.equals("e8d0f151.7810624d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "e8d0f151.7810624d"+ "'", str8.equals("e8d0f151.7810624d"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Wed, Oct 11 2023 10:02:57.469"+ "'", str9.equals("Wed, Oct 11 2023 10:02:57.469"));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(3985729650L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)-1);
    long long2 = timeStamp1.getFraction();
    java.lang.String str3 = timeStamp1.toString();
    long long4 = timeStamp1.getFraction();
    java.lang.String str5 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 4290672328L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "83aa7e7f.ffbe76c8"+ "'", str3.equals("83aa7e7f.ffbe76c8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 4290672328L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "83aa7e7f.ffbe76c8"+ "'", str5.equals("83aa7e7f.ffbe76c8"));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570138964332643L));
    TimeStamp timeStamp3 = TimeStamp.parseNtpString("00000000.00000000");
    java.lang.String str4 = timeStamp3.toDateString();
    java.util.Date date5 = timeStamp3.getDate();
    TimeStamp timeStamp6 = new TimeStamp(date5);
    java.util.Date date7 = null;
    TimeStamp timeStamp8 = new TimeStamp(date7);
    long long9 = timeStamp8.getTime();
    java.lang.String str10 = timeStamp8.toDateString();
    long long11 = timeStamp8.getTime();
    boolean b13 = timeStamp8.equals((java.lang.Object)"ffffffff.ffffffff");
    TimeStamp timeStamp14 = TimeStamp.getCurrentTime();
    long long15 = timeStamp14.ntpValue();
    java.util.Date date16 = null;
    TimeStamp timeStamp17 = new TimeStamp(date16);
    long long18 = timeStamp17.ntpValue();
    java.lang.String str19 = timeStamp17.toString();
    boolean b20 = timeStamp14.equals((java.lang.Object)timeStamp17);
    long long21 = timeStamp17.ntpValue();
    java.lang.String str22 = timeStamp17.toDateString();
    int i23 = timeStamp8.compareTo(timeStamp17);
    int i24 = timeStamp6.compareTo(timeStamp8);
    boolean b25 = timeStamp1.equals((java.lang.Object)i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str4.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str10.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == (-1670570129502519690L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "00000000.00000000"+ "'", str19.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str22.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(1697018575823L);
    long long2 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1670570136614985532L));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    boolean b7 = timeStamp1.equals((java.lang.Object)0);
    java.lang.String str8 = timeStamp1.toString();
    java.lang.String str9 = timeStamp1.toDateString();
    TimeStamp timeStamp11 = new TimeStamp(1697018574450L);
    long long12 = timeStamp11.ntpValue();
    int i13 = timeStamp1.compareTo(timeStamp11);
    java.lang.String str14 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 1697018574450L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str14.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)-1);
    long long2 = timeStamp1.getFraction();
    java.util.Date date3 = timeStamp1.getDate();
    TimeStamp timeStamp4 = new TimeStamp(date3);
    java.lang.String str5 = timeStamp4.toDateString();
    java.util.Date date6 = null;
    TimeStamp timeStamp7 = new TimeStamp(date6);
    long long8 = timeStamp7.getTime();
    java.lang.String str9 = timeStamp7.toDateString();
    java.lang.String str10 = timeStamp7.toString();
    java.lang.String str11 = timeStamp7.toString();
    boolean b13 = timeStamp7.equals((java.lang.Object)0);
    java.lang.String str14 = timeStamp7.toString();
    java.lang.String str15 = timeStamp7.toDateString();
    long long16 = timeStamp7.getTime();
    long long17 = timeStamp7.getSeconds();
    java.lang.String str18 = timeStamp7.toDateString();
    int i19 = timeStamp4.compareTo(timeStamp7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 4290672328L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wed, Dec 31 1969 23:59:59.999"+ "'", str5.equals("Wed, Dec 31 1969 23:59:59.999"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00000000.00000000"+ "'", str10.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "00000000.00000000"+ "'", str11.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "00000000.00000000"+ "'", str14.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str15.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str18.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    java.lang.String str3 = timeStamp1.toString();
    java.util.Date date4 = null;
    TimeStamp timeStamp5 = new TimeStamp(date4);
    long long6 = timeStamp5.ntpValue();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)10);
    long long9 = timeStamp8.getFraction();
    int i10 = timeStamp5.compareTo(timeStamp8);
    java.lang.String str11 = timeStamp5.toDateString();
    long long12 = timeStamp5.getTime();
    java.util.Date date13 = timeStamp5.getDate();
    boolean b14 = timeStamp1.equals((java.lang.Object)timeStamp5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000000"+ "'", str3.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 42949672L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str11.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570130803894780L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570142215622886L));
    java.lang.String str2 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Wed, Oct 11 2023 10:02:54.519 UTC"+ "'", str2.equals("Wed, Oct 11 2023 10:02:54.519 UTC"));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    long long2 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 1L);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:55.855 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }


    TimeStamp timeStamp1 = new TimeStamp("000001e5.ae01dc00");
    java.lang.String str2 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:36:21.680"+ "'", str2.equals("Thu, Feb 07 2036 06:36:21.680"));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }


    java.lang.String str1 = TimeStamp.toString(1697018575067L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0000018b.1e3078db"+ "'", str1.equals("0000018b.1e3078db"));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)-1);
    java.lang.String str2 = timeStamp1.toUTCString();
    long long3 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Wed, Dec 31 1969 23:59:59.999 UTC"+ "'", str2.equals("Wed, Dec 31 1969 23:59:59.999 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-8959209420483561784L));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    long long4 = timeStamp1.ntpValue();
    TimeStamp timeStamp6 = TimeStamp.getNtpTime((long)(short)-1);
    java.lang.String str7 = timeStamp6.toUTCString();
    int i8 = timeStamp1.compareTo(timeStamp6);
    long long9 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Wed, Dec 31 1969 23:59:59.999 UTC"+ "'", str7.equals("Wed, Dec 31 1969 23:59:59.999 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570141296499885L));
    long long2 = timeStamp1.getFraction();
    TimeStamp timeStamp4 = TimeStamp.parseNtpString("");
    java.util.Date date5 = timeStamp4.getDate();
    TimeStamp timeStamp6 = new TimeStamp(date5);
    TimeStamp timeStamp7 = new TimeStamp(date5);
    TimeStamp timeStamp8 = new TimeStamp(date5);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime(0L);
    boolean b11 = timeStamp8.equals((java.lang.Object)0L);
    java.lang.String str12 = timeStamp8.toDateString();
    int i13 = timeStamp1.compareTo(timeStamp8);
    long long14 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 3148211027L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str12.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 3906007374L);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(3414499000L);
    long long2 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2212403299L);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000000");
    java.lang.String str2 = timeStamp1.toDateString();
    long long3 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 2085978496000L);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:54.877 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:55.120");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }


    TimeStamp timeStamp1 = new TimeStamp("e8d0f151.7810624d");

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }


    TimeStamp timeStamp1 = new TimeStamp(1697018575855L);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }


    TimeStamp timeStamp1 = new TimeStamp("00000000.00000061");
    java.lang.String str2 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000061"+ "'", str2.equals("00000000.00000061"));

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }


    TimeStamp timeStamp1 = new TimeStamp("00000000.00000034");
    boolean b3 = timeStamp1.equals((java.lang.Object)"00000000.9e76c8b4");
    java.lang.String str4 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000034"+ "'", str4.equals("00000000.00000034"));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:55.823 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }


    java.lang.String str1 = TimeStamp.toString(2085978891118L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "000001e5.ae07e36e"+ "'", str1.equals("000001e5.ae07e36e"));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.lang.String str2 = timeStamp1.toString();
    java.lang.String str3 = timeStamp1.toString();
    TimeStamp timeStamp5 = new TimeStamp("");
    long long6 = timeStamp5.getFraction();
    int i7 = timeStamp1.compareTo(timeStamp5);
    java.util.Date date8 = timeStamp1.getDate();
    TimeStamp timeStamp9 = new TimeStamp(date8);
    TimeStamp timeStamp10 = new TimeStamp(date8);
    TimeStamp timeStamp11 = new TimeStamp(date8);
    long long12 = timeStamp11.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000000"+ "'", str2.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000000"+ "'", str3.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }


    long long1 = TimeStamp.getTime(3766686318L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496877L);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }


    TimeStamp timeStamp1 = new TimeStamp((long)'a');
    TimeStamp timeStamp3 = TimeStamp.parseNtpString("00000000.00000000");
    java.lang.String str4 = timeStamp3.toDateString();
    java.util.Date date5 = timeStamp3.getDate();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.lang.String str7 = timeStamp3.toUTCString();
    java.lang.String str8 = timeStamp3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str4.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str7.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(2085978496877L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570142511975629L));
    boolean b3 = timeStamp1.equals((java.lang.Object)"e8d0f14e.73333333");
    long long4 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1670570142511975629L));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:55.619 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)'4');
    java.lang.String str2 = timeStamp1.toUTCString();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Jan 01 1970 00:00:00.052 UTC"+ "'", str2.equals("Thu, Jan 01 1970 00:00:00.052 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Jan 01 1970 00:00:00.052"+ "'", str3.equals("Thu, Jan 01 1970 00:00:00.052"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Jan 01 1970 00:00:00.052"+ "'", str4.equals("Thu, Jan 01 1970 00:00:00.052"));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }


    long long1 = TimeStamp.getTime((-1670570136606395597L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018575825L);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570141670162039L));
    TimeStamp timeStamp3 = new TimeStamp((long)(short)0);
    java.util.Date date4 = null;
    TimeStamp timeStamp5 = new TimeStamp(date4);
    TimeStamp timeStamp7 = new TimeStamp("");
    java.lang.String str8 = timeStamp7.toString();
    java.lang.String str9 = timeStamp7.toString();
    int i10 = timeStamp5.compareTo(timeStamp7);
    long long11 = timeStamp5.getSeconds();
    boolean b12 = timeStamp3.equals((java.lang.Object)timeStamp5);
    TimeStamp timeStamp14 = TimeStamp.parseNtpString("00000000.00000000");
    int i15 = timeStamp5.compareTo(timeStamp14);
    long long16 = timeStamp5.getTime();
    int i17 = timeStamp1.compareTo(timeStamp5);
    TimeStamp timeStamp19 = TimeStamp.getNtpTime((long)'4');
    java.lang.String str20 = timeStamp19.toUTCString();
    boolean b21 = timeStamp1.equals((java.lang.Object)timeStamp19);
    long long22 = timeStamp19.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00000000.00000000"+ "'", str9.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Thu, Jan 01 1970 00:00:00.052 UTC"+ "'", str20.equals("Thu, Jan 01 1970 00:00:00.052 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 52L);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    boolean b7 = timeStamp1.equals((java.lang.Object)0);
    long long8 = timeStamp1.getFraction();
    long long9 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 2085978496000L);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570137383784678L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }


    TimeStamp timeStamp1 = new TimeStamp(2130303778L);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.lang.String str7 = timeStamp3.toString();
    java.util.Date date8 = timeStamp3.getDate();
    TimeStamp timeStamp9 = new TimeStamp(date8);
    long long10 = timeStamp9.getSeconds();
    long long11 = timeStamp9.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570141670162039L));
    java.lang.String str2 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:15.961"+ "'", str2.equals("Thu, Feb 07 2036 06:28:15.961"));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570131229096543L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }


    long long1 = TimeStamp.getTime((-1670570137469684024L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018575624L);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Thu, Jan 01 1970 00:00:00.000 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    boolean b7 = timeStamp1.equals((java.lang.Object)0);
    java.lang.String str8 = timeStamp1.toString();
    java.lang.String str9 = timeStamp1.toDateString();
    long long10 = timeStamp1.ntpValue();
    long long11 = timeStamp1.getFraction();
    java.util.Date date12 = null;
    TimeStamp timeStamp13 = new TimeStamp(date12);
    long long14 = timeStamp13.ntpValue();
    boolean b16 = timeStamp13.equals((java.lang.Object)(byte)10);
    int i17 = timeStamp1.compareTo(timeStamp13);
    java.lang.String str18 = timeStamp1.toString();
    java.util.Date date19 = timeStamp1.getDate();
    TimeStamp timeStamp20 = new TimeStamp(date19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "00000000.00000000"+ "'", str18.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date19);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)100);
    java.lang.String str2 = timeStamp1.toString();
    TimeStamp timeStamp4 = TimeStamp.parseNtpString("00000000.00000000");
    java.lang.String str5 = timeStamp4.toDateString();
    java.util.Date date6 = timeStamp4.getDate();
    java.lang.String str7 = timeStamp4.toDateString();
    int i8 = timeStamp1.compareTo(timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "83aa7e80.19999999"+ "'", str2.equals("83aa7e80.19999999"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str5.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str7.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }


    java.lang.String str1 = TimeStamp.toString(2130303778L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.7ef9db22"+ "'", str1.equals("00000000.7ef9db22"));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Thu, Jan 01 1970 00:00:00.000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }


    TimeStamp timeStamp1 = new TimeStamp((long)'4');

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date7 = null;
    TimeStamp timeStamp8 = new TimeStamp(date7);
    long long9 = timeStamp8.getTime();
    java.lang.String str10 = timeStamp8.toDateString();
    java.lang.String str11 = timeStamp8.toString();
    boolean b13 = timeStamp8.equals((java.lang.Object)100.0f);
    int i14 = timeStamp1.compareTo(timeStamp8);
    java.util.Date date15 = null;
    TimeStamp timeStamp16 = new TimeStamp(date15);
    long long17 = timeStamp16.getTime();
    java.lang.String str18 = timeStamp16.toDateString();
    java.lang.String str19 = timeStamp16.toString();
    java.lang.String str20 = timeStamp16.toString();
    boolean b22 = timeStamp16.equals((java.lang.Object)0);
    java.lang.String str23 = timeStamp16.toString();
    int i24 = timeStamp1.compareTo(timeStamp16);
    long long25 = timeStamp1.getSeconds();
    boolean b27 = timeStamp1.equals((java.lang.Object)2208988800L);
    java.lang.String str28 = timeStamp1.toDateString();
    long long29 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str10.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "00000000.00000000"+ "'", str11.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str18.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "00000000.00000000"+ "'", str19.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "00000000.00000000"+ "'", str20.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "00000000.00000000"+ "'", str23.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str28.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long29 == 2085978496000L);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570136614985532L));
    java.lang.String str2 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:15.468 UTC"+ "'", str2.equals("Thu, Feb 07 2036 06:28:15.468 UTC"));

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570139694477083L));
    java.util.Date date2 = timeStamp1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(short)0);
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    TimeStamp timeStamp5 = new TimeStamp("");
    java.lang.String str6 = timeStamp5.toString();
    java.lang.String str7 = timeStamp5.toString();
    int i8 = timeStamp3.compareTo(timeStamp5);
    long long9 = timeStamp3.getSeconds();
    boolean b10 = timeStamp1.equals((java.lang.Object)timeStamp3);
    TimeStamp timeStamp12 = TimeStamp.parseNtpString("00000000.00000000");
    int i13 = timeStamp3.compareTo(timeStamp12);
    long long14 = timeStamp3.getTime();
    long long15 = timeStamp3.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "00000000.00000000"+ "'", str6.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }


    java.lang.String str1 = TimeStamp.toString(2010044695L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.77ced917"+ "'", str1.equals("00000000.77ced917"));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    long long4 = timeStamp1.getFraction();
    TimeStamp timeStamp5 = TimeStamp.getCurrentTime();
    long long6 = timeStamp5.ntpValue();
    java.util.Date date7 = null;
    TimeStamp timeStamp8 = new TimeStamp(date7);
    long long9 = timeStamp8.ntpValue();
    java.lang.String str10 = timeStamp8.toString();
    boolean b11 = timeStamp5.equals((java.lang.Object)timeStamp8);
    long long12 = timeStamp5.getTime();
    boolean b13 = timeStamp1.equals((java.lang.Object)long12);
    boolean b15 = timeStamp1.equals((java.lang.Object)"Wed, Oct 11 2023 10:02:55.317 UTC");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1670570127913381790L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00000000.00000000"+ "'", str10.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 1697018577849L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(short)0);
    boolean b3 = timeStamp1.equals((java.lang.Object)false);
    TimeStamp timeStamp5 = TimeStamp.getNtpTime((long)(short)-1);
    long long6 = timeStamp5.getFraction();
    java.lang.String str7 = timeStamp5.toString();
    long long8 = timeStamp5.getFraction();
    java.util.Date date9 = timeStamp5.getDate();
    boolean b10 = timeStamp1.equals((java.lang.Object)date9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 4290672328L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "83aa7e7f.ffbe76c8"+ "'", str7.equals("83aa7e7f.ffbe76c8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 4290672328L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }


    TimeStamp timeStamp1 = new TimeStamp("e8d0f14e.c45a1cac");

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }


    TimeStamp timeStamp1 = new TimeStamp("00000000.00000000");
    TimeStamp timeStamp2 = TimeStamp.getCurrentTime();
    long long3 = timeStamp2.ntpValue();
    java.lang.String str4 = timeStamp2.toUTCString();
    boolean b5 = timeStamp1.equals((java.lang.Object)str4);
    long long6 = timeStamp1.getSeconds();
    java.lang.String str7 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1670570127866137150L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Wed, Oct 11 2023 10:02:57.860 UTC"+ "'", str4.equals("Wed, Oct 11 2023 10:02:57.860 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570138002259968L));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("e8d0f14e.beb851eb");
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.getTime();
    java.lang.String str5 = timeStamp3.toDateString();
    java.util.Date date6 = null;
    TimeStamp timeStamp7 = new TimeStamp(date6);
    TimeStamp timeStamp9 = new TimeStamp("");
    java.lang.String str10 = timeStamp9.toString();
    java.lang.String str11 = timeStamp9.toString();
    int i12 = timeStamp7.compareTo(timeStamp9);
    java.util.Date date13 = null;
    TimeStamp timeStamp14 = new TimeStamp(date13);
    long long15 = timeStamp14.getTime();
    java.lang.String str16 = timeStamp14.toDateString();
    java.lang.String str17 = timeStamp14.toString();
    boolean b19 = timeStamp14.equals((java.lang.Object)100.0f);
    int i20 = timeStamp7.compareTo(timeStamp14);
    java.util.Date date21 = null;
    TimeStamp timeStamp22 = new TimeStamp(date21);
    long long23 = timeStamp22.getTime();
    java.lang.String str24 = timeStamp22.toDateString();
    java.lang.String str25 = timeStamp22.toString();
    java.lang.String str26 = timeStamp22.toString();
    boolean b28 = timeStamp22.equals((java.lang.Object)0);
    java.lang.String str29 = timeStamp22.toString();
    int i30 = timeStamp7.compareTo(timeStamp22);
    int i31 = timeStamp3.compareTo(timeStamp7);
    TimeStamp timeStamp33 = new TimeStamp((long)'a');
    int i34 = timeStamp7.compareTo(timeStamp33);
    int i35 = timeStamp1.compareTo(timeStamp33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str5.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00000000.00000000"+ "'", str10.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "00000000.00000000"+ "'", str11.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str16.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "00000000.00000000"+ "'", str17.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str24.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "00000000.00000000"+ "'", str25.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "00000000.00000000"+ "'", str26.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "00000000.00000000"+ "'", str29.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == (-1));

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:57.360 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570129953491256L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(byte)100);
    long long2 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-8959209420049770087L));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000000");
    java.lang.String str2 = timeStamp1.toDateString();
    java.lang.String str3 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000000"+ "'", str3.equals("00000000.00000000"));

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }


    java.lang.String str1 = TimeStamp.toString((-1670570129953491256L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f151.5fbe76c8"+ "'", str1.equals("e8d0f151.5fbe76c8"));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }


    long long1 = TimeStamp.getTime(2919357440L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496680L);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1L));
    long long2 = timeStamp1.ntpValue();
    java.lang.String str3 = timeStamp1.toUTCString();
    java.lang.String str4 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-8959209420483561784L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Wed, Dec 31 1969 23:59:59.999 UTC"+ "'", str3.equals("Wed, Dec 31 1969 23:59:59.999 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Wed, Dec 31 1969 23:59:59.999 UTC"+ "'", str4.equals("Wed, Dec 31 1969 23:59:59.999 UTC"));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }


    TimeStamp timeStamp1 = new TimeStamp(1697018576651L);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }


    TimeStamp timeStamp1 = new TimeStamp(2658584756L);
    java.lang.String str2 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.9e76c8b4"+ "'", str2.equals("00000000.9e76c8b4"));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(short)10);
    TimeStamp timeStamp3 = new TimeStamp((long)(short)0);
    boolean b5 = timeStamp3.equals((java.lang.Object)false);
    boolean b6 = timeStamp1.equals((java.lang.Object)timeStamp3);
    long long7 = timeStamp3.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 2085978496000L);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.lang.String str2 = timeStamp1.toString();
    java.lang.String str3 = timeStamp1.toString();
    java.util.Date date4 = timeStamp1.getDate();
    TimeStamp timeStamp5 = new TimeStamp(date4);
    TimeStamp timeStamp7 = new TimeStamp("");
    java.lang.String str8 = timeStamp7.toString();
    java.lang.String str9 = timeStamp7.toString();
    int i10 = timeStamp5.compareTo(timeStamp7);
    java.lang.String str11 = timeStamp7.toDateString();
    TimeStamp timeStamp13 = TimeStamp.getNtpTime(4290672328L);
    boolean b14 = timeStamp7.equals((java.lang.Object)timeStamp13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000000"+ "'", str2.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000000"+ "'", str3.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00000000.00000000"+ "'", str9.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str11.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }


    long long1 = TimeStamp.getTime((-1670570141232075375L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018574748L);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    boolean b7 = timeStamp1.equals((java.lang.Object)0);
    java.lang.String str8 = timeStamp1.toString();
    java.lang.String str9 = timeStamp1.toDateString();
    long long10 = timeStamp1.ntpValue();
    long long11 = timeStamp1.getFraction();
    java.util.Date date12 = null;
    TimeStamp timeStamp13 = new TimeStamp(date12);
    long long14 = timeStamp13.ntpValue();
    boolean b16 = timeStamp13.equals((java.lang.Object)(byte)10);
    int i17 = timeStamp1.compareTo(timeStamp13);
    long long18 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 2085978496000L);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570134020825285L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    boolean b7 = timeStamp1.equals((java.lang.Object)0);
    java.lang.String str8 = timeStamp1.toString();
    java.lang.String str9 = timeStamp1.toDateString();
    long long10 = timeStamp1.ntpValue();
    long long11 = timeStamp1.getFraction();
    java.util.Date date12 = null;
    TimeStamp timeStamp13 = new TimeStamp(date12);
    long long14 = timeStamp13.ntpValue();
    boolean b16 = timeStamp13.equals((java.lang.Object)(byte)10);
    int i17 = timeStamp1.compareTo(timeStamp13);
    long long18 = timeStamp1.ntpValue();
    java.lang.String str19 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str19.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:57.860 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570139887750611L));
    java.lang.String str2 = timeStamp1.toUTCString();
    java.lang.String str3 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:15.389 UTC"+ "'", str2.equals("Thu, Feb 07 2036 06:28:15.389 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:15.389"+ "'", str3.equals("Thu, Feb 07 2036 06:28:15.389"));

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    long long4 = timeStamp1.ntpValue();
    TimeStamp timeStamp6 = TimeStamp.getNtpTime((long)(short)-1);
    java.lang.String str7 = timeStamp6.toUTCString();
    int i8 = timeStamp1.compareTo(timeStamp6);
    java.lang.String str9 = timeStamp6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Wed, Dec 31 1969 23:59:59.999 UTC"+ "'", str7.equals("Wed, Dec 31 1969 23:59:59.999 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "83aa7e7f.ffbe76c8"+ "'", str9.equals("83aa7e7f.ffbe76c8"));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    long long1 = timeStamp0.ntpValue();
    java.lang.String str2 = timeStamp0.toUTCString();
    long long3 = timeStamp0.getFraction();
    long long4 = timeStamp0.getTime();
    java.util.Date date5 = timeStamp0.getDate();
    java.util.Date date6 = timeStamp0.getDate();
    TimeStamp timeStamp7 = new TimeStamp(date6);
    TimeStamp timeStamp8 = new TimeStamp(date6);
    java.lang.String str9 = timeStamp8.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1670570127432345453L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Wed, Oct 11 2023 10:02:57.961 UTC"+ "'", str2.equals("Wed, Oct 11 2023 10:02:57.961 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 4127463571L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1697018577961L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Wed, Oct 11 2023 10:02:57.961"+ "'", str9.equals("Wed, Oct 11 2023 10:02:57.961"));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    boolean b7 = timeStamp1.equals((java.lang.Object)0);
    java.lang.String str8 = timeStamp1.toString();
    java.lang.String str9 = timeStamp1.toDateString();
    long long10 = timeStamp1.getTime();
    long long11 = timeStamp1.getSeconds();
    java.lang.String str12 = timeStamp1.toDateString();
    long long13 = timeStamp1.ntpValue();
    boolean b15 = timeStamp1.equals((java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str12.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570141030211912L));
    java.lang.String str2 = timeStamp1.toDateString();
    long long3 = timeStamp1.getFraction();
    TimeStamp timeStamp5 = TimeStamp.getNtpTime((long)'4');
    java.lang.String str6 = timeStamp5.toUTCString();
    java.lang.String str7 = timeStamp5.toDateString();
    boolean b8 = timeStamp1.equals((java.lang.Object)timeStamp5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Wed, Oct 11 2023 10:02:54.795"+ "'", str2.equals("Wed, Oct 11 2023 10:02:54.795"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 3414499000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Jan 01 1970 00:00:00.052 UTC"+ "'", str6.equals("Thu, Jan 01 1970 00:00:00.052 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Thu, Jan 01 1970 00:00:00.052"+ "'", str7.equals("Thu, Jan 01 1970 00:00:00.052"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }


    TimeStamp timeStamp1 = new TimeStamp((-8959209420479266816L));

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:57.110");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }


    long long1 = TimeStamp.getTime((-1670570127041503429L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018578052L);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)'a');
    long long2 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2208988800L);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    long long6 = timeStamp1.getSeconds();
    long long7 = timeStamp1.getSeconds();
    long long8 = timeStamp1.getFraction();
    long long9 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }


    TimeStamp timeStamp1 = new TimeStamp("83aa7e7f.ffbe76c8");
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((-1670570141670162039L));
    boolean b4 = timeStamp1.equals((java.lang.Object)(-1670570141670162039L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1L));
    long long2 = timeStamp1.ntpValue();
    long long3 = timeStamp1.getTime();
    java.lang.String str4 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-8959209420483561784L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "83aa7e7f.ffbe76c8"+ "'", str4.equals("83aa7e7f.ffbe76c8"));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.lang.String str7 = timeStamp3.toString();
    java.util.Date date8 = timeStamp3.getDate();
    boolean b10 = timeStamp3.equals((java.lang.Object)(byte)1);
    java.util.Date date11 = timeStamp3.getDate();
    java.lang.String str12 = timeStamp3.toDateString();
    java.lang.String str13 = timeStamp3.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str12.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str13.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    long long6 = timeStamp1.getSeconds();
    long long7 = timeStamp1.getFraction();
    java.util.Date date8 = timeStamp1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)10);
    long long2 = timeStamp1.getFraction();
    long long3 = timeStamp1.getFraction();
    long long4 = timeStamp1.ntpValue();
    TimeStamp timeStamp6 = new TimeStamp((long)(byte)-1);
    java.lang.String str7 = timeStamp6.toString();
    int i8 = timeStamp1.compareTo(timeStamp6);
    java.util.Date date9 = null;
    TimeStamp timeStamp10 = new TimeStamp(date9);
    long long11 = timeStamp10.getTime();
    java.lang.String str12 = timeStamp10.toDateString();
    java.util.Date date13 = null;
    TimeStamp timeStamp14 = new TimeStamp(date13);
    TimeStamp timeStamp16 = new TimeStamp("");
    java.lang.String str17 = timeStamp16.toString();
    java.lang.String str18 = timeStamp16.toString();
    int i19 = timeStamp14.compareTo(timeStamp16);
    java.util.Date date20 = null;
    TimeStamp timeStamp21 = new TimeStamp(date20);
    long long22 = timeStamp21.getTime();
    java.lang.String str23 = timeStamp21.toDateString();
    java.lang.String str24 = timeStamp21.toString();
    boolean b26 = timeStamp21.equals((java.lang.Object)100.0f);
    int i27 = timeStamp14.compareTo(timeStamp21);
    java.util.Date date28 = null;
    TimeStamp timeStamp29 = new TimeStamp(date28);
    long long30 = timeStamp29.getTime();
    java.lang.String str31 = timeStamp29.toDateString();
    java.lang.String str32 = timeStamp29.toString();
    java.lang.String str33 = timeStamp29.toString();
    boolean b35 = timeStamp29.equals((java.lang.Object)0);
    java.lang.String str36 = timeStamp29.toString();
    int i37 = timeStamp14.compareTo(timeStamp29);
    int i38 = timeStamp10.compareTo(timeStamp14);
    boolean b39 = timeStamp1.equals((java.lang.Object)i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 42949672L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 42949672L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-8959209420436317144L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ffffffff.ffffffff"+ "'", str7.equals("ffffffff.ffffffff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str12.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "00000000.00000000"+ "'", str17.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "00000000.00000000"+ "'", str18.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str23.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "00000000.00000000"+ "'", str24.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str31.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "00000000.00000000"+ "'", str32.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "00000000.00000000"+ "'", str33.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "00000000.00000000"+ "'", str36.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570139634347541L));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570141232075375L));
    java.util.Date date2 = timeStamp1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(byte)-1);
    java.lang.String str2 = timeStamp1.toString();
    java.lang.String str3 = timeStamp1.toDateString();
    java.util.Date date4 = null;
    TimeStamp timeStamp5 = new TimeStamp(date4);
    long long6 = timeStamp5.ntpValue();
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)10);
    long long9 = timeStamp8.getFraction();
    int i10 = timeStamp5.compareTo(timeStamp8);
    java.lang.String str11 = timeStamp5.toDateString();
    long long12 = timeStamp5.getTime();
    java.util.Date date13 = timeStamp5.getDate();
    boolean b14 = timeStamp1.equals((java.lang.Object)timeStamp5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ffffffff.ffffffff"+ "'", str2.equals("ffffffff.ffffffff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 42949672L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str11.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1L));
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.getTime();
    java.lang.String str5 = timeStamp3.toDateString();
    long long6 = timeStamp3.getTime();
    java.lang.String str7 = timeStamp3.toString();
    int i8 = timeStamp1.compareTo(timeStamp3);
    long long9 = timeStamp3.getSeconds();
    long long10 = timeStamp3.ntpValue();
    long long11 = timeStamp3.getSeconds();
    java.lang.String str12 = timeStamp3.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str5.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str12.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }


    TimeStamp timeStamp1 = new TimeStamp("e8d0f14e.bf7ced91");

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)0);
    java.util.Date date2 = timeStamp1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570141030211912L));
    java.lang.String str2 = timeStamp1.toDateString();
    long long3 = timeStamp1.getFraction();
    long long4 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Wed, Oct 11 2023 10:02:54.795"+ "'", str2.equals("Wed, Oct 11 2023 10:02:54.795"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 3414499000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1670570141030211912L));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }


    java.lang.String str1 = TimeStamp.toString((-1670570138788238984L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f14f.5126e978"+ "'", str1.equals("e8d0f14f.5126e978"));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }


    TimeStamp timeStamp1 = new TimeStamp(4054449127L);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }


    java.lang.String str1 = TimeStamp.toString(35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.00000023"+ "'", str1.equals("00000000.00000023"));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date7 = null;
    TimeStamp timeStamp8 = new TimeStamp(date7);
    long long9 = timeStamp8.getTime();
    java.lang.String str10 = timeStamp8.toDateString();
    java.lang.String str11 = timeStamp8.toString();
    boolean b13 = timeStamp8.equals((java.lang.Object)100.0f);
    int i14 = timeStamp1.compareTo(timeStamp8);
    java.util.Date date15 = null;
    TimeStamp timeStamp16 = new TimeStamp(date15);
    long long17 = timeStamp16.getTime();
    java.lang.String str18 = timeStamp16.toDateString();
    java.lang.String str19 = timeStamp16.toString();
    java.lang.String str20 = timeStamp16.toString();
    boolean b22 = timeStamp16.equals((java.lang.Object)0);
    java.lang.String str23 = timeStamp16.toString();
    int i24 = timeStamp1.compareTo(timeStamp16);
    long long25 = timeStamp1.getSeconds();
    boolean b27 = timeStamp1.equals((java.lang.Object)2208988800L);
    java.lang.String str28 = timeStamp1.toDateString();
    java.lang.String str29 = timeStamp1.toString();
    java.lang.String str30 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str10.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "00000000.00000000"+ "'", str11.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str18.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "00000000.00000000"+ "'", str19.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "00000000.00000000"+ "'", str20.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "00000000.00000000"+ "'", str23.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str28.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "00000000.00000000"+ "'", str29.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str30.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570141030211912L));
    java.lang.String str2 = timeStamp1.toDateString();
    long long3 = timeStamp1.getFraction();
    long long4 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Wed, Oct 11 2023 10:02:54.795"+ "'", str2.equals("Wed, Oct 11 2023 10:02:54.795"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 3414499000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 3906007374L);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1L));
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.getTime();
    java.lang.String str5 = timeStamp3.toDateString();
    long long6 = timeStamp3.getTime();
    java.lang.String str7 = timeStamp3.toString();
    int i8 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date9 = timeStamp3.getDate();
    java.lang.String str10 = timeStamp3.toString();
    long long11 = timeStamp3.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str5.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00000000.00000000"+ "'", str10.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }


    long long1 = TimeStamp.getTime((-1670570139565628064L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018575136L);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date7 = timeStamp3.getDate();
    TimeStamp timeStamp8 = new TimeStamp(date7);
    TimeStamp timeStamp9 = new TimeStamp(date7);
    TimeStamp timeStamp10 = new TimeStamp(date7);
    TimeStamp timeStamp11 = new TimeStamp(date7);
    java.lang.String str12 = timeStamp11.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str12.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    TimeStamp timeStamp4 = new TimeStamp(date2);
    long long5 = timeStamp4.getTime();
    TimeStamp timeStamp6 = TimeStamp.getCurrentTime();
    long long7 = timeStamp6.ntpValue();
    long long8 = timeStamp6.getFraction();
    int i9 = timeStamp4.compareTo(timeStamp6);
    long long10 = timeStamp6.ntpValue();
    java.lang.String str11 = timeStamp6.toDateString();
    long long12 = timeStamp6.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1670570126337128793L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 927712935L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == (-1670570126337128793L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Wed, Oct 11 2023 10:02:58.216"+ "'", str11.equals("Wed, Oct 11 2023 10:02:58.216"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 3906007378L);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:56.688 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    long long4 = timeStamp1.getTime();
    boolean b6 = timeStamp1.equals((java.lang.Object)"ffffffff.ffffffff");
    TimeStamp timeStamp7 = TimeStamp.getCurrentTime();
    long long8 = timeStamp7.ntpValue();
    java.util.Date date9 = null;
    TimeStamp timeStamp10 = new TimeStamp(date9);
    long long11 = timeStamp10.ntpValue();
    java.lang.String str12 = timeStamp10.toString();
    boolean b13 = timeStamp7.equals((java.lang.Object)timeStamp10);
    long long14 = timeStamp10.ntpValue();
    java.lang.String str15 = timeStamp10.toDateString();
    int i16 = timeStamp1.compareTo(timeStamp10);
    long long17 = timeStamp1.getTime();
    TimeStamp timeStamp19 = TimeStamp.getNtpTime((-1L));
    java.util.Date date20 = null;
    TimeStamp timeStamp21 = new TimeStamp(date20);
    long long22 = timeStamp21.getTime();
    java.lang.String str23 = timeStamp21.toDateString();
    long long24 = timeStamp21.getTime();
    java.lang.String str25 = timeStamp21.toString();
    int i26 = timeStamp19.compareTo(timeStamp21);
    java.util.Date date27 = timeStamp21.getDate();
    long long28 = timeStamp21.ntpValue();
    java.util.Date date29 = timeStamp21.getDate();
    TimeStamp timeStamp30 = new TimeStamp(date29);
    int i31 = timeStamp1.compareTo(timeStamp30);
    java.util.Date date32 = null;
    TimeStamp timeStamp33 = new TimeStamp(date32);
    TimeStamp timeStamp35 = new TimeStamp("");
    java.lang.String str36 = timeStamp35.toString();
    java.lang.String str37 = timeStamp35.toString();
    int i38 = timeStamp33.compareTo(timeStamp35);
    java.util.Date date39 = null;
    TimeStamp timeStamp40 = new TimeStamp(date39);
    long long41 = timeStamp40.getTime();
    java.lang.String str42 = timeStamp40.toDateString();
    java.lang.String str43 = timeStamp40.toString();
    boolean b45 = timeStamp40.equals((java.lang.Object)100.0f);
    int i46 = timeStamp33.compareTo(timeStamp40);
    TimeStamp timeStamp47 = TimeStamp.getCurrentTime();
    long long48 = timeStamp47.ntpValue();
    java.util.Date date49 = null;
    TimeStamp timeStamp50 = new TimeStamp(date49);
    long long51 = timeStamp50.ntpValue();
    java.lang.String str52 = timeStamp50.toString();
    boolean b53 = timeStamp47.equals((java.lang.Object)timeStamp50);
    int i54 = timeStamp40.compareTo(timeStamp50);
    java.lang.String str55 = timeStamp40.toDateString();
    java.lang.String str56 = timeStamp40.toString();
    long long57 = timeStamp40.ntpValue();
    int i58 = timeStamp1.compareTo(timeStamp40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1670570126264114349L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "00000000.00000000"+ "'", str12.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str15.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str23.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long24 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "00000000.00000000"+ "'", str25.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long28 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "00000000.00000000"+ "'", str36.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "00000000.00000000"+ "'", str37.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long41 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str42.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "00000000.00000000"+ "'", str43.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long48 == (-1670570126255524414L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long51 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "00000000.00000000"+ "'", str52.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str55.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "00000000.00000000"+ "'", str56.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long57 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    boolean b7 = timeStamp1.equals((java.lang.Object)0);
    java.lang.String str8 = timeStamp1.toString();
    java.lang.String str9 = timeStamp1.toDateString();
    long long10 = timeStamp1.ntpValue();
    long long11 = timeStamp1.getFraction();
    java.util.Date date12 = null;
    TimeStamp timeStamp13 = new TimeStamp(date12);
    long long14 = timeStamp13.ntpValue();
    boolean b16 = timeStamp13.equals((java.lang.Object)(byte)10);
    int i17 = timeStamp1.compareTo(timeStamp13);
    java.lang.String str18 = timeStamp1.toString();
    java.lang.String str19 = timeStamp1.toUTCString();
    java.lang.String str20 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "00000000.00000000"+ "'", str18.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str19.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "00000000.00000000"+ "'", str20.equals("00000000.00000000"));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:57.360");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:57.176");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    boolean b7 = timeStamp1.equals((java.lang.Object)0);
    java.lang.String str8 = timeStamp1.toString();
    java.lang.String str9 = timeStamp1.toDateString();
    long long10 = timeStamp1.getTime();
    long long11 = timeStamp1.getSeconds();
    java.lang.String str12 = timeStamp1.toDateString();
    TimeStamp timeStamp14 = TimeStamp.parseNtpString("");
    java.util.Date date15 = timeStamp14.getDate();
    TimeStamp timeStamp16 = new TimeStamp(date15);
    TimeStamp timeStamp17 = new TimeStamp(date15);
    java.util.Date date18 = null;
    TimeStamp timeStamp19 = new TimeStamp(date18);
    long long20 = timeStamp19.getTime();
    java.lang.String str21 = timeStamp19.toDateString();
    long long22 = timeStamp19.getTime();
    java.lang.String str23 = timeStamp19.toString();
    boolean b25 = timeStamp19.equals((java.lang.Object)(short)10);
    int i26 = timeStamp17.compareTo(timeStamp19);
    int i27 = timeStamp1.compareTo(timeStamp17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str12.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str21.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "00000000.00000000"+ "'", str23.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1L));
    long long2 = timeStamp1.ntpValue();
    long long3 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-8959209420483561784L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-8959209420483561784L));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570138796828918L));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }


    long long1 = TimeStamp.getTime((-1670570140867003155L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018574833L);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    long long1 = timeStamp0.ntpValue();
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.ntpValue();
    java.lang.String str5 = timeStamp3.toString();
    boolean b6 = timeStamp0.equals((java.lang.Object)timeStamp3);
    long long7 = timeStamp3.ntpValue();
    java.util.Date date8 = timeStamp3.getDate();
    TimeStamp timeStamp9 = new TimeStamp(date8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1670570125478135333L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570138101044216L));
    TimeStamp timeStamp3 = TimeStamp.getNtpTime(2085978496000L);
    java.util.Date date4 = timeStamp3.getDate();
    TimeStamp timeStamp5 = new TimeStamp(date4);
    TimeStamp timeStamp6 = new TimeStamp(date4);
    int i7 = timeStamp1.compareTo(timeStamp6);
    long long8 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-927712935L));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    TimeStamp timeStamp5 = new TimeStamp("");
    java.lang.String str6 = timeStamp5.toString();
    java.lang.String str7 = timeStamp5.toString();
    int i8 = timeStamp3.compareTo(timeStamp5);
    long long9 = timeStamp3.getSeconds();
    boolean b10 = timeStamp1.equals((java.lang.Object)timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "00000000.00000000"+ "'", str6.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }


    long long1 = TimeStamp.getTime(3088081485L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496719L);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(short)0);
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    TimeStamp timeStamp5 = new TimeStamp("");
    java.lang.String str6 = timeStamp5.toString();
    java.lang.String str7 = timeStamp5.toString();
    int i8 = timeStamp3.compareTo(timeStamp5);
    long long9 = timeStamp3.getSeconds();
    boolean b10 = timeStamp1.equals((java.lang.Object)timeStamp3);
    TimeStamp timeStamp12 = TimeStamp.parseNtpString("00000000.00000000");
    int i13 = timeStamp3.compareTo(timeStamp12);
    long long14 = timeStamp3.getTime();
    java.util.Date date15 = null;
    TimeStamp timeStamp16 = new TimeStamp(date15);
    long long17 = timeStamp16.getTime();
    java.lang.String str18 = timeStamp16.toDateString();
    long long19 = timeStamp16.getTime();
    java.lang.String str20 = timeStamp16.toString();
    boolean b21 = timeStamp3.equals((java.lang.Object)timeStamp16);
    long long22 = timeStamp3.getFraction();
    TimeStamp timeStamp24 = TimeStamp.getNtpTime(2085978496000L);
    TimeStamp timeStamp26 = TimeStamp.getNtpTime((-1670570139479728718L));
    int i27 = timeStamp24.compareTo(timeStamp26);
    boolean b28 = timeStamp3.equals((java.lang.Object)i27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "00000000.00000000"+ "'", str6.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str18.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "00000000.00000000"+ "'", str20.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }


    TimeStamp timeStamp1 = new TimeStamp(1697018577849L);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }


    java.lang.String str1 = TimeStamp.toString((-1670570132899838821L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f150.b020c49b"+ "'", str1.equals("e8d0f150.b020c49b"));

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(1697018574902L);
    long long2 = timeStamp1.getFraction();
    java.lang.String str3 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 3874060500L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "e8d0f14e.e6e978d4"+ "'", str3.equals("e8d0f14e.e6e978d4"));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.0000000a");
    boolean b3 = timeStamp1.equals((java.lang.Object)(-1670570141244960277L));
    long long4 = timeStamp1.getFraction();
    long long5 = timeStamp1.getTime();
    java.lang.String str6 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str6.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:55.061");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570138835483624L));
    java.lang.String str2 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "e8d0f14f.4e560418"+ "'", str2.equals("e8d0f14f.4e560418"));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(byte)-1);
    java.lang.String str2 = timeStamp1.toString();
    java.lang.String str3 = timeStamp1.toString();
    java.lang.String str4 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ffffffff.ffffffff"+ "'", str2.equals("ffffffff.ffffffff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ffffffff.ffffffff"+ "'", str3.equals("ffffffff.ffffffff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str4.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.lang.String str7 = timeStamp3.toUTCString();
    java.lang.String str8 = timeStamp3.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str7.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str8.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    java.lang.String str3 = timeStamp1.toString();
    long long4 = timeStamp1.ntpValue();
    TimeStamp timeStamp5 = TimeStamp.getCurrentTime();
    long long6 = timeStamp5.ntpValue();
    java.util.Date date7 = null;
    TimeStamp timeStamp8 = new TimeStamp(date7);
    long long9 = timeStamp8.ntpValue();
    java.lang.String str10 = timeStamp8.toString();
    boolean b11 = timeStamp5.equals((java.lang.Object)timeStamp8);
    long long12 = timeStamp8.ntpValue();
    int i13 = timeStamp1.compareTo(timeStamp8);
    java.util.Date date14 = timeStamp1.getDate();
    java.lang.String str15 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000000"+ "'", str3.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1670570124812415402L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00000000.00000000"+ "'", str10.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str15.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(10L);
    long long2 = timeStamp1.ntpValue();
    long long3 = timeStamp1.getFraction();
    long long4 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-8959209420436317144L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 42949672L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 10L);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }


    long long1 = TimeStamp.getTime((-1670570131229096543L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018577077L);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570140583535313L));
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1L));
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.getTime();
    java.lang.String str5 = timeStamp3.toDateString();
    long long6 = timeStamp3.getTime();
    java.lang.String str7 = timeStamp3.toString();
    int i8 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date9 = timeStamp1.getDate();
    java.lang.String str10 = timeStamp1.toDateString();
    java.lang.String str11 = timeStamp1.toDateString();
    java.lang.String str12 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str5.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Wed, Dec 31 1969 23:59:59.999"+ "'", str10.equals("Wed, Dec 31 1969 23:59:59.999"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Wed, Dec 31 1969 23:59:59.999"+ "'", str11.equals("Wed, Dec 31 1969 23:59:59.999"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Wed, Dec 31 1969 23:59:59.999"+ "'", str12.equals("Wed, Dec 31 1969 23:59:59.999"));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("e8d0f14e.f2f1a9fb");
    long long2 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 3906007374L);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }


    TimeStamp timeStamp1 = new TimeStamp(3672197038L);
    long long2 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-8959209420049770087L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1L));
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.getTime();
    java.lang.String str5 = timeStamp3.toDateString();
    long long6 = timeStamp3.getTime();
    java.lang.String str7 = timeStamp3.toString();
    int i8 = timeStamp1.compareTo(timeStamp3);
    TimeStamp timeStamp10 = new TimeStamp("");
    long long11 = timeStamp10.getFraction();
    TimeStamp timeStamp12 = TimeStamp.getCurrentTime();
    long long13 = timeStamp12.ntpValue();
    java.util.Date date14 = null;
    TimeStamp timeStamp15 = new TimeStamp(date14);
    long long16 = timeStamp15.ntpValue();
    java.lang.String str17 = timeStamp15.toString();
    boolean b18 = timeStamp12.equals((java.lang.Object)timeStamp15);
    java.lang.String str19 = timeStamp12.toString();
    java.lang.String str20 = timeStamp12.toString();
    int i21 = timeStamp10.compareTo(timeStamp12);
    boolean b22 = timeStamp1.equals((java.lang.Object)i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str5.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == (-1670570124610551940L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "00000000.00000000"+ "'", str17.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "e8d0f152.9e353f7c"+ "'", str19.equals("e8d0f152.9e353f7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "e8d0f152.9e353f7c"+ "'", str20.equals("e8d0f152.9e353f7c"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }


    TimeStamp timeStamp1 = new TimeStamp("00000000.7ef9db22");

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.lang.String str7 = timeStamp3.toString();
    java.util.Date date8 = timeStamp3.getDate();
    TimeStamp timeStamp9 = new TimeStamp(date8);
    TimeStamp timeStamp10 = new TimeStamp(date8);
    java.lang.String str11 = timeStamp10.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str11.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }


    java.lang.String str1 = TimeStamp.toString((-8959209420479266816L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "83aa7e80.00000000"+ "'", str1.equals("83aa7e80.00000000"));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    java.lang.String str3 = timeStamp1.toString();
    java.lang.String str4 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000000"+ "'", str3.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str4.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:55.106 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.lang.String str2 = timeStamp1.toString();
    java.lang.String str3 = timeStamp1.toString();
    TimeStamp timeStamp5 = new TimeStamp("");
    long long6 = timeStamp5.getFraction();
    int i7 = timeStamp1.compareTo(timeStamp5);
    TimeStamp timeStamp9 = new TimeStamp("000001e5.ae01dc00");
    int i10 = timeStamp5.compareTo(timeStamp9);
    java.lang.String str11 = timeStamp5.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000000"+ "'", str2.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000000"+ "'", str3.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str11.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570141833370797L));
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978495203L);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date7 = timeStamp3.getDate();
    TimeStamp timeStamp8 = new TimeStamp(date7);
    TimeStamp timeStamp9 = new TimeStamp(date7);
    TimeStamp timeStamp10 = new TimeStamp(date7);
    long long11 = timeStamp10.getFraction();
    java.lang.String str12 = timeStamp10.toDateString();
    java.lang.String str13 = timeStamp10.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str12.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str13.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570137319360168L));
    java.lang.String str2 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:15.832"+ "'", str2.equals("Thu, Feb 07 2036 06:28:15.832"));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.lang.String str2 = timeStamp1.toString();
    java.lang.String str3 = timeStamp1.toString();
    TimeStamp timeStamp5 = new TimeStamp("");
    long long6 = timeStamp5.getFraction();
    int i7 = timeStamp1.compareTo(timeStamp5);
    java.util.Date date8 = timeStamp1.getDate();
    TimeStamp timeStamp9 = new TimeStamp(date8);
    TimeStamp timeStamp10 = new TimeStamp(date8);
    TimeStamp timeStamp11 = new TimeStamp(date8);
    java.lang.String str12 = timeStamp11.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000000"+ "'", str2.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000000"+ "'", str3.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str12.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }


    TimeStamp timeStamp1 = new TimeStamp("00000000.00000061");
    TimeStamp timeStamp3 = new TimeStamp((-1670570141030211912L));
    TimeStamp timeStamp5 = new TimeStamp((long)(short)0);
    java.util.Date date6 = null;
    TimeStamp timeStamp7 = new TimeStamp(date6);
    TimeStamp timeStamp9 = new TimeStamp("");
    java.lang.String str10 = timeStamp9.toString();
    java.lang.String str11 = timeStamp9.toString();
    int i12 = timeStamp7.compareTo(timeStamp9);
    long long13 = timeStamp7.getSeconds();
    boolean b14 = timeStamp5.equals((java.lang.Object)timeStamp7);
    TimeStamp timeStamp16 = TimeStamp.parseNtpString("00000000.00000000");
    int i17 = timeStamp7.compareTo(timeStamp16);
    long long18 = timeStamp7.getTime();
    java.util.Date date19 = null;
    TimeStamp timeStamp20 = new TimeStamp(date19);
    long long21 = timeStamp20.getTime();
    java.lang.String str22 = timeStamp20.toDateString();
    long long23 = timeStamp20.getTime();
    java.lang.String str24 = timeStamp20.toString();
    boolean b25 = timeStamp7.equals((java.lang.Object)timeStamp20);
    int i26 = timeStamp3.compareTo(timeStamp7);
    boolean b27 = timeStamp1.equals((java.lang.Object)timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00000000.00000000"+ "'", str10.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "00000000.00000000"+ "'", str11.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str22.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "00000000.00000000"+ "'", str24.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    boolean b7 = timeStamp1.equals((java.lang.Object)0);
    java.lang.String str8 = timeStamp1.toString();
    java.lang.String str9 = timeStamp1.toDateString();
    long long10 = timeStamp1.ntpValue();
    long long11 = timeStamp1.getFraction();
    java.lang.String str12 = timeStamp1.toDateString();
    java.util.Date date13 = null;
    TimeStamp timeStamp14 = new TimeStamp(date13);
    long long15 = timeStamp14.getTime();
    java.lang.String str16 = timeStamp14.toDateString();
    long long17 = timeStamp14.getFraction();
    java.lang.String str18 = timeStamp14.toUTCString();
    java.lang.String str19 = timeStamp14.toUTCString();
    boolean b20 = timeStamp1.equals((java.lang.Object)str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str12.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str16.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str18.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str19.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570141296499885L));
    long long2 = timeStamp1.getFraction();
    java.lang.String str3 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 3148211027L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Wed, Oct 11 2023 10:02:54.733 UTC"+ "'", str3.equals("Wed, Oct 11 2023 10:02:54.733 UTC"));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570126620596634L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)'4');
    java.lang.String str2 = timeStamp1.toUTCString();
    java.lang.String str3 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Jan 01 1970 00:00:00.052 UTC"+ "'", str2.equals("Thu, Jan 01 1970 00:00:00.052 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Jan 01 1970 00:00:00.052 UTC"+ "'", str3.equals("Thu, Jan 01 1970 00:00:00.052 UTC"));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }


    java.lang.String str1 = TimeStamp.toString(1697018574779L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0000018b.1e3077bb"+ "'", str1.equals("0000018b.1e3077bb"));

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570142215622886L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000000");
    java.lang.String str2 = timeStamp1.toDateString();
    java.util.Date date3 = timeStamp1.getDate();
    java.lang.String str4 = timeStamp1.toDateString();
    java.util.Date date5 = timeStamp1.getDate();
    long long6 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str4.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 2085978496000L);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(841813590L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }


    java.lang.String str1 = TimeStamp.toString(3906007374L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.e8d0f14e"+ "'", str1.equals("00000000.e8d0f14e"));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1L));
    long long2 = timeStamp1.ntpValue();
    TimeStamp timeStamp4 = new TimeStamp("");
    java.lang.String str5 = timeStamp4.toString();
    java.lang.String str6 = timeStamp4.toString();
    TimeStamp timeStamp8 = new TimeStamp("");
    long long9 = timeStamp8.getFraction();
    int i10 = timeStamp4.compareTo(timeStamp8);
    java.util.Date date11 = timeStamp4.getDate();
    TimeStamp timeStamp12 = new TimeStamp(date11);
    TimeStamp timeStamp13 = new TimeStamp(date11);
    int i14 = timeStamp1.compareTo(timeStamp13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-8959209420483561784L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "00000000.00000000"+ "'", str6.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570125435185660L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-8959209420483561784L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    long long1 = timeStamp0.ntpValue();
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.ntpValue();
    java.lang.String str5 = timeStamp3.toString();
    boolean b6 = timeStamp0.equals((java.lang.Object)timeStamp3);
    TimeStamp timeStamp8 = TimeStamp.getNtpTime((long)(short)-1);
    long long9 = timeStamp8.getFraction();
    java.lang.String str10 = timeStamp8.toString();
    int i11 = timeStamp3.compareTo(timeStamp8);
    TimeStamp timeStamp13 = new TimeStamp(0L);
    long long14 = timeStamp13.getTime();
    boolean b15 = timeStamp8.equals((java.lang.Object)timeStamp13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1670570123936242074L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 4290672328L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "83aa7e7f.ffbe76c8"+ "'", str10.equals("83aa7e7f.ffbe76c8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }


    long long1 = TimeStamp.getTime((-1670570129953491256L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018577374L);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }


    long long1 = TimeStamp.getTime((-1670570138101044216L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018575477L);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(2085978496855L);
    long long2 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570131211916674L));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:58.216");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date7 = timeStamp3.getDate();
    TimeStamp timeStamp8 = new TimeStamp(date7);
    TimeStamp timeStamp9 = new TimeStamp(date7);
    long long10 = timeStamp9.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570133664343000L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570141030211912L));
    java.lang.String str2 = timeStamp1.toDateString();
    long long3 = timeStamp1.getSeconds();
    java.lang.String str4 = timeStamp1.toUTCString();
    java.util.Date date5 = null;
    TimeStamp timeStamp6 = new TimeStamp(date5);
    long long7 = timeStamp6.ntpValue();
    TimeStamp timeStamp9 = TimeStamp.getNtpTime((long)(short)10);
    long long10 = timeStamp9.getFraction();
    int i11 = timeStamp6.compareTo(timeStamp9);
    boolean b13 = timeStamp9.equals((java.lang.Object)(-1670570138569195652L));
    boolean b14 = timeStamp1.equals((java.lang.Object)b13);
    TimeStamp timeStamp16 = TimeStamp.parseNtpString("e8d0f14f.9e76c8b4");
    java.util.Date date17 = null;
    TimeStamp timeStamp18 = new TimeStamp(date17);
    TimeStamp timeStamp20 = new TimeStamp("");
    java.lang.String str21 = timeStamp20.toString();
    java.lang.String str22 = timeStamp20.toString();
    int i23 = timeStamp18.compareTo(timeStamp20);
    java.util.Date date24 = null;
    TimeStamp timeStamp25 = new TimeStamp(date24);
    long long26 = timeStamp25.getTime();
    java.lang.String str27 = timeStamp25.toDateString();
    java.lang.String str28 = timeStamp25.toString();
    boolean b30 = timeStamp25.equals((java.lang.Object)100.0f);
    int i31 = timeStamp18.compareTo(timeStamp25);
    TimeStamp timeStamp32 = TimeStamp.getCurrentTime();
    long long33 = timeStamp32.ntpValue();
    java.util.Date date34 = null;
    TimeStamp timeStamp35 = new TimeStamp(date34);
    long long36 = timeStamp35.ntpValue();
    java.lang.String str37 = timeStamp35.toString();
    boolean b38 = timeStamp32.equals((java.lang.Object)timeStamp35);
    int i39 = timeStamp25.compareTo(timeStamp35);
    int i40 = timeStamp16.compareTo(timeStamp25);
    int i41 = timeStamp1.compareTo(timeStamp16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Wed, Oct 11 2023 10:02:54.795"+ "'", str2.equals("Wed, Oct 11 2023 10:02:54.795"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 3906007374L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Wed, Oct 11 2023 10:02:54.795 UTC"+ "'", str4.equals("Wed, Oct 11 2023 10:02:54.795 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 42949672L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "00000000.00000000"+ "'", str21.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "00000000.00000000"+ "'", str22.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long26 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str27.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "00000000.00000000"+ "'", str28.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == (-1670570123631299396L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "00000000.00000000"+ "'", str37.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == (-1));

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1L));
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.getTime();
    java.lang.String str5 = timeStamp3.toDateString();
    long long6 = timeStamp3.getTime();
    java.lang.String str7 = timeStamp3.toString();
    int i8 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date9 = timeStamp3.getDate();
    long long10 = timeStamp3.ntpValue();
    java.util.Date date11 = timeStamp3.getDate();
    long long12 = timeStamp3.getSeconds();
    TimeStamp timeStamp14 = new TimeStamp((-1670570141296499885L));
    long long15 = timeStamp14.getFraction();
    TimeStamp timeStamp17 = TimeStamp.parseNtpString("");
    java.util.Date date18 = timeStamp17.getDate();
    TimeStamp timeStamp19 = new TimeStamp(date18);
    TimeStamp timeStamp20 = new TimeStamp(date18);
    TimeStamp timeStamp21 = new TimeStamp(date18);
    TimeStamp timeStamp23 = TimeStamp.getNtpTime(0L);
    boolean b24 = timeStamp21.equals((java.lang.Object)0L);
    java.lang.String str25 = timeStamp21.toDateString();
    int i26 = timeStamp14.compareTo(timeStamp21);
    java.lang.String str27 = timeStamp14.toString();
    java.util.Date date28 = timeStamp14.getDate();
    int i29 = timeStamp3.compareTo(timeStamp14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str5.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 3148211027L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str25.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "e8d0f14e.bba5e353"+ "'", str27.equals("e8d0f14e.bba5e353"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }


    TimeStamp timeStamp1 = new TimeStamp("00000000.0000000a");
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    TimeStamp timeStamp5 = new TimeStamp("");
    java.lang.String str6 = timeStamp5.toString();
    java.lang.String str7 = timeStamp5.toString();
    int i8 = timeStamp3.compareTo(timeStamp5);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((long)(short)100);
    java.lang.String str11 = timeStamp10.toUTCString();
    boolean b12 = timeStamp3.equals((java.lang.Object)timeStamp10);
    int i13 = timeStamp1.compareTo(timeStamp3);
    java.lang.String str14 = timeStamp3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "00000000.00000000"+ "'", str6.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Thu, Jan 01 1970 00:00:00.100 UTC"+ "'", str11.equals("Thu, Jan 01 1970 00:00:00.100 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "00000000.00000000"+ "'", str14.equals("00000000.00000000"));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)10);
    java.lang.String str2 = timeStamp1.toString();
    TimeStamp timeStamp4 = TimeStamp.getNtpTime((long)(short)-1);
    long long5 = timeStamp4.getFraction();
    java.util.Date date6 = timeStamp4.getDate();
    boolean b7 = timeStamp1.equals((java.lang.Object)date6);
    java.lang.String str8 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "83aa7e80.028f5c28"+ "'", str2.equals("83aa7e80.028f5c28"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 4290672328L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Thu, Jan 01 1970 00:00:00.010 UTC"+ "'", str8.equals("Thu, Jan 01 1970 00:00:00.010 UTC"));

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:55.614 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }


    long long1 = TimeStamp.getTime((-1670570132255593726L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018576838L);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.lang.String str2 = timeStamp1.toString();
    java.lang.String str3 = timeStamp1.toString();
    TimeStamp timeStamp5 = new TimeStamp("");
    long long6 = timeStamp5.getFraction();
    int i7 = timeStamp1.compareTo(timeStamp5);
    long long8 = timeStamp5.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000000"+ "'", str2.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000000"+ "'", str3.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 2085978496000L);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570136168308933L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }


    TimeStamp timeStamp1 = new TimeStamp(3414499000L);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }


    long long1 = TimeStamp.getTime(841813590L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496196L);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570141030211912L));
    java.lang.String str2 = timeStamp1.toDateString();
    long long3 = timeStamp1.getFraction();
    java.lang.String str4 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Wed, Oct 11 2023 10:02:54.795"+ "'", str2.equals("Wed, Oct 11 2023 10:02:54.795"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 3414499000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Wed, Oct 11 2023 10:02:54.795 UTC"+ "'", str4.equals("Wed, Oct 11 2023 10:02:54.795 UTC"));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }


    TimeStamp timeStamp1 = new TimeStamp("0000018b.1e307934");

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)0);
    java.lang.String str2 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "83aa7e80.00000000"+ "'", str2.equals("83aa7e80.00000000"));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.lang.String str7 = timeStamp3.toString();
    java.lang.String str8 = timeStamp3.toDateString();
    long long9 = timeStamp3.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str8.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }


    TimeStamp timeStamp1 = new TimeStamp((long)'#');
    long long2 = timeStamp1.getFraction();
    java.lang.String str3 = timeStamp1.toString();
    TimeStamp timeStamp4 = TimeStamp.getCurrentTime();
    long long5 = timeStamp4.ntpValue();
    java.util.Date date6 = null;
    TimeStamp timeStamp7 = new TimeStamp(date6);
    long long8 = timeStamp7.ntpValue();
    java.lang.String str9 = timeStamp7.toString();
    boolean b10 = timeStamp4.equals((java.lang.Object)timeStamp7);
    long long11 = timeStamp4.getFraction();
    boolean b12 = timeStamp1.equals((java.lang.Object)timeStamp4);
    java.lang.String str13 = timeStamp1.toDateString();
    long long14 = timeStamp1.ntpValue();
    long long15 = timeStamp1.getTime();
    java.util.Date date16 = timeStamp1.getDate();
    java.lang.String str17 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000023"+ "'", str3.equals("00000000.00000023"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1670570122613392147L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00000000.00000000"+ "'", str9.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 356482285L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str13.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str17.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(byte)-1);
    java.lang.String str2 = timeStamp1.toString();
    java.lang.String str3 = timeStamp1.toString();
    TimeStamp timeStamp5 = TimeStamp.parseNtpString("");
    java.util.Date date6 = timeStamp5.getDate();
    TimeStamp timeStamp7 = new TimeStamp(date6);
    boolean b8 = timeStamp1.equals((java.lang.Object)date6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ffffffff.ffffffff"+ "'", str2.equals("ffffffff.ffffffff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ffffffff.ffffffff"+ "'", str3.equals("ffffffff.ffffffff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    long long1 = timeStamp0.ntpValue();
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.ntpValue();
    java.lang.String str5 = timeStamp3.toString();
    boolean b6 = timeStamp0.equals((java.lang.Object)timeStamp3);
    long long7 = timeStamp0.getFraction();
    long long8 = timeStamp0.getFraction();
    java.lang.String str9 = timeStamp0.toDateString();
    TimeStamp timeStamp11 = new TimeStamp((long)'#');
    long long12 = timeStamp11.getFraction();
    java.lang.String str13 = timeStamp11.toString();
    TimeStamp timeStamp14 = TimeStamp.getCurrentTime();
    long long15 = timeStamp14.ntpValue();
    java.util.Date date16 = null;
    TimeStamp timeStamp17 = new TimeStamp(date16);
    long long18 = timeStamp17.ntpValue();
    java.lang.String str19 = timeStamp17.toString();
    boolean b20 = timeStamp14.equals((java.lang.Object)timeStamp17);
    long long21 = timeStamp14.getFraction();
    boolean b22 = timeStamp11.equals((java.lang.Object)timeStamp14);
    TimeStamp timeStamp24 = TimeStamp.parseNtpString("");
    java.util.Date date25 = timeStamp24.getDate();
    TimeStamp timeStamp26 = new TimeStamp(date25);
    TimeStamp timeStamp27 = new TimeStamp(date25);
    TimeStamp timeStamp28 = new TimeStamp(date25);
    boolean b29 = timeStamp11.equals((java.lang.Object)date25);
    TimeStamp timeStamp30 = new TimeStamp(date25);
    int i31 = timeStamp0.compareTo(timeStamp30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1670570122557557572L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 412316860L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 412316860L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Wed, Oct 11 2023 10:02:59.096"+ "'", str9.equals("Wed, Oct 11 2023 10:02:59.096"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "00000000.00000023"+ "'", str13.equals("00000000.00000023"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == (-1670570122553262605L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "00000000.00000000"+ "'", str19.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 416611827L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == (-1));

  }

}
