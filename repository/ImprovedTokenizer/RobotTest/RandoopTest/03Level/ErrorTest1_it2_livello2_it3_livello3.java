
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test001"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.afterToken(' ');
    int i14 = improvedTokenizer2.stop();
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    boolean b17 = improvedTokenizer2.keepParsing(0);
    boolean b18 = improvedTokenizer2.hasNext();
    int i20 = improvedTokenizer2.start('a');
    int i21 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test002"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('a');
    int i10 = improvedTokenizer2.beforeToken('#');
    int i12 = improvedTokenizer2.matchingToken('a');
    int i13 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test003"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.afterToken(' ');
    int i14 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.hasNext();
    boolean b17 = improvedTokenizer2.keepParsing((int)' ');
    int i18 = improvedTokenizer2.stop();
    boolean b19 = improvedTokenizer2.advance();
    java.lang.String str20 = improvedTokenizer2.previousDelimiter();
    int i21 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test004"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "4");
    int i3 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test005"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.afterToken(' ');
    int i14 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.hasNext();
    boolean b17 = improvedTokenizer2.keepParsing((int)' ');
    int i18 = improvedTokenizer2.stop();
    boolean b20 = improvedTokenizer2.keepParsing((-1));
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test006"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", " ");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test007"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a ", "4");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i4 = improvedTokenizer2.stop();
    java.lang.String str5 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test008"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test009"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.start('a');
    boolean b14 = improvedTokenizer2.hasNext();
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i17 = improvedTokenizer2.stop();
    boolean b18 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i20 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test010"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('#');
    int i8 = improvedTokenizer2.afterToken('a');
    int i10 = improvedTokenizer2.afterToken('4');
    java.lang.String str11 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test011"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i5 = improvedTokenizer2.start(' ');
    int i7 = improvedTokenizer2.afterToken('4');
    int i8 = improvedTokenizer2.stop();
    boolean b10 = improvedTokenizer2.keepParsing((int)(byte)-1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test012"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    int i3 = improvedTokenizer2.stop();
    boolean b4 = improvedTokenizer2.advance();
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test013"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i10 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test014"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b7 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test015"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b7 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test016"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    boolean b8 = improvedTokenizer2.advance();
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test017"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "a ");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test018"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", "a ");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test019"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", " ");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)10);
    int i6 = improvedTokenizer2.start(' ');
    boolean b8 = improvedTokenizer2.keepParsing((int)(short)100);
    java.lang.String str9 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test020"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.matchingToken('a');
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    int i16 = improvedTokenizer2.matchingToken('#');
    int i17 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test021"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)1);
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test022"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test023"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken(' ');
    int i13 = improvedTokenizer2.afterToken('a');
    boolean b14 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test024"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i8 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test025"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(short)100);
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    java.lang.String str6 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test026"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.start('4');
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.advance();
    int i10 = improvedTokenizer2.stop();
    boolean b11 = improvedTokenizer2.hasNext();
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.start('a');
    boolean b15 = improvedTokenizer2.advance();
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    boolean b17 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test027"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.keepParsing(128);
    boolean b10 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test028"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4a", "a ");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test029"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.start('4');
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)10);
    boolean b11 = improvedTokenizer2.advance();
    boolean b12 = improvedTokenizer2.hasNext();
    boolean b13 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test030"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.matchingToken('#');
    int i8 = improvedTokenizer2.start('#');
    int i9 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test031"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    int i3 = improvedTokenizer2.stop();
    boolean b4 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.hasNext();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.keepParsing(128);
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test032"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.hasNext();
    boolean b9 = improvedTokenizer2.advance();
    int i11 = improvedTokenizer2.start('a');
    int i12 = improvedTokenizer2.stop();
    int i13 = improvedTokenizer2.stop();
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test033"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", "#");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)-1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test034"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b6 = improvedTokenizer2.keepParsing(1);
    boolean b7 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.stop();
    boolean b9 = improvedTokenizer2.advance();
    boolean b10 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test035"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.start('a');
    boolean b14 = improvedTokenizer2.hasNext();
    boolean b15 = improvedTokenizer2.advance();
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test036"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.stop();
    int i9 = improvedTokenizer2.start('a');
    int i11 = improvedTokenizer2.matchingToken('a');
    boolean b13 = improvedTokenizer2.keepParsing((int)'#');
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    boolean b16 = improvedTokenizer2.keepParsing((int)(byte)1);
    int i18 = improvedTokenizer2.start('4');
    boolean b19 = improvedTokenizer2.advance();
    int i20 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test037"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.start('4');
    int i14 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test038"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "a");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test039"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken('#');
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i14 = improvedTokenizer2.start('4');
    boolean b16 = improvedTokenizer2.keepParsing((int)(byte)10);
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    boolean b18 = improvedTokenizer2.hasNext();
    int i19 = improvedTokenizer2.stop();
    boolean b21 = improvedTokenizer2.keepParsing((int)(short)1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test040"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken('#');
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i14 = improvedTokenizer2.start('4');
    boolean b16 = improvedTokenizer2.keepParsing((int)(byte)10);
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    boolean b18 = improvedTokenizer2.hasNext();
    int i19 = improvedTokenizer2.stop();
    boolean b21 = improvedTokenizer2.keepParsing((int)(short)1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test041"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    boolean b8 = improvedTokenizer2.advance();
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test042"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test043"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.beforeToken('a');
    boolean b14 = improvedTokenizer2.keepParsing(128);
    int i15 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test044"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    boolean b4 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b7 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.hasNext();
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test045"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4a", "a#");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test046"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.matchingToken('#');
    int i8 = improvedTokenizer2.start('#');
    java.lang.String str9 = improvedTokenizer2.next();
    int i11 = improvedTokenizer2.start('a');
    int i12 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test047"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", "");
    int i4 = improvedTokenizer2.start('#');
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test048"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.matchingToken('#');
    int i8 = improvedTokenizer2.start('#');
    java.lang.String str9 = improvedTokenizer2.next();
    int i11 = improvedTokenizer2.start('a');
    int i12 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test049"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('#');
    int i8 = improvedTokenizer2.matchingToken('a');
    boolean b9 = improvedTokenizer2.hasNext();
    boolean b10 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test050"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    java.lang.String str4 = improvedTokenizer2.next();
    int i6 = improvedTokenizer2.start(' ');
    int i7 = improvedTokenizer2.stop();
    boolean b9 = improvedTokenizer2.keepParsing(2);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test051"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    boolean b5 = improvedTokenizer2.hasNext();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b7 = improvedTokenizer2.hasNext();
    boolean b9 = improvedTokenizer2.keepParsing(1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test052"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.keepParsing((int)(byte)10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test053"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    boolean b12 = improvedTokenizer2.advance();
    int i13 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.keepParsing((int)'4');
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test054"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "4");
    boolean b3 = improvedTokenizer2.hasNext();
    int i5 = improvedTokenizer2.start('a');
    java.lang.String str6 = improvedTokenizer2.next();
    int i8 = improvedTokenizer2.matchingToken('4');
    int i9 = improvedTokenizer2.stop();
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test055"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.start('4');
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)10);
    boolean b11 = improvedTokenizer2.advance();
    boolean b12 = improvedTokenizer2.hasNext();
    boolean b13 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test056"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4 ", "#");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test057"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", " ");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test058"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b6 = improvedTokenizer2.keepParsing(1);
    boolean b8 = improvedTokenizer2.keepParsing(1);
    boolean b10 = improvedTokenizer2.keepParsing(1);
    boolean b11 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test059"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", "a#");
    int i3 = improvedTokenizer2.stop();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test060"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i4 = improvedTokenizer2.stop();
    boolean b5 = improvedTokenizer2.advance();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test061"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.afterToken(' ');
    int i14 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.hasNext();
    boolean b17 = improvedTokenizer2.keepParsing((int)' ');
    int i18 = improvedTokenizer2.stop();
    java.lang.String str19 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test062"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.start('a');
    boolean b14 = improvedTokenizer2.advance();
    int i15 = improvedTokenizer2.stop();
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    boolean b17 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test063"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.advance();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test064"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.start('4');
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test065"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.beforeToken('a');
    int i13 = improvedTokenizer2.afterToken('a');
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    boolean b16 = improvedTokenizer2.keepParsing(2);
    boolean b18 = improvedTokenizer2.keepParsing((int)(short)1);
    int i19 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test066"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.start('4');
    int i14 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test067"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('a');
    boolean b9 = improvedTokenizer2.hasNext();
    int i11 = improvedTokenizer2.start('a');
    int i12 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test068"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    boolean b5 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test069"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i12 = improvedTokenizer2.stop();
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test070"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    java.lang.String str4 = improvedTokenizer2.next();
    int i6 = improvedTokenizer2.start(' ');
    boolean b7 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.hasNext();
    int i9 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test071"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.matchingToken('#');
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)100);
    int i9 = improvedTokenizer2.stop();
    int i11 = improvedTokenizer2.start(' ');
    boolean b12 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test072"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken('#');
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i14 = improvedTokenizer2.start('4');
    boolean b16 = improvedTokenizer2.keepParsing((int)(byte)10);
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    boolean b18 = improvedTokenizer2.hasNext();
    int i19 = improvedTokenizer2.stop();
    boolean b20 = improvedTokenizer2.advance();
    java.lang.String str21 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test073"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('a');
    int i10 = improvedTokenizer2.beforeToken('#');
    int i12 = improvedTokenizer2.start('4');
    boolean b13 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.stop();
    boolean b16 = improvedTokenizer2.keepParsing((int)(short)0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test074"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    int i3 = improvedTokenizer2.stop();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test075"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#", "#");
    int i3 = improvedTokenizer2.stop();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test076"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test077"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken(' ');
    java.lang.String str7 = improvedTokenizer2.next();
    boolean b9 = improvedTokenizer2.keepParsing((int)(short)1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test078"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "#");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test079"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    boolean b3 = improvedTokenizer2.hasNext();
    boolean b4 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test080"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", " ");
    int i3 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.start(' ');
    int i7 = improvedTokenizer2.beforeToken('a');
    int i9 = improvedTokenizer2.start(' ');
    boolean b11 = improvedTokenizer2.keepParsing(10);
    int i13 = improvedTokenizer2.beforeToken('a');
    java.lang.String str14 = improvedTokenizer2.next();
    boolean b15 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test081"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.keepParsing(10);
    int i9 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test082"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b7 = improvedTokenizer2.advance();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    boolean b10 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test083"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "4");
    int i3 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test084"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "4");
    int i3 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test085"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    int i3 = improvedTokenizer2.stop();
    boolean b4 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b7 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test086"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#", "#");
    int i3 = improvedTokenizer2.stop();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test087"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    boolean b3 = improvedTokenizer2.hasNext();
    boolean b4 = improvedTokenizer2.hasNext();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test088"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken('#');
    boolean b13 = improvedTokenizer2.keepParsing(5);
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    int i16 = improvedTokenizer2.afterToken('4');
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    boolean b18 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i20 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test089"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "");
    boolean b3 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test090"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "a");
    boolean b4 = improvedTokenizer2.keepParsing(10);
    int i6 = improvedTokenizer2.start('4');
    boolean b7 = improvedTokenizer2.advance();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    boolean b10 = improvedTokenizer2.keepParsing(4);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test091"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    int i12 = improvedTokenizer2.start('#');
    int i14 = improvedTokenizer2.afterToken(' ');
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i17 = improvedTokenizer2.stop();
    int i18 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i20 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test092"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a ", "#");
    boolean b3 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test093"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    boolean b11 = improvedTokenizer2.hasNext();
    int i13 = improvedTokenizer2.beforeToken('a');
    int i15 = improvedTokenizer2.start(' ');
    boolean b17 = improvedTokenizer2.keepParsing((int)(short)-1);
    int i18 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i20 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test094"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.beforeToken('a');
    boolean b14 = improvedTokenizer2.keepParsing(128);
    int i16 = improvedTokenizer2.start('#');
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    int i18 = improvedTokenizer2.stop();
    int i19 = improvedTokenizer2.stop();
    boolean b21 = improvedTokenizer2.keepParsing((int)(short)10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test095"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "a ");
    int i4 = improvedTokenizer2.start(' ');
    java.lang.String str5 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test096"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.start('a');
    boolean b14 = improvedTokenizer2.advance();
    boolean b15 = improvedTokenizer2.hasNext();
    boolean b17 = improvedTokenizer2.keepParsing(100);
    java.lang.String str18 = improvedTokenizer2.previousDelimiter();
    int i19 = improvedTokenizer2.stop();
    int i20 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test097"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "a");
    boolean b4 = improvedTokenizer2.keepParsing(10);
    int i6 = improvedTokenizer2.start('4');
    boolean b7 = improvedTokenizer2.advance();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    boolean b10 = improvedTokenizer2.keepParsing(4);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test098"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "4a");
    boolean b3 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.keepParsing(128);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test099"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.start('4');
    int i15 = improvedTokenizer2.start('#');
    int i16 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test100"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "a");
    int i4 = improvedTokenizer2.start('4');
    int i6 = improvedTokenizer2.start(' ');
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i9 = improvedTokenizer2.stop();
    int i10 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test101"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i4 = improvedTokenizer2.stop();
    boolean b5 = improvedTokenizer2.advance();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)-1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test102"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('#');
    int i8 = improvedTokenizer2.matchingToken('a');
    int i9 = improvedTokenizer2.stop();
    java.lang.String str10 = improvedTokenizer2.next();
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test103"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", " ");
    int i3 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.start(' ');
    int i7 = improvedTokenizer2.beforeToken('a');
    int i9 = improvedTokenizer2.beforeToken(' ');
    java.lang.String str10 = improvedTokenizer2.next();
    boolean b11 = improvedTokenizer2.hasNext();
    int i13 = improvedTokenizer2.start('4');
    int i14 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test104"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "a");
    boolean b3 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test105"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    int i3 = improvedTokenizer2.stop();
    boolean b4 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b7 = improvedTokenizer2.advance();
    int i9 = improvedTokenizer2.start('4');
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    boolean b11 = improvedTokenizer2.advance();
    int i12 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test106"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.afterToken(' ');
    boolean b15 = improvedTokenizer2.keepParsing((int)(byte)10);
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    int i17 = improvedTokenizer2.stop();
    boolean b18 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i20 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test107"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "4 ");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test108"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#", "");
    boolean b3 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test109"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.matchingToken('4');
    boolean b11 = improvedTokenizer2.keepParsing(0);
    int i12 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test110"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "a");
    boolean b4 = improvedTokenizer2.keepParsing(10);
    int i6 = improvedTokenizer2.start('4');
    boolean b7 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test111"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "");
    boolean b3 = improvedTokenizer2.hasNext();
    boolean b4 = improvedTokenizer2.hasNext();
    java.lang.String str5 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test112"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.matchingToken('#');
    int i8 = improvedTokenizer2.start('#');
    java.lang.String str9 = improvedTokenizer2.next();
    boolean b11 = improvedTokenizer2.keepParsing((int)(byte)0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test113"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.matchingToken('#');
    int i8 = improvedTokenizer2.start('#');
    int i9 = improvedTokenizer2.stop();
    boolean b10 = improvedTokenizer2.advance();
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test114"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)1);
    boolean b9 = improvedTokenizer2.advance();
    int i10 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test115"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "a ");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test116"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    int i12 = improvedTokenizer2.start('#');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)10);
    boolean b16 = improvedTokenizer2.keepParsing((int)' ');
    boolean b17 = improvedTokenizer2.advance();
    java.lang.String str18 = improvedTokenizer2.previousDelimiter();
    int i20 = improvedTokenizer2.start('a');
    int i21 = improvedTokenizer2.stop();
    boolean b22 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i24 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test117"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken(' ');
    int i13 = improvedTokenizer2.beforeToken(' ');
    boolean b15 = improvedTokenizer2.keepParsing(5);
    int i17 = improvedTokenizer2.afterToken('a');
    boolean b19 = improvedTokenizer2.keepParsing((int)(short)0);
    int i21 = improvedTokenizer2.matchingToken(' ');
    boolean b22 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i24 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test118"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken('#');
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i14 = improvedTokenizer2.matchingToken('4');
    int i15 = improvedTokenizer2.stop();
    boolean b17 = improvedTokenizer2.keepParsing((int)(short)10);
    int i18 = improvedTokenizer2.stop();
    java.lang.String str19 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test119"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.start('a');
    int i15 = improvedTokenizer2.beforeToken('4');
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    boolean b17 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test120"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "a");
    int i4 = improvedTokenizer2.start('4');
    int i6 = improvedTokenizer2.beforeToken('a');
    boolean b7 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test121"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.matchingToken('a');
    int i15 = improvedTokenizer2.start('#');
    boolean b16 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test122"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.afterToken(' ');
    int i14 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.hasNext();
    boolean b17 = improvedTokenizer2.keepParsing(5);
    boolean b19 = improvedTokenizer2.keepParsing((int)(short)-1);
    boolean b21 = improvedTokenizer2.keepParsing((int)' ');
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test123"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test124"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#a", "#a");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test125"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a#", "4a");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test126"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    int i3 = improvedTokenizer2.stop();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test127"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.beforeToken('a');
    boolean b14 = improvedTokenizer2.keepParsing(128);
    int i16 = improvedTokenizer2.start('#');
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    int i18 = improvedTokenizer2.stop();
    boolean b20 = improvedTokenizer2.keepParsing((int)(byte)-1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test128"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    int i6 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test129"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "a ");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test130"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a#", " ");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test131"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.afterToken(' ');
    int i14 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.hasNext();
    boolean b17 = improvedTokenizer2.keepParsing((int)' ');
    int i18 = improvedTokenizer2.stop();
    boolean b20 = improvedTokenizer2.keepParsing((-1));
    java.lang.String str21 = improvedTokenizer2.previousDelimiter();
    int i23 = improvedTokenizer2.start('a');
    int i25 = improvedTokenizer2.beforeToken('4');
    int i26 = improvedTokenizer2.stop();
    java.lang.String str27 = improvedTokenizer2.previousDelimiter();
    boolean b28 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i30 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test132"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken('#');
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i14 = improvedTokenizer2.start('4');
    int i16 = improvedTokenizer2.matchingToken(' ');
    boolean b17 = improvedTokenizer2.advance();
    boolean b18 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i20 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test133"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i5 = improvedTokenizer2.start(' ');
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.keepParsing((int)'#');
    boolean b9 = improvedTokenizer2.advance();
    boolean b10 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test134"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.matchingToken('#');
    boolean b7 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test135"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "");
    java.lang.String str3 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test136"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken('#');
    boolean b13 = improvedTokenizer2.keepParsing(5);
    int i14 = improvedTokenizer2.stop();
    int i16 = improvedTokenizer2.start(' ');
    int i18 = improvedTokenizer2.afterToken('#');
    int i19 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test137"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('a');
    int i9 = improvedTokenizer2.stop();
    boolean b10 = improvedTokenizer2.advance();
    boolean b12 = improvedTokenizer2.keepParsing((int)(short)10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test138"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)1);
    boolean b9 = improvedTokenizer2.advance();
    int i10 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test139"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "a#");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test140"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a ", "4");
    boolean b4 = improvedTokenizer2.keepParsing(10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test141"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    int i12 = improvedTokenizer2.start('#');
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    boolean b15 = improvedTokenizer2.keepParsing((int)(short)-1);
    int i17 = improvedTokenizer2.start('4');
    int i19 = improvedTokenizer2.start('4');
    int i21 = improvedTokenizer2.start('#');
    boolean b22 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i24 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test142"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "a");
    boolean b4 = improvedTokenizer2.keepParsing(10);
    int i6 = improvedTokenizer2.start('4');
    int i8 = improvedTokenizer2.beforeToken('a');
    java.lang.String str9 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test143"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test144"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.hasNext();
    boolean b9 = improvedTokenizer2.advance();
    int i11 = improvedTokenizer2.start('a');
    int i12 = improvedTokenizer2.stop();
    int i13 = improvedTokenizer2.stop();
    int i14 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test145"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a ", "a#");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test146"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.matchingToken('#');
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)-1);
    int i11 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test147"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "");
    boolean b3 = improvedTokenizer2.hasNext();
    boolean b4 = improvedTokenizer2.hasNext();
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test148"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b6 = improvedTokenizer2.keepParsing(1);
    int i8 = improvedTokenizer2.start('a');
    boolean b10 = improvedTokenizer2.keepParsing((int)(byte)-1);
    boolean b11 = improvedTokenizer2.advance();
    boolean b13 = improvedTokenizer2.keepParsing(3);
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test149"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.beforeToken('a');
    int i14 = improvedTokenizer2.start('#');
    boolean b15 = improvedTokenizer2.advance();
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    boolean b17 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test150"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.advance();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test151"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    boolean b3 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test152"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    int i12 = improvedTokenizer2.start('#');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)10);
    boolean b16 = improvedTokenizer2.keepParsing((int)' ');
    boolean b17 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test153"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.afterToken(' ');
    int i14 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.hasNext();
    boolean b17 = improvedTokenizer2.keepParsing((int)' ');
    int i18 = improvedTokenizer2.stop();
    boolean b19 = improvedTokenizer2.advance();
    java.lang.String str20 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test154"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.afterToken(' ');
    int i14 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.hasNext();
    boolean b17 = improvedTokenizer2.keepParsing((int)' ');
    int i18 = improvedTokenizer2.stop();
    boolean b20 = improvedTokenizer2.keepParsing((-1));
    java.lang.String str21 = improvedTokenizer2.previousDelimiter();
    int i23 = improvedTokenizer2.start('a');
    int i25 = improvedTokenizer2.beforeToken('4');
    boolean b26 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i28 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test155"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "4");
    boolean b3 = improvedTokenizer2.hasNext();
    java.lang.String str4 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test156"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i8 = improvedTokenizer2.stop();
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test157"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    int i3 = improvedTokenizer2.stop();
    boolean b4 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)-1);
    boolean b9 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test158"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test159"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a ", "4a");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test160"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b6 = improvedTokenizer2.keepParsing(1);
    boolean b8 = improvedTokenizer2.keepParsing(1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test161"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#", "#");
    int i3 = improvedTokenizer2.stop();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test162"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    int i3 = improvedTokenizer2.stop();
    boolean b4 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)-1);
    int i10 = improvedTokenizer2.start(' ');
    int i12 = improvedTokenizer2.start(' ');
    int i14 = improvedTokenizer2.start('4');
    int i16 = improvedTokenizer2.matchingToken(' ');
    boolean b17 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test163"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "4");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test164"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.matchingToken('#');
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)100);
    java.lang.String str9 = improvedTokenizer2.next();
    int i11 = improvedTokenizer2.start('#');
    boolean b12 = improvedTokenizer2.hasNext();
    boolean b13 = improvedTokenizer2.hasNext();
    boolean b14 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test165"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('a');
    int i10 = improvedTokenizer2.beforeToken('#');
    int i12 = improvedTokenizer2.matchingToken('a');
    int i14 = improvedTokenizer2.matchingToken('a');
    int i16 = improvedTokenizer2.matchingToken('a');
    int i17 = improvedTokenizer2.stop();
    java.lang.String str18 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i20 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test166"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('a');
    int i9 = improvedTokenizer2.stop();
    boolean b10 = improvedTokenizer2.hasNext();
    int i11 = improvedTokenizer2.stop();
    boolean b12 = improvedTokenizer2.hasNext();
    boolean b13 = improvedTokenizer2.hasNext();
    boolean b15 = improvedTokenizer2.keepParsing((int)(byte)-1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test167"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('a');
    int i10 = improvedTokenizer2.beforeToken('#');
    int i12 = improvedTokenizer2.matchingToken('a');
    int i13 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test168"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.stop();
    int i13 = improvedTokenizer2.stop();
    int i14 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test169"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    int i3 = improvedTokenizer2.stop();
    boolean b4 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)-1);
    boolean b10 = improvedTokenizer2.keepParsing((int)' ');
    boolean b12 = improvedTokenizer2.keepParsing(128);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test170"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.matchingToken('#');
    int i8 = improvedTokenizer2.start('#');
    java.lang.String str9 = improvedTokenizer2.next();
    boolean b11 = improvedTokenizer2.keepParsing((int)(byte)0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test171"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "a");
    boolean b4 = improvedTokenizer2.keepParsing(10);
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    java.lang.String str6 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test172"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    boolean b3 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.start('4');
    boolean b6 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.hasNext();
    boolean b9 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test173"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    int i12 = improvedTokenizer2.start('#');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)10);
    boolean b16 = improvedTokenizer2.keepParsing((int)' ');
    boolean b17 = improvedTokenizer2.advance();
    java.lang.String str18 = improvedTokenizer2.previousDelimiter();
    int i20 = improvedTokenizer2.start('a');
    boolean b21 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test174"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('#');
    int i8 = improvedTokenizer2.matchingToken('a');
    boolean b9 = improvedTokenizer2.hasNext();
    boolean b10 = improvedTokenizer2.hasNext();
    boolean b11 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test175"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.afterToken(' ');
    int i14 = improvedTokenizer2.stop();
    int i15 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test176"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.start('a');
    boolean b14 = improvedTokenizer2.hasNext();
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i17 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test177"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('a');
    int i10 = improvedTokenizer2.beforeToken('#');
    int i12 = improvedTokenizer2.matchingToken('a');
    int i14 = improvedTokenizer2.matchingToken('a');
    int i16 = improvedTokenizer2.matchingToken('a');
    boolean b18 = improvedTokenizer2.keepParsing((int)(byte)-1);
    int i19 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test178"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    boolean b5 = improvedTokenizer2.hasNext();
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.start('#');
    int i10 = improvedTokenizer2.afterToken('4');
    boolean b11 = improvedTokenizer2.advance();
    int i12 = improvedTokenizer2.stop();
    boolean b13 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test179"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.matchingToken('4');
    boolean b11 = improvedTokenizer2.keepParsing(0);
    int i12 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test180"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.afterToken(' ');
    boolean b15 = improvedTokenizer2.keepParsing((int)(byte)10);
    int i16 = improvedTokenizer2.stop();
    int i18 = improvedTokenizer2.start('4');
    int i20 = improvedTokenizer2.start('a');
    boolean b21 = improvedTokenizer2.hasNext();
    int i23 = improvedTokenizer2.matchingToken('4');
    boolean b24 = improvedTokenizer2.advance();
    boolean b25 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i27 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test181"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "4");
    boolean b3 = improvedTokenizer2.advance();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test182"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('a');
    int i10 = improvedTokenizer2.beforeToken('#');
    int i12 = improvedTokenizer2.start('4');
    boolean b13 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.stop();
    int i15 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test183"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    int i6 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test184"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken(' ');
    int i13 = improvedTokenizer2.beforeToken(' ');
    int i15 = improvedTokenizer2.matchingToken('a');
    int i16 = improvedTokenizer2.stop();
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test185"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "#");
    java.lang.String str3 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test186"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    boolean b6 = improvedTokenizer2.advance();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test187"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken('#');
    boolean b13 = improvedTokenizer2.keepParsing(5);
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    int i16 = improvedTokenizer2.afterToken('4');
    int i18 = improvedTokenizer2.beforeToken('a');
    int i19 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test188"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken('#');
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i14 = improvedTokenizer2.matchingToken('4');
    int i15 = improvedTokenizer2.stop();
    boolean b17 = improvedTokenizer2.keepParsing((int)(short)10);
    int i18 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i20 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test189"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    java.lang.String str4 = improvedTokenizer2.next();
    int i6 = improvedTokenizer2.start(' ');
    boolean b7 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.afterToken('4');
    boolean b11 = improvedTokenizer2.advance();
    boolean b12 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test190"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4a", "a#");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test191"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "4aa");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test192"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", " ");
    int i3 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.start(' ');
    int i7 = improvedTokenizer2.beforeToken('a');
    int i9 = improvedTokenizer2.beforeToken(' ');
    java.lang.String str10 = improvedTokenizer2.next();
    boolean b11 = improvedTokenizer2.hasNext();
    int i13 = improvedTokenizer2.start('4');
    int i14 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test193"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", " ");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(100);
    boolean b7 = improvedTokenizer2.keepParsing(2);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test194"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", "#");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)-1);
    java.lang.String str5 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test195"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", " ");
    java.lang.String str3 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test196"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken(' ');
    int i13 = improvedTokenizer2.beforeToken(' ');
    boolean b15 = improvedTokenizer2.keepParsing(5);
    int i17 = improvedTokenizer2.afterToken('a');
    boolean b19 = improvedTokenizer2.keepParsing(100);
    int i21 = improvedTokenizer2.beforeToken('4');
    int i22 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i24 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test197"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", " ");
    int i3 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.start(' ');
    int i7 = improvedTokenizer2.beforeToken('a');
    boolean b8 = improvedTokenizer2.hasNext();
    boolean b9 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test198"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken('#');
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i14 = improvedTokenizer2.start('4');
    int i16 = improvedTokenizer2.matchingToken(' ');
    boolean b17 = improvedTokenizer2.hasNext();
    int i18 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i20 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test199"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#a", "hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test200"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(short)100);
    boolean b5 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test201"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.stop();
    int i9 = improvedTokenizer2.start('a');
    int i11 = improvedTokenizer2.matchingToken('a');
    int i13 = improvedTokenizer2.beforeToken('a');
    boolean b14 = improvedTokenizer2.advance();
    boolean b16 = improvedTokenizer2.keepParsing((int)'4');
    boolean b17 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test202"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    boolean b11 = improvedTokenizer2.hasNext();
    boolean b12 = improvedTokenizer2.advance();
    int i13 = improvedTokenizer2.stop();
    boolean b14 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test203"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken('#');
    boolean b13 = improvedTokenizer2.keepParsing(5);
    int i14 = improvedTokenizer2.stop();
    int i16 = improvedTokenizer2.start(' ');
    int i18 = improvedTokenizer2.afterToken('a');
    boolean b19 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test204"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a#", "");
    boolean b4 = improvedTokenizer2.keepParsing(128);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test205"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    java.lang.String str5 = improvedTokenizer2.next();
    int i6 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test206"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.afterToken(' ');
    int i14 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.hasNext();
    boolean b17 = improvedTokenizer2.keepParsing((int)' ');
    int i18 = improvedTokenizer2.stop();
    boolean b20 = improvedTokenizer2.keepParsing((-1));
    java.lang.String str21 = improvedTokenizer2.previousDelimiter();
    int i23 = improvedTokenizer2.start('a');
    int i25 = improvedTokenizer2.beforeToken('4');
    int i26 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i28 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test207"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('#');
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.afterToken('a');
    int i16 = improvedTokenizer2.start('4');
    int i18 = improvedTokenizer2.matchingToken('#');
    java.lang.String str19 = improvedTokenizer2.previousDelimiter();
    int i20 = improvedTokenizer2.stop();
    java.lang.String str21 = improvedTokenizer2.previousDelimiter();
    java.lang.String str22 = improvedTokenizer2.previousDelimiter();
    java.lang.String str23 = improvedTokenizer2.previousDelimiter();
    int i24 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test208"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('a');
    int i9 = improvedTokenizer2.stop();
    boolean b10 = improvedTokenizer2.advance();
    int i11 = improvedTokenizer2.stop();
    int i12 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test209"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)1);
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test210"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)-1);
    int i8 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test211"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.start('4');
    int i9 = improvedTokenizer2.matchingToken('a');
    int i11 = improvedTokenizer2.afterToken('a');
    int i13 = improvedTokenizer2.start('#');
    int i14 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test212"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    int i3 = improvedTokenizer2.stop();
    boolean b4 = improvedTokenizer2.advance();
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.keepParsing(3);
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    boolean b11 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test213"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.start('a');
    boolean b14 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test214"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken(' ');
    int i13 = improvedTokenizer2.beforeToken(' ');
    boolean b14 = improvedTokenizer2.hasNext();
    boolean b15 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test215"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", " ");
    int i3 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.start(' ');
    int i7 = improvedTokenizer2.beforeToken('a');
    boolean b8 = improvedTokenizer2.hasNext();
    int i9 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test216"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "a");
    int i3 = improvedTokenizer2.stop();
    int i4 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test217"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#", "#");
    int i3 = improvedTokenizer2.stop();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test218"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('a');
    int i10 = improvedTokenizer2.beforeToken('#');
    int i12 = improvedTokenizer2.start('4');
    boolean b13 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.stop();
    boolean b16 = improvedTokenizer2.keepParsing((int)(short)0);
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test219"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", "");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.start('a');
    int i8 = improvedTokenizer2.start('a');
    boolean b9 = improvedTokenizer2.advance();
    java.lang.String str10 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test220"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('#');
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.afterToken('a');
    int i16 = improvedTokenizer2.start('4');
    int i18 = improvedTokenizer2.matchingToken('#');
    java.lang.String str19 = improvedTokenizer2.previousDelimiter();
    int i20 = improvedTokenizer2.stop();
    java.lang.String str21 = improvedTokenizer2.previousDelimiter();
    java.lang.String str22 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i24 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test221"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "a ");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('#');
    int i7 = improvedTokenizer2.afterToken('#');
    int i9 = improvedTokenizer2.beforeToken('a');
    boolean b10 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test222"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    int i10 = improvedTokenizer2.start('#');
    int i11 = improvedTokenizer2.stop();
    boolean b13 = improvedTokenizer2.keepParsing((int)(short)10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test223"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "4");
    int i3 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test224"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.start('a');
    boolean b14 = improvedTokenizer2.hasNext();
    boolean b15 = improvedTokenizer2.advance();
    boolean b17 = improvedTokenizer2.keepParsing(2);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test225"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", " ");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test226"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a ", "#");
    boolean b3 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test227"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.matchingToken('4');
    boolean b11 = improvedTokenizer2.keepParsing(0);
    int i12 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test228"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.stop();
    int i9 = improvedTokenizer2.start('#');
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    int i12 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test229"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", " ");
    int i3 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.start(' ');
    int i7 = improvedTokenizer2.beforeToken('a');
    int i9 = improvedTokenizer2.beforeToken(' ');
    java.lang.String str10 = improvedTokenizer2.next();
    boolean b11 = improvedTokenizer2.hasNext();
    int i13 = improvedTokenizer2.start('4');
    int i14 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.advance();
    boolean b16 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test230"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "4");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start('a');
    java.lang.String str8 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test231"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.stop();
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test232"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    boolean b11 = improvedTokenizer2.hasNext();
    int i13 = improvedTokenizer2.beforeToken('a');
    int i15 = improvedTokenizer2.start(' ');
    int i17 = improvedTokenizer2.start('#');
    java.lang.String str18 = improvedTokenizer2.previousDelimiter();
    int i20 = improvedTokenizer2.matchingToken('a');
    int i22 = improvedTokenizer2.beforeToken(' ');
    int i24 = improvedTokenizer2.beforeToken(' ');
    int i25 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i27 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test233"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "a");
    boolean b4 = improvedTokenizer2.keepParsing((int)' ');
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test234"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.stop();
    int i9 = improvedTokenizer2.start('a');
    int i11 = improvedTokenizer2.matchingToken('a');
    boolean b13 = improvedTokenizer2.keepParsing((int)'#');
    boolean b14 = improvedTokenizer2.hasNext();
    int i16 = improvedTokenizer2.matchingToken('a');
    boolean b17 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test235"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "4");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test236"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b6 = improvedTokenizer2.keepParsing(1);
    boolean b8 = improvedTokenizer2.keepParsing(1);
    int i10 = improvedTokenizer2.start(' ');
    boolean b11 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test237"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.start('a');
    boolean b14 = improvedTokenizer2.hasNext();
    boolean b15 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test238"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken('#');
    boolean b13 = improvedTokenizer2.keepParsing(5);
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    int i16 = improvedTokenizer2.afterToken('4');
    boolean b17 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test239"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    boolean b3 = improvedTokenizer2.advance();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test240"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    int i3 = improvedTokenizer2.stop();
    boolean b4 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)-1);
    boolean b9 = improvedTokenizer2.hasNext();
    boolean b10 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test241"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    int i3 = improvedTokenizer2.stop();
    boolean b4 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)-1);
    boolean b10 = improvedTokenizer2.keepParsing((int)' ');
    boolean b12 = improvedTokenizer2.keepParsing(128);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test242"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.matchingToken('#');
    boolean b8 = improvedTokenizer2.keepParsing(0);
    int i10 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.stop();
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    boolean b14 = improvedTokenizer2.keepParsing(128);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test243"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    boolean b11 = improvedTokenizer2.hasNext();
    int i13 = improvedTokenizer2.beforeToken('a');
    int i15 = improvedTokenizer2.start(' ');
    int i17 = improvedTokenizer2.start('#');
    boolean b19 = improvedTokenizer2.keepParsing(4);
    int i20 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test244"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.hasNext();
    boolean b9 = improvedTokenizer2.advance();
    boolean b10 = improvedTokenizer2.advance();
    boolean b11 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test245"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.beforeToken('a');
    boolean b14 = improvedTokenizer2.keepParsing(128);
    int i16 = improvedTokenizer2.start('#');
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    int i18 = improvedTokenizer2.stop();
    boolean b20 = improvedTokenizer2.keepParsing((int)(byte)-1);
    boolean b21 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test246"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    int i12 = improvedTokenizer2.start('#');
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    int i15 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test247"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a#", "#a");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test248"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", " ");
    boolean b3 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.keepParsing(100);
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('a');
    boolean b9 = improvedTokenizer2.advance();
    int i10 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test249"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    boolean b11 = improvedTokenizer2.hasNext();
    int i13 = improvedTokenizer2.beforeToken('a');
    int i15 = improvedTokenizer2.start(' ');
    int i17 = improvedTokenizer2.start('#');
    java.lang.String str18 = improvedTokenizer2.previousDelimiter();
    boolean b19 = improvedTokenizer2.hasNext();
    int i20 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test250"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('#');
    java.lang.String str7 = improvedTokenizer2.next();
    boolean b9 = improvedTokenizer2.keepParsing(5);
    boolean b10 = improvedTokenizer2.advance();
    boolean b12 = improvedTokenizer2.keepParsing(2);
    boolean b13 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test251"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4a", "4");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b4 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test252"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "a");
    boolean b4 = improvedTokenizer2.keepParsing(10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test253"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    int i3 = improvedTokenizer2.stop();
    boolean b4 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)-1);
    boolean b9 = improvedTokenizer2.hasNext();
    boolean b10 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test254"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b7 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test255"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken(' ');
    int i13 = improvedTokenizer2.beforeToken(' ');
    boolean b15 = improvedTokenizer2.keepParsing(5);
    int i17 = improvedTokenizer2.afterToken('a');
    boolean b19 = improvedTokenizer2.keepParsing((int)(short)0);
    int i21 = improvedTokenizer2.matchingToken(' ');
    int i23 = improvedTokenizer2.start('a');
    int i25 = improvedTokenizer2.start('a');
    boolean b26 = improvedTokenizer2.advance();
    int i27 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i29 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test256"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    int i3 = improvedTokenizer2.stop();
    boolean b4 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)-1);
    int i9 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test257"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a ", "#");
    int i4 = improvedTokenizer2.start('4');
    boolean b5 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test258"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a ", "4");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i4 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test259"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.beforeToken('a');
    int i13 = improvedTokenizer2.afterToken('a');
    int i15 = improvedTokenizer2.beforeToken('#');
    int i17 = improvedTokenizer2.start('a');
    int i18 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i20 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test260"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    boolean b3 = improvedTokenizer2.hasNext();
    boolean b4 = improvedTokenizer2.hasNext();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test261"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "a#");
    int i3 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test262"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.afterToken(' ');
    int i14 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.hasNext();
    boolean b17 = improvedTokenizer2.keepParsing((int)' ');
    int i18 = improvedTokenizer2.stop();
    boolean b19 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test263"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.stop();
    int i9 = improvedTokenizer2.start('a');
    int i11 = improvedTokenizer2.matchingToken('a');
    boolean b13 = improvedTokenizer2.keepParsing((int)'#');
    boolean b14 = improvedTokenizer2.hasNext();
    int i16 = improvedTokenizer2.start('a');
    int i18 = improvedTokenizer2.matchingToken(' ');
    int i19 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test264"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('#');
    boolean b12 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.afterToken('a');
    int i16 = improvedTokenizer2.start('4');
    int i18 = improvedTokenizer2.matchingToken('#');
    int i19 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test265"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.matchingToken('#');
    int i8 = improvedTokenizer2.start('#');
    int i9 = improvedTokenizer2.stop();
    int i11 = improvedTokenizer2.start('a');
    int i13 = improvedTokenizer2.afterToken(' ');
    boolean b14 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test266"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('#');
    int i8 = improvedTokenizer2.beforeToken('a');
    int i9 = improvedTokenizer2.stop();
    int i11 = improvedTokenizer2.start('4');
    java.lang.String str12 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test267"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test268"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.afterToken(' ');
    int i14 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.hasNext();
    boolean b17 = improvedTokenizer2.keepParsing(5);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test269"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    boolean b6 = improvedTokenizer2.advance();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.stop();
    boolean b11 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test270"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('a');
    int i10 = improvedTokenizer2.beforeToken('#');
    int i12 = improvedTokenizer2.start('4');
    boolean b13 = improvedTokenizer2.hasNext();
    int i14 = improvedTokenizer2.stop();
    int i15 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test271"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a ", "a");
    boolean b4 = improvedTokenizer2.keepParsing(100);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test272"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    boolean b11 = improvedTokenizer2.hasNext();
    int i13 = improvedTokenizer2.beforeToken('a');
    int i15 = improvedTokenizer2.afterToken(' ');
    boolean b16 = improvedTokenizer2.advance();
    boolean b18 = improvedTokenizer2.keepParsing(3);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i20 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test273"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    boolean b13 = improvedTokenizer2.hasNext();
    int i15 = improvedTokenizer2.afterToken('a');
    boolean b16 = improvedTokenizer2.advance();
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    boolean b18 = improvedTokenizer2.hasNext();
    boolean b19 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test274"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    int i10 = improvedTokenizer2.start('#');
    boolean b11 = improvedTokenizer2.hasNext();
    int i13 = improvedTokenizer2.beforeToken('4');
    int i15 = improvedTokenizer2.beforeToken(' ');
    int i16 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test275"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", " ");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)10);
    int i6 = improvedTokenizer2.start(' ');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test276"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.matchingToken(' ');
    int i16 = improvedTokenizer2.afterToken('a');
    boolean b18 = improvedTokenizer2.keepParsing(10);
    int i19 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test277"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#a", "a ");
    boolean b4 = improvedTokenizer2.keepParsing((int)'#');
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test278"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#", "");
    boolean b3 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test279"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    boolean b3 = improvedTokenizer2.advance();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test280"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "a#");
    boolean b3 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test281"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.start('a');
    boolean b14 = improvedTokenizer2.advance();
    int i15 = improvedTokenizer2.stop();
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    boolean b17 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test282"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "#");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test283"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.afterToken(' ');
    int i14 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.hasNext();
    boolean b17 = improvedTokenizer2.keepParsing(5);
    boolean b19 = improvedTokenizer2.keepParsing((int)(short)-1);
    boolean b21 = improvedTokenizer2.keepParsing((int)' ');
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test284"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    int i3 = improvedTokenizer2.stop();
    boolean b4 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)-1);
    boolean b10 = improvedTokenizer2.keepParsing((int)' ');
    boolean b12 = improvedTokenizer2.keepParsing(128);
    boolean b13 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test285"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.start('4');
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.advance();
    int i10 = improvedTokenizer2.stop();
    boolean b11 = improvedTokenizer2.hasNext();
    int i12 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test286"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.afterToken(' ');
    boolean b15 = improvedTokenizer2.keepParsing((int)(byte)10);
    int i16 = improvedTokenizer2.stop();
    int i18 = improvedTokenizer2.start('4');
    int i20 = improvedTokenizer2.start('a');
    int i22 = improvedTokenizer2.matchingToken(' ');
    boolean b23 = improvedTokenizer2.hasNext();
    boolean b25 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i26 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i28 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test287"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "a");
    int i3 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.start('4');
    boolean b7 = improvedTokenizer2.keepParsing(5);
    java.lang.String str8 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test288"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    boolean b12 = improvedTokenizer2.hasNext();
    int i13 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test289"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken('#');
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i14 = improvedTokenizer2.start('4');
    int i16 = improvedTokenizer2.matchingToken(' ');
    boolean b17 = improvedTokenizer2.advance();
    boolean b18 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i20 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test290"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.matchingToken('4');
    int i11 = improvedTokenizer2.afterToken('a');
    boolean b12 = improvedTokenizer2.advance();
    boolean b13 = improvedTokenizer2.hasNext();
    boolean b15 = improvedTokenizer2.keepParsing(0);
    int i17 = improvedTokenizer2.start('a');
    int i18 = improvedTokenizer2.stop();
    java.lang.String str19 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test291"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken('#');
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i14 = improvedTokenizer2.start('4');
    boolean b16 = improvedTokenizer2.keepParsing((int)(byte)10);
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    boolean b18 = improvedTokenizer2.hasNext();
    int i19 = improvedTokenizer2.stop();
    boolean b21 = improvedTokenizer2.keepParsing((int)'#');
    int i22 = improvedTokenizer2.stop();
    int i23 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i25 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test292"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('a');
    int i9 = improvedTokenizer2.stop();
    int i11 = improvedTokenizer2.start('a');
    boolean b12 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test293"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken('#');
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i14 = improvedTokenizer2.matchingToken('4');
    boolean b16 = improvedTokenizer2.keepParsing((int)(byte)10);
    boolean b17 = improvedTokenizer2.advance();
    java.lang.String str18 = improvedTokenizer2.previousDelimiter();
    boolean b19 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test294"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.matchingToken('#');
    int i8 = improvedTokenizer2.start('#');
    java.lang.String str9 = improvedTokenizer2.next();
    boolean b11 = improvedTokenizer2.keepParsing((int)(byte)0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test295"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", " ");
    boolean b3 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.keepParsing(100);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test296"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i5 = improvedTokenizer2.start(' ');
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.keepParsing((int)'#');
    boolean b9 = improvedTokenizer2.advance();
    boolean b10 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test297"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    int i3 = improvedTokenizer2.stop();
    boolean b4 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)-1);
    boolean b10 = improvedTokenizer2.keepParsing((int)' ');
    boolean b11 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test298"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test299"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(2);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test300"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    int i3 = improvedTokenizer2.stop();
    boolean b4 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)-1);
    boolean b10 = improvedTokenizer2.keepParsing((int)' ');
    boolean b11 = improvedTokenizer2.advance();
    boolean b13 = improvedTokenizer2.keepParsing((int)(byte)-1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test301"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken('#');
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i14 = improvedTokenizer2.matchingToken('4');
    int i15 = improvedTokenizer2.stop();
    boolean b17 = improvedTokenizer2.keepParsing((int)(short)10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test302"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.afterToken(' ');
    int i14 = improvedTokenizer2.stop();
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    int i16 = improvedTokenizer2.stop();
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test303"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#", "");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test304"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken('#');
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i14 = improvedTokenizer2.start('4');
    boolean b16 = improvedTokenizer2.keepParsing((int)(byte)10);
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    boolean b18 = improvedTokenizer2.hasNext();
    int i19 = improvedTokenizer2.stop();
    int i20 = improvedTokenizer2.stop();
    boolean b21 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test305"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.start('a');
    boolean b14 = improvedTokenizer2.hasNext();
    int i16 = improvedTokenizer2.matchingToken(' ');
    boolean b17 = improvedTokenizer2.hasNext();
    int i18 = improvedTokenizer2.stop();
    int i19 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test306"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4a", "a#");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test307"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.matchingToken('#');
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)100);
    java.lang.String str9 = improvedTokenizer2.next();
    boolean b11 = improvedTokenizer2.keepParsing(128);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test308"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a#", "");
    java.lang.String str3 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test309"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    int i6 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test310"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.afterToken(' ');
    int i14 = improvedTokenizer2.stop();
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    boolean b17 = improvedTokenizer2.keepParsing(0);
    boolean b18 = improvedTokenizer2.hasNext();
    java.lang.String str19 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test311"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b6 = improvedTokenizer2.keepParsing(1);
    boolean b8 = improvedTokenizer2.keepParsing(1);
    boolean b10 = improvedTokenizer2.keepParsing(1);
    int i12 = improvedTokenizer2.start('#');
    int i14 = improvedTokenizer2.beforeToken('a');
    java.lang.String str15 = improvedTokenizer2.next();
    int i16 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test312"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.beforeToken('a');
    boolean b14 = improvedTokenizer2.keepParsing(128);
    int i16 = improvedTokenizer2.start('#');
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    int i18 = improvedTokenizer2.stop();
    int i19 = improvedTokenizer2.stop();
    boolean b21 = improvedTokenizer2.keepParsing((int)(short)10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test313"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "a");
    boolean b4 = improvedTokenizer2.keepParsing(10);
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test314"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.stop();
    int i9 = improvedTokenizer2.start('a');
    int i11 = improvedTokenizer2.afterToken('a');
    int i12 = improvedTokenizer2.stop();
    boolean b13 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test315"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "4a");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test316"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "4a");
    boolean b3 = improvedTokenizer2.hasNext();
    java.lang.String str4 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test317"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('a');
    int i10 = improvedTokenizer2.beforeToken('#');
    int i12 = improvedTokenizer2.matchingToken('a');
    int i13 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.keepParsing((int)'4');
    boolean b16 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test318"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    boolean b5 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test319"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.matchingToken('4');
    boolean b11 = improvedTokenizer2.keepParsing(0);
    boolean b13 = improvedTokenizer2.keepParsing(128);
    int i15 = improvedTokenizer2.matchingToken('#');
    boolean b16 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test320"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", " ");
    java.lang.String str3 = improvedTokenizer2.next();
    int i4 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test321"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.afterToken(' ');
    int i14 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.hasNext();
    boolean b17 = improvedTokenizer2.keepParsing((int)' ');
    int i18 = improvedTokenizer2.stop();
    boolean b20 = improvedTokenizer2.keepParsing((-1));
    java.lang.String str21 = improvedTokenizer2.previousDelimiter();
    int i23 = improvedTokenizer2.start('a');
    int i25 = improvedTokenizer2.beforeToken('4');
    int i26 = improvedTokenizer2.stop();
    java.lang.String str27 = improvedTokenizer2.previousDelimiter();
    boolean b28 = improvedTokenizer2.hasNext();
    boolean b30 = improvedTokenizer2.keepParsing(2);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i32 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test322"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "a#");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test323"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken(' ');
    boolean b12 = improvedTokenizer2.advance();
    boolean b13 = improvedTokenizer2.hasNext();
    boolean b14 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test324"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b6 = improvedTokenizer2.keepParsing(1);
    boolean b7 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.stop();
    boolean b9 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test325"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.afterToken(' ');
    int i14 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.hasNext();
    boolean b17 = improvedTokenizer2.keepParsing((int)' ');
    boolean b19 = improvedTokenizer2.keepParsing((int)(byte)100);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test326"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", "a#");
    int i3 = improvedTokenizer2.stop();
    boolean b4 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test327"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", " ");
    int i3 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.start(' ');
    int i7 = improvedTokenizer2.beforeToken('a');
    int i9 = improvedTokenizer2.start(' ');
    boolean b11 = improvedTokenizer2.keepParsing(10);
    int i13 = improvedTokenizer2.beforeToken('a');
    java.lang.String str14 = improvedTokenizer2.next();
    boolean b15 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test328"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.matchingToken('a');
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    int i16 = improvedTokenizer2.matchingToken('a');
    int i18 = improvedTokenizer2.beforeToken('#');
    boolean b19 = improvedTokenizer2.hasNext();
    java.lang.String str20 = improvedTokenizer2.previousDelimiter();
    boolean b21 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test329"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken(' ');
    int i12 = improvedTokenizer2.stop();
    int i13 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test330"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    boolean b3 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.start('4');
    boolean b6 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.keepParsing(10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test331"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b4 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test332"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken(' ');
    int i13 = improvedTokenizer2.afterToken('a');
    int i15 = improvedTokenizer2.afterToken('a');
    boolean b17 = improvedTokenizer2.keepParsing((int)(short)0);
    int i19 = improvedTokenizer2.matchingToken('4');
    boolean b21 = improvedTokenizer2.keepParsing((int)'4');
    java.lang.String str22 = improvedTokenizer2.previousDelimiter();
    boolean b23 = improvedTokenizer2.hasNext();
    int i24 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test333"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken(' ');
    int i13 = improvedTokenizer2.afterToken('a');
    int i15 = improvedTokenizer2.afterToken('a');
    boolean b17 = improvedTokenizer2.keepParsing((int)(short)0);
    int i19 = improvedTokenizer2.matchingToken('4');
    boolean b21 = improvedTokenizer2.keepParsing((int)'4');
    int i22 = improvedTokenizer2.stop();
    java.lang.String str23 = improvedTokenizer2.previousDelimiter();
    int i24 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test334"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    java.lang.String str4 = improvedTokenizer2.next();
    int i6 = improvedTokenizer2.start(' ');
    boolean b7 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.afterToken('4');
    boolean b11 = improvedTokenizer2.advance();
    boolean b12 = improvedTokenizer2.advance();
    boolean b14 = improvedTokenizer2.keepParsing(5);
    boolean b15 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test335"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "");
    int i3 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test336"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test337"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('#');
    java.lang.String str7 = improvedTokenizer2.next();
    boolean b9 = improvedTokenizer2.keepParsing(5);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test338"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.afterToken(' ');
    boolean b15 = improvedTokenizer2.keepParsing((int)(byte)10);
    boolean b16 = improvedTokenizer2.advance();
    boolean b18 = improvedTokenizer2.keepParsing((int)(byte)-1);
    int i20 = improvedTokenizer2.start('#');
    boolean b21 = improvedTokenizer2.advance();
    boolean b23 = improvedTokenizer2.keepParsing((int)' ');
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i25 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test339"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.afterToken(' ');
    int i14 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.hasNext();
    boolean b17 = improvedTokenizer2.keepParsing((int)' ');
    int i18 = improvedTokenizer2.stop();
    boolean b20 = improvedTokenizer2.keepParsing((-1));
    java.lang.String str21 = improvedTokenizer2.previousDelimiter();
    int i23 = improvedTokenizer2.start('a');
    int i25 = improvedTokenizer2.beforeToken('4');
    int i26 = improvedTokenizer2.stop();
    boolean b27 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i29 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test340"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start(' ');
    boolean b9 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test341"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    boolean b4 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test342"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.matchingToken('#');
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)-1);
    int i11 = improvedTokenizer2.stop();
    int i12 = improvedTokenizer2.stop();
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    boolean b15 = improvedTokenizer2.keepParsing((int)'4');
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test343"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.afterToken(' ');
    int i14 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.hasNext();
    boolean b17 = improvedTokenizer2.keepParsing((int)' ');
    int i18 = improvedTokenizer2.stop();
    boolean b20 = improvedTokenizer2.keepParsing((-1));
    java.lang.String str21 = improvedTokenizer2.previousDelimiter();
    int i23 = improvedTokenizer2.start('a');
    int i25 = improvedTokenizer2.beforeToken('4');
    boolean b26 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i28 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test344"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test345"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.start('4');
    int i9 = improvedTokenizer2.matchingToken('a');
    int i10 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test346"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4aa", "4a");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test347"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test348"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "a");
    boolean b3 = improvedTokenizer2.hasNext();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test349"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b6 = improvedTokenizer2.keepParsing(1);
    boolean b7 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.advance();
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test350"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", " ");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)10);
    int i6 = improvedTokenizer2.start(' ');
    int i8 = improvedTokenizer2.matchingToken('a');
    int i9 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test351"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b7 = improvedTokenizer2.keepParsing((int)'4');
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    boolean b10 = improvedTokenizer2.keepParsing(10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test352"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b4 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test353"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.beforeToken('#');
    boolean b16 = improvedTokenizer2.keepParsing((int)(short)1);
    int i18 = improvedTokenizer2.afterToken('a');
    int i20 = improvedTokenizer2.afterToken('#');
    boolean b21 = improvedTokenizer2.hasNext();
    int i22 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i24 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test354"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "a");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test355"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.beforeToken('a');
    int i13 = improvedTokenizer2.afterToken('#');
    boolean b14 = improvedTokenizer2.advance();
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test356"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", " ");
    boolean b3 = improvedTokenizer2.hasNext();
    boolean b4 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test357"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test358"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.start('a');
    boolean b14 = improvedTokenizer2.advance();
    int i15 = improvedTokenizer2.stop();
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    boolean b17 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test359"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    boolean b3 = improvedTokenizer2.hasNext();
    boolean b4 = improvedTokenizer2.hasNext();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test360"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a ", "4");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i4 = improvedTokenizer2.stop();
    java.lang.String str5 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test361"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.matchingToken('#');
    boolean b8 = improvedTokenizer2.keepParsing(100);
    int i10 = improvedTokenizer2.start('a');
    int i12 = improvedTokenizer2.beforeToken('a');
    int i14 = improvedTokenizer2.matchingToken('#');
    boolean b15 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test362"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.afterToken('4');
    int i13 = improvedTokenizer2.afterToken(' ');
    boolean b14 = improvedTokenizer2.hasNext();
    int i16 = improvedTokenizer2.matchingToken(' ');
    int i17 = improvedTokenizer2.stop();
    boolean b18 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i20 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test363"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.beforeToken('a');
    int i13 = improvedTokenizer2.afterToken('a');
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    int i15 = improvedTokenizer2.stop();
    int i16 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test364"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken('#');
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i14 = improvedTokenizer2.matchingToken('4');
    int i16 = improvedTokenizer2.start('a');
    int i17 = improvedTokenizer2.stop();
    boolean b18 = improvedTokenizer2.hasNext();
    boolean b19 = improvedTokenizer2.hasNext();
    java.lang.String str20 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test365"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", " ");
    int i4 = improvedTokenizer2.start('a');
    boolean b5 = improvedTokenizer2.advance();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test366"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b6 = improvedTokenizer2.keepParsing(1);
    boolean b7 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.stop();
    boolean b9 = improvedTokenizer2.advance();
    boolean b10 = improvedTokenizer2.hasNext();
    boolean b11 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test367"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a ", "");
    boolean b3 = improvedTokenizer2.advance();
    boolean b4 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test368"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i8 = improvedTokenizer2.stop();
    boolean b9 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test369"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.matchingToken('#');
    int i8 = improvedTokenizer2.start('#');
    java.lang.String str9 = improvedTokenizer2.next();
    int i11 = improvedTokenizer2.start('a');
    int i12 = improvedTokenizer2.stop();
    boolean b13 = improvedTokenizer2.hasNext();
    boolean b14 = improvedTokenizer2.hasNext();
    boolean b15 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test370"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.keepParsing(0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test371"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    int i3 = improvedTokenizer2.stop();
    boolean b4 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.hasNext();
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)-1);
    boolean b10 = improvedTokenizer2.keepParsing((int)' ');
    boolean b12 = improvedTokenizer2.keepParsing(128);
    boolean b14 = improvedTokenizer2.keepParsing(100);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test372"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i8 = improvedTokenizer2.start('a');
    int i9 = improvedTokenizer2.stop();
    int i11 = improvedTokenizer2.start('a');
    boolean b12 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test373"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    int i12 = improvedTokenizer2.start('#');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)10);
    boolean b16 = improvedTokenizer2.keepParsing((int)' ');
    boolean b17 = improvedTokenizer2.advance();
    java.lang.String str18 = improvedTokenizer2.previousDelimiter();
    int i20 = improvedTokenizer2.start('a');
    int i21 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test374"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "4a");
    boolean b3 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.keepParsing(128);
    boolean b6 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test375"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    boolean b7 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test376"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken(' ');
    int i13 = improvedTokenizer2.afterToken('a');
    int i15 = improvedTokenizer2.afterToken('a');
    boolean b17 = improvedTokenizer2.keepParsing((int)(short)0);
    int i19 = improvedTokenizer2.matchingToken('4');
    boolean b21 = improvedTokenizer2.keepParsing((int)'4');
    java.lang.String str22 = improvedTokenizer2.previousDelimiter();
    boolean b23 = improvedTokenizer2.hasNext();
    int i24 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test377"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.stop();
    int i9 = improvedTokenizer2.start('a');
    int i11 = improvedTokenizer2.matchingToken('a');
    boolean b13 = improvedTokenizer2.keepParsing((int)'#');
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    boolean b16 = improvedTokenizer2.keepParsing((int)(byte)1);
    int i18 = improvedTokenizer2.start('4');
    int i19 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test378"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.advance();
    int i7 = improvedTokenizer2.start('4');
    int i9 = improvedTokenizer2.matchingToken('a');
    int i10 = improvedTokenizer2.stop();
    int i12 = improvedTokenizer2.start('4');
    boolean b13 = improvedTokenizer2.hasNext();
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    boolean b15 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test379"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test380"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.beforeToken('a');
    int i11 = improvedTokenizer2.matchingToken(' ');
    int i13 = improvedTokenizer2.beforeToken(' ');
    int i15 = improvedTokenizer2.matchingToken('#');
    int i16 = improvedTokenizer2.stop();
    int i17 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test381"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    java.lang.String str5 = improvedTokenizer2.next();
    int i6 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test382"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4a", "aa");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test383"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "a");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'#');
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test384"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#a", "a");
    int i3 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test385"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", " ");
    int i3 = improvedTokenizer2.stop();
    int i5 = improvedTokenizer2.start(' ');
    int i7 = improvedTokenizer2.beforeToken('a');
    boolean b8 = improvedTokenizer2.hasNext();
    boolean b9 = improvedTokenizer2.hasNext();
    boolean b10 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test386"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4a", "#");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test387"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b8 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.start('4');
    int i12 = improvedTokenizer2.afterToken('4');
    int i14 = improvedTokenizer2.beforeToken('#');
    boolean b16 = improvedTokenizer2.keepParsing((int)(short)1);
    int i18 = improvedTokenizer2.afterToken('a');
    int i20 = improvedTokenizer2.afterToken('#');
    boolean b21 = improvedTokenizer2.hasNext();
    int i22 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i24 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test388"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    java.lang.String str4 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test389"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "a");
    boolean b4 = improvedTokenizer2.keepParsing(10);
    int i6 = improvedTokenizer2.start('4');
    boolean b7 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.afterToken('4');

  }

}
