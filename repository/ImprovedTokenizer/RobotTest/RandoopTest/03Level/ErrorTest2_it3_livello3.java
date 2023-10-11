
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test001"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.afterToken('4');
    int i12 = improvedTokenizer2.matchingToken(' ');
    boolean b13 = improvedTokenizer2.advance();
    int i15 = improvedTokenizer2.start('#');
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    int i18 = improvedTokenizer2.start('#');
    boolean b19 = improvedTokenizer2.advance();
    boolean b20 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test002"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b3 = improvedTokenizer2.advance();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test003"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('#');
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)1);
    boolean b11 = improvedTokenizer2.hasNext();
    int i13 = improvedTokenizer2.beforeToken('4');
    boolean b14 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test004"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", "#");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test005"); }


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
    boolean b21 = improvedTokenizer2.hasNext();
    boolean b23 = improvedTokenizer2.keepParsing((int)(short)1);
    java.lang.String str24 = improvedTokenizer2.previousDelimiter();
    boolean b26 = improvedTokenizer2.keepParsing((int)'#');
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i28 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test006"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    int i5 = improvedTokenizer2.stop();
    int i6 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test007"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4#", "#");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test008"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.afterToken('4');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.matchingToken('4');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    int i17 = improvedTokenizer2.matchingToken('a');
    java.lang.String str18 = improvedTokenizer2.previousDelimiter();
    boolean b19 = improvedTokenizer2.advance();
    boolean b20 = improvedTokenizer2.hasNext();
    boolean b21 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test009"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i6 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test010"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b11 = improvedTokenizer2.advance();
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test011"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.afterToken('#');
    int i16 = improvedTokenizer2.start('4');
    int i17 = improvedTokenizer2.stop();
    boolean b18 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i20 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test012"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    java.lang.String str7 = improvedTokenizer2.next();
    boolean b8 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test013"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.afterToken('#');
    boolean b8 = improvedTokenizer2.keepParsing((-1));
    java.lang.String str9 = improvedTokenizer2.next();
    boolean b10 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test014"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a#", "44");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test015"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.beforeToken('4');
    boolean b15 = improvedTokenizer2.hasNext();
    int i16 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test016"); }


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
    boolean b24 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test017"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "#");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i4 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test018"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('#');
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)1);
    boolean b11 = improvedTokenizer2.hasNext();
    int i13 = improvedTokenizer2.beforeToken('4');
    boolean b14 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test019"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(128);
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start('a');
    boolean b9 = improvedTokenizer2.keepParsing(5);
    int i11 = improvedTokenizer2.matchingToken('4');
    boolean b12 = improvedTokenizer2.advance();
    boolean b14 = improvedTokenizer2.keepParsing((int)'4');
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test020"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", "hi!");
    int i3 = improvedTokenizer2.stop();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test021"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.afterToken('4');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.matchingToken('4');
    boolean b15 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test022"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)-1);
    boolean b9 = improvedTokenizer2.advance();
    boolean b10 = improvedTokenizer2.hasNext();
    boolean b12 = improvedTokenizer2.keepParsing(2);
    boolean b14 = improvedTokenizer2.keepParsing(0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test023"); }


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
    int i19 = improvedTokenizer2.start('a');
    int i21 = improvedTokenizer2.matchingToken(' ');
    int i22 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i24 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test024"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(4);
    boolean b5 = improvedTokenizer2.hasNext();
    int i6 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.stop();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test025"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.afterToken('#');
    boolean b8 = improvedTokenizer2.keepParsing((-1));
    boolean b9 = improvedTokenizer2.hasNext();
    boolean b10 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test026"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    int i4 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test027"); }


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
    int i16 = improvedTokenizer2.stop();
    boolean b17 = improvedTokenizer2.advance();
    java.lang.String str18 = improvedTokenizer2.previousDelimiter();
    int i19 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test028"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i10 = improvedTokenizer2.start('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    boolean b13 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test029"); }


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
    boolean b20 = improvedTokenizer2.advance();
    int i21 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test030"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    int i13 = improvedTokenizer2.beforeToken('a');
    boolean b14 = improvedTokenizer2.advance();
    boolean b15 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test031"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.afterToken('4');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.matchingToken('4');
    boolean b15 = improvedTokenizer2.hasNext();
    int i17 = improvedTokenizer2.start(' ');
    int i19 = improvedTokenizer2.beforeToken('#');
    boolean b20 = improvedTokenizer2.advance();
    int i21 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test032"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)'a');
    int i15 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test033"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#4", "a ");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test034"); }


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
    java.lang.String str21 = improvedTokenizer2.next();
    int i22 = improvedTokenizer2.stop();
    boolean b23 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i25 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test035"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.keepParsing(100);
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)100);
    int i11 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test036"); }


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
    int i23 = improvedTokenizer2.beforeToken('4');
    boolean b24 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test037"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(128);
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start('a');
    boolean b9 = improvedTokenizer2.keepParsing(5);
    int i11 = improvedTokenizer2.matchingToken('4');
    int i12 = improvedTokenizer2.stop();
    int i13 = improvedTokenizer2.stop();
    boolean b14 = improvedTokenizer2.advance();
    boolean b15 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test038"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    int i13 = improvedTokenizer2.beforeToken('#');
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    boolean b16 = improvedTokenizer2.keepParsing(128);
    int i17 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test039"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "#");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test040"); }


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
    boolean b19 = improvedTokenizer2.keepParsing(4);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test041"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "4a");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)100);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test042"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    java.lang.String str7 = improvedTokenizer2.next();
    boolean b8 = improvedTokenizer2.advance();
    int i10 = improvedTokenizer2.start(' ');
    int i12 = improvedTokenizer2.matchingToken('#');
    boolean b13 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test043"); }


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
    boolean b20 = improvedTokenizer2.hasNext();
    boolean b22 = improvedTokenizer2.keepParsing(0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i24 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test044"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken('a');
    int i18 = improvedTokenizer2.matchingToken('a');
    java.lang.String str19 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test045"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test046"); }


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
    boolean b16 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test047"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.afterToken('4');
    int i12 = improvedTokenizer2.matchingToken(' ');
    boolean b13 = improvedTokenizer2.hasNext();
    int i15 = improvedTokenizer2.start('a');
    int i17 = improvedTokenizer2.afterToken('#');
    int i18 = improvedTokenizer2.stop();
    boolean b19 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test048"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.advance();
    int i10 = improvedTokenizer2.start('4');
    boolean b11 = improvedTokenizer2.hasNext();
    boolean b12 = improvedTokenizer2.advance();
    boolean b13 = improvedTokenizer2.hasNext();
    boolean b14 = improvedTokenizer2.advance();
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test049"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    boolean b6 = improvedTokenizer2.keepParsing(3);
    boolean b7 = improvedTokenizer2.advance();
    boolean b9 = improvedTokenizer2.keepParsing(5);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test050"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.beforeToken('a');
    int i16 = improvedTokenizer2.afterToken('a');
    int i17 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test051"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i24 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test052"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "#4");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test053"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" #", "");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test054"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    boolean b9 = improvedTokenizer2.hasNext();
    boolean b10 = improvedTokenizer2.hasNext();
    int i11 = improvedTokenizer2.stop();
    boolean b12 = improvedTokenizer2.hasNext();
    boolean b13 = improvedTokenizer2.hasNext();
    boolean b14 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test055"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "4a");
    boolean b4 = improvedTokenizer2.keepParsing(4);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test056"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "a ");
    boolean b4 = improvedTokenizer2.keepParsing((int)(short)-1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test057"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.keepParsing((int)(short)-1);
    boolean b10 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test058"); }


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
    int i16 = improvedTokenizer2.stop();
    boolean b18 = improvedTokenizer2.keepParsing(0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i20 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test059"); }


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
    int i22 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i24 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test060"); }


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
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test061"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.keepParsing(100);
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)100);
    boolean b11 = improvedTokenizer2.advance();
    boolean b12 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test062"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('#');
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b7 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.hasNext();
    boolean b9 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test063"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.start('#');
    boolean b7 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.hasNext();
    int i9 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test064"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    boolean b11 = improvedTokenizer2.keepParsing((int)'4');
    int i13 = improvedTokenizer2.matchingToken('4');
    boolean b15 = improvedTokenizer2.keepParsing((int)(byte)-1);
    boolean b16 = improvedTokenizer2.advance();
    boolean b17 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test065"); }


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
    boolean b20 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test066"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    boolean b11 = improvedTokenizer2.advance();
    boolean b12 = improvedTokenizer2.advance();
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test067"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "4");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test068"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)0);
    java.lang.String str11 = improvedTokenizer2.next();
    boolean b13 = improvedTokenizer2.keepParsing((-1));
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test069"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.start('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.afterToken('4');
    int i11 = improvedTokenizer2.start(' ');
    int i13 = improvedTokenizer2.beforeToken('#');
    boolean b14 = improvedTokenizer2.hasNext();
    int i15 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test070"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i6 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.stop();
    boolean b9 = improvedTokenizer2.keepParsing(2);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test071"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('#');
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)1);
    boolean b11 = improvedTokenizer2.hasNext();
    boolean b12 = improvedTokenizer2.advance();
    int i13 = improvedTokenizer2.stop();
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test072"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('a');
    int i12 = improvedTokenizer2.beforeToken('#');
    boolean b13 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test073"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "a");
    int i4 = improvedTokenizer2.start('#');
    int i5 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test074"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    boolean b11 = improvedTokenizer2.keepParsing((int)'4');
    int i13 = improvedTokenizer2.start(' ');
    int i15 = improvedTokenizer2.beforeToken('4');
    boolean b16 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test075"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    java.lang.String str7 = improvedTokenizer2.next();
    boolean b8 = improvedTokenizer2.hasNext();
    int i9 = improvedTokenizer2.stop();
    boolean b10 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test076"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "4a");
    boolean b3 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test077"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('4');
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    int i8 = improvedTokenizer2.start('4');
    int i10 = improvedTokenizer2.afterToken('4');
    boolean b11 = improvedTokenizer2.advance();
    boolean b13 = improvedTokenizer2.keepParsing(5);
    int i14 = improvedTokenizer2.stop();
    boolean b16 = improvedTokenizer2.keepParsing(0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test078"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" #", "a");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test079"); }


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
    int i19 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test080"); }


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
    int i25 = improvedTokenizer2.stop();
    boolean b26 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i28 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test081"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i9 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test082"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    int i7 = improvedTokenizer2.start(' ');
    boolean b8 = improvedTokenizer2.advance();
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    int i10 = improvedTokenizer2.stop();
    boolean b11 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test083"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.hasNext();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i8 = improvedTokenizer2.stop();
    boolean b9 = improvedTokenizer2.advance();
    int i10 = improvedTokenizer2.stop();
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test084"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#a", "4 4a");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test085"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4#", "4#");
    int i4 = improvedTokenizer2.start('a');
    int i5 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test086"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)100);
    int i11 = improvedTokenizer2.stop();
    boolean b12 = improvedTokenizer2.advance();
    boolean b14 = improvedTokenizer2.keepParsing((int)(byte)10);
    int i16 = improvedTokenizer2.start('a');
    int i17 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test087"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.advance();
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.start('4');
    int i13 = improvedTokenizer2.stop();
    boolean b14 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test088"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "4a");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test089"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('a');
    int i11 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test090"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i25 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test091"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i6 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.stop();
    int i8 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test092"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)1);
    boolean b11 = improvedTokenizer2.hasNext();
    int i12 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test093"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(4);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test094"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing((int)'4');
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test095"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.beforeToken('a');
    int i16 = improvedTokenizer2.matchingToken(' ');
    boolean b18 = improvedTokenizer2.keepParsing(0);
    boolean b19 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test096"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    boolean b4 = improvedTokenizer2.advance();
    boolean b5 = improvedTokenizer2.hasNext();
    boolean b6 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test097"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    boolean b9 = improvedTokenizer2.hasNext();
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    int i11 = improvedTokenizer2.stop();
    int i12 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test098"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    int i7 = improvedTokenizer2.start(' ');
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.stop();
    boolean b11 = improvedTokenizer2.keepParsing((int)(short)10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test099"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.keepParsing((int)(short)-1);
    boolean b10 = improvedTokenizer2.hasNext();
    boolean b11 = improvedTokenizer2.hasNext();
    int i12 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test100"); }


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
    java.lang.String str25 = improvedTokenizer2.next();
    boolean b27 = improvedTokenizer2.keepParsing(2);
    int i28 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i30 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test101"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4a", "#");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test102"); }


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
    boolean b30 = improvedTokenizer2.keepParsing((int)(short)100);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i32 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test103"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    boolean b6 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test104"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.hasNext();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.stop();
    boolean b12 = improvedTokenizer2.keepParsing((int)(short)-1);
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test105"); }


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
    int i18 = improvedTokenizer2.stop();
    boolean b19 = improvedTokenizer2.advance();
    boolean b20 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test106"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.advance();
    int i9 = improvedTokenizer2.stop();
    int i10 = improvedTokenizer2.stop();
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test107"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4a", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.matchingToken('a');
    int i9 = improvedTokenizer2.matchingToken(' ');
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    boolean b11 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test108"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "#");
    boolean b3 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test109"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.afterToken('#');
    boolean b8 = improvedTokenizer2.keepParsing((-1));
    java.lang.String str9 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test110"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.beforeToken(' ');
    int i15 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test111"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)-1);
    int i9 = improvedTokenizer2.stop();
    int i10 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test112"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.afterToken('4');
    int i12 = improvedTokenizer2.matchingToken(' ');
    boolean b13 = improvedTokenizer2.hasNext();
    int i15 = improvedTokenizer2.start('a');
    int i17 = improvedTokenizer2.afterToken('4');
    int i19 = improvedTokenizer2.matchingToken('4');
    java.lang.String str20 = improvedTokenizer2.previousDelimiter();
    boolean b21 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test113"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(short)100);
    java.lang.String str5 = improvedTokenizer2.next();
    java.lang.String str6 = improvedTokenizer2.next();
    boolean b7 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test114"); }


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
    int i17 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test115"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4#", "4 ");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test116"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('4');
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    int i8 = improvedTokenizer2.start('4');
    int i10 = improvedTokenizer2.afterToken('4');
    boolean b11 = improvedTokenizer2.advance();
    boolean b13 = improvedTokenizer2.keepParsing(5);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test117"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.beforeToken('a');
    int i10 = improvedTokenizer2.afterToken('a');
    boolean b11 = improvedTokenizer2.advance();
    boolean b13 = improvedTokenizer2.keepParsing((int)'a');
    boolean b14 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test118"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)-1);
    boolean b9 = improvedTokenizer2.advance();
    boolean b10 = improvedTokenizer2.hasNext();
    boolean b12 = improvedTokenizer2.keepParsing(2);
    boolean b14 = improvedTokenizer2.keepParsing(0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test119"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.start('#');
    boolean b7 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.hasNext();
    boolean b9 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test120"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(128);
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start('a');
    boolean b9 = improvedTokenizer2.keepParsing(5);
    int i11 = improvedTokenizer2.matchingToken('4');
    boolean b12 = improvedTokenizer2.advance();
    boolean b14 = improvedTokenizer2.keepParsing((int)'4');
    boolean b15 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test121"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.start(' ');
    int i12 = improvedTokenizer2.beforeToken('a');
    boolean b13 = improvedTokenizer2.hasNext();
    int i15 = improvedTokenizer2.matchingToken(' ');
    int i16 = improvedTokenizer2.stop();
    boolean b18 = improvedTokenizer2.keepParsing((int)(short)10);
    int i19 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test122"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("44", "a#");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test123"); }


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
    boolean b21 = improvedTokenizer2.advance();
    java.lang.String str22 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i24 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test124"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i10 = improvedTokenizer2.start('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    boolean b13 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test125"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i6 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.stop();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test126"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    boolean b9 = improvedTokenizer2.hasNext();
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test127"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('4');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken('a');
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b11 = improvedTokenizer2.advance();
    int i12 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test128"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i9 = improvedTokenizer2.stop();
    boolean b11 = improvedTokenizer2.keepParsing((int)(byte)1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test129"); }


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
    boolean b23 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i25 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test130"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    boolean b5 = improvedTokenizer2.advance();
    int i6 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test131"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a#", "4 ");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test132"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    boolean b4 = improvedTokenizer2.advance();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test133"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.hasNext();
    boolean b9 = improvedTokenizer2.keepParsing((int)' ');
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test134"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    int i7 = improvedTokenizer2.stop();
    int i8 = improvedTokenizer2.stop();
    int i9 = improvedTokenizer2.stop();
    boolean b10 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test135"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    int i7 = improvedTokenizer2.start('a');
    boolean b8 = improvedTokenizer2.advance();
    boolean b10 = improvedTokenizer2.keepParsing((-1));
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test136"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b3 = improvedTokenizer2.advance();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test137"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    boolean b9 = improvedTokenizer2.hasNext();
    boolean b10 = improvedTokenizer2.hasNext();
    int i11 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test138"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(4);
    int i6 = improvedTokenizer2.start('#');
    int i7 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test139"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    boolean b4 = improvedTokenizer2.advance();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.keepParsing(2);
    int i9 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test140"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.hasNext();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.stop();
    boolean b12 = improvedTokenizer2.keepParsing((int)' ');
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test141"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i10 = improvedTokenizer2.start('a');
    boolean b11 = improvedTokenizer2.hasNext();
    int i13 = improvedTokenizer2.start('#');
    boolean b14 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test142"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4a", "");
    int i3 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test143"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(4);
    boolean b5 = improvedTokenizer2.hasNext();
    int i6 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.stop();
    int i9 = improvedTokenizer2.start('a');
    boolean b10 = improvedTokenizer2.advance();
    int i11 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test144"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    boolean b4 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.hasNext();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test145"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#a", "4#");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test146"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken(' ');
    boolean b17 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test147"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('a');
    int i12 = improvedTokenizer2.beforeToken('#');
    boolean b13 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test148"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    boolean b9 = improvedTokenizer2.hasNext();
    boolean b10 = improvedTokenizer2.hasNext();
    boolean b11 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test149"); }


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
    boolean b21 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test150"); }


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
    boolean b18 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i20 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test151"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.afterToken('#');
    boolean b8 = improvedTokenizer2.keepParsing((-1));
    int i10 = improvedTokenizer2.beforeToken('4');
    int i12 = improvedTokenizer2.matchingToken('4');
    boolean b13 = improvedTokenizer2.hasNext();
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test152"); }


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
    int i16 = improvedTokenizer2.stop();
    boolean b17 = improvedTokenizer2.advance();
    int i18 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i20 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test153"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.afterToken(' ');
    boolean b7 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.advance();
    boolean b9 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test154"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", " ");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test155"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing((int)'4');
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b7 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test156"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.hasNext();
    boolean b9 = improvedTokenizer2.keepParsing((int)' ');
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    int i11 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test157"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    int i13 = improvedTokenizer2.afterToken('4');
    int i15 = improvedTokenizer2.afterToken('a');
    int i17 = improvedTokenizer2.beforeToken('4');
    boolean b18 = improvedTokenizer2.advance();
    boolean b19 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test158"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.start('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.afterToken('4');
    boolean b10 = improvedTokenizer2.hasNext();
    boolean b11 = improvedTokenizer2.hasNext();
    int i12 = improvedTokenizer2.stop();
    boolean b14 = improvedTokenizer2.keepParsing((int)'a');
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test159"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)-1);
    int i9 = improvedTokenizer2.stop();
    boolean b11 = improvedTokenizer2.keepParsing((int)(byte)10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test160"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)' ');
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b11 = improvedTokenizer2.advance();
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test161"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.beforeToken('a');
    int i10 = improvedTokenizer2.afterToken('a');
    boolean b11 = improvedTokenizer2.advance();
    boolean b13 = improvedTokenizer2.keepParsing((int)'a');
    boolean b14 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test162"); }


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
    int i24 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test163"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test164"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4 4a", "");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test165"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "4a");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test166"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.afterToken('#');
    boolean b8 = improvedTokenizer2.keepParsing((-1));
    int i10 = improvedTokenizer2.beforeToken('4');
    int i12 = improvedTokenizer2.afterToken('#');
    int i14 = improvedTokenizer2.start(' ');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    int i17 = improvedTokenizer2.afterToken('a');
    java.lang.String str18 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i20 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test167"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a#", "hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test168"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken('a');
    boolean b18 = improvedTokenizer2.keepParsing((int)'a');
    boolean b19 = improvedTokenizer2.hasNext();
    boolean b21 = improvedTokenizer2.keepParsing((int)(short)-1);
    boolean b22 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i24 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test169"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4 ", "a");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test170"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.start('a');
    int i18 = improvedTokenizer2.afterToken('a');
    int i19 = improvedTokenizer2.stop();
    boolean b21 = improvedTokenizer2.keepParsing(0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test171"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.hasNext();
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test172"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i10 = improvedTokenizer2.start('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    boolean b13 = improvedTokenizer2.hasNext();
    int i15 = improvedTokenizer2.beforeToken('4');
    int i17 = improvedTokenizer2.beforeToken(' ');
    boolean b18 = improvedTokenizer2.advance();
    int i19 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test173"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.beforeToken('a');
    int i13 = improvedTokenizer2.start('a');
    boolean b14 = improvedTokenizer2.advance();
    boolean b15 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test174"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "4#");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test175"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.beforeToken('a');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    int i17 = improvedTokenizer2.start('4');
    java.lang.String str18 = improvedTokenizer2.previousDelimiter();
    boolean b19 = improvedTokenizer2.advance();
    boolean b21 = improvedTokenizer2.keepParsing((int)(byte)100);
    int i22 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i24 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test176"); }


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
    boolean b20 = improvedTokenizer2.hasNext();
    java.lang.String str21 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test177"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.beforeToken('a');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    boolean b17 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b19 = improvedTokenizer2.keepParsing(1);
    int i21 = improvedTokenizer2.start('4');
    boolean b22 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i24 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test178"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)100);
    int i16 = improvedTokenizer2.matchingToken('a');
    int i18 = improvedTokenizer2.matchingToken('a');
    java.lang.String str19 = improvedTokenizer2.next();
    java.lang.String str20 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test179"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('4');
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)100);
    int i11 = improvedTokenizer2.stop();
    boolean b12 = improvedTokenizer2.advance();
    boolean b14 = improvedTokenizer2.keepParsing((int)(byte)10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test180"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    boolean b10 = improvedTokenizer2.advance();
    int i12 = improvedTokenizer2.start('a');
    boolean b13 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test181"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    int i11 = improvedTokenizer2.beforeToken('#');
    int i13 = improvedTokenizer2.start('a');
    java.lang.String str14 = improvedTokenizer2.next();
    int i15 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test182"); }


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
    int i23 = improvedTokenizer2.start('#');
    int i25 = improvedTokenizer2.matchingToken('a');
    boolean b27 = improvedTokenizer2.keepParsing((int)(short)-1);
    int i28 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i30 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test183"); }


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
    boolean b15 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test184"); }


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
    boolean b21 = improvedTokenizer2.advance();
    java.lang.String str22 = improvedTokenizer2.previousDelimiter();
    boolean b23 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i25 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test185"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(4);
    boolean b5 = improvedTokenizer2.hasNext();
    boolean b6 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test186"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.beforeToken('a');
    int i16 = improvedTokenizer2.matchingToken(' ');
    boolean b18 = improvedTokenizer2.keepParsing(0);
    boolean b19 = improvedTokenizer2.hasNext();
    boolean b20 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test187"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test188"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b6 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.hasNext();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.hasNext();
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    boolean b12 = improvedTokenizer2.keepParsing(0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test189"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.start('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.afterToken('4');
    boolean b10 = improvedTokenizer2.hasNext();
    boolean b11 = improvedTokenizer2.advance();
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test190"); }


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
    java.lang.String str22 = improvedTokenizer2.previousDelimiter();
    boolean b24 = improvedTokenizer2.keepParsing((int)'4');
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test191"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "4 ");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test192"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "a");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test193"); }


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
    boolean b21 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest2.test194"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.afterToken('#');
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    boolean b10 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.beforeToken('a');

  }

}
