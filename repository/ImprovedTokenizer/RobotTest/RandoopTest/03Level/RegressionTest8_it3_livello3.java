
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test001"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken(' ');
    int i9 = improvedTokenizer2.stop();
    java.io.InputStream inputStream10 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream10, "4#");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test002"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    int i13 = improvedTokenizer2.beforeToken(' ');
    int i14 = improvedTokenizer2.stop();
    boolean b16 = improvedTokenizer2.keepParsing((int)'a');
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test003"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b11 = improvedTokenizer2.hasNext();
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.start('#');
    boolean b15 = improvedTokenizer2.advance();
    int i17 = improvedTokenizer2.start('#');
    boolean b19 = improvedTokenizer2.keepParsing((int)(byte)1);
    java.lang.String str20 = improvedTokenizer2.previousDelimiter();
    int i22 = improvedTokenizer2.start('a');
    java.lang.String str23 = improvedTokenizer2.previousDelimiter();
    int i25 = improvedTokenizer2.matchingToken('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 3);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test004"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    int i15 = improvedTokenizer2.matchingToken('#');
    int i17 = improvedTokenizer2.start('#');
    int i19 = improvedTokenizer2.matchingToken('a');
    int i21 = improvedTokenizer2.matchingToken('#');
    java.lang.String str22 = improvedTokenizer2.previousDelimiter();
    int i24 = improvedTokenizer2.start('a');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test005"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.beforeToken('a');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    boolean b17 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i19 = improvedTokenizer2.matchingToken('4');
    int i20 = improvedTokenizer2.stop();
    int i21 = improvedTokenizer2.stop();
    int i22 = improvedTokenizer2.stop();
    java.lang.String str23 = improvedTokenizer2.previousDelimiter();
    boolean b24 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "4"+ "'", str15.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test006"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.stop();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.advance();
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    int i11 = improvedTokenizer2.stop();
    int i13 = improvedTokenizer2.start('4');
    boolean b15 = improvedTokenizer2.keepParsing(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test007"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.hasNext();
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "a");
    int i12 = improvedTokenizer2.start(' ');
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    boolean b15 = improvedTokenizer2.keepParsing((int)' ');
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "a ");
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test008"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4a", "");
    int i3 = improvedTokenizer2.stop();
    int i4 = improvedTokenizer2.stop();
    int i6 = improvedTokenizer2.start('4');
    int i8 = improvedTokenizer2.start('#');
    int i10 = improvedTokenizer2.beforeToken(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test009"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.afterToken('4');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.matchingToken('4');
    boolean b15 = improvedTokenizer2.hasNext();
    int i17 = improvedTokenizer2.start(' ');
    java.lang.String str18 = improvedTokenizer2.previousDelimiter();
    boolean b20 = improvedTokenizer2.keepParsing((int)(short)100);
    int i22 = improvedTokenizer2.matchingToken('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test010"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    boolean b11 = improvedTokenizer2.advance();
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    boolean b14 = improvedTokenizer2.keepParsing((-1));
    int i16 = improvedTokenizer2.start('a');
    int i18 = improvedTokenizer2.matchingToken('a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test011"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "");
    int i6 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.keepParsing(0);
    boolean b10 = improvedTokenizer2.keepParsing((int)(byte)-1);
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "a");
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test012"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b3 = improvedTokenizer2.advance();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i8 = improvedTokenizer2.stop();
    int i10 = improvedTokenizer2.start(' ');
    int i12 = improvedTokenizer2.start('#');
    java.io.InputStream inputStream13 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream13, "#4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test013"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    java.io.Reader reader4 = null;
    improvedTokenizer2.initialize(reader4, "");
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "hi!");
    int i11 = improvedTokenizer2.start('a');
    boolean b13 = improvedTokenizer2.keepParsing(0);
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    int i16 = improvedTokenizer2.beforeToken('#');
    int i18 = improvedTokenizer2.afterToken('#');
    int i20 = improvedTokenizer2.afterToken(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test014"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    int i11 = improvedTokenizer2.afterToken('4');
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i14 = improvedTokenizer2.afterToken('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "a"+ "'", str9.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#"+ "'", str12.equals("#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test015"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i10 = improvedTokenizer2.start('a');
    boolean b11 = improvedTokenizer2.hasNext();
    int i13 = improvedTokenizer2.start(' ');
    int i15 = improvedTokenizer2.afterToken('a');
    int i17 = improvedTokenizer2.start('#');
    boolean b18 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test016"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.afterToken('4');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.matchingToken('4');
    boolean b15 = improvedTokenizer2.hasNext();
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test017"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b3 = improvedTokenizer2.advance();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.next();
    boolean b9 = improvedTokenizer2.keepParsing((int)(short)10);
    boolean b11 = improvedTokenizer2.keepParsing(5);
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "4");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test018"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken('a');
    java.lang.String str17 = improvedTokenizer2.next();
    int i18 = improvedTokenizer2.stop();
    int i20 = improvedTokenizer2.start('a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test019"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(128);
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader6 = null;
    improvedTokenizer2.initialize(reader6, "44");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test020"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.hasNext();
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "a");
    int i12 = improvedTokenizer2.start(' ');
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    int i15 = improvedTokenizer2.beforeToken('#');
    int i17 = improvedTokenizer2.matchingToken('a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 4);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test021"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.beforeToken('a');
    int i16 = improvedTokenizer2.matchingToken(' ');
    boolean b18 = improvedTokenizer2.keepParsing(0);
    int i20 = improvedTokenizer2.afterToken('4');
    java.io.Reader reader21 = null;
    improvedTokenizer2.initialize(reader21, "4#");
    int i24 = improvedTokenizer2.stop();
    int i25 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test022"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.start('#');
    boolean b7 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.hasNext();
    int i9 = improvedTokenizer2.stop();
    java.io.Reader reader10 = null;
    improvedTokenizer2.initialize(reader10, "# ");
    boolean b14 = improvedTokenizer2.keepParsing((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test023"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.hasNext();
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "a");
    int i12 = improvedTokenizer2.start(' ');
    java.io.Reader reader13 = null;
    improvedTokenizer2.initialize(reader13, "");
    int i16 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i18 = improvedTokenizer2.afterToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test024"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    int i10 = improvedTokenizer2.matchingToken('a');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.afterToken('4');
    int i15 = improvedTokenizer2.stop();
    boolean b16 = improvedTokenizer2.hasNext();
    int i18 = improvedTokenizer2.start('a');
    boolean b19 = improvedTokenizer2.hasNext();
    int i21 = improvedTokenizer2.afterToken('a');
    boolean b22 = improvedTokenizer2.hasNext();
    int i24 = improvedTokenizer2.afterToken(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test025"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.afterToken('#');
    java.lang.String str19 = improvedTokenizer2.previousDelimiter();
    int i21 = improvedTokenizer2.start('#');
    int i23 = improvedTokenizer2.afterToken('a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "4 "+ "'", str19.equals("4 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 3);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test026"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    boolean b9 = improvedTokenizer2.advance();
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    int i12 = improvedTokenizer2.start('#');
    boolean b13 = improvedTokenizer2.hasNext();
    int i15 = improvedTokenizer2.afterToken('4');
    int i17 = improvedTokenizer2.afterToken('a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test027"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(4);
    boolean b5 = improvedTokenizer2.hasNext();
    int i6 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.stop();
    boolean b9 = improvedTokenizer2.keepParsing((int)(byte)1);
    java.io.Reader reader10 = null;
    improvedTokenizer2.initialize(reader10, "#");
    int i14 = improvedTokenizer2.start('4');
    int i16 = improvedTokenizer2.start(' ');
    boolean b18 = improvedTokenizer2.keepParsing((int)'4');
    int i20 = improvedTokenizer2.start('a');
    java.io.Reader reader21 = null;
    improvedTokenizer2.initialize(reader21, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test028"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i10 = improvedTokenizer2.start('a');
    boolean b11 = improvedTokenizer2.hasNext();
    int i13 = improvedTokenizer2.start(' ');
    int i15 = improvedTokenizer2.afterToken('a');
    boolean b16 = improvedTokenizer2.advance();
    java.io.Reader reader17 = null;
    improvedTokenizer2.initialize(reader17, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    boolean b20 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test029"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.start('4');
    int i20 = improvedTokenizer2.afterToken('4');
    int i22 = improvedTokenizer2.matchingToken('a');
    java.lang.String str23 = improvedTokenizer2.previousDelimiter();
    int i25 = improvedTokenizer2.start(' ');
    int i27 = improvedTokenizer2.afterToken(' ');
    int i29 = improvedTokenizer2.matchingToken(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "4"+ "'", str23.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 3);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test030"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.start('4');
    int i20 = improvedTokenizer2.start('a');
    boolean b21 = improvedTokenizer2.hasNext();
    java.io.Reader reader22 = null;
    improvedTokenizer2.initialize(reader22, "4#");
    // The following exception was thrown during execution in test generation
    try {
    int i26 = improvedTokenizer2.afterToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test031"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)'a');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    boolean b18 = improvedTokenizer2.keepParsing((-1));
    boolean b19 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "4"+ "'", str15.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "4"+ "'", str16.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test032"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    int i10 = improvedTokenizer2.matchingToken('a');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.afterToken(' ');
    int i16 = improvedTokenizer2.afterToken('#');
    int i18 = improvedTokenizer2.beforeToken('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test033"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.beforeToken('a');
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.start('4');
    java.lang.String str19 = improvedTokenizer2.previousDelimiter();
    int i21 = improvedTokenizer2.afterToken('4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test034"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    java.lang.String str11 = improvedTokenizer2.next();
    int i13 = improvedTokenizer2.start('4');
    boolean b15 = improvedTokenizer2.keepParsing(4);
    int i17 = improvedTokenizer2.afterToken('a');
    int i19 = improvedTokenizer2.matchingToken('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test035"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "# ");

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test036"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    boolean b5 = improvedTokenizer2.advance();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    int i11 = improvedTokenizer2.start('#');
    int i13 = improvedTokenizer2.beforeToken('#');
    java.io.Reader reader14 = null;
    improvedTokenizer2.initialize(reader14, "a");
    java.io.Reader reader17 = null;
    improvedTokenizer2.initialize(reader17, "");
    boolean b21 = improvedTokenizer2.keepParsing(100);
    // The following exception was thrown during execution in test generation
    try {
    int i23 = improvedTokenizer2.beforeToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test037"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken('a');
    int i18 = improvedTokenizer2.beforeToken('a');
    int i20 = improvedTokenizer2.start('4');
    java.io.InputStream inputStream21 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream21, "a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test038"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('4');
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)10);
    int i10 = improvedTokenizer2.start('#');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test039"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.stop();
    int i12 = improvedTokenizer2.stop();
    boolean b13 = improvedTokenizer2.advance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test040"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    int i10 = improvedTokenizer2.matchingToken('a');
    int i12 = improvedTokenizer2.beforeToken('#');
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    int i15 = improvedTokenizer2.beforeToken('a');
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader17 = null;
    improvedTokenizer2.initialize(reader17, "#a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4a"+ "'", str13.equals("4a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#"+ "'", str16.equals("#"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test041"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i15 = improvedTokenizer2.stop();
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    boolean b18 = improvedTokenizer2.keepParsing((int)(byte)10);
    int i20 = improvedTokenizer2.start('a');
    boolean b21 = improvedTokenizer2.advance();
    java.io.InputStream inputStream22 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream22, "a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test042"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i10 = improvedTokenizer2.start('#');
    int i12 = improvedTokenizer2.matchingToken('4');
    int i14 = improvedTokenizer2.beforeToken('4');
    boolean b15 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test043"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    int i7 = improvedTokenizer2.start(' ');
    boolean b8 = improvedTokenizer2.hasNext();
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "");
    int i12 = improvedTokenizer2.stop();
    int i14 = improvedTokenizer2.start('a');
    java.io.InputStream inputStream15 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream15, "44");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test044"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i6 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.stop();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    int i10 = improvedTokenizer2.start(' ');
    int i12 = improvedTokenizer2.matchingToken('a');
    int i14 = improvedTokenizer2.start('a');
    int i16 = improvedTokenizer2.matchingToken('a');
    boolean b17 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test045"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4a", "");
    int i3 = improvedTokenizer2.stop();
    int i4 = improvedTokenizer2.stop();
    int i6 = improvedTokenizer2.start('4');
    int i8 = improvedTokenizer2.start(' ');
    java.lang.String str9 = improvedTokenizer2.next();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4a"+ "'", str9.equals("4a"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test046"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    int i13 = improvedTokenizer2.beforeToken('#');
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    boolean b15 = improvedTokenizer2.hasNext();
    boolean b16 = improvedTokenizer2.hasNext();
    int i17 = improvedTokenizer2.stop();
    boolean b18 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4"+ "'", str14.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test047"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.advance();
    int i9 = improvedTokenizer2.stop();
    int i10 = improvedTokenizer2.stop();
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "");
    int i16 = improvedTokenizer2.start(' ');
    int i18 = improvedTokenizer2.beforeToken(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test048"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.start('4');
    int i20 = improvedTokenizer2.afterToken('4');
    int i22 = improvedTokenizer2.start('a');
    java.io.Reader reader23 = null;
    improvedTokenizer2.initialize(reader23, "hi!");
    int i27 = improvedTokenizer2.start('4');
    int i29 = improvedTokenizer2.afterToken(' ');
    java.io.Reader reader30 = null;
    improvedTokenizer2.initialize(reader30, "4#");
    // The following exception was thrown during execution in test generation
    try {
    int i34 = improvedTokenizer2.beforeToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 3);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test049"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.stop();
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "a");
    boolean b16 = improvedTokenizer2.keepParsing((int)'#');
    int i17 = improvedTokenizer2.stop();
    java.lang.String str18 = improvedTokenizer2.previousDelimiter();
    int i20 = improvedTokenizer2.start('a');
    java.io.InputStream inputStream21 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream21, "# ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 2);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test050"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.start('4');
    int i20 = improvedTokenizer2.afterToken('4');
    int i22 = improvedTokenizer2.matchingToken('a');
    boolean b23 = improvedTokenizer2.hasNext();
    int i24 = improvedTokenizer2.stop();
    int i25 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test051"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.advance();
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.start('4');
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    int i14 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.advance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test052"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('#');
    boolean b9 = improvedTokenizer2.advance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test053"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.start('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.afterToken('4');
    boolean b10 = improvedTokenizer2.hasNext();
    boolean b11 = improvedTokenizer2.hasNext();
    int i12 = improvedTokenizer2.stop();
    int i13 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.keepParsing(128);
    int i16 = improvedTokenizer2.stop();
    java.io.InputStream inputStream17 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream17, "4 4a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test054"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i6 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.stop();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    int i10 = improvedTokenizer2.start(' ');
    int i12 = improvedTokenizer2.matchingToken('a');
    int i14 = improvedTokenizer2.afterToken(' ');
    java.io.Reader reader15 = null;
    improvedTokenizer2.initialize(reader15, "#");
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test055"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.start('a');
    boolean b16 = improvedTokenizer2.keepParsing(3);
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    int i18 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test056"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    int i15 = improvedTokenizer2.start('4');
    int i17 = improvedTokenizer2.matchingToken('#');
    boolean b19 = improvedTokenizer2.keepParsing((int)(byte)1);
    java.io.Reader reader20 = null;
    improvedTokenizer2.initialize(reader20, "4 ");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test057"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "4a");
    boolean b3 = improvedTokenizer2.hasNext();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test058"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    boolean b13 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.stop();
    java.io.Reader reader15 = null;
    improvedTokenizer2.initialize(reader15, "");
    java.lang.String str18 = improvedTokenizer2.previousDelimiter();
    java.lang.String str19 = improvedTokenizer2.previousDelimiter();
    int i21 = improvedTokenizer2.start('#');
    int i23 = improvedTokenizer2.beforeToken('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 3);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test059"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i6 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.stop();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    int i10 = improvedTokenizer2.start(' ');
    int i12 = improvedTokenizer2.matchingToken('#');
    java.io.Reader reader13 = null;
    improvedTokenizer2.initialize(reader13, "a ");
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test060"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.keepParsing(100);
    boolean b9 = improvedTokenizer2.keepParsing((int)' ');
    boolean b10 = improvedTokenizer2.advance();
    int i11 = improvedTokenizer2.stop();
    boolean b12 = improvedTokenizer2.advance();
    int i13 = improvedTokenizer2.stop();
    boolean b14 = improvedTokenizer2.hasNext();
    boolean b16 = improvedTokenizer2.keepParsing((int)(short)0);
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test061"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    boolean b9 = improvedTokenizer2.advance();
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    int i12 = improvedTokenizer2.start('#');
    boolean b13 = improvedTokenizer2.hasNext();
    boolean b15 = improvedTokenizer2.keepParsing(0);
    int i16 = improvedTokenizer2.stop();
    java.io.Reader reader17 = null;
    improvedTokenizer2.initialize(reader17, "4#");
    boolean b21 = improvedTokenizer2.keepParsing(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test062"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.afterToken('#');
    boolean b15 = improvedTokenizer2.advance();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test063"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.afterToken(' ');
    int i7 = improvedTokenizer2.stop();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.matchingToken('a');
    boolean b12 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test064"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "hi!");
    boolean b3 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.keepParsing((int)(short)-1);
    java.lang.String str6 = improvedTokenizer2.next();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " "+ "'", str6.equals(" "));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test065"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.keepParsing((int)(short)-1);
    boolean b10 = improvedTokenizer2.hasNext();
    int i12 = improvedTokenizer2.start('#');
    int i14 = improvedTokenizer2.afterToken('#');
    int i16 = improvedTokenizer2.beforeToken('a');
    int i18 = improvedTokenizer2.matchingToken('4');
    int i20 = improvedTokenizer2.beforeToken('a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test066"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "hi!");
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i13 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.keepParsing(4);
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "");
    java.io.Reader reader19 = null;
    improvedTokenizer2.initialize(reader19, " ");
    java.lang.String str22 = improvedTokenizer2.previousDelimiter();
    java.io.InputStream inputStream23 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream23, "# ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test067"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4 4a", "a");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "");
    java.io.InputStream inputStream6 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream6, "#4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test068"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(128);
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    boolean b7 = improvedTokenizer2.keepParsing(0);
    java.lang.String str8 = improvedTokenizer2.next();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test069"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    int i13 = improvedTokenizer2.beforeToken('4');
    boolean b15 = improvedTokenizer2.keepParsing((int)(short)1);
    int i17 = improvedTokenizer2.start('#');
    java.io.Reader reader18 = null;
    improvedTokenizer2.initialize(reader18, "a#");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test070"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)'a');
    boolean b15 = improvedTokenizer2.hasNext();
    int i17 = improvedTokenizer2.start('a');
    boolean b18 = improvedTokenizer2.hasNext();
    int i20 = improvedTokenizer2.afterToken('4');
    int i22 = improvedTokenizer2.beforeToken('a');
    int i24 = improvedTokenizer2.afterToken('4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test071"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.keepParsing((int)(short)-1);
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    int i11 = improvedTokenizer2.start('a');
    int i13 = improvedTokenizer2.beforeToken('a');
    boolean b15 = improvedTokenizer2.keepParsing(100);
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test072"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.keepParsing((int)(short)-1);
    boolean b10 = improvedTokenizer2.hasNext();
    int i12 = improvedTokenizer2.start('#');
    int i14 = improvedTokenizer2.afterToken(' ');
    java.io.Reader reader15 = null;
    improvedTokenizer2.initialize(reader15, "4a");
    // The following exception was thrown during execution in test generation
    try {
    int i19 = improvedTokenizer2.matchingToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test073"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.start('a');
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "4a");
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "4 4a");
    int i15 = improvedTokenizer2.start('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test074"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.advance();
    int i9 = improvedTokenizer2.start('a');
    int i11 = improvedTokenizer2.beforeToken(' ');
    int i13 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test075"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b11 = improvedTokenizer2.advance();
    int i12 = improvedTokenizer2.stop();
    int i14 = improvedTokenizer2.start('a');
    int i16 = improvedTokenizer2.matchingToken('4');
    java.io.Reader reader17 = null;
    improvedTokenizer2.initialize(reader17, "");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test076"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)100);
    int i11 = improvedTokenizer2.stop();
    boolean b12 = improvedTokenizer2.advance();
    boolean b13 = improvedTokenizer2.advance();
    int i15 = improvedTokenizer2.start(' ');
    boolean b17 = improvedTokenizer2.keepParsing((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test077"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    int i15 = improvedTokenizer2.matchingToken('#');
    int i17 = improvedTokenizer2.start('#');
    boolean b18 = improvedTokenizer2.hasNext();
    int i20 = improvedTokenizer2.afterToken('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test078"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('a');
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    boolean b11 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test079"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing((int)'4');
    int i6 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test080"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b9 = improvedTokenizer2.hasNext();
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    boolean b12 = improvedTokenizer2.keepParsing((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test081"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.afterToken('#');
    int i20 = improvedTokenizer2.start('#');
    java.io.Reader reader21 = null;
    improvedTokenizer2.initialize(reader21, "");
    java.io.Reader reader24 = null;
    improvedTokenizer2.initialize(reader24, "4");
    java.io.Reader reader27 = null;
    improvedTokenizer2.initialize(reader27, "a#");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test082"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b11 = improvedTokenizer2.advance();
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "");
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    int i17 = improvedTokenizer2.start('#');
    int i18 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i20 = improvedTokenizer2.beforeToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test083"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.keepParsing(4);
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test084"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.afterToken('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "a"+ "'", str7.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "a"+ "'", str8.equals("a"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test085"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", " ");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('#');
    int i7 = improvedTokenizer2.start(' ');
    boolean b9 = improvedTokenizer2.keepParsing((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4"+ "'", str3.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test086"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    java.lang.String str7 = improvedTokenizer2.next();
    boolean b8 = improvedTokenizer2.hasNext();
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, " ");
    int i12 = improvedTokenizer2.stop();
    int i14 = improvedTokenizer2.start('#');
    java.io.InputStream inputStream15 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream15, "#");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test087"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    int i7 = improvedTokenizer2.start(' ');
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    int i10 = improvedTokenizer2.beforeToken('4');
    int i12 = improvedTokenizer2.beforeToken('#');
    int i14 = improvedTokenizer2.beforeToken('4');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    int i17 = improvedTokenizer2.start('#');
    boolean b18 = improvedTokenizer2.hasNext();
    boolean b20 = improvedTokenizer2.keepParsing((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#"+ "'", str15.equals("#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test088"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i17 = improvedTokenizer2.stop();
    int i19 = improvedTokenizer2.start('a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test089"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    boolean b4 = improvedTokenizer2.advance();
    int i6 = improvedTokenizer2.start(' ');
    int i8 = improvedTokenizer2.beforeToken('4');
    int i10 = improvedTokenizer2.start('4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test090"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.start('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.afterToken('4');
    int i11 = improvedTokenizer2.start(' ');
    int i13 = improvedTokenizer2.beforeToken('#');
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    boolean b15 = improvedTokenizer2.hasNext();
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + " "+ "'", str14.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " "+ "'", str16.equals(" "));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test091"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    boolean b9 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.stop();
    int i12 = improvedTokenizer2.start(' ');
    int i14 = improvedTokenizer2.start('#');
    int i15 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test092"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    int i15 = improvedTokenizer2.start('4');
    int i17 = improvedTokenizer2.matchingToken('#');
    boolean b19 = improvedTokenizer2.keepParsing((int)(byte)1);
    int i20 = improvedTokenizer2.stop();
    boolean b21 = improvedTokenizer2.advance();
    java.lang.String str22 = improvedTokenizer2.previousDelimiter();
    boolean b24 = improvedTokenizer2.keepParsing(1);
    int i25 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test093"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b13 = improvedTokenizer2.advance();
    int i14 = improvedTokenizer2.stop();
    boolean b16 = improvedTokenizer2.keepParsing(0);
    int i18 = improvedTokenizer2.start('4');
    int i20 = improvedTokenizer2.afterToken('a');
    java.io.InputStream inputStream21 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream21, "a#");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test094"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    int i10 = improvedTokenizer2.matchingToken('a');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    boolean b13 = improvedTokenizer2.advance();
    boolean b15 = improvedTokenizer2.keepParsing((int)(byte)100);
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, " ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test095"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    boolean b4 = improvedTokenizer2.hasNext();
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i9 = improvedTokenizer2.start('a');
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.beforeToken('#');
    int i16 = improvedTokenizer2.afterToken('#');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test096"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing((int)'4');
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    int i8 = improvedTokenizer2.start('#');
    int i10 = improvedTokenizer2.matchingToken('4');
    boolean b11 = improvedTokenizer2.advance();
    boolean b12 = improvedTokenizer2.advance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test097"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    java.lang.String str7 = improvedTokenizer2.next();
    int i9 = improvedTokenizer2.start('a');
    int i10 = improvedTokenizer2.stop();
    boolean b11 = improvedTokenizer2.hasNext();
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "a");
    java.io.Reader reader15 = null;
    improvedTokenizer2.initialize(reader15, " ");
    int i19 = improvedTokenizer2.start('4');
    int i21 = improvedTokenizer2.beforeToken('a');
    int i22 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test098"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    java.lang.String str7 = improvedTokenizer2.next();
    boolean b8 = improvedTokenizer2.hasNext();
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "");
    boolean b13 = improvedTokenizer2.keepParsing((int)(short)1);
    boolean b15 = improvedTokenizer2.keepParsing((int)(byte)100);
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    int i18 = improvedTokenizer2.beforeToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test099"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    int i15 = improvedTokenizer2.start('4');
    int i17 = improvedTokenizer2.afterToken('a');
    int i19 = improvedTokenizer2.matchingToken('4');
    java.lang.String str20 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "4"+ "'", str20.equals("4"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test100"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)'a');
    boolean b15 = improvedTokenizer2.hasNext();
    int i17 = improvedTokenizer2.start('a');
    int i19 = improvedTokenizer2.beforeToken('a');
    int i21 = improvedTokenizer2.beforeToken('a');
    int i22 = improvedTokenizer2.stop();
    int i24 = improvedTokenizer2.start(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test101"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    boolean b9 = improvedTokenizer2.advance();
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    int i12 = improvedTokenizer2.start('#');
    boolean b13 = improvedTokenizer2.hasNext();
    int i15 = improvedTokenizer2.afterToken('4');
    boolean b17 = improvedTokenizer2.keepParsing((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test102"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    int i13 = improvedTokenizer2.beforeToken('#');
    int i15 = improvedTokenizer2.matchingToken(' ');
    int i17 = improvedTokenizer2.beforeToken(' ');
    java.lang.String str18 = improvedTokenizer2.previousDelimiter();
    java.lang.String str19 = improvedTokenizer2.previousDelimiter();
    java.lang.String str20 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "# "+ "'", str18.equals("# "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "# "+ "'", str19.equals("# "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "# "+ "'", str20.equals("# "));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test103"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    int i7 = improvedTokenizer2.matchingToken('#');
    boolean b8 = improvedTokenizer2.hasNext();
    boolean b9 = improvedTokenizer2.advance();
    java.io.InputStream inputStream10 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream10, "4 ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test104"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4a", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('4');
    // The following exception was thrown during execution in test generation
    try {
    int i6 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4a"+ "'", str3.equals("4a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test105"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.start('#');
    boolean b7 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.hasNext();
    int i9 = improvedTokenizer2.stop();
    boolean b10 = improvedTokenizer2.advance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test106"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.keepParsing((int)(short)-1);
    boolean b10 = improvedTokenizer2.hasNext();
    int i12 = improvedTokenizer2.start(' ');
    boolean b14 = improvedTokenizer2.keepParsing(3);
    java.io.Reader reader15 = null;
    improvedTokenizer2.initialize(reader15, "a");
    int i19 = improvedTokenizer2.start('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test107"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    int i13 = improvedTokenizer2.beforeToken('a');
    int i15 = improvedTokenizer2.matchingToken('a');
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader17 = null;
    improvedTokenizer2.initialize(reader17, "");
    int i20 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i22 = improvedTokenizer2.beforeToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#"+ "'", str16.equals("#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test108"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)-1);
    int i9 = improvedTokenizer2.stop();
    int i11 = improvedTokenizer2.start(' ');
    boolean b12 = improvedTokenizer2.hasNext();
    boolean b13 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream14 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream14, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test109"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    int i7 = improvedTokenizer2.stop();
    int i8 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test110"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    int i7 = improvedTokenizer2.start(' ');
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    int i10 = improvedTokenizer2.beforeToken('a');
    int i12 = improvedTokenizer2.start('4');
    boolean b13 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test111"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "a");
    java.lang.String str3 = improvedTokenizer2.next();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test112"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "");
    int i3 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.start('4');
    int i7 = improvedTokenizer2.matchingToken('#');
    int i8 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i10 = improvedTokenizer2.afterToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test113"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    int i7 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test114"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.afterToken('4');
    int i12 = improvedTokenizer2.matchingToken(' ');
    boolean b13 = improvedTokenizer2.advance();
    int i15 = improvedTokenizer2.start('#');
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    int i18 = improvedTokenizer2.matchingToken('#');
    boolean b20 = improvedTokenizer2.keepParsing((int)' ');
    boolean b22 = improvedTokenizer2.keepParsing((int)(short)100);
    boolean b23 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test115"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('4');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken('a');
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b11 = improvedTokenizer2.advance();
    boolean b12 = improvedTokenizer2.advance();
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test116"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "hi!");
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i14 = improvedTokenizer2.start('4');
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test117"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i6 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.keepParsing((int)(short)-1);
    boolean b10 = improvedTokenizer2.keepParsing((int)(byte)10);
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    int i15 = improvedTokenizer2.afterToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test118"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.keepParsing(100);
    boolean b9 = improvedTokenizer2.keepParsing((int)' ');
    java.io.Reader reader10 = null;
    improvedTokenizer2.initialize(reader10, "");
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader14 = null;
    improvedTokenizer2.initialize(reader14, "");
    int i17 = improvedTokenizer2.stop();
    java.lang.String str18 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader19 = null;
    improvedTokenizer2.initialize(reader19, "#4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test119"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.start('a');
    int i16 = improvedTokenizer2.start('4');
    int i18 = improvedTokenizer2.beforeToken(' ');
    int i20 = improvedTokenizer2.matchingToken('#');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test120"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i10 = improvedTokenizer2.start('a');
    boolean b11 = improvedTokenizer2.hasNext();
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "#");
    int i15 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i17 = improvedTokenizer2.beforeToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test121"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    int i13 = improvedTokenizer2.beforeToken('a');
    int i15 = improvedTokenizer2.matchingToken('a');
    boolean b17 = improvedTokenizer2.keepParsing(128);
    java.lang.String str18 = improvedTokenizer2.previousDelimiter();
    int i20 = improvedTokenizer2.matchingToken('a');
    int i22 = improvedTokenizer2.start('#');
    int i24 = improvedTokenizer2.matchingToken('a');
    boolean b25 = improvedTokenizer2.advance();
    boolean b26 = improvedTokenizer2.advance();
    boolean b28 = improvedTokenizer2.keepParsing(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#"+ "'", str18.equals("#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test122"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b3 = improvedTokenizer2.advance();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i8 = improvedTokenizer2.stop();
    int i10 = improvedTokenizer2.start(' ');
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test123"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    boolean b9 = improvedTokenizer2.hasNext();
    boolean b11 = improvedTokenizer2.keepParsing(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test124"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.keepParsing(100);
    boolean b9 = improvedTokenizer2.keepParsing((int)' ');
    boolean b10 = improvedTokenizer2.advance();
    int i11 = improvedTokenizer2.stop();
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "a");
    java.io.Reader reader15 = null;
    improvedTokenizer2.initialize(reader15, "");
    java.lang.String str18 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    int i20 = improvedTokenizer2.afterToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test125"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(128);
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start('a');
    int i9 = improvedTokenizer2.beforeToken(' ');
    boolean b10 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test126"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.hasNext();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.stop();
    int i12 = improvedTokenizer2.start('#');
    boolean b14 = improvedTokenizer2.keepParsing(1);
    int i16 = improvedTokenizer2.matchingToken('4');
    int i18 = improvedTokenizer2.matchingToken(' ');
    int i20 = improvedTokenizer2.matchingToken(' ');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test127"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.afterToken('#');
    boolean b8 = improvedTokenizer2.keepParsing((-1));
    boolean b9 = improvedTokenizer2.hasNext();
    int i11 = improvedTokenizer2.start(' ');
    boolean b13 = improvedTokenizer2.keepParsing(0);
    int i15 = improvedTokenizer2.afterToken('#');
    int i17 = improvedTokenizer2.start('#');
    java.lang.String str18 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test128"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b7 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.hasNext();
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test129"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a#", "a#");
    java.io.InputStream inputStream3 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream3, "a#");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test130"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.afterToken('#');
    boolean b8 = improvedTokenizer2.keepParsing((-1));
    boolean b9 = improvedTokenizer2.hasNext();
    boolean b10 = improvedTokenizer2.hasNext();
    boolean b11 = improvedTokenizer2.advance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test131"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(4);
    boolean b5 = improvedTokenizer2.hasNext();
    int i6 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.stop();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    int i10 = improvedTokenizer2.start(' ');
    int i12 = improvedTokenizer2.beforeToken('#');
    java.io.Reader reader13 = null;
    improvedTokenizer2.initialize(reader13, "");
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test132"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)-1);
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader10 = null;
    improvedTokenizer2.initialize(reader10, "a");
    java.io.InputStream inputStream13 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream13, "44");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test133"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.beforeToken('a');
    int i16 = improvedTokenizer2.afterToken('4');
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader18 = null;
    improvedTokenizer2.initialize(reader18, "#4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "a"+ "'", str17.equals("a"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test134"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", " ");
    boolean b3 = improvedTokenizer2.advance();
    boolean b4 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test135"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    java.lang.String str7 = improvedTokenizer2.next();
    int i9 = improvedTokenizer2.start('a');
    int i10 = improvedTokenizer2.stop();
    boolean b11 = improvedTokenizer2.hasNext();
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "a");
    // The following exception was thrown during execution in test generation
    try {
    int i16 = improvedTokenizer2.matchingToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test136"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.start('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.matchingToken(' ');
    int i11 = improvedTokenizer2.matchingToken('#');
    int i13 = improvedTokenizer2.matchingToken('4');
    int i15 = improvedTokenizer2.afterToken(' ');
    boolean b16 = improvedTokenizer2.advance();
    boolean b18 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader19 = null;
    improvedTokenizer2.initialize(reader19, "4 ");
    // The following exception was thrown during execution in test generation
    try {
    boolean b22 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test137"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "");
    boolean b4 = improvedTokenizer2.keepParsing(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test138"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "hi!");
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i13 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.keepParsing(4);
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "");
    java.io.Reader reader19 = null;
    improvedTokenizer2.initialize(reader19, " ");
    int i22 = improvedTokenizer2.stop();
    java.lang.String str23 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test139"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    int i11 = improvedTokenizer2.beforeToken('#');
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i14 = improvedTokenizer2.matchingToken('4');
    int i16 = improvedTokenizer2.afterToken('#');
    java.io.InputStream inputStream17 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream17, "a#");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "a"+ "'", str9.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#"+ "'", str12.equals("#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test140"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.beforeToken('a');
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.matchingToken('a');
    int i16 = improvedTokenizer2.start(' ');
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    int i19 = improvedTokenizer2.matchingToken('4');
    int i21 = improvedTokenizer2.start('a');
    int i23 = improvedTokenizer2.afterToken('4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 3);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test141"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.beforeToken('a');
    int i16 = improvedTokenizer2.matchingToken(' ');
    boolean b18 = improvedTokenizer2.keepParsing(5);
    int i20 = improvedTokenizer2.afterToken('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test142"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.stop();
    int i8 = improvedTokenizer2.stop();
    java.lang.String str9 = improvedTokenizer2.next();
    java.io.Reader reader10 = null;
    improvedTokenizer2.initialize(reader10, "4 ");
    java.io.InputStream inputStream13 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream13, "4 4a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test143"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i10 = improvedTokenizer2.start('#');
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "a");
    java.io.Reader reader14 = null;
    improvedTokenizer2.initialize(reader14, "");
    java.io.Reader reader17 = null;
    improvedTokenizer2.initialize(reader17, "");
    java.io.Reader reader20 = null;
    improvedTokenizer2.initialize(reader20, "4a");
    // The following exception was thrown during execution in test generation
    try {
    int i24 = improvedTokenizer2.matchingToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test144"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4 ", "a");
    java.io.InputStream inputStream3 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream3, "4 4a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test145"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4a", "4a");
    boolean b3 = improvedTokenizer2.hasNext();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.start('a');
    int i9 = improvedTokenizer2.beforeToken('a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test146"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "hi!");
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i13 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.keepParsing(4);
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "");
    java.io.Reader reader19 = null;
    improvedTokenizer2.initialize(reader19, " ");
    java.lang.String str22 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    int i24 = improvedTokenizer2.beforeToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test147"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" #", "4a");

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test148"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    int i13 = improvedTokenizer2.beforeToken('#');
    boolean b15 = improvedTokenizer2.keepParsing((-1));
    int i17 = improvedTokenizer2.afterToken(' ');
    boolean b18 = improvedTokenizer2.advance();
    java.lang.String str19 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test149"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.afterToken('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.beforeToken('4');
    java.lang.String str10 = improvedTokenizer2.next();
    boolean b12 = improvedTokenizer2.keepParsing(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "a"+ "'", str7.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " "+ "'", str10.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test150"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    boolean b4 = improvedTokenizer2.hasNext();
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "hi!");
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i13 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test151"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "hi!");
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    int i15 = improvedTokenizer2.start('4');
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test152"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "");
    int i3 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.start('4');
    int i7 = improvedTokenizer2.start(' ');
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    int i10 = improvedTokenizer2.start('#');
    java.io.InputStream inputStream11 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream11, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test153"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i6 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.keepParsing((int)(short)-1);
    boolean b9 = improvedTokenizer2.advance();
    java.io.Reader reader10 = null;
    improvedTokenizer2.initialize(reader10, "4");
    java.io.InputStream inputStream13 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream13, "4 ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test154"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "#4");

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test155"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.start('4');
    boolean b20 = improvedTokenizer2.keepParsing(1);
    java.io.Reader reader21 = null;
    improvedTokenizer2.initialize(reader21, " ");
    // The following exception was thrown during execution in test generation
    try {
    boolean b24 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test156"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "4 ");
    int i4 = improvedTokenizer2.start('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test157"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    java.io.Reader reader13 = null;
    improvedTokenizer2.initialize(reader13, "");
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test158"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.beforeToken('a');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    boolean b16 = improvedTokenizer2.advance();
    int i18 = improvedTokenizer2.start(' ');
    boolean b20 = improvedTokenizer2.keepParsing((int)(short)0);
    int i22 = improvedTokenizer2.afterToken('4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "4"+ "'", str15.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test159"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4 ", "");
    boolean b3 = improvedTokenizer2.hasNext();
    java.io.Reader reader4 = null;
    improvedTokenizer2.initialize(reader4, "4#");
    int i7 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test160"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.start('4');
    int i20 = improvedTokenizer2.afterToken('4');
    int i22 = improvedTokenizer2.matchingToken('a');
    java.lang.String str23 = improvedTokenizer2.previousDelimiter();
    int i25 = improvedTokenizer2.start('a');
    int i27 = improvedTokenizer2.afterToken('#');
    boolean b28 = improvedTokenizer2.hasNext();
    int i29 = improvedTokenizer2.stop();
    boolean b30 = improvedTokenizer2.advance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "4"+ "'", str23.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test161"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test162"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.keepParsing(100);
    boolean b9 = improvedTokenizer2.keepParsing((int)' ');
    boolean b10 = improvedTokenizer2.advance();
    int i11 = improvedTokenizer2.stop();
    boolean b12 = improvedTokenizer2.advance();
    int i13 = improvedTokenizer2.stop();
    int i15 = improvedTokenizer2.start('4');
    int i17 = improvedTokenizer2.start('a');
    int i19 = improvedTokenizer2.afterToken('a');
    int i21 = improvedTokenizer2.afterToken('a');
    int i23 = improvedTokenizer2.afterToken('a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 3);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test163"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(4);
    boolean b5 = improvedTokenizer2.hasNext();
    int i6 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.stop();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    int i10 = improvedTokenizer2.start(' ');
    int i12 = improvedTokenizer2.matchingToken('a');
    int i14 = improvedTokenizer2.matchingToken('4');
    boolean b15 = improvedTokenizer2.hasNext();
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "#a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test164"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)1);
    boolean b11 = improvedTokenizer2.advance();
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "#a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test165"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.afterToken('#');
    java.lang.String str15 = improvedTokenizer2.next();
    int i17 = improvedTokenizer2.start(' ');
    java.lang.String str18 = improvedTokenizer2.previousDelimiter();
    int i19 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test166"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    int i6 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.hasNext();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.advance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test167"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b11 = improvedTokenizer2.hasNext();
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.start('#');
    boolean b15 = improvedTokenizer2.advance();
    int i17 = improvedTokenizer2.start('#');
    boolean b19 = improvedTokenizer2.keepParsing((int)(byte)1);
    java.lang.String str20 = improvedTokenizer2.previousDelimiter();
    int i22 = improvedTokenizer2.start(' ');
    int i24 = improvedTokenizer2.afterToken(' ');
    int i25 = improvedTokenizer2.stop();
    int i27 = improvedTokenizer2.start('a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test168"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    java.io.Reader reader4 = null;
    improvedTokenizer2.initialize(reader4, "");
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "hi!");
    int i11 = improvedTokenizer2.start('a');
    boolean b13 = improvedTokenizer2.keepParsing(0);
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    int i16 = improvedTokenizer2.beforeToken('#');
    int i17 = improvedTokenizer2.stop();
    java.lang.String str18 = improvedTokenizer2.previousDelimiter();
    int i20 = improvedTokenizer2.start(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test169"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.start(' ');
    int i12 = improvedTokenizer2.beforeToken('a');
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader14 = null;
    improvedTokenizer2.initialize(reader14, "hi!");
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " "+ "'", str13.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test170"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    int i13 = improvedTokenizer2.beforeToken('a');
    int i15 = improvedTokenizer2.matchingToken('a');
    boolean b17 = improvedTokenizer2.keepParsing(128);
    java.lang.String str18 = improvedTokenizer2.previousDelimiter();
    boolean b19 = improvedTokenizer2.hasNext();
    boolean b21 = improvedTokenizer2.keepParsing(0);
    boolean b23 = improvedTokenizer2.keepParsing((int)(short)100);
    int i25 = improvedTokenizer2.start(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#"+ "'", str18.equals("#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 3);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test171"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)-1);
    int i9 = improvedTokenizer2.stop();
    boolean b11 = improvedTokenizer2.keepParsing(0);
    boolean b13 = improvedTokenizer2.keepParsing((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test172"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.keepParsing(100);
    boolean b9 = improvedTokenizer2.keepParsing((int)' ');
    boolean b10 = improvedTokenizer2.advance();
    int i11 = improvedTokenizer2.stop();
    boolean b12 = improvedTokenizer2.advance();
    int i13 = improvedTokenizer2.stop();
    int i15 = improvedTokenizer2.start('4');
    boolean b17 = improvedTokenizer2.keepParsing(0);
    int i19 = improvedTokenizer2.afterToken('a');
    int i21 = improvedTokenizer2.afterToken('#');
    boolean b22 = improvedTokenizer2.hasNext();
    int i24 = improvedTokenizer2.afterToken('4');
    int i26 = improvedTokenizer2.beforeToken(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 3);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test173"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    java.lang.String str7 = improvedTokenizer2.next();
    int i8 = improvedTokenizer2.stop();
    int i9 = improvedTokenizer2.stop();
    boolean b10 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream11 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream11, "4 ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test174"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "4");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "a");
    boolean b7 = improvedTokenizer2.keepParsing(3);
    boolean b9 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader10 = null;
    improvedTokenizer2.initialize(reader10, "4#");
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test175"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)100);
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "");
    java.io.Reader reader14 = null;
    improvedTokenizer2.initialize(reader14, "hi!");
    int i18 = improvedTokenizer2.start('a');
    int i20 = improvedTokenizer2.matchingToken('a');
    java.io.Reader reader21 = null;
    improvedTokenizer2.initialize(reader21, "a");
    int i24 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test176"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    java.lang.String str7 = improvedTokenizer2.next();
    boolean b8 = improvedTokenizer2.hasNext();
    int i9 = improvedTokenizer2.stop();
    boolean b10 = improvedTokenizer2.hasNext();
    int i11 = improvedTokenizer2.stop();
    java.io.InputStream inputStream12 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream12, "#");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test177"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.start('4');
    int i20 = improvedTokenizer2.afterToken('4');
    int i22 = improvedTokenizer2.matchingToken('a');
    java.lang.String str23 = improvedTokenizer2.previousDelimiter();
    int i25 = improvedTokenizer2.start(' ');
    java.io.Reader reader26 = null;
    improvedTokenizer2.initialize(reader26, "a");
    // The following exception was thrown during execution in test generation
    try {
    int i30 = improvedTokenizer2.afterToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "4"+ "'", str23.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 3);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test178"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)0);
    int i12 = improvedTokenizer2.matchingToken('#');
    boolean b13 = improvedTokenizer2.advance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test179"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "hi!");
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i13 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.keepParsing(4);
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "");
    java.io.Reader reader19 = null;
    improvedTokenizer2.initialize(reader19, "4 4a");
    boolean b23 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader24 = null;
    improvedTokenizer2.initialize(reader24, "44");
    // The following exception was thrown during execution in test generation
    try {
    boolean b27 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test180"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.start('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.afterToken('4');
    int i11 = improvedTokenizer2.start(' ');
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "");
    // The following exception was thrown during execution in test generation
    try {
    int i16 = improvedTokenizer2.matchingToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test181"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)'a');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    java.lang.String str17 = improvedTokenizer2.next();
    boolean b19 = improvedTokenizer2.keepParsing(1);
    java.lang.String str20 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "4"+ "'", str15.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "4"+ "'", str16.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test182"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i10 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.keepParsing((int)'4');
    int i14 = improvedTokenizer2.beforeToken('a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test183"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(128);
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test184"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#", "a ");
    java.io.InputStream inputStream3 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream3, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test185"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    java.lang.String str7 = improvedTokenizer2.next();
    boolean b8 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.start('a');
    int i12 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test186"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken('a');
    int i18 = improvedTokenizer2.start('4');
    int i19 = improvedTokenizer2.stop();
    int i21 = improvedTokenizer2.start(' ');
    boolean b22 = improvedTokenizer2.advance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test187"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.stop();
    java.lang.String str12 = improvedTokenizer2.next();
    int i14 = improvedTokenizer2.start(' ');
    java.io.InputStream inputStream15 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream15, "a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test188"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    int i5 = improvedTokenizer2.stop();
    int i6 = improvedTokenizer2.stop();
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "4a");
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test189"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4a", "a ");
    boolean b3 = improvedTokenizer2.hasNext();
    java.lang.String str4 = improvedTokenizer2.next();
    java.lang.String str5 = improvedTokenizer2.next();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4"+ "'", str4.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test190"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.start('4');
    int i20 = improvedTokenizer2.afterToken('4');
    int i22 = improvedTokenizer2.matchingToken('a');
    int i24 = improvedTokenizer2.afterToken('a');
    java.lang.String str25 = improvedTokenizer2.previousDelimiter();
    java.lang.String str26 = improvedTokenizer2.next();
    java.io.Reader reader27 = null;
    improvedTokenizer2.initialize(reader27, "4#");
    java.io.Reader reader30 = null;
    improvedTokenizer2.initialize(reader30, "4 4a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "4a"+ "'", str25.equals("4a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test191"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.beforeToken('4');
    int i8 = improvedTokenizer2.matchingToken('4');
    int i10 = improvedTokenizer2.start(' ');
    boolean b11 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test192"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(short)-1);
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test193"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4 ", "4a");
    boolean b3 = improvedTokenizer2.advance();
    java.io.Reader reader4 = null;
    improvedTokenizer2.initialize(reader4, "a ");
    int i8 = improvedTokenizer2.start('#');
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test194"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)'a');
    boolean b15 = improvedTokenizer2.hasNext();
    int i17 = improvedTokenizer2.start('a');
    boolean b18 = improvedTokenizer2.hasNext();
    int i20 = improvedTokenizer2.start('a');
    boolean b21 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test195"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "#");
    boolean b3 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.start('4');
    java.lang.String str6 = improvedTokenizer2.next();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test196"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(128);
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start('a');
    boolean b8 = improvedTokenizer2.advance();
    boolean b9 = improvedTokenizer2.advance();
    java.io.Reader reader10 = null;
    improvedTokenizer2.initialize(reader10, "4");
    java.io.Reader reader13 = null;
    improvedTokenizer2.initialize(reader13, "4a");
    // The following exception was thrown during execution in test generation
    try {
    int i17 = improvedTokenizer2.beforeToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test197"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4#", "4");
    boolean b3 = improvedTokenizer2.hasNext();
    java.lang.String str4 = improvedTokenizer2.next();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#"+ "'", str4.equals("#"));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test198"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    boolean b6 = improvedTokenizer2.advance();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "#");
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "4a");
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test199"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.beforeToken('a');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    boolean b17 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i19 = improvedTokenizer2.matchingToken('4');
    java.lang.String str20 = improvedTokenizer2.previousDelimiter();
    java.lang.String str21 = improvedTokenizer2.previousDelimiter();
    boolean b22 = improvedTokenizer2.hasNext();
    boolean b24 = improvedTokenizer2.keepParsing(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "4"+ "'", str15.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "4"+ "'", str20.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "4"+ "'", str21.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test200"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "4");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "#");
    int i7 = improvedTokenizer2.start('a');
    int i9 = improvedTokenizer2.beforeToken('a');
    java.io.InputStream inputStream10 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream10, "#4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test201"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken('a');
    int i18 = improvedTokenizer2.start('4');
    java.io.InputStream inputStream19 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream19, "4 4a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test202"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.start('4');
    boolean b20 = improvedTokenizer2.keepParsing(1);
    int i22 = improvedTokenizer2.beforeToken('#');
    boolean b23 = improvedTokenizer2.advance();
    int i24 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test203"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.start('4');
    int i20 = improvedTokenizer2.afterToken('4');
    int i22 = improvedTokenizer2.matchingToken('a');
    java.lang.String str23 = improvedTokenizer2.previousDelimiter();
    int i25 = improvedTokenizer2.start('a');
    int i27 = improvedTokenizer2.matchingToken('a');
    boolean b29 = improvedTokenizer2.keepParsing((int)(byte)10);
    java.io.InputStream inputStream30 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream30, "# ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "4"+ "'", str23.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test204"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    boolean b6 = improvedTokenizer2.hasNext();
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "hi!");
    int i11 = improvedTokenizer2.start('#');
    int i13 = improvedTokenizer2.matchingToken(' ');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test205"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken(' ');
    int i9 = improvedTokenizer2.stop();
    int i11 = improvedTokenizer2.start('a');
    int i13 = improvedTokenizer2.afterToken('a');
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "a"+ "'", str14.equals("a"));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test206"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.beforeToken('a');
    int i16 = improvedTokenizer2.matchingToken(' ');
    boolean b18 = improvedTokenizer2.keepParsing(0);
    int i20 = improvedTokenizer2.beforeToken('#');
    boolean b21 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream22 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream22, "4a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test207"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.start('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "4 4a");
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    int i13 = improvedTokenizer2.start('4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test208"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    boolean b9 = improvedTokenizer2.hasNext();
    boolean b10 = improvedTokenizer2.hasNext();
    int i11 = improvedTokenizer2.stop();
    int i12 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test209"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)'a');
    boolean b16 = improvedTokenizer2.keepParsing((int)(byte)10);
    boolean b18 = improvedTokenizer2.keepParsing(0);
    java.lang.String str19 = improvedTokenizer2.previousDelimiter();
    boolean b20 = improvedTokenizer2.advance();
    int i22 = improvedTokenizer2.start(' ');
    int i24 = improvedTokenizer2.beforeToken('a');
    int i26 = improvedTokenizer2.start(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "4"+ "'", str19.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 3);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test210"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    int i7 = improvedTokenizer2.start(' ');
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    int i10 = improvedTokenizer2.beforeToken('a');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "a");
    // The following exception was thrown during execution in test generation
    try {
    int i16 = improvedTokenizer2.matchingToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + " "+ "'", str11.equals(" "));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test211"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)100);
    boolean b9 = improvedTokenizer2.keepParsing(128);
    java.io.Reader reader10 = null;
    improvedTokenizer2.initialize(reader10, "");
    java.io.InputStream inputStream13 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream13, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test212"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.afterToken('#');
    boolean b8 = improvedTokenizer2.keepParsing((-1));
    java.lang.String str9 = improvedTokenizer2.next();
    java.io.Reader reader10 = null;
    improvedTokenizer2.initialize(reader10, " ");
    int i14 = improvedTokenizer2.start('a');
    int i16 = improvedTokenizer2.afterToken('4');
    boolean b18 = improvedTokenizer2.keepParsing((int)(byte)-1);
    java.lang.String str19 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "a"+ "'", str19.equals("a"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test213"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    boolean b11 = improvedTokenizer2.keepParsing((int)'4');
    int i13 = improvedTokenizer2.start(' ');
    boolean b14 = improvedTokenizer2.hasNext();
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "#4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test214"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.afterToken('4');
    int i12 = improvedTokenizer2.beforeToken('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test215"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.matchingToken('a');
    boolean b20 = improvedTokenizer2.keepParsing(2);
    java.io.Reader reader21 = null;
    improvedTokenizer2.initialize(reader21, "44");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test216"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    int i10 = improvedTokenizer2.matchingToken('a');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.afterToken('4');
    java.io.Reader reader15 = null;
    improvedTokenizer2.initialize(reader15, "#");
    boolean b19 = improvedTokenizer2.keepParsing((int)(byte)0);
    java.lang.String str20 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test217"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    int i10 = improvedTokenizer2.matchingToken('a');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.afterToken('4');
    int i15 = improvedTokenizer2.stop();
    boolean b16 = improvedTokenizer2.hasNext();
    int i18 = improvedTokenizer2.start('a');
    boolean b19 = improvedTokenizer2.hasNext();
    int i20 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test218"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.afterToken('4');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.matchingToken('4');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    int i17 = improvedTokenizer2.matchingToken('a');
    java.io.InputStream inputStream18 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream18, "4 4a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#"+ "'", str15.equals("#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test219"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.start('4');
    int i20 = improvedTokenizer2.afterToken('4');
    int i22 = improvedTokenizer2.start('a');
    java.io.Reader reader23 = null;
    improvedTokenizer2.initialize(reader23, "hi!");
    int i27 = improvedTokenizer2.start('4');
    java.io.Reader reader28 = null;
    improvedTokenizer2.initialize(reader28, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test220"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.start('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.afterToken('4');
    boolean b10 = improvedTokenizer2.hasNext();
    boolean b11 = improvedTokenizer2.hasNext();
    int i12 = improvedTokenizer2.stop();
    java.io.Reader reader13 = null;
    improvedTokenizer2.initialize(reader13, " ");
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "");
    int i19 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i21 = improvedTokenizer2.matchingToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test221"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.beforeToken('a');
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.start('4');
    java.io.Reader reader19 = null;
    improvedTokenizer2.initialize(reader19, " ");
    // The following exception was thrown during execution in test generation
    try {
    int i23 = improvedTokenizer2.afterToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test222"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "hi!");
    boolean b3 = improvedTokenizer2.hasNext();
    int i5 = improvedTokenizer2.start(' ');
    boolean b6 = improvedTokenizer2.hasNext();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test223"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.beforeToken('a');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    int i17 = improvedTokenizer2.beforeToken(' ');
    java.io.InputStream inputStream18 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream18, "a#");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "4"+ "'", str15.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test224"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)'a');
    boolean b16 = improvedTokenizer2.keepParsing((int)(byte)10);
    java.io.Reader reader17 = null;
    improvedTokenizer2.initialize(reader17, "");
    boolean b21 = improvedTokenizer2.keepParsing((int)(byte)1);
    java.lang.String str22 = improvedTokenizer2.previousDelimiter();
    java.lang.String str23 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test225"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.afterToken('#');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    java.io.Reader reader10 = null;
    improvedTokenizer2.initialize(reader10, "4");
    boolean b14 = improvedTokenizer2.keepParsing((int)(byte)10);
    boolean b16 = improvedTokenizer2.keepParsing(0);
    // The following exception was thrown during execution in test generation
    try {
    int i18 = improvedTokenizer2.afterToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test226"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b11 = improvedTokenizer2.hasNext();
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "4a");
    boolean b16 = improvedTokenizer2.keepParsing(5);
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    int i19 = improvedTokenizer2.start(' ');
    int i21 = improvedTokenizer2.afterToken(' ');
    int i22 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test227"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(128);
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start('a');
    boolean b8 = improvedTokenizer2.advance();
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "4");
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test228"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.afterToken('#');
    boolean b8 = improvedTokenizer2.keepParsing((-1));
    int i10 = improvedTokenizer2.beforeToken('4');
    int i12 = improvedTokenizer2.afterToken('#');
    int i14 = improvedTokenizer2.start(' ');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    int i16 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test229"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    int i6 = improvedTokenizer2.stop();
    int i8 = improvedTokenizer2.start('4');
    int i10 = improvedTokenizer2.afterToken('4');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test230"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    boolean b4 = improvedTokenizer2.hasNext();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    int i7 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.advance();
    boolean b9 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test231"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.keepParsing(100);
    boolean b9 = improvedTokenizer2.keepParsing((int)' ');
    boolean b10 = improvedTokenizer2.advance();
    int i11 = improvedTokenizer2.stop();
    boolean b12 = improvedTokenizer2.advance();
    int i13 = improvedTokenizer2.stop();
    boolean b14 = improvedTokenizer2.advance();
    boolean b16 = improvedTokenizer2.keepParsing((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test232"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.start('4');
    int i20 = improvedTokenizer2.afterToken('4');
    int i22 = improvedTokenizer2.matchingToken('a');
    java.lang.String str23 = improvedTokenizer2.previousDelimiter();
    int i25 = improvedTokenizer2.start('a');
    int i27 = improvedTokenizer2.afterToken('#');
    java.lang.String str28 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader29 = null;
    improvedTokenizer2.initialize(reader29, "4");
    int i33 = improvedTokenizer2.start('a');
    java.io.InputStream inputStream34 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream34, "4a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "4"+ "'", str23.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "a"+ "'", str28.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 3);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test233"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    boolean b4 = improvedTokenizer2.hasNext();
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i9 = improvedTokenizer2.start('a');
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.matchingToken('a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test234"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    int i10 = improvedTokenizer2.matchingToken('a');
    int i12 = improvedTokenizer2.beforeToken('#');
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    int i15 = improvedTokenizer2.beforeToken('a');
    int i17 = improvedTokenizer2.beforeToken(' ');
    int i18 = improvedTokenizer2.stop();
    int i20 = improvedTokenizer2.start('4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4a"+ "'", str13.equals("4a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test235"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    boolean b10 = improvedTokenizer2.advance();
    int i12 = improvedTokenizer2.start('a');
    int i14 = improvedTokenizer2.start(' ');
    int i16 = improvedTokenizer2.beforeToken('a');
    boolean b17 = improvedTokenizer2.hasNext();
    int i19 = improvedTokenizer2.afterToken('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "a"+ "'", str9.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test236"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    int i15 = improvedTokenizer2.matchingToken('#');
    int i17 = improvedTokenizer2.afterToken('a');
    int i19 = improvedTokenizer2.beforeToken('#');
    int i21 = improvedTokenizer2.afterToken(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test237"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b11 = improvedTokenizer2.advance();
    int i12 = improvedTokenizer2.stop();
    java.io.Reader reader13 = null;
    improvedTokenizer2.initialize(reader13, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test238"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b9 = improvedTokenizer2.advance();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test239"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "4#");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "4a");
    int i6 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test240"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.beforeToken(' ');
    boolean b8 = improvedTokenizer2.keepParsing(5);
    boolean b10 = improvedTokenizer2.keepParsing(10);
    boolean b12 = improvedTokenizer2.keepParsing(128);
    java.io.Reader reader13 = null;
    improvedTokenizer2.initialize(reader13, "#4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test241"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.beforeToken(' ');
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)100);
    int i10 = improvedTokenizer2.matchingToken(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test242"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.advance();
    int i9 = improvedTokenizer2.start('a');
    int i11 = improvedTokenizer2.afterToken('#');
    int i12 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test243"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    int i8 = improvedTokenizer2.start('4');
    boolean b10 = improvedTokenizer2.keepParsing(100);
    int i12 = improvedTokenizer2.beforeToken('a');
    int i14 = improvedTokenizer2.matchingToken('a');
    boolean b16 = improvedTokenizer2.keepParsing((int)'a');
    boolean b17 = improvedTokenizer2.advance();
    java.io.Reader reader18 = null;
    improvedTokenizer2.initialize(reader18, "#4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test244"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.hasNext();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.advance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test245"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i10 = improvedTokenizer2.start('#');
    int i12 = improvedTokenizer2.matchingToken('a');
    boolean b13 = improvedTokenizer2.hasNext();
    int i15 = improvedTokenizer2.beforeToken(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test246"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str3 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test247"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "#");
    boolean b3 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.start('4');
    // The following exception was thrown during execution in test generation
    try {
    int i6 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test248"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    java.io.Reader reader15 = null;
    improvedTokenizer2.initialize(reader15, " ");
    int i19 = improvedTokenizer2.start('#');
    int i21 = improvedTokenizer2.beforeToken('a');
    int i23 = improvedTokenizer2.afterToken('4');
    java.io.InputStream inputStream24 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream24, "4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 3);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test249"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken('a');
    int i18 = improvedTokenizer2.start('4');
    java.lang.String str19 = improvedTokenizer2.previousDelimiter();
    int i21 = improvedTokenizer2.beforeToken('4');
    int i23 = improvedTokenizer2.start('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 3);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test250"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    int i6 = improvedTokenizer2.start(' ');
    boolean b7 = improvedTokenizer2.hasNext();
    int i9 = improvedTokenizer2.matchingToken('#');
    java.io.Reader reader10 = null;
    improvedTokenizer2.initialize(reader10, "a ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test251"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.start('a');
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "4");
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test252"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    int i7 = improvedTokenizer2.start(' ');
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "#a");
    // The following exception was thrown during execution in test generation
    try {
    int i12 = improvedTokenizer2.afterToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test253"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    int i10 = improvedTokenizer2.matchingToken('a');
    int i11 = improvedTokenizer2.stop();
    boolean b13 = improvedTokenizer2.keepParsing(1);
    int i15 = improvedTokenizer2.start('4');
    int i16 = improvedTokenizer2.stop();
    boolean b17 = improvedTokenizer2.advance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test254"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.keepParsing(100);
    boolean b9 = improvedTokenizer2.keepParsing((int)' ');
    boolean b10 = improvedTokenizer2.advance();
    int i11 = improvedTokenizer2.stop();
    boolean b12 = improvedTokenizer2.advance();
    int i13 = improvedTokenizer2.stop();
    int i15 = improvedTokenizer2.start('4');
    int i17 = improvedTokenizer2.start('a');
    int i19 = improvedTokenizer2.afterToken('a');
    int i20 = improvedTokenizer2.stop();
    java.io.Reader reader21 = null;
    improvedTokenizer2.initialize(reader21, "#");
    boolean b25 = improvedTokenizer2.keepParsing((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test255"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    boolean b13 = improvedTokenizer2.keepParsing((int)(short)0);
    int i15 = improvedTokenizer2.afterToken('a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test256"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test257"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.beforeToken('a');
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i14 = improvedTokenizer2.start('4');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "4"+ "'", str12.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test258"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.keepParsing(100);
    boolean b9 = improvedTokenizer2.keepParsing((int)' ');
    java.io.Reader reader10 = null;
    improvedTokenizer2.initialize(reader10, "");
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader14 = null;
    improvedTokenizer2.initialize(reader14, "");
    int i17 = improvedTokenizer2.stop();
    boolean b19 = improvedTokenizer2.keepParsing((int)'a');
    // The following exception was thrown during execution in test generation
    try {
    boolean b20 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test259"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)'a');
    boolean b16 = improvedTokenizer2.keepParsing((int)(byte)10);
    java.io.Reader reader17 = null;
    improvedTokenizer2.initialize(reader17, "");
    boolean b21 = improvedTokenizer2.keepParsing((int)(byte)1);
    java.lang.String str22 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader23 = null;
    improvedTokenizer2.initialize(reader23, "4a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test260"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.start(' ');
    int i12 = improvedTokenizer2.beforeToken('a');
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader14 = null;
    improvedTokenizer2.initialize(reader14, "hi!");
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " "+ "'", str13.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test261"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.advance();
    int i9 = improvedTokenizer2.start('a');
    int i11 = improvedTokenizer2.beforeToken(' ');
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    java.io.InputStream inputStream13 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream13, " #");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "a"+ "'", str12.equals("a"));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test262"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.start('a');
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "4 ");
    boolean b12 = improvedTokenizer2.keepParsing((int)(short)-1);
    int i13 = improvedTokenizer2.stop();
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    boolean b16 = improvedTokenizer2.keepParsing(3);
    // The following exception was thrown during execution in test generation
    try {
    int i18 = improvedTokenizer2.matchingToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test263"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken('a');
    int i18 = improvedTokenizer2.start('4');
    java.lang.String str19 = improvedTokenizer2.previousDelimiter();
    int i21 = improvedTokenizer2.beforeToken('4');
    boolean b23 = improvedTokenizer2.keepParsing(10);
    int i24 = improvedTokenizer2.stop();
    java.lang.String str25 = improvedTokenizer2.next();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test264"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "hi!");
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i13 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.keepParsing(4);
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "");
    java.io.Reader reader19 = null;
    improvedTokenizer2.initialize(reader19, "4 4a");
    java.io.InputStream inputStream22 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream22, "4 ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test265"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i10 = improvedTokenizer2.start('a');
    boolean b12 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b13 = improvedTokenizer2.hasNext();
    boolean b14 = improvedTokenizer2.advance();
    java.io.InputStream inputStream15 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream15, "#a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test266"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('#');
    int i7 = improvedTokenizer2.start('#');
    int i9 = improvedTokenizer2.start('4');
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    int i12 = improvedTokenizer2.matchingToken('a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test267"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" #", "4 4a");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "a#");

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test268"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    int i10 = improvedTokenizer2.matchingToken('a');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.afterToken('4');
    int i16 = improvedTokenizer2.beforeToken('4');
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    int i19 = improvedTokenizer2.afterToken('4');
    int i21 = improvedTokenizer2.matchingToken('a');
    boolean b22 = improvedTokenizer2.hasNext();
    java.io.Reader reader23 = null;
    improvedTokenizer2.initialize(reader23, "4a");
    int i27 = improvedTokenizer2.start(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "4"+ "'", str17.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test269"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.start('a');
    int i18 = improvedTokenizer2.afterToken('a');
    java.lang.String str19 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader20 = null;
    improvedTokenizer2.initialize(reader20, "");
    // The following exception was thrown during execution in test generation
    try {
    int i24 = improvedTokenizer2.afterToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "a"+ "'", str19.equals("a"));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test270"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    int i15 = improvedTokenizer2.beforeToken('4');
    int i17 = improvedTokenizer2.afterToken('a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test271"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.start('a');
    int i16 = improvedTokenizer2.afterToken('a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test272"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    boolean b15 = improvedTokenizer2.keepParsing((int)'#');
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, " ");
    java.io.Reader reader19 = null;
    improvedTokenizer2.initialize(reader19, "#a");
    java.io.Reader reader22 = null;
    improvedTokenizer2.initialize(reader22, "a");
    int i26 = improvedTokenizer2.start('4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 3);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test273"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.afterToken('#');
    boolean b8 = improvedTokenizer2.keepParsing((-1));
    int i10 = improvedTokenizer2.beforeToken('4');
    int i12 = improvedTokenizer2.afterToken('#');
    int i14 = improvedTokenizer2.start(' ');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    boolean b17 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader18 = null;
    improvedTokenizer2.initialize(reader18, "#a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test274"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    boolean b9 = improvedTokenizer2.advance();
    int i11 = improvedTokenizer2.start(' ');
    int i13 = improvedTokenizer2.beforeToken('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test275"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#4", " ");

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test276"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    int i7 = improvedTokenizer2.start(' ');
    boolean b8 = improvedTokenizer2.hasNext();
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "");
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "");
    java.io.Reader reader15 = null;
    improvedTokenizer2.initialize(reader15, "#4");
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test277"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i15 = improvedTokenizer2.stop();
    java.lang.String str16 = improvedTokenizer2.next();
    int i17 = improvedTokenizer2.stop();
    java.io.InputStream inputStream18 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream18, "#4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test278"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.start('4');
    int i19 = improvedTokenizer2.stop();
    boolean b21 = improvedTokenizer2.keepParsing((int)' ');
    java.lang.String str22 = improvedTokenizer2.previousDelimiter();
    int i24 = improvedTokenizer2.start(' ');
    boolean b25 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test279"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    java.lang.String str7 = improvedTokenizer2.next();
    int i9 = improvedTokenizer2.start('a');
    int i10 = improvedTokenizer2.stop();
    int i11 = improvedTokenizer2.stop();
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "4 ");
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test280"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b11 = improvedTokenizer2.hasNext();
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.start('#');
    int i15 = improvedTokenizer2.stop();
    int i16 = improvedTokenizer2.stop();
    java.io.Reader reader17 = null;
    improvedTokenizer2.initialize(reader17, "hi!");
    int i20 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test281"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    int i13 = improvedTokenizer2.beforeToken('a');
    int i15 = improvedTokenizer2.start('4');
    int i17 = improvedTokenizer2.start(' ');
    boolean b19 = improvedTokenizer2.keepParsing(10);
    java.io.Reader reader20 = null;
    improvedTokenizer2.initialize(reader20, "");
    // The following exception was thrown during execution in test generation
    try {
    boolean b23 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test282"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.afterToken('4');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.matchingToken('4');
    int i16 = improvedTokenizer2.start('a');
    boolean b18 = improvedTokenizer2.keepParsing((int)(short)0);
    int i20 = improvedTokenizer2.matchingToken('a');
    int i21 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test283"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    int i7 = improvedTokenizer2.start(' ');
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    int i10 = improvedTokenizer2.beforeToken('a');
    java.io.InputStream inputStream11 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream11, "a ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test284"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    boolean b4 = improvedTokenizer2.hasNext();
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "hi!");
    boolean b13 = improvedTokenizer2.keepParsing(128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test285"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.start('4');
    int i20 = improvedTokenizer2.afterToken('4');
    int i22 = improvedTokenizer2.matchingToken('a');
    int i24 = improvedTokenizer2.afterToken('a');
    java.lang.String str25 = improvedTokenizer2.previousDelimiter();
    java.lang.String str26 = improvedTokenizer2.next();
    java.io.Reader reader27 = null;
    improvedTokenizer2.initialize(reader27, "4#");
    java.lang.String str30 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "4a"+ "'", str25.equals("4a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test286"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.advance();
    java.io.Reader reader6 = null;
    improvedTokenizer2.initialize(reader6, "#");
    boolean b10 = improvedTokenizer2.keepParsing(2);
    // The following exception was thrown during execution in test generation
    try {
    int i12 = improvedTokenizer2.afterToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test287"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.start('a');
    boolean b16 = improvedTokenizer2.keepParsing(3);
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    int i19 = improvedTokenizer2.beforeToken('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test288"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('4');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken('a');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test289"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('#');
    boolean b6 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.advance();
    int i10 = improvedTokenizer2.start(' ');
    int i12 = improvedTokenizer2.beforeToken('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test290"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b3 = improvedTokenizer2.advance();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.next();
    boolean b9 = improvedTokenizer2.keepParsing((int)(short)10);
    boolean b11 = improvedTokenizer2.keepParsing(5);
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "4");
    java.io.Reader reader15 = null;
    improvedTokenizer2.initialize(reader15, "a ");
    int i18 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test291"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i10 = improvedTokenizer2.start('#');
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "a");
    java.io.Reader reader14 = null;
    improvedTokenizer2.initialize(reader14, "");
    java.io.Reader reader17 = null;
    improvedTokenizer2.initialize(reader17, "");
    int i20 = improvedTokenizer2.stop();
    java.io.Reader reader21 = null;
    improvedTokenizer2.initialize(reader21, "# ");
    int i25 = improvedTokenizer2.start('4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 3);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test292"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.afterToken('#');
    java.lang.String str15 = improvedTokenizer2.next();
    int i17 = improvedTokenizer2.start(' ');
    int i19 = improvedTokenizer2.start(' ');
    int i21 = improvedTokenizer2.matchingToken(' ');
    int i23 = improvedTokenizer2.beforeToken(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 3);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test293"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i10 = improvedTokenizer2.start('a');
    boolean b11 = improvedTokenizer2.hasNext();
    boolean b12 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test294"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    boolean b4 = improvedTokenizer2.hasNext();
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i9 = improvedTokenizer2.start('a');
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.beforeToken('#');
    java.io.Reader reader15 = null;
    improvedTokenizer2.initialize(reader15, "4 ");
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test295"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.beforeToken('a');
    int i16 = improvedTokenizer2.afterToken('4');
    java.lang.String str17 = improvedTokenizer2.next();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test296"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.keepParsing((int)(short)-1);
    boolean b10 = improvedTokenizer2.hasNext();
    int i12 = improvedTokenizer2.start('#');
    int i14 = improvedTokenizer2.afterToken('#');
    int i16 = improvedTokenizer2.beforeToken('a');
    int i18 = improvedTokenizer2.matchingToken('4');
    int i20 = improvedTokenizer2.afterToken('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test297"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)0);
    int i9 = improvedTokenizer2.start('a');
    int i11 = improvedTokenizer2.beforeToken('4');
    boolean b12 = improvedTokenizer2.advance();
    boolean b13 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test298"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.beforeToken('a');
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.start('4');
    java.lang.String str19 = improvedTokenizer2.next();
    java.lang.String str20 = improvedTokenizer2.previousDelimiter();
    int i21 = improvedTokenizer2.stop();
    java.lang.String str22 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test299"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a#", "4#");

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test300"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    int i7 = improvedTokenizer2.start(' ');
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    int i10 = improvedTokenizer2.beforeToken('4');
    int i12 = improvedTokenizer2.beforeToken('#');
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader14 = null;
    improvedTokenizer2.initialize(reader14, "");
    java.io.Reader reader17 = null;
    improvedTokenizer2.initialize(reader17, "# ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4"+ "'", str13.equals("4"));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test301"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#a", "a");

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test302"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    boolean b16 = improvedTokenizer2.keepParsing((int)'4');
    int i18 = improvedTokenizer2.afterToken('4');
    boolean b19 = improvedTokenizer2.advance();
    java.io.Reader reader20 = null;
    improvedTokenizer2.initialize(reader20, "4 ");
    boolean b24 = improvedTokenizer2.keepParsing(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test303"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("44", "#");
    java.lang.String str3 = improvedTokenizer2.next();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "44"+ "'", str3.equals("44"));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test304"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i6 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.keepParsing((int)(short)-1);
    boolean b10 = improvedTokenizer2.keepParsing((int)(byte)10);
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    int i15 = improvedTokenizer2.matchingToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test305"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b7 = improvedTokenizer2.hasNext();
    int i9 = improvedTokenizer2.start('a');
    int i11 = improvedTokenizer2.start('4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test306"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    boolean b9 = improvedTokenizer2.advance();
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    int i12 = improvedTokenizer2.start('#');
    boolean b13 = improvedTokenizer2.hasNext();
    boolean b15 = improvedTokenizer2.keepParsing(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test307"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b11 = improvedTokenizer2.hasNext();
    boolean b12 = improvedTokenizer2.hasNext();
    java.io.Reader reader13 = null;
    improvedTokenizer2.initialize(reader13, "a");
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "#");
    java.lang.String str19 = improvedTokenizer2.previousDelimiter();
    int i21 = improvedTokenizer2.start(' ');
    int i23 = improvedTokenizer2.afterToken('a');
    int i25 = improvedTokenizer2.start(' ');
    int i27 = improvedTokenizer2.start('#');
    int i29 = improvedTokenizer2.afterToken('a');
    java.lang.String str30 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "#"+ "'", str30.equals("#"));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test308"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    boolean b14 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader15 = null;
    improvedTokenizer2.initialize(reader15, "a ");
    java.io.InputStream inputStream18 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream18, " #");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test309"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    boolean b9 = improvedTokenizer2.advance();
    boolean b10 = improvedTokenizer2.hasNext();
    int i11 = improvedTokenizer2.stop();
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    boolean b13 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test310"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    int i15 = improvedTokenizer2.start('4');
    int i17 = improvedTokenizer2.matchingToken('#');
    boolean b19 = improvedTokenizer2.keepParsing((int)(byte)1);
    int i21 = improvedTokenizer2.start('#');
    int i23 = improvedTokenizer2.matchingToken(' ');
    boolean b25 = improvedTokenizer2.keepParsing((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test311"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)0);
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "hi!");
    boolean b15 = improvedTokenizer2.keepParsing((int)'4');
    int i17 = improvedTokenizer2.start('a');
    int i18 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i20 = improvedTokenizer2.matchingToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test312"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.start(' ');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    int i10 = improvedTokenizer2.stop();
    java.io.InputStream inputStream11 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream11, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test313"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.afterToken('4');
    int i12 = improvedTokenizer2.matchingToken(' ');
    boolean b13 = improvedTokenizer2.advance();
    int i15 = improvedTokenizer2.start('#');
    boolean b16 = improvedTokenizer2.hasNext();
    java.io.Reader reader17 = null;
    improvedTokenizer2.initialize(reader17, "");
    // The following exception was thrown during execution in test generation
    try {
    boolean b20 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test314"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    int i14 = improvedTokenizer2.stop();
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4"+ "'", str13.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test315"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    int i15 = improvedTokenizer2.matchingToken('#');
    int i17 = improvedTokenizer2.start('#');
    int i19 = improvedTokenizer2.matchingToken('a');
    int i21 = improvedTokenizer2.matchingToken('#');
    boolean b23 = improvedTokenizer2.keepParsing(100);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test316"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.afterToken('4');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.matchingToken('4');
    int i16 = improvedTokenizer2.start('a');
    int i18 = improvedTokenizer2.matchingToken(' ');
    int i19 = improvedTokenizer2.stop();
    java.lang.String str20 = improvedTokenizer2.next();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test317"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i15 = improvedTokenizer2.stop();
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    boolean b17 = improvedTokenizer2.advance();
    boolean b18 = improvedTokenizer2.hasNext();
    boolean b19 = improvedTokenizer2.advance();
    boolean b20 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test318"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "4");
    boolean b3 = improvedTokenizer2.advance();
    java.io.Reader reader4 = null;
    improvedTokenizer2.initialize(reader4, "4a");
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i8 = improvedTokenizer2.stop();
    int i10 = improvedTokenizer2.start(' ');
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test319"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.hasNext();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.stop();
    boolean b11 = improvedTokenizer2.hasNext();
    boolean b13 = improvedTokenizer2.keepParsing((int)'a');
    boolean b15 = improvedTokenizer2.keepParsing((int)(short)1);
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "4a");
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test320"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.start(' ');
    int i12 = improvedTokenizer2.beforeToken('a');
    int i14 = improvedTokenizer2.matchingToken('a');
    int i16 = improvedTokenizer2.beforeToken(' ');
    int i18 = improvedTokenizer2.matchingToken('a');
    boolean b19 = improvedTokenizer2.advance();
    java.io.Reader reader20 = null;
    improvedTokenizer2.initialize(reader20, "a");
    // The following exception was thrown during execution in test generation
    try {
    boolean b23 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test321"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, " ");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)100);
    int i5 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test322"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i10 = improvedTokenizer2.start('a');
    boolean b11 = improvedTokenizer2.hasNext();
    int i13 = improvedTokenizer2.start(' ');
    int i15 = improvedTokenizer2.afterToken('a');
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader17 = null;
    improvedTokenizer2.initialize(reader17, " #");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " "+ "'", str16.equals(" "));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test323"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i15 = improvedTokenizer2.stop();
    java.lang.String str16 = improvedTokenizer2.next();
    boolean b17 = improvedTokenizer2.hasNext();
    java.io.Reader reader18 = null;
    improvedTokenizer2.initialize(reader18, " ");
    java.io.InputStream inputStream21 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream21, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test324"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.start('4');
    int i20 = improvedTokenizer2.afterToken('4');
    int i22 = improvedTokenizer2.matchingToken('a');
    boolean b24 = improvedTokenizer2.keepParsing((int)' ');
    java.lang.String str25 = improvedTokenizer2.next();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test325"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.advance();
    java.io.InputStream inputStream6 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream6, "a ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test326"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    boolean b6 = improvedTokenizer2.hasNext();
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "hi!");
    int i11 = improvedTokenizer2.start('#');
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "#4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test327"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.afterToken('4');
    int i12 = improvedTokenizer2.matchingToken(' ');
    boolean b13 = improvedTokenizer2.advance();
    int i15 = improvedTokenizer2.start('#');
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    int i18 = improvedTokenizer2.afterToken('a');
    boolean b20 = improvedTokenizer2.keepParsing(5);
    int i22 = improvedTokenizer2.start('#');
    int i24 = improvedTokenizer2.beforeToken('4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test328"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)'a');
    int i15 = improvedTokenizer2.stop();
    boolean b16 = improvedTokenizer2.advance();
    int i18 = improvedTokenizer2.start('a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test329"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "");
    int i3 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.start('4');
    int i7 = improvedTokenizer2.start('#');
    int i9 = improvedTokenizer2.start('4');
    boolean b11 = improvedTokenizer2.keepParsing((int)(byte)-1);
    int i13 = improvedTokenizer2.matchingToken('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test330"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    int i11 = improvedTokenizer2.beforeToken('#');
    int i13 = improvedTokenizer2.start('a');
    int i15 = improvedTokenizer2.start('a');
    int i17 = improvedTokenizer2.start('a');
    int i18 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "a"+ "'", str9.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test331"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    java.lang.String str7 = improvedTokenizer2.next();
    boolean b8 = improvedTokenizer2.hasNext();
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "");
    boolean b13 = improvedTokenizer2.keepParsing((int)(short)1);
    boolean b15 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b17 = improvedTokenizer2.keepParsing(3);
    // The following exception was thrown during execution in test generation
    try {
    int i19 = improvedTokenizer2.afterToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test332"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", " ");
    int i4 = improvedTokenizer2.start('a');
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test333"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    int i13 = improvedTokenizer2.beforeToken(' ');
    java.io.InputStream inputStream14 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream14, "4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test334"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(4);
    boolean b5 = improvedTokenizer2.hasNext();
    int i6 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.stop();
    boolean b9 = improvedTokenizer2.keepParsing((int)(byte)1);
    java.io.Reader reader10 = null;
    improvedTokenizer2.initialize(reader10, "#");
    int i14 = improvedTokenizer2.start('4');
    int i16 = improvedTokenizer2.afterToken(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test335"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    int i15 = improvedTokenizer2.beforeToken('4');
    java.io.InputStream inputStream16 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream16, "a#");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test336"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b11 = improvedTokenizer2.hasNext();
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.start('#');
    boolean b16 = improvedTokenizer2.keepParsing((int)'#');
    java.io.InputStream inputStream17 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream17, "4#");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test337"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('4');
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken('a');
    int i14 = improvedTokenizer2.start('4');
    int i16 = improvedTokenizer2.matchingToken('a');
    int i18 = improvedTokenizer2.afterToken('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test338"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i10 = improvedTokenizer2.start('a');
    boolean b11 = improvedTokenizer2.hasNext();
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "#");
    int i15 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test339"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(short)100);
    java.lang.String str5 = improvedTokenizer2.next();
    java.lang.String str6 = improvedTokenizer2.next();
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, " ");
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "a"+ "'", str5.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "a"+ "'", str6.equals("a"));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test340"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    int i7 = improvedTokenizer2.start(' ');
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.hasNext();
    boolean b10 = improvedTokenizer2.hasNext();
    int i12 = improvedTokenizer2.matchingToken('#');
    boolean b13 = improvedTokenizer2.advance();
    int i15 = improvedTokenizer2.start('4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test341"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "4#");
    int i4 = improvedTokenizer2.start('#');
    boolean b5 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    int i6 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test342"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('#');
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)1);
    boolean b11 = improvedTokenizer2.hasNext();
    int i13 = improvedTokenizer2.matchingToken('#');
    java.io.Reader reader14 = null;
    improvedTokenizer2.initialize(reader14, "a ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test343"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader6 = null;
    improvedTokenizer2.initialize(reader6, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    int i10 = improvedTokenizer2.afterToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test344"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i10 = improvedTokenizer2.start('a');
    boolean b11 = improvedTokenizer2.hasNext();
    int i13 = improvedTokenizer2.start(' ');
    int i15 = improvedTokenizer2.afterToken('a');
    boolean b16 = improvedTokenizer2.advance();
    int i18 = improvedTokenizer2.start(' ');
    boolean b19 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test345"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#", " ");
    boolean b3 = improvedTokenizer2.advance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test346"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "4a");
    boolean b3 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.start('4');
    java.io.Reader reader6 = null;
    improvedTokenizer2.initialize(reader6, "4 ");
    int i9 = improvedTokenizer2.stop();
    boolean b11 = improvedTokenizer2.keepParsing((int)'4');
    boolean b13 = improvedTokenizer2.keepParsing((-1));
    java.io.InputStream inputStream14 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream14, "#4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test347"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.stop();
    int i8 = improvedTokenizer2.stop();
    java.lang.String str9 = improvedTokenizer2.next();
    int i10 = improvedTokenizer2.stop();
    java.io.InputStream inputStream11 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream11, "#4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test348"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken('a');
    int i18 = improvedTokenizer2.start('4');
    boolean b19 = improvedTokenizer2.advance();
    java.io.Reader reader20 = null;
    improvedTokenizer2.initialize(reader20, "44");
    java.io.Reader reader23 = null;
    improvedTokenizer2.initialize(reader23, "#4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test349"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.start('4');
    int i20 = improvedTokenizer2.afterToken('4');
    int i22 = improvedTokenizer2.matchingToken('a');
    java.lang.String str23 = improvedTokenizer2.previousDelimiter();
    int i25 = improvedTokenizer2.start(' ');
    boolean b26 = improvedTokenizer2.hasNext();
    boolean b27 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "4"+ "'", str23.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test350"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('4');
    int i7 = improvedTokenizer2.afterToken(' ');
    int i9 = improvedTokenizer2.afterToken(' ');
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " "+ "'", str10.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + " "+ "'", str11.equals(" "));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test351"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "hi!");
    int i13 = improvedTokenizer2.start('#');
    boolean b15 = improvedTokenizer2.keepParsing((int)(byte)-1);
    int i17 = improvedTokenizer2.start('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test352"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i10 = improvedTokenizer2.start('a');
    boolean b11 = improvedTokenizer2.advance();
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "a ");
    // The following exception was thrown during execution in test generation
    try {
    int i16 = improvedTokenizer2.matchingToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test353"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    int i7 = improvedTokenizer2.start(' ');
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    int i11 = improvedTokenizer2.beforeToken('#');
    int i13 = improvedTokenizer2.afterToken(' ');
    int i15 = improvedTokenizer2.afterToken('4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test354"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "hi!");
    int i13 = improvedTokenizer2.start('#');
    int i15 = improvedTokenizer2.start('4');
    int i17 = improvedTokenizer2.start('a');
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test355"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    boolean b10 = improvedTokenizer2.advance();
    boolean b11 = improvedTokenizer2.advance();
    int i13 = improvedTokenizer2.start('4');
    int i15 = improvedTokenizer2.afterToken('a');
    int i16 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "a"+ "'", str9.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test356"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", " ");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.beforeToken('4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "4 ");
    boolean b11 = improvedTokenizer2.keepParsing(128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test357"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    int i11 = improvedTokenizer2.beforeToken('#');
    int i13 = improvedTokenizer2.start('a');
    int i15 = improvedTokenizer2.start('a');
    int i17 = improvedTokenizer2.start('a');
    java.lang.String str18 = improvedTokenizer2.next();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "a"+ "'", str9.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test358"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)'a');
    boolean b16 = improvedTokenizer2.keepParsing((int)(byte)10);
    int i18 = improvedTokenizer2.matchingToken('4');
    boolean b20 = improvedTokenizer2.keepParsing((int)'4');
    java.lang.String str21 = improvedTokenizer2.previousDelimiter();
    int i23 = improvedTokenizer2.matchingToken(' ');
    java.io.InputStream inputStream24 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream24, "a ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "4"+ "'", str21.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 3);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test359"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    boolean b9 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.stop();
    int i12 = improvedTokenizer2.start(' ');
    int i14 = improvedTokenizer2.afterToken('a');
    int i16 = improvedTokenizer2.beforeToken('a');
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "a"+ "'", str17.equals("a"));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test360"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.start('4');
    int i20 = improvedTokenizer2.afterToken('4');
    int i22 = improvedTokenizer2.matchingToken('a');
    java.lang.String str23 = improvedTokenizer2.previousDelimiter();
    int i25 = improvedTokenizer2.start('a');
    java.io.Reader reader26 = null;
    improvedTokenizer2.initialize(reader26, "4 ");
    // The following exception was thrown during execution in test generation
    try {
    int i30 = improvedTokenizer2.beforeToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "4"+ "'", str23.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 3);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test361"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "");
    int i3 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.start('4');
    int i6 = improvedTokenizer2.stop();
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "a");
    // The following exception was thrown during execution in test generation
    try {
    int i11 = improvedTokenizer2.afterToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test362"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b3 = improvedTokenizer2.advance();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i8 = improvedTokenizer2.stop();
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)1);
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "#");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test363"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "4a");
    int i3 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test364"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.afterToken(' ');
    int i7 = improvedTokenizer2.stop();
    int i9 = improvedTokenizer2.start('4');
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test365"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    java.lang.String str7 = improvedTokenizer2.next();
    boolean b8 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.start('a');
    int i11 = improvedTokenizer2.stop();
    int i13 = improvedTokenizer2.start(' ');
    boolean b14 = improvedTokenizer2.hasNext();
    boolean b15 = improvedTokenizer2.hasNext();
    boolean b16 = improvedTokenizer2.hasNext();
    boolean b18 = improvedTokenizer2.keepParsing((int)(short)0);
    int i20 = improvedTokenizer2.matchingToken('#');
    java.io.Reader reader21 = null;
    improvedTokenizer2.initialize(reader21, "");
    java.io.InputStream inputStream24 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream24, "4#");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test366"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b7 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.advance();
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "a");
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test367"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    boolean b11 = improvedTokenizer2.advance();
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "4#");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test368"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    boolean b9 = improvedTokenizer2.advance();
    boolean b10 = improvedTokenizer2.hasNext();
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    boolean b14 = improvedTokenizer2.keepParsing(2);
    boolean b16 = improvedTokenizer2.keepParsing(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test369"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    java.io.Reader reader4 = null;
    improvedTokenizer2.initialize(reader4, "");
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test370"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.keepParsing((int)(short)-1);
    boolean b10 = improvedTokenizer2.hasNext();
    int i12 = improvedTokenizer2.start('#');
    int i14 = improvedTokenizer2.afterToken('#');
    boolean b15 = improvedTokenizer2.hasNext();
    boolean b17 = improvedTokenizer2.keepParsing(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test371"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "");
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "a");
    int i10 = improvedTokenizer2.stop();
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "4 4a");
    // The following exception was thrown during execution in test generation
    try {
    int i15 = improvedTokenizer2.beforeToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test372"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", "# ");

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test373"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.advance();
    boolean b10 = improvedTokenizer2.keepParsing((int)(byte)1);
    int i11 = improvedTokenizer2.stop();
    int i13 = improvedTokenizer2.start('4');
    java.io.Reader reader14 = null;
    improvedTokenizer2.initialize(reader14, "4#");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test374"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4 4a", "hi!");

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test375"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    int i10 = improvedTokenizer2.matchingToken('a');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.afterToken('4');
    int i16 = improvedTokenizer2.beforeToken('4');
    boolean b17 = improvedTokenizer2.hasNext();
    int i19 = improvedTokenizer2.afterToken('a');
    java.io.InputStream inputStream20 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream20, "#");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test376"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", " ");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('#');
    int i8 = improvedTokenizer2.start(' ');
    int i10 = improvedTokenizer2.matchingToken('4');
    java.lang.String str11 = improvedTokenizer2.next();
    int i13 = improvedTokenizer2.start('4');
    boolean b15 = improvedTokenizer2.keepParsing(0);
    boolean b17 = improvedTokenizer2.keepParsing((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "a"+ "'", str11.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test377"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('4');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken('a');
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b11 = improvedTokenizer2.advance();
    boolean b13 = improvedTokenizer2.keepParsing(2);
    int i15 = improvedTokenizer2.start(' ');
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "44");
    int i20 = improvedTokenizer2.start('4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 2);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test378"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.beforeToken('a');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    int i17 = improvedTokenizer2.beforeToken(' ');
    boolean b18 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "4"+ "'", str15.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test379"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.start('4');
    java.io.Reader reader19 = null;
    improvedTokenizer2.initialize(reader19, "");
    boolean b23 = improvedTokenizer2.keepParsing(1);
    java.lang.String str24 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test380"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.beforeToken('a');
    java.lang.String str9 = improvedTokenizer2.next();
    boolean b10 = improvedTokenizer2.advance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test381"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    int i10 = improvedTokenizer2.matchingToken('a');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.afterToken('4');
    int i15 = improvedTokenizer2.stop();
    boolean b16 = improvedTokenizer2.hasNext();
    int i18 = improvedTokenizer2.start('a');
    int i20 = improvedTokenizer2.beforeToken(' ');
    boolean b22 = improvedTokenizer2.keepParsing((int)(byte)1);
    int i24 = improvedTokenizer2.afterToken('#');
    boolean b25 = improvedTokenizer2.hasNext();
    int i27 = improvedTokenizer2.start('a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test382"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.hasNext();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.stop();
    int i12 = improvedTokenizer2.start('#');
    boolean b14 = improvedTokenizer2.keepParsing(1);
    int i16 = improvedTokenizer2.matchingToken('4');
    int i18 = improvedTokenizer2.matchingToken(' ');
    int i20 = improvedTokenizer2.matchingToken(' ');
    boolean b21 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test383"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.afterToken('#');
    int i20 = improvedTokenizer2.start('#');
    java.io.Reader reader21 = null;
    improvedTokenizer2.initialize(reader21, "a");
    java.io.Reader reader24 = null;
    improvedTokenizer2.initialize(reader24, "4a");
    java.io.Reader reader27 = null;
    improvedTokenizer2.initialize(reader27, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    int i31 = improvedTokenizer2.beforeToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test384"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    boolean b5 = improvedTokenizer2.advance();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    int i11 = improvedTokenizer2.start('#');
    int i13 = improvedTokenizer2.beforeToken('#');
    java.io.Reader reader14 = null;
    improvedTokenizer2.initialize(reader14, "a");
    boolean b18 = improvedTokenizer2.keepParsing(1);
    java.io.Reader reader19 = null;
    improvedTokenizer2.initialize(reader19, "#a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test385"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.keepParsing(100);
    boolean b9 = improvedTokenizer2.keepParsing((int)' ');
    boolean b10 = improvedTokenizer2.advance();
    int i11 = improvedTokenizer2.stop();
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "a");
    java.io.Reader reader15 = null;
    improvedTokenizer2.initialize(reader15, "");
    boolean b19 = improvedTokenizer2.keepParsing((int)'4');
    boolean b21 = improvedTokenizer2.keepParsing(100);
    // The following exception was thrown during execution in test generation
    try {
    boolean b22 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test386"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4a", "4a");
    boolean b3 = improvedTokenizer2.hasNext();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.start('a');
    boolean b8 = improvedTokenizer2.advance();
    int i10 = improvedTokenizer2.start(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test387"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b11 = improvedTokenizer2.hasNext();
    boolean b12 = improvedTokenizer2.hasNext();
    java.io.Reader reader13 = null;
    improvedTokenizer2.initialize(reader13, "a");
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test388"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "#");
    int i3 = improvedTokenizer2.stop();
    int i4 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test389"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.start('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.afterToken('4');
    boolean b10 = improvedTokenizer2.hasNext();
    int i12 = improvedTokenizer2.start('a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test390"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    java.io.Reader reader4 = null;
    improvedTokenizer2.initialize(reader4, "");
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "hi!");
    int i11 = improvedTokenizer2.start('a');
    boolean b13 = improvedTokenizer2.keepParsing(0);
    int i14 = improvedTokenizer2.stop();
    int i16 = improvedTokenizer2.start('a');
    boolean b18 = improvedTokenizer2.keepParsing((int)'a');
    int i20 = improvedTokenizer2.afterToken('4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test391"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    int i8 = improvedTokenizer2.start('4');
    boolean b10 = improvedTokenizer2.keepParsing(100);
    int i12 = improvedTokenizer2.beforeToken('a');
    boolean b13 = improvedTokenizer2.hasNext();
    java.io.Reader reader14 = null;
    improvedTokenizer2.initialize(reader14, "");
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test392"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    java.io.Reader reader4 = null;
    improvedTokenizer2.initialize(reader4, "");
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "hi!");
    int i11 = improvedTokenizer2.start('a');
    int i13 = improvedTokenizer2.start('#');
    int i15 = improvedTokenizer2.matchingToken(' ');
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, " ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test393"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    boolean b10 = improvedTokenizer2.keepParsing((int)' ');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    int i12 = improvedTokenizer2.stop();
    int i14 = improvedTokenizer2.start('a');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test394"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    int i13 = improvedTokenizer2.beforeToken('#');
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    boolean b15 = improvedTokenizer2.hasNext();
    boolean b16 = improvedTokenizer2.hasNext();
    int i18 = improvedTokenizer2.start('a');
    java.lang.String str19 = improvedTokenizer2.previousDelimiter();
    int i21 = improvedTokenizer2.start('4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4"+ "'", str14.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test395"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    int i13 = improvedTokenizer2.beforeToken('a');
    int i15 = improvedTokenizer2.matchingToken('a');
    boolean b17 = improvedTokenizer2.keepParsing(128);
    boolean b18 = improvedTokenizer2.hasNext();
    int i20 = improvedTokenizer2.beforeToken(' ');
    java.io.InputStream inputStream21 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream21, "a#");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test396"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "#");
    int i3 = improvedTokenizer2.stop();
    java.io.Reader reader4 = null;
    improvedTokenizer2.initialize(reader4, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test397"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.afterToken('4');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.matchingToken('4');
    boolean b15 = improvedTokenizer2.hasNext();
    int i17 = improvedTokenizer2.start(' ');
    int i18 = improvedTokenizer2.stop();
    boolean b20 = improvedTokenizer2.keepParsing((int)(short)1);
    boolean b21 = improvedTokenizer2.advance();
    int i22 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test398"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    boolean b9 = improvedTokenizer2.hasNext();
    boolean b10 = improvedTokenizer2.hasNext();
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "hi!");
    int i14 = improvedTokenizer2.stop();
    int i16 = improvedTokenizer2.start('#');
    int i18 = improvedTokenizer2.afterToken(' ');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test399"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.keepParsing((int)(short)-1);
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.keepParsing((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test400"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('4');
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    int i8 = improvedTokenizer2.start('4');
    int i10 = improvedTokenizer2.afterToken('4');
    int i12 = improvedTokenizer2.matchingToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)-1);
    boolean b15 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test401"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    boolean b13 = improvedTokenizer2.keepParsing(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test402"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(128);
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader6 = null;
    improvedTokenizer2.initialize(reader6, "4");
    // The following exception was thrown during execution in test generation
    try {
    int i10 = improvedTokenizer2.matchingToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test403"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    boolean b14 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b15 = improvedTokenizer2.hasNext();
    int i17 = improvedTokenizer2.beforeToken(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test404"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(128);
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start('a');
    boolean b9 = improvedTokenizer2.keepParsing(5);
    int i11 = improvedTokenizer2.matchingToken('4');
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "");
    int i16 = improvedTokenizer2.start('a');
    int i17 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test405"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    int i7 = improvedTokenizer2.start('a');
    boolean b8 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream9 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream9, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test406"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.hasNext();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.stop();
    boolean b11 = improvedTokenizer2.hasNext();
    boolean b13 = improvedTokenizer2.keepParsing((int)'a');
    boolean b15 = improvedTokenizer2.keepParsing((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test407"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4#", "4#");
    int i4 = improvedTokenizer2.start('a');
    int i5 = improvedTokenizer2.stop();
    java.io.Reader reader6 = null;
    improvedTokenizer2.initialize(reader6, "#4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test408"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    int i7 = improvedTokenizer2.start(' ');
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    int i10 = improvedTokenizer2.beforeToken('a');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "a");
    boolean b16 = improvedTokenizer2.keepParsing(4);
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + " "+ "'", str11.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test409"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)'a');
    boolean b16 = improvedTokenizer2.keepParsing((int)(byte)10);
    java.lang.String str17 = improvedTokenizer2.next();
    boolean b18 = improvedTokenizer2.hasNext();
    java.io.Reader reader19 = null;
    improvedTokenizer2.initialize(reader19, "hi!");
    int i23 = improvedTokenizer2.start('4');
    int i25 = improvedTokenizer2.afterToken('#');
    boolean b27 = improvedTokenizer2.keepParsing((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test410"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.stop();
    int i9 = improvedTokenizer2.start('#');
    int i11 = improvedTokenizer2.start(' ');
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    boolean b13 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream14 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream14, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test411"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b11 = improvedTokenizer2.hasNext();
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.start('#');
    int i15 = improvedTokenizer2.stop();
    int i16 = improvedTokenizer2.stop();
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    boolean b18 = improvedTokenizer2.advance();
    java.lang.String str19 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test412"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    int i13 = improvedTokenizer2.beforeToken('a');
    int i15 = improvedTokenizer2.matchingToken('a');
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "");
    java.io.Reader reader19 = null;
    improvedTokenizer2.initialize(reader19, "a ");
    // The following exception was thrown during execution in test generation
    try {
    boolean b22 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test413"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    int i10 = improvedTokenizer2.matchingToken('a');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.afterToken('4');
    int i16 = improvedTokenizer2.beforeToken('4');
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    boolean b18 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "4"+ "'", str17.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test414"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.start('4');
    boolean b7 = improvedTokenizer2.advance();
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "#");
    int i12 = improvedTokenizer2.start('#');
    int i14 = improvedTokenizer2.beforeToken('4');
    int i16 = improvedTokenizer2.start(' ');
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test415"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "hi!");
    int i13 = improvedTokenizer2.start('4');
    int i14 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i16 = improvedTokenizer2.beforeToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test416"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.start('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.matchingToken(' ');
    int i11 = improvedTokenizer2.matchingToken('#');
    int i13 = improvedTokenizer2.matchingToken('4');
    int i15 = improvedTokenizer2.afterToken(' ');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test417"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "");
    int i3 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.start('4');
    int i7 = improvedTokenizer2.start('#');
    int i8 = improvedTokenizer2.stop();
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "");
    int i13 = improvedTokenizer2.start(' ');
    int i15 = improvedTokenizer2.afterToken(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test418"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", " ");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('#');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test419"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    int i10 = improvedTokenizer2.matchingToken('a');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i14 = improvedTokenizer2.matchingToken('4');
    boolean b16 = improvedTokenizer2.keepParsing((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test420"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(128);
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start('a');
    boolean b8 = improvedTokenizer2.advance();
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "4");
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i13 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.keepParsing(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test421"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b11 = improvedTokenizer2.advance();
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "");
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    int i17 = improvedTokenizer2.start('#');
    java.lang.String str18 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader19 = null;
    improvedTokenizer2.initialize(reader19, "# ");
    boolean b23 = improvedTokenizer2.keepParsing((int)(byte)-1);
    java.io.InputStream inputStream24 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream24, "a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test422"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i10 = improvedTokenizer2.start('#');
    int i12 = improvedTokenizer2.matchingToken('a');
    boolean b13 = improvedTokenizer2.hasNext();
    boolean b14 = improvedTokenizer2.hasNext();
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test423"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start('#');
    boolean b9 = improvedTokenizer2.keepParsing(100);
    int i11 = improvedTokenizer2.start('#');
    int i13 = improvedTokenizer2.start('#');
    int i15 = improvedTokenizer2.afterToken('4');
    boolean b16 = improvedTokenizer2.hasNext();
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    boolean b18 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#"+ "'", str17.equals("#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test424"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "#");
    boolean b4 = improvedTokenizer2.keepParsing((-1));
    java.io.InputStream inputStream5 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream5, "a ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test425"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('#');
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)1);
    boolean b11 = improvedTokenizer2.hasNext();
    int i13 = improvedTokenizer2.matchingToken('#');
    int i15 = improvedTokenizer2.beforeToken('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test426"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)'a');
    boolean b16 = improvedTokenizer2.keepParsing((int)(byte)10);
    boolean b17 = improvedTokenizer2.advance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test427"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", " ");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b4 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream5 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream5, "# ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test428"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b11 = improvedTokenizer2.advance();
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "");
    int i16 = improvedTokenizer2.start('4');
    boolean b18 = improvedTokenizer2.keepParsing((int)(byte)-1);
    java.lang.String str19 = improvedTokenizer2.previousDelimiter();
    int i21 = improvedTokenizer2.matchingToken(' ');
    int i22 = improvedTokenizer2.stop();
    boolean b24 = improvedTokenizer2.keepParsing((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test429"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "hi!");
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "4 4a");
    int i12 = improvedTokenizer2.start(' ');
    boolean b14 = improvedTokenizer2.keepParsing(3);
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test430"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i10 = improvedTokenizer2.start('#');
    int i12 = improvedTokenizer2.matchingToken('a');
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader14 = null;
    improvedTokenizer2.initialize(reader14, "# ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test431"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.beforeToken('a');
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.start('4');
    int i19 = improvedTokenizer2.stop();
    java.io.Reader reader20 = null;
    improvedTokenizer2.initialize(reader20, "hi!");
    java.io.Reader reader23 = null;
    improvedTokenizer2.initialize(reader23, "4 4a");
    java.io.Reader reader26 = null;
    improvedTokenizer2.initialize(reader26, "#");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test432"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "# ");
    boolean b3 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test433"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)100);
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "");
    java.io.Reader reader14 = null;
    improvedTokenizer2.initialize(reader14, "hi!");
    int i18 = improvedTokenizer2.start('a');
    int i20 = improvedTokenizer2.matchingToken('a');
    int i22 = improvedTokenizer2.afterToken(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test434"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "4");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.afterToken(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test435"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)0);
    java.lang.String str11 = improvedTokenizer2.next();
    boolean b13 = improvedTokenizer2.keepParsing((-1));
    boolean b15 = improvedTokenizer2.keepParsing((int)(byte)0);
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test436"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.advance();
    boolean b14 = improvedTokenizer2.keepParsing(5);
    int i15 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test437"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken('a');
    boolean b18 = improvedTokenizer2.keepParsing((int)'a');
    int i20 = improvedTokenizer2.beforeToken('#');
    boolean b22 = improvedTokenizer2.keepParsing((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test438"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", "a");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('a');
    boolean b7 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test439"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.hasNext();
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "");
    // The following exception was thrown during execution in test generation
    try {
    int i13 = improvedTokenizer2.beforeToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test440"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "hi!");
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test441"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4#", "#4");
    java.io.InputStream inputStream3 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream3, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test442"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)0);
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    int i11 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test443"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)100);
    int i11 = improvedTokenizer2.stop();
    boolean b12 = improvedTokenizer2.advance();
    boolean b14 = improvedTokenizer2.keepParsing((int)(byte)10);
    int i15 = improvedTokenizer2.stop();
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "4a");
    java.io.Reader reader19 = null;
    improvedTokenizer2.initialize(reader19, "hi!");
    int i23 = improvedTokenizer2.start('#');
    int i25 = improvedTokenizer2.afterToken('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 3);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test444"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.afterToken('4');
    int i12 = improvedTokenizer2.matchingToken(' ');
    boolean b13 = improvedTokenizer2.hasNext();
    int i15 = improvedTokenizer2.start('a');
    int i17 = improvedTokenizer2.afterToken('4');
    java.io.Reader reader18 = null;
    improvedTokenizer2.initialize(reader18, "4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test445"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(4);
    boolean b5 = improvedTokenizer2.hasNext();
    int i6 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.stop();
    boolean b9 = improvedTokenizer2.keepParsing((int)(byte)1);
    java.io.Reader reader10 = null;
    improvedTokenizer2.initialize(reader10, "#");
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    int i15 = improvedTokenizer2.beforeToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test446"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4a", "4#");
    java.io.InputStream inputStream3 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream3, "a ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test447"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "hi!");
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "4a");
    int i11 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test448"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('#');
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)1);
    boolean b11 = improvedTokenizer2.hasNext();
    boolean b12 = improvedTokenizer2.advance();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test449"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.afterToken('4');
    int i12 = improvedTokenizer2.matchingToken(' ');
    boolean b13 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test450"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    int i13 = improvedTokenizer2.beforeToken('a');
    int i15 = improvedTokenizer2.matchingToken('a');
    boolean b17 = improvedTokenizer2.keepParsing(128);
    java.io.Reader reader18 = null;
    improvedTokenizer2.initialize(reader18, "4");
    // The following exception was thrown during execution in test generation
    try {
    int i22 = improvedTokenizer2.beforeToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test451"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('a');
    int i12 = improvedTokenizer2.beforeToken('#');
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader14 = null;
    improvedTokenizer2.initialize(reader14, "");
    int i17 = improvedTokenizer2.stop();
    java.io.Reader reader18 = null;
    improvedTokenizer2.initialize(reader18, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "a"+ "'", str13.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test452"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b13 = improvedTokenizer2.advance();
    int i14 = improvedTokenizer2.stop();
    boolean b16 = improvedTokenizer2.keepParsing(0);
    int i18 = improvedTokenizer2.start('4');
    int i20 = improvedTokenizer2.afterToken('a');
    boolean b21 = improvedTokenizer2.advance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test453"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    int i13 = improvedTokenizer2.beforeToken('a');
    java.io.Reader reader14 = null;
    improvedTokenizer2.initialize(reader14, " ");
    boolean b18 = improvedTokenizer2.keepParsing(5);
    // The following exception was thrown during execution in test generation
    try {
    int i20 = improvedTokenizer2.afterToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test454"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    boolean b9 = improvedTokenizer2.advance();
    boolean b10 = improvedTokenizer2.hasNext();
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    boolean b12 = improvedTokenizer2.hasNext();
    boolean b14 = improvedTokenizer2.keepParsing(100);
    boolean b15 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test455"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)-1);
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader10 = null;
    improvedTokenizer2.initialize(reader10, "a");
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test456"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    int i7 = improvedTokenizer2.start(' ');
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    int i10 = improvedTokenizer2.beforeToken('4');
    boolean b11 = improvedTokenizer2.hasNext();
    int i13 = improvedTokenizer2.beforeToken('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test457"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.afterToken('4');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.matchingToken('4');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    int i18 = improvedTokenizer2.matchingToken('a');
    java.lang.String str19 = improvedTokenizer2.previousDelimiter();
    java.io.InputStream inputStream20 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream20, "# ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#"+ "'", str15.equals("#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#"+ "'", str16.equals("#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "#"+ "'", str19.equals("#"));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test458"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "");
    int i3 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.start('4');
    int i7 = improvedTokenizer2.matchingToken('#');
    int i9 = improvedTokenizer2.start(' ');
    java.io.Reader reader10 = null;
    improvedTokenizer2.initialize(reader10, "#4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test459"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    int i15 = improvedTokenizer2.matchingToken('#');
    int i17 = improvedTokenizer2.afterToken('a');
    int i19 = improvedTokenizer2.beforeToken('#');
    int i21 = improvedTokenizer2.beforeToken('4');
    java.io.Reader reader22 = null;
    improvedTokenizer2.initialize(reader22, "#");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test460"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    java.io.Reader reader4 = null;
    improvedTokenizer2.initialize(reader4, "");
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "hi!");
    int i11 = improvedTokenizer2.start('a');
    int i13 = improvedTokenizer2.matchingToken(' ');
    boolean b15 = improvedTokenizer2.keepParsing((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test461"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b11 = improvedTokenizer2.hasNext();
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.start('#');
    int i15 = improvedTokenizer2.stop();
    int i16 = improvedTokenizer2.stop();
    java.io.Reader reader17 = null;
    improvedTokenizer2.initialize(reader17, "hi!");
    java.io.InputStream inputStream20 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream20, "#a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test462"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    boolean b13 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.stop();
    java.io.Reader reader15 = null;
    improvedTokenizer2.initialize(reader15, "");
    // The following exception was thrown during execution in test generation
    try {
    int i19 = improvedTokenizer2.afterToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test463"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader6 = null;
    improvedTokenizer2.initialize(reader6, "4a");
    boolean b10 = improvedTokenizer2.keepParsing(0);
    int i12 = improvedTokenizer2.start('a');
    boolean b14 = improvedTokenizer2.keepParsing(10);
    int i16 = improvedTokenizer2.matchingToken('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test464"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    int i15 = improvedTokenizer2.start('4');
    int i17 = improvedTokenizer2.matchingToken('#');
    boolean b19 = improvedTokenizer2.keepParsing((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test465"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(4);
    boolean b5 = improvedTokenizer2.hasNext();
    int i6 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.advance();
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test466"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    boolean b9 = improvedTokenizer2.advance();
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    int i12 = improvedTokenizer2.start('#');
    int i14 = improvedTokenizer2.start('a');
    java.io.Reader reader15 = null;
    improvedTokenizer2.initialize(reader15, "hi!");
    int i19 = improvedTokenizer2.start(' ');
    int i21 = improvedTokenizer2.afterToken('4');
    int i23 = improvedTokenizer2.afterToken(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 3);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test467"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.io.Reader reader4 = null;
    improvedTokenizer2.initialize(reader4, "44");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4"+ "'", str3.equals("4"));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test468"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    boolean b13 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream14 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream14, "4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test469"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i10 = improvedTokenizer2.start('#');
    int i12 = improvedTokenizer2.matchingToken('a');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)0);
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "# ");
    java.io.Reader reader19 = null;
    improvedTokenizer2.initialize(reader19, "4 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test470"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken('a');
    int i18 = improvedTokenizer2.start('4');
    java.lang.String str19 = improvedTokenizer2.previousDelimiter();
    int i21 = improvedTokenizer2.beforeToken('4');
    boolean b23 = improvedTokenizer2.keepParsing(10);
    int i25 = improvedTokenizer2.start('a');
    boolean b26 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test471"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.beforeToken(' ');
    boolean b8 = improvedTokenizer2.keepParsing(5);
    boolean b10 = improvedTokenizer2.keepParsing((int)(byte)10);
    int i12 = improvedTokenizer2.afterToken('#');
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    java.lang.String str14 = improvedTokenizer2.next();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " "+ "'", str13.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test472"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i17 = improvedTokenizer2.stop();
    boolean b18 = improvedTokenizer2.advance();
    boolean b19 = improvedTokenizer2.advance();
    boolean b21 = improvedTokenizer2.keepParsing((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test473"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", "4");
    boolean b3 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test474"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.keepParsing(2);
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream9 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream9, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test475"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i10 = improvedTokenizer2.start('#');
    int i12 = improvedTokenizer2.matchingToken('4');
    int i14 = improvedTokenizer2.matchingToken('4');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test476"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    int i7 = improvedTokenizer2.stop();
    int i8 = improvedTokenizer2.stop();
    int i10 = improvedTokenizer2.start('a');
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "#");
    boolean b15 = improvedTokenizer2.keepParsing((int)(byte)-1);
    int i17 = improvedTokenizer2.start(' ');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test477"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b7 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.advance();
    boolean b9 = improvedTokenizer2.advance();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test478"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i6 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.keepParsing((int)(short)-1);
    boolean b10 = improvedTokenizer2.keepParsing((int)(byte)10);
    int i12 = improvedTokenizer2.start('4');
    boolean b13 = improvedTokenizer2.hasNext();
    boolean b14 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test479"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i10 = improvedTokenizer2.start('#');
    int i12 = improvedTokenizer2.matchingToken('4');
    int i14 = improvedTokenizer2.matchingToken('4');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "");
    int i19 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i21 = improvedTokenizer2.afterToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test480"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i18 = improvedTokenizer2.start('4');
    int i20 = improvedTokenizer2.start('a');
    int i22 = improvedTokenizer2.start('#');
    int i24 = improvedTokenizer2.beforeToken('a');
    java.lang.String str25 = improvedTokenizer2.previousDelimiter();
    java.lang.String str26 = improvedTokenizer2.next();
    java.io.InputStream inputStream27 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream27, "#4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "#"+ "'", str25.equals("#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test481"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.start(' ');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    int i11 = improvedTokenizer2.start(' ');
    int i12 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test482"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken('a');
    int i18 = improvedTokenizer2.start('4');
    int i19 = improvedTokenizer2.stop();
    int i21 = improvedTokenizer2.start(' ');
    boolean b23 = improvedTokenizer2.keepParsing(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test483"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.beforeToken(' ');
    boolean b8 = improvedTokenizer2.keepParsing(5);
    boolean b10 = improvedTokenizer2.keepParsing((int)(byte)10);
    boolean b11 = improvedTokenizer2.advance();
    int i13 = improvedTokenizer2.start(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test484"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    boolean b9 = improvedTokenizer2.keepParsing((int)(byte)1);
    int i10 = improvedTokenizer2.stop();
    int i11 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i13 = improvedTokenizer2.matchingToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test485"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.hasNext();
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "a");
    int i12 = improvedTokenizer2.start(' ');
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    boolean b15 = improvedTokenizer2.keepParsing((int)' ');
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "a");
    int i20 = improvedTokenizer2.start('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test486"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    int i13 = improvedTokenizer2.afterToken('4');
    boolean b15 = improvedTokenizer2.keepParsing((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test487"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(short)100);
    java.lang.String str5 = improvedTokenizer2.next();
    int i7 = improvedTokenizer2.start('#');
    boolean b9 = improvedTokenizer2.keepParsing((int)(short)10);
    int i11 = improvedTokenizer2.start(' ');
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i14 = improvedTokenizer2.beforeToken('#');
    java.io.InputStream inputStream15 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream15, "4#");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "a"+ "'", str5.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test488"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "");
    int i3 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.start('4');
    int i7 = improvedTokenizer2.start('#');
    int i8 = improvedTokenizer2.stop();
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "");
    // The following exception was thrown during execution in test generation
    try {
    int i13 = improvedTokenizer2.afterToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test489"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    int i8 = improvedTokenizer2.start('4');
    boolean b10 = improvedTokenizer2.keepParsing(100);
    int i12 = improvedTokenizer2.beforeToken('a');
    int i14 = improvedTokenizer2.afterToken('4');
    boolean b15 = improvedTokenizer2.hasNext();
    int i17 = improvedTokenizer2.afterToken('a');
    int i19 = improvedTokenizer2.matchingToken('4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test490"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('#');
    boolean b7 = improvedTokenizer2.keepParsing(2);
    int i8 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test491"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#a", "#4");

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test492"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing((int)'4');
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    int i8 = improvedTokenizer2.start('#');
    int i10 = improvedTokenizer2.matchingToken('4');
    boolean b11 = improvedTokenizer2.advance();
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "a ");
    boolean b16 = improvedTokenizer2.keepParsing(0);
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test493"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    java.lang.String str7 = improvedTokenizer2.next();
    boolean b8 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.start('a');
    int i11 = improvedTokenizer2.stop();
    int i12 = improvedTokenizer2.stop();
    boolean b13 = improvedTokenizer2.hasNext();
    java.io.Reader reader14 = null;
    improvedTokenizer2.initialize(reader14, "a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test494"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start('#');
    boolean b9 = improvedTokenizer2.keepParsing(100);
    int i11 = improvedTokenizer2.start('#');
    int i13 = improvedTokenizer2.start('#');
    int i15 = improvedTokenizer2.start(' ');
    int i16 = improvedTokenizer2.stop();
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    int i19 = improvedTokenizer2.start('#');
    java.lang.String str20 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test495"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    java.io.Reader reader4 = null;
    improvedTokenizer2.initialize(reader4, "");
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "hi!");
    int i11 = improvedTokenizer2.start('a');
    int i13 = improvedTokenizer2.start('#');
    int i15 = improvedTokenizer2.matchingToken(' ');
    int i17 = improvedTokenizer2.beforeToken(' ');
    int i19 = improvedTokenizer2.afterToken('4');
    boolean b21 = improvedTokenizer2.keepParsing(10);
    // The following exception was thrown during execution in test generation
    try {
    boolean b22 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test496"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing((int)'4');
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    int i8 = improvedTokenizer2.start('#');
    int i10 = improvedTokenizer2.matchingToken('4');
    boolean b11 = improvedTokenizer2.advance();
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "a ");
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    int i17 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test497"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "4");
    boolean b3 = improvedTokenizer2.advance();
    java.io.Reader reader4 = null;
    improvedTokenizer2.initialize(reader4, "4a");
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i8 = improvedTokenizer2.stop();
    int i10 = improvedTokenizer2.start(' ');
    int i11 = improvedTokenizer2.stop();
    java.io.InputStream inputStream12 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream12, "4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test498"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i6 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.stop();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    int i10 = improvedTokenizer2.start(' ');
    int i12 = improvedTokenizer2.matchingToken('a');
    int i14 = improvedTokenizer2.afterToken('a');
    boolean b15 = improvedTokenizer2.advance();
    int i16 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test499"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    int i12 = improvedTokenizer2.stop();
    int i14 = improvedTokenizer2.start(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test500"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.keepParsing(100);
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)100);
    boolean b11 = improvedTokenizer2.advance();
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.start(' ');
    int i16 = improvedTokenizer2.beforeToken('4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);

  }

}