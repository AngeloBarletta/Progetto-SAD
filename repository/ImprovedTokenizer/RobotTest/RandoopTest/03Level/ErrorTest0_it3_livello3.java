
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test001"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test002"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(short)0);
    boolean b6 = improvedTokenizer2.keepParsing((int)(byte)10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test003"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    java.lang.String str4 = improvedTokenizer2.next();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test004"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    java.lang.String str4 = improvedTokenizer2.next();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test005"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b3 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test006"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test007"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b6 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test008"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    java.lang.String str4 = improvedTokenizer2.next();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test009"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(short)0);
    boolean b6 = improvedTokenizer2.keepParsing((int)(byte)10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test010"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test011"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.keepParsing((-1));
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test012"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test013"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test014"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "4");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test015"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(short)0);
    boolean b6 = improvedTokenizer2.keepParsing((int)(byte)10);
    java.lang.String str7 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test016"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b7 = improvedTokenizer2.keepParsing(0);
    boolean b8 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test017"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "4");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test018"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test019"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test020"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.keepParsing((-1));
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test021"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test022"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.keepParsing((-1));
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test023"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test024"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(short)0);
    boolean b6 = improvedTokenizer2.keepParsing((int)(byte)10);
    java.lang.String str7 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test025"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.hasNext();
    java.lang.String str8 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test026"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test027"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4#", "");
    int i3 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test028"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4#", "");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test029"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4#", "");
    int i3 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test030"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4#", "4#");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test031"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "4#");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test032"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b7 = improvedTokenizer2.keepParsing(0);
    boolean b9 = improvedTokenizer2.keepParsing((int)(short)10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test033"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#", "hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test034"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(short)0);
    boolean b6 = improvedTokenizer2.keepParsing((int)(byte)10);
    boolean b7 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test035"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(short)0);
    boolean b5 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test036"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "#");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test037"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4#", "4");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test038"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.keepParsing(1);
    java.lang.String str9 = improvedTokenizer2.next();
    java.lang.String str10 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test039"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b3 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b7 = improvedTokenizer2.keepParsing(1);
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test040"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test041"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test042"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b3 = improvedTokenizer2.hasNext();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test043"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    java.lang.String str7 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test044"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b7 = improvedTokenizer2.keepParsing(0);
    boolean b8 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test045"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#", "#");
    boolean b4 = improvedTokenizer2.keepParsing(2);
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test046"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test047"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(short)0);
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test048"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b7 = improvedTokenizer2.keepParsing(0);
    boolean b8 = improvedTokenizer2.advance();
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    boolean b10 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test049"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.hasNext();
    java.lang.String str8 = improvedTokenizer2.next();
    boolean b10 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b11 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test050"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.hasNext();
    java.lang.String str8 = improvedTokenizer2.next();
    boolean b10 = improvedTokenizer2.keepParsing(0);
    int i11 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test051"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    java.lang.String str4 = improvedTokenizer2.next();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test052"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b7 = improvedTokenizer2.keepParsing(0);
    boolean b8 = improvedTokenizer2.advance();
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test053"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    boolean b3 = improvedTokenizer2.hasNext();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    boolean b6 = improvedTokenizer2.keepParsing(0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test054"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.hasNext();
    java.lang.String str8 = improvedTokenizer2.next();
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b12 = improvedTokenizer2.keepParsing((int)(short)10);
    boolean b14 = improvedTokenizer2.keepParsing((int)'#');
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test055"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4#", "4#");
    java.lang.String str3 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test056"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test057"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "4");
    int i3 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test058"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "4");
    boolean b3 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test059"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test060"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.hasNext();
    java.lang.String str8 = improvedTokenizer2.next();
    boolean b10 = improvedTokenizer2.keepParsing(0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test061"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(short)0);
    boolean b5 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test062"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.hasNext();
    java.lang.String str8 = improvedTokenizer2.next();
    boolean b10 = improvedTokenizer2.keepParsing(0);
    int i11 = improvedTokenizer2.stop();
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test063"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.keepParsing((-1));
    boolean b10 = improvedTokenizer2.keepParsing(3);
    boolean b11 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test064"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4#", "");
    int i3 = improvedTokenizer2.stop();
    boolean b4 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test065"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    int i6 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test066"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(short)0);
    boolean b6 = improvedTokenizer2.keepParsing((int)(byte)10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test067"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.hasNext();
    java.lang.String str8 = improvedTokenizer2.next();
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b12 = improvedTokenizer2.keepParsing((int)(short)10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test068"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b7 = improvedTokenizer2.keepParsing(0);
    boolean b8 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test069"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    boolean b3 = improvedTokenizer2.hasNext();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test070"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "4#");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test071"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "4");
    boolean b3 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test072"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#", "4");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test073"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    int i6 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test074"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4#", "hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test075"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test076"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b3 = improvedTokenizer2.hasNext();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.hasNext();
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)-1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test077"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b6 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test078"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i4 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test079"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b3 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test080"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test081"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#", " ");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test082"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.keepParsing((-1));
    boolean b10 = improvedTokenizer2.keepParsing(3);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test083"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test084"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.hasNext();
    java.lang.String str8 = improvedTokenizer2.next();
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b12 = improvedTokenizer2.keepParsing((int)(short)10);
    boolean b14 = improvedTokenizer2.keepParsing((int)'#');
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test085"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(short)0);
    int i5 = improvedTokenizer2.stop();
    int i6 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.keepParsing((int)(short)10);
    java.lang.String str9 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test086"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(short)0);
    boolean b5 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test087"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test088"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "#");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test089"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4aa", "hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test090"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test091"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b6 = improvedTokenizer2.advance();
    java.lang.String str7 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test092"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test093"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.hasNext();
    java.lang.String str8 = improvedTokenizer2.next();
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b12 = improvedTokenizer2.keepParsing((int)(short)10);
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test094"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#", " ");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test095"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#", "4aa");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test096"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "4a");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test097"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "4");
    boolean b3 = improvedTokenizer2.hasNext();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    boolean b6 = improvedTokenizer2.keepParsing((int)(short)-1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test098"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    java.lang.String str7 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test099"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.keepParsing(1);
    java.lang.String str9 = improvedTokenizer2.next();
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    boolean b13 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test100"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "4a");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test101"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "");
    int i4 = improvedTokenizer2.start('a');
    java.lang.String str5 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test102"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(short)0);
    boolean b6 = improvedTokenizer2.keepParsing((int)(byte)10);
    boolean b7 = improvedTokenizer2.advance();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test103"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b3 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.keepParsing(2);
    boolean b7 = improvedTokenizer2.keepParsing(1);
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test104"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "4a");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test105"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.hasNext();
    java.lang.String str8 = improvedTokenizer2.next();
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b12 = improvedTokenizer2.keepParsing((int)(short)10);
    int i13 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test106"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "4");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test107"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.hasNext();
    java.lang.String str8 = improvedTokenizer2.next();
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b12 = improvedTokenizer2.keepParsing((int)(short)10);
    int i13 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.keepParsing((int)(short)1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test108"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    java.lang.String str4 = improvedTokenizer2.next();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test109"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b3 = improvedTokenizer2.advance();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    java.lang.String str5 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test110"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.hasNext();
    java.lang.String str8 = improvedTokenizer2.next();
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b12 = improvedTokenizer2.keepParsing((int)(short)10);
    int i13 = improvedTokenizer2.stop();
    boolean b15 = improvedTokenizer2.keepParsing((int)(short)1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test111"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.start(' ');
    int i8 = improvedTokenizer2.matchingToken('a');
    int i9 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test112"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(short)0);
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test113"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#", "#");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test114"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4aa", "4a");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test115"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", "hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test116"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "4a");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test117"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b6 = improvedTokenizer2.advance();
    boolean b7 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test118"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(short)0);
    boolean b5 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test119"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b4 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test120"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4#", "4");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test121"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.keepParsing(1);
    int i10 = improvedTokenizer2.start('a');
    boolean b11 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test122"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(short)0);
    boolean b6 = improvedTokenizer2.keepParsing((int)(byte)10);
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test123"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(short)0);
    boolean b6 = improvedTokenizer2.keepParsing((int)(byte)10);
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test124"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4#", "");
    int i3 = improvedTokenizer2.stop();
    boolean b4 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test125"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("#", "#");
    boolean b4 = improvedTokenizer2.keepParsing(2);
    boolean b5 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test126"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", "hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test127"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test128"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test129"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b7 = improvedTokenizer2.keepParsing(0);
    int i9 = improvedTokenizer2.start('a');
    int i11 = improvedTokenizer2.beforeToken(' ');
    boolean b12 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test130"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.keepParsing(1);
    boolean b9 = improvedTokenizer2.hasNext();
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test131"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b6 = improvedTokenizer2.hasNext();
    java.lang.String str7 = improvedTokenizer2.next();
    boolean b8 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test132"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(short)0);
    boolean b6 = improvedTokenizer2.keepParsing((int)(byte)10);
    java.lang.String str7 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test133"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b3 = improvedTokenizer2.hasNext();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test134"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "4aa");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test135"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b7 = improvedTokenizer2.keepParsing(0);
    int i9 = improvedTokenizer2.start('a');
    int i11 = improvedTokenizer2.beforeToken(' ');
    int i13 = improvedTokenizer2.matchingToken('#');
    boolean b14 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test136"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.keepParsing(1);
    int i10 = improvedTokenizer2.start('a');
    boolean b11 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test137"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b7 = improvedTokenizer2.keepParsing(0);
    boolean b8 = improvedTokenizer2.hasNext();
    java.lang.String str9 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test138"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    boolean b3 = improvedTokenizer2.hasNext();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test139"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.keepParsing(1);
    java.lang.String str9 = improvedTokenizer2.next();
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    boolean b11 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test140"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4#", "hi!");
    int i3 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test141"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4aa", "4aa");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test142"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    boolean b5 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test143"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b3 = improvedTokenizer2.advance();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    java.lang.String str5 = improvedTokenizer2.next();
    int i7 = improvedTokenizer2.start('4');
    int i8 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test144"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    boolean b5 = improvedTokenizer2.keepParsing(0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test145"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)(short)0);
    boolean b6 = improvedTokenizer2.keepParsing((int)(byte)10);
    boolean b7 = improvedTokenizer2.advance();
    boolean b8 = improvedTokenizer2.hasNext();
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test146"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "4aa");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test147"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    boolean b3 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test148"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "4aa");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test149"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.hasNext();
    java.lang.String str8 = improvedTokenizer2.next();
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b12 = improvedTokenizer2.keepParsing((int)(short)10);
    int i14 = improvedTokenizer2.start('4');
    boolean b15 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test150"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    java.lang.String str4 = improvedTokenizer2.next();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.lang.String str7 = improvedTokenizer2.next();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test151"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.keepParsing(1);
    java.lang.String str9 = improvedTokenizer2.next();
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test152"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)100);
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test153"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "4aa");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken(' ');

  }

}
