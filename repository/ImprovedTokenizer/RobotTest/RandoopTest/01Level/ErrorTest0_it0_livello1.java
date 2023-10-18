package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0_it0_livello1 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test01"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test02"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test03"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test04"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test05"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test06"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test07"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.afterToken(' ');
    int i8 = improvedTokenizer2.matchingToken('#');
    boolean b9 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test08"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test09"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.afterToken(' ');
    int i8 = improvedTokenizer2.matchingToken('#');
    boolean b10 = improvedTokenizer2.keepParsing(100);
    java.lang.String str11 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test10"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test11"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test12"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.matchingToken(' ');
    boolean b7 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test13"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test14"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start('a');
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test15"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start('a');
    int i5 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.matchingToken(' ');

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test16"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "a");
    boolean b3 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test17"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test18"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    java.lang.String str5 = improvedTokenizer2.next();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test19"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.matchingToken('a');
    boolean b7 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.beforeToken('a');

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test20"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.matchingToken('a');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.start(' ');
    int i10 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test21"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b7 = improvedTokenizer2.keepParsing((int)(byte)100);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test22"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b4 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test23"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "a");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test24"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test25"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.matchingToken('a');
    boolean b8 = improvedTokenizer2.keepParsing(5);
    int i9 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test26"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start('a');
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.hasNext();
    java.lang.String str7 = improvedTokenizer2.next();
    boolean b8 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.beforeToken(' ');

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test27"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test28"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test29"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start('a');
    boolean b5 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test30"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.afterToken('#');
    boolean b7 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test31"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test32"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "a");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('#');

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test33"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.advance();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    int i7 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test34"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start('a');
    int i5 = improvedTokenizer2.stop();
    boolean b6 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = improvedTokenizer2.afterToken('#');

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test35"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('#');
    java.lang.String str6 = improvedTokenizer2.next();
    int i8 = improvedTokenizer2.afterToken('4');
    boolean b9 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test36"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.matchingToken('a');
    boolean b8 = improvedTokenizer2.keepParsing(5);
    boolean b10 = improvedTokenizer2.keepParsing(0);
    boolean b11 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test37"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('#');
    java.lang.String str6 = improvedTokenizer2.next();
    int i8 = improvedTokenizer2.afterToken('4');
    boolean b9 = improvedTokenizer2.advance();
    boolean b11 = improvedTokenizer2.keepParsing((int)'4');
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test38"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.matchingToken('a');
    boolean b8 = improvedTokenizer2.keepParsing(5);
    int i9 = improvedTokenizer2.stop();
    int i10 = improvedTokenizer2.stop();
    int i11 = improvedTokenizer2.stop();
    boolean b12 = improvedTokenizer2.advance();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i14 = improvedTokenizer2.beforeToken('#');

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test39"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.afterToken(' ');
    int i8 = improvedTokenizer2.matchingToken('#');
    boolean b10 = improvedTokenizer2.keepParsing(100);
    int i12 = improvedTokenizer2.matchingToken('a');
    int i13 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = improvedTokenizer2.matchingToken('4');

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test40"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.advance();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    int i7 = improvedTokenizer2.stop();
    boolean b8 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test41"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    boolean b3 = improvedTokenizer2.hasNext();
    int i4 = improvedTokenizer2.stop();
    boolean b5 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test42"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test43"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.matchingToken('a');
    boolean b7 = improvedTokenizer2.hasNext();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.afterToken(' ');

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test44"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.afterToken(' ');
    int i8 = improvedTokenizer2.matchingToken('#');
    boolean b10 = improvedTokenizer2.keepParsing(100);
    java.lang.String str11 = improvedTokenizer2.next();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = improvedTokenizer2.afterToken('a');

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test45"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.matchingToken('a');

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test46"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start('a');
    int i6 = improvedTokenizer2.matchingToken('a');
    boolean b7 = improvedTokenizer2.hasNext();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test47"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.beforeToken('4');

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test48"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", "4");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = improvedTokenizer2.afterToken('4');

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test49"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    java.lang.String str5 = improvedTokenizer2.next();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    int i7 = improvedTokenizer2.stop();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = improvedTokenizer2.afterToken(' ');

  }

}
