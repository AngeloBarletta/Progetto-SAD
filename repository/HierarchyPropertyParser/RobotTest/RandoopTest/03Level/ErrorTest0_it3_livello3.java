
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test001"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b4 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test002"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b3 = hierarchyPropertyParser0.goTo("");

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test003"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test004"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test005"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test006"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String str5 = hierarchyPropertyParser2.showTree();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test007"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.context();
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test008"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    boolean b2 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser0.goTo(".");

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test009"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test010"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test011"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test012"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test013"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    int i9 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test014"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test015"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test016"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    boolean b7 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test017"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str2 = hierarchyPropertyParser0.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b4 = hierarchyPropertyParser0.goTo("hi!");

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test018"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    java.lang.String[] str_array3 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str4 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test019"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    boolean b11 = hierarchyPropertyParser2.goToChild("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test020"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    boolean b2 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.setSeperator("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser0.goTo("");

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test021"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test022"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    boolean b2 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.setSeperator("hi!");
    int i5 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test023"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test024"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize(".");
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test025"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test026"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test027"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test028"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array2 = hierarchyPropertyParser0.childrenValues();
    int i3 = hierarchyPropertyParser0.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b5 = hierarchyPropertyParser0.goTo("null(0)[null]\n");

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test029"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.depth();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test030"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    int i11 = hierarchyPropertyParser2.numChildren();
    java.lang.String str12 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test031"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.context();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test032"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b12 = hierarchyPropertyParser2.goToChild(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test033"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    java.lang.String[] str_array3 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str4 = hierarchyPropertyParser2.getValue();
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test034"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    int i7 = hierarchyPropertyParser2.depth();
    boolean b9 = hierarchyPropertyParser2.isHierachic("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test035"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    int i12 = hierarchyPropertyParser2.numChildren();
    boolean b14 = hierarchyPropertyParser2.contains(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test036"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    int i10 = hierarchyPropertyParser2.numChildren();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    boolean b13 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator(".");
    boolean b16 = hierarchyPropertyParser2.isRootReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b18 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test037"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    boolean b3 = hierarchyPropertyParser0.contains("hi!");
    hierarchyPropertyParser0.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser0.goTo("null(0)[null]\n");

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test038"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test039"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str6 = hierarchyPropertyParser2.showTree();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test040"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test041"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    int i11 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test042"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.goDown(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test043"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    boolean b2 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test044"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test045"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.goToRoot();
    boolean b10 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test046"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    int i10 = hierarchyPropertyParser2.getLevel();
    boolean b12 = hierarchyPropertyParser2.goToChild("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test047"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.tokenize(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test048"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.setSeperator("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test049"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("");
    int i7 = hierarchyPropertyParser2.depth();
    boolean b9 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test050"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    int i10 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test051"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    int i11 = hierarchyPropertyParser2.numChildren();
    java.lang.String str12 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test052"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String str16 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToParent();
    boolean b18 = hierarchyPropertyParser2.isRootReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b20 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test053"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!(0)[null]\n");
    int i3 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b5 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test054"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test055"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    int i11 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test056"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test057"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.goDown("");
    java.lang.String str13 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test058"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    int i7 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test059"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test060"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    boolean b7 = hierarchyPropertyParser2.isLeafReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test061"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!(0)[null]\n");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test062"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.isHierachic("hi!");
    int i10 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test063"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    int i11 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test064"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    boolean b13 = hierarchyPropertyParser2.goDown(".");
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str15 = hierarchyPropertyParser2.context();
    java.lang.String str16 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b18 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test065"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    java.lang.String str12 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test066"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    boolean b6 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build(".", ".");
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    boolean b14 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test067"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    int i5 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test068"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    int i12 = hierarchyPropertyParser2.numChildren();
    boolean b14 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test069"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    java.lang.String str11 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test070"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    boolean b8 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    boolean b11 = hierarchyPropertyParser2.goToChild("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test071"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    boolean b6 = hierarchyPropertyParser2.goToChild("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str9 = hierarchyPropertyParser2.context();
    int i10 = hierarchyPropertyParser2.getLevel();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test072"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    int i12 = hierarchyPropertyParser2.depth();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    java.lang.String str14 = hierarchyPropertyParser2.showTree();
    boolean b15 = hierarchyPropertyParser2.isRootReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b17 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test073"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test074"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test075"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    boolean b11 = hierarchyPropertyParser2.contains("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test076"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    boolean b11 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    java.lang.String str13 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String str16 = hierarchyPropertyParser2.fullValue();
    java.lang.String[] str_array17 = hierarchyPropertyParser2.childrenValues();
    int i18 = hierarchyPropertyParser2.depth();
    int i19 = hierarchyPropertyParser2.getLevel();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b21 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test077"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test078"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator(".");
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test079"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b12 = hierarchyPropertyParser2.isHierachic("hi!");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str14 = hierarchyPropertyParser2.fullValue();
    int i15 = hierarchyPropertyParser2.numChildren();
    java.lang.String str16 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b18 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test080"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    boolean b13 = hierarchyPropertyParser2.goDown("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test081"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    boolean b6 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    int i9 = hierarchyPropertyParser2.getLevel();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test082"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    boolean b6 = hierarchyPropertyParser2.goToChild("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    int i11 = hierarchyPropertyParser2.getLevel();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test083"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    int i5 = hierarchyPropertyParser2.depth();
    int i6 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test084"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.getValue();
    boolean b4 = hierarchyPropertyParser0.contains("hi!");
    boolean b6 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    int i7 = hierarchyPropertyParser0.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser0.goTo("null(0)[null]");

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test085"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test086"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    boolean b6 = hierarchyPropertyParser2.goToChild("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test087"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    boolean b5 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str6 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test088"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.getSeperator();
    boolean b3 = hierarchyPropertyParser0.goToChild("");
    boolean b4 = hierarchyPropertyParser0.isRootReached();
    boolean b6 = hierarchyPropertyParser0.goToChild("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser0.goTo(".(0)[null]\n");

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test089"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    boolean b11 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test090"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    boolean b6 = hierarchyPropertyParser2.goToChild("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    int i11 = hierarchyPropertyParser2.getLevel();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test091"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    boolean b13 = hierarchyPropertyParser2.goDown(".");
    boolean b15 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String str16 = hierarchyPropertyParser2.parentValue();
    boolean b18 = hierarchyPropertyParser2.goDown("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b20 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test092"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test093"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    boolean b2 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.setSeperator("hi!");
    int i5 = hierarchyPropertyParser0.depth();
    java.lang.String str6 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize(".");
    boolean b10 = hierarchyPropertyParser0.goToChild("");
    int i11 = hierarchyPropertyParser0.depth();
    java.lang.String[] str_array13 = hierarchyPropertyParser0.tokenize("null(0)[null]\n(0)[null]\n");
    boolean b15 = hierarchyPropertyParser0.goToChild(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b17 = hierarchyPropertyParser0.goTo("");

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test094"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test095"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test096"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str12 = hierarchyPropertyParser2.getValue();
    boolean b14 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String[] str_array15 = hierarchyPropertyParser2.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b17 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test097"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.numChildren();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    boolean b9 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b12 = hierarchyPropertyParser2.goToChild("");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test098"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String str16 = hierarchyPropertyParser2.getValue();
    java.lang.String str17 = hierarchyPropertyParser2.fullValue();
    int i18 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b20 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test099"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    int i5 = hierarchyPropertyParser2.numChildren();
    boolean b7 = hierarchyPropertyParser2.isHierachic("");
    boolean b9 = hierarchyPropertyParser2.goDown("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test100"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    int i7 = hierarchyPropertyParser2.depth();
    int i8 = hierarchyPropertyParser2.getLevel();
    java.lang.String str9 = hierarchyPropertyParser2.context();
    boolean b11 = hierarchyPropertyParser2.goDown(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test101"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String str16 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str18 = hierarchyPropertyParser2.showTree();
    java.lang.String str19 = hierarchyPropertyParser2.fullValue();
    boolean b21 = hierarchyPropertyParser2.goDown("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b23 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test102"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    boolean b6 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    boolean b12 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo(".(0)[null]\n");

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test103"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    int i7 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator("");
    int i10 = hierarchyPropertyParser2.depth();
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test104"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToRoot();
    boolean b9 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    boolean b11 = hierarchyPropertyParser2.goDown("hi!(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    java.lang.String str13 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test105"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test106"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    java.lang.String[] str_array3 = hierarchyPropertyParser2.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b5 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test107"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array2 = hierarchyPropertyParser0.childrenValues();
    boolean b3 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser0.goTo(".(0)[null]\n");

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test108"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    boolean b9 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.goToParent();
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test109"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b4 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test110"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String str5 = hierarchyPropertyParser2.showTree();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test111"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    int i7 = hierarchyPropertyParser2.depth();
    boolean b9 = hierarchyPropertyParser2.isHierachic("hi!");
    int i10 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test112"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!(0)[null]\n");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    boolean b5 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test113"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    boolean b6 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    int i10 = hierarchyPropertyParser2.depth();
    int i11 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test114"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.getSeperator();
    hierarchyPropertyParser0.goToParent();
    java.lang.String[] str_array3 = hierarchyPropertyParser0.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b5 = hierarchyPropertyParser0.goTo(".");

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test115"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    int i7 = hierarchyPropertyParser2.getLevel();
    boolean b9 = hierarchyPropertyParser2.isHierachic("hi!");
    int i10 = hierarchyPropertyParser2.depth();
    boolean b12 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.goDown("hi!(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test116"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test117"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo(".(0)[null]\n");

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test118"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test119"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    int i9 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test120"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    int i5 = hierarchyPropertyParser2.depth();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("hi!(0)[null]");

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test121"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    boolean b13 = hierarchyPropertyParser2.goDown("hi!");
    boolean b14 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str15 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b17 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test122"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test123"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str2 = hierarchyPropertyParser0.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b4 = hierarchyPropertyParser0.goTo("hi!(0)[null]");

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test124"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array2 = hierarchyPropertyParser0.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b4 = hierarchyPropertyParser0.goTo("");

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test125"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.goToRoot();
    boolean b10 = hierarchyPropertyParser2.goToChild(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test126"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test127"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.getValue();
    boolean b4 = hierarchyPropertyParser0.contains("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser0.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test128"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    boolean b6 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build(".", ".");
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test129"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    boolean b6 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    boolean b12 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    boolean b16 = hierarchyPropertyParser2.goDown("null(0)[null]\n(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b18 = hierarchyPropertyParser2.goTo(".(0)[null]\n");

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test130"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String str5 = hierarchyPropertyParser2.showTree();
    int i6 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test131"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    int i7 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    boolean b10 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    int i11 = hierarchyPropertyParser2.numChildren();
    boolean b13 = hierarchyPropertyParser2.goDown("null(0)[null]\n(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.isLeafReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test132"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test133"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.goToChild("hi!");
    hierarchyPropertyParser2.goToParent();
    int i7 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test134"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test135"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    int i5 = hierarchyPropertyParser2.getLevel();
    int i6 = hierarchyPropertyParser2.getLevel();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("hi!(0)[null]");

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test136"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    boolean b6 = hierarchyPropertyParser2.goToChild("");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("hi!(0)[null]");

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test137"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    int i10 = hierarchyPropertyParser2.numChildren();
    boolean b12 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str15 = hierarchyPropertyParser2.context();
    java.lang.String str16 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b18 = hierarchyPropertyParser2.goTo("hi!(0)[null]");

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test138"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test139"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    int i5 = hierarchyPropertyParser2.getLevel();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test140"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize(".");
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test141"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.getValue();
    java.lang.String str5 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test142"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator(".");
    int i16 = hierarchyPropertyParser2.getLevel();
    boolean b18 = hierarchyPropertyParser2.isHierachic(".");
    java.lang.String str19 = hierarchyPropertyParser2.fullValue();
    boolean b21 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    boolean b22 = hierarchyPropertyParser2.isRootReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b24 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test143"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test144"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    int i10 = hierarchyPropertyParser2.getLevel();
    int i11 = hierarchyPropertyParser2.getLevel();
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("hi!(0)[null]");

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test145"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    boolean b6 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    java.lang.String str7 = hierarchyPropertyParser2.context();
    boolean b8 = hierarchyPropertyParser2.isRootReached();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test146"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    boolean b6 = hierarchyPropertyParser2.goToChild("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str9 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test147"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("hi!(0)[null]");

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test148"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    boolean b2 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.setSeperator("hi!");
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b7 = hierarchyPropertyParser0.contains("hi!(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser0.goTo("");

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test149"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    int i11 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test150"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    int i9 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("null(0)[null]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test151"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.numChildren();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test152"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    boolean b13 = hierarchyPropertyParser2.goDown(".");
    boolean b15 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String str16 = hierarchyPropertyParser2.parentValue();
    boolean b17 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str18 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str19 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b21 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test153"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.isLeafReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test154"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    boolean b6 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    int i9 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator(".");
    boolean b13 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test155"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b12 = hierarchyPropertyParser2.goDown("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("hi!(0)[null]");

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test156"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    boolean b6 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    int i11 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test157"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b9 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    int i11 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    boolean b13 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b18 = hierarchyPropertyParser2.goTo(".(0)[null]\n");

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test158"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test159"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    boolean b8 = hierarchyPropertyParser2.goDown(".");
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test160"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b12 = hierarchyPropertyParser2.isHierachic("hi!");
    hierarchyPropertyParser2.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser2.goTo("hi!(0)[null]");

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test161"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    boolean b6 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test162"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test163"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.numChildren();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test164"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    int i12 = hierarchyPropertyParser2.depth();
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser2.goTo("(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test165"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.build("hi!", "hi!");
    int i12 = hierarchyPropertyParser2.numChildren();
    boolean b14 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    int i15 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b17 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test166"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test167"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    boolean b10 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b12 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test168"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.goToChild("hi!");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b10 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test169"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    boolean b6 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build(".", ".");
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    int i17 = hierarchyPropertyParser2.depth();
    java.lang.String str18 = hierarchyPropertyParser2.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b20 = hierarchyPropertyParser2.goTo("(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test170"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    int i7 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator("");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    boolean b13 = hierarchyPropertyParser2.goDown("hi!(0)[null]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser2.goTo(".(0)[null]\n");

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test171"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.setSeperator("");
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test172"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test173"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo(".(0)[null]\n");

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test174"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize(".");
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    int i13 = hierarchyPropertyParser2.getLevel();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test175"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test176"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test177"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.context();
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test178"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "null(0)[null]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b4 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test179"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.context();
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test180"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    int i7 = hierarchyPropertyParser2.depth();
    boolean b9 = hierarchyPropertyParser2.isHierachic("hi!");
    int i10 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test181"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.numChildren();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    boolean b9 = hierarchyPropertyParser2.isHierachic("");
    int i10 = hierarchyPropertyParser2.numChildren();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test182"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test183"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    int i5 = hierarchyPropertyParser2.numChildren();
    boolean b7 = hierarchyPropertyParser2.goDown(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("hi!(0)[null]");

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test184"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    int i10 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("(0)[null]\n");

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test185"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test186"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    int i7 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test187"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("null(0)[null](0)[null]\n");

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test188"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.getValue();
    boolean b4 = hierarchyPropertyParser0.contains("hi!");
    hierarchyPropertyParser0.setSeperator("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser0.goTo("null(0)[null]\n(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test189"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    boolean b11 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]");
    int i12 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("hi!(0)[null](0)[null]\n");

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test190"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test191"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    int i10 = hierarchyPropertyParser2.numChildren();
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    int i12 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("hi!(0)[null](0)[null]\n");

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test192"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    boolean b10 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("(0)[null]\n");

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test193"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str7 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]");

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test194"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.isLeafReached();
    boolean b16 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String str17 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str18 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b20 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test195"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    boolean b6 = hierarchyPropertyParser2.goToChild("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("(0)[null](0)[null]\n");

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test196"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    boolean b8 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    boolean b11 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str12 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test197"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String str7 = hierarchyPropertyParser2.context();
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo(".(0)[null]\n");

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test198"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    int i7 = hierarchyPropertyParser2.getLevel();
    boolean b9 = hierarchyPropertyParser2.isHierachic("hi!");
    int i10 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test199"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    boolean b8 = hierarchyPropertyParser2.goDown(".");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    int i11 = hierarchyPropertyParser2.getLevel();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test200"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    boolean b6 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test201"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.goToChild(".");
    int i11 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test202"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.numChildren();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    boolean b9 = hierarchyPropertyParser2.isHierachic("");
    int i10 = hierarchyPropertyParser2.numChildren();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo(".(0)[null]\n");

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test203"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test204"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    int i11 = hierarchyPropertyParser2.numChildren();
    boolean b13 = hierarchyPropertyParser2.goToChild(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]");

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test205"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str14 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser2.goTo("hi!(0)[null](0)[null]\n");

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test206"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    boolean b7 = hierarchyPropertyParser2.goDown("");
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test207"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.context();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo(".(0)[null]\n");

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test208"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    boolean b13 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str14 = hierarchyPropertyParser2.showTree();
    java.lang.String str15 = hierarchyPropertyParser2.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b17 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test209"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    int i5 = hierarchyPropertyParser2.getLevel();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test210"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    int i10 = hierarchyPropertyParser2.numChildren();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    boolean b13 = hierarchyPropertyParser2.isHierachic("null(0)[null]");
    java.lang.String str14 = hierarchyPropertyParser2.context();
    java.lang.String str15 = hierarchyPropertyParser2.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b17 = hierarchyPropertyParser2.goTo("null(0)[null]");

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test211"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b9 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test212"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.depth();
    int i7 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test213"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str12 = hierarchyPropertyParser2.getValue();
    boolean b14 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String[] str_array15 = hierarchyPropertyParser2.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b17 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test214"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    boolean b6 = hierarchyPropertyParser2.goToChild("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    boolean b14 = hierarchyPropertyParser2.goDown(".(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser2.goTo("(0)[null]\n");

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test215"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String str7 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test216"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    int i12 = hierarchyPropertyParser2.numChildren();
    boolean b14 = hierarchyPropertyParser2.contains(".");
    hierarchyPropertyParser2.setSeperator(".");
    boolean b18 = hierarchyPropertyParser2.goDown("hi!(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b20 = hierarchyPropertyParser2.goTo("(0)[null]\n(0)[null]\n");

  }

}
