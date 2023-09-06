
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test001"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getEmail();
    java.lang.String str4 = vCardBean0.getMiddleName();
    java.lang.String str5 = vCardBean0.getTitle();
    java.lang.String str6 = vCardBean0.getFirstName();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str9 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test002"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    vCardBean0.setEmail("hi!");
    vCardBean0.setEmail("hi!");
    java.lang.String str8 = vCardBean0.getOrganization();
    java.lang.String str9 = vCardBean0.getFirstName();
    vCardBean0.setLastName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setVCard("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str16 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test003"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getTitle();
    vCardBean0.setVCard("");
    java.lang.String str6 = vCardBean0.getFormattedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test004"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getEmail();
    vCardBean0.setPhone("hi!");
    vCardBean0.setFax("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test005"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    vCardBean0.setOrganization("");
    boolean b9 = vCardBean0.isValidVCard();
    vCardBean0.setTitle("hi!");
    vCardBean0.setOrganization("");
    vCardBean0.setPhone("");
    java.lang.String str16 = vCardBean0.getTitle();
    java.lang.String str17 = vCardBean0.toString();
    java.lang.String str18 = vCardBean0.getMiddleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test006"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    vCardBean0.setMiddleName("");
    vCardBean0.setTitle("hi!");
    java.lang.String str8 = vCardBean0.getMiddleName();
    vCardBean0.setPhone("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setFirstName("");
    boolean b13 = vCardBean0.isValidVCard();
    vCardBean0.setFirstName("hi!");
    boolean b16 = vCardBean0.isValidVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test007"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getEmail();
    java.lang.String str6 = vCardBean0.getFax();
    vCardBean0.setFax("");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setTitle("");
    java.lang.String str13 = vCardBean0.getVCard();
    java.lang.String str14 = vCardBean0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test008"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFirstName("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    java.lang.String str6 = vCardBean0.getOrganization();
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getMiddleName();
    java.lang.String str9 = vCardBean0.getEmail();
    java.lang.String str10 = vCardBean0.getFormattedName();
    vCardBean0.setTitle("BEGIN:VCARD\nFN:hi!\nN:;;BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD;\nTITLE:hi!\nORG:\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str13 = vCardBean0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test009"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getVCard();
    vCardBean0.setLastName("");
    vCardBean0.setFax("hi!");
    vCardBean0.setPhone("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setTitle("");
    vCardBean0.setVCard("");
    java.lang.String str16 = vCardBean0.getFax();
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    java.lang.String str19 = vCardBean0.getFax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test010"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getTitle();
    java.lang.String str9 = vCardBean0.getLastName();
    java.lang.String str10 = vCardBean0.getTitle();
    vCardBean0.setVCard("hi!");
    java.lang.String str13 = vCardBean0.getLastName();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str16 = vCardBean0.getLastName();
    java.lang.String str17 = vCardBean0.getOrganization();
    vCardBean0.setLastName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=FAX:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test011"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.toString();
    java.lang.String str4 = vCardBean0.getTitle();
    vCardBean0.setOrganization("");
    vCardBean0.setLastName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    boolean b9 = vCardBean0.isValidVCard();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test012"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getTitle();
    vCardBean0.setTitle("hi!");
    java.lang.String str6 = vCardBean0.getPhone();
    vCardBean0.setLastName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str9 = vCardBean0.getFirstName();
    boolean b10 = vCardBean0.isValidVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test013"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    java.lang.String str4 = vCardBean0.toString();
    java.lang.String str5 = vCardBean0.getFormattedName();
    java.lang.String str6 = vCardBean0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test014"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    java.lang.String str6 = vCardBean0.getTitle();
    java.lang.String str7 = vCardBean0.getMiddleName();
    vCardBean0.setPhone("");
    java.lang.String str10 = vCardBean0.getEmail();
    java.lang.String str11 = vCardBean0.getMiddleName();
    vCardBean0.setOrganization("");
    java.lang.String str14 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test015"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.toString();
    vCardBean0.setVCard("");
    java.lang.String str10 = vCardBean0.getFormattedName();
    vCardBean0.setFirstName("");
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str17 = vCardBean0.getPhone();
    java.lang.String str18 = vCardBean0.getMiddleName();
    java.lang.String str19 = vCardBean0.getFirstName();
    java.lang.String str20 = vCardBean0.getFax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD"+ "'", str19.equals("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test016"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    boolean b5 = vCardBean0.isValidVCard();
    vCardBean0.setTitle("hi!");
    java.lang.String str8 = vCardBean0.getOrganization();
    java.lang.String str9 = vCardBean0.getEmail();
    java.lang.String str10 = vCardBean0.getVCard();
    boolean b11 = vCardBean0.isValidVCard();
    java.lang.String str12 = vCardBean0.getEmail();
    vCardBean0.setFirstName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
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

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test017"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    vCardBean0.setOrganization("");
    java.lang.String str9 = vCardBean0.getFirstName();
    java.lang.String str10 = vCardBean0.getVCard();
    java.lang.String str11 = vCardBean0.getMiddleName();
    vCardBean0.setVCard("");
    vCardBean0.setVCard("hi!");
    vCardBean0.setPhone("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str18 = vCardBean0.getFormattedName();
    vCardBean0.setVCard("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test018"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str6 = vCardBean0.getLastName();
    java.lang.String str7 = vCardBean0.getFormattedName();
    java.lang.String str8 = vCardBean0.getEmail();
    java.lang.String str9 = vCardBean0.toString();
    java.lang.String str10 = vCardBean0.getFirstName();
    vCardBean0.setFormattedName("");
    vCardBean0.setPhone("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setOrganization("");
    vCardBean0.setFormattedName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test019"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getVCard();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str10 = vCardBean0.toString();
    vCardBean0.setEmail("hi!");
    java.lang.String str13 = vCardBean0.getVCard();
    java.lang.String str14 = vCardBean0.getLastName();
    java.lang.String str15 = vCardBean0.getFax();
    java.lang.String str16 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test020"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getOrganization();
    java.lang.String str7 = vCardBean0.getMiddleName();
    java.lang.String str8 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str13 = vCardBean0.getPhone();
    vCardBean0.setPhone("hi!");
    java.lang.String str16 = vCardBean0.getEmail();
    vCardBean0.setFax("BEGIN:VCARD\nFN:hi!\nN:;;BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD;\nTITLE:hi!\nORG:\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str19 = vCardBean0.getFormattedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test021"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.toString();
    vCardBean0.setVCard("");
    java.lang.String str10 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str15 = vCardBean0.getFormattedName();
    java.lang.String str16 = vCardBean0.getFirstName();
    boolean b17 = vCardBean0.isValidVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD"+ "'", str15.equals("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test022"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getTitle();
    java.lang.String str9 = vCardBean0.getLastName();
    java.lang.String str10 = vCardBean0.getOrganization();
    java.lang.String str11 = vCardBean0.getFax();
    vCardBean0.setFormattedName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
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
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test023"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getEmail();
    vCardBean0.setPhone("");
    boolean b6 = vCardBean0.isValidVCard();
    java.lang.String str7 = vCardBean0.getMiddleName();
    java.lang.String str8 = vCardBean0.getFax();
    java.lang.String str9 = vCardBean0.getEmail();
    vCardBean0.setPhone("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test024"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getFax();
    java.lang.String str6 = vCardBean0.getFax();
    vCardBean0.setFirstName("");
    java.lang.String str9 = vCardBean0.getVCard();
    boolean b10 = vCardBean0.isValidVCard();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setOrganization("");
    vCardBean0.setTitle("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=FAX:hi!\nEND:VCARD");
    vCardBean0.setFormattedName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
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
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test025"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    java.lang.String str6 = vCardBean0.getPhone();
    vCardBean0.setMiddleName("");
    java.lang.String str9 = vCardBean0.getVCard();
    java.lang.String str10 = vCardBean0.getLastName();
    vCardBean0.setPhone("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str13 = vCardBean0.getFax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test026"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getMiddleName();
    boolean b5 = vCardBean0.isValidVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test027"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getEmail();
    java.lang.String str9 = vCardBean0.getEmail();
    java.lang.String str10 = vCardBean0.getFirstName();
    java.lang.String str11 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test028"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str8 = vCardBean0.toString();
    java.lang.String str9 = vCardBean0.getFormattedName();
    java.lang.String str10 = vCardBean0.getFirstName();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str13 = vCardBean0.getOrganization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test029"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    vCardBean0.setVCard("");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setTitle("hi!");
    java.lang.String str12 = vCardBean0.getFax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test030"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFax();
    vCardBean0.setEmail("hi!");
    vCardBean0.setOrganization("");
    java.lang.String str8 = vCardBean0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test031"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setFax("");
    vCardBean0.setFax("hi!");
    java.lang.String str6 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str11 = vCardBean0.getOrganization();
    java.lang.String str12 = vCardBean0.getMiddleName();
    java.lang.String str13 = vCardBean0.getEmail();
    vCardBean0.setPhone("hi!");
    vCardBean0.setOrganization("");
    java.lang.String str18 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test032"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    java.lang.String str4 = vCardBean0.getMiddleName();
    java.lang.String str5 = vCardBean0.getFax();
    vCardBean0.setEmail("hi!");
    boolean b8 = vCardBean0.isValidVCard();
    vCardBean0.setFax("");
    java.lang.String str11 = vCardBean0.toString();
    java.lang.String str12 = vCardBean0.getTitle();
    vCardBean0.setOrganization("");
    vCardBean0.setVCard("");
    java.lang.String str17 = vCardBean0.getMiddleName();
    vCardBean0.setVCard("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test033"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getTitle();
    java.lang.String str5 = vCardBean0.getTitle();
    java.lang.String str6 = vCardBean0.getMiddleName();
    java.lang.String str7 = vCardBean0.getFirstName();
    java.lang.String str8 = vCardBean0.toString();
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str11 = vCardBean0.getMiddleName();
    java.lang.String str12 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD"+ "'", str11.equals("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test034"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    vCardBean0.setFax("");
    java.lang.String str6 = vCardBean0.getFax();
    java.lang.String str7 = vCardBean0.getOrganization();
    java.lang.String str8 = vCardBean0.getLastName();
    vCardBean0.setEmail("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setEmail("hi!");
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=FAX:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test035"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    java.lang.String str4 = vCardBean0.toString();
    java.lang.String str5 = vCardBean0.getOrganization();
    vCardBean0.setOrganization("");
    vCardBean0.setFormattedName("");
    vCardBean0.setMiddleName("");
    java.lang.String str12 = vCardBean0.getTitle();
    java.lang.String str13 = vCardBean0.getFirstName();
    java.lang.String str14 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test036"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getFirstName();
    java.lang.String str6 = vCardBean0.getTitle();
    vCardBean0.setLastName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setVCard("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=FAX:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test037"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setFax("");
    vCardBean0.setFax("hi!");
    java.lang.String str6 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    java.lang.String str9 = vCardBean0.getPhone();
    vCardBean0.setOrganization("");
    vCardBean0.setEmail("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=FAX:hi!\nEND:VCARD");
    vCardBean0.setVCard("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test038"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getVCard();
    vCardBean0.setLastName("");
    vCardBean0.setFax("hi!");
    vCardBean0.setPhone("");
    java.lang.String str10 = vCardBean0.getMiddleName();
    java.lang.String str11 = vCardBean0.getTitle();
    vCardBean0.setFax("");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setEmail("hi!");
    vCardBean0.setPhone("hi!");
    java.lang.String str20 = vCardBean0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test039"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getOrganization();
    java.lang.String str7 = vCardBean0.getMiddleName();
    java.lang.String str8 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str13 = vCardBean0.getPhone();
    vCardBean0.setTitle("hi!");
    java.lang.String str16 = vCardBean0.getPhone();
    java.lang.String str17 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test040"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    boolean b7 = vCardBean0.isValidVCard();
    vCardBean0.setEmail("");
    java.lang.String str10 = vCardBean0.getVCard();
    vCardBean0.setFax("");
    java.lang.String str13 = vCardBean0.getMiddleName();
    java.lang.String str14 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test041"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFax();
    java.lang.String str4 = vCardBean0.getMiddleName();
    java.lang.String str5 = vCardBean0.getMiddleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test042"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setVCard("");
    vCardBean0.setVCard("");
    vCardBean0.setVCard("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str9 = vCardBean0.getOrganization();
    vCardBean0.setFirstName("");
    java.lang.String str12 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test043"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.getFax();
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setPhone("");
    vCardBean0.setFax("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test044"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getFirstName();
    java.lang.String str9 = vCardBean0.getFirstName();
    vCardBean0.setLastName("");
    java.lang.String str12 = vCardBean0.getVCard();
    java.lang.String str13 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test045"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getTitle();
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setFax("hi!");
    java.lang.String str13 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test046"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getFormattedName();
    vCardBean0.setOrganization("hi!");
    vCardBean0.setFax("");
    vCardBean0.setLastName("");
    boolean b10 = vCardBean0.isValidVCard();
    vCardBean0.setLastName("hi!");
    java.lang.String str13 = vCardBean0.getEmail();
    vCardBean0.setVCard("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setFormattedName("");
    vCardBean0.setVCard("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test047"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getFax();
    java.lang.String str6 = vCardBean0.getEmail();
    java.lang.String str7 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test048"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setEmail("hi!");
    vCardBean0.setFax("");
    vCardBean0.setEmail("");
    vCardBean0.setMiddleName("");
    boolean b11 = vCardBean0.isValidVCard();
    vCardBean0.setEmail("hi!");
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setEmail("");
    java.lang.String str18 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test049"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getVCard();
    vCardBean0.setFax("");
    vCardBean0.setPhone("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setFormattedName("");
    vCardBean0.setFax("");
    vCardBean0.setFirstName("hi!");
    java.lang.String str18 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test050"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str6 = vCardBean0.getLastName();
    java.lang.String str7 = vCardBean0.getFormattedName();
    vCardBean0.setFax("hi!");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test051"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getTitle();
    java.lang.String str5 = vCardBean0.getOrganization();
    boolean b6 = vCardBean0.isValidVCard();
    
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
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test052"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getEmail();
    vCardBean0.setVCard("hi!");
    java.lang.String str11 = vCardBean0.toString();
    java.lang.String str12 = vCardBean0.getMiddleName();
    vCardBean0.setFirstName("");
    java.lang.String str15 = vCardBean0.getEmail();
    java.lang.String str16 = vCardBean0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test053"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setFormattedName("");
    java.lang.String str7 = vCardBean0.getFormattedName();
    vCardBean0.setFormattedName("");
    vCardBean0.setTitle("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test054"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    java.lang.String str7 = vCardBean0.getFormattedName();
    vCardBean0.setFirstName("hi!");
    vCardBean0.setFormattedName("hi!");
    java.lang.String str12 = vCardBean0.getEmail();
    java.lang.String str13 = vCardBean0.getVCard();
    vCardBean0.setOrganization("");
    java.lang.String str16 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test055"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getFormattedName();
    vCardBean0.setOrganization("hi!");
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setLastName("hi!");
    vCardBean0.setLastName("");
    java.lang.String str11 = vCardBean0.getFormattedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test056"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    java.lang.String str6 = vCardBean0.getPhone();
    vCardBean0.setVCard("hi!");
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setFirstName("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    vCardBean0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test057"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.toString();
    vCardBean0.setVCard("");
    java.lang.String str10 = vCardBean0.getFormattedName();
    vCardBean0.setFirstName("hi!");
    vCardBean0.setOrganization("");
    vCardBean0.setVCard("");
    vCardBean0.setEmail("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setMiddleName("");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    vCardBean0.setFirstName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test058"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str6 = vCardBean0.getLastName();
    java.lang.String str7 = vCardBean0.getFormattedName();
    java.lang.String str8 = vCardBean0.getEmail();
    java.lang.String str9 = vCardBean0.toString();
    vCardBean0.setMiddleName("");
    vCardBean0.setVCard("hi!");
    vCardBean0.setEmail("hi!");
    vCardBean0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test059"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setVCard("hi!");
    vCardBean0.setTitle("hi!");
    vCardBean0.setLastName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str11 = vCardBean0.getFirstName();
    vCardBean0.setTitle("");
    vCardBean0.setTitle("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test060"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    java.lang.String str6 = vCardBean0.getEmail();
    boolean b7 = vCardBean0.isValidVCard();
    vCardBean0.setOrganization("");
    vCardBean0.setFax("");
    vCardBean0.setLastName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setVCard("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test061"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getPhone();
    java.lang.String str4 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test062"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getEmail();
    java.lang.String str4 = vCardBean0.getOrganization();
    java.lang.String str5 = vCardBean0.toString();
    vCardBean0.setOrganization("hi!");
    vCardBean0.setFax("");
    vCardBean0.setFormattedName("");
    java.lang.String str12 = vCardBean0.getLastName();
    vCardBean0.setEmail("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    boolean b15 = vCardBean0.isValidVCard();
    vCardBean0.setEmail("hi!");
    java.lang.String str18 = vCardBean0.getFax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test063"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.getFirstName();
    java.lang.String str9 = vCardBean0.getFax();
    vCardBean0.setPhone("");
    vCardBean0.setPhone("");
    vCardBean0.setPhone("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str16 = vCardBean0.getFax();
    java.lang.String str17 = vCardBean0.getFax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test064"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setEmail("hi!");
    java.lang.String str5 = vCardBean0.getFormattedName();
    java.lang.String str6 = vCardBean0.getVCard();
    java.lang.String str7 = vCardBean0.getFirstName();
    java.lang.String str8 = vCardBean0.toString();
    java.lang.String str9 = vCardBean0.getPhone();
    java.lang.String str10 = vCardBean0.getEmail();
    boolean b11 = vCardBean0.isValidVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test065"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getFormattedName();
    vCardBean0.setOrganization("hi!");
    vCardBean0.setFax("");
    java.lang.String str8 = vCardBean0.getFirstName();
    java.lang.String str9 = vCardBean0.getFirstName();
    java.lang.String str10 = vCardBean0.getOrganization();
    boolean b11 = vCardBean0.isValidVCard();
    java.lang.String str12 = vCardBean0.getEmail();
    vCardBean0.setVCard("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str15 = vCardBean0.getOrganization();
    vCardBean0.setMiddleName("");
    vCardBean0.setFax("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test066"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str6 = vCardBean0.getLastName();
    vCardBean0.setFirstName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str9 = vCardBean0.getTitle();
    vCardBean0.setLastName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test067"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    java.lang.String str2 = vCardBean0.getPhone();
    java.lang.String str3 = vCardBean0.getMiddleName();
    vCardBean0.setTitle("");
    java.lang.String str6 = vCardBean0.getLastName();
    java.lang.String str7 = vCardBean0.getOrganization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test068"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    java.lang.String str4 = vCardBean0.toString();
    java.lang.String str5 = vCardBean0.getOrganization();
    vCardBean0.setOrganization("");
    vCardBean0.setFormattedName("");
    vCardBean0.setMiddleName("");
    vCardBean0.setFax("hi!");
    java.lang.String str14 = vCardBean0.getPhone();
    vCardBean0.setTitle("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test069"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getEmail();
    java.lang.String str4 = vCardBean0.getOrganization();
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    vCardBean0.setFirstName("hi!");
    java.lang.String str10 = vCardBean0.getVCard();
    java.lang.String str11 = vCardBean0.getOrganization();
    java.lang.String str12 = vCardBean0.getFirstName();
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str15 = vCardBean0.getOrganization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD"+ "'", str15.equals("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test070"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    vCardBean0.setEmail("hi!");
    java.lang.String str6 = vCardBean0.getEmail();
    vCardBean0.setLastName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setEmail("");
    vCardBean0.setVCard("hi!");
    java.lang.String str13 = vCardBean0.getEmail();
    java.lang.String str14 = vCardBean0.getFax();
    vCardBean0.setFirstName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test071"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    vCardBean0.setTitle("");
    vCardBean0.setVCard("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test072"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getEmail();
    java.lang.String str6 = vCardBean0.getFax();
    boolean b7 = vCardBean0.isValidVCard();
    java.lang.String str8 = vCardBean0.getFormattedName();
    java.lang.String str9 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test073"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.getFax();
    boolean b9 = vCardBean0.isValidVCard();
    java.lang.String str10 = vCardBean0.getLastName();
    java.lang.String str11 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test074"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getTitle();
    vCardBean0.setTitle("hi!");
    java.lang.String str6 = vCardBean0.getTitle();
    vCardBean0.setTitle("");
    java.lang.String str9 = vCardBean0.toString();
    vCardBean0.setFax("BEGIN:VCARD\nFN:hi!\nN:;;BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD;\nTITLE:hi!\nORG:\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test075"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setLastName("hi!");
    java.lang.String str6 = vCardBean0.getEmail();
    vCardBean0.setFax("hi!");
    java.lang.String str9 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test076"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    java.lang.String str7 = vCardBean0.getFormattedName();
    java.lang.String str8 = vCardBean0.getMiddleName();
    vCardBean0.setFax("hi!");
    java.lang.String str11 = vCardBean0.getLastName();
    java.lang.String str12 = vCardBean0.getEmail();
    vCardBean0.setPhone("hi!");
    vCardBean0.setEmail("BEGIN:VCARD\nFN:hi!\nN:;;BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD;\nTITLE:hi!\nORG:\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test077"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setFax("");
    vCardBean0.setFax("hi!");
    java.lang.String str6 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    java.lang.String str9 = vCardBean0.getPhone();
    vCardBean0.setOrganization("");
    vCardBean0.setEmail("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=FAX:hi!\nEND:VCARD");
    vCardBean0.setTitle("BEGIN:VCARD\nFN:hi!\nN:;;BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD;\nTITLE:hi!\nORG:\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test078"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getEmail();
    java.lang.String str4 = vCardBean0.getOrganization();
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    vCardBean0.setFax("hi!");
    java.lang.String str10 = vCardBean0.toString();
    vCardBean0.setFax("hi!");
    vCardBean0.setEmail("hi!");
    java.lang.String str15 = vCardBean0.getLastName();
    java.lang.String str16 = vCardBean0.getFormattedName();
    java.lang.String str17 = vCardBean0.getFirstName();
    vCardBean0.setFax("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test079"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    java.lang.String str6 = vCardBean0.getTitle();
    java.lang.String str7 = vCardBean0.getVCard();
    java.lang.String str8 = vCardBean0.getFax();
    vCardBean0.setVCard("");
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test080"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setFax("");
    vCardBean0.setFax("hi!");
    vCardBean0.setOrganization("hi!");
    java.lang.String str8 = vCardBean0.toString();
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    boolean b11 = vCardBean0.isValidVCard();
    vCardBean0.setLastName("");
    java.lang.String str14 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test081"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setOrganization("");
    vCardBean0.setTitle("hi!");
    java.lang.String str9 = vCardBean0.getMiddleName();
    java.lang.String str10 = vCardBean0.getEmail();
    java.lang.String str11 = vCardBean0.getVCard();
    vCardBean0.setVCard("");
    java.lang.String str14 = vCardBean0.getOrganization();
    vCardBean0.setFax("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test082"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setOrganization("hi!");
    vCardBean0.setVCard("");
    vCardBean0.setPhone("hi!");
    java.lang.String str8 = vCardBean0.getFax();
    vCardBean0.setPhone("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str13 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test083"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    java.lang.String str7 = vCardBean0.getTitle();
    boolean b8 = vCardBean0.isValidVCard();
    vCardBean0.setFirstName("hi!");
    vCardBean0.setOrganization("hi!");
    java.lang.String str13 = vCardBean0.getMiddleName();
    java.lang.String str14 = vCardBean0.getFormattedName();
    java.lang.String str15 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test084"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getEmail();
    java.lang.String str9 = vCardBean0.getMiddleName();
    vCardBean0.setPhone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test085"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getVCard();
    vCardBean0.setLastName("");
    vCardBean0.setFax("hi!");
    vCardBean0.setPhone("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setTitle("");
    vCardBean0.setEmail("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setLastName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test086"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getOrganization();
    java.lang.String str7 = vCardBean0.getMiddleName();
    java.lang.String str8 = vCardBean0.getEmail();
    java.lang.String str9 = vCardBean0.getMiddleName();
    vCardBean0.setTitle("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setVCard("hi!");
    java.lang.String str14 = vCardBean0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test087"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    java.lang.String str6 = vCardBean0.getVCard();
    java.lang.String str7 = vCardBean0.getEmail();
    java.lang.String str8 = vCardBean0.getMiddleName();
    vCardBean0.setMiddleName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test088"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getTitle();
    java.lang.String str9 = vCardBean0.getVCard();
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setTitle("hi!");
    vCardBean0.setPhone("hi!");
    boolean b16 = vCardBean0.isValidVCard();
    vCardBean0.setEmail("");
    vCardBean0.setFirstName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test089"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    vCardBean0.setOrganization("hi!");
    java.lang.String str6 = vCardBean0.getTitle();
    vCardBean0.setFirstName("");
    vCardBean0.setEmail("");
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setFax("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test090"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.toString();
    vCardBean0.setVCard("");
    java.lang.String str11 = vCardBean0.getOrganization();
    java.lang.String str12 = vCardBean0.getLastName();
    vCardBean0.setLastName("");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setLastName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test091"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setEmail("hi!");
    vCardBean0.setFax("");
    vCardBean0.setEmail("");
    vCardBean0.setMiddleName("");
    boolean b11 = vCardBean0.isValidVCard();
    vCardBean0.setFax("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setEmail("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=FAX:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test092"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getEmail();
    java.lang.String str4 = vCardBean0.getOrganization();
    java.lang.String str5 = vCardBean0.toString();
    vCardBean0.setOrganization("hi!");
    vCardBean0.setFax("");
    vCardBean0.setFax("BEGIN:VCARD\nFN:hi!\nN:;;BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD;\nTITLE:hi!\nORG:\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test093"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getFormattedName();
    vCardBean0.setOrganization("hi!");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test094"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    java.lang.String str4 = vCardBean0.toString();
    java.lang.String str5 = vCardBean0.getFirstName();
    vCardBean0.setEmail("hi!");
    vCardBean0.setLastName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test095"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setVCard("hi!");
    vCardBean0.setTitle("hi!");
    vCardBean0.setLastName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str11 = vCardBean0.getFirstName();
    vCardBean0.setTitle("");
    vCardBean0.setTitle("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str16 = vCardBean0.getTitle();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=FAX:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD"+ "'", str16.equals("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test096"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.toString();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("");
    java.lang.String str13 = vCardBean0.getEmail();
    vCardBean0.setVCard("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setEmail("BEGIN:VCARD\nFN:hi!\nN:;;BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD;\nTITLE:hi!\nORG:\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str18 = vCardBean0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test097"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    java.lang.String str4 = vCardBean0.toString();
    java.lang.String str5 = vCardBean0.getOrganization();
    vCardBean0.setOrganization("");
    vCardBean0.setFormattedName("");
    vCardBean0.setFormattedName("");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setTitle("");
    java.lang.String str16 = vCardBean0.getLastName();
    java.lang.String str17 = vCardBean0.getTitle();
    java.lang.String str18 = vCardBean0.getOrganization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test098"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    java.lang.String str6 = vCardBean0.getVCard();
    vCardBean0.setEmail("hi!");
    boolean b9 = vCardBean0.isValidVCard();
    vCardBean0.setTitle("hi!");
    java.lang.String str12 = vCardBean0.getPhone();
    vCardBean0.setPhone("");
    vCardBean0.setFax("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test099"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getVCard();
    vCardBean0.setLastName("");
    vCardBean0.setPhone("");
    vCardBean0.setEmail("");
    vCardBean0.setFax("");
    vCardBean0.setFax("");
    vCardBean0.setFax("BEGIN:VCARD\nFN:hi!\nN:;;BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD;\nTITLE:hi!\nORG:\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test100"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str6 = vCardBean0.getLastName();
    java.lang.String str7 = vCardBean0.getFormattedName();
    vCardBean0.setFax("hi!");
    java.lang.String str10 = vCardBean0.getFirstName();
    vCardBean0.setVCard("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test101"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getTitle();
    java.lang.String str9 = vCardBean0.getVCard();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str12 = vCardBean0.getFax();
    java.lang.String str13 = vCardBean0.getFax();
    java.lang.String str14 = vCardBean0.getMiddleName();
    java.lang.String str15 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test102"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setFormattedName("");
    java.lang.String str7 = vCardBean0.getEmail();
    java.lang.String str8 = vCardBean0.getMiddleName();
    java.lang.String str9 = vCardBean0.getOrganization();
    vCardBean0.setOrganization("");
    vCardBean0.setLastName("");
    vCardBean0.setEmail("");
    java.lang.String str16 = vCardBean0.getEmail();
    vCardBean0.setFax("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test103"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getTitle();
    java.lang.String str9 = vCardBean0.getLastName();
    java.lang.String str10 = vCardBean0.getOrganization();
    vCardBean0.setEmail("hi!");
    vCardBean0.setMiddleName("hi!");
    boolean b15 = vCardBean0.isValidVCard();
    java.lang.String str16 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test104"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    java.lang.String str7 = vCardBean0.getMiddleName();
    vCardBean0.setOrganization("hi!");
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test105"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getVCard();
    boolean b8 = vCardBean0.isValidVCard();
    vCardBean0.setLastName("");
    vCardBean0.setPhone("hi!");
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str15 = vCardBean0.getFax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test106"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setFormattedName("");
    vCardBean0.setPhone("");
    java.lang.String str9 = vCardBean0.getLastName();
    java.lang.String str10 = vCardBean0.getFax();
    java.lang.String str11 = vCardBean0.getFirstName();
    java.lang.String str12 = vCardBean0.getOrganization();
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setOrganization("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test107"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.toString();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("");
    java.lang.String str13 = vCardBean0.getTitle();
    vCardBean0.setTitle("BEGIN:VCARD\nFN:hi!\nN:;;BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD;\nTITLE:hi!\nORG:\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test108"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getFormattedName();
    vCardBean0.setOrganization("hi!");
    vCardBean0.setFax("");
    java.lang.String str8 = vCardBean0.getFirstName();
    java.lang.String str9 = vCardBean0.getFirstName();
    java.lang.String str10 = vCardBean0.getOrganization();
    boolean b11 = vCardBean0.isValidVCard();
    java.lang.String str12 = vCardBean0.getEmail();
    vCardBean0.setVCard("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str15 = vCardBean0.getOrganization();
    vCardBean0.setMiddleName("");
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test109"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    vCardBean0.setOrganization("");
    boolean b9 = vCardBean0.isValidVCard();
    vCardBean0.setTitle("hi!");
    java.lang.String str12 = vCardBean0.getPhone();
    vCardBean0.setFax("hi!");
    java.lang.String str15 = vCardBean0.getVCard();
    java.lang.String str16 = vCardBean0.getOrganization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test110"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getVCard();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str10 = vCardBean0.toString();
    java.lang.String str11 = vCardBean0.getEmail();
    vCardBean0.setVCard("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test111"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.getFax();
    java.lang.String str9 = vCardBean0.getPhone();
    java.lang.String str10 = vCardBean0.getFormattedName();
    vCardBean0.setTitle("");
    java.lang.String str13 = vCardBean0.getVCard();
    java.lang.String str14 = vCardBean0.getPhone();
    vCardBean0.setLastName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test112"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setOrganization("");
    vCardBean0.setTitle("hi!");
    java.lang.String str9 = vCardBean0.getMiddleName();
    vCardBean0.setFax("hi!");
    vCardBean0.setTitle("");
    vCardBean0.setFormattedName("");
    java.lang.String str16 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test113"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFormattedName("hi!");
    java.lang.String str5 = vCardBean0.getEmail();
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=FAX:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test114"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getEmail();
    java.lang.String str4 = vCardBean0.getOrganization();
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    vCardBean0.setFirstName("hi!");
    java.lang.String str10 = vCardBean0.getMiddleName();
    vCardBean0.setTitle("");
    vCardBean0.setFax("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str17 = vCardBean0.getFirstName();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test115"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getEmail();
    java.lang.String str4 = vCardBean0.getOrganization();
    java.lang.String str5 = vCardBean0.getPhone();
    java.lang.String str6 = vCardBean0.getFormattedName();
    java.lang.String str7 = vCardBean0.getMiddleName();
    java.lang.String str8 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test116"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    java.lang.String str6 = vCardBean0.getPhone();
    vCardBean0.setVCard("hi!");
    vCardBean0.setPhone("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setVCard("");
    vCardBean0.setEmail("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=FAX:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test117"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getTitle();
    java.lang.String str5 = vCardBean0.getOrganization();
    vCardBean0.setFormattedName("");
    java.lang.String str8 = vCardBean0.getFax();
    java.lang.String str9 = vCardBean0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test118"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFirstName("hi!");
    java.lang.String str5 = vCardBean0.toString();
    java.lang.String str6 = vCardBean0.getPhone();
    java.lang.String str7 = vCardBean0.getVCard();
    boolean b8 = vCardBean0.isValidVCard();
    java.lang.String str9 = vCardBean0.getVCard();
    java.lang.String str10 = vCardBean0.getPhone();
    vCardBean0.setLastName("hi!");
    java.lang.String str13 = vCardBean0.getFirstName();
    vCardBean0.setPhone("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=FAX:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test119"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    vCardBean0.setLastName("");
    boolean b8 = vCardBean0.isValidVCard();
    vCardBean0.setOrganization("");
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setPhone("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    boolean b15 = vCardBean0.isValidVCard();
    vCardBean0.setTitle("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test120"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getOrganization();
    java.lang.String str7 = vCardBean0.getMiddleName();
    java.lang.String str8 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    vCardBean0.setOrganization("");
    vCardBean0.setFax("BEGIN:VCARD\nFN:hi!\nN:;;BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD;\nTITLE:hi!\nORG:\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test121"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str8 = vCardBean0.toString();
    java.lang.String str9 = vCardBean0.getFormattedName();
    java.lang.String str10 = vCardBean0.getFirstName();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str13 = vCardBean0.toString();
    java.lang.String str14 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test122"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    vCardBean0.setEmail("hi!");
    vCardBean0.setEmail("hi!");
    java.lang.String str8 = vCardBean0.getOrganization();
    vCardBean0.setTitle("hi!");
    java.lang.String str11 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test123"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getEmail();
    java.lang.String str6 = vCardBean0.getFax();
    boolean b7 = vCardBean0.isValidVCard();
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str12 = vCardBean0.getPhone();
    vCardBean0.setVCard("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str15 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD"+ "'", str15.equals("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test124"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    vCardBean0.setOrganization("hi!");
    java.lang.String str6 = vCardBean0.getFax();
    vCardBean0.setFirstName("hi!");
    boolean b9 = vCardBean0.isValidVCard();
    vCardBean0.setVCard("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test125"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getEmail();
    java.lang.String str6 = vCardBean0.getFax();
    vCardBean0.setFax("");
    java.lang.String str9 = vCardBean0.getVCard();
    boolean b10 = vCardBean0.isValidVCard();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str15 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test126"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.toString();
    vCardBean0.setVCard("");
    java.lang.String str11 = vCardBean0.getEmail();
    java.lang.String str12 = vCardBean0.getEmail();
    vCardBean0.setFirstName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN:hi!\nN:;;BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD;\nTITLE:hi!\nORG:\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setEmail("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test127"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    vCardBean0.setEmail("hi!");
    java.lang.String str6 = vCardBean0.getEmail();
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getLastName();
    vCardBean0.setTitle("");
    boolean b11 = vCardBean0.isValidVCard();
    java.lang.String str12 = vCardBean0.getFormattedName();
    java.lang.String str13 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test128"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getTitle();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str11 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test129"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.toString();
    vCardBean0.setLastName("hi!");
    vCardBean0.setLastName("");
    java.lang.String str8 = vCardBean0.getFax();
    vCardBean0.setVCard("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test130"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getVCard();
    vCardBean0.setLastName("");
    vCardBean0.setFax("hi!");
    vCardBean0.setPhone("");
    java.lang.String str10 = vCardBean0.getMiddleName();
    java.lang.String str11 = vCardBean0.getTitle();
    vCardBean0.setFax("");
    java.lang.String str14 = vCardBean0.getFormattedName();
    java.lang.String str15 = vCardBean0.getFirstName();
    vCardBean0.setFirstName("");
    vCardBean0.setFirstName("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    java.lang.String str20 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test131"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str11 = vCardBean0.getPhone();
    vCardBean0.setMiddleName("");
    java.lang.String str14 = vCardBean0.getVCard();
    java.lang.String str15 = vCardBean0.getFormattedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test132"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getOrganization();
    java.lang.String str7 = vCardBean0.getMiddleName();
    java.lang.String str8 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str13 = vCardBean0.getPhone();
    vCardBean0.setLastName("hi!");
    vCardBean0.setOrganization("hi!");
    java.lang.String str18 = vCardBean0.getLastName();
    vCardBean0.setLastName("");
    java.lang.String str21 = vCardBean0.getTitle();
    vCardBean0.setEmail("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test133"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setLastName("hi!");
    vCardBean0.setPhone("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test134"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    java.lang.String str7 = vCardBean0.getTitle();
    boolean b8 = vCardBean0.isValidVCard();
    vCardBean0.setFirstName("hi!");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setMiddleName("");
    java.lang.String str15 = vCardBean0.getMiddleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test135"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getEmail();
    java.lang.String str4 = vCardBean0.getOrganization();
    java.lang.String str5 = vCardBean0.toString();
    vCardBean0.setOrganization("hi!");
    java.lang.String str8 = vCardBean0.getVCard();
    vCardBean0.setOrganization("");
    java.lang.String str11 = vCardBean0.getLastName();
    vCardBean0.setEmail("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setPhone("");
    vCardBean0.setFax("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setLastName("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test136"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    java.lang.String str4 = vCardBean0.getMiddleName();
    boolean b5 = vCardBean0.isValidVCard();
    java.lang.String str6 = vCardBean0.getFax();
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.getMiddleName();
    java.lang.String str9 = vCardBean0.getFormattedName();
    vCardBean0.setLastName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test137"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getEmail();
    java.lang.String str6 = vCardBean0.getFax();
    boolean b7 = vCardBean0.isValidVCard();
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setPhone("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test138"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getEmail();
    java.lang.String str4 = vCardBean0.getOrganization();
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    vCardBean0.setFirstName("hi!");
    java.lang.String str10 = vCardBean0.getMiddleName();
    vCardBean0.setTitle("");
    java.lang.String str13 = vCardBean0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test139"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    java.lang.String str4 = vCardBean0.getEmail();
    vCardBean0.setPhone("");
    java.lang.String str7 = vCardBean0.getTitle();
    vCardBean0.setLastName("BEGIN:VCARD\nFN:hi!\nN:;;BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD;\nTITLE:hi!\nORG:\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test140"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getTitle();
    java.lang.String str9 = vCardBean0.getLastName();
    java.lang.String str10 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test141"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setFormattedName("");
    vCardBean0.setPhone("");
    java.lang.String str9 = vCardBean0.getPhone();
    java.lang.String str10 = vCardBean0.getFirstName();
    boolean b11 = vCardBean0.isValidVCard();
    java.lang.String str12 = vCardBean0.getTitle();
    java.lang.String str13 = vCardBean0.getEmail();
    java.lang.String str14 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test142"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.toString();
    vCardBean0.setVCard("");
    boolean b10 = vCardBean0.isValidVCard();
    vCardBean0.setLastName("");
    java.lang.String str13 = vCardBean0.getFormattedName();
    vCardBean0.setTitle("");
    boolean b16 = vCardBean0.isValidVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test143"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.toString();
    vCardBean0.setLastName("hi!");
    vCardBean0.setPhone("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setFirstName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test144"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.toString();
    vCardBean0.setVCard("");
    java.lang.String str11 = vCardBean0.getOrganization();
    vCardBean0.setVCard("");
    vCardBean0.setFormattedName("hi!");
    java.lang.String str16 = vCardBean0.toString();
    java.lang.String str17 = vCardBean0.getPhone();
    java.lang.String str18 = vCardBean0.getFormattedName();
    vCardBean0.setVCard("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test145"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    vCardBean0.setOrganization("hi!");
    java.lang.String str6 = vCardBean0.getFirstName();
    vCardBean0.setLastName("");
    java.lang.String str9 = vCardBean0.getMiddleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test146"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str6 = vCardBean0.getLastName();
    java.lang.String str7 = vCardBean0.getFormattedName();
    java.lang.String str8 = vCardBean0.getPhone();
    vCardBean0.setFirstName("hi!");
    java.lang.String str11 = vCardBean0.toString();
    vCardBean0.setMiddleName("");
    vCardBean0.setOrganization("hi!");
    java.lang.String str16 = vCardBean0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test147"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getTitle();
    java.lang.String str5 = vCardBean0.getOrganization();
    java.lang.String str6 = vCardBean0.getOrganization();
    vCardBean0.setTitle("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str9 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test148"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getEmail();
    java.lang.String str4 = vCardBean0.getOrganization();
    java.lang.String str5 = vCardBean0.toString();
    vCardBean0.setOrganization("hi!");
    vCardBean0.setFax("");
    vCardBean0.setFormattedName("");
    java.lang.String str12 = vCardBean0.getLastName();
    vCardBean0.setEmail("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str15 = vCardBean0.getMiddleName();
    vCardBean0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test149"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.toString();
    vCardBean0.setEmail("hi!");
    vCardBean0.setEmail("hi!");
    java.lang.String str13 = vCardBean0.getFormattedName();
    vCardBean0.setFirstName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=FAX:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test150"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    java.lang.String str6 = vCardBean0.getTitle();
    java.lang.String str7 = vCardBean0.getVCard();
    java.lang.String str8 = vCardBean0.getFax();
    vCardBean0.setVCard("");
    java.lang.String str11 = vCardBean0.getOrganization();
    java.lang.String str12 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test151"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getTitle();
    vCardBean0.setVCard("hi!");
    java.lang.String str6 = vCardBean0.getTitle();
    java.lang.String str7 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test152"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.getFax();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str11 = vCardBean0.getEmail();
    java.lang.String str12 = vCardBean0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test153"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getVCard();
    vCardBean0.setLastName("");
    vCardBean0.setFax("hi!");
    vCardBean0.setPhone("");
    java.lang.String str10 = vCardBean0.getMiddleName();
    java.lang.String str11 = vCardBean0.getTitle();
    vCardBean0.setFax("");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setEmail("hi!");
    java.lang.String str18 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test154"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getEmail();
    java.lang.String str4 = vCardBean0.getOrganization();
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    vCardBean0.setFax("hi!");
    java.lang.String str10 = vCardBean0.toString();
    vCardBean0.setFax("hi!");
    java.lang.String str13 = vCardBean0.getLastName();
    boolean b14 = vCardBean0.isValidVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test155"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getEmail();
    java.lang.String str4 = vCardBean0.getOrganization();
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getOrganization();
    vCardBean0.setFirstName("");
    vCardBean0.setEmail("hi!");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setFax("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setFirstName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test156"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    vCardBean0.setOrganization("hi!");
    java.lang.String str6 = vCardBean0.getTitle();
    vCardBean0.setFirstName("");
    vCardBean0.setEmail("");
    java.lang.String str11 = vCardBean0.toString();
    vCardBean0.setVCard("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD"+ "'", str11.equals("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test157"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getTitle();
    java.lang.String str9 = vCardBean0.getLastName();
    java.lang.String str10 = vCardBean0.getOrganization();
    vCardBean0.setEmail("hi!");
    java.lang.String str13 = vCardBean0.getFax();
    vCardBean0.setOrganization("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test158"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    java.lang.String str4 = vCardBean0.toString();
    java.lang.String str5 = vCardBean0.getOrganization();
    vCardBean0.setOrganization("");
    vCardBean0.setMiddleName("");
    java.lang.String str10 = vCardBean0.getLastName();
    java.lang.String str11 = vCardBean0.toString();
    java.lang.String str12 = vCardBean0.getFirstName();
    vCardBean0.setFormattedName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test159"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setVCard("hi!");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setFax("BEGIN:VCARD\nFN:hi!\nN:;;BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD;\nTITLE:hi!\nORG:\nEMAIL;TYPE=INTERNET:\nEND:VCARD");

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test160"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.toString();
    vCardBean0.setVCard("");
    java.lang.String str11 = vCardBean0.getOrganization();
    vCardBean0.setVCard("");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str16 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test161"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getEmail();
    vCardBean0.setPhone("");
    vCardBean0.setFirstName("");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str10 = vCardBean0.getFax();
    vCardBean0.setTitle("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test162"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getFirstName();
    java.lang.String str9 = vCardBean0.getPhone();
    java.lang.String str10 = vCardBean0.getOrganization();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str13 = vCardBean0.getFirstName();
    java.lang.String str14 = vCardBean0.getFax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test163"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str8 = vCardBean0.getFirstName();
    java.lang.String str9 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test164"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getEmail();
    vCardBean0.setPhone("hi!");
    vCardBean0.setPhone("");
    vCardBean0.setFirstName("");
    java.lang.String str11 = vCardBean0.getFax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test165"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getEmail();
    java.lang.String str6 = vCardBean0.getFax();
    vCardBean0.setFax("");
    java.lang.String str9 = vCardBean0.getVCard();
    boolean b10 = vCardBean0.isValidVCard();
    vCardBean0.setFax("hi!");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
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
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test166"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getVCard();
    vCardBean0.setFax("hi!");
    java.lang.String str7 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test167"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFormattedName("hi!");
    java.lang.String str5 = vCardBean0.getPhone();
    boolean b6 = vCardBean0.isValidVCard();
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getFormattedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test168"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setLastName("hi!");
    vCardBean0.setPhone("hi!");
    boolean b14 = vCardBean0.isValidVCard();
    vCardBean0.setVCard("");
    vCardBean0.setOrganization("");
    java.lang.String str19 = vCardBean0.getMiddleName();
    java.lang.String str20 = vCardBean0.getOrganization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test169"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    java.lang.String str6 = vCardBean0.getMiddleName();
    java.lang.String str7 = vCardBean0.getPhone();
    java.lang.String str8 = vCardBean0.getFormattedName();
    java.lang.String str9 = vCardBean0.getFormattedName();
    java.lang.String str10 = vCardBean0.getFormattedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test170"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getEmail();
    java.lang.String str4 = vCardBean0.getOrganization();
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getOrganization();
    vCardBean0.setFirstName("");
    vCardBean0.setEmail("hi!");
    vCardBean0.setPhone("hi!");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setVCard("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test171"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getLastName();
    java.lang.String str4 = vCardBean0.getLastName();
    vCardBean0.setFirstName("");
    vCardBean0.setPhone("");
    vCardBean0.setLastName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str11 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test172"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFirstName("hi!");
    java.lang.String str5 = vCardBean0.toString();
    java.lang.String str6 = vCardBean0.getPhone();
    java.lang.String str7 = vCardBean0.getVCard();
    boolean b8 = vCardBean0.isValidVCard();
    java.lang.String str9 = vCardBean0.getVCard();
    vCardBean0.setOrganization("hi!");
    vCardBean0.setVCard("");
    vCardBean0.setOrganization("");
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test173"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getTitle();
    java.lang.String str9 = vCardBean0.getLastName();
    java.lang.String str10 = vCardBean0.getTitle();
    vCardBean0.setVCard("hi!");
    java.lang.String str13 = vCardBean0.getLastName();
    vCardBean0.setOrganization("hi!");
    vCardBean0.setLastName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test174"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.getMiddleName();
    vCardBean0.setLastName("");
    vCardBean0.setLastName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setLastName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=FAX:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test175"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    vCardBean0.setVCard("");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setEmail("");
    java.lang.String str12 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test176"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getFax();
    vCardBean0.setVCard("hi!");
    vCardBean0.setPhone("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test177"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getEmail();
    vCardBean0.setVCard("hi!");
    java.lang.String str11 = vCardBean0.toString();
    vCardBean0.setFax("hi!");
    vCardBean0.setOrganization("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test178"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    vCardBean0.setEmail("hi!");
    vCardBean0.setEmail("");
    vCardBean0.setMiddleName("hi!");
    boolean b10 = vCardBean0.isValidVCard();
    java.lang.String str11 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test179"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    vCardBean0.setFirstName("");
    vCardBean0.setFax("hi!");
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str12 = vCardBean0.getOrganization();
    java.lang.String str13 = vCardBean0.toString();
    java.lang.String str14 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test180"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    java.lang.String str4 = vCardBean0.getEmail();
    java.lang.String str5 = vCardBean0.getPhone();
    java.lang.String str6 = vCardBean0.getFax();
    java.lang.String str7 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test181"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    vCardBean0.setLastName("");
    vCardBean0.setMiddleName("");
    java.lang.String str10 = vCardBean0.toString();
    vCardBean0.setFormattedName("");
    vCardBean0.setTitle("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    boolean b15 = vCardBean0.isValidVCard();
    boolean b16 = vCardBean0.isValidVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test182"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str6 = vCardBean0.getLastName();
    java.lang.String str7 = vCardBean0.getFormattedName();
    java.lang.String str8 = vCardBean0.getEmail();
    java.lang.String str9 = vCardBean0.toString();
    java.lang.String str10 = vCardBean0.getFirstName();
    vCardBean0.setFax("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str13 = vCardBean0.getMiddleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test183"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getVCard();
    boolean b5 = vCardBean0.isValidVCard();
    java.lang.String str6 = vCardBean0.getPhone();
    vCardBean0.setEmail("hi!");
    boolean b9 = vCardBean0.isValidVCard();
    vCardBean0.setVCard("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test184"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getOrganization();
    java.lang.String str7 = vCardBean0.getMiddleName();
    java.lang.String str8 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    vCardBean0.setPhone("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setFirstName("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test185"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getTitle();
    vCardBean0.setTitle("hi!");
    java.lang.String str6 = vCardBean0.getTitle();
    vCardBean0.setOrganization("");
    java.lang.String str9 = vCardBean0.getPhone();
    java.lang.String str10 = vCardBean0.getPhone();
    java.lang.String str11 = vCardBean0.getOrganization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test186"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setFormattedName("");
    java.lang.String str7 = vCardBean0.getEmail();
    java.lang.String str8 = vCardBean0.getMiddleName();
    vCardBean0.setVCard("");
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setTitle("BEGIN:VCARD\nFN:hi!\nN:;;BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD;\nTITLE:hi!\nORG:\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test187"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    java.lang.String str6 = vCardBean0.getPhone();
    vCardBean0.setMiddleName("");
    java.lang.String str9 = vCardBean0.getVCard();
    java.lang.String str10 = vCardBean0.getEmail();
    vCardBean0.setFirstName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str13 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test188"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.getFax();
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setFax("");
    java.lang.String str13 = vCardBean0.getTitle();
    vCardBean0.setPhone("hi!");
    java.lang.String str16 = vCardBean0.toString();
    java.lang.String str17 = vCardBean0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test189"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getOrganization();
    vCardBean0.setEmail("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=FAX:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test190"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    vCardBean0.setTitle("");
    vCardBean0.setOrganization("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test191"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    java.lang.String str6 = vCardBean0.getVCard();
    vCardBean0.setEmail("hi!");
    boolean b9 = vCardBean0.isValidVCard();
    java.lang.String str10 = vCardBean0.getEmail();
    java.lang.String str11 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test192"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.toString();
    vCardBean0.setVCard("");
    boolean b10 = vCardBean0.isValidVCard();
    java.lang.String str11 = vCardBean0.getFormattedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test193"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getVCard();
    vCardBean0.setLastName("");
    java.lang.String str6 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test194"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    vCardBean0.setEmail("hi!");
    java.lang.String str6 = vCardBean0.getEmail();
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getLastName();
    vCardBean0.setTitle("");
    boolean b11 = vCardBean0.isValidVCard();
    java.lang.String str12 = vCardBean0.getFirstName();
    java.lang.String str13 = vCardBean0.getFirstName();
    java.lang.String str14 = vCardBean0.getMiddleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test195"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getFormattedName();
    vCardBean0.setOrganization("hi!");
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setLastName("hi!");
    vCardBean0.setLastName("");
    java.lang.String str11 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test196"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setFax("hi!");
    vCardBean0.setFax("");
    vCardBean0.setPhone("hi!");
    boolean b12 = vCardBean0.isValidVCard();
    java.lang.String str13 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test197"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getEmail();
    java.lang.String str6 = vCardBean0.getFax();
    vCardBean0.setFax("");
    vCardBean0.setOrganization("hi!");
    java.lang.String str11 = vCardBean0.toString();
    boolean b12 = vCardBean0.isValidVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test198"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getPhone();
    boolean b6 = vCardBean0.isValidVCard();
    java.lang.String str7 = vCardBean0.getVCard();
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN:hi!\nN:;;BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD;\nTITLE:hi!\nORG:\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test199"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setFormattedName("");
    java.lang.String str7 = vCardBean0.getTitle();
    vCardBean0.setMiddleName("");
    boolean b10 = vCardBean0.isValidVCard();
    vCardBean0.setFax("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str13 = vCardBean0.getEmail();
    vCardBean0.setVCard("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    boolean b16 = vCardBean0.isValidVCard();
    vCardBean0.setVCard("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test200"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getEmail();
    java.lang.String str6 = vCardBean0.getFax();
    boolean b7 = vCardBean0.isValidVCard();
    java.lang.String str8 = vCardBean0.getFormattedName();
    vCardBean0.setFax("");
    vCardBean0.setFax("");
    java.lang.String str13 = vCardBean0.getFax();
    java.lang.String str14 = vCardBean0.getVCard();
    vCardBean0.setLastName("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    java.lang.String str17 = vCardBean0.getFormattedName();
    java.lang.String str18 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test201"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getMiddleName();
    vCardBean0.setOrganization("");
    vCardBean0.setTitle("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str8 = vCardBean0.getTitle();
    java.lang.String str9 = vCardBean0.getFax();
    java.lang.String str10 = vCardBean0.getMiddleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD"+ "'", str8.equals("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test202"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getVCard();
    vCardBean0.setVCard("hi!");
    boolean b7 = vCardBean0.isValidVCard();
    vCardBean0.setMiddleName("");
    java.lang.String str10 = vCardBean0.getEmail();
    vCardBean0.setLastName("hi!");
    java.lang.String str13 = vCardBean0.getOrganization();
    java.lang.String str14 = vCardBean0.getMiddleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test203"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.toString();
    vCardBean0.setFirstName("hi!");
    vCardBean0.setEmail("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getFax();
    java.lang.String str10 = vCardBean0.getVCard();
    java.lang.String str11 = vCardBean0.getFirstName();
    vCardBean0.setTitle("BEGIN:VCARD\nFN:hi!\nN:;;BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD;\nTITLE:hi!\nORG:\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test204"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setEmail("hi!");
    vCardBean0.setTitle("");
    java.lang.String str13 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test205"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    java.lang.String str2 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    java.lang.String str5 = vCardBean0.getLastName();
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str8 = vCardBean0.getFormattedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test206"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getFirstName();
    java.lang.String str9 = vCardBean0.getPhone();
    java.lang.String str10 = vCardBean0.getOrganization();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str15 = vCardBean0.getFax();
    java.lang.String str16 = vCardBean0.getFax();
    vCardBean0.setVCard("");
    java.lang.String str19 = vCardBean0.getFax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test207"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getTitle();
    vCardBean0.setTitle("hi!");
    java.lang.String str6 = vCardBean0.getOrganization();
    vCardBean0.setEmail("");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str13 = vCardBean0.getFormattedName();
    java.lang.String str14 = vCardBean0.getOrganization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test208"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getEmail();
    vCardBean0.setVCard("hi!");
    java.lang.String str11 = vCardBean0.toString();
    vCardBean0.setFax("hi!");
    vCardBean0.setFax("");
    vCardBean0.setOrganization("");
    java.lang.String str18 = vCardBean0.getPhone();
    java.lang.String str19 = vCardBean0.getFormattedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test209"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getPhone();
    java.lang.String str6 = vCardBean0.getFormattedName();
    java.lang.String str7 = vCardBean0.getFormattedName();
    java.lang.String str8 = vCardBean0.getLastName();
    vCardBean0.setLastName("");
    java.lang.String str11 = vCardBean0.getFirstName();
    java.lang.String str12 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test210"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str11 = vCardBean0.getPhone();
    vCardBean0.setMiddleName("");
    java.lang.String str14 = vCardBean0.getVCard();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=FAX:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test211"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getOrganization();
    java.lang.String str7 = vCardBean0.getMiddleName();
    java.lang.String str8 = vCardBean0.getEmail();
    vCardBean0.setFirstName("hi!");
    java.lang.String str11 = vCardBean0.getEmail();
    boolean b12 = vCardBean0.isValidVCard();
    java.lang.String str13 = vCardBean0.toString();
    java.lang.String str14 = vCardBean0.getFormattedName();
    java.lang.String str15 = vCardBean0.getLastName();
    java.lang.String str16 = vCardBean0.getFax();
    vCardBean0.setFormattedName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test212"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    vCardBean0.setOrganization("");
    boolean b9 = vCardBean0.isValidVCard();
    vCardBean0.setTitle("hi!");
    vCardBean0.setOrganization("");
    java.lang.String str14 = vCardBean0.getFax();
    java.lang.String str15 = vCardBean0.getPhone();
    vCardBean0.setOrganization("hi!");
    java.lang.String str18 = vCardBean0.getFormattedName();
    java.lang.String str19 = vCardBean0.getMiddleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test213"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getTitle();
    java.lang.String str9 = vCardBean0.getLastName();
    java.lang.String str10 = vCardBean0.getOrganization();
    java.lang.String str11 = vCardBean0.getLastName();
    vCardBean0.setOrganization("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
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
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test214"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFirstName("hi!");
    java.lang.String str5 = vCardBean0.toString();
    java.lang.String str6 = vCardBean0.getPhone();
    java.lang.String str7 = vCardBean0.getVCard();
    boolean b8 = vCardBean0.isValidVCard();
    vCardBean0.setVCard("hi!");
    java.lang.String str11 = vCardBean0.getPhone();
    vCardBean0.setVCard("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str14 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD"+ "'", str14.equals("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD"));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test215"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str6 = vCardBean0.getLastName();
    java.lang.String str7 = vCardBean0.getFormattedName();
    java.lang.String str8 = vCardBean0.getEmail();
    java.lang.String str9 = vCardBean0.toString();
    vCardBean0.setMiddleName("");
    vCardBean0.setVCard("hi!");
    vCardBean0.setEmail("hi!");
    vCardBean0.setFax("");
    java.lang.String str18 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test216"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getVCard();
    vCardBean0.setLastName("");
    vCardBean0.setFax("hi!");
    vCardBean0.setPhone("");
    java.lang.String str10 = vCardBean0.getMiddleName();
    java.lang.String str11 = vCardBean0.getTitle();
    vCardBean0.setFirstName("");
    vCardBean0.setEmail("hi!");
    java.lang.String str16 = vCardBean0.getMiddleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test217"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getTitle();
    java.lang.String str9 = vCardBean0.getLastName();
    vCardBean0.setPhone("hi!");
    java.lang.String str12 = vCardBean0.getFormattedName();
    vCardBean0.setTitle("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test218"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    vCardBean0.setEmail("");
    java.lang.String str9 = vCardBean0.getEmail();
    java.lang.String str10 = vCardBean0.getTitle();
    java.lang.String str11 = vCardBean0.getVCard();
    vCardBean0.setTitle("");
    vCardBean0.setPhone("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test219"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    vCardBean0.setMiddleName("");
    vCardBean0.setTitle("hi!");
    java.lang.String str8 = vCardBean0.getMiddleName();
    vCardBean0.setPhone("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setFirstName("");
    boolean b13 = vCardBean0.isValidVCard();
    vCardBean0.setFirstName("hi!");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test220"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setFormattedName("");
    java.lang.String str7 = vCardBean0.getEmail();
    java.lang.String str8 = vCardBean0.getMiddleName();
    java.lang.String str9 = vCardBean0.toString();
    java.lang.String str10 = vCardBean0.getOrganization();
    java.lang.String str11 = vCardBean0.getFormattedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test221"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getFirstName();
    java.lang.String str9 = vCardBean0.getPhone();
    java.lang.String str10 = vCardBean0.getOrganization();
    vCardBean0.setVCard("");
    java.lang.String str13 = vCardBean0.getOrganization();
    vCardBean0.setEmail("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test222"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    java.lang.String str7 = vCardBean0.getTitle();
    boolean b8 = vCardBean0.isValidVCard();
    vCardBean0.setFirstName("hi!");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str15 = vCardBean0.getOrganization();
    java.lang.String str16 = vCardBean0.toString();
    java.lang.String str17 = vCardBean0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test223"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.toString();
    vCardBean0.setVCard("");
    java.lang.String str10 = vCardBean0.getFormattedName();
    vCardBean0.setFirstName("");
    java.lang.String str13 = vCardBean0.getEmail();
    boolean b14 = vCardBean0.isValidVCard();
    java.lang.String str15 = vCardBean0.getLastName();
    vCardBean0.setVCard("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=FAX:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test224"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.toString();
    vCardBean0.setVCard("");
    java.lang.String str11 = vCardBean0.getOrganization();
    vCardBean0.setVCard("");
    vCardBean0.setFormattedName("hi!");
    java.lang.String str16 = vCardBean0.toString();
    java.lang.String str17 = vCardBean0.getPhone();
    java.lang.String str18 = vCardBean0.getFirstName();
    java.lang.String str19 = vCardBean0.getEmail();
    java.lang.String str20 = vCardBean0.getFormattedName();
    java.lang.String str21 = vCardBean0.getPhone();
    vCardBean0.setPhone("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test225"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    java.lang.String str4 = vCardBean0.getMiddleName();
    boolean b5 = vCardBean0.isValidVCard();
    java.lang.String str6 = vCardBean0.getFax();
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.getMiddleName();
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:hi!\nN:;;BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD;\nTITLE:hi!\nORG:\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test226"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getEmail();
    java.lang.String str4 = vCardBean0.getOrganization();
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    vCardBean0.setFax("hi!");
    java.lang.String str10 = vCardBean0.toString();
    java.lang.String str11 = vCardBean0.getFormattedName();
    vCardBean0.setFax("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test227"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.toString();
    vCardBean0.setVCard("");
    java.lang.String str11 = vCardBean0.getTitle();
    java.lang.String str12 = vCardBean0.getPhone();
    java.lang.String str13 = vCardBean0.getLastName();
    java.lang.String str14 = vCardBean0.getOrganization();
    java.lang.String str15 = vCardBean0.getFirstName();
    boolean b16 = vCardBean0.isValidVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test228"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getTitle();
    java.lang.String str5 = vCardBean0.getTitle();
    java.lang.String str6 = vCardBean0.getMiddleName();
    java.lang.String str7 = vCardBean0.getFirstName();
    java.lang.String str8 = vCardBean0.toString();
    vCardBean0.setFax("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str11 = vCardBean0.getOrganization();
    boolean b12 = vCardBean0.isValidVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test229"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getOrganization();
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setFirstName("hi!");
    java.lang.String str9 = vCardBean0.getOrganization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD"+ "'", str9.equals("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD"));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test230"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getVCard();
    vCardBean0.setFax("");
    java.lang.String str10 = vCardBean0.getEmail();
    java.lang.String str11 = vCardBean0.getPhone();
    java.lang.String str12 = vCardBean0.getFax();
    java.lang.String str13 = vCardBean0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test231"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    vCardBean0.setVCard("");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setEmail("hi!");
    java.lang.String str12 = vCardBean0.getMiddleName();
    java.lang.String str13 = vCardBean0.getPhone();
    vCardBean0.setOrganization("hi!");
    java.lang.String str16 = vCardBean0.getFax();
    vCardBean0.setOrganization("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test232"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    java.lang.String str4 = vCardBean0.getMiddleName();
    java.lang.String str5 = vCardBean0.getFax();
    vCardBean0.setOrganization("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getEmail();
    vCardBean0.setOrganization("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test233"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str6 = vCardBean0.getPhone();
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str9 = vCardBean0.getFirstName();
    java.lang.String str10 = vCardBean0.getTitle();
    vCardBean0.setPhone("");
    vCardBean0.setPhone("BEGIN:VCARD\nFN:hi!\nN:;;BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD;\nTITLE:hi!\nORG:\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test234"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    vCardBean0.setOrganization("hi!");
    java.lang.String str6 = vCardBean0.getFax();
    vCardBean0.setFirstName("hi!");
    boolean b9 = vCardBean0.isValidVCard();
    vCardBean0.setOrganization("hi!");
    java.lang.String str12 = vCardBean0.getVCard();
    java.lang.String str13 = vCardBean0.getMiddleName();
    java.lang.String str14 = vCardBean0.getEmail();
    java.lang.String str15 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test235"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str6 = vCardBean0.getLastName();
    java.lang.String str7 = vCardBean0.getFormattedName();
    vCardBean0.setFax("hi!");
    java.lang.String str10 = vCardBean0.getFirstName();
    java.lang.String str11 = vCardBean0.getEmail();
    java.lang.String str12 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test236"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    java.lang.String str6 = vCardBean0.getTitle();
    java.lang.String str7 = vCardBean0.getVCard();
    java.lang.String str8 = vCardBean0.getFax();
    vCardBean0.setVCard("");
    vCardBean0.setLastName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test237"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    java.lang.String str6 = vCardBean0.getVCard();
    vCardBean0.setEmail("hi!");
    java.lang.String str9 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    vCardBean0.setFax("BEGIN:VCARD\nFN:hi!\nN:;;BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD;\nTITLE:hi!\nORG:\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test238"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    java.lang.String str4 = vCardBean0.toString();
    java.lang.String str5 = vCardBean0.getVCard();
    java.lang.String str6 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test239"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    vCardBean0.setFax("");
    java.lang.String str6 = vCardBean0.getFax();
    java.lang.String str7 = vCardBean0.getEmail();
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test240"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.toString();
    vCardBean0.setVCard("");
    java.lang.String str10 = vCardBean0.getFormattedName();
    vCardBean0.setFirstName("hi!");
    java.lang.String str13 = vCardBean0.getPhone();
    java.lang.String str14 = vCardBean0.getMiddleName();
    vCardBean0.setPhone("");
    java.lang.String str17 = vCardBean0.toString();
    java.lang.String str18 = vCardBean0.getFormattedName();
    vCardBean0.setVCard("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test241"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    vCardBean0.setEmail("hi!");
    java.lang.String str6 = vCardBean0.getEmail();
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getLastName();
    vCardBean0.setTitle("");
    boolean b11 = vCardBean0.isValidVCard();
    java.lang.String str12 = vCardBean0.getFirstName();
    java.lang.String str13 = vCardBean0.getFirstName();
    java.lang.String str14 = vCardBean0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test242"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setPhone("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getMiddleName();
    vCardBean0.setEmail("hi!");
    vCardBean0.setTitle("");
    java.lang.String str14 = vCardBean0.getOrganization();
    java.lang.String str15 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test243"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    vCardBean0.setFax("hi!");
    java.lang.String str9 = vCardBean0.getLastName();
    java.lang.String str10 = vCardBean0.getTitle();
    java.lang.String str11 = vCardBean0.getPhone();
    java.lang.String str12 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test244"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    vCardBean0.setOrganization("hi!");
    java.lang.String str6 = vCardBean0.getTitle();
    vCardBean0.setFirstName("");
    vCardBean0.setEmail("");
    java.lang.String str11 = vCardBean0.toString();
    java.lang.String str12 = vCardBean0.getPhone();
    vCardBean0.setFirstName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=FAX:hi!\nEND:VCARD");
    vCardBean0.setTitle("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD"+ "'", str11.equals("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test245"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setFormattedName("");
    vCardBean0.setPhone("");
    java.lang.String str9 = vCardBean0.getLastName();
    java.lang.String str10 = vCardBean0.getFax();
    java.lang.String str11 = vCardBean0.getFirstName();
    vCardBean0.setLastName("hi!");
    java.lang.String str14 = vCardBean0.getFax();
    java.lang.String str15 = vCardBean0.getPhone();
    vCardBean0.setLastName("BEGIN:VCARD\nFN:hi!\nN:;;BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD;\nTITLE:hi!\nORG:\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test246"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getFormattedName();
    vCardBean0.setVCard("");
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getLastName();
    java.lang.String str10 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test247"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getEmail();
    vCardBean0.setVCard("hi!");
    vCardBean0.setTitle("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test248"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    java.lang.String str4 = vCardBean0.getMiddleName();
    java.lang.String str5 = vCardBean0.getFax();
    vCardBean0.setOrganization("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getEmail();
    vCardBean0.setFax("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test249"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str6 = vCardBean0.getLastName();
    java.lang.String str7 = vCardBean0.getFormattedName();
    java.lang.String str8 = vCardBean0.getEmail();
    java.lang.String str9 = vCardBean0.toString();
    vCardBean0.setMiddleName("");
    java.lang.String str12 = vCardBean0.getFormattedName();
    vCardBean0.setFax("");
    vCardBean0.setTitle("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str17 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test250"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    vCardBean0.setVCard("");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str10 = vCardBean0.getTitle();
    vCardBean0.setMiddleName("");
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str17 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test251"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getTitle();
    java.lang.String str5 = vCardBean0.getEmail();
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test252"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    java.lang.String str6 = vCardBean0.getVCard();
    vCardBean0.setEmail("hi!");
    vCardBean0.setEmail("");
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setTitle("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str15 = vCardBean0.getOrganization();
    boolean b16 = vCardBean0.isValidVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test253"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    vCardBean0.setOrganization("");
    boolean b9 = vCardBean0.isValidVCard();
    vCardBean0.setTitle("hi!");
    vCardBean0.setOrganization("");
    java.lang.String str14 = vCardBean0.getFax();
    java.lang.String str15 = vCardBean0.getPhone();
    vCardBean0.setOrganization("hi!");
    vCardBean0.setVCard("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str20 = vCardBean0.getOrganization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test254"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str4 = vCardBean0.getFormattedName();
    vCardBean0.setTitle("");
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test255"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setFax("");
    vCardBean0.setFormattedName("");
    java.lang.String str6 = vCardBean0.getFormattedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test256"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getEmail();
    vCardBean0.setVCard("hi!");
    java.lang.String str11 = vCardBean0.toString();
    vCardBean0.setEmail("hi!");
    java.lang.String str14 = vCardBean0.getFirstName();
    vCardBean0.setFax("hi!");
    java.lang.String str17 = vCardBean0.getMiddleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test257"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getFirstName();
    java.lang.String str9 = vCardBean0.getPhone();
    java.lang.String str10 = vCardBean0.getOrganization();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str15 = vCardBean0.getFax();
    java.lang.String str16 = vCardBean0.getFax();
    java.lang.String str17 = vCardBean0.getMiddleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test258"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getFormattedName();
    vCardBean0.setOrganization("hi!");
    vCardBean0.setFax("");
    java.lang.String str8 = vCardBean0.getFirstName();
    java.lang.String str9 = vCardBean0.getFormattedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test259"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getTitle();
    java.lang.String str9 = vCardBean0.getLastName();
    vCardBean0.setFormattedName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test260"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    java.lang.String str4 = vCardBean0.toString();
    java.lang.String str5 = vCardBean0.getOrganization();
    vCardBean0.setOrganization("");
    vCardBean0.setMiddleName("");
    boolean b10 = vCardBean0.isValidVCard();
    vCardBean0.setTitle("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test261"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getEmail();
    java.lang.String str4 = vCardBean0.getOrganization();
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    vCardBean0.setFirstName("hi!");
    java.lang.String str10 = vCardBean0.getMiddleName();
    vCardBean0.setTitle("");
    java.lang.String str13 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test262"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.getFax();
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setPhone("");
    java.lang.String str13 = vCardBean0.getLastName();
    java.lang.String str14 = vCardBean0.getFax();
    java.lang.String str15 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test263"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getEmail();
    vCardBean0.setPhone("");
    vCardBean0.setMiddleName("");
    java.lang.String str8 = vCardBean0.getFirstName();
    java.lang.String str9 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test264"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    java.lang.String str4 = vCardBean0.getEmail();
    vCardBean0.setPhone("");
    vCardBean0.setFirstName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setPhone("hi!");
    java.lang.String str11 = vCardBean0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test265"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getEmail();
    java.lang.String str9 = vCardBean0.getEmail();
    java.lang.String str10 = vCardBean0.getFirstName();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str13 = vCardBean0.toString();
    vCardBean0.setFirstName("");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    java.lang.String str18 = vCardBean0.getMiddleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test266"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getVCard();
    vCardBean0.setLastName("");
    vCardBean0.setFax("hi!");
    vCardBean0.setPhone("");
    java.lang.String str10 = vCardBean0.getPhone();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str13 = vCardBean0.getEmail();
    java.lang.String str14 = vCardBean0.getPhone();
    java.lang.String str15 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test267"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    java.lang.String str7 = vCardBean0.getFormattedName();
    vCardBean0.setFirstName("hi!");
    boolean b10 = vCardBean0.isValidVCard();
    vCardBean0.setFirstName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test268"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getOrganization();
    vCardBean0.setFirstName("");
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test269"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getEmail();
    vCardBean0.setPhone("");
    vCardBean0.setFirstName("");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str10 = vCardBean0.getVCard();
    vCardBean0.setFormattedName("");
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str15 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test270"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getVCard();
    vCardBean0.setLastName("");
    vCardBean0.setPhone("");
    java.lang.String str8 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test271"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFax();
    vCardBean0.setEmail("hi!");
    java.lang.String str6 = vCardBean0.getVCard();
    java.lang.String str7 = vCardBean0.getEmail();
    java.lang.String str8 = vCardBean0.getFormattedName();
    vCardBean0.setLastName("BEGIN:VCARD\nFN:hi!\nN:;;BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD;\nTITLE:hi!\nORG:\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test272"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setPhone("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getPhone();
    java.lang.String str10 = vCardBean0.getVCard();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str13 = vCardBean0.getLastName();
    vCardBean0.setEmail("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test273"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setFormattedName("");
    java.lang.String str7 = vCardBean0.getLastName();
    vCardBean0.setFirstName("hi!");
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=FAX:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test274"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getVCard();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str10 = vCardBean0.toString();
    vCardBean0.setMiddleName("");
    java.lang.String str13 = vCardBean0.getTitle();
    boolean b14 = vCardBean0.isValidVCard();
    vCardBean0.setFirstName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test275"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.toString();
    java.lang.String str8 = vCardBean0.getTitle();
    vCardBean0.setFirstName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test276"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.toString();
    vCardBean0.setVCard("");
    java.lang.String str10 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setEmail("");
    java.lang.String str17 = vCardBean0.getFax();
    java.lang.String str18 = vCardBean0.getFirstName();
    java.lang.String str19 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test277"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFormattedName("hi!");
    java.lang.String str5 = vCardBean0.getEmail();
    java.lang.String str6 = vCardBean0.getEmail();
    vCardBean0.setMiddleName("");
    java.lang.String str9 = vCardBean0.getTitle();
    vCardBean0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test278"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getTitle();
    vCardBean0.setTitle("hi!");
    java.lang.String str6 = vCardBean0.getTitle();
    vCardBean0.setTitle("");
    vCardBean0.setFirstName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setTitle("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test279"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    vCardBean0.setOrganization("hi!");
    java.lang.String str6 = vCardBean0.getFirstName();
    vCardBean0.setTitle("hi!");
    vCardBean0.setTitle("hi!");
    vCardBean0.setTitle("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setVCard("");
    java.lang.String str15 = vCardBean0.getVCard();
    vCardBean0.setVCard("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test280"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getEmail();
    java.lang.String str4 = vCardBean0.getOrganization();
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    vCardBean0.setFax("hi!");
    java.lang.String str10 = vCardBean0.toString();
    vCardBean0.setFax("hi!");
    vCardBean0.setEmail("hi!");
    java.lang.String str15 = vCardBean0.getLastName();
    java.lang.String str16 = vCardBean0.getFormattedName();
    vCardBean0.setEmail("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str19 = vCardBean0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test281"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getFormattedName();
    vCardBean0.setTitle("");
    java.lang.String str6 = vCardBean0.getFax();
    vCardBean0.setTitle("hi!");
    java.lang.String str9 = vCardBean0.getTitle();
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:hi!\nN:;;BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD;\nTITLE:hi!\nORG:\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test282"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setTitle("hi!");
    vCardBean0.setTitle("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setFax("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test283"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFirstName();
    vCardBean0.setLastName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str7 = vCardBean0.getMiddleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test284"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getEmail();
    java.lang.String str4 = vCardBean0.getOrganization();
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getOrganization();
    vCardBean0.setFirstName("");
    vCardBean0.setEmail("hi!");
    vCardBean0.setFirstName("hi!");
    java.lang.String str14 = vCardBean0.getFirstName();
    vCardBean0.setLastName("BEGIN:VCARD\nFN:hi!\nN:;;BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD;\nTITLE:hi!\nORG:\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test285"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getFirstName();
    java.lang.String str6 = vCardBean0.getFirstName();
    vCardBean0.setOrganization("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test286"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setFormattedName("");
    boolean b7 = vCardBean0.isValidVCard();
    vCardBean0.setFax("hi!");
    java.lang.String str10 = vCardBean0.getPhone();
    java.lang.String str11 = vCardBean0.getFax();
    java.lang.String str12 = vCardBean0.getOrganization();
    java.lang.String str13 = vCardBean0.getOrganization();
    java.lang.String str14 = vCardBean0.getFormattedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test287"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.toString();
    vCardBean0.setFirstName("hi!");
    vCardBean0.setEmail("");
    vCardBean0.setTitle("");
    vCardBean0.setMiddleName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test288"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.getFirstName();
    java.lang.String str9 = vCardBean0.getFax();
    java.lang.String str10 = vCardBean0.getFax();
    vCardBean0.setLastName("hi!");
    vCardBean0.setMiddleName("hi!");
    boolean b15 = vCardBean0.isValidVCard();
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=FAX:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test289"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getVCard();
    vCardBean0.setLastName("");
    vCardBean0.setLastName("");
    boolean b8 = vCardBean0.isValidVCard();
    vCardBean0.setVCard("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test290"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getVCard();
    vCardBean0.setFirstName("");
    vCardBean0.setFirstName("");
    java.lang.String str8 = vCardBean0.getMiddleName();
    vCardBean0.setEmail("");
    vCardBean0.setLastName("");
    vCardBean0.setFirstName("");
    java.lang.String str15 = vCardBean0.getMiddleName();
    java.lang.String str16 = vCardBean0.getFormattedName();
    vCardBean0.setFormattedName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test291"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getTitle();
    java.lang.String str9 = vCardBean0.getLastName();
    java.lang.String str10 = vCardBean0.getTitle();
    vCardBean0.setVCard("hi!");
    java.lang.String str13 = vCardBean0.getLastName();
    vCardBean0.setOrganization("hi!");
    vCardBean0.setOrganization("");
    java.lang.String str18 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("");
    vCardBean0.setVCard("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test292"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.toString();
    vCardBean0.setVCard("");
    java.lang.String str11 = vCardBean0.getOrganization();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str14 = vCardBean0.getMiddleName();
    java.lang.String str15 = vCardBean0.getOrganization();
    vCardBean0.setFirstName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str18 = vCardBean0.toString();
    vCardBean0.setTitle("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str21 = vCardBean0.getPhone();
    vCardBean0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test293"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getFax();
    vCardBean0.setVCard("hi!");
    java.lang.String str4 = vCardBean0.getLastName();
    java.lang.String str5 = vCardBean0.getEmail();
    java.lang.String str6 = vCardBean0.getVCard();
    vCardBean0.setFirstName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test294"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getTitle();
    vCardBean0.setTitle("hi!");
    java.lang.String str6 = vCardBean0.getTitle();
    vCardBean0.setOrganization("");
    vCardBean0.setLastName("");
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test295"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getMiddleName();
    vCardBean0.setOrganization("");
    vCardBean0.setTitle("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setVCard("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test296"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    java.lang.String str6 = vCardBean0.getVCard();
    java.lang.String str7 = vCardBean0.getEmail();
    java.lang.String str8 = vCardBean0.getEmail();
    vCardBean0.setOrganization("");
    java.lang.String str11 = vCardBean0.getOrganization();
    vCardBean0.setTitle("");
    vCardBean0.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test297"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str6 = vCardBean0.getLastName();
    java.lang.String str7 = vCardBean0.getFormattedName();
    java.lang.String str8 = vCardBean0.getEmail();
    java.lang.String str9 = vCardBean0.toString();
    vCardBean0.setMiddleName("");
    vCardBean0.setVCard("hi!");
    java.lang.String str14 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test298"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    java.lang.String str4 = vCardBean0.getMiddleName();
    java.lang.String str5 = vCardBean0.getFax();
    vCardBean0.setEmail("hi!");
    boolean b8 = vCardBean0.isValidVCard();
    vCardBean0.setFax("");
    java.lang.String str11 = vCardBean0.toString();
    vCardBean0.setFax("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test299"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setOrganization("");
    vCardBean0.setTitle("hi!");
    vCardBean0.setFirstName("");
    java.lang.String str11 = vCardBean0.getEmail();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str14 = vCardBean0.getPhone();
    vCardBean0.setOrganization("hi!");
    vCardBean0.setLastName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=FAX:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test300"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getEmail();
    vCardBean0.setPhone("hi!");
    java.lang.String str7 = vCardBean0.getFormattedName();
    java.lang.String str8 = vCardBean0.getMiddleName();
    java.lang.String str9 = vCardBean0.getFax();
    java.lang.String str10 = vCardBean0.getFax();
    java.lang.String str11 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test301"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    java.lang.String str4 = vCardBean0.getEmail();
    java.lang.String str5 = vCardBean0.getPhone();
    java.lang.String str6 = vCardBean0.getFax();
    java.lang.String str7 = vCardBean0.getVCard();
    java.lang.String str8 = vCardBean0.getTitle();
    java.lang.String str9 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test302"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setEmail("hi!");
    java.lang.String str5 = vCardBean0.getFormattedName();
    vCardBean0.setTitle("hi!");
    vCardBean0.setEmail("");
    vCardBean0.setTitle("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test303"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFax();
    java.lang.String str4 = vCardBean0.getEmail();
    vCardBean0.setOrganization("");
    java.lang.String str7 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test304"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getOrganization();
    java.lang.String str7 = vCardBean0.getMiddleName();
    java.lang.String str8 = vCardBean0.getEmail();
    vCardBean0.setFirstName("hi!");
    java.lang.String str11 = vCardBean0.getEmail();
    boolean b12 = vCardBean0.isValidVCard();
    boolean b13 = vCardBean0.isValidVCard();
    vCardBean0.setTitle("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setEmail("");
    java.lang.String str18 = vCardBean0.getMiddleName();
    java.lang.String str19 = vCardBean0.getOrganization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test305"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFirstName("hi!");
    java.lang.String str5 = vCardBean0.toString();
    java.lang.String str6 = vCardBean0.getPhone();
    java.lang.String str7 = vCardBean0.getVCard();
    boolean b8 = vCardBean0.isValidVCard();
    java.lang.String str9 = vCardBean0.getVCard();
    java.lang.String str10 = vCardBean0.getPhone();
    vCardBean0.setLastName("hi!");
    vCardBean0.setMiddleName("");
    vCardBean0.setFormattedName("hi!");
    java.lang.String str17 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test306"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getEmail();
    vCardBean0.setVCard("hi!");
    java.lang.String str11 = vCardBean0.toString();
    vCardBean0.setVCard("hi!");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setTitle("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str18 = vCardBean0.getFax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test307"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFormattedName("hi!");
    java.lang.String str5 = vCardBean0.getEmail();
    vCardBean0.setLastName("hi!");
    java.lang.String str8 = vCardBean0.getOrganization();
    java.lang.String str9 = vCardBean0.getFax();
    vCardBean0.setVCard("");
    vCardBean0.setFax("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test308"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    java.lang.String str6 = vCardBean0.getTitle();
    java.lang.String str7 = vCardBean0.getVCard();
    vCardBean0.setFirstName("hi!");
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
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
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test309"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getVCard();
    vCardBean0.setVCard("hi!");
    vCardBean0.setEmail("");
    java.lang.String str9 = vCardBean0.getLastName();
    java.lang.String str10 = vCardBean0.toString();
    vCardBean0.setFirstName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str13 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD"+ "'", str13.equals("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD"));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test310"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getTitle();
    java.lang.String str5 = vCardBean0.getOrganization();
    java.lang.String str6 = vCardBean0.getOrganization();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test311"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    vCardBean0.setOrganization("hi!");
    java.lang.String str6 = vCardBean0.getFirstName();
    vCardBean0.setLastName("");
    java.lang.String str9 = vCardBean0.getOrganization();
    vCardBean0.setLastName("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setVCard("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=FAX:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test312"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getEmail();
    vCardBean0.setPhone("hi!");
    java.lang.String str7 = vCardBean0.getLastName();
    java.lang.String str8 = vCardBean0.getFirstName();
    java.lang.String str9 = vCardBean0.getFax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test313"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    vCardBean0.setEmail("hi!");
    java.lang.String str6 = vCardBean0.getEmail();
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getLastName();
    vCardBean0.setTitle("");
    boolean b11 = vCardBean0.isValidVCard();
    java.lang.String str12 = vCardBean0.getFirstName();
    java.lang.String str13 = vCardBean0.getVCard();
    boolean b14 = vCardBean0.isValidVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test314"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getEmail();
    vCardBean0.setPhone("");
    vCardBean0.setMiddleName("");
    vCardBean0.setFirstName("");
    java.lang.String str10 = vCardBean0.toString();
    java.lang.String str11 = vCardBean0.getFax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test315"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getEmail();
    java.lang.String str4 = vCardBean0.getOrganization();
    vCardBean0.setMiddleName("");
    vCardBean0.setFormattedName("");
    java.lang.String str9 = vCardBean0.getFax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test316"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFirstName("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    java.lang.String str6 = vCardBean0.getOrganization();
    java.lang.String str7 = vCardBean0.getMiddleName();
    vCardBean0.setLastName("hi!");
    java.lang.String str10 = vCardBean0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test317"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str6 = vCardBean0.getLastName();
    java.lang.String str7 = vCardBean0.getFormattedName();
    java.lang.String str8 = vCardBean0.getEmail();
    java.lang.String str9 = vCardBean0.toString();
    vCardBean0.setMiddleName("");
    java.lang.String str12 = vCardBean0.getFormattedName();
    vCardBean0.setFax("");
    vCardBean0.setTitle("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setFirstName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str19 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test318"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setFax("");
    vCardBean0.setFax("hi!");
    java.lang.String str6 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str11 = vCardBean0.getOrganization();
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setTitle("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test319"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getEmail();
    vCardBean0.setPhone("hi!");
    java.lang.String str7 = vCardBean0.getFirstName();
    vCardBean0.setFormattedName("");
    java.lang.String str10 = vCardBean0.getFirstName();
    java.lang.String str11 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test320"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getOrganization();
    java.lang.String str7 = vCardBean0.getMiddleName();
    java.lang.String str8 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str13 = vCardBean0.getPhone();
    vCardBean0.setLastName("hi!");
    java.lang.String str16 = vCardBean0.getMiddleName();
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test321"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    java.lang.String str6 = vCardBean0.getVCard();
    java.lang.String str7 = vCardBean0.getEmail();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str10 = vCardBean0.getFax();
    java.lang.String str11 = vCardBean0.getFirstName();
    java.lang.String str12 = vCardBean0.toString();
    java.lang.String str13 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test322"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getEmail();
    java.lang.String str4 = vCardBean0.getOrganization();
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    vCardBean0.setFax("hi!");
    java.lang.String str10 = vCardBean0.toString();
    java.lang.String str11 = vCardBean0.getEmail();
    java.lang.String str12 = vCardBean0.getMiddleName();
    java.lang.String str13 = vCardBean0.getFormattedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test323"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.toString();
    vCardBean0.setVCard("");
    java.lang.String str10 = vCardBean0.getFormattedName();
    vCardBean0.setFirstName("hi!");
    java.lang.String str13 = vCardBean0.getVCard();
    java.lang.String str14 = vCardBean0.getEmail();
    vCardBean0.setFax("");
    vCardBean0.setVCard("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=FAX:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test324"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getEmail();
    vCardBean0.setVCard("hi!");
    java.lang.String str11 = vCardBean0.toString();
    java.lang.String str12 = vCardBean0.getTitle();
    vCardBean0.setFormattedName("");
    java.lang.String str15 = vCardBean0.getFax();
    java.lang.String str16 = vCardBean0.getMiddleName();
    java.lang.String str17 = vCardBean0.getMiddleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test325"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getFax();
    vCardBean0.setPhone("");
    vCardBean0.setVCard("");
    vCardBean0.setTitle("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str12 = vCardBean0.getEmail();
    java.lang.String str13 = vCardBean0.getLastName();
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test326"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setFax("");
    vCardBean0.setFax("hi!");
    java.lang.String str6 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str11 = vCardBean0.getOrganization();
    java.lang.String str12 = vCardBean0.getMiddleName();
    java.lang.String str13 = vCardBean0.getEmail();
    vCardBean0.setPhone("hi!");
    vCardBean0.setOrganization("");
    java.lang.String str18 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test327"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setPhone("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getPhone();
    java.lang.String str10 = vCardBean0.getVCard();
    vCardBean0.setPhone("hi!");
    boolean b13 = vCardBean0.isValidVCard();
    vCardBean0.setLastName("hi!");
    java.lang.String str16 = vCardBean0.getEmail();
    java.lang.String str17 = vCardBean0.getFormattedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test328"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.toString();
    vCardBean0.setFirstName("hi!");
    vCardBean0.setEmail("");
    java.lang.String str8 = vCardBean0.getLastName();
    vCardBean0.setEmail("");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=FAX:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test329"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setFormattedName("");
    vCardBean0.setPhone("");
    java.lang.String str9 = vCardBean0.getPhone();
    java.lang.String str10 = vCardBean0.getFirstName();
    java.lang.String str11 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test330"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getVCard();
    vCardBean0.setLastName("");
    vCardBean0.setFax("hi!");
    vCardBean0.setPhone("");
    vCardBean0.setMiddleName("");
    java.lang.String str12 = vCardBean0.getOrganization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test331"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getVCard();
    boolean b8 = vCardBean0.isValidVCard();
    vCardBean0.setFax("hi!");
    java.lang.String str11 = vCardBean0.getVCard();
    boolean b12 = vCardBean0.isValidVCard();
    java.lang.String str13 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test332"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.getFax();
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setFax("");
    vCardBean0.setPhone("");
    vCardBean0.setFax("");
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str21 = vCardBean0.getFax();
    vCardBean0.setEmail("hi!");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str26 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test333"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getOrganization();
    java.lang.String str7 = vCardBean0.getMiddleName();
    java.lang.String str8 = vCardBean0.getEmail();
    vCardBean0.setFirstName("hi!");
    vCardBean0.setVCard("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    vCardBean0.setFax("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str15 = vCardBean0.getFormattedName();
    java.lang.String str16 = vCardBean0.getFormattedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test334"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getOrganization();
    java.lang.String str7 = vCardBean0.getMiddleName();
    java.lang.String str8 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    vCardBean0.setOrganization("");
    java.lang.String str13 = vCardBean0.getPhone();
    java.lang.String str14 = vCardBean0.getFax();
    java.lang.String str15 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test335"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    java.lang.String str4 = vCardBean0.getMiddleName();
    java.lang.String str5 = vCardBean0.getFax();
    vCardBean0.setEmail("hi!");
    java.lang.String str8 = vCardBean0.getMiddleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test336"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setFormattedName("");
    boolean b7 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    java.lang.String str10 = vCardBean0.getLastName();
    java.lang.String str11 = vCardBean0.getLastName();
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN: \nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=FAX:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test337"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str6 = vCardBean0.getLastName();
    java.lang.String str7 = vCardBean0.getFormattedName();
    java.lang.String str8 = vCardBean0.getEmail();
    java.lang.String str9 = vCardBean0.toString();
    vCardBean0.setMiddleName("");
    java.lang.String str12 = vCardBean0.getVCard();
    java.lang.String str13 = vCardBean0.getVCard();
    java.lang.String str14 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test338"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str6 = vCardBean0.getLastName();
    java.lang.String str7 = vCardBean0.getFormattedName();
    java.lang.String str8 = vCardBean0.getEmail();
    java.lang.String str9 = vCardBean0.toString();
    java.lang.String str10 = vCardBean0.getFirstName();
    vCardBean0.setFax("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str13 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test339"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getTitle();
    java.lang.String str9 = vCardBean0.getVCard();
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setTitle("hi!");
    java.lang.String str14 = vCardBean0.getFormattedName();
    java.lang.String str15 = vCardBean0.toString();
    vCardBean0.setFax("hi!");
    vCardBean0.setTitle("hi!");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test340"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    vCardBean0.setFax("");
    vCardBean0.setPhone("hi!");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    java.lang.String str10 = vCardBean0.getPhone();
    vCardBean0.setOrganization("");
    vCardBean0.setTitle("BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test341"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getTitle();
    java.lang.String str5 = vCardBean0.getOrganization();
    vCardBean0.setFormattedName("");
    vCardBean0.setPhone("");
    vCardBean0.setLastName("");
    vCardBean0.setTitle("");
    java.lang.String str14 = vCardBean0.getFax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test342"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    java.lang.String str3 = vCardBean0.getLastName();
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setFax("hi!");
    vCardBean0.setFax("");
    vCardBean0.setPhone("");
    vCardBean0.setOrganization("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test343"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    vCardBean0.setFormattedName("hi!");
    java.lang.String str5 = vCardBean0.getPhone();
    boolean b6 = vCardBean0.isValidVCard();
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test344"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.toString();
    java.lang.String str9 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN: \nN:;;;\nORG:BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test345"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setMiddleName("");
    boolean b3 = vCardBean0.isValidVCard();
    boolean b4 = vCardBean0.isValidVCard();
    java.lang.String str5 = vCardBean0.getFormattedName();
    java.lang.String str6 = vCardBean0.getTitle();
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getVCard();
    java.lang.String str9 = vCardBean0.getLastName();
    java.lang.String str10 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test346"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("hi!");
    vCardBean0.setFax("");
    java.lang.String str9 = vCardBean0.getOrganization();
    java.lang.String str10 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test347"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setEmail("hi!");
    java.lang.String str5 = vCardBean0.getFormattedName();
    java.lang.String str6 = vCardBean0.getVCard();
    java.lang.String str7 = vCardBean0.getFirstName();
    java.lang.String str8 = vCardBean0.toString();
    boolean b9 = vCardBean0.isValidVCard();
    java.lang.String str10 = vCardBean0.getOrganization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test348"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getEmail();
    vCardBean0.setVCard("hi!");
    java.lang.String str11 = vCardBean0.toString();
    vCardBean0.setFax("hi!");
    vCardBean0.setFax("");
    vCardBean0.setOrganization("");
    java.lang.String str18 = vCardBean0.getPhone();
    java.lang.String str19 = vCardBean0.getPhone();
    vCardBean0.setPhone("BEGIN:VCARD\nFN:hi!\nN:;;BEGIN:VCARD\nFN:\nN:hi!;;hi!;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nEND:VCARD;\nTITLE:hi!\nORG:\nEMAIL;TYPE=INTERNET:\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

}
