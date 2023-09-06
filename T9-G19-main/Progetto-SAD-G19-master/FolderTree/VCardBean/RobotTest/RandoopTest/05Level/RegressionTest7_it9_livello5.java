
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
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    java.lang.String str6 = vCardBean0.getFormattedName();
    java.lang.String str7 = vCardBean0.getPhone();
    vCardBean0.setOrganization("");
    java.lang.String str10 = vCardBean0.getFormattedName();
    java.lang.String str11 = vCardBean0.getMiddleName();
    vCardBean0.setLastName("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    vCardBean0.setTitle("hi!");
    
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

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test002"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getLastName();
    java.lang.String str5 = vCardBean0.getEmail();
    java.lang.String str6 = vCardBean0.getVCard();
    java.lang.String str7 = vCardBean0.getPhone();
    vCardBean0.setEmail("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test003"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    java.lang.String str6 = vCardBean0.getFormattedName();
    java.lang.String str7 = vCardBean0.getPhone();
    vCardBean0.setOrganization("");
    java.lang.String str10 = vCardBean0.getFormattedName();
    java.lang.String str11 = vCardBean0.getFax();
    vCardBean0.setLastName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
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

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test004"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str9 = vCardBean0.getTitle();
    java.lang.String str10 = vCardBean0.getFax();
    vCardBean0.setEmail("hi!");
    vCardBean0.setTitle("hi!");
    java.lang.String str15 = vCardBean0.getMiddleName();
    java.lang.String str16 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test005"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    vCardBean0.setEmail("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setLastName("");
    vCardBean0.setOrganization("hi!");
    java.lang.String str14 = vCardBean0.getMiddleName();
    java.lang.String str15 = vCardBean0.getPhone();
    java.lang.String str16 = vCardBean0.getTitle();
    vCardBean0.setPhone("hi!");
    vCardBean0.setFax("");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test006"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    vCardBean0.setVCard("");
    vCardBean0.setTitle("hi!");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setTitle("hi!");
    boolean b12 = vCardBean0.isValidVCard();
    vCardBean0.setEmail("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test007"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getVCard();
    java.lang.String str9 = vCardBean0.getTitle();
    java.lang.String str10 = vCardBean0.getTitle();
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    java.lang.String str13 = vCardBean0.getEmail();
    vCardBean0.setPhone("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
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
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test008"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setPhone("");
    vCardBean0.setFax("hi!");
    boolean b5 = vCardBean0.isValidVCard();
    vCardBean0.setFax("");
    vCardBean0.setOrganization("");
    java.lang.String str10 = vCardBean0.toString();
    java.lang.String str11 = vCardBean0.getVCard();
    java.lang.String str12 = vCardBean0.toString();
    vCardBean0.setTitle("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test009"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getFormattedName();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test010"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    java.lang.String str4 = vCardBean0.getFax();
    vCardBean0.setFirstName("hi!");
    java.lang.String str7 = vCardBean0.getLastName();
    java.lang.String str8 = vCardBean0.toString();
    java.lang.String str9 = vCardBean0.toString();
    vCardBean0.setLastName("hi!");
    vCardBean0.setFirstName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=VOICE:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
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
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test011"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str9 = vCardBean0.getTitle();
    java.lang.String str10 = vCardBean0.getFax();
    boolean b11 = vCardBean0.isValidVCard();
    java.lang.String str12 = vCardBean0.toString();
    java.lang.String str13 = vCardBean0.getFirstName();
    vCardBean0.setLastName("hi!");
    java.lang.String str16 = vCardBean0.getVCard();
    vCardBean0.setLastName("hi!");
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN:hi!\nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test012"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setOrganization("");
    vCardBean0.setFax("");
    java.lang.String str10 = vCardBean0.getOrganization();
    java.lang.String str11 = vCardBean0.getTitle();
    java.lang.String str12 = vCardBean0.getFirstName();
    java.lang.String str13 = vCardBean0.getEmail();
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test013"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    java.lang.String str6 = vCardBean0.getFormattedName();
    boolean b7 = vCardBean0.isValidVCard();
    vCardBean0.setFirstName("");
    java.lang.String str10 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test014"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getOrganization();
    vCardBean0.setVCard("");
    java.lang.String str4 = vCardBean0.getFax();
    vCardBean0.setEmail("");
    vCardBean0.setVCard("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    java.lang.String str9 = vCardBean0.getOrganization();
    java.lang.String str10 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test015"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    vCardBean0.setOrganization("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    vCardBean0.setOrganization("");
    vCardBean0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test016"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    vCardBean0.setVCard("");
    vCardBean0.setEmail("hi!");
    vCardBean0.setEmail("hi!");
    java.lang.String str10 = vCardBean0.getPhone();
    vCardBean0.setFirstName("");
    java.lang.String str13 = vCardBean0.getFormattedName();
    vCardBean0.setMiddleName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test017"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getLastName();
    java.lang.String str5 = vCardBean0.getEmail();
    java.lang.String str6 = vCardBean0.getEmail();
    java.lang.String str7 = vCardBean0.getFirstName();
    vCardBean0.setPhone("hi!");
    vCardBean0.setLastName("hi!");
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test018"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getFormattedName();
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setFirstName("hi!");
    java.lang.String str9 = vCardBean0.getFirstName();
    vCardBean0.setFirstName("");
    vCardBean0.setFormattedName("hi!");
    java.lang.String str14 = vCardBean0.getTitle();
    vCardBean0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test019"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setLastName("hi!");
    vCardBean0.setOrganization("");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setTitle("hi!");
    java.lang.String str12 = vCardBean0.getEmail();
    vCardBean0.setOrganization("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test020"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getEmail();
    vCardBean0.setPhone("hi!");
    vCardBean0.setPhone("hi!");
    vCardBean0.setFax("");
    vCardBean0.setVCard("hi!");
    java.lang.String str13 = vCardBean0.getEmail();
    java.lang.String str14 = vCardBean0.toString();
    java.lang.String str15 = vCardBean0.getTitle();
    vCardBean0.setPhone("");
    java.lang.String str18 = vCardBean0.getFormattedName();
    vCardBean0.setLastName("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test021"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getOrganization();
    vCardBean0.setVCard("");
    java.lang.String str4 = vCardBean0.getTitle();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str7 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    java.lang.String str10 = vCardBean0.getLastName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str13 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
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
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test022"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    vCardBean0.setEmail("");
    java.lang.String str8 = vCardBean0.getFirstName();
    vCardBean0.setOrganization("");
    boolean b11 = vCardBean0.isValidVCard();
    java.lang.String str12 = vCardBean0.getVCard();
    java.lang.String str13 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test023"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getEmail();
    vCardBean0.setPhone("hi!");
    vCardBean0.setPhone("hi!");
    vCardBean0.setTitle("");
    java.lang.String str11 = vCardBean0.getLastName();
    java.lang.String str12 = vCardBean0.getFax();
    java.lang.String str13 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test024"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    vCardBean0.setFax("hi!");
    java.lang.String str7 = vCardBean0.toString();
    java.lang.String str8 = vCardBean0.getFax();
    java.lang.String str9 = vCardBean0.getFax();
    boolean b10 = vCardBean0.isValidVCard();
    vCardBean0.setTitle("");
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test025"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    java.lang.String str7 = vCardBean0.getFirstName();
    java.lang.String str8 = vCardBean0.toString();
    java.lang.String str9 = vCardBean0.toString();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
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
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test026"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getLastName();
    java.lang.String str5 = vCardBean0.getTitle();
    vCardBean0.setLastName("");
    vCardBean0.setOrganization("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test027"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getLastName();
    java.lang.String str5 = vCardBean0.getEmail();
    java.lang.String str6 = vCardBean0.getEmail();
    vCardBean0.setPhone("hi!");
    java.lang.String str9 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test028"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getFormattedName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str7 = vCardBean0.getMiddleName();
    java.lang.String str8 = vCardBean0.getFirstName();
    java.lang.String str9 = vCardBean0.getLastName();
    vCardBean0.setFirstName("hi!");
    vCardBean0.setFirstName("");
    java.lang.String str14 = vCardBean0.getTitle();
    vCardBean0.setFirstName("");
    vCardBean0.setFax("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    java.lang.String str19 = vCardBean0.getFax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD"+ "'", str19.equals("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test029"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getPhone();
    java.lang.String str10 = vCardBean0.getEmail();
    vCardBean0.setMiddleName("");
    boolean b13 = vCardBean0.isValidVCard();
    java.lang.String str14 = vCardBean0.getVCard();
    boolean b15 = vCardBean0.isValidVCard();
    java.lang.String str16 = vCardBean0.getTitle();
    vCardBean0.setFax("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test030"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    vCardBean0.setOrganization("");
    vCardBean0.setVCard("hi!");
    vCardBean0.setVCard("");
    vCardBean0.setPhone("");
    vCardBean0.setLastName("");
    vCardBean0.setVCard("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test031"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    java.lang.String str6 = vCardBean0.getFormattedName();
    java.lang.String str7 = vCardBean0.getFirstName();
    vCardBean0.setEmail("hi!");
    java.lang.String str10 = vCardBean0.getFirstName();
    vCardBean0.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test032"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str9 = vCardBean0.getTitle();
    java.lang.String str10 = vCardBean0.getVCard();
    java.lang.String str11 = vCardBean0.getPhone();
    java.lang.String str12 = vCardBean0.toString();
    vCardBean0.setFax("");
    vCardBean0.setPhone("hi!");
    vCardBean0.setFax("hi!");
    java.lang.String str19 = vCardBean0.toString();
    boolean b20 = vCardBean0.isValidVCard();
    java.lang.String str21 = vCardBean0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test033"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    vCardBean0.setFax("hi!");
    java.lang.String str7 = vCardBean0.toString();
    java.lang.String str8 = vCardBean0.getFax();
    java.lang.String str9 = vCardBean0.getOrganization();
    java.lang.String str10 = vCardBean0.toString();
    java.lang.String str11 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test034"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getOrganization();
    vCardBean0.setFormattedName("");
    vCardBean0.setTitle("");
    java.lang.String str6 = vCardBean0.getPhone();
    java.lang.String str7 = vCardBean0.getVCard();
    java.lang.String str8 = vCardBean0.getLastName();
    vCardBean0.setFirstName("hi!");
    vCardBean0.setFormattedName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test035"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setLastName("hi!");
    java.lang.String str6 = vCardBean0.getFormattedName();
    java.lang.String str7 = vCardBean0.getLastName();
    java.lang.String str8 = vCardBean0.getFirstName();
    
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
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test036"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    java.lang.String str7 = vCardBean0.getLastName();
    java.lang.String str8 = vCardBean0.toString();
    vCardBean0.setPhone("hi!");
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setOrganization("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test037"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setOrganization("");
    vCardBean0.setFax("");
    java.lang.String str10 = vCardBean0.getEmail();
    vCardBean0.setTitle("BEGIN:VCARD\nFN:hi!\nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    java.lang.String str13 = vCardBean0.getOrganization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test038"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setFirstName("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getTitle();
    vCardBean0.setPhone("hi!");
    java.lang.String str12 = vCardBean0.toString();
    java.lang.String str13 = vCardBean0.getEmail();
    boolean b14 = vCardBean0.isValidVCard();
    vCardBean0.setFirstName("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test039"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str9 = vCardBean0.getTitle();
    java.lang.String str10 = vCardBean0.toString();
    java.lang.String str11 = vCardBean0.getLastName();
    vCardBean0.setOrganization("");
    java.lang.String str14 = vCardBean0.getMiddleName();
    java.lang.String str15 = vCardBean0.getTitle();
    java.lang.String str16 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test040"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    vCardBean0.setFax("hi!");
    java.lang.String str7 = vCardBean0.toString();
    java.lang.String str8 = vCardBean0.getFax();
    java.lang.String str9 = vCardBean0.getFax();
    vCardBean0.setTitle("hi!");
    java.lang.String str12 = vCardBean0.getMiddleName();
    vCardBean0.setTitle("");
    vCardBean0.setFax("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test041"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getTitle();
    vCardBean0.setFormattedName("");
    java.lang.String str9 = vCardBean0.toString();
    vCardBean0.setFirstName("");
    java.lang.String str12 = vCardBean0.getLastName();
    vCardBean0.setLastName("hi!");
    java.lang.String str15 = vCardBean0.getLastName();
    vCardBean0.setVCard("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    boolean b18 = vCardBean0.isValidVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test042"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setFirstName("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getTitle();
    java.lang.String str10 = vCardBean0.getPhone();
    java.lang.String str11 = vCardBean0.toString();
    vCardBean0.setLastName("hi!");
    java.lang.String str14 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    java.lang.String str17 = vCardBean0.getMiddleName();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test043"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    vCardBean0.setOrganization("");
    vCardBean0.setVCard("hi!");
    boolean b10 = vCardBean0.isValidVCard();
    java.lang.String str11 = vCardBean0.getFax();
    java.lang.String str12 = vCardBean0.getTitle();
    java.lang.String str13 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test044"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    java.lang.String str6 = vCardBean0.getFormattedName();
    java.lang.String str7 = vCardBean0.getPhone();
    vCardBean0.setFirstName("");
    vCardBean0.setPhone("hi!");
    java.lang.String str12 = vCardBean0.toString();
    vCardBean0.setFax("");
    java.lang.String str15 = vCardBean0.getEmail();
    vCardBean0.setFax("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    java.lang.String str18 = vCardBean0.getFax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD"+ "'", str18.equals("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD"));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test045"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getOrganization();
    vCardBean0.setVCard("");
    java.lang.String str4 = vCardBean0.getTitle();
    vCardBean0.setVCard("hi!");
    vCardBean0.setFax("");
    vCardBean0.setLastName("hi!");
    boolean b11 = vCardBean0.isValidVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test046"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getPhone();
    java.lang.String str10 = vCardBean0.getEmail();
    vCardBean0.setMiddleName("");
    boolean b13 = vCardBean0.isValidVCard();
    java.lang.String str14 = vCardBean0.getPhone();
    vCardBean0.setVCard("");
    java.lang.String str17 = vCardBean0.getPhone();
    java.lang.String str18 = vCardBean0.getEmail();
    java.lang.String str19 = vCardBean0.getFax();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test047"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setEmail("hi!");
    java.lang.String str5 = vCardBean0.toString();
    vCardBean0.setFirstName("");
    java.lang.String str8 = vCardBean0.getMiddleName();
    vCardBean0.setPhone("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test048"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    vCardBean0.setOrganization("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    boolean b8 = vCardBean0.isValidVCard();
    vCardBean0.setVCard("hi!");
    vCardBean0.setFirstName("hi!");
    java.lang.String str13 = vCardBean0.getFirstName();
    vCardBean0.setPhone("hi!");
    java.lang.String str16 = vCardBean0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test049"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getLastName();
    java.lang.String str5 = vCardBean0.getEmail();
    java.lang.String str6 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test050"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setLastName("hi!");
    vCardBean0.setOrganization("");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setTitle("hi!");
    vCardBean0.setFirstName("");
    java.lang.String str14 = vCardBean0.getVCard();
    java.lang.String str15 = vCardBean0.getFirstName();
    java.lang.String str16 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD"+ "'", str14.equals("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD"+ "'", str16.equals("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test051"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getOrganization();
    java.lang.String str2 = vCardBean0.toString();
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setVCard("");
    vCardBean0.setFax("hi!");
    java.lang.String str9 = vCardBean0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test052"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    vCardBean0.setVCard("");
    vCardBean0.setTitle("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str10 = vCardBean0.getOrganization();
    java.lang.String str11 = vCardBean0.getLastName();
    java.lang.String str12 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test053"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getFax();
    java.lang.String str9 = vCardBean0.getFormattedName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str12 = vCardBean0.getFirstName();
    java.lang.String str13 = vCardBean0.getFormattedName();
    java.lang.String str14 = vCardBean0.getMiddleName();
    vCardBean0.setTitle("hi!");
    vCardBean0.setTitle("hi!");
    java.lang.String str19 = vCardBean0.getLastName();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test054"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.toString();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str4 = vCardBean0.getEmail();
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test055"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str9 = vCardBean0.getTitle();
    java.lang.String str10 = vCardBean0.getVCard();
    java.lang.String str11 = vCardBean0.getPhone();
    java.lang.String str12 = vCardBean0.toString();
    java.lang.String str13 = vCardBean0.getFirstName();
    java.lang.String str14 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test056"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    java.lang.String str6 = vCardBean0.getTitle();
    vCardBean0.setMiddleName("");
    java.lang.String str9 = vCardBean0.getVCard();
    java.lang.String str10 = vCardBean0.getMiddleName();
    java.lang.String str11 = vCardBean0.getLastName();
    java.lang.String str12 = vCardBean0.getLastName();
    vCardBean0.setLastName("");
    java.lang.String str15 = vCardBean0.getVCard();
    vCardBean0.setFax("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test057"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    java.lang.String str7 = vCardBean0.getLastName();
    java.lang.String str8 = vCardBean0.getFax();
    vCardBean0.setTitle("hi!");
    vCardBean0.setMiddleName("");
    java.lang.String str13 = vCardBean0.getTitle();
    java.lang.String str14 = vCardBean0.getOrganization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test058"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setLastName("hi!");
    vCardBean0.setOrganization("");
    java.lang.String str8 = vCardBean0.getMiddleName();
    java.lang.String str9 = vCardBean0.getVCard();
    vCardBean0.setLastName("");
    java.lang.String str12 = vCardBean0.getFormattedName();
    vCardBean0.setTitle("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test059"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getFax();
    java.lang.String str9 = vCardBean0.toString();
    boolean b10 = vCardBean0.isValidVCard();
    java.lang.String str11 = vCardBean0.getOrganization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test060"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getFirstName();
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=VOICE:hi!\nEND:VCARD");
    java.lang.String str11 = vCardBean0.getOrganization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test061"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getLastName();
    java.lang.String str5 = vCardBean0.getEmail();
    java.lang.String str6 = vCardBean0.getEmail();
    java.lang.String str7 = vCardBean0.getFirstName();
    java.lang.String str8 = vCardBean0.getPhone();
    java.lang.String str9 = vCardBean0.getOrganization();
    java.lang.String str10 = vCardBean0.toString();
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setLastName("");
    java.lang.String str15 = vCardBean0.getFormattedName();
    vCardBean0.setVCard("");
    vCardBean0.setFirstName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test062"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getVCard();
    java.lang.String str9 = vCardBean0.getVCard();
    boolean b10 = vCardBean0.isValidVCard();
    java.lang.String str11 = vCardBean0.getFormattedName();
    java.lang.String str12 = vCardBean0.getLastName();
    java.lang.String str13 = vCardBean0.getPhone();
    vCardBean0.setVCard("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test063"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    vCardBean0.setOrganization("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    boolean b8 = vCardBean0.isValidVCard();
    vCardBean0.setFirstName("");
    java.lang.String str11 = vCardBean0.getFirstName();
    vCardBean0.setVCard("hi!");
    java.lang.String str14 = vCardBean0.getLastName();
    vCardBean0.setPhone("hi!");
    vCardBean0.setFax("hi!");
    vCardBean0.setPhone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test064"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str9 = vCardBean0.getTitle();
    vCardBean0.setMiddleName("");
    java.lang.String str12 = vCardBean0.getFormattedName();
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    java.lang.String str15 = vCardBean0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test065"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getTitle();
    java.lang.String str7 = vCardBean0.getLastName();
    java.lang.String str8 = vCardBean0.getEmail();
    vCardBean0.setEmail("hi!");
    vCardBean0.setPhone("");
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setLastName("hi!");
    vCardBean0.setEmail("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    vCardBean0.setEmail("hi!");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    vCardBean0.setTitle("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test066"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getOrganization();
    java.lang.String str2 = vCardBean0.getFormattedName();
    vCardBean0.setTitle("BEGIN:VCARD\nFN:hi!\nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test067"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getEmail();
    vCardBean0.setPhone("hi!");
    vCardBean0.setPhone("hi!");
    vCardBean0.setTitle("");
    java.lang.String str11 = vCardBean0.getVCard();
    java.lang.String str12 = vCardBean0.getMiddleName();
    vCardBean0.setEmail("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    vCardBean0.setLastName("BEGIN:VCARD\nFN:hi!\nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test068"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str9 = vCardBean0.getTitle();
    java.lang.String str10 = vCardBean0.getFax();
    boolean b11 = vCardBean0.isValidVCard();
    vCardBean0.setFirstName("");
    vCardBean0.setTitle("hi!");
    vCardBean0.setLastName("");
    boolean b18 = vCardBean0.isValidVCard();
    vCardBean0.setLastName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    boolean b21 = vCardBean0.isValidVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test069"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getOrganization();
    vCardBean0.setTitle("");
    java.lang.String str4 = vCardBean0.getEmail();
    java.lang.String str5 = vCardBean0.getPhone();
    java.lang.String str6 = vCardBean0.getEmail();
    boolean b7 = vCardBean0.isValidVCard();
    boolean b8 = vCardBean0.isValidVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test070"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    vCardBean0.setOrganization("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getVCard();
    java.lang.String str9 = vCardBean0.toString();
    vCardBean0.setOrganization("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
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
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test071"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    java.lang.String str9 = vCardBean0.getFirstName();
    java.lang.String str10 = vCardBean0.getFormattedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test072"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    java.lang.String str4 = vCardBean0.getFirstName();
    java.lang.String str5 = vCardBean0.getOrganization();
    vCardBean0.setTitle("hi!");
    java.lang.String str8 = vCardBean0.getFormattedName();
    java.lang.String str9 = vCardBean0.getFirstName();
    vCardBean0.setFax("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
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
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test073"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setTitle("");
    boolean b11 = vCardBean0.isValidVCard();
    vCardBean0.setEmail("");
    java.lang.String str14 = vCardBean0.getOrganization();
    java.lang.String str15 = vCardBean0.getMiddleName();
    java.lang.String str16 = vCardBean0.toString();
    vCardBean0.setFax("hi!");
    vCardBean0.setFax("");
    vCardBean0.setTitle("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test074"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getVCard();
    java.lang.String str9 = vCardBean0.getVCard();
    boolean b10 = vCardBean0.isValidVCard();
    java.lang.String str11 = vCardBean0.getFormattedName();
    java.lang.String str12 = vCardBean0.getLastName();
    java.lang.String str13 = vCardBean0.getLastName();
    java.lang.String str14 = vCardBean0.getEmail();
    java.lang.String str15 = vCardBean0.getTitle();
    vCardBean0.setPhone("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
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

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test075"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    boolean b2 = vCardBean0.isValidVCard();
    java.lang.String str3 = vCardBean0.getVCard();
    vCardBean0.setPhone("");
    vCardBean0.setPhone("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    vCardBean0.setLastName("BEGIN:VCARD\nFN:hi!\nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test076"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    java.lang.String str6 = vCardBean0.getOrganization();
    java.lang.String str7 = vCardBean0.getFirstName();
    java.lang.String str8 = vCardBean0.toString();
    vCardBean0.setEmail("");
    java.lang.String str11 = vCardBean0.getFirstName();
    
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

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test077"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    java.lang.String str7 = vCardBean0.getFirstName();
    java.lang.String str8 = vCardBean0.getMiddleName();
    java.lang.String str9 = vCardBean0.getMiddleName();
    vCardBean0.setTitle("hi!");
    java.lang.String str12 = vCardBean0.getFormattedName();
    java.lang.String str13 = vCardBean0.getPhone();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test078"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.toString();
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.toString();
    java.lang.String str6 = vCardBean0.getFirstName();
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getFax();
    java.lang.String str9 = vCardBean0.getEmail();
    
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test079"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    vCardBean0.setFax("hi!");
    java.lang.String str7 = vCardBean0.toString();
    java.lang.String str8 = vCardBean0.getFax();
    java.lang.String str9 = vCardBean0.getOrganization();
    vCardBean0.setFirstName("hi!");
    java.lang.String str12 = vCardBean0.getFormattedName();
    java.lang.String str13 = vCardBean0.getEmail();
    vCardBean0.setVCard("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test080"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    java.lang.String str6 = vCardBean0.getTitle();
    vCardBean0.setMiddleName("");
    java.lang.String str9 = vCardBean0.getVCard();
    java.lang.String str10 = vCardBean0.getMiddleName();
    java.lang.String str11 = vCardBean0.getLastName();
    boolean b12 = vCardBean0.isValidVCard();
    java.lang.String str13 = vCardBean0.getFirstName();
    vCardBean0.setOrganization("");
    vCardBean0.setFax("hi!");
    vCardBean0.setTitle("hi!");
    java.lang.String str20 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test081"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getLastName();
    vCardBean0.setFormattedName("");
    java.lang.String str7 = vCardBean0.getFormattedName();
    vCardBean0.setOrganization("hi!");
    vCardBean0.setLastName("BEGIN:VCARD\nFN:hi!\nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    java.lang.String str12 = vCardBean0.getOrganization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test082"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    java.lang.String str6 = vCardBean0.getFormattedName();
    java.lang.String str7 = vCardBean0.getPhone();
    vCardBean0.setPhone("");
    vCardBean0.setFirstName("");
    java.lang.String str12 = vCardBean0.getLastName();
    java.lang.String str13 = vCardBean0.getVCard();
    java.lang.String str14 = vCardBean0.getTitle();
    java.lang.String str15 = vCardBean0.getPhone();
    java.lang.String str16 = vCardBean0.getOrganization();
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test083"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getVCard();
    vCardBean0.setOrganization("hi!");
    java.lang.String str11 = vCardBean0.getPhone();
    vCardBean0.setFax("");
    vCardBean0.setFirstName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test084"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getOrganization();
    java.lang.String str2 = vCardBean0.getMiddleName();
    java.lang.String str3 = vCardBean0.getLastName();
    java.lang.String str4 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test085"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.toString();
    java.lang.String str4 = vCardBean0.getTitle();
    boolean b5 = vCardBean0.isValidVCard();
    java.lang.String str6 = vCardBean0.getPhone();
    vCardBean0.setPhone("");
    java.lang.String str9 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test086"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getLastName();
    java.lang.String str5 = vCardBean0.getTitle();
    vCardBean0.setFormattedName("");
    java.lang.String str8 = vCardBean0.getVCard();
    vCardBean0.setFax("hi!");
    vCardBean0.setFormattedName("");
    java.lang.String str13 = vCardBean0.getFormattedName();
    java.lang.String str14 = vCardBean0.getOrganization();
    vCardBean0.setMiddleName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test087"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    java.lang.String str6 = vCardBean0.getPhone();
    vCardBean0.setOrganization("hi!");
    java.lang.String str9 = vCardBean0.getVCard();
    vCardBean0.setTitle("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
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
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test088"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    vCardBean0.setOrganization("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    boolean b8 = vCardBean0.isValidVCard();
    java.lang.String str9 = vCardBean0.getLastName();
    java.lang.String str10 = vCardBean0.toString();
    java.lang.String str11 = vCardBean0.getMiddleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test089"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getEmail();
    vCardBean0.setPhone("hi!");
    vCardBean0.setPhone("hi!");
    vCardBean0.setTitle("");
    java.lang.String str11 = vCardBean0.getVCard();
    vCardBean0.setVCard("");
    vCardBean0.setTitle("");
    java.lang.String str16 = vCardBean0.getPhone();
    java.lang.String str17 = vCardBean0.getFax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test090"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    vCardBean0.setEmail("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getPhone();
    java.lang.String str10 = vCardBean0.toString();
    boolean b11 = vCardBean0.isValidVCard();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
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
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test091"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getLastName();
    vCardBean0.setFirstName("hi!");
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    java.lang.String str11 = vCardBean0.getOrganization();
    java.lang.String str12 = vCardBean0.getLastName();
    java.lang.String str13 = vCardBean0.getPhone();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=VOICE:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test092"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getLastName();
    vCardBean0.setFirstName("hi!");
    vCardBean0.setFormattedName("");
    vCardBean0.setVCard("hi!");
    vCardBean0.setFirstName("");
    java.lang.String str13 = vCardBean0.getVCard();
    vCardBean0.setPhone("");
    java.lang.String str16 = vCardBean0.toString();
    vCardBean0.setOrganization("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test093"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setMiddleName("hi!");
    boolean b9 = vCardBean0.isValidVCard();
    java.lang.String str10 = vCardBean0.getFirstName();
    vCardBean0.setFormattedName("");
    java.lang.String str13 = vCardBean0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test094"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getTitle();
    java.lang.String str7 = vCardBean0.getVCard();
    java.lang.String str8 = vCardBean0.getPhone();
    java.lang.String str9 = vCardBean0.getLastName();
    java.lang.String str10 = vCardBean0.getOrganization();
    vCardBean0.setEmail("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
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

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test095"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    vCardBean0.setVCard("");
    vCardBean0.setEmail("hi!");
    vCardBean0.setLastName("hi!");
    vCardBean0.setFormattedName("");
    java.lang.String str12 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test096"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    java.lang.String str6 = vCardBean0.getFormattedName();
    java.lang.String str7 = vCardBean0.getPhone();
    vCardBean0.setPhone("");
    java.lang.String str10 = vCardBean0.getVCard();
    java.lang.String str11 = vCardBean0.getFax();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str14 = vCardBean0.getTitle();
    java.lang.String str15 = vCardBean0.getLastName();
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    vCardBean0.setVCard("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test097"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getFax();
    vCardBean0.setPhone("hi!");
    vCardBean0.setFormattedName("");
    vCardBean0.setEmail("hi!");
    java.lang.String str15 = vCardBean0.getFirstName();
    boolean b16 = vCardBean0.isValidVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test098"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.toString();
    java.lang.String str4 = vCardBean0.getEmail();
    vCardBean0.setVCard("hi!");
    boolean b7 = vCardBean0.isValidVCard();
    vCardBean0.setEmail("hi!");
    java.lang.String str10 = vCardBean0.getPhone();
    java.lang.String str11 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test099"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    java.lang.String str6 = vCardBean0.getFormattedName();
    java.lang.String str7 = vCardBean0.getOrganization();
    java.lang.String str8 = vCardBean0.getOrganization();
    vCardBean0.setFirstName("hi!");
    java.lang.String str11 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test100"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str9 = vCardBean0.getTitle();
    java.lang.String str10 = vCardBean0.getFax();
    vCardBean0.setEmail("hi!");
    java.lang.String str13 = vCardBean0.getLastName();
    java.lang.String str14 = vCardBean0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test101"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    java.lang.String str7 = vCardBean0.getFirstName();
    vCardBean0.setTitle("hi!");
    java.lang.String str10 = vCardBean0.getFirstName();
    java.lang.String str11 = vCardBean0.getMiddleName();
    vCardBean0.setLastName("hi!");
    vCardBean0.setFirstName("");
    vCardBean0.setFax("hi!");
    vCardBean0.setVCard("");
    java.lang.String str20 = vCardBean0.getFormattedName();
    
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
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test102"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setFirstName("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getTitle();
    java.lang.String str10 = vCardBean0.getPhone();
    java.lang.String str11 = vCardBean0.getFax();
    java.lang.String str12 = vCardBean0.getTitle();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test103"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    java.lang.String str6 = vCardBean0.getVCard();
    java.lang.String str7 = vCardBean0.getEmail();
    boolean b8 = vCardBean0.isValidVCard();
    java.lang.String str9 = vCardBean0.getFormattedName();
    vCardBean0.setFirstName("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    vCardBean0.setMiddleName("");
    vCardBean0.setEmail("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test104"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    java.lang.String str6 = vCardBean0.getFormattedName();
    vCardBean0.setFax("");
    java.lang.String str9 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test105"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getFirstName();
    vCardBean0.setEmail("");
    vCardBean0.setMiddleName("");
    java.lang.String str13 = vCardBean0.getLastName();
    java.lang.String str14 = vCardBean0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test106"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getTitle();
    java.lang.String str7 = vCardBean0.getLastName();
    java.lang.String str8 = vCardBean0.getEmail();
    java.lang.String str9 = vCardBean0.getEmail();
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setEmail("BEGIN:VCARD\nFN:hi!\nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test107"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str9 = vCardBean0.getTitle();
    java.lang.String str10 = vCardBean0.getVCard();
    vCardBean0.setLastName("hi!");
    java.lang.String str13 = vCardBean0.getLastName();
    java.lang.String str14 = vCardBean0.getVCard();
    java.lang.String str15 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test108"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setLastName("hi!");
    java.lang.String str6 = vCardBean0.getEmail();
    java.lang.String str7 = vCardBean0.getPhone();
    java.lang.String str8 = vCardBean0.getVCard();
    java.lang.String str9 = vCardBean0.getFirstName();
    java.lang.String str10 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test109"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getFax();
    java.lang.String str9 = vCardBean0.getFormattedName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str12 = vCardBean0.getFirstName();
    java.lang.String str13 = vCardBean0.getFormattedName();
    vCardBean0.setPhone("hi!");
    java.lang.String str16 = vCardBean0.getVCard();
    java.lang.String str17 = vCardBean0.toString();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test110"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getTitle();
    vCardBean0.setFormattedName("");
    java.lang.String str9 = vCardBean0.toString();
    vCardBean0.setFirstName("");
    java.lang.String str12 = vCardBean0.getLastName();
    vCardBean0.setLastName("hi!");
    java.lang.String str15 = vCardBean0.getLastName();
    java.lang.String str16 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test111"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    java.lang.String str7 = vCardBean0.getLastName();
    java.lang.String str8 = vCardBean0.toString();
    vCardBean0.setPhone("hi!");
    java.lang.String str11 = vCardBean0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test112"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.toString();
    java.lang.String str4 = vCardBean0.getEmail();
    vCardBean0.setVCard("hi!");
    vCardBean0.setMiddleName("hi!");
    boolean b9 = vCardBean0.isValidVCard();
    java.lang.String str10 = vCardBean0.getOrganization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test113"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getTitle();
    vCardBean0.setFormattedName("");
    java.lang.String str9 = vCardBean0.toString();
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setFax("hi!");
    vCardBean0.setFax("");
    java.lang.String str16 = vCardBean0.getMiddleName();
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN:hi!\nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test114"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    java.lang.String str6 = vCardBean0.getFormattedName();
    boolean b7 = vCardBean0.isValidVCard();
    java.lang.String str8 = vCardBean0.getEmail();
    java.lang.String str9 = vCardBean0.toString();
    vCardBean0.setFax("hi!");
    vCardBean0.setEmail("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test115"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    vCardBean0.setOrganization("");
    vCardBean0.setVCard("hi!");
    boolean b10 = vCardBean0.isValidVCard();
    vCardBean0.setFormattedName("");
    vCardBean0.setMiddleName("");
    java.lang.String str15 = vCardBean0.getFirstName();
    java.lang.String str16 = vCardBean0.toString();
    java.lang.String str17 = vCardBean0.getFormattedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test116"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setEmail("hi!");
    java.lang.String str5 = vCardBean0.getFormattedName();
    java.lang.String str6 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test117"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getEmail();
    vCardBean0.setPhone("hi!");
    vCardBean0.setPhone("hi!");
    java.lang.String str9 = vCardBean0.getFormattedName();
    java.lang.String str10 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test118"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getOrganization();
    vCardBean0.setTitle("");
    java.lang.String str4 = vCardBean0.getEmail();
    java.lang.String str5 = vCardBean0.getPhone();
    java.lang.String str6 = vCardBean0.getEmail();
    vCardBean0.setEmail("");
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=VOICE:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test119"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    java.lang.String str4 = vCardBean0.getFax();
    vCardBean0.setFirstName("hi!");
    java.lang.String str7 = vCardBean0.getLastName();
    java.lang.String str8 = vCardBean0.toString();
    vCardBean0.setPhone("");
    boolean b11 = vCardBean0.isValidVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test120"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    vCardBean0.setTitle("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    vCardBean0.setPhone("");
    java.lang.String str8 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test121"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setFax("hi!");
    vCardBean0.setEmail("BEGIN:VCARD\nFN:hi!\nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    vCardBean0.setTitle("BEGIN:VCARD\nFN:hi!\nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test122"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    vCardBean0.setOrganization("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getFirstName();
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("");
    vCardBean0.setFax("");
    java.lang.String str15 = vCardBean0.getFax();
    java.lang.String str16 = vCardBean0.getTitle();
    java.lang.String str17 = vCardBean0.getLastName();
    boolean b18 = vCardBean0.isValidVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test123"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getOrganization();
    java.lang.String str9 = vCardBean0.getLastName();
    java.lang.String str10 = vCardBean0.getOrganization();
    java.lang.String str11 = vCardBean0.toString();
    vCardBean0.setMiddleName("");
    vCardBean0.setFormattedName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test124"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    vCardBean0.setFax("hi!");
    java.lang.String str7 = vCardBean0.toString();
    java.lang.String str8 = vCardBean0.getFax();
    java.lang.String str9 = vCardBean0.getFax();
    vCardBean0.setTitle("hi!");
    boolean b12 = vCardBean0.isValidVCard();
    vCardBean0.setOrganization("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test125"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getFax();
    java.lang.String str9 = vCardBean0.getVCard();
    vCardBean0.setFax("");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test126"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    java.lang.String str6 = vCardBean0.getFormattedName();
    java.lang.String str7 = vCardBean0.getPhone();
    vCardBean0.setPhone("");
    vCardBean0.setMiddleName("");
    java.lang.String str12 = vCardBean0.getFormattedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test127"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    java.lang.String str6 = vCardBean0.getOrganization();
    java.lang.String str7 = vCardBean0.getFirstName();
    java.lang.String str8 = vCardBean0.toString();
    vCardBean0.setOrganization("hi!");
    java.lang.String str11 = vCardBean0.getTitle();
    
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

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test128"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    vCardBean0.setEmail("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getPhone();
    java.lang.String str10 = vCardBean0.toString();
    java.lang.String str11 = vCardBean0.getFormattedName();
    vCardBean0.setEmail("");
    vCardBean0.setLastName("");
    vCardBean0.setTitle("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test129"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setFirstName("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getTitle();
    vCardBean0.setTitle("hi!");
    vCardBean0.setMiddleName("");
    vCardBean0.setFormattedName("");
    java.lang.String str16 = vCardBean0.getVCard();
    java.lang.String str17 = vCardBean0.getTitle();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test130"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    vCardBean0.setFax("hi!");
    java.lang.String str7 = vCardBean0.toString();
    java.lang.String str8 = vCardBean0.getFax();
    java.lang.String str9 = vCardBean0.getOrganization();
    vCardBean0.setFirstName("hi!");
    java.lang.String str12 = vCardBean0.getFormattedName();
    java.lang.String str13 = vCardBean0.getMiddleName();
    vCardBean0.setFirstName("");
    java.lang.String str16 = vCardBean0.getFirstName();
    vCardBean0.setTitle("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:hi!\nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test131"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setPhone("");
    java.lang.String str3 = vCardBean0.getVCard();
    vCardBean0.setTitle("");
    java.lang.String str6 = vCardBean0.getFirstName();
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test132"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setFirstName("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getTitle();
    java.lang.String str10 = vCardBean0.getPhone();
    vCardBean0.setMiddleName("");
    java.lang.String str13 = vCardBean0.getFirstName();
    vCardBean0.setTitle("");
    java.lang.String str16 = vCardBean0.getLastName();
    vCardBean0.setMiddleName("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test133"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getTitle();
    vCardBean0.setEmail("hi!");
    boolean b7 = vCardBean0.isValidVCard();
    vCardBean0.setOrganization("");
    java.lang.String str10 = vCardBean0.getFirstName();
    vCardBean0.setPhone("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test134"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setLastName("hi!");
    java.lang.String str6 = vCardBean0.getEmail();
    java.lang.String str7 = vCardBean0.getPhone();
    vCardBean0.setFax("");
    vCardBean0.setMiddleName("");
    vCardBean0.setVCard("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test135"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getEmail();
    java.lang.String str5 = vCardBean0.getOrganization();
    vCardBean0.setMiddleName("hi!");
    java.lang.String str8 = vCardBean0.getEmail();
    java.lang.String str9 = vCardBean0.getMiddleName();
    vCardBean0.setOrganization("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test136"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getTitle();
    java.lang.String str7 = vCardBean0.getVCard();
    java.lang.String str8 = vCardBean0.getPhone();
    java.lang.String str9 = vCardBean0.getLastName();
    java.lang.String str10 = vCardBean0.getOrganization();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
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

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test137"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getTitle();
    java.lang.String str7 = vCardBean0.getLastName();
    vCardBean0.setFirstName("");
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setFirstName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test138"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    vCardBean0.setEmail("");
    java.lang.String str8 = vCardBean0.getFirstName();
    java.lang.String str9 = vCardBean0.toString();
    java.lang.String str10 = vCardBean0.getFax();
    java.lang.String str11 = vCardBean0.getTitle();
    java.lang.String str12 = vCardBean0.getFormattedName();
    java.lang.String str13 = vCardBean0.getVCard();
    vCardBean0.setPhone("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test139"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("");
    vCardBean0.setOrganization("");
    java.lang.String str7 = vCardBean0.toString();
    vCardBean0.setTitle("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test140"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    vCardBean0.setEmail("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getPhone();
    java.lang.String str10 = vCardBean0.toString();
    java.lang.String str11 = vCardBean0.getTitle();
    java.lang.String str12 = vCardBean0.getFormattedName();
    java.lang.String str13 = vCardBean0.getPhone();
    vCardBean0.setEmail("");
    java.lang.String str16 = vCardBean0.getLastName();
    vCardBean0.setLastName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test141"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    vCardBean0.setOrganization("hi!");
    vCardBean0.setTitle("hi!");
    java.lang.String str9 = vCardBean0.getPhone();
    java.lang.String str10 = vCardBean0.getFirstName();
    vCardBean0.setVCard("hi!");
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    vCardBean0.setVCard("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test142"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    java.lang.String str7 = vCardBean0.getLastName();
    java.lang.String str8 = vCardBean0.getFax();
    vCardBean0.setTitle("hi!");
    vCardBean0.setMiddleName("");
    java.lang.String str13 = vCardBean0.getTitle();
    boolean b14 = vCardBean0.isValidVCard();
    vCardBean0.setOrganization("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test143"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getEmail();
    java.lang.String str5 = vCardBean0.toString();
    vCardBean0.setPhone("hi!");
    vCardBean0.setLastName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test144"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getTitle();
    vCardBean0.setLastName("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    java.lang.String str10 = vCardBean0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test145"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getFirstName();
    vCardBean0.setVCard("");
    java.lang.String str11 = vCardBean0.getFirstName();
    java.lang.String str12 = vCardBean0.getFormattedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test146"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getOrganization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test147"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    java.lang.String str4 = vCardBean0.getFax();
    vCardBean0.setFirstName("hi!");
    java.lang.String str7 = vCardBean0.getFormattedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test148"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getPhone();
    java.lang.String str10 = vCardBean0.getEmail();
    vCardBean0.setMiddleName("");
    boolean b13 = vCardBean0.isValidVCard();
    java.lang.String str14 = vCardBean0.getPhone();
    vCardBean0.setVCard("");
    java.lang.String str17 = vCardBean0.getPhone();
    java.lang.String str18 = vCardBean0.getEmail();
    java.lang.String str19 = vCardBean0.getFormattedName();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test149"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    vCardBean0.setVCard("");
    vCardBean0.setTitle("hi!");
    vCardBean0.setTitle("");
    java.lang.String str10 = vCardBean0.getTitle();
    java.lang.String str11 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test150"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getFormattedName();
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setFirstName("hi!");
    java.lang.String str11 = vCardBean0.getLastName();
    java.lang.String str12 = vCardBean0.getPhone();
    vCardBean0.setOrganization("hi!");
    java.lang.String str15 = vCardBean0.getFormattedName();
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    java.lang.String str18 = vCardBean0.getMiddleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test151"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getFirstName();
    java.lang.String str9 = vCardBean0.getEmail();
    java.lang.String str10 = vCardBean0.getMiddleName();
    java.lang.String str11 = vCardBean0.getEmail();
    java.lang.String str12 = vCardBean0.getFax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test152"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setLastName("hi!");
    vCardBean0.setOrganization("");
    vCardBean0.setOrganization("hi!");
    java.lang.String str10 = vCardBean0.getFax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test153"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str9 = vCardBean0.getTitle();
    java.lang.String str10 = vCardBean0.getFax();
    boolean b11 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    java.lang.String str14 = vCardBean0.getPhone();
    vCardBean0.setVCard("hi!");
    java.lang.String str17 = vCardBean0.getVCard();
    java.lang.String str18 = vCardBean0.getVCard();
    vCardBean0.setPhone("hi!");
    vCardBean0.setFax("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    java.lang.String str23 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test154"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    vCardBean0.setEmail("");
    java.lang.String str8 = vCardBean0.getVCard();
    boolean b9 = vCardBean0.isValidVCard();
    java.lang.String str10 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test155"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getLastName();
    java.lang.String str5 = vCardBean0.getEmail();
    java.lang.String str6 = vCardBean0.getEmail();
    vCardBean0.setTitle("hi!");
    vCardBean0.setLastName("hi!");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test156"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setFirstName("hi!");
    java.lang.String str5 = vCardBean0.getPhone();
    vCardBean0.setOrganization("");
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    vCardBean0.setVCard("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test157"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getOrganization();
    java.lang.String str2 = vCardBean0.toString();
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setVCard("");
    boolean b7 = vCardBean0.isValidVCard();
    java.lang.String str8 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test158"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str4 = vCardBean0.getPhone();
    java.lang.String str5 = vCardBean0.getFax();
    vCardBean0.setMiddleName("");
    vCardBean0.setFormattedName("");
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN:hi!\nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test159"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getVCard();
    vCardBean0.setOrganization("hi!");
    java.lang.String str11 = vCardBean0.getPhone();
    vCardBean0.setFax("");
    boolean b14 = vCardBean0.isValidVCard();
    java.lang.String str15 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test160"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str9 = vCardBean0.getTitle();
    java.lang.String str10 = vCardBean0.getFax();
    vCardBean0.setEmail("hi!");
    java.lang.String str13 = vCardBean0.getVCard();
    java.lang.String str14 = vCardBean0.getFirstName();
    vCardBean0.setLastName("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    vCardBean0.setFormattedName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test161"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getLastName();
    vCardBean0.setFormattedName("");
    java.lang.String str7 = vCardBean0.getFirstName();
    vCardBean0.setFormattedName("");
    java.lang.String str10 = vCardBean0.getLastName();
    java.lang.String str11 = vCardBean0.getVCard();
    
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

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test162"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str9 = vCardBean0.getTitle();
    java.lang.String str10 = vCardBean0.getFax();
    boolean b11 = vCardBean0.isValidVCard();
    java.lang.String str12 = vCardBean0.toString();
    java.lang.String str13 = vCardBean0.getFirstName();
    vCardBean0.setOrganization("");
    vCardBean0.setEmail("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test163"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    java.lang.String str6 = vCardBean0.getFax();
    vCardBean0.setPhone("hi!");
    vCardBean0.setPhone("");
    
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
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test164"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    java.lang.String str6 = vCardBean0.getFormattedName();
    java.lang.String str7 = vCardBean0.getFirstName();
    vCardBean0.setEmail("hi!");
    vCardBean0.setLastName("");
    java.lang.String str12 = vCardBean0.getFax();
    vCardBean0.setPhone("hi!");
    java.lang.String str15 = vCardBean0.getTitle();
    java.lang.String str16 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test165"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getPhone();
    vCardBean0.setFax("");
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setFax("hi!");
    
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
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test166"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setMiddleName("hi!");
    boolean b9 = vCardBean0.isValidVCard();
    java.lang.String str10 = vCardBean0.getFirstName();
    vCardBean0.setOrganization("hi!");
    vCardBean0.setEmail("hi!");
    java.lang.String str15 = vCardBean0.getMiddleName();
    vCardBean0.setFax("hi!");
    java.lang.String str18 = vCardBean0.getFax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test167"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.toString();
    java.lang.String str2 = vCardBean0.getMiddleName();
    java.lang.String str3 = vCardBean0.getPhone();
    vCardBean0.setVCard("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=VOICE:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test168"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getTitle();
    vCardBean0.setMiddleName("");
    java.lang.String str7 = vCardBean0.getTitle();
    java.lang.String str8 = vCardBean0.getVCard();
    java.lang.String str9 = vCardBean0.getFirstName();
    vCardBean0.setTitle("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    java.lang.String str12 = vCardBean0.getFax();
    vCardBean0.setTitle("BEGIN:VCARD\nFN:hi!\nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test169"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getLastName();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setPhone("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str12 = vCardBean0.getFirstName();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test170"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setFirstName("hi!");
    java.lang.String str5 = vCardBean0.getFormattedName();
    vCardBean0.setLastName("hi!");
    java.lang.String str8 = vCardBean0.getEmail();
    java.lang.String str9 = vCardBean0.getMiddleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test171"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getOrganization();
    vCardBean0.setVCard("");
    vCardBean0.setFormattedName("");
    java.lang.String str6 = vCardBean0.getTitle();
    java.lang.String str7 = vCardBean0.getVCard();
    boolean b8 = vCardBean0.isValidVCard();
    java.lang.String str9 = vCardBean0.getMiddleName();
    java.lang.String str10 = vCardBean0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test172"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setLastName("hi!");
    vCardBean0.setOrganization("");
    vCardBean0.setOrganization("hi!");
    java.lang.String str10 = vCardBean0.getFirstName();
    vCardBean0.setPhone("hi!");
    vCardBean0.setFormattedName("");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test173"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setMiddleName("");
    vCardBean0.setLastName("hi!");
    vCardBean0.setLastName("hi!");
    vCardBean0.setVCard("");
    java.lang.String str17 = vCardBean0.getEmail();
    java.lang.String str18 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test174"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getFormattedName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str7 = vCardBean0.getMiddleName();
    java.lang.String str8 = vCardBean0.getTitle();
    java.lang.String str9 = vCardBean0.getTitle();
    java.lang.String str10 = vCardBean0.toString();
    java.lang.String str11 = vCardBean0.getVCard();
    vCardBean0.setFax("hi!");
    java.lang.String str14 = vCardBean0.getMiddleName();
    java.lang.String str15 = vCardBean0.getOrganization();
    java.lang.String str16 = vCardBean0.getVCard();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test175"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getEmail();
    java.lang.String str5 = vCardBean0.getOrganization();
    vCardBean0.setEmail("hi!");
    vCardBean0.setFax("");
    vCardBean0.setVCard("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test176"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("hi!");
    java.lang.String str11 = vCardBean0.toString();
    java.lang.String str12 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test177"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    vCardBean0.setLastName("hi!");
    java.lang.String str6 = vCardBean0.getOrganization();
    vCardBean0.setFormattedName("");
    vCardBean0.setVCard("");
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test178"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    boolean b2 = vCardBean0.isValidVCard();
    java.lang.String str3 = vCardBean0.getVCard();
    vCardBean0.setPhone("");
    vCardBean0.setFax("hi!");
    vCardBean0.setTitle("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test179"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getFormattedName();
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setFirstName("hi!");
    java.lang.String str9 = vCardBean0.getFirstName();
    java.lang.String str10 = vCardBean0.getVCard();
    java.lang.String str11 = vCardBean0.getOrganization();
    java.lang.String str12 = vCardBean0.getOrganization();
    java.lang.String str13 = vCardBean0.getFormattedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test180"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    vCardBean0.setEmail("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getPhone();
    vCardBean0.setFirstName("");
    boolean b12 = vCardBean0.isValidVCard();
    vCardBean0.setOrganization("hi!");
    java.lang.String str15 = vCardBean0.getOrganization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test181"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str9 = vCardBean0.getTitle();
    vCardBean0.setMiddleName("");
    boolean b12 = vCardBean0.isValidVCard();
    java.lang.String str13 = vCardBean0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test182"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getOrganization();
    java.lang.String str9 = vCardBean0.getLastName();
    java.lang.String str10 = vCardBean0.getOrganization();
    boolean b11 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test183"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getLastName();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setPhone("");
    java.lang.String str8 = vCardBean0.getLastName();
    vCardBean0.setTitle("hi!");
    java.lang.String str11 = vCardBean0.getLastName();
    vCardBean0.setVCard("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    java.lang.String str14 = vCardBean0.getFirstName();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test184"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getOrganization();
    vCardBean0.setVCard("");
    java.lang.String str4 = vCardBean0.getTitle();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str7 = vCardBean0.toString();
    java.lang.String str8 = vCardBean0.getOrganization();
    vCardBean0.setFormattedName("");
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    java.lang.String str13 = vCardBean0.getMiddleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD"+ "'", str13.equals("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD"));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test185"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    vCardBean0.setOrganization("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    java.lang.String str8 = vCardBean0.getFirstName();
    vCardBean0.setFirstName("hi!");
    vCardBean0.setMiddleName("");
    vCardBean0.setFax("");
    java.lang.String str15 = vCardBean0.getFax();
    java.lang.String str16 = vCardBean0.getTitle();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=VOICE:hi!\nEND:VCARD");
    java.lang.String str19 = vCardBean0.getFax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test186"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    vCardBean0.setVCard("");
    vCardBean0.setEmail("hi!");
    vCardBean0.setLastName("hi!");
    java.lang.String str10 = vCardBean0.getFirstName();
    java.lang.String str11 = vCardBean0.getPhone();
    boolean b12 = vCardBean0.isValidVCard();
    vCardBean0.setTitle("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=VOICE:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test187"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str9 = vCardBean0.getTitle();
    java.lang.String str10 = vCardBean0.getVCard();
    java.lang.String str11 = vCardBean0.getFormattedName();
    vCardBean0.setFormattedName("");
    java.lang.String str14 = vCardBean0.getEmail();
    vCardBean0.setMiddleName("");
    java.lang.String str17 = vCardBean0.getFirstName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str20 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test188"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.toString();
    java.lang.String str5 = vCardBean0.getMiddleName();
    vCardBean0.setOrganization("");
    vCardBean0.setFax("hi!");
    java.lang.String str10 = vCardBean0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test189"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setFirstName("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getTitle();
    vCardBean0.setTitle("hi!");
    java.lang.String str12 = vCardBean0.getLastName();
    vCardBean0.setTitle("");
    vCardBean0.setEmail("");
    java.lang.String str17 = vCardBean0.getTitle();
    vCardBean0.setPhone("BEGIN:VCARD\nFN:hi!\nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test190"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getTitle();
    java.lang.String str7 = vCardBean0.getLastName();
    java.lang.String str8 = vCardBean0.getEmail();
    vCardBean0.setEmail("hi!");
    vCardBean0.setPhone("");
    java.lang.String str13 = vCardBean0.getMiddleName();
    java.lang.String str14 = vCardBean0.getTitle();
    boolean b15 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    vCardBean0.setFirstName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test191"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    vCardBean0.setEmail("");
    java.lang.String str8 = vCardBean0.getFirstName();
    java.lang.String str9 = vCardBean0.toString();
    java.lang.String str10 = vCardBean0.getFax();
    java.lang.String str11 = vCardBean0.getFirstName();
    vCardBean0.setFirstName("");
    vCardBean0.setTitle("hi!");
    java.lang.String str16 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test192"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    vCardBean0.setFormattedName("");
    vCardBean0.setTitle("hi!");
    java.lang.String str9 = vCardBean0.getFirstName();
    java.lang.String str10 = vCardBean0.getPhone();
    vCardBean0.setFirstName("");
    vCardBean0.setPhone("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test193"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getTitle();
    vCardBean0.setEmail("hi!");
    boolean b7 = vCardBean0.isValidVCard();
    vCardBean0.setOrganization("");
    java.lang.String str10 = vCardBean0.getFirstName();
    vCardBean0.setLastName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test194"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setFirstName("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getTitle();
    java.lang.String str10 = vCardBean0.getPhone();
    java.lang.String str11 = vCardBean0.toString();
    boolean b12 = vCardBean0.isValidVCard();
    java.lang.String str13 = vCardBean0.toString();
    java.lang.String str14 = vCardBean0.getTitle();
    java.lang.String str15 = vCardBean0.getFormattedName();
    vCardBean0.setVCard("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=VOICE:hi!\nEND:VCARD");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
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

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test195"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.toString();
    java.lang.String str4 = vCardBean0.getEmail();
    vCardBean0.setMiddleName("");
    java.lang.String str7 = vCardBean0.getLastName();
    vCardBean0.setMiddleName("");
    vCardBean0.setTitle("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=VOICE:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test196"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    vCardBean0.setOrganization("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    vCardBean0.setOrganization("");
    java.lang.String str10 = vCardBean0.getVCard();
    vCardBean0.setLastName("hi!");
    vCardBean0.setOrganization("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test197"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getTitle();
    java.lang.String str7 = vCardBean0.getVCard();
    java.lang.String str8 = vCardBean0.getEmail();
    java.lang.String str9 = vCardBean0.getVCard();
    java.lang.String str10 = vCardBean0.getEmail();
    java.lang.String str11 = vCardBean0.getFormattedName();
    java.lang.String str12 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test198"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    vCardBean0.setFormattedName("");
    vCardBean0.setFirstName("hi!");
    java.lang.String str9 = vCardBean0.getFirstName();
    vCardBean0.setPhone("hi!");
    java.lang.String str12 = vCardBean0.getFormattedName();
    java.lang.String str13 = vCardBean0.toString();
    java.lang.String str14 = vCardBean0.getLastName();
    vCardBean0.setOrganization("hi!");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test199"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    vCardBean0.setOrganization("hi!");
    vCardBean0.setTitle("hi!");
    java.lang.String str9 = vCardBean0.getPhone();
    java.lang.String str10 = vCardBean0.getFirstName();
    vCardBean0.setVCard("hi!");
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setFormattedName("hi!");
    java.lang.String str17 = vCardBean0.getMiddleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test200"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    vCardBean0.setOrganization("");
    boolean b8 = vCardBean0.isValidVCard();
    java.lang.String str9 = vCardBean0.getVCard();
    java.lang.String str10 = vCardBean0.getOrganization();
    java.lang.String str11 = vCardBean0.getLastName();
    boolean b12 = vCardBean0.isValidVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test201"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getEmail();
    vCardBean0.setPhone("hi!");
    vCardBean0.setPhone("hi!");
    vCardBean0.setTitle("");
    java.lang.String str11 = vCardBean0.getTitle();
    vCardBean0.setMiddleName("");
    boolean b14 = vCardBean0.isValidVCard();
    boolean b15 = vCardBean0.isValidVCard();
    java.lang.String str16 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test202"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getOrganization();
    vCardBean0.setVCard("");
    java.lang.String str4 = vCardBean0.getPhone();
    vCardBean0.setVCard("");
    vCardBean0.setTitle("");
    java.lang.String str9 = vCardBean0.getPhone();
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test203"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    java.lang.String str7 = vCardBean0.getFirstName();
    java.lang.String str8 = vCardBean0.getEmail();
    vCardBean0.setTitle("hi!");
    java.lang.String str11 = vCardBean0.getTitle();
    vCardBean0.setVCard("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=VOICE:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test204"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    vCardBean0.setEmail("");
    vCardBean0.setFirstName("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    vCardBean0.setFirstName("");
    java.lang.String str12 = vCardBean0.getMiddleName();
    java.lang.String str13 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test205"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    java.lang.String str6 = vCardBean0.getTitle();
    vCardBean0.setMiddleName("");
    vCardBean0.setFax("");
    java.lang.String str11 = vCardBean0.getFax();
    java.lang.String str12 = vCardBean0.getPhone();
    vCardBean0.setTitle("hi!");
    java.lang.String str15 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test206"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    vCardBean0.setOrganization("hi!");
    java.lang.String str7 = vCardBean0.getFax();
    boolean b8 = vCardBean0.isValidVCard();
    vCardBean0.setVCard("hi!");
    java.lang.String str11 = vCardBean0.getFirstName();
    java.lang.String str12 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str15 = vCardBean0.getFormattedName();
    vCardBean0.setLastName("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test207"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getLastName();
    java.lang.String str5 = vCardBean0.getTitle();
    vCardBean0.setFormattedName("");
    vCardBean0.setMiddleName("");
    vCardBean0.setTitle("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test208"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    vCardBean0.setLastName("hi!");
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getTitle();
    boolean b9 = vCardBean0.isValidVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test209"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getFax();
    java.lang.String str9 = vCardBean0.getOrganization();
    vCardBean0.setOrganization("");
    java.lang.String str12 = vCardBean0.getTitle();
    vCardBean0.setPhone("");
    java.lang.String str15 = vCardBean0.getOrganization();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test210"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    vCardBean0.setLastName("hi!");
    java.lang.String str6 = vCardBean0.getOrganization();
    vCardBean0.setFormattedName("");
    vCardBean0.setVCard("");
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test211"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    vCardBean0.setEmail("");
    java.lang.String str8 = vCardBean0.getFirstName();
    java.lang.String str9 = vCardBean0.toString();
    boolean b10 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    vCardBean0.setPhone("hi!");
    vCardBean0.setEmail("");
    java.lang.String str17 = vCardBean0.getMiddleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test212"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str9 = vCardBean0.getTitle();
    java.lang.String str10 = vCardBean0.getFax();
    boolean b11 = vCardBean0.isValidVCard();
    vCardBean0.setPhone("");
    java.lang.String str14 = vCardBean0.getPhone();
    vCardBean0.setVCard("hi!");
    java.lang.String str17 = vCardBean0.getVCard();
    vCardBean0.setFormattedName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test213"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setFirstName("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getTitle();
    java.lang.String str10 = vCardBean0.getPhone();
    java.lang.String str11 = vCardBean0.toString();
    boolean b12 = vCardBean0.isValidVCard();
    java.lang.String str13 = vCardBean0.toString();
    java.lang.String str14 = vCardBean0.getTitle();
    vCardBean0.setFirstName("");
    java.lang.String str17 = vCardBean0.getTitle();
    vCardBean0.setTitle("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=VOICE:hi!\nEND:VCARD");
    vCardBean0.setMiddleName("");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test214"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    vCardBean0.setVCard("");
    vCardBean0.setPhone("hi!");
    vCardBean0.setFirstName("");
    java.lang.String str12 = vCardBean0.getFirstName();
    java.lang.String str13 = vCardBean0.getPhone();
    java.lang.String str14 = vCardBean0.getPhone();
    vCardBean0.setFirstName("hi!");
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setLastName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test215"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getFormattedName();
    vCardBean0.setFormattedName("hi!");
    vCardBean0.setFirstName("hi!");
    vCardBean0.setOrganization("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test216"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    vCardBean0.setEmail("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getMiddleName();
    vCardBean0.setTitle("hi!");
    java.lang.String str12 = vCardBean0.getVCard();
    vCardBean0.setFirstName("");
    vCardBean0.setFax("hi!");
    java.lang.String str17 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test217"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    vCardBean0.setVCard("");
    vCardBean0.setPhone("hi!");
    vCardBean0.setFirstName("");
    vCardBean0.setFormattedName("");
    java.lang.String str14 = vCardBean0.getMiddleName();
    java.lang.String str15 = vCardBean0.getLastName();
    boolean b16 = vCardBean0.isValidVCard();
    vCardBean0.setEmail("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=VOICE:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test218"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    vCardBean0.setVCard("");
    java.lang.String str6 = vCardBean0.getFormattedName();
    java.lang.String str7 = vCardBean0.getEmail();
    java.lang.String str8 = vCardBean0.getEmail();
    vCardBean0.setLastName("");
    java.lang.String str11 = vCardBean0.getTitle();
    
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

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test219"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setLastName("hi!");
    java.lang.String str6 = vCardBean0.getEmail();
    java.lang.String str7 = vCardBean0.getPhone();
    java.lang.String str8 = vCardBean0.getVCard();
    java.lang.String str9 = vCardBean0.getFirstName();
    boolean b10 = vCardBean0.isValidVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test220"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    vCardBean0.setOrganization("");
    boolean b8 = vCardBean0.isValidVCard();
    java.lang.String str9 = vCardBean0.getVCard();
    vCardBean0.setOrganization("");
    java.lang.String str12 = vCardBean0.getOrganization();
    boolean b13 = vCardBean0.isValidVCard();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test221"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    java.lang.String str4 = vCardBean0.getMiddleName();
    vCardBean0.setTitle("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test222"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setVCard("hi!");
    java.lang.String str5 = vCardBean0.getFirstName();
    java.lang.String str6 = vCardBean0.getFormattedName();
    java.lang.String str7 = vCardBean0.getOrganization();
    java.lang.String str8 = vCardBean0.getPhone();
    vCardBean0.setPhone("");
    vCardBean0.setVCard("hi!");
    vCardBean0.setLastName("");
    java.lang.String str15 = vCardBean0.getLastName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test223"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getOrganization();
    vCardBean0.setVCard("");
    java.lang.String str4 = vCardBean0.getPhone();
    java.lang.String str5 = vCardBean0.getLastName();
    vCardBean0.setFirstName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=VOICE:hi!\nEND:VCARD");
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test224"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.toString();
    boolean b5 = vCardBean0.isValidVCard();
    java.lang.String str6 = vCardBean0.getMiddleName();
    java.lang.String str7 = vCardBean0.getOrganization();
    vCardBean0.setVCard("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test225"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getVCard();
    vCardBean0.setOrganization("hi!");
    java.lang.String str11 = vCardBean0.getPhone();
    vCardBean0.setFax("");
    boolean b14 = vCardBean0.isValidVCard();
    java.lang.String str15 = vCardBean0.getEmail();
    java.lang.String str16 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test226"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str9 = vCardBean0.getTitle();
    java.lang.String str10 = vCardBean0.getFax();
    boolean b11 = vCardBean0.isValidVCard();
    java.lang.String str12 = vCardBean0.toString();
    java.lang.String str13 = vCardBean0.getFormattedName();
    java.lang.String str14 = vCardBean0.getMiddleName();
    vCardBean0.setOrganization("BEGIN:VCARD\nFN:hi!\nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test227"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setFirstName("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getTitle();
    java.lang.String str10 = vCardBean0.getPhone();
    java.lang.String str11 = vCardBean0.toString();
    java.lang.String str12 = vCardBean0.getPhone();
    java.lang.String str13 = vCardBean0.getFax();
    vCardBean0.setFirstName("");
    vCardBean0.setOrganization("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
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
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test228"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    vCardBean0.setFirstName("hi!");
    java.lang.String str6 = vCardBean0.getTitle();
    vCardBean0.setVCard("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test229"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    java.lang.String str4 = vCardBean0.getPhone();
    java.lang.String str5 = vCardBean0.getPhone();
    vCardBean0.setLastName("");
    java.lang.String str8 = vCardBean0.getFax();
    vCardBean0.setFirstName("");
    vCardBean0.setOrganization("hi!");
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    java.lang.String str15 = vCardBean0.getOrganization();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test230"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getLastName();
    java.lang.String str5 = vCardBean0.getTitle();
    vCardBean0.setFormattedName("");
    java.lang.String str8 = vCardBean0.getVCard();
    vCardBean0.setFax("hi!");
    vCardBean0.setFormattedName("");
    java.lang.String str13 = vCardBean0.getLastName();
    java.lang.String str14 = vCardBean0.getTitle();
    vCardBean0.setEmail("");
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test231"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    vCardBean0.setVCard("");
    vCardBean0.setEmail("hi!");
    vCardBean0.setEmail("hi!");
    java.lang.String str10 = vCardBean0.getPhone();
    java.lang.String str11 = vCardBean0.getTitle();
    java.lang.String str12 = vCardBean0.getTitle();
    vCardBean0.setTitle("BEGIN:VCARD\nFN:hi!\nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test232"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    java.lang.String str7 = vCardBean0.getLastName();
    java.lang.String str8 = vCardBean0.getFax();
    vCardBean0.setTitle("hi!");
    vCardBean0.setMiddleName("");
    java.lang.String str13 = vCardBean0.getTitle();
    boolean b14 = vCardBean0.isValidVCard();
    java.lang.String str15 = vCardBean0.toString();
    vCardBean0.setOrganization("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test233"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getLastName();
    vCardBean0.setFirstName("hi!");
    vCardBean0.setFormattedName("");
    vCardBean0.setVCard("hi!");
    vCardBean0.setFirstName("");
    java.lang.String str13 = vCardBean0.getVCard();
    java.lang.String str14 = vCardBean0.getOrganization();
    vCardBean0.setLastName("");
    vCardBean0.setFormattedName("hi!");
    boolean b19 = vCardBean0.isValidVCard();
    vCardBean0.setOrganization("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    java.lang.String str22 = vCardBean0.toString();
    java.lang.String str23 = vCardBean0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test234"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setMiddleName("hi!");
    boolean b9 = vCardBean0.isValidVCard();
    java.lang.String str10 = vCardBean0.getFirstName();
    java.lang.String str11 = vCardBean0.getLastName();
    boolean b12 = vCardBean0.isValidVCard();
    java.lang.String str13 = vCardBean0.getVCard();
    java.lang.String str14 = vCardBean0.getFirstName();
    boolean b15 = vCardBean0.isValidVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test235"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getLastName();
    java.lang.String str5 = vCardBean0.getEmail();
    java.lang.String str6 = vCardBean0.getVCard();
    java.lang.String str7 = vCardBean0.getEmail();
    java.lang.String str8 = vCardBean0.getPhone();
    vCardBean0.setOrganization("hi!");
    java.lang.String str11 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test236"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    vCardBean0.setEmail("");
    java.lang.String str5 = vCardBean0.getFirstName();
    java.lang.String str6 = vCardBean0.getFormattedName();
    java.lang.String str7 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test237"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getEmail();
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setTitle("hi!");
    vCardBean0.setFormattedName("");
    vCardBean0.setFormattedName("");
    vCardBean0.setFormattedName("");
    vCardBean0.setMiddleName("");
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test238"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    java.lang.String str6 = vCardBean0.getFax();
    java.lang.String str7 = vCardBean0.getEmail();
    vCardBean0.setEmail("hi!");
    java.lang.String str10 = vCardBean0.getFax();
    boolean b11 = vCardBean0.isValidVCard();
    java.lang.String str12 = vCardBean0.getFirstName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test239"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    vCardBean0.setVCard("");
    vCardBean0.setEmail("hi!");
    vCardBean0.setEmail("hi!");
    java.lang.String str10 = vCardBean0.getLastName();
    java.lang.String str11 = vCardBean0.getFirstName();
    java.lang.String str12 = vCardBean0.getPhone();
    java.lang.String str13 = vCardBean0.getFirstName();
    java.lang.String str14 = vCardBean0.getFormattedName();
    vCardBean0.setVCard("BEGIN:VCARD\nFN:hi! \nN:;;hi!;\nORG:\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test240"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getFormattedName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str7 = vCardBean0.getMiddleName();
    java.lang.String str8 = vCardBean0.getTitle();
    java.lang.String str9 = vCardBean0.getTitle();
    java.lang.String str10 = vCardBean0.toString();
    vCardBean0.setOrganization("hi!");
    vCardBean0.setEmail("");
    java.lang.String str15 = vCardBean0.getFirstName();
    java.lang.String str16 = vCardBean0.getVCard();
    vCardBean0.setVCard("");
    java.lang.String str19 = vCardBean0.getFormattedName();
    java.lang.String str20 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test241"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getEmail();
    vCardBean0.setPhone("hi!");
    vCardBean0.setPhone("hi!");
    vCardBean0.setTitle("");
    java.lang.String str11 = vCardBean0.getTitle();
    vCardBean0.setMiddleName("");
    boolean b14 = vCardBean0.isValidVCard();
    java.lang.String str15 = vCardBean0.getPhone();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str18 = vCardBean0.getOrganization();
    java.lang.String str19 = vCardBean0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test242"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getTitle();
    java.lang.String str7 = vCardBean0.getLastName();
    java.lang.String str8 = vCardBean0.getEmail();
    vCardBean0.setEmail("hi!");
    vCardBean0.setPhone("");
    vCardBean0.setEmail("hi!");
    java.lang.String str15 = vCardBean0.getMiddleName();
    java.lang.String str16 = vCardBean0.getMiddleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test243"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getPhone();
    vCardBean0.setFax("");
    vCardBean0.setFormattedName("hi!");
    java.lang.String str14 = vCardBean0.getTitle();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test244"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    java.lang.String str4 = vCardBean0.getFax();
    vCardBean0.setFirstName("hi!");
    vCardBean0.setTitle("");
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN:hi!\nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test245"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getLastName();
    vCardBean0.setFormattedName("");
    java.lang.String str7 = vCardBean0.getFirstName();
    vCardBean0.setFax("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test246"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getEmail();
    vCardBean0.setPhone("hi!");
    vCardBean0.setPhone("hi!");
    vCardBean0.setTitle("");
    java.lang.String str11 = vCardBean0.getVCard();
    java.lang.String str12 = vCardBean0.getEmail();
    java.lang.String str13 = vCardBean0.getFax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test247"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getLastName();
    vCardBean0.setFirstName("hi!");
    vCardBean0.setFormattedName("");
    vCardBean0.setVCard("hi!");
    vCardBean0.setFirstName("");
    vCardBean0.setEmail("hi!");
    java.lang.String str15 = vCardBean0.getVCard();
    java.lang.String str16 = vCardBean0.getFax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test248"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getLastName();
    java.lang.String str5 = vCardBean0.getTitle();
    vCardBean0.setFormattedName("");
    java.lang.String str8 = vCardBean0.getVCard();
    vCardBean0.setFax("hi!");
    vCardBean0.setFormattedName("");
    java.lang.String str13 = vCardBean0.getFormattedName();
    java.lang.String str14 = vCardBean0.getOrganization();
    java.lang.String str15 = vCardBean0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test249"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    vCardBean0.setLastName("hi!");
    vCardBean0.setOrganization("");
    java.lang.String str8 = vCardBean0.getMiddleName();
    vCardBean0.setOrganization("");
    vCardBean0.setTitle("");
    java.lang.String str13 = vCardBean0.getOrganization();
    vCardBean0.setTitle("hi!");
    java.lang.String str16 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test250"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.toString();
    java.lang.String str4 = vCardBean0.getTitle();
    boolean b5 = vCardBean0.isValidVCard();
    vCardBean0.setMiddleName("");
    vCardBean0.setMiddleName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test251"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getLastName();
    vCardBean0.setFormattedName("");
    vCardBean0.setMiddleName("");
    vCardBean0.setTitle("BEGIN:VCARD\nFN:hi!\nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test252"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getFormattedName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str7 = vCardBean0.getMiddleName();
    vCardBean0.setMiddleName("");
    java.lang.String str10 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test253"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    boolean b2 = vCardBean0.isValidVCard();
    java.lang.String str3 = vCardBean0.getVCard();
    vCardBean0.setPhone("");
    java.lang.String str6 = vCardBean0.getVCard();
    java.lang.String str7 = vCardBean0.getFormattedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test254"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    vCardBean0.setFirstName("hi!");
    java.lang.String str6 = vCardBean0.getMiddleName();
    vCardBean0.setFormattedName("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nTITLE:hi!\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    java.lang.String str9 = vCardBean0.getMiddleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test255"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getOrganization();
    vCardBean0.setTitle("");
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getFormattedName();
    java.lang.String str6 = vCardBean0.getFax();
    java.lang.String str7 = vCardBean0.getMiddleName();
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getVCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
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
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test256"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFormattedName();
    java.lang.String str4 = vCardBean0.getFax();
    java.lang.String str5 = vCardBean0.getVCard();
    vCardBean0.setVCard("");
    java.lang.String str8 = vCardBean0.getLastName();
    java.lang.String str9 = vCardBean0.getPhone();
    vCardBean0.setEmail("");
    vCardBean0.setVCard("hi!");
    java.lang.String str14 = vCardBean0.getTitle();
    vCardBean0.setLastName("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test257"); }


    VCardBean vCardBean0 = new VCardBean();
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getFormattedName();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str7 = vCardBean0.getMiddleName();
    java.lang.String str8 = vCardBean0.getTitle();
    java.lang.String str9 = vCardBean0.getTitle();
    java.lang.String str10 = vCardBean0.toString();
    vCardBean0.setOrganization("hi!");
    vCardBean0.setEmail("");
    java.lang.String str15 = vCardBean0.getFirstName();
    java.lang.String str16 = vCardBean0.getVCard();
    java.lang.String str17 = vCardBean0.getFormattedName();
    vCardBean0.setMiddleName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
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
    vCardBean0.setEmail("hi!");
    java.lang.String str3 = vCardBean0.getFirstName();
    java.lang.String str4 = vCardBean0.getEmail();
    vCardBean0.setFirstName("");
    vCardBean0.setMiddleName("BEGIN:VCARD\nFN:hi!\nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test259"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("");
    vCardBean0.setLastName("hi!");
    java.lang.String str6 = vCardBean0.getOrganization();
    vCardBean0.setVCard("hi!");
    java.lang.String str9 = vCardBean0.getPhone();
    boolean b10 = vCardBean0.isValidVCard();
    vCardBean0.setVCard("BEGIN:VCARD\nFN: hi!\nN:hi!;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:\nTEL;TYPE=VOICE:hi!\nEND:VCARD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test260"); }


    VCardBean vCardBean0 = new VCardBean();
    java.lang.String str1 = vCardBean0.getEmail();
    vCardBean0.setFormattedName("hi!");
    java.lang.String str4 = vCardBean0.getVCard();
    java.lang.String str5 = vCardBean0.getEmail();
    vCardBean0.setMiddleName("hi!");
    vCardBean0.setPhone("BEGIN:VCARD\nFN:hi!\nN:;;;\nORG:hi!\nEMAIL;TYPE=INTERNET:hi!\nEND:VCARD");
    java.lang.String str10 = vCardBean0.getFormattedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

}
