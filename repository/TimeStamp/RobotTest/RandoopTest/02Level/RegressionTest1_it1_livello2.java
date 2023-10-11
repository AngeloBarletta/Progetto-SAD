
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }


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
    long long12 = timeStamp3.getFraction();
    
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

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1L));
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.getTime();
    java.lang.String str5 = timeStamp3.toDateString();
    long long6 = timeStamp3.getTime();
    java.lang.String str7 = timeStamp3.toString();
    int i8 = timeStamp1.compareTo(timeStamp3);
    java.lang.String str9 = timeStamp1.toDateString();
    java.util.Date date10 = timeStamp1.getDate();
    TimeStamp timeStamp11 = new TimeStamp(date10);
    
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Wed, Dec 31 1969 23:59:59.999"+ "'", str9.equals("Wed, Dec 31 1969 23:59:59.999"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date10);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }


    long long1 = TimeStamp.getTime((-1670570134020825285L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018576427L);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.lang.String str2 = timeStamp1.toString();
    java.lang.String str3 = timeStamp1.toString();
    java.util.Date date4 = timeStamp1.getDate();
    boolean b6 = timeStamp1.equals((java.lang.Object)"00000000.7ef9db22");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000000"+ "'", str2.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000000"+ "'", str3.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }


    TimeStamp timeStamp1 = new TimeStamp((long)'#');
    long long2 = timeStamp1.getFraction();
    java.lang.String str3 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.lang.String str2 = timeStamp1.toString();
    java.util.Date date3 = null;
    TimeStamp timeStamp4 = new TimeStamp(date3);
    long long5 = timeStamp4.getTime();
    int i6 = timeStamp1.compareTo(timeStamp4);
    java.lang.String str7 = timeStamp4.toString();
    long long8 = timeStamp4.ntpValue();
    java.lang.String str9 = timeStamp4.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000000"+ "'", str2.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("e8d0f14f.22d0e560");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }


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
    long long17 = timeStamp10.getSeconds();
    java.util.Date date18 = timeStamp10.getDate();
    
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
    org.junit.Assert.assertTrue(long8 == (-1670570122042161497L));
    
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
    org.junit.Assert.assertTrue(long17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date18);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }


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
    TimeStamp timeStamp12 = new TimeStamp(date8);
    
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

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("83aa7e80.19999999");
    java.lang.String str2 = timeStamp1.toDateString();
    long long3 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Jan 01 1970 00:00:00.100"+ "'", str2.equals("Thu, Jan 01 1970 00:00:00.100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-8959209420049770087L));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(byte)100);
    long long2 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 429496729L);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:55.167");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    long long1 = timeStamp0.ntpValue();
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.ntpValue();
    java.lang.String str5 = timeStamp3.toString();
    boolean b6 = timeStamp0.equals((java.lang.Object)timeStamp3);
    java.lang.String str7 = timeStamp0.toDateString();
    java.lang.String str8 = timeStamp0.toDateString();
    java.util.Date date9 = null;
    TimeStamp timeStamp10 = new TimeStamp(date9);
    TimeStamp timeStamp12 = new TimeStamp("");
    java.lang.String str13 = timeStamp12.toString();
    java.lang.String str14 = timeStamp12.toString();
    int i15 = timeStamp10.compareTo(timeStamp12);
    java.util.Date date16 = null;
    TimeStamp timeStamp17 = new TimeStamp(date16);
    long long18 = timeStamp17.getTime();
    java.lang.String str19 = timeStamp17.toDateString();
    java.lang.String str20 = timeStamp17.toString();
    boolean b22 = timeStamp17.equals((java.lang.Object)100.0f);
    int i23 = timeStamp10.compareTo(timeStamp17);
    java.util.Date date24 = null;
    TimeStamp timeStamp25 = new TimeStamp(date24);
    long long26 = timeStamp25.getTime();
    java.lang.String str27 = timeStamp25.toDateString();
    java.lang.String str28 = timeStamp25.toString();
    java.lang.String str29 = timeStamp25.toString();
    boolean b31 = timeStamp25.equals((java.lang.Object)0);
    java.lang.String str32 = timeStamp25.toString();
    int i33 = timeStamp10.compareTo(timeStamp25);
    long long34 = timeStamp10.getSeconds();
    long long35 = timeStamp10.getSeconds();
    long long36 = timeStamp10.getFraction();
    int i37 = timeStamp0.compareTo(timeStamp10);
    long long38 = timeStamp10.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1670570121891837641L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Wed, Oct 11 2023 10:02:59.251"+ "'", str7.equals("Wed, Oct 11 2023 10:02:59.251"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Wed, Oct 11 2023 10:02:59.251"+ "'", str8.equals("Wed, Oct 11 2023 10:02:59.251"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "00000000.00000000"+ "'", str13.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "00000000.00000000"+ "'", str14.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str19.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "00000000.00000000"+ "'", str20.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long26 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str27.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "00000000.00000000"+ "'", str28.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "00000000.00000000"+ "'", str29.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "00000000.00000000"+ "'", str32.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long34 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long35 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long38 == 0L);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    long long4 = timeStamp1.getTime();
    java.lang.String str5 = timeStamp1.toString();
    java.util.Date date6 = null;
    TimeStamp timeStamp7 = new TimeStamp(date6);
    long long8 = timeStamp7.getTime();
    java.lang.String str9 = timeStamp7.toDateString();
    java.lang.String str10 = timeStamp7.toString();
    java.lang.String str11 = timeStamp7.toString();
    long long12 = timeStamp7.getSeconds();
    java.lang.String str13 = timeStamp7.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp7);
    java.lang.String str15 = timeStamp7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00000000.00000000"+ "'", str10.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "00000000.00000000"+ "'", str11.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str13.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "00000000.00000000"+ "'", str15.equals("00000000.00000000"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    boolean b6 = timeStamp1.equals((java.lang.Object)100.0f);
    TimeStamp timeStamp7 = TimeStamp.getCurrentTime();
    long long8 = timeStamp7.ntpValue();
    java.util.Date date9 = null;
    TimeStamp timeStamp10 = new TimeStamp(date9);
    long long11 = timeStamp10.ntpValue();
    java.lang.String str12 = timeStamp10.toString();
    boolean b13 = timeStamp7.equals((java.lang.Object)timeStamp10);
    long long14 = timeStamp7.getFraction();
    int i15 = timeStamp1.compareTo(timeStamp7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1670570121741513786L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "00000000.00000000"+ "'", str12.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 1228360646L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }


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
    java.util.Date date15 = timeStamp3.getDate();
    long long16 = timeStamp3.getFraction();
    
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
    org.junit.Assert.assertNotNull(date15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.lang.String str7 = timeStamp3.toString();
    java.util.Date date8 = timeStamp3.getDate();
    TimeStamp timeStamp9 = new TimeStamp(date8);
    long long10 = timeStamp9.getTime();
    
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
    org.junit.Assert.assertTrue(long10 == 2085978496000L);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }


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
    java.lang.String str11 = timeStamp10.toUTCString();
    long long12 = timeStamp10.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str11.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(short)10);
    long long2 = timeStamp1.ntpValue();
    java.util.Date date3 = timeStamp1.getDate();
    TimeStamp timeStamp4 = new TimeStamp(date3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(0L);
    TimeStamp timeStamp2 = TimeStamp.getCurrentTime();
    long long3 = timeStamp2.ntpValue();
    java.util.Date date4 = null;
    TimeStamp timeStamp5 = new TimeStamp(date4);
    long long6 = timeStamp5.ntpValue();
    java.lang.String str7 = timeStamp5.toString();
    boolean b8 = timeStamp2.equals((java.lang.Object)timeStamp5);
    boolean b9 = timeStamp1.equals((java.lang.Object)timeStamp2);
    long long10 = timeStamp1.getTime();
    java.lang.String str11 = timeStamp1.toUTCString();
    java.lang.String str12 = timeStamp1.toUTCString();
    java.util.Date date13 = timeStamp1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1670570121415096271L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Thu, Jan 01 1970 00:00:00.000 UTC"+ "'", str11.equals("Thu, Jan 01 1970 00:00:00.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Thu, Jan 01 1970 00:00:00.000 UTC"+ "'", str12.equals("Thu, Jan 01 1970 00:00:00.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date13);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(short)10);
    java.lang.String str2 = timeStamp1.toDateString();
    long long3 = timeStamp1.getTime();
    java.lang.String str4 = timeStamp1.toUTCString();
    long long5 = timeStamp1.getSeconds();
    long long6 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str4.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 10L);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    long long1 = timeStamp0.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1602022801L);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1L));
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.getTime();
    java.lang.String str5 = timeStamp3.toDateString();
    long long6 = timeStamp3.getTime();
    java.lang.String str7 = timeStamp3.toString();
    int i8 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date9 = timeStamp3.getDate();
    java.util.Date date10 = timeStamp3.getDate();
    
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
    org.junit.Assert.assertNotNull(date10);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Thu, Jan 01 1970 00:00:00.010");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570134020825285L));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }


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
    java.lang.String str18 = timeStamp1.toDateString();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str18.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }


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
    TimeStamp timeStamp13 = TimeStamp.getCurrentTime();
    long long14 = timeStamp13.ntpValue();
    java.util.Date date15 = null;
    TimeStamp timeStamp16 = new TimeStamp(date15);
    long long17 = timeStamp16.ntpValue();
    java.lang.String str18 = timeStamp16.toString();
    boolean b19 = timeStamp13.equals((java.lang.Object)timeStamp16);
    java.lang.String str20 = timeStamp13.toString();
    java.lang.String str21 = timeStamp13.toString();
    int i22 = timeStamp1.compareTo(timeStamp13);
    
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
    org.junit.Assert.assertNotNull(timeStamp13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == (-1670570121307722089L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "00000000.00000000"+ "'", str18.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "e8d0f153.63126e97"+ "'", str20.equals("e8d0f153.63126e97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "e8d0f153.63126e97"+ "'", str21.equals("e8d0f153.63126e97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    long long6 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 2085978496000L);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    java.lang.String str4 = timeStamp3.toDateString();
    long long5 = timeStamp3.getSeconds();
    java.lang.String str6 = timeStamp3.toDateString();
    java.util.Date date7 = timeStamp3.getDate();
    TimeStamp timeStamp8 = new TimeStamp(date7);
    long long9 = timeStamp8.ntpValue();
    TimeStamp timeStamp11 = TimeStamp.getNtpTime(10L);
    long long12 = timeStamp11.ntpValue();
    java.lang.String str13 = timeStamp11.toUTCString();
    boolean b14 = timeStamp8.equals((java.lang.Object)timeStamp11);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-8959209420436317144L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Jan 01 1970 00:00:00.010 UTC"+ "'", str13.equals("Thu, Jan 01 1970 00:00:00.010 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570140759628973L));
    long long2 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-4179003179L));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date7 = timeStamp3.getDate();
    java.lang.String str8 = timeStamp3.toUTCString();
    long long9 = timeStamp3.getSeconds();
    java.lang.String str10 = timeStamp3.toUTCString();
    
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str10.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:55.061");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:55.106 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }


    TimeStamp timeStamp1 = new TimeStamp(100L);
    boolean b3 = timeStamp1.equals((java.lang.Object)(-1670570138002259968L));
    TimeStamp timeStamp5 = TimeStamp.parseNtpString("83aa7e80.19999999");
    int i6 = timeStamp1.compareTo(timeStamp5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    java.lang.String str4 = timeStamp3.toDateString();
    long long5 = timeStamp3.getSeconds();
    java.lang.String str6 = timeStamp3.toDateString();
    long long7 = timeStamp3.getSeconds();
    java.lang.String str8 = timeStamp3.toDateString();
    
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
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str8.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570142511975629L));
    boolean b3 = timeStamp1.equals((java.lang.Object)"e8d0f14e.73333333");
    java.util.Date date4 = null;
    TimeStamp timeStamp5 = new TimeStamp(date4);
    long long6 = timeStamp5.getTime();
    java.lang.String str7 = timeStamp5.toDateString();
    java.lang.String str8 = timeStamp5.toString();
    java.lang.String str9 = timeStamp5.toString();
    long long10 = timeStamp5.getSeconds();
    java.util.Date date11 = timeStamp5.getDate();
    TimeStamp timeStamp12 = new TimeStamp(date11);
    TimeStamp timeStamp14 = TimeStamp.getNtpTime((-1L));
    java.util.Date date15 = null;
    TimeStamp timeStamp16 = new TimeStamp(date15);
    long long17 = timeStamp16.getTime();
    java.lang.String str18 = timeStamp16.toDateString();
    long long19 = timeStamp16.getTime();
    java.lang.String str20 = timeStamp16.toString();
    int i21 = timeStamp14.compareTo(timeStamp16);
    boolean b22 = timeStamp12.equals((java.lang.Object)i21);
    int i23 = timeStamp1.compareTo(timeStamp12);
    java.util.Date date24 = timeStamp1.getDate();
    java.util.Date date25 = null;
    TimeStamp timeStamp26 = new TimeStamp(date25);
    TimeStamp timeStamp28 = new TimeStamp("");
    java.lang.String str29 = timeStamp28.toString();
    java.lang.String str30 = timeStamp28.toString();
    int i31 = timeStamp26.compareTo(timeStamp28);
    java.lang.String str32 = timeStamp28.toString();
    java.util.Date date33 = timeStamp28.getDate();
    long long34 = timeStamp28.ntpValue();
    int i35 = timeStamp1.compareTo(timeStamp28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
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
    org.junit.Assert.assertNotNull(timeStamp14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str18.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "00000000.00000000"+ "'", str20.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "00000000.00000000"+ "'", str29.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "00000000.00000000"+ "'", str30.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "00000000.00000000"+ "'", str32.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long34 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == (-1));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }


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
    long long14 = timeStamp8.ntpValue();
    
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
    org.junit.Assert.assertTrue(long14 == 0L);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }


    long long1 = TimeStamp.getTime(1697018576047L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978891118L);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }


    long long1 = TimeStamp.getTime((-1670570138264252974L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018575439L);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    TimeStamp timeStamp4 = new TimeStamp(date2);
    TimeStamp timeStamp5 = new TimeStamp(date2);
    java.lang.String str6 = timeStamp5.toDateString();
    java.util.Date date7 = timeStamp5.getDate();
    TimeStamp timeStamp8 = new TimeStamp(date7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str6.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date7);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570138715224540L));
    long long2 = timeStamp1.getSeconds();
    java.util.Date date3 = timeStamp1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 4294967295L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }


    java.lang.String str1 = TimeStamp.toString((-1670570136614985532L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f14f.d2b020c4"+ "'", str1.equals("e8d0f14f.d2b020c4"));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("e8d0f14f.dd70a3d7");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }


    TimeStamp timeStamp1 = new TimeStamp("00000000.9e76c8b4");
    long long2 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2658584756L);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }


    long long1 = TimeStamp.getTime((-1670570139264980354L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018575206L);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }


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
    TimeStamp timeStamp11 = new TimeStamp(date9);
    TimeStamp timeStamp12 = new TimeStamp(date9);
    java.lang.String str13 = timeStamp12.toDateString();
    long long14 = timeStamp12.getSeconds();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str13.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000000");
    java.lang.String str2 = timeStamp1.toDateString();
    java.util.Date date3 = timeStamp1.getDate();
    java.lang.String str4 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str4.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }


    java.lang.String str1 = TimeStamp.toString(1697018575136L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0000018b.1e307920"+ "'", str1.equals("0000018b.1e307920"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570139634347541L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }


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
    TimeStamp timeStamp14 = TimeStamp.parseNtpString("");
    java.util.Date date15 = timeStamp14.getDate();
    TimeStamp timeStamp16 = new TimeStamp(date15);
    TimeStamp timeStamp17 = new TimeStamp(date15);
    TimeStamp timeStamp18 = new TimeStamp(date15);
    boolean b19 = timeStamp1.equals((java.lang.Object)date15);
    TimeStamp timeStamp20 = new TimeStamp(date15);
    long long21 = timeStamp20.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000023"+ "'", str3.equals("00000000.00000023"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1670570120405778957L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00000000.00000000"+ "'", str9.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 2564095475L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 0L);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }


    java.lang.String str1 = TimeStamp.toString((-1670570141124701193L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f14e.c5e353f7"+ "'", str1.equals("e8d0f14e.c5e353f7"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }


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
    TimeStamp timeStamp14 = TimeStamp.parseNtpString("");
    java.util.Date date15 = timeStamp14.getDate();
    TimeStamp timeStamp16 = new TimeStamp(date15);
    TimeStamp timeStamp17 = new TimeStamp(date15);
    TimeStamp timeStamp18 = new TimeStamp(date15);
    boolean b19 = timeStamp1.equals((java.lang.Object)date15);
    java.lang.String str20 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000023"+ "'", str3.equals("00000000.00000023"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1670570120178145690L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00000000.00000000"+ "'", str9.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 2791728742L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str20.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570140570650412L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570124872544945L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }


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
    java.util.Date date25 = timeStamp1.getDate();
    boolean b27 = timeStamp1.equals((java.lang.Object)(-1670570133582738621L));
    
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
    org.junit.Assert.assertNotNull(date25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(short)10);
    java.lang.String str2 = timeStamp1.toDateString();
    long long3 = timeStamp1.getTime();
    java.lang.String str4 = timeStamp1.toUTCString();
    long long5 = timeStamp1.ntpValue();
    long long6 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str4.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    java.lang.String str4 = timeStamp3.toDateString();
    long long5 = timeStamp3.getSeconds();
    java.lang.String str6 = timeStamp3.toDateString();
    java.util.Date date7 = timeStamp3.getDate();
    long long8 = timeStamp3.ntpValue();
    long long9 = timeStamp3.getFraction();
    TimeStamp timeStamp11 = TimeStamp.getNtpTime((-1L));
    java.util.Date date12 = null;
    TimeStamp timeStamp13 = new TimeStamp(date12);
    long long14 = timeStamp13.getTime();
    java.lang.String str15 = timeStamp13.toDateString();
    long long16 = timeStamp13.getTime();
    java.lang.String str17 = timeStamp13.toString();
    int i18 = timeStamp11.compareTo(timeStamp13);
    int i19 = timeStamp3.compareTo(timeStamp11);
    TimeStamp timeStamp21 = TimeStamp.parseNtpString("");
    java.util.Date date22 = timeStamp21.getDate();
    TimeStamp timeStamp23 = new TimeStamp(date22);
    TimeStamp timeStamp24 = new TimeStamp(date22);
    long long25 = timeStamp24.getTime();
    TimeStamp timeStamp26 = TimeStamp.getCurrentTime();
    long long27 = timeStamp26.ntpValue();
    long long28 = timeStamp26.getFraction();
    int i29 = timeStamp24.compareTo(timeStamp26);
    long long30 = timeStamp26.ntpValue();
    int i31 = timeStamp11.compareTo(timeStamp26);
    java.util.Date date32 = null;
    TimeStamp timeStamp33 = new TimeStamp(date32);
    long long34 = timeStamp33.ntpValue();
    java.lang.String str35 = timeStamp33.toString();
    long long36 = timeStamp33.ntpValue();
    TimeStamp timeStamp37 = TimeStamp.getCurrentTime();
    long long38 = timeStamp37.ntpValue();
    java.util.Date date39 = null;
    TimeStamp timeStamp40 = new TimeStamp(date39);
    long long41 = timeStamp40.ntpValue();
    java.lang.String str42 = timeStamp40.toString();
    boolean b43 = timeStamp37.equals((java.lang.Object)timeStamp40);
    long long44 = timeStamp40.ntpValue();
    int i45 = timeStamp33.compareTo(timeStamp40);
    int i46 = timeStamp11.compareTo(timeStamp40);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str15.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "00000000.00000000"+ "'", str17.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == (-1670570119946217456L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long28 == 3023656976L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == (-1670570119946217456L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long34 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "00000000.00000000"+ "'", str35.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long38 == (-1670570119941922489L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long41 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "00000000.00000000"+ "'", str42.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long44 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == (-1));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:54.767");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570136477546578L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)10);
    long long2 = timeStamp1.getFraction();
    java.lang.String str3 = timeStamp1.toUTCString();
    long long4 = timeStamp1.getTime();
    long long5 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 42949672L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Jan 01 1970 00:00:00.010 UTC"+ "'", str3.equals("Thu, Jan 01 1970 00:00:00.010 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 10L);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570135953560568L));
    long long2 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 4294967295L);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    long long4 = timeStamp1.getTime();
    java.lang.String str5 = timeStamp1.toString();
    java.util.Date date6 = null;
    TimeStamp timeStamp7 = new TimeStamp(date6);
    long long8 = timeStamp7.getTime();
    java.lang.String str9 = timeStamp7.toDateString();
    java.lang.String str10 = timeStamp7.toString();
    java.lang.String str11 = timeStamp7.toString();
    long long12 = timeStamp7.getSeconds();
    java.lang.String str13 = timeStamp7.toUTCString();
    int i14 = timeStamp1.compareTo(timeStamp7);
    long long15 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00000000.00000000"+ "'", str10.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "00000000.00000000"+ "'", str11.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str13.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }


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
    TimeStamp timeStamp15 = TimeStamp.getNtpTime((-1670570138096749249L));
    boolean b17 = timeStamp15.equals((java.lang.Object)"83aa7e7f.ffbe76c8");
    boolean b18 = timeStamp4.equals((java.lang.Object)"83aa7e7f.ffbe76c8");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000023"+ "'", str3.equals("00000000.00000023"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1670570119250432754L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00000000.00000000"+ "'", str9.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 3719441678L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Wed, Oct 11 2023 10:02:59.866"+ "'", str13.equals("Wed, Oct 11 2023 10:02:59.866"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    java.lang.String str4 = timeStamp3.toDateString();
    long long5 = timeStamp3.getSeconds();
    java.lang.String str6 = timeStamp3.toString();
    java.lang.String str7 = timeStamp3.toUTCString();
    long long8 = timeStamp3.ntpValue();
    long long9 = timeStamp3.getFraction();
    
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
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.lang.String str2 = timeStamp1.toString();
    java.lang.String str3 = timeStamp1.toString();
    java.util.Date date4 = timeStamp1.getDate();
    TimeStamp timeStamp5 = new TimeStamp(date4);
    TimeStamp timeStamp6 = new TimeStamp(date4);
    TimeStamp timeStamp7 = new TimeStamp(date4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000000"+ "'", str2.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000000"+ "'", str3.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date4);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    java.lang.String str4 = timeStamp3.toDateString();
    long long5 = timeStamp3.getSeconds();
    java.lang.String str6 = timeStamp3.toDateString();
    long long7 = timeStamp3.getSeconds();
    java.util.Date date8 = timeStamp3.getDate();
    
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
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570140759628973L));
    TimeStamp timeStamp3 = TimeStamp.getNtpTime(1314259992L);
    long long4 = timeStamp3.getFraction();
    boolean b5 = timeStamp1.equals((java.lang.Object)timeStamp3);
    long long6 = timeStamp3.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 4260607557L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-8953564716795185595L));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }


    java.lang.String str1 = TimeStamp.toString((-1670570138835483624L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f14f.4e560418"+ "'", str1.equals("e8d0f14f.4e560418"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.lang.String str2 = timeStamp1.toString();
    java.lang.String str3 = timeStamp1.toString();
    TimeStamp timeStamp5 = new TimeStamp("");
    long long6 = timeStamp5.getFraction();
    int i7 = timeStamp1.compareTo(timeStamp5);
    java.lang.String str8 = timeStamp1.toUTCString();
    long long9 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000000"+ "'", str2.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000000"+ "'", str3.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str8.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 2085978496000L);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }


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
    java.lang.String str13 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1670570118984144782L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "e8d0f153.ed916872"+ "'", str10.equals("e8d0f153.ed916872"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "e8d0f153.ed916872"+ "'", str11.equals("e8d0f153.ed916872"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "00000000.00000000"+ "'", str13.equals("00000000.00000000"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    long long4 = timeStamp1.getTime();
    java.lang.String str5 = timeStamp1.toString();
    boolean b7 = timeStamp1.equals((java.lang.Object)(short)10);
    long long8 = timeStamp1.getFraction();
    java.lang.String str9 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }


    TimeStamp timeStamp1 = new TimeStamp(1697018574450L);
    java.util.Date date2 = timeStamp1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)10);
    java.lang.String str2 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Jan 01 1970 00:00:00.010 UTC"+ "'", str2.equals("Thu, Jan 01 1970 00:00:00.010 UTC"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570134136789402L));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }


    java.lang.String str1 = TimeStamp.toString(1697018574646L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0000018b.1e307736"+ "'", str1.equals("0000018b.1e307736"));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }


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
    java.lang.String str22 = timeStamp16.toUTCString();
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str22.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }


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
    TimeStamp timeStamp15 = TimeStamp.getNtpTime((-1L));
    java.util.Date date16 = null;
    TimeStamp timeStamp17 = new TimeStamp(date16);
    long long18 = timeStamp17.getTime();
    java.lang.String str19 = timeStamp17.toDateString();
    long long20 = timeStamp17.getTime();
    java.lang.String str21 = timeStamp17.toString();
    int i22 = timeStamp15.compareTo(timeStamp17);
    java.util.Date date23 = timeStamp17.getDate();
    TimeStamp timeStamp24 = new TimeStamp(date23);
    TimeStamp timeStamp25 = new TimeStamp(date23);
    int i26 = timeStamp11.compareTo(timeStamp25);
    
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
    org.junit.Assert.assertNotNull(timeStamp15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str19.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "00000000.00000000"+ "'", str21.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000061");
    java.lang.String str2 = timeStamp1.toDateString();
    long long3 = timeStamp1.getSeconds();
    java.util.Date date4 = timeStamp1.getDate();
    java.lang.String str5 = timeStamp1.toDateString();
    java.lang.String str6 = timeStamp1.toUTCString();
    java.lang.String str7 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str5.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str6.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str7.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }


    TimeStamp timeStamp1 = new TimeStamp("83aa7e7f.ffbe76c8");
    long long2 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 4290672328L);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570122553262605L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570131087362622L));
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp4 = TimeStamp.parseNtpString("");
    java.util.Date date5 = timeStamp4.getDate();
    TimeStamp timeStamp6 = new TimeStamp(date5);
    java.lang.String str7 = timeStamp6.toDateString();
    long long8 = timeStamp6.getSeconds();
    java.lang.String str9 = timeStamp6.toDateString();
    long long10 = timeStamp6.getSeconds();
    TimeStamp timeStamp12 = new TimeStamp((-1670570138835483624L));
    boolean b13 = timeStamp6.equals((java.lang.Object)(-1670570138835483624L));
    int i14 = timeStamp1.compareTo(timeStamp6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str7.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }


    long long1 = TimeStamp.getTime((-1670570126968488985L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018578069L);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }


    java.lang.String str1 = TimeStamp.toString(2212403299L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.83de9863"+ "'", str1.equals("00000000.83de9863"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570140759628973L));
    TimeStamp timeStamp3 = TimeStamp.getNtpTime(1314259992L);
    long long4 = timeStamp3.getFraction();
    boolean b5 = timeStamp1.equals((java.lang.Object)timeStamp3);
    java.util.Date date6 = timeStamp1.getDate();
    TimeStamp timeStamp7 = new TimeStamp(date6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 4260607557L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date6);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1L));
    java.lang.String str2 = timeStamp1.toDateString();
    java.lang.String str3 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Wed, Dec 31 1969 23:59:59.999"+ "'", str2.equals("Wed, Dec 31 1969 23:59:59.999"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Wed, Dec 31 1969 23:59:59.999 UTC"+ "'", str3.equals("Wed, Dec 31 1969 23:59:59.999 UTC"));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    java.lang.String str4 = timeStamp3.toDateString();
    long long5 = timeStamp3.getSeconds();
    java.lang.String str6 = timeStamp3.toDateString();
    java.util.Date date7 = timeStamp3.getDate();
    TimeStamp timeStamp8 = new TimeStamp(date7);
    java.util.Date date9 = null;
    TimeStamp timeStamp10 = new TimeStamp(date9);
    long long11 = timeStamp10.getTime();
    java.lang.String str12 = timeStamp10.toDateString();
    java.lang.String str13 = timeStamp10.toString();
    java.lang.String str14 = timeStamp10.toString();
    boolean b16 = timeStamp10.equals((java.lang.Object)0);
    java.lang.String str17 = timeStamp10.toString();
    java.lang.String str18 = timeStamp10.toDateString();
    long long19 = timeStamp10.ntpValue();
    java.util.Date date20 = timeStamp10.getDate();
    boolean b21 = timeStamp8.equals((java.lang.Object)date20);
    TimeStamp timeStamp22 = new TimeStamp(date20);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str12.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "00000000.00000000"+ "'", str13.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "00000000.00000000"+ "'", str14.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "00000000.00000000"+ "'", str17.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str18.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(short)0);
    TimeStamp timeStamp2 = TimeStamp.getCurrentTime();
    long long3 = timeStamp2.ntpValue();
    java.lang.String str4 = timeStamp2.toUTCString();
    long long5 = timeStamp2.getFraction();
    long long6 = timeStamp2.getTime();
    java.util.Date date7 = timeStamp2.getDate();
    java.util.Date date8 = timeStamp2.getDate();
    TimeStamp timeStamp9 = new TimeStamp(date8);
    TimeStamp timeStamp10 = new TimeStamp(date8);
    long long11 = timeStamp10.getTime();
    int i12 = timeStamp1.compareTo(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1670570118374259426L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Wed, Oct 11 2023 10:03:00.070 UTC"+ "'", str4.equals("Wed, Oct 11 2023 10:03:00.070 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 300647710L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1697018580070L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1697018580070L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }


    long long1 = TimeStamp.getTime(3719441678L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496866L);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(4294967295L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }


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
    TimeStamp timeStamp17 = new TimeStamp("83aa7e80.028f5c28");
    java.util.Date date18 = timeStamp17.getDate();
    TimeStamp timeStamp19 = new TimeStamp(date18);
    TimeStamp timeStamp20 = new TimeStamp(date18);
    boolean b21 = timeStamp3.equals((java.lang.Object)timeStamp20);
    java.lang.String str22 = timeStamp3.toString();
    
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
    org.junit.Assert.assertNotNull(date18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "00000000.00000000"+ "'", str22.equals("00000000.00000000"));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(1697018577849L);
    java.lang.String str2 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Wed, Oct 11 2023 10:02:57.849"+ "'", str2.equals("Wed, Oct 11 2023 10:02:57.849"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000061");
    long long2 = timeStamp1.getSeconds();
    java.lang.Object obj3 = null;
    boolean b4 = timeStamp1.equals(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }


    long long1 = TimeStamp.getTime(1697018577961L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978891118L);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }


    TimeStamp timeStamp1 = new TimeStamp("e8d0f151.4dd2f1a9");
    boolean b3 = timeStamp1.equals((java.lang.Object)(-1670570141244960277L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }


    TimeStamp timeStamp1 = new TimeStamp(1L);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }


    java.lang.String str1 = TimeStamp.toString(1697018578557L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0000018b.1e30867d"+ "'", str1.equals("0000018b.1e30867d"));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }


    TimeStamp timeStamp1 = new TimeStamp(100L);
    java.util.Date date2 = timeStamp1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    long long1 = timeStamp0.ntpValue();
    java.lang.String str2 = timeStamp0.toUTCString();
    long long3 = timeStamp0.getFraction();
    long long4 = timeStamp0.getTime();
    long long5 = timeStamp0.getSeconds();
    java.lang.String str6 = timeStamp0.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1670570118086496617L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Wed, Oct 11 2023 10:03:00.137 UTC"+ "'", str2.equals("Wed, Oct 11 2023 10:03:00.137 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 588410519L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1697018580137L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 3906007380L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Wed, Oct 11 2023 10:03:00.137"+ "'", str6.equals("Wed, Oct 11 2023 10:03:00.137"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }


    TimeStamp timeStamp1 = new TimeStamp("e8d0f151.4dd2f1a9");
    java.lang.String str2 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "e8d0f151.4dd2f1a9"+ "'", str2.equals("e8d0f151.4dd2f1a9"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }


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
    java.lang.String str16 = timeStamp3.toDateString();
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str16.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:57.215");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }


    java.lang.String str1 = TimeStamp.toString((-1670570131108837458L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f151.1ae147ae"+ "'", str1.equals("e8d0f151.1ae147ae"));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }


    long long1 = TimeStamp.getTime(1697018574833L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978891118L);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }


    TimeStamp timeStamp1 = new TimeStamp((long)'#');
    long long2 = timeStamp1.getTime();
    TimeStamp timeStamp3 = TimeStamp.getCurrentTime();
    long long4 = timeStamp3.ntpValue();
    java.lang.String str5 = timeStamp3.toUTCString();
    java.lang.String str6 = timeStamp3.toDateString();
    int i7 = timeStamp1.compareTo(timeStamp3);
    long long8 = timeStamp3.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1670570118000597271L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wed, Oct 11 2023 10:03:00.157 UTC"+ "'", str5.equals("Wed, Oct 11 2023 10:03:00.157 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Wed, Oct 11 2023 10:03:00.157"+ "'", str6.equals("Wed, Oct 11 2023 10:03:00.157"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 674309865L);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }


    long long1 = TimeStamp.getTime(3906007377L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496909L);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000061");
    java.lang.String str2 = timeStamp1.toDateString();
    long long3 = timeStamp1.ntpValue();
    java.lang.String str4 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 97L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str4.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }


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
    java.lang.String str32 = timeStamp30.toString();
    
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
    org.junit.Assert.assertTrue(long8 == (-1670570117987712369L));
    
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
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "00000000.00000000"+ "'", str32.equals("00000000.00000000"));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }


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
    java.util.Date date22 = timeStamp1.getDate();
    
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
    org.junit.Assert.assertNotNull(date22);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }


    TimeStamp timeStamp1 = new TimeStamp("00000000.ffbe76c8");
    java.util.Date date2 = timeStamp1.getDate();
    long long3 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 2085978496999L);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    java.util.Date date1 = timeStamp0.getDate();
    java.lang.String str2 = timeStamp0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "e8d0f154.3810624d"+ "'", str2.equals("e8d0f154.3810624d"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }


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
    long long32 = timeStamp1.getSeconds();
    long long33 = timeStamp1.getSeconds();
    
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
    org.junit.Assert.assertTrue(long8 == (-1670570117730014331L));
    
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
    org.junit.Assert.assertTrue(long32 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == 0L);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    java.lang.String str3 = timeStamp1.toString();
    java.util.Date date4 = timeStamp1.getDate();
    long long5 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000000"+ "'", str3.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }


    TimeStamp timeStamp1 = new TimeStamp(35L);
    TimeStamp timeStamp3 = new TimeStamp("83aa7e80.028f5c28");
    java.util.Date date4 = timeStamp3.getDate();
    boolean b5 = timeStamp1.equals((java.lang.Object)timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    long long1 = timeStamp0.ntpValue();
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.ntpValue();
    java.lang.String str5 = timeStamp3.toString();
    boolean b6 = timeStamp0.equals((java.lang.Object)timeStamp3);
    long long7 = timeStamp3.ntpValue();
    java.util.Date date8 = timeStamp3.getDate();
    TimeStamp timeStamp10 = new TimeStamp(10L);
    long long11 = timeStamp10.getSeconds();
    boolean b12 = timeStamp3.equals((java.lang.Object)timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1670570117575395509L));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1L));
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.getTime();
    java.lang.String str5 = timeStamp3.toDateString();
    long long6 = timeStamp3.getTime();
    java.lang.String str7 = timeStamp3.toString();
    int i8 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date9 = timeStamp1.getDate();
    TimeStamp timeStamp10 = new TimeStamp(date9);
    TimeStamp timeStamp11 = new TimeStamp(date9);
    
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

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Thu, Feb 07 2036 06:28:15.961");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(3534758084L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    java.lang.String str6 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str6.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570132255593726L));
    java.lang.String str2 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Wed, Oct 11 2023 10:02:56.838 UTC"+ "'", str2.equals("Wed, Oct 11 2023 10:02:56.838 UTC"));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    long long6 = timeStamp1.getSeconds();
    java.util.Date date7 = timeStamp1.getDate();
    TimeStamp timeStamp8 = new TimeStamp(date7);
    TimeStamp timeStamp9 = new TimeStamp(date7);
    long long10 = timeStamp9.getTime();
    
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
    org.junit.Assert.assertTrue(long10 == 2085978496000L);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(2680059592L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)10);
    long long2 = timeStamp1.getFraction();
    long long3 = timeStamp1.getFraction();
    long long4 = timeStamp1.ntpValue();
    TimeStamp timeStamp6 = new TimeStamp((long)(byte)-1);
    java.lang.String str7 = timeStamp6.toString();
    int i8 = timeStamp1.compareTo(timeStamp6);
    long long9 = timeStamp1.getTime();
    java.lang.String str10 = timeStamp1.toDateString();
    
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
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Thu, Jan 01 1970 00:00:00.010"+ "'", str10.equals("Thu, Jan 01 1970 00:00:00.010"));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }


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
    TimeStamp timeStamp11 = new TimeStamp(date9);
    TimeStamp timeStamp12 = new TimeStamp(date9);
    java.lang.String str13 = timeStamp12.toDateString();
    long long14 = timeStamp12.getTime();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str13.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 2085978496000L);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }


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
    java.lang.String str12 = timeStamp3.toDateString();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str12.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }


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
    java.util.Date date14 = timeStamp1.getDate();
    
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
    org.junit.Assert.assertNotNull(date14);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570136614985532L));
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((-1L));
    java.util.Date date4 = null;
    TimeStamp timeStamp5 = new TimeStamp(date4);
    long long6 = timeStamp5.getTime();
    java.lang.String str7 = timeStamp5.toDateString();
    long long8 = timeStamp5.getTime();
    java.lang.String str9 = timeStamp5.toString();
    int i10 = timeStamp3.compareTo(timeStamp5);
    java.util.Date date11 = timeStamp5.getDate();
    TimeStamp timeStamp12 = new TimeStamp(date11);
    TimeStamp timeStamp13 = new TimeStamp(date11);
    TimeStamp timeStamp14 = new TimeStamp(date11);
    boolean b15 = timeStamp1.equals((java.lang.Object)date11);
    long long16 = timeStamp1.getFraction();
    java.util.Date date17 = null;
    TimeStamp timeStamp18 = new TimeStamp(date17);
    TimeStamp timeStamp20 = new TimeStamp("");
    java.lang.String str21 = timeStamp20.toString();
    java.lang.String str22 = timeStamp20.toString();
    int i23 = timeStamp18.compareTo(timeStamp20);
    java.lang.String str24 = timeStamp20.toString();
    java.util.Date date25 = timeStamp20.getDate();
    TimeStamp timeStamp26 = new TimeStamp(date25);
    TimeStamp timeStamp27 = new TimeStamp(date25);
    long long28 = timeStamp27.getFraction();
    boolean b29 = timeStamp1.equals((java.lang.Object)long28);
    
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
    org.junit.Assert.assertNotNull(date11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 2010044695L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "00000000.00000000"+ "'", str21.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "00000000.00000000"+ "'", str22.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "00000000.00000000"+ "'", str24.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long28 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(2085978496000L);
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    java.lang.String str4 = timeStamp3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }


    TimeStamp timeStamp1 = new TimeStamp(472446402L);
    java.lang.String str2 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.1c28f5c2"+ "'", str2.equals("00000000.1c28f5c2"));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }


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
    java.lang.String str15 = timeStamp1.toString();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "00000000.00000000"+ "'", str15.equals("00000000.00000000"));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }


    TimeStamp timeStamp1 = new TimeStamp((long)'#');
    long long2 = timeStamp1.getFraction();
    java.lang.String str3 = timeStamp1.toString();
    java.lang.String str4 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000023"+ "'", str3.equals("00000000.00000023"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000023"+ "'", str4.equals("00000000.00000023"));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570136606395597L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570119946217456L));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }


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
    long long17 = timeStamp10.ntpValue();
    
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
    org.junit.Assert.assertTrue(long8 == (-1670570116780826559L));
    
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
    org.junit.Assert.assertTrue(long17 == 0L);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570132255593726L));
    java.lang.String str2 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "e8d0f150.d6872b02"+ "'", str2.equals("e8d0f150.d6872b02"));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    java.lang.String str4 = timeStamp3.toDateString();
    long long5 = timeStamp3.getSeconds();
    java.lang.String str6 = timeStamp3.toDateString();
    java.util.Date date7 = timeStamp3.getDate();
    long long8 = timeStamp3.ntpValue();
    long long9 = timeStamp3.getFraction();
    long long10 = timeStamp3.getFraction();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }


    TimeStamp timeStamp1 = new TimeStamp("00000000.ffbe76c8");
    long long2 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    long long1 = timeStamp0.ntpValue();
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.ntpValue();
    java.lang.String str5 = timeStamp3.toString();
    boolean b6 = timeStamp0.equals((java.lang.Object)timeStamp3);
    java.lang.String str7 = timeStamp0.toDateString();
    java.util.Date date8 = timeStamp0.getDate();
    TimeStamp timeStamp9 = new TimeStamp(date8);
    long long10 = timeStamp9.getTime();
    long long11 = timeStamp9.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1670570116737876886L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Wed, Oct 11 2023 10:03:00.451"+ "'", str7.equals("Wed, Oct 11 2023 10:03:00.451"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 1697018580451L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1697018580451L);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570141030211912L));
    java.util.Date date2 = timeStamp1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)1);
    long long2 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 4294967L);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.lang.String str2 = timeStamp1.toString();
    java.lang.String str3 = timeStamp1.toString();
    TimeStamp timeStamp5 = new TimeStamp("");
    long long6 = timeStamp5.getFraction();
    int i7 = timeStamp1.compareTo(timeStamp5);
    java.lang.String str8 = timeStamp1.toUTCString();
    long long9 = timeStamp1.getFraction();
    long long10 = timeStamp1.ntpValue();
    long long11 = timeStamp1.getSeconds();
    java.util.Date date12 = timeStamp1.getDate();
    TimeStamp timeStamp14 = TimeStamp.getNtpTime((long)(short)-1);
    int i15 = timeStamp1.compareTo(timeStamp14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000000"+ "'", str2.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000000"+ "'", str3.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str8.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    long long1 = timeStamp0.ntpValue();
    long long2 = timeStamp0.getSeconds();
    TimeStamp timeStamp3 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = timeStamp0.compareTo(timeStamp3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1670570116682042311L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 3906007380L);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000000");
    java.lang.String str2 = timeStamp1.toDateString();
    java.util.Date date3 = timeStamp1.getDate();
    long long4 = timeStamp1.ntpValue();
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
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }


    java.lang.String str1 = TimeStamp.toString((-1670570129502519690L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f151.7a9fbe76"+ "'", str1.equals("e8d0f151.7a9fbe76"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }


    TimeStamp timeStamp1 = new TimeStamp(3431678869L);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }


    long long1 = TimeStamp.getTime(4294967295L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978497000L);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }


    java.lang.String str1 = TimeStamp.toString((long)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.0000000a"+ "'", str1.equals("00000000.0000000a"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }


    TimeStamp timeStamp1 = new TimeStamp("000001e5.ae01dc00");
    long long2 = timeStamp1.ntpValue();
    TimeStamp timeStamp4 = TimeStamp.getNtpTime((long)'4');
    java.lang.String str5 = timeStamp4.toUTCString();
    boolean b6 = timeStamp1.equals((java.lang.Object)timeStamp4);
    long long7 = timeStamp4.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Thu, Jan 01 1970 00:00:00.052 UTC"+ "'", str5.equals("Thu, Jan 01 1970 00:00:00.052 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 2208988800L);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(short)10);
    java.lang.String str2 = timeStamp1.toDateString();
    long long3 = timeStamp1.getTime();
    java.lang.String str4 = timeStamp1.toUTCString();
    long long5 = timeStamp1.ntpValue();
    TimeStamp timeStamp7 = new TimeStamp((-1670570142511975629L));
    boolean b9 = timeStamp7.equals((java.lang.Object)"e8d0f14e.73333333");
    java.util.Date date10 = null;
    TimeStamp timeStamp11 = new TimeStamp(date10);
    long long12 = timeStamp11.getTime();
    java.lang.String str13 = timeStamp11.toDateString();
    java.lang.String str14 = timeStamp11.toString();
    java.lang.String str15 = timeStamp11.toString();
    long long16 = timeStamp11.getSeconds();
    java.util.Date date17 = timeStamp11.getDate();
    TimeStamp timeStamp18 = new TimeStamp(date17);
    TimeStamp timeStamp20 = TimeStamp.getNtpTime((-1L));
    java.util.Date date21 = null;
    TimeStamp timeStamp22 = new TimeStamp(date21);
    long long23 = timeStamp22.getTime();
    java.lang.String str24 = timeStamp22.toDateString();
    long long25 = timeStamp22.getTime();
    java.lang.String str26 = timeStamp22.toString();
    int i27 = timeStamp20.compareTo(timeStamp22);
    boolean b28 = timeStamp18.equals((java.lang.Object)i27);
    int i29 = timeStamp7.compareTo(timeStamp18);
    java.util.Date date30 = timeStamp7.getDate();
    boolean b31 = timeStamp1.equals((java.lang.Object)timeStamp7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str4.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str13.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "00000000.00000000"+ "'", str14.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "00000000.00000000"+ "'", str15.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str24.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "00000000.00000000"+ "'", str26.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }


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
    long long33 = timeStamp5.getFraction();
    
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
    org.junit.Assert.assertTrue(long33 == 0L);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(0L);
    TimeStamp timeStamp2 = TimeStamp.getCurrentTime();
    long long3 = timeStamp2.ntpValue();
    java.util.Date date4 = null;
    TimeStamp timeStamp5 = new TimeStamp(date4);
    long long6 = timeStamp5.ntpValue();
    java.lang.String str7 = timeStamp5.toString();
    boolean b8 = timeStamp2.equals((java.lang.Object)timeStamp5);
    boolean b9 = timeStamp1.equals((java.lang.Object)timeStamp2);
    long long10 = timeStamp1.getTime();
    long long11 = timeStamp1.getSeconds();
    java.util.Date date12 = timeStamp1.getDate();
    TimeStamp timeStamp13 = new TimeStamp(date12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1670570116377099633L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 2208988800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date12);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(100L);
    java.lang.String str2 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Jan 01 1970 00:00:00.100 UTC"+ "'", str2.equals("Thu, Jan 01 1970 00:00:00.100 UTC"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    long long1 = timeStamp0.ntpValue();
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.ntpValue();
    java.lang.String str5 = timeStamp3.toString();
    boolean b6 = timeStamp0.equals((java.lang.Object)timeStamp3);
    long long7 = timeStamp3.ntpValue();
    boolean b9 = timeStamp3.equals((java.lang.Object)10.0f);
    java.lang.String str10 = timeStamp3.toDateString();
    java.lang.String str11 = timeStamp3.toString();
    java.util.Date date12 = null;
    TimeStamp timeStamp13 = new TimeStamp(date12);
    long long14 = timeStamp13.ntpValue();
    TimeStamp timeStamp16 = TimeStamp.getNtpTime((long)(short)10);
    long long17 = timeStamp16.getFraction();
    int i18 = timeStamp13.compareTo(timeStamp16);
    int i19 = timeStamp3.compareTo(timeStamp16);
    long long20 = timeStamp16.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1670570116329854993L));
    
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str10.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "00000000.00000000"+ "'", str11.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 42949672L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 2208988800L);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570135953560568L));
    long long2 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 1855425872L);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:55.977");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)100);
    java.lang.String str2 = timeStamp1.toUTCString();
    java.lang.String str3 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Jan 01 1970 00:00:00.100 UTC"+ "'", str2.equals("Thu, Jan 01 1970 00:00:00.100 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Jan 01 1970 00:00:00.100 UTC"+ "'", str3.equals("Thu, Jan 01 1970 00:00:00.100 UTC"));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.lang.String str7 = timeStamp3.toUTCString();
    java.util.Date date8 = null;
    TimeStamp timeStamp9 = new TimeStamp(date8);
    long long10 = timeStamp9.getTime();
    java.lang.String str11 = timeStamp9.toDateString();
    java.lang.String str12 = timeStamp9.toString();
    boolean b14 = timeStamp9.equals((java.lang.Object)100.0f);
    long long15 = timeStamp9.getTime();
    long long16 = timeStamp9.getTime();
    int i17 = timeStamp3.compareTo(timeStamp9);
    TimeStamp timeStamp19 = new TimeStamp("83aa7e80.028f5c28");
    java.util.Date date20 = timeStamp19.getDate();
    boolean b21 = timeStamp9.equals((java.lang.Object)date20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "00000000.00000000"+ "'", str4.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str7.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str11.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "00000000.00000000"+ "'", str12.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    TimeStamp timeStamp4 = TimeStamp.getNtpTime((long)(short)10);
    long long5 = timeStamp4.getFraction();
    int i6 = timeStamp1.compareTo(timeStamp4);
    long long7 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 42949672L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570141833370797L));
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    TimeStamp timeStamp4 = new TimeStamp(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)'a');
    java.lang.String str2 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "83aa7e80.18d4fdf3"+ "'", str2.equals("83aa7e80.18d4fdf3"));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }


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
    java.lang.String str14 = timeStamp6.toDateString();
    long long15 = timeStamp6.getTime();
    long long16 = timeStamp6.getFraction();
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str14.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }


    TimeStamp timeStamp1 = new TimeStamp((long)'#');
    long long2 = timeStamp1.getTime();
    TimeStamp timeStamp3 = TimeStamp.getCurrentTime();
    long long4 = timeStamp3.ntpValue();
    java.lang.String str5 = timeStamp3.toUTCString();
    java.lang.String str6 = timeStamp3.toDateString();
    int i7 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date8 = timeStamp3.getDate();
    TimeStamp timeStamp9 = new TimeStamp(date8);
    TimeStamp timeStamp10 = new TimeStamp(date8);
    long long11 = timeStamp10.getSeconds();
    java.lang.String str12 = timeStamp10.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1670570116149466366L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wed, Oct 11 2023 10:03:00.588 UTC"+ "'", str5.equals("Wed, Oct 11 2023 10:03:00.588 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Wed, Oct 11 2023 10:03:00.588"+ "'", str6.equals("Wed, Oct 11 2023 10:03:00.588"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 3906007380L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "e8d0f154.96872b02"+ "'", str12.equals("e8d0f154.96872b02"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(1314259992L);
    long long2 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2210303059L);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }


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
    TimeStamp timeStamp14 = new TimeStamp(date11);
    
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

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:55.659");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(2085978496000L);
    java.util.Date date2 = timeStamp1.getDate();
    java.util.Date date3 = null;
    TimeStamp timeStamp4 = new TimeStamp(date3);
    long long5 = timeStamp4.getTime();
    java.lang.String str6 = timeStamp4.toDateString();
    long long7 = timeStamp4.getFraction();
    long long8 = timeStamp4.getTime();
    boolean b9 = timeStamp1.equals((java.lang.Object)timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str6.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }


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
    java.util.Date date13 = timeStamp1.getDate();
    boolean b15 = timeStamp1.equals((java.lang.Object)(-1670570136434596905L));
    java.util.Date date16 = timeStamp1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1670570115986257609L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00000000.00000000"+ "'", str8.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "e8d0f154.a0418937"+ "'", str10.equals("e8d0f154.a0418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "e8d0f154.a0418937"+ "'", str11.equals("e8d0f154.a0418937"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date16);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:56.427");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.0000000a");
    boolean b3 = timeStamp1.equals((java.lang.Object)(-1670570141244960277L));
    java.lang.String str4 = timeStamp1.toUTCString();
    long long5 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str4.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 2085978496000L);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)10);
    java.lang.String str2 = timeStamp1.toString();
    java.util.Date date3 = null;
    TimeStamp timeStamp4 = new TimeStamp(date3);
    long long5 = timeStamp4.ntpValue();
    java.lang.String str6 = timeStamp4.toString();
    long long7 = timeStamp4.ntpValue();
    boolean b8 = timeStamp1.equals((java.lang.Object)timeStamp4);
    java.lang.String str9 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "83aa7e80.028f5c28"+ "'", str2.equals("83aa7e80.028f5c28"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "00000000.00000000"+ "'", str6.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Jan 01 1970 00:00:00.010 UTC"+ "'", str9.equals("Thu, Jan 01 1970 00:00:00.010 UTC"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test173"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Thu, Jan 01 1970 00:00:00.100 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test174"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(1697018574949L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test175"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    long long4 = timeStamp1.getTime();
    long long5 = timeStamp1.getSeconds();
    boolean b7 = timeStamp1.equals((java.lang.Object)"Wed, Oct 11 2023 10:02:57.360");
    java.lang.String str8 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str8.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test176"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(-1));
    long long2 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test177"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    long long6 = timeStamp1.getSeconds();
    java.util.Date date7 = timeStamp1.getDate();
    java.lang.String str8 = timeStamp1.toUTCString();
    long long9 = timeStamp1.ntpValue();
    
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str8.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test178"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1L));
    long long2 = timeStamp1.ntpValue();
    java.lang.String str3 = timeStamp1.toUTCString();
    boolean b5 = timeStamp1.equals((java.lang.Object)"ffffffff.ffffffff");
    java.util.Date date6 = null;
    TimeStamp timeStamp7 = new TimeStamp(date6);
    long long8 = timeStamp7.ntpValue();
    java.lang.String str9 = timeStamp7.toString();
    long long10 = timeStamp7.ntpValue();
    TimeStamp timeStamp11 = TimeStamp.getCurrentTime();
    long long12 = timeStamp11.ntpValue();
    java.util.Date date13 = null;
    TimeStamp timeStamp14 = new TimeStamp(date13);
    long long15 = timeStamp14.ntpValue();
    java.lang.String str16 = timeStamp14.toString();
    boolean b17 = timeStamp11.equals((java.lang.Object)timeStamp14);
    long long18 = timeStamp14.ntpValue();
    int i19 = timeStamp7.compareTo(timeStamp14);
    java.lang.String str20 = timeStamp14.toUTCString();
    int i21 = timeStamp1.compareTo(timeStamp14);
    long long22 = timeStamp14.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-8959209420483561784L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Wed, Dec 31 1969 23:59:59.999 UTC"+ "'", str3.equals("Wed, Dec 31 1969 23:59:59.999 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00000000.00000000"+ "'", str9.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-1670570115921833100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "00000000.00000000"+ "'", str16.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str20.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 0L);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test179"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("83aa7e80.19999999");
    java.lang.String str2 = timeStamp1.toDateString();
    java.lang.String str3 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Jan 01 1970 00:00:00.100"+ "'", str2.equals("Thu, Jan 01 1970 00:00:00.100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Jan 01 1970 00:00:00.100 UTC"+ "'", str3.equals("Thu, Jan 01 1970 00:00:00.100 UTC"));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test180"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.0000000a");
    long long2 = timeStamp1.getTime();
    long long3 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 2085978496000L);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test181"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:55.500");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test182"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.lang.String str2 = timeStamp1.toString();
    java.lang.String str3 = timeStamp1.toString();
    TimeStamp timeStamp5 = new TimeStamp("");
    long long6 = timeStamp5.getFraction();
    int i7 = timeStamp1.compareTo(timeStamp5);
    java.util.Date date8 = timeStamp1.getDate();
    TimeStamp timeStamp9 = new TimeStamp(date8);
    TimeStamp timeStamp10 = new TimeStamp(date8);
    java.util.Date date11 = timeStamp10.getDate();
    
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
    org.junit.Assert.assertNotNull(date11);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test183"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570140583535313L));
    boolean b3 = timeStamp1.equals((java.lang.Object)"0000018b.1e307a88");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test184"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570137512633697L));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test185"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(byte)1);
    java.lang.String str2 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000001"+ "'", str2.equals("00000000.00000001"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test186"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:54.646");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test187"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.lang.String str2 = timeStamp1.toString();
    java.lang.String str3 = timeStamp1.toString();
    java.util.Date date4 = timeStamp1.getDate();
    java.lang.String str5 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000000"+ "'", str2.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000000"+ "'", str3.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str5.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test188"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    TimeStamp timeStamp3 = new TimeStamp("");
    java.lang.String str4 = timeStamp3.toString();
    java.lang.String str5 = timeStamp3.toString();
    int i6 = timeStamp1.compareTo(timeStamp3);
    java.lang.String str7 = timeStamp3.toString();
    java.util.Date date8 = timeStamp3.getDate();
    java.util.Date date9 = timeStamp3.getDate();
    
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
    org.junit.Assert.assertNotNull(date9);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test189"); }


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
    long long14 = timeStamp4.getFraction();
    java.lang.String str15 = timeStamp4.toString();
    
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
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "00000000.00000000"+ "'", str15.equals("00000000.00000000"));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test190"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("e8d0f14f.1b22d0e5");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test191"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570138264252974L));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test192"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:02:55.120 UTC");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test193"); }


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
    long long12 = timeStamp8.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1670570115685609898L));
    
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
    org.junit.Assert.assertTrue(long12 == 2208988799L);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test194"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:58.052");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test195"); }


    TimeStamp timeStamp1 = new TimeStamp(3985729650L);
    java.lang.String str2 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.928"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.928"));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test196"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(short)10);
    TimeStamp timeStamp3 = new TimeStamp((long)(short)0);
    boolean b5 = timeStamp3.equals((java.lang.Object)false);
    boolean b6 = timeStamp1.equals((java.lang.Object)timeStamp3);
    java.lang.String str7 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.0000000a"+ "'", str7.equals("00000000.0000000a"));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test197"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570141030211912L));
    java.lang.String str2 = timeStamp1.toDateString();
    long long3 = timeStamp1.getSeconds();
    long long4 = timeStamp1.ntpValue();
    long long5 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Wed, Oct 11 2023 10:02:54.795"+ "'", str2.equals("Wed, Oct 11 2023 10:02:54.795"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 3906007374L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1670570141030211912L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1670570141030211912L));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test198"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)-1);
    long long2 = timeStamp1.getFraction();
    TimeStamp timeStamp4 = new TimeStamp((long)'#');
    long long5 = timeStamp4.getTime();
    TimeStamp timeStamp6 = TimeStamp.getCurrentTime();
    long long7 = timeStamp6.ntpValue();
    java.lang.String str8 = timeStamp6.toUTCString();
    java.lang.String str9 = timeStamp6.toDateString();
    int i10 = timeStamp4.compareTo(timeStamp6);
    TimeStamp timeStamp12 = TimeStamp.parseNtpString("");
    java.util.Date date13 = timeStamp12.getDate();
    boolean b14 = timeStamp4.equals((java.lang.Object)timeStamp12);
    java.lang.String str15 = timeStamp4.toString();
    int i16 = timeStamp1.compareTo(timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 4290672328L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1670570115646955193L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Wed, Oct 11 2023 10:03:00.705 UTC"+ "'", str8.equals("Wed, Oct 11 2023 10:03:00.705 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Wed, Oct 11 2023 10:03:00.705"+ "'", str9.equals("Wed, Oct 11 2023 10:03:00.705"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "00000000.00000023"+ "'", str15.equals("00000000.00000023"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test199"); }


    TimeStamp timeStamp1 = new TimeStamp("e8d0f154.96872b02");

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test200"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570124610551940L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test201"); }


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
    java.util.Date date13 = null;
    TimeStamp timeStamp14 = new TimeStamp(date13);
    long long15 = timeStamp14.getTime();
    java.lang.String str16 = timeStamp14.toDateString();
    long long17 = timeStamp14.getTime();
    boolean b19 = timeStamp14.equals((java.lang.Object)"ffffffff.ffffffff");
    TimeStamp timeStamp20 = TimeStamp.getCurrentTime();
    long long21 = timeStamp20.ntpValue();
    java.util.Date date22 = null;
    TimeStamp timeStamp23 = new TimeStamp(date22);
    long long24 = timeStamp23.ntpValue();
    java.lang.String str25 = timeStamp23.toString();
    boolean b26 = timeStamp20.equals((java.lang.Object)timeStamp23);
    long long27 = timeStamp23.ntpValue();
    java.lang.String str28 = timeStamp23.toDateString();
    int i29 = timeStamp14.compareTo(timeStamp23);
    long long30 = timeStamp23.getTime();
    boolean b31 = timeStamp3.equals((java.lang.Object)timeStamp23);
    java.util.Date date32 = timeStamp3.getDate();
    
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
    org.junit.Assert.assertTrue(long15 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str16.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == (-1670570115595415585L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long24 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "00000000.00000000"+ "'", str25.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str28.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date32);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test202"); }


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
    java.lang.String str14 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1670570115466566566L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00000000.00000000"+ "'", str10.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 1697018580747L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str14.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test203"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Wed, Oct 11 2023 10:02:56.116");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test204"); }


    TimeStamp timeStamp1 = new TimeStamp(429496729L);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test205"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(10L);
    long long2 = timeStamp1.ntpValue();
    long long3 = timeStamp1.getSeconds();
    java.lang.String str4 = timeStamp1.toUTCString();
    java.util.Date date5 = timeStamp1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-8959209420436317144L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 2208988800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Jan 01 1970 00:00:00.010 UTC"+ "'", str4.equals("Thu, Jan 01 1970 00:00:00.010 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date5);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test206"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    java.lang.String str4 = timeStamp3.toDateString();
    long long5 = timeStamp3.getSeconds();
    java.lang.String str6 = timeStamp3.toString();
    java.lang.String str7 = timeStamp3.toUTCString();
    long long8 = timeStamp3.ntpValue();
    java.lang.String str9 = timeStamp3.toUTCString();
    
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test207"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    boolean b7 = timeStamp1.equals((java.lang.Object)0);
    java.lang.String str8 = timeStamp1.toString();
    java.util.Date date9 = timeStamp1.getDate();
    java.util.Date date10 = null;
    TimeStamp timeStamp11 = new TimeStamp(date10);
    TimeStamp timeStamp13 = new TimeStamp("");
    java.lang.String str14 = timeStamp13.toString();
    java.lang.String str15 = timeStamp13.toString();
    int i16 = timeStamp11.compareTo(timeStamp13);
    long long17 = timeStamp11.getSeconds();
    TimeStamp timeStamp19 = TimeStamp.parseNtpString("");
    java.util.Date date20 = timeStamp19.getDate();
    TimeStamp timeStamp21 = new TimeStamp(date20);
    TimeStamp timeStamp22 = new TimeStamp(date20);
    java.util.Date date23 = null;
    TimeStamp timeStamp24 = new TimeStamp(date23);
    long long25 = timeStamp24.getTime();
    java.lang.String str26 = timeStamp24.toDateString();
    long long27 = timeStamp24.getTime();
    java.lang.String str28 = timeStamp24.toString();
    boolean b30 = timeStamp24.equals((java.lang.Object)(short)10);
    int i31 = timeStamp22.compareTo(timeStamp24);
    int i32 = timeStamp11.compareTo(timeStamp22);
    java.lang.String str33 = timeStamp11.toString();
    int i34 = timeStamp1.compareTo(timeStamp11);
    
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
    org.junit.Assert.assertNotNull(date9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "00000000.00000000"+ "'", str14.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "00000000.00000000"+ "'", str15.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str26.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "00000000.00000000"+ "'", str28.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "00000000.00000000"+ "'", str33.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test208"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000061");
    java.lang.String str2 = timeStamp1.toDateString();
    long long3 = timeStamp1.getSeconds();
    java.util.Date date4 = timeStamp1.getDate();
    java.lang.String str5 = timeStamp1.toDateString();
    java.lang.String str6 = timeStamp1.toUTCString();
    TimeStamp timeStamp8 = new TimeStamp("00000000.00000034");
    java.lang.String str9 = timeStamp8.toUTCString();
    int i10 = timeStamp1.compareTo(timeStamp8);
    java.util.Date date11 = timeStamp8.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str5.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str6.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str9.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date11);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test209"); }


    java.lang.String str1 = TimeStamp.toString((-1670570136606395597L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f14f.d3333333"+ "'", str1.equals("e8d0f14f.d3333333"));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test210"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570131087362622L));
    java.util.Date date2 = timeStamp1.getDate();
    long long3 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 4294967295L);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test211"); }


    TimeStamp timeStamp1 = new TimeStamp(2085978496866L);
    long long2 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496866L);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test212"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(100L);
    long long2 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2208988800L);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test213"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(2658584756L);
    java.lang.String str2 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "83d30f98.c189374b"+ "'", str2.equals("83d30f98.c189374b"));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test214"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.ntpValue();
    java.lang.String str3 = timeStamp1.toString();
    java.util.Date date4 = timeStamp1.getDate();
    TimeStamp timeStamp5 = new TimeStamp(date4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000000"+ "'", str3.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date4);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test215"); }


    TimeStamp timeStamp0 = TimeStamp.getCurrentTime();
    long long1 = timeStamp0.ntpValue();
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    long long4 = timeStamp3.ntpValue();
    java.lang.String str5 = timeStamp3.toString();
    boolean b6 = timeStamp0.equals((java.lang.Object)timeStamp3);
    java.lang.String str7 = timeStamp0.toDateString();
    java.util.Date date8 = timeStamp0.getDate();
    TimeStamp timeStamp9 = new TimeStamp(date8);
    long long10 = timeStamp9.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1670570115097199379L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00000000.00000000"+ "'", str5.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Wed, Oct 11 2023 10:03:00.833"+ "'", str7.equals("Wed, Oct 11 2023 10:03:00.833"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 3577707757L);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test216"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    TimeStamp timeStamp4 = new TimeStamp(date2);
    TimeStamp timeStamp5 = new TimeStamp(date2);
    TimeStamp timeStamp6 = new TimeStamp(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test217"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    boolean b6 = timeStamp1.equals((java.lang.Object)100.0f);
    long long7 = timeStamp1.getTime();
    java.util.Date date8 = timeStamp1.getDate();
    
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
    org.junit.Assert.assertNotNull(date8);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test218"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570138569195652L));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test219"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000000");
    java.lang.String str2 = timeStamp1.toDateString();
    java.util.Date date3 = timeStamp1.getDate();
    java.lang.String str4 = timeStamp1.toDateString();
    java.util.Date date5 = timeStamp1.getDate();
    TimeStamp timeStamp6 = new TimeStamp(date5);
    
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

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test220"); }


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
    TimeStamp timeStamp12 = new TimeStamp(date11);
    java.lang.String str13 = timeStamp12.toUTCString();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str13.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test221"); }


    java.lang.String str1 = TimeStamp.toString(300647710L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000.11eb851e"+ "'", str1.equals("00000000.11eb851e"));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test222"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("");
    java.util.Date date2 = timeStamp1.getDate();
    TimeStamp timeStamp3 = new TimeStamp(date2);
    java.lang.String str4 = timeStamp3.toDateString();
    long long5 = timeStamp3.getSeconds();
    java.lang.String str6 = timeStamp3.toDateString();
    java.util.Date date7 = timeStamp3.getDate();
    long long8 = timeStamp3.ntpValue();
    long long9 = timeStamp3.getFraction();
    long long10 = timeStamp3.ntpValue();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test223"); }


    TimeStamp timeStamp1 = new TimeStamp(2085978496306L);
    long long2 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2919357746L);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test224"); }


    TimeStamp timeStamp1 = new TimeStamp((long)'#');
    long long2 = timeStamp1.getTime();
    TimeStamp timeStamp3 = TimeStamp.getCurrentTime();
    long long4 = timeStamp3.ntpValue();
    java.lang.String str5 = timeStamp3.toUTCString();
    java.lang.String str6 = timeStamp3.toDateString();
    int i7 = timeStamp1.compareTo(timeStamp3);
    TimeStamp timeStamp9 = TimeStamp.parseNtpString("");
    java.util.Date date10 = timeStamp9.getDate();
    boolean b11 = timeStamp1.equals((java.lang.Object)timeStamp9);
    java.lang.String str12 = timeStamp1.toString();
    java.lang.Object obj13 = null;
    boolean b14 = timeStamp1.equals(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1670570114929695654L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wed, Oct 11 2023 10:03:00.872 UTC"+ "'", str5.equals("Wed, Oct 11 2023 10:03:00.872 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Wed, Oct 11 2023 10:03:00.872"+ "'", str6.equals("Wed, Oct 11 2023 10:03:00.872"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "00000000.00000023"+ "'", str12.equals("00000000.00000023"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test225"); }


    java.lang.String str1 = TimeStamp.toString((-1670570115921833100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8d0f154.a4189374"+ "'", str1.equals("e8d0f154.a4189374"));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test226"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000061");
    java.lang.String str2 = timeStamp1.toDateString();
    long long3 = timeStamp1.ntpValue();
    java.util.Date date4 = timeStamp1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 97L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date4);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test227"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.0000000a");
    boolean b3 = timeStamp1.equals((java.lang.Object)(-1670570141244960277L));
    long long4 = timeStamp1.ntpValue();
    java.util.Date date5 = timeStamp1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date5);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test228"); }


    long long1 = TimeStamp.getTime(1697018575439L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978891118L);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test229"); }


    long long1 = TimeStamp.getTime((-1670570118000597271L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018580157L);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test230"); }


    TimeStamp timeStamp1 = new TimeStamp(2392296783L);
    long long2 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2392296783L);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test231"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    boolean b7 = timeStamp1.equals((java.lang.Object)0);
    java.lang.String str8 = timeStamp1.toString();
    long long9 = timeStamp1.getFraction();
    
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
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test232"); }


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
    long long14 = timeStamp1.getFraction();
    
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
    org.junit.Assert.assertTrue(long14 == 0L);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test233"); }


    TimeStamp timeStamp1 = new TimeStamp((long)'#');
    long long2 = timeStamp1.getTime();
    TimeStamp timeStamp3 = TimeStamp.getCurrentTime();
    long long4 = timeStamp3.ntpValue();
    java.lang.String str5 = timeStamp3.toUTCString();
    java.lang.String str6 = timeStamp3.toDateString();
    int i7 = timeStamp1.compareTo(timeStamp3);
    java.util.Date date8 = timeStamp3.getDate();
    TimeStamp timeStamp9 = new TimeStamp(date8);
    TimeStamp timeStamp10 = new TimeStamp(date8);
    java.lang.String str11 = timeStamp10.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1670570114719242257L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wed, Oct 11 2023 10:03:00.921 UTC"+ "'", str5.equals("Wed, Oct 11 2023 10:03:00.921 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Wed, Oct 11 2023 10:03:00.921"+ "'", str6.equals("Wed, Oct 11 2023 10:03:00.921"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "e8d0f154.ebc6a7ef"+ "'", str11.equals("e8d0f154.ebc6a7ef"));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test234"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.lang.String str2 = timeStamp1.toString();
    java.util.Date date3 = null;
    TimeStamp timeStamp4 = new TimeStamp(date3);
    long long5 = timeStamp4.getTime();
    int i6 = timeStamp1.compareTo(timeStamp4);
    TimeStamp timeStamp8 = TimeStamp.getNtpTime(10L);
    int i9 = timeStamp4.compareTo(timeStamp8);
    java.util.Date date10 = timeStamp4.getDate();
    TimeStamp timeStamp11 = new TimeStamp(date10);
    
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
    org.junit.Assert.assertNotNull(date10);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test235"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570127041503429L));
    long long2 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 1697018578052L);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test236"); }


    TimeStamp timeStamp1 = new TimeStamp(2085978496196L);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test237"); }


    TimeStamp timeStamp1 = new TimeStamp(0L);
    TimeStamp timeStamp2 = TimeStamp.getCurrentTime();
    long long3 = timeStamp2.ntpValue();
    java.lang.String str4 = timeStamp2.toUTCString();
    long long5 = timeStamp2.ntpValue();
    int i6 = timeStamp1.compareTo(timeStamp2);
    java.lang.String str7 = timeStamp1.toUTCString();
    long long8 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1670570114624752976L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Wed, Oct 11 2023 10:03:00.943 UTC"+ "'", str4.equals("Wed, Oct 11 2023 10:03:00.943 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1670570114624752976L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str7.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test238"); }


    TimeStamp timeStamp1 = new TimeStamp(2010044695L);
    boolean b3 = timeStamp1.equals((java.lang.Object)2085978496000L);
    java.lang.String str4 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Feb 07 2036 06:28:16.468"+ "'", str4.equals("Thu, Feb 07 2036 06:28:16.468"));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test239"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    long long4 = timeStamp1.getTime();
    boolean b6 = timeStamp1.equals((java.lang.Object)"ffffffff.ffffffff");
    java.lang.String str7 = timeStamp1.toUTCString();
    long long8 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str7.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test240"); }


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
    java.lang.String str12 = timeStamp1.toUTCString();
    java.lang.String str13 = timeStamp1.toUTCString();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str12.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str13.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test241"); }


    long long1 = TimeStamp.getTime(3783866187L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2085978496881L);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test242"); }


    TimeStamp timeStamp1 = new TimeStamp("0000018b.1e307bf9");
    java.lang.String str2 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:34:51.118 UTC"+ "'", str2.equals("Thu, Feb 07 2036 06:34:51.118 UTC"));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test243"); }


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
    java.lang.String str11 = timeStamp1.toDateString();
    java.lang.String str12 = timeStamp1.toString();
    
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str11.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "00000000.00000000"+ "'", str12.equals("00000000.00000000"));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test244"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570138101044216L));
    TimeStamp timeStamp3 = TimeStamp.getNtpTime(2085978496000L);
    java.util.Date date4 = timeStamp3.getDate();
    TimeStamp timeStamp5 = new TimeStamp(date4);
    TimeStamp timeStamp6 = new TimeStamp(date4);
    int i7 = timeStamp1.compareTo(timeStamp6);
    long long8 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 2085978495784L);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test245"); }


    TimeStamp timeStamp1 = new TimeStamp("83aa7e80.028f5c28");
    java.util.Date date2 = null;
    TimeStamp timeStamp3 = new TimeStamp(date2);
    TimeStamp timeStamp5 = new TimeStamp("");
    java.lang.String str6 = timeStamp5.toString();
    java.lang.String str7 = timeStamp5.toString();
    int i8 = timeStamp3.compareTo(timeStamp5);
    java.util.Date date9 = timeStamp5.getDate();
    TimeStamp timeStamp10 = new TimeStamp(date9);
    TimeStamp timeStamp11 = new TimeStamp(date9);
    TimeStamp timeStamp12 = new TimeStamp(date9);
    long long13 = timeStamp12.getSeconds();
    boolean b14 = timeStamp1.equals((java.lang.Object)timeStamp12);
    long long15 = timeStamp12.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "00000000.00000000"+ "'", str6.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00000000.00000000"+ "'", str7.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test246"); }


    TimeStamp timeStamp1 = new TimeStamp("");
    java.lang.String str2 = timeStamp1.toString();
    java.util.Date date3 = null;
    TimeStamp timeStamp4 = new TimeStamp(date3);
    long long5 = timeStamp4.getTime();
    int i6 = timeStamp1.compareTo(timeStamp4);
    long long7 = timeStamp1.ntpValue();
    java.lang.String str8 = timeStamp1.toUTCString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000.00000000"+ "'", str2.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str8.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test247"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.ffbe76c8");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test248"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570140678024594L));
    TimeStamp timeStamp3 = TimeStamp.getNtpTime((-1L));
    long long4 = timeStamp3.ntpValue();
    java.lang.String str5 = timeStamp3.toUTCString();
    boolean b7 = timeStamp3.equals((java.lang.Object)"ffffffff.ffffffff");
    java.util.Date date8 = null;
    TimeStamp timeStamp9 = new TimeStamp(date8);
    long long10 = timeStamp9.ntpValue();
    java.lang.String str11 = timeStamp9.toString();
    long long12 = timeStamp9.ntpValue();
    TimeStamp timeStamp13 = TimeStamp.getCurrentTime();
    long long14 = timeStamp13.ntpValue();
    java.util.Date date15 = null;
    TimeStamp timeStamp16 = new TimeStamp(date15);
    long long17 = timeStamp16.ntpValue();
    java.lang.String str18 = timeStamp16.toString();
    boolean b19 = timeStamp13.equals((java.lang.Object)timeStamp16);
    long long20 = timeStamp16.ntpValue();
    int i21 = timeStamp9.compareTo(timeStamp16);
    java.lang.String str22 = timeStamp16.toUTCString();
    int i23 = timeStamp3.compareTo(timeStamp16);
    java.lang.String str24 = timeStamp3.toDateString();
    java.lang.String str25 = timeStamp3.toUTCString();
    boolean b26 = timeStamp1.equals((java.lang.Object)str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-8959209420483561784L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wed, Dec 31 1969 23:59:59.999 UTC"+ "'", str5.equals("Wed, Dec 31 1969 23:59:59.999 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "00000000.00000000"+ "'", str11.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == (-1670570114414299579L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "00000000.00000000"+ "'", str18.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Thu, Feb 07 2036 06:28:16.000 UTC"+ "'", str22.equals("Thu, Feb 07 2036 06:28:16.000 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Wed, Dec 31 1969 23:59:59.999"+ "'", str24.equals("Wed, Dec 31 1969 23:59:59.999"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Wed, Dec 31 1969 23:59:59.999 UTC"+ "'", str25.equals("Wed, Dec 31 1969 23:59:59.999 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test249"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    long long4 = timeStamp1.getTime();
    long long5 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str3.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test250"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(1697018575106L);
    TimeStamp timeStamp3 = TimeStamp.parseNtpString("00000000.00000061");
    java.lang.String str4 = timeStamp3.toDateString();
    long long5 = timeStamp3.ntpValue();
    int i6 = timeStamp1.compareTo(timeStamp3);
    long long7 = timeStamp1.getFraction();
    TimeStamp timeStamp9 = new TimeStamp((long)(short)0);
    java.util.Date date10 = null;
    TimeStamp timeStamp11 = new TimeStamp(date10);
    TimeStamp timeStamp13 = new TimeStamp("");
    java.lang.String str14 = timeStamp13.toString();
    java.lang.String str15 = timeStamp13.toString();
    int i16 = timeStamp11.compareTo(timeStamp13);
    long long17 = timeStamp11.getSeconds();
    boolean b18 = timeStamp9.equals((java.lang.Object)timeStamp11);
    TimeStamp timeStamp20 = TimeStamp.parseNtpString("00000000.00000000");
    int i21 = timeStamp11.compareTo(timeStamp20);
    long long22 = timeStamp11.getTime();
    java.util.Date date23 = timeStamp11.getDate();
    boolean b24 = timeStamp1.equals((java.lang.Object)timeStamp11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str4.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 97L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 455266533L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "00000000.00000000"+ "'", str14.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "00000000.00000000"+ "'", str15.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test251"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570138964332643L));
    long long2 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 2085978495357L);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test252"); }


    long long1 = TimeStamp.getTime((-1670570139861980808L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018575067L);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test253"); }


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
    TimeStamp timeStamp11 = new TimeStamp(date8);
    
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

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test254"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000064");
    long long2 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 100L);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test255"); }


    TimeStamp timeStamp1 = new TimeStamp((long)'a');
    long long2 = timeStamp1.getSeconds();
    long long3 = timeStamp1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 2085978496000L);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test256"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)0);
    boolean b3 = timeStamp1.equals((java.lang.Object)"Thu, Jan 01 1970 00:00:00.052 UTC");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test257"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(1697018576427L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test258"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(2770253906L);
    TimeStamp timeStamp3 = new TimeStamp((-1670570141296499885L));
    long long4 = timeStamp3.getFraction();
    TimeStamp timeStamp6 = TimeStamp.parseNtpString("00000000.00000061");
    java.lang.String str7 = timeStamp6.toDateString();
    long long8 = timeStamp6.getSeconds();
    java.util.Date date9 = timeStamp6.getDate();
    java.lang.String str10 = timeStamp6.toDateString();
    long long11 = timeStamp6.ntpValue();
    boolean b12 = timeStamp3.equals((java.lang.Object)timeStamp6);
    int i13 = timeStamp1.compareTo(timeStamp3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 3148211027L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str7.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str10.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 97L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test259"); }


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
    java.util.Date date14 = null;
    TimeStamp timeStamp15 = new TimeStamp(date14);
    long long16 = timeStamp15.getTime();
    java.lang.String str17 = timeStamp15.toDateString();
    java.lang.String str18 = timeStamp15.toString();
    java.lang.String str19 = timeStamp15.toString();
    boolean b21 = timeStamp15.equals((java.lang.Object)0);
    boolean b22 = timeStamp3.equals((java.lang.Object)timeStamp15);
    long long23 = timeStamp15.getFraction();
    
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
    org.junit.Assert.assertTrue(long16 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str17.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "00000000.00000000"+ "'", str18.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "00000000.00000000"+ "'", str19.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 0L);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test260"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(short)10);
    java.lang.String str2 = timeStamp1.toDateString();
    long long3 = timeStamp1.ntpValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 10L);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test261"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570114414299579L));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test262"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000023");
    long long2 = timeStamp1.ntpValue();
    long long3 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 35L);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test263"); }


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
    java.lang.String str32 = timeStamp30.toDateString();
    
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
    org.junit.Assert.assertTrue(long8 == (-1670570114014867620L));
    
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
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str32.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test264"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((-1670570137469684024L));
    long long2 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 4294967295L);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test265"); }


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
    java.util.Date date13 = timeStamp1.getDate();
    TimeStamp timeStamp14 = new TimeStamp(date13);
    
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
    org.junit.Assert.assertNotNull(date13);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test266"); }


    TimeStamp timeStamp1 = new TimeStamp("00000000.00000023");
    java.lang.String str2 = timeStamp1.toDateString();
    java.lang.String str3 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str2.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000023"+ "'", str3.equals("00000000.00000023"));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test267"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = TimeStamp.parseNtpString("Thu, Feb 07 2036 06:34:51.118 UTC");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test268"); }


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
    TimeStamp timeStamp12 = new TimeStamp((long)'#');
    long long13 = timeStamp12.getTime();
    TimeStamp timeStamp14 = TimeStamp.getCurrentTime();
    long long15 = timeStamp14.ntpValue();
    java.lang.String str16 = timeStamp14.toUTCString();
    java.lang.String str17 = timeStamp14.toDateString();
    int i18 = timeStamp12.compareTo(timeStamp14);
    int i19 = timeStamp9.compareTo(timeStamp12);
    long long20 = timeStamp12.getTime();
    
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
    org.junit.Assert.assertTrue(long13 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == (-1670570113847363896L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Wed, Oct 11 2023 10:03:01.124 UTC"+ "'", str16.equals("Wed, Oct 11 2023 10:03:01.124 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Wed, Oct 11 2023 10:03:01.124"+ "'", str17.equals("Wed, Oct 11 2023 10:03:01.124"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 2085978496000L);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test269"); }


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
    TimeStamp timeStamp13 = TimeStamp.parseNtpString("");
    java.util.Date date14 = timeStamp13.getDate();
    TimeStamp timeStamp15 = new TimeStamp(date14);
    TimeStamp timeStamp16 = new TimeStamp(date14);
    long long17 = timeStamp16.getTime();
    TimeStamp timeStamp18 = TimeStamp.getCurrentTime();
    long long19 = timeStamp18.ntpValue();
    long long20 = timeStamp18.getFraction();
    int i21 = timeStamp16.compareTo(timeStamp18);
    boolean b22 = timeStamp3.equals((java.lang.Object)timeStamp18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1670570113761464550L));
    
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
    org.junit.Assert.assertNotNull(timeStamp13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1670570113757169583L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 622770257L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test270"); }


    // The following exception was thrown during execution in test generation
    try {
    TimeStamp timeStamp1 = new TimeStamp("Wed, Oct 11 2023 10:03:00.588 UTC");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test271"); }


    java.lang.String str1 = TimeStamp.toString((-8959209420436317144L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "83aa7e80.028f5c28"+ "'", str1.equals("83aa7e80.028f5c28"));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test272"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(short)0);
    boolean b3 = timeStamp1.equals((java.lang.Object)false);
    java.lang.String str4 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str4.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test273"); }


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
    java.util.Date date25 = null;
    TimeStamp timeStamp26 = new TimeStamp(date25);
    long long27 = timeStamp26.getTime();
    java.lang.String str28 = timeStamp26.toDateString();
    java.util.Date date29 = null;
    TimeStamp timeStamp30 = new TimeStamp(date29);
    TimeStamp timeStamp32 = new TimeStamp("");
    java.lang.String str33 = timeStamp32.toString();
    java.lang.String str34 = timeStamp32.toString();
    int i35 = timeStamp30.compareTo(timeStamp32);
    java.util.Date date36 = null;
    TimeStamp timeStamp37 = new TimeStamp(date36);
    long long38 = timeStamp37.getTime();
    java.lang.String str39 = timeStamp37.toDateString();
    java.lang.String str40 = timeStamp37.toString();
    boolean b42 = timeStamp37.equals((java.lang.Object)100.0f);
    int i43 = timeStamp30.compareTo(timeStamp37);
    java.util.Date date44 = null;
    TimeStamp timeStamp45 = new TimeStamp(date44);
    long long46 = timeStamp45.getTime();
    java.lang.String str47 = timeStamp45.toDateString();
    java.lang.String str48 = timeStamp45.toString();
    java.lang.String str49 = timeStamp45.toString();
    boolean b51 = timeStamp45.equals((java.lang.Object)0);
    java.lang.String str52 = timeStamp45.toString();
    int i53 = timeStamp30.compareTo(timeStamp45);
    int i54 = timeStamp26.compareTo(timeStamp30);
    boolean b55 = timeStamp16.equals((java.lang.Object)timeStamp30);
    java.lang.String str56 = timeStamp30.toDateString();
    
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
    org.junit.Assert.assertTrue(long27 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str28.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "00000000.00000000"+ "'", str33.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "00000000.00000000"+ "'", str34.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long38 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str39.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "00000000.00000000"+ "'", str40.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long46 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str47.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "00000000.00000000"+ "'", str48.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "00000000.00000000"+ "'", str49.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "00000000.00000000"+ "'", str52.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str56.equals("Thu, Feb 07 2036 06:28:16.000"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test274"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime((long)(short)-1);
    long long2 = timeStamp1.getFraction();
    java.util.Date date3 = timeStamp1.getDate();
    long long4 = timeStamp1.getSeconds();
    long long5 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 4290672328L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 2208988799L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 4290672328L);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test275"); }


    TimeStamp timeStamp1 = new TimeStamp((-1670570139720246887L));
    java.lang.String str2 = timeStamp1.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Wed, Oct 11 2023 10:02:55.100"+ "'", str2.equals("Wed, Oct 11 2023 10:02:55.100"));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test276"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("0000018b.1e307934");
    java.lang.String str2 = timeStamp1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0000018b.1e307934"+ "'", str2.equals("0000018b.1e307934"));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test277"); }


    long long1 = TimeStamp.getTime((-1670570118026367075L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1697018580151L);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test278"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    long long5 = timeStamp1.ntpValue();
    TimeStamp timeStamp7 = new TimeStamp((long)'#');
    long long8 = timeStamp7.getTime();
    int i9 = timeStamp1.compareTo(timeStamp7);
    long long10 = timeStamp7.getSeconds();
    
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

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test279"); }


    TimeStamp timeStamp1 = new TimeStamp((long)(-1));
    long long2 = timeStamp1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 4294967295L);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test280"); }


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
    TimeStamp timeStamp13 = TimeStamp.getCurrentTime();
    long long14 = timeStamp13.ntpValue();
    java.lang.String str15 = timeStamp13.toUTCString();
    long long16 = timeStamp13.getFraction();
    long long17 = timeStamp13.getTime();
    java.util.Date date18 = timeStamp13.getDate();
    java.util.Date date19 = timeStamp13.getDate();
    TimeStamp timeStamp20 = new TimeStamp(date19);
    TimeStamp timeStamp21 = new TimeStamp(date19);
    long long22 = timeStamp21.getSeconds();
    long long23 = timeStamp21.getSeconds();
    boolean b24 = timeStamp4.equals((java.lang.Object)timeStamp21);
    java.lang.String str25 = timeStamp4.toDateString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000023"+ "'", str3.equals("00000000.00000023"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1670570113314787951L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00000000.00000000"+ "'", str9.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1065151889L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == (-1670570113314787951L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Wed, Oct 11 2023 10:03:01.248 UTC"+ "'", str15.equals("Wed, Oct 11 2023 10:03:01.248 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 1065151889L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 1697018581248L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 3906007381L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 3906007381L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Wed, Oct 11 2023 10:03:01.248"+ "'", str25.equals("Wed, Oct 11 2023 10:03:01.248"));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test281"); }


    TimeStamp timeStamp1 = TimeStamp.parseNtpString("00000000.00000064");
    long long2 = timeStamp1.getFraction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 100L);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test282"); }


    TimeStamp timeStamp1 = TimeStamp.getNtpTime(1697018574767L);
    java.lang.String str2 = timeStamp1.toDateString();
    java.lang.String str3 = timeStamp1.toUTCString();
    TimeStamp timeStamp5 = new TimeStamp((long)(short)10);
    TimeStamp timeStamp7 = new TimeStamp((long)(short)0);
    boolean b9 = timeStamp7.equals((java.lang.Object)false);
    boolean b10 = timeStamp5.equals((java.lang.Object)timeStamp7);
    boolean b11 = timeStamp1.equals((java.lang.Object)timeStamp7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Wed, Oct 11 2023 10:02:54.767"+ "'", str2.equals("Wed, Oct 11 2023 10:02:54.767"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Wed, Oct 11 2023 10:02:54.767 UTC"+ "'", str3.equals("Wed, Oct 11 2023 10:02:54.767 UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test283"); }


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
    TimeStamp timeStamp17 = new TimeStamp(date16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00000000.00000023"+ "'", str3.equals("00000000.00000023"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1670570113164464096L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00000000.00000000"+ "'", str9.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1215475744L);
    
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

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test284"); }


    TimeStamp timeStamp1 = new TimeStamp(2085978496745L);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test285"); }


    TimeStamp timeStamp1 = new TimeStamp(2208988800L);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test286"); }


    java.util.Date date0 = null;
    TimeStamp timeStamp1 = new TimeStamp(date0);
    long long2 = timeStamp1.getTime();
    java.lang.String str3 = timeStamp1.toDateString();
    java.lang.String str4 = timeStamp1.toString();
    java.lang.String str5 = timeStamp1.toString();
    long long6 = timeStamp1.getSeconds();
    java.util.Date date7 = timeStamp1.getDate();
    TimeStamp timeStamp8 = new TimeStamp(date7);
    TimeStamp timeStamp10 = TimeStamp.getNtpTime((-1670570136614985532L));
    TimeStamp timeStamp12 = TimeStamp.getNtpTime((-1L));
    java.util.Date date13 = null;
    TimeStamp timeStamp14 = new TimeStamp(date13);
    long long15 = timeStamp14.getTime();
    java.lang.String str16 = timeStamp14.toDateString();
    long long17 = timeStamp14.getTime();
    java.lang.String str18 = timeStamp14.toString();
    int i19 = timeStamp12.compareTo(timeStamp14);
    java.util.Date date20 = timeStamp14.getDate();
    TimeStamp timeStamp21 = new TimeStamp(date20);
    TimeStamp timeStamp22 = new TimeStamp(date20);
    TimeStamp timeStamp23 = new TimeStamp(date20);
    boolean b24 = timeStamp10.equals((java.lang.Object)date20);
    TimeStamp timeStamp26 = TimeStamp.parseNtpString("00000000.00000061");
    java.lang.String str27 = timeStamp26.toDateString();
    boolean b28 = timeStamp10.equals((java.lang.Object)str27);
    boolean b29 = timeStamp8.equals((java.lang.Object)timeStamp10);
    
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
    org.junit.Assert.assertNotNull(timeStamp10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str16.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 2085978496000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "00000000.00000000"+ "'", str18.equals("00000000.00000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeStamp26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Thu, Feb 07 2036 06:28:16.000"+ "'", str27.equals("Thu, Feb 07 2036 06:28:16.000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

}
