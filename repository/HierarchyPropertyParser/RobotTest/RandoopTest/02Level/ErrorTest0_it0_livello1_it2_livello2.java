
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test01"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    java.lang.String str9 = hierarchyPropertyParser0.parentValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser0.goTo("null(0)[null]\n");

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test02"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b5 = hierarchyPropertyParser0.goTo(".");

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test03"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    int i4 = hierarchyPropertyParser0.depth();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = hierarchyPropertyParser0.goTo("null(0)[null]\n");

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test04"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.goToRoot();
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str6 = hierarchyPropertyParser0.getValue();
    boolean b8 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n");

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test05"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    boolean b9 = hierarchyPropertyParser0.goDown(".");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser0.goTo("hi!");

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test06"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    java.lang.String str9 = hierarchyPropertyParser0.getValue();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser0.goTo("hi!");

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test07"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    hierarchyPropertyParser0.build("hi!", "hi!");
    int i9 = hierarchyPropertyParser0.getLevel();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = hierarchyPropertyParser0.goTo(".");

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test08"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.tokenize("");
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str7 = hierarchyPropertyParser0.fullValue();
    java.lang.String str8 = hierarchyPropertyParser0.parentValue();
    java.lang.String str9 = hierarchyPropertyParser0.getValue();
    boolean b10 = hierarchyPropertyParser0.isLeafReached();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = hierarchyPropertyParser0.goTo(".");

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test09"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    java.lang.String str8 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.setSeperator("");
    hierarchyPropertyParser0.goToParent();
    java.lang.String[] str_array12 = hierarchyPropertyParser0.childrenValues();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = hierarchyPropertyParser0.goTo(".");

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test10"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    hierarchyPropertyParser0.goToRoot();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = hierarchyPropertyParser0.goTo(".");

  }

}
