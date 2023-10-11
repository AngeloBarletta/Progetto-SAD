
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test001"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = hierarchyPropertyParser0.goTo("null(0)[null]\n");

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test002"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    int i6 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.isLeafReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser0.goTo("");

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test003"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    boolean b4 = hierarchyPropertyParser0.goDown("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser0.goTo("");

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test004"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b5 = hierarchyPropertyParser0.goTo(".");

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test005"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b4 = hierarchyPropertyParser0.goTo(".");

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test006"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    int i6 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.isLeafReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser0.goTo("null(0)[null]\n");

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test007"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b7 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser0.goTo("");

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test008"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser0.goTo("null(0)[null]\n");

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test009"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = hierarchyPropertyParser0.goTo("null(0)[null]\n");

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test010"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    java.lang.String[] str_array6 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("hi!");
    hierarchyPropertyParser0.goToRoot();
    int i10 = hierarchyPropertyParser0.getLevel();
    java.lang.String str11 = hierarchyPropertyParser0.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser0.goTo("hi!");

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test011"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    hierarchyPropertyParser0.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b5 = hierarchyPropertyParser0.goTo("hi!");

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test012"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b7 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("hi!");
    hierarchyPropertyParser0.setSeperator(".");
    boolean b13 = hierarchyPropertyParser0.goDown("hi!(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser0.goTo("");

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test013"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    boolean b9 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    boolean b11 = hierarchyPropertyParser0.contains("hi!");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str14 = hierarchyPropertyParser0.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser0.goTo("hi!");

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test014"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b7 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser0.goTo("null(0)[null]\n");

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test015"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test016"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b7 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser0.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser0.goTo("");

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test017"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("hi!");
    boolean b9 = hierarchyPropertyParser0.isRootReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser0.goTo(".");

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test018"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b11 = hierarchyPropertyParser0.isHierachic("");
    java.lang.String str12 = hierarchyPropertyParser0.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser0.goTo("hi!");

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test019"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.getLevel();
    java.lang.String str6 = hierarchyPropertyParser0.getValue();
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser0.goTo("");

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test020"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test021"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    boolean b8 = hierarchyPropertyParser0.goToChild("hi!");
    boolean b10 = hierarchyPropertyParser0.contains("hi!");
    boolean b11 = hierarchyPropertyParser0.isLeafReached();
    boolean b12 = hierarchyPropertyParser0.isRootReached();
    hierarchyPropertyParser0.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser0.goTo(".");

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test022"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.showTree();
    int i3 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.childrenValues();
    int i5 = hierarchyPropertyParser0.depth();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    int i7 = hierarchyPropertyParser0.getLevel();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test023"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test024"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b4 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test025"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b11 = hierarchyPropertyParser0.isHierachic("");
    hierarchyPropertyParser0.goToParent();
    java.lang.String str13 = hierarchyPropertyParser0.parentValue();
    java.lang.String str14 = hierarchyPropertyParser0.fullValue();
    java.lang.String str15 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str16 = hierarchyPropertyParser0.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b18 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test026"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.fullValue();
    int i9 = hierarchyPropertyParser0.numChildren();
    java.lang.String str10 = hierarchyPropertyParser0.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser0.goTo("hi!");

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test027"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.getLevel();
    java.lang.String str6 = hierarchyPropertyParser0.getValue();
    boolean b8 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    hierarchyPropertyParser0.goToRoot();
    boolean b11 = hierarchyPropertyParser0.contains("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser0.goTo("hi!");

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test028"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.setSeperator("");
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str7 = hierarchyPropertyParser0.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser0.goTo("null(0)[null]\n");

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test029"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    boolean b8 = hierarchyPropertyParser0.goToChild("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test030"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.depth();
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test031"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser0.goTo(".");

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test032"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    boolean b9 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    boolean b11 = hierarchyPropertyParser0.contains("hi!");
    hierarchyPropertyParser0.goToParent();
    java.lang.String[] str_array14 = hierarchyPropertyParser0.tokenize("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser0.goTo("hi!");

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test033"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    boolean b10 = hierarchyPropertyParser0.goToChild("");
    java.lang.String[] str_array11 = hierarchyPropertyParser0.childrenValues();
    int i12 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array14 = hierarchyPropertyParser0.tokenize("");
    java.lang.String str15 = hierarchyPropertyParser0.context();
    int i16 = hierarchyPropertyParser0.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b18 = hierarchyPropertyParser0.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test034"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.goToParent();
    boolean b8 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str9 = hierarchyPropertyParser0.context();
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser0.goTo(".");

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test035"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.showTree();
    int i3 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.childrenValues();
    int i5 = hierarchyPropertyParser0.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = hierarchyPropertyParser0.goTo("hi!");

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test036"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    boolean b3 = hierarchyPropertyParser0.contains("hi!");
    int i4 = hierarchyPropertyParser0.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser0.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test037"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.getLevel();
    java.lang.String str6 = hierarchyPropertyParser0.getValue();
    boolean b8 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser0.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test038"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    boolean b5 = hierarchyPropertyParser2.isHierachic("hi!");
    int i6 = hierarchyPropertyParser2.depth();
    int i7 = hierarchyPropertyParser2.getLevel();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test039"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    java.lang.String[] str_array6 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("hi!");
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str10 = hierarchyPropertyParser0.context();
    int i11 = hierarchyPropertyParser0.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test040"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    boolean b5 = hierarchyPropertyParser2.isHierachic("hi!");
    int i6 = hierarchyPropertyParser2.depth();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test041"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.childrenValues();
    int i5 = hierarchyPropertyParser0.depth();
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test042"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    int i8 = hierarchyPropertyParser0.getLevel();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser0.goTo("");

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test043"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    hierarchyPropertyParser0.goToRoot();
    boolean b5 = hierarchyPropertyParser0.isHierachic("");
    boolean b7 = hierarchyPropertyParser0.goToChild(".");
    java.lang.String str8 = hierarchyPropertyParser0.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser0.goTo("null(0)[null]\n");

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test044"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str5 = hierarchyPropertyParser2.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test045"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    boolean b3 = hierarchyPropertyParser0.goDown("");
    int i4 = hierarchyPropertyParser0.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser0.goTo("");

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test046"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser0.goTo("");

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test047"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    java.lang.String[] str_array6 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("hi!");
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str10 = hierarchyPropertyParser0.context();
    int i11 = hierarchyPropertyParser0.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser0.goTo("null(0)[null]\n");

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test048"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    boolean b9 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser0.fullValue();
    int i11 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    java.lang.String str13 = hierarchyPropertyParser0.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser0.goTo(".");

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test049"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    boolean b8 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String[] str_array10 = hierarchyPropertyParser0.tokenize("");
    java.lang.String[] str_array12 = hierarchyPropertyParser0.tokenize("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser0.goTo("");

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test050"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    boolean b3 = hierarchyPropertyParser0.goDown("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b5 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test051"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    boolean b9 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    boolean b11 = hierarchyPropertyParser0.contains("hi!");
    hierarchyPropertyParser0.goToParent();
    java.lang.String str13 = hierarchyPropertyParser0.fullValue();
    int i14 = hierarchyPropertyParser0.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test052"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b4 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser0.showTree();
    int i6 = hierarchyPropertyParser0.numChildren();
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str8 = hierarchyPropertyParser0.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser0.goTo("null(0)[null]\n");

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test053"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    boolean b7 = hierarchyPropertyParser0.goToChild("hi!");
    int i8 = hierarchyPropertyParser0.getLevel();
    java.lang.String str9 = hierarchyPropertyParser0.parentValue();
    int i10 = hierarchyPropertyParser0.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser0.goTo("");

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test054"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.childrenValues();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser0.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test055"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    boolean b7 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    boolean b10 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String[] str_array12 = hierarchyPropertyParser0.tokenize("");
    java.lang.String str13 = hierarchyPropertyParser0.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser0.goTo("hi!");

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test056"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isHierachic(".");
    hierarchyPropertyParser0.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser0.goTo("");

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test057"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!(0)[null]\n", "hi!(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b4 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test058"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.fullValue();
    int i9 = hierarchyPropertyParser0.numChildren();
    int i10 = hierarchyPropertyParser0.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser0.goTo(".");

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test059"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    boolean b8 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String[] str_array10 = hierarchyPropertyParser0.tokenize("");
    int i11 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array12 = hierarchyPropertyParser0.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser0.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test060"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", ".");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.childrenValues();
    int i7 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser2.goTo("hi!");

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test061"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    int i6 = hierarchyPropertyParser0.depth();
    java.lang.String str7 = hierarchyPropertyParser0.showTree();
    int i8 = hierarchyPropertyParser0.getLevel();
    boolean b10 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    boolean b12 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str13 = hierarchyPropertyParser0.fullValue();
    java.lang.String str14 = hierarchyPropertyParser0.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test062"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.showTree();
    int i3 = hierarchyPropertyParser0.getLevel();
    boolean b4 = hierarchyPropertyParser0.isRootReached();
    hierarchyPropertyParser0.goToRoot();
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser0.goTo("hi!");

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test063"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToRoot();
    boolean b7 = hierarchyPropertyParser0.isRootReached();
    hierarchyPropertyParser0.goToParent();
    int i9 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n");
    int i12 = hierarchyPropertyParser0.getLevel();
    java.lang.String str13 = hierarchyPropertyParser0.getSeperator();
    java.lang.String[] str_array15 = hierarchyPropertyParser0.tokenize("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser0.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b18 = hierarchyPropertyParser0.goTo("hi!");

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test064"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("hi!");
    boolean b9 = hierarchyPropertyParser0.isRootReached();
    java.lang.String[] str_array10 = hierarchyPropertyParser0.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser0.goTo(".");

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test065"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.showTree();
    int i3 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.childrenValues();
    int i5 = hierarchyPropertyParser0.depth();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    boolean b8 = hierarchyPropertyParser0.goDown(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser0.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test066"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    hierarchyPropertyParser0.goToRoot();
    int i11 = hierarchyPropertyParser0.getLevel();
    boolean b12 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str13 = hierarchyPropertyParser0.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser0.goTo("null(0)[null]\n");

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test067"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.goToParent();
    boolean b8 = hierarchyPropertyParser0.isLeafReached();
    boolean b10 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    int i11 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.setSeperator("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser0.goTo("hi!");

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test068"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", ".");
    int i3 = hierarchyPropertyParser2.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b5 = hierarchyPropertyParser2.goTo(".");

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test069"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    int i6 = hierarchyPropertyParser0.depth();
    java.lang.String str7 = hierarchyPropertyParser0.showTree();
    int i8 = hierarchyPropertyParser0.getLevel();
    boolean b10 = hierarchyPropertyParser0.goDown("");
    int i11 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.build("null(0)[null]\n", "null(0)[null]\n(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser0.goTo(".(0)[null]\n");

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test070"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.getLevel();
    java.lang.String str6 = hierarchyPropertyParser0.getValue();
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    boolean b10 = hierarchyPropertyParser0.isLeafReached();
    boolean b12 = hierarchyPropertyParser0.contains("hi!(0)[null]\n(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser0.goTo(".(0)[null]\n");

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test071"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b7 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test072"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    boolean b8 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String[] str_array10 = hierarchyPropertyParser0.tokenize("");
    int i11 = hierarchyPropertyParser0.numChildren();
    boolean b12 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.build("", "hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b17 = hierarchyPropertyParser0.goTo("null(0)[null]\n");

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test073"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    int i4 = hierarchyPropertyParser0.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser0.goTo("null(0)[null]\n");

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test074"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test075"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b4 = hierarchyPropertyParser0.isRootReached();
    boolean b6 = hierarchyPropertyParser0.goDown("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser0.goTo("null(0)[null]\n");

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test076"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test077"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.getValue();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n(0)[null]\n");
    int i8 = hierarchyPropertyParser2.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser2.goTo(".(0)[null]\n");

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test078"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser0.context();
    java.lang.String str7 = hierarchyPropertyParser0.fullValue();
    boolean b8 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str9 = hierarchyPropertyParser0.getValue();
    boolean b11 = hierarchyPropertyParser0.contains("hi!(0)[null]\n(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser0.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test079"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    boolean b8 = hierarchyPropertyParser0.isRootReached();
    int i9 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array10 = hierarchyPropertyParser0.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser0.goTo("");

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test080"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    boolean b5 = hierarchyPropertyParser2.isHierachic("hi!");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test081"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    boolean b9 = hierarchyPropertyParser0.goToChild("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test082"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    boolean b9 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser0.fullValue();
    java.lang.String[] str_array11 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str13 = hierarchyPropertyParser0.showTree();
    boolean b14 = hierarchyPropertyParser0.isRootReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser0.goTo(".(0)[null]\n");

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test083"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    boolean b4 = hierarchyPropertyParser0.isHierachic("hi!(0)[null]\n");
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str6 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str7 = hierarchyPropertyParser0.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test084"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    int i6 = hierarchyPropertyParser0.numChildren();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser0.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test085"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser0.context();
    java.lang.String str7 = hierarchyPropertyParser0.fullValue();
    boolean b8 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str9 = hierarchyPropertyParser0.getValue();
    boolean b11 = hierarchyPropertyParser0.contains("hi!(0)[null]\n(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser0.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser0.goTo(".(0)[null]\n");

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test086"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("hi!");
    hierarchyPropertyParser0.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser0.goTo("null(0)[null]\n");

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test087"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    int i6 = hierarchyPropertyParser0.depth();
    java.lang.String str7 = hierarchyPropertyParser0.showTree();
    int i8 = hierarchyPropertyParser0.getLevel();
    int i9 = hierarchyPropertyParser0.numChildren();
    java.lang.String str10 = hierarchyPropertyParser0.showTree();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test088"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.getLevel();
    java.lang.String str6 = hierarchyPropertyParser0.getValue();
    boolean b8 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    boolean b10 = hierarchyPropertyParser0.goToChild("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser0.goTo("null(0)[null]\n");

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test089"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str9 = hierarchyPropertyParser0.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser0.goTo(".");

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test090"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    boolean b8 = hierarchyPropertyParser0.goToChild("hi!");
    boolean b10 = hierarchyPropertyParser0.contains("hi!");
    int i11 = hierarchyPropertyParser0.depth();
    boolean b13 = hierarchyPropertyParser0.goDown("");
    java.lang.String str14 = hierarchyPropertyParser0.showTree();
    int i15 = hierarchyPropertyParser0.getLevel();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b17 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test091"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    boolean b4 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    java.lang.String str5 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.goToParent();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b8 = hierarchyPropertyParser0.goTo(".");

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test092"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    boolean b9 = hierarchyPropertyParser0.goDown("hi!");
    boolean b11 = hierarchyPropertyParser0.goToChild("");
    boolean b12 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str13 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b17 = hierarchyPropertyParser0.goTo("null(0)[null]\n");

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test093"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b7 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array13 = hierarchyPropertyParser0.tokenize("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser0.goTo("null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test094"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    hierarchyPropertyParser0.goToParent();
    int i9 = hierarchyPropertyParser0.getLevel();
    boolean b11 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String[] str_array13 = hierarchyPropertyParser0.tokenize("");
    hierarchyPropertyParser0.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser0.goTo("hi!");

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test095"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    boolean b5 = hierarchyPropertyParser2.isHierachic("hi!");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser2.goTo("");

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test096"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.getLevel();
    int i6 = hierarchyPropertyParser0.numChildren();
    boolean b8 = hierarchyPropertyParser0.isHierachic(".");
    int i9 = hierarchyPropertyParser0.numChildren();
    java.lang.String str10 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.setSeperator(".");
    int i13 = hierarchyPropertyParser0.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test097"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    boolean b9 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    boolean b11 = hierarchyPropertyParser0.contains("hi!");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str14 = hierarchyPropertyParser0.getSeperator();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test098"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    boolean b9 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    boolean b11 = hierarchyPropertyParser0.contains("hi!");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str14 = hierarchyPropertyParser0.getSeperator();
    boolean b16 = hierarchyPropertyParser0.isHierachic("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b18 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test099"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String str5 = hierarchyPropertyParser0.showTree();
    int i6 = hierarchyPropertyParser0.numChildren();
    java.lang.String str7 = hierarchyPropertyParser0.fullValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test100"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    boolean b9 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    boolean b11 = hierarchyPropertyParser0.contains("hi!");
    hierarchyPropertyParser0.setSeperator("");
    hierarchyPropertyParser0.goToParent();
    java.lang.String str15 = hierarchyPropertyParser0.context();
    boolean b17 = hierarchyPropertyParser0.isHierachic("hi!(0)[null]\n");
    boolean b18 = hierarchyPropertyParser0.isLeafReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b20 = hierarchyPropertyParser0.goTo(".");

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test101"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    boolean b7 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.setSeperator("");
    boolean b12 = hierarchyPropertyParser0.contains("null(0)[null]\n(0)[null]\n");
    boolean b14 = hierarchyPropertyParser0.goToChild("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test102"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    int i6 = hierarchyPropertyParser0.depth();
    java.lang.String str7 = hierarchyPropertyParser0.showTree();
    boolean b8 = hierarchyPropertyParser0.isLeafReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test103"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    boolean b7 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    int i9 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.setSeperator(".");
    boolean b13 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str14 = hierarchyPropertyParser0.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = hierarchyPropertyParser0.goTo("");

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test104"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.getLevel();
    int i6 = hierarchyPropertyParser0.numChildren();
    boolean b8 = hierarchyPropertyParser0.isHierachic(".");
    int i9 = hierarchyPropertyParser0.numChildren();
    java.lang.String str10 = hierarchyPropertyParser0.parentValue();
    java.lang.String str11 = hierarchyPropertyParser0.context();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test105"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    java.lang.String str5 = hierarchyPropertyParser0.fullValue();
    int i6 = hierarchyPropertyParser0.numChildren();
    int i7 = hierarchyPropertyParser0.numChildren();
    boolean b8 = hierarchyPropertyParser0.isRootReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n");

  }

}
