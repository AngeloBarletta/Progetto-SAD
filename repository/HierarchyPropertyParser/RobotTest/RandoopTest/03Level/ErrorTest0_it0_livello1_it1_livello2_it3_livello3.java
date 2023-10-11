
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test001"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    hierarchyPropertyParser2.build("hi!", "hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test002"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test003"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test004"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test005"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    java.lang.String str3 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b5 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test006"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.getValue();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test007"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test008"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    int i8 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test009"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test010"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isHierachic(".");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test011"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b2 = hierarchyPropertyParser0.goTo(".");

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test012"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test013"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test014"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.showTree();
    java.lang.String str6 = hierarchyPropertyParser2.getValue();
    boolean b8 = hierarchyPropertyParser2.isHierachic(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test015"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test016"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.isHierachic("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test017"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test018"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    boolean b6 = hierarchyPropertyParser2.isHierachic(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test019"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    boolean b7 = hierarchyPropertyParser2.goDown("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test020"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test021"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test022"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isHierachic(".");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    int i9 = hierarchyPropertyParser2.getLevel();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test023"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test024"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test025"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    int i6 = hierarchyPropertyParser2.numChildren();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    boolean b10 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test026"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test027"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    boolean b9 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test028"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array4 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test029"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    int i6 = hierarchyPropertyParser2.getLevel();
    int i7 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test030"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    int i6 = hierarchyPropertyParser2.numChildren();
    boolean b8 = hierarchyPropertyParser2.goDown("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test031"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.setSeperator("hi!");
    int i8 = hierarchyPropertyParser2.getLevel();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test032"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array4 = hierarchyPropertyParser2.childrenValues();
    boolean b6 = hierarchyPropertyParser2.isHierachic("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test033"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.goDown(".");
    int i8 = hierarchyPropertyParser2.depth();
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test034"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test035"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    int i6 = hierarchyPropertyParser2.depth();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test036"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isHierachic(".");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("");
    int i13 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test037"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    int i8 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test038"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    java.lang.String str3 = hierarchyPropertyParser2.getSeperator();
    boolean b5 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test039"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test040"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test041"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    boolean b6 = hierarchyPropertyParser2.goDown(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test042"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str5 = hierarchyPropertyParser2.getValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test043"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test044"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    java.lang.String str12 = hierarchyPropertyParser2.getValue();
    int i13 = hierarchyPropertyParser2.numChildren();
    boolean b15 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b17 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test045"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String str7 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    int i10 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test046"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    java.lang.String str7 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test047"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b4 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str5 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test048"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test049"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.goToChild("");
    int i13 = hierarchyPropertyParser2.getLevel();
    boolean b14 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b17 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test050"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    boolean b11 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test051"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    java.lang.String str3 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b5 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test052"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    int i8 = hierarchyPropertyParser2.depth();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    boolean b11 = hierarchyPropertyParser2.isHierachic("hi!");
    int i12 = hierarchyPropertyParser2.getLevel();
    java.lang.String str13 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.setSeperator("hi!");
    java.lang.String[] str_array17 = hierarchyPropertyParser2.tokenize(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b19 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test053"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b10 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test054"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test055"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    boolean b6 = hierarchyPropertyParser2.goDown(".");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize(".");
    java.lang.String str9 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test056"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    int i6 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test057"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test058"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    boolean b7 = hierarchyPropertyParser2.goToChild("");
    boolean b8 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    boolean b12 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    hierarchyPropertyParser2.build("", ".");
    java.lang.String str16 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b18 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test059"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test060"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    int i9 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test061"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    boolean b6 = hierarchyPropertyParser2.goDown("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test062"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    int i7 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test063"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    java.lang.String str6 = hierarchyPropertyParser2.showTree();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test064"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test065"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test066"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str5 = hierarchyPropertyParser2.getValue();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    int i7 = hierarchyPropertyParser2.getLevel();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test067"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    boolean b7 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    boolean b10 = hierarchyPropertyParser2.isHierachic(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test068"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isHierachic(".");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    boolean b11 = hierarchyPropertyParser2.goDown(".");
    hierarchyPropertyParser2.build("hi!(0)[null]\n", "hi!(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test069"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.contains("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test070"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    int i5 = hierarchyPropertyParser2.depth();
    int i6 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test071"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    java.lang.String str6 = hierarchyPropertyParser2.showTree();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test072"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    java.lang.String str6 = hierarchyPropertyParser2.showTree();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test073"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    boolean b8 = hierarchyPropertyParser2.contains("hi!");
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test074"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b12 = hierarchyPropertyParser2.goDown("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test075"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    java.lang.String str3 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test076"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    int i10 = hierarchyPropertyParser2.depth();
    int i11 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test077"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.build("", "hi!");
    int i12 = hierarchyPropertyParser2.depth();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test078"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String str3 = hierarchyPropertyParser0.getSeperator();
    boolean b4 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String str7 = hierarchyPropertyParser0.context();
    int i8 = hierarchyPropertyParser0.getLevel();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser0.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test079"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str9 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test080"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test081"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    java.lang.String str3 = hierarchyPropertyParser2.getSeperator();
    boolean b5 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    boolean b7 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test082"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test083"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test084"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    int i7 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    boolean b10 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test085"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    int i5 = hierarchyPropertyParser2.depth();
    int i6 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator(".");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test086"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test087"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    boolean b11 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test088"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test089"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    boolean b8 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test090"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str5 = hierarchyPropertyParser2.getValue();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test091"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    boolean b6 = hierarchyPropertyParser2.goDown(".");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str12 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test092"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test093"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    int i9 = hierarchyPropertyParser2.numChildren();
    int i10 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str12 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.setSeperator("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test094"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test095"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test096"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("");
    java.lang.String[] str_array14 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str15 = hierarchyPropertyParser2.fullValue();
    java.lang.String str16 = hierarchyPropertyParser2.context();
    boolean b17 = hierarchyPropertyParser2.isLeafReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b19 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test097"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b10 = hierarchyPropertyParser2.goToChild("hi!");
    int i11 = hierarchyPropertyParser2.getLevel();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test098"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array4 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
    boolean b9 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test099"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.goDown(".");
    boolean b9 = hierarchyPropertyParser2.isHierachic("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test100"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    java.lang.String[] str_array3 = hierarchyPropertyParser2.childrenValues();
    boolean b5 = hierarchyPropertyParser2.goDown("");
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test101"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    boolean b6 = hierarchyPropertyParser2.goDown(".");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize(".");
    java.lang.String str9 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.setSeperator("");
    boolean b13 = hierarchyPropertyParser2.goDown("hi!(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test102"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    int i7 = hierarchyPropertyParser2.getLevel();
    int i8 = hierarchyPropertyParser2.depth();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test103"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    int i7 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test104"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isHierachic(".");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test105"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    int i9 = hierarchyPropertyParser2.numChildren();
    int i10 = hierarchyPropertyParser2.depth();
    int i11 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test106"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test107"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    int i8 = hierarchyPropertyParser2.depth();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    boolean b11 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b15 = hierarchyPropertyParser2.isRootReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b17 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test108"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.goDown(".");
    java.lang.String str8 = hierarchyPropertyParser2.context();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
    int i12 = hierarchyPropertyParser2.getLevel();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test109"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.getValue();
    int i4 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test110"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    boolean b7 = hierarchyPropertyParser2.goToChild("");
    boolean b8 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    boolean b12 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test111"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test112"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b4 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test113"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test114"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    java.lang.String str3 = hierarchyPropertyParser2.parentValue();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test115"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test116"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    boolean b10 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    int i11 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser2.goTo("null(0)[null]\n");

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test117"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    boolean b7 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test118"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("hi!");

  }

}
