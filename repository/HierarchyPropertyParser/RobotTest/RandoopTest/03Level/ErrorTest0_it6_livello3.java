package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0_it6_livello3 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test01"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test02"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b4 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test03"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test04"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b4 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test05"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test06"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.setSeperator("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test07"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test08"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test09"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test10"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test11"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    int i11 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test12"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b5 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test13"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    boolean b9 = hierarchyPropertyParser2.goDown(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test14"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    boolean b5 = hierarchyPropertyParser2.isRootReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test15"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test16"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test17"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test18"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.childrenValues();
    boolean b8 = hierarchyPropertyParser2.goToChild("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test19"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test20"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    boolean b14 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test21"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test22"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.build("", "");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test23"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test24"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize(".");
    int i7 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test25"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test26"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test27"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.setSeperator(".");
    boolean b8 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test28"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b5 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test29"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test30"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    int i13 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test31"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.parentValue();
    int i4 = hierarchyPropertyParser2.depth();
    boolean b6 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test32"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test33"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test34"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b15 = hierarchyPropertyParser2.isHierachic("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b17 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test35"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize(".");
    int i7 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test36"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build("", "");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test37"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    boolean b14 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test38"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str10 = hierarchyPropertyParser2.context();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str13 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test39"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test40"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    int i6 = hierarchyPropertyParser2.depth();
    boolean b8 = hierarchyPropertyParser2.isHierachic(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test41"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    int i10 = hierarchyPropertyParser2.numChildren();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test42"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    boolean b13 = hierarchyPropertyParser2.goToChild("");
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b19 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test43"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test44"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    int i12 = hierarchyPropertyParser2.depth();
    boolean b14 = hierarchyPropertyParser2.goToChild("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test45"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    int i5 = hierarchyPropertyParser2.getLevel();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test46"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    boolean b13 = hierarchyPropertyParser2.goToChild("");
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToRoot();
    boolean b17 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b20 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test47"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b10 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str13 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test48"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array15 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str16 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b18 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test49"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    boolean b11 = hierarchyPropertyParser2.goToChild(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test50"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str13 = hierarchyPropertyParser2.context();
    boolean b15 = hierarchyPropertyParser2.goToChild("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b17 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test51"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    int i9 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("null(0)[null](0)[null]\n");

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test52"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test53"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.setSeperator("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test54"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    boolean b5 = hierarchyPropertyParser2.isRootReached();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test55"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test56"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b10 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    int i12 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo(".(0)[null]\n");

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test57"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    int i10 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.setSeperator(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("null(0)[null](0)[null]\n");

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test58"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test59"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array15 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str16 = hierarchyPropertyParser2.context();
    java.lang.String str17 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b19 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test60"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    boolean b5 = hierarchyPropertyParser2.isRootReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test61"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.build("", "");
    java.lang.String str15 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b17 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test62"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    boolean b9 = hierarchyPropertyParser2.goDown(".");
    boolean b11 = hierarchyPropertyParser2.goDown("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo(".(0)[null]\n");

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test63"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo(".(0)[null]\n");

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test64"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("null(0)[null](0)[null]\n");

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test65"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    int i7 = hierarchyPropertyParser2.depth();
    int i8 = hierarchyPropertyParser2.getLevel();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo(".(0)[null]\n");

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test66"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    boolean b8 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test67"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    int i9 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("null(0)[null](0)[null]\n");

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test68"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    boolean b3 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser0.showTree();
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser0.goTo("null(0)[null]");

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test69"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    int i12 = hierarchyPropertyParser2.numChildren();
    java.lang.String str13 = hierarchyPropertyParser2.fullValue();
    java.lang.String str14 = hierarchyPropertyParser2.fullValue();
    boolean b16 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b18 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test70"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize(".");
    hierarchyPropertyParser2.goToParent();
    boolean b9 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo(".(0)[null]\n");

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test71"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    boolean b14 = hierarchyPropertyParser2.contains("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test72"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    java.lang.String str14 = hierarchyPropertyParser2.fullValue();
    int i15 = hierarchyPropertyParser2.numChildren();
    java.lang.String[] str_array17 = hierarchyPropertyParser2.tokenize(".");
    java.lang.String str18 = hierarchyPropertyParser2.showTree();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b20 = hierarchyPropertyParser2.goTo("null(0)[null](0)[null]\n");

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test73"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test74"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b4 = hierarchyPropertyParser0.goTo("null(0)[null]\n");

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test75"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test76"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    int i5 = hierarchyPropertyParser2.getLevel();
    int i6 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test77"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    int i10 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo(".(0)[null]\n");

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test78"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    boolean b11 = hierarchyPropertyParser2.goToChild(".");
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str14 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test79"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    boolean b14 = hierarchyPropertyParser2.goDown(".");
    int i15 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b17 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test80"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str13 = hierarchyPropertyParser2.context();
    boolean b14 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str15 = hierarchyPropertyParser2.getSeperator();
    boolean b17 = hierarchyPropertyParser2.goToChild("null(0)[null]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b19 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test81"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("null(0)[null](0)[null]\n");

  }

  @Test
  public void test82() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test82"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null](0)[null]\n", ".(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b4 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test83() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test83"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test84() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test84"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test85() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test85"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.goToParent();
    boolean b7 = hierarchyPropertyParser2.goDown(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test86() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test86"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToParent();
    boolean b16 = hierarchyPropertyParser2.isRootReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b18 = hierarchyPropertyParser2.goTo("null(0)[null](0)[null]\n");

  }

  @Test
  public void test87() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test87"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    boolean b9 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test88() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test88"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

}
