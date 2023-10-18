package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0_it2_livello2 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test01"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    java.lang.String[] str_array3 = hierarchyPropertyParser2.childrenValues();
    int i4 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test02"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.getValue();
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("");
    int i10 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test03"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.showTree();
    boolean b8 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String[] str_array10 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test04"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b4 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test05"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.getValue();
    boolean b8 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    int i10 = hierarchyPropertyParser2.depth();
    int i11 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test06"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    int i5 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.build("", "");
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test07"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    int i5 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.build("", "");
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test08"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test09"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test10"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    java.lang.String[] str_array3 = hierarchyPropertyParser2.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b5 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test11"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    java.lang.String[] str_array3 = hierarchyPropertyParser2.childrenValues();
    int i4 = hierarchyPropertyParser2.numChildren();
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.getLevel();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    int i9 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test12"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.getValue();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goToChild("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test13"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.showTree();
    boolean b8 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test14"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.showTree();
    boolean b8 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.setSeperator(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test15"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.getValue();
    boolean b8 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test16"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.showTree();
    boolean b8 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.context();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test17"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    boolean b6 = hierarchyPropertyParser2.goToChild(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test18"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    boolean b5 = hierarchyPropertyParser2.isHierachic(".");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test19"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    int i5 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.build("", "");
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test20"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    java.lang.String str3 = hierarchyPropertyParser2.fullValue();
    java.lang.String str4 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test21"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    int i5 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.build("", "");
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    boolean b13 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test22"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.getValue();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test23"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.getValue();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.setSeperator("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test24"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test25"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    java.lang.String[] str_array3 = hierarchyPropertyParser2.childrenValues();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test26"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test27"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.showTree();
    boolean b8 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    int i10 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test28"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.getValue();
    boolean b8 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test29"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.getValue();
    boolean b8 = hierarchyPropertyParser2.contains("hi!");
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test30"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isHierachic(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test31"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.showTree();
    boolean b8 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test32"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    boolean b6 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    int i8 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test33"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    int i5 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.build("", "");
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test34"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    boolean b5 = hierarchyPropertyParser2.goToChild("hi!");
    hierarchyPropertyParser2.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test35"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.getValue();
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    java.lang.String str9 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test36"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.getValue();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test37"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.getValue();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test38"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    java.lang.String[] str_array3 = hierarchyPropertyParser2.childrenValues();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test39"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str7 = hierarchyPropertyParser2.context();
    int i8 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test40"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b4 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

}
