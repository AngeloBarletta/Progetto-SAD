
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test001"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.add("hi!");
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize("null(0)[null]");
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array14);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test002"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.context();
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test003"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    boolean b11 = hierarchyPropertyParser2.goToChild("");
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    int i13 = hierarchyPropertyParser2.getLevel();
    int i14 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test004"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    boolean b12 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.childrenValues();
    boolean b14 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test005"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("");
    int i13 = hierarchyPropertyParser2.numChildren();
    java.lang.String str14 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.build("null(0)[null]\n(0)[null]\n", "hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test006"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    int i12 = hierarchyPropertyParser2.numChildren();
    boolean b14 = hierarchyPropertyParser2.contains(".");
    int i15 = hierarchyPropertyParser2.numChildren();
    int i16 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test007"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    int i10 = hierarchyPropertyParser2.getLevel();
    int i11 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test008"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    int i10 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test009"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    int i7 = hierarchyPropertyParser2.depth();
    boolean b9 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test010"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!(0)[null]", "(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test011"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test012"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToParent();
    boolean b9 = hierarchyPropertyParser2.goTo(".");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    boolean b13 = hierarchyPropertyParser2.goToChild("hi!");
    boolean b15 = hierarchyPropertyParser2.contains("hi!");
    boolean b16 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str17 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "."+ "'", str17.equals("."));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test013"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    boolean b7 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test014"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("");
    int i13 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String str16 = hierarchyPropertyParser2.context();
    int i17 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test015"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test016"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("(0)[null]\n(0)[null]\n", "null(0)[null]\n(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test017"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.build("hi!", "hi!");
    boolean b13 = hierarchyPropertyParser2.contains("hi!");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str15 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test018"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    int i9 = hierarchyPropertyParser2.depth();
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test019"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    int i12 = hierarchyPropertyParser2.getLevel();
    boolean b14 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String str15 = hierarchyPropertyParser2.showTree();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test020"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    boolean b12 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    int i13 = hierarchyPropertyParser2.depth();
    boolean b15 = hierarchyPropertyParser2.goDown("hi!(0)[null]\n");
    java.lang.String str16 = hierarchyPropertyParser2.getValue();
    boolean b18 = hierarchyPropertyParser2.goToChild("");
    // The following exception was thrown during execution in test generation
    try {
    boolean b20 = hierarchyPropertyParser2.goTo("hi!(0)[null](0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test021"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "."+ "'", str6.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test022"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    boolean b9 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.goToParent();
    int i12 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test023"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    int i12 = hierarchyPropertyParser2.numChildren();
    boolean b14 = hierarchyPropertyParser2.goDown("hi!");
    boolean b16 = hierarchyPropertyParser2.goDown("null(0)[null]\n(0)[null]\n");
    boolean b18 = hierarchyPropertyParser2.goToChild(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test024"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    boolean b10 = hierarchyPropertyParser2.goDown("");
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test025"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    int i5 = hierarchyPropertyParser2.depth();
    int i6 = hierarchyPropertyParser2.numChildren();
    boolean b8 = hierarchyPropertyParser2.contains("null(0)[null]");
    hierarchyPropertyParser2.add("null(0)[null](0)[null]\n");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array11);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test026"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    int i7 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator("");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.setSeperator("");
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, "null(0)[null]\n");
    boolean b17 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    boolean b18 = hierarchyPropertyParser2.isLeafReached();
    // The following exception was thrown during execution in test generation
    try {
    boolean b20 = hierarchyPropertyParser2.contains("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test027"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test028"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "");
    boolean b16 = hierarchyPropertyParser2.goToChild("null(0)[null]");
    java.lang.String str17 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test029"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    boolean b12 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    int i13 = hierarchyPropertyParser2.depth();
    boolean b15 = hierarchyPropertyParser2.goDown("hi!(0)[null]\n");
    java.lang.String str16 = hierarchyPropertyParser2.getValue();
    boolean b18 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str19 = hierarchyPropertyParser2.getSeperator();
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = hierarchyPropertyParser2.contains("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "."+ "'", str19.equals("."));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test030"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    int i5 = hierarchyPropertyParser2.numChildren();
    boolean b7 = hierarchyPropertyParser2.goDown(".");
    int i8 = hierarchyPropertyParser2.depth();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.add("null(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test031"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    boolean b6 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToRoot();
    boolean b10 = hierarchyPropertyParser2.goDown(".");
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.add("null(0)[null](0)[null]\n");
    int i14 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test032"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    int i11 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.childrenValues();
    boolean b15 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    int i16 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test033"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    boolean b6 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build(".", ".");
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n");
    boolean b17 = hierarchyPropertyParser2.goDown("hi!");
    int i18 = hierarchyPropertyParser2.depth();
    int i19 = hierarchyPropertyParser2.getLevel();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test034"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    boolean b7 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]\n");
    boolean b15 = hierarchyPropertyParser2.isHierachic(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test035"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str12 = hierarchyPropertyParser2.fullValue();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    java.lang.String str14 = hierarchyPropertyParser2.fullValue();
    int i15 = hierarchyPropertyParser2.numChildren();
    boolean b17 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test036"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.goToChild("hi!");
    int i6 = hierarchyPropertyParser2.numChildren();
    int i7 = hierarchyPropertyParser2.depth();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    int i9 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test037"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    hierarchyPropertyParser2.build("hi!(0)[null]\n", "null(0)[null]\n");
    hierarchyPropertyParser2.add("null(0)[null]");
    boolean b19 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.util.Vector vector20 = null;
    int i22 = hierarchyPropertyParser2.search(vector20, "(0)[null]\n(0)[null]\n");
    java.lang.String[] str_array23 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array23);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test038"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.goToParent();
    boolean b12 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    boolean b15 = hierarchyPropertyParser2.goDown("null(0)[null](0)[null]\n");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test039"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, ".");
    boolean b13 = hierarchyPropertyParser2.isLeafReached();
    int i14 = hierarchyPropertyParser2.numChildren();
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, ".");
    java.lang.String str18 = hierarchyPropertyParser2.context();
    java.lang.String str19 = hierarchyPropertyParser2.getValue();
    int i20 = hierarchyPropertyParser2.getLevel();
    int i21 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test040"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser2.search(vector6, "");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.build("", "null(0)[null]");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test041"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b12 = hierarchyPropertyParser2.isHierachic(".(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToParent();
    boolean b18 = hierarchyPropertyParser2.goDown("null(0)[null]\n(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "."+ "'", str6.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test042"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    boolean b8 = hierarchyPropertyParser2.goToChild("");
    int i9 = hierarchyPropertyParser2.numChildren();
    boolean b11 = hierarchyPropertyParser2.goToChild(".");
    int i12 = hierarchyPropertyParser2.depth();
    boolean b13 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test043"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.depth();
    int i7 = hierarchyPropertyParser2.numChildren();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, ".");
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    int i12 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test044"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    boolean b8 = hierarchyPropertyParser2.goDown(".");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test045"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test046"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    int i12 = hierarchyPropertyParser2.numChildren();
    boolean b14 = hierarchyPropertyParser2.contains(".");
    hierarchyPropertyParser2.add(".");
    hierarchyPropertyParser2.build("null(0)[null]\n", "(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test047"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser2.search(vector6, "null(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.context();
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    int i11 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str13 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test048"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String str5 = hierarchyPropertyParser2.showTree();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test049"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test050"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    boolean b8 = hierarchyPropertyParser2.goTo("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    int i10 = hierarchyPropertyParser2.numChildren();
    int i11 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array12);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test051"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str10 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test052"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    boolean b11 = hierarchyPropertyParser2.goToChild("");
    int i12 = hierarchyPropertyParser2.depth();
    int i13 = hierarchyPropertyParser2.getLevel();
    java.lang.String str14 = hierarchyPropertyParser2.getSeperator();
    boolean b16 = hierarchyPropertyParser2.goDown("hi!");
    boolean b18 = hierarchyPropertyParser2.contains("hi!");
    boolean b20 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    int i21 = hierarchyPropertyParser2.numChildren();
    boolean b22 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "."+ "'", str14.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test053"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.add("hi!");
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    boolean b14 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String str15 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!(0)[null]\n"+ "'", str12.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test054"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser2.search(vector5, ".");
    hierarchyPropertyParser2.build("", "hi!(0)[null]\n(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test055"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.add("hi!");
    int i10 = hierarchyPropertyParser2.numChildren();
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "."+ "'", str13.equals("."));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test056"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    int i9 = hierarchyPropertyParser2.numChildren();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b12 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    int i14 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.build("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test057"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    boolean b2 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.setSeperator("hi!");
    int i5 = hierarchyPropertyParser0.depth();
    java.lang.String str6 = hierarchyPropertyParser0.getValue();
    java.lang.String str7 = hierarchyPropertyParser0.showTree();
    int i8 = hierarchyPropertyParser0.getLevel();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser0.search(vector9, ".(0)[null]\n");
    java.lang.String[] str_array12 = hierarchyPropertyParser0.childrenValues();
    boolean b13 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test058"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test059"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    int i12 = hierarchyPropertyParser2.getLevel();
    int i13 = hierarchyPropertyParser2.depth();
    boolean b15 = hierarchyPropertyParser2.goToChild("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test060"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    int i5 = hierarchyPropertyParser2.depth();
    boolean b7 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    int i9 = hierarchyPropertyParser2.getLevel();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test061"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    boolean b6 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build(".", ".");
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str17 = hierarchyPropertyParser2.parentValue();
    int i18 = hierarchyPropertyParser2.depth();
    int i19 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test062"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String[] str_array10 = hierarchyPropertyParser2.tokenize(".");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test063"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    int i12 = hierarchyPropertyParser2.numChildren();
    boolean b14 = hierarchyPropertyParser2.contains(".");
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
    boolean b19 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test064"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    boolean b11 = hierarchyPropertyParser2.contains("null(0)[null]\n(0)[null]\n");
    int i12 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test065"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    java.lang.String str11 = hierarchyPropertyParser2.context();
    int i12 = hierarchyPropertyParser2.getLevel();
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, ".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test066"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    int i7 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator("");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.setSeperator("");
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, "null(0)[null]\n");
    boolean b17 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test067"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("");
    int i13 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String str16 = hierarchyPropertyParser2.getValue();
    java.lang.String str17 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test068"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator(".");
    java.util.Vector vector16 = null;
    int i18 = hierarchyPropertyParser2.search(vector16, "hi!(0)[null]\n");
    boolean b20 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str21 = hierarchyPropertyParser2.fullValue();
    boolean b23 = hierarchyPropertyParser2.goDown("null(0)[null]\n(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test069"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str2 = hierarchyPropertyParser0.fullValue();
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    boolean b4 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test070"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    boolean b12 = hierarchyPropertyParser2.goToChild(".");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array16 = hierarchyPropertyParser2.tokenize("hi!(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test071"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str12 = hierarchyPropertyParser2.context();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test072"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    int i12 = hierarchyPropertyParser2.numChildren();
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test073"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    int i9 = hierarchyPropertyParser2.depth();
    boolean b11 = hierarchyPropertyParser2.goTo("(0)[null]\n");
    hierarchyPropertyParser2.add("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!(0)[null]\n"+ "'", str7.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!(0)[null]\n"+ "'", str8.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test074"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    boolean b2 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.setSeperator("hi!");
    int i5 = hierarchyPropertyParser0.depth();
    java.lang.String str6 = hierarchyPropertyParser0.getValue();
    java.lang.String str7 = hierarchyPropertyParser0.fullValue();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str9 = hierarchyPropertyParser0.getSeperator();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str11 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test075"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    boolean b8 = hierarchyPropertyParser2.goTo("null(0)[null]\n");
    int i9 = hierarchyPropertyParser2.numChildren();
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "hi!(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.isHierachic("");
    boolean b15 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    boolean b18 = hierarchyPropertyParser2.goTo("hi!(0)[null]");
    boolean b19 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test076"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.add("hi!");
    boolean b15 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    int i16 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test077"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str7 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, ".");
    boolean b14 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "."+ "'", str6.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test078"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    boolean b11 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str18 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.add("(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null(0)[null]\n"+ "'", str18.equals("null(0)[null]\n"));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test079"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    int i8 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.build("", "null(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    java.lang.String[] str_array15 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test080"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.getSeperator();
    boolean b3 = hierarchyPropertyParser0.goToChild("");
    java.util.Vector vector4 = null;
    int i6 = hierarchyPropertyParser0.search(vector4, "null(0)[null]");
    boolean b8 = hierarchyPropertyParser0.goToChild("");
    boolean b9 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "."+ "'", str1.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test081"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToRoot();
    int i9 = hierarchyPropertyParser2.getLevel();
    int i10 = hierarchyPropertyParser2.depth();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!(0)[null]\n"+ "'", str7.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test082"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.add("hi!");
    boolean b13 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test083"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    java.lang.String[] str_array3 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!(0)[null]\n");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!(0)[null]\n"+ "'", str8.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test084"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    int i13 = hierarchyPropertyParser2.getLevel();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild(0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test085"); }


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
    int i15 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test086"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    int i12 = hierarchyPropertyParser2.depth();
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str14 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str15 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    boolean b19 = hierarchyPropertyParser2.goTo("hi!(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test087"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("");
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    int i11 = hierarchyPropertyParser2.depth();
    boolean b13 = hierarchyPropertyParser2.goDown("null(0)[null]\n(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test088"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    hierarchyPropertyParser2.goToParent();
    int i12 = hierarchyPropertyParser2.depth();
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = hierarchyPropertyParser2.goTo("(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test089"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    boolean b11 = hierarchyPropertyParser2.contains("hi!");
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    boolean b16 = hierarchyPropertyParser2.goDown("null(0)[null]");
    java.util.Vector vector17 = null;
    int i19 = hierarchyPropertyParser2.search(vector17, "null(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test090"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    java.lang.String str12 = hierarchyPropertyParser2.getValue();
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    boolean b14 = hierarchyPropertyParser2.isLeafReached();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!(0)[null]\n"+ "'", str11.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!(0)[null]\n"+ "'", str13.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test091"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n(0)[null]");

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test092"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    boolean b11 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]");
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test093"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    int i9 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.goToRoot();
    boolean b13 = hierarchyPropertyParser2.goDown(".(0)[null]\n");
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, "hi!(0)[null]\n(0)[null]\n");
    int i17 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test094"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    int i7 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    boolean b10 = hierarchyPropertyParser2.goToChild(".");
    boolean b12 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test095"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test096"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    boolean b3 = hierarchyPropertyParser0.contains("hi!");
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.contains("hi!");
    boolean b8 = hierarchyPropertyParser0.goDown("hi!(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test097"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.tokenize(".");
    hierarchyPropertyParser2.build("", "hi!(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test098"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    boolean b6 = hierarchyPropertyParser2.goToChild("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "hi!(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str13 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test099"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    int i7 = hierarchyPropertyParser2.depth();
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "."+ "'", str6.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test100"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    int i9 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    int i11 = hierarchyPropertyParser2.getLevel();
    boolean b13 = hierarchyPropertyParser2.goToChild("hi!(0)[null]");
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, ".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test101"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.showTree();
    java.lang.String str7 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.setSeperator("");
    int i12 = hierarchyPropertyParser2.getLevel();
    boolean b14 = hierarchyPropertyParser2.contains("(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!(0)[null]\n"+ "'", str6.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test102"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    boolean b6 = hierarchyPropertyParser2.goToChild(".");
    int i7 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test103"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b9 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("hi!");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.add(".(0)[null]\n");
    boolean b17 = hierarchyPropertyParser2.goTo("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test104"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.depth();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test105"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str9 = hierarchyPropertyParser2.context();
    boolean b11 = hierarchyPropertyParser2.goDown("hi!(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str13 = hierarchyPropertyParser2.fullValue();
    java.lang.String str14 = hierarchyPropertyParser2.fullValue();
    java.lang.String[] str_array16 = hierarchyPropertyParser2.tokenize("null(0)[null]\n(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test106"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array2 = hierarchyPropertyParser0.childrenValues();
    boolean b3 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser0.parentValue();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    hierarchyPropertyParser0.goToParent();
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test107"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector11 = null;
    int i13 = hierarchyPropertyParser2.search(vector11, "hi!");
    hierarchyPropertyParser2.add("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test108"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str13 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test109"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    boolean b6 = hierarchyPropertyParser2.goToChild("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str9 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    boolean b15 = hierarchyPropertyParser2.goToChild("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test110"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test111"); }


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
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
    java.lang.String[] str_array21 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test112"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    boolean b7 = hierarchyPropertyParser2.isLeafReached();
    boolean b9 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    int i10 = hierarchyPropertyParser2.depth();
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "hi!(0)[null]");
    hierarchyPropertyParser2.goToParent();
    int i16 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test113"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    boolean b11 = hierarchyPropertyParser2.goToChild("");
    int i12 = hierarchyPropertyParser2.depth();
    int i13 = hierarchyPropertyParser2.getLevel();
    java.lang.String str14 = hierarchyPropertyParser2.getSeperator();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build("hi!(0)[null]\n", "null(0)[null]");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "."+ "'", str14.equals("."));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test114"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    boolean b8 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]");
    java.lang.String str12 = hierarchyPropertyParser2.context();
    boolean b14 = hierarchyPropertyParser2.goDown("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test115"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    int i8 = hierarchyPropertyParser2.depth();
    boolean b10 = hierarchyPropertyParser2.goToChild(".");
    boolean b12 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    int i13 = hierarchyPropertyParser2.numChildren();
    int i14 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test116"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.setSeperator("null(0)[null]");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array16);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test117"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    boolean b11 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str14 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array16 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    int i17 = hierarchyPropertyParser2.depth();
    java.lang.String str18 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.add("null(0)[null]\n(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test118"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    boolean b8 = hierarchyPropertyParser2.isHierachic("null(0)[null]");
    boolean b10 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test119"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str8 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.tokenize("(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test120"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    boolean b6 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build(".", ".");
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str17 = hierarchyPropertyParser2.parentValue();
    boolean b19 = hierarchyPropertyParser2.contains("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test121"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser2.isHierachic("");
    boolean b11 = hierarchyPropertyParser2.goToChild(".");
    boolean b13 = hierarchyPropertyParser2.goToChild("null(0)[null]\n(0)[null]\n");
    java.lang.String str14 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test122"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    boolean b8 = hierarchyPropertyParser2.goTo("null(0)[null]\n");
    int i9 = hierarchyPropertyParser2.numChildren();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    boolean b14 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.add("null(0)[null]\n(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test123"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    int i11 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToParent();
    int i13 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    boolean b16 = hierarchyPropertyParser2.contains("hi!(0)[null]\n(0)[null]\n");
    java.lang.String str17 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test124"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    boolean b6 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.add("null(0)[null]\n(0)[null]\n");
    boolean b17 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test125"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test126"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    int i12 = hierarchyPropertyParser2.depth();
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    boolean b15 = hierarchyPropertyParser2.goDown("hi!");
    int i16 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.build("", ".");
    int i20 = hierarchyPropertyParser2.depth();
    int i21 = hierarchyPropertyParser2.numChildren();
    int i22 = hierarchyPropertyParser2.getLevel();
    int i23 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.setSeperator("(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test127"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    boolean b10 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.add("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test128"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize(".");
    boolean b11 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test129"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    boolean b7 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    int i9 = hierarchyPropertyParser2.depth();
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "hi!(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test130"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    boolean b8 = hierarchyPropertyParser2.goTo("null(0)[null]\n");
    int i9 = hierarchyPropertyParser2.numChildren();
    int i10 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    boolean b13 = hierarchyPropertyParser2.goToChild("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test131"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b9 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    int i11 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, "null(0)[null]");
    int i16 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test132"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    int i12 = hierarchyPropertyParser2.depth();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    int i14 = hierarchyPropertyParser2.numChildren();
    int i15 = hierarchyPropertyParser2.numChildren();
    java.lang.String str16 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str17 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test133"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b12 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    boolean b15 = hierarchyPropertyParser2.isHierachic("hi!");
    int i16 = hierarchyPropertyParser2.depth();
    int i17 = hierarchyPropertyParser2.depth();
    java.lang.String str18 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "."+ "'", str18.equals("."));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test134"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    boolean b6 = hierarchyPropertyParser2.goToChild("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    boolean b14 = hierarchyPropertyParser2.contains("hi!(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test135"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "hi!");
    boolean b11 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str13 = hierarchyPropertyParser2.fullValue();
    boolean b14 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test136"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    boolean b6 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test137"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    boolean b9 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.util.Vector vector11 = null;
    int i13 = hierarchyPropertyParser2.search(vector11, "null(0)[null]");
    int i14 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!(0)[null]\n"+ "'", str10.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test138"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    boolean b8 = hierarchyPropertyParser2.goTo("null(0)[null]\n");
    int i9 = hierarchyPropertyParser2.numChildren();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str14 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array16 = hierarchyPropertyParser2.tokenize("hi!(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!(0)[null]\n"+ "'", str14.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test139"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!(0)[null](0)[null]\n", "");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test140"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.goToChild(".");
    int i11 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test141"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.setSeperator("");
    boolean b12 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    int i13 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test142"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    boolean b8 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str11 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test143"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "hi!(0)[null]\n(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test144"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.build("(0)[null]\n", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test145"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.build("", "null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test146"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.getSeperator();
    boolean b3 = hierarchyPropertyParser0.goToChild("");
    boolean b4 = hierarchyPropertyParser0.isRootReached();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "."+ "'", str1.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test147"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.goToRoot();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, ".");
    java.lang.String str15 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test148"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.numChildren();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    boolean b8 = hierarchyPropertyParser2.isRootReached();
    boolean b10 = hierarchyPropertyParser2.goDown("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test149"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.numChildren();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goDown(".");
    int i10 = hierarchyPropertyParser2.depth();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test150"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b9 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    int i11 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToParent();
    boolean b15 = hierarchyPropertyParser2.goDown("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test151"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    boolean b6 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    int i9 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, "hi!(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test152"); }


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
    int i19 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null(0)[null]\n"+ "'", str18.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test153"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "null(0)[null]\n(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goToChild("(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test154"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.add("hi!");
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    boolean b14 = hierarchyPropertyParser2.goToChild("hi!");
    int i15 = hierarchyPropertyParser2.numChildren();
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = hierarchyPropertyParser2.contains("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!(0)[null]\n"+ "'", str12.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test155"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.getSeperator();
    boolean b3 = hierarchyPropertyParser0.goToChild("");
    boolean b4 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser0.fullValue();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "."+ "'", str1.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test156"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "hi!");
    boolean b11 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, "hi!(0)[null]\n");
    boolean b17 = hierarchyPropertyParser2.goDown("(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test157"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser2.search(vector6, "null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.goToChild(".");
    boolean b16 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test158"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToParent();
    boolean b9 = hierarchyPropertyParser2.goTo(".");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    boolean b13 = hierarchyPropertyParser2.goDown(".");
    hierarchyPropertyParser2.goToParent();
    boolean b15 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test159"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    hierarchyPropertyParser2.build("hi!(0)[null]\n", "null(0)[null]\n");
    int i16 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test160"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, ".");
    boolean b13 = hierarchyPropertyParser2.isLeafReached();
    int i14 = hierarchyPropertyParser2.getLevel();
    java.lang.String str15 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test161"); }


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
    boolean b19 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str20 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array21 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test162"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    int i10 = hierarchyPropertyParser2.numChildren();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    boolean b13 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator(".");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str17 = hierarchyPropertyParser2.showTree();
    boolean b18 = hierarchyPropertyParser2.isLeafReached();
    int i19 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null(0)[null]\n"+ "'", str17.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test163"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.util.Vector vector11 = null;
    int i13 = hierarchyPropertyParser2.search(vector11, "hi!(0)[null]");
    int i14 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test164"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.setSeperator("null(0)[null]");
    java.lang.String str16 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str17 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(0)[null]"+ "'", str16.equals("null(0)[null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test165"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    int i10 = hierarchyPropertyParser2.numChildren();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.add("(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test166"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String[] str_array10 = hierarchyPropertyParser2.tokenize(".");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    int i14 = hierarchyPropertyParser2.depth();
    boolean b16 = hierarchyPropertyParser2.goToChild("(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test167"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    java.lang.String str14 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test168"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.numChildren();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    boolean b9 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b12 = hierarchyPropertyParser2.goToChild("");
    int i13 = hierarchyPropertyParser2.depth();
    boolean b15 = hierarchyPropertyParser2.isHierachic("(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test169"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    boolean b2 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.setSeperator("hi!");
    int i5 = hierarchyPropertyParser0.depth();
    java.lang.String str6 = hierarchyPropertyParser0.getValue();
    java.lang.String str7 = hierarchyPropertyParser0.fullValue();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("hi!");
    hierarchyPropertyParser0.goToParent();
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = hierarchyPropertyParser0.contains("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test170"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.numChildren();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.add("hi!(0)[null]\n");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test171"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("hi!(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("");

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test172"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b9 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    boolean b14 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    boolean b18 = hierarchyPropertyParser2.contains("(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test173"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("(0)[null](0)[null]\n", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test174"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    boolean b8 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, ".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test175"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    int i12 = hierarchyPropertyParser2.depth();
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    boolean b15 = hierarchyPropertyParser2.goDown("hi!");
    int i16 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.build("", ".");
    int i20 = hierarchyPropertyParser2.depth();
    int i21 = hierarchyPropertyParser2.numChildren();
    int i22 = hierarchyPropertyParser2.getLevel();
    int i23 = hierarchyPropertyParser2.numChildren();
    boolean b25 = hierarchyPropertyParser2.contains(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test176"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!(0)[null]", "null(0)[null]\n(0)[null]");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test177"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    boolean b10 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    int i13 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test178"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test179"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b9 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.goDown(".");
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    boolean b15 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test180"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!(0)[null]\n");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    int i6 = hierarchyPropertyParser2.depth();
    boolean b8 = hierarchyPropertyParser2.goDown("hi!(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test181"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.build("hi!", "hi!");
    boolean b13 = hierarchyPropertyParser2.contains("hi!");
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, "hi!");
    int i17 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test182"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.depth();
    boolean b6 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    hierarchyPropertyParser2.setSeperator(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test183"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    boolean b2 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.setSeperator("hi!");
    int i5 = hierarchyPropertyParser0.depth();
    java.lang.String str6 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize(".");
    boolean b10 = hierarchyPropertyParser0.goToChild("");
    int i11 = hierarchyPropertyParser0.depth();
    boolean b13 = hierarchyPropertyParser0.goDown("(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test184"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    boolean b9 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser2.isRootReached();
    boolean b15 = hierarchyPropertyParser2.goDown("hi!(0)[null]");
    java.util.Vector vector16 = null;
    int i18 = hierarchyPropertyParser2.search(vector16, "null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test185"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    int i8 = hierarchyPropertyParser2.getLevel();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.setSeperator(".");
    boolean b13 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test186"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    boolean b2 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    boolean b8 = hierarchyPropertyParser0.goDown("hi!(0)[null]\n");
    java.lang.String[] str_array10 = hierarchyPropertyParser0.tokenize("");
    int i11 = hierarchyPropertyParser0.depth();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser0.search(vector12, "");
    boolean b16 = hierarchyPropertyParser0.goDown("null(0)[null]");
    boolean b18 = hierarchyPropertyParser0.goToChild("");
    java.lang.String str19 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test187"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToParent();
    boolean b9 = hierarchyPropertyParser2.goTo(".");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b12 = hierarchyPropertyParser2.goDown(".");
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    int i14 = hierarchyPropertyParser2.getLevel();
    java.lang.String str15 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "."+ "'", str13.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test188"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser2.search(vector6, "");
    hierarchyPropertyParser2.add("null(0)[null]\n(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    java.lang.String str12 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n(0)[null]\n"+ "'", str11.equals("null(0)[null]\n(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n(0)[null]\n"+ "'", str12.equals("null(0)[null]\n(0)[null]\n"));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test189"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    boolean b8 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    int i10 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToParent();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "hi!(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test190"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "null(0)[null]\n");
    hierarchyPropertyParser2.build("hi!", "null(0)[null]\n");
    int i13 = hierarchyPropertyParser2.depth();
    boolean b15 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str17 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test191"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    boolean b11 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    int i17 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test192"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    boolean b13 = hierarchyPropertyParser2.goDown(".");
    boolean b15 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String str16 = hierarchyPropertyParser2.fullValue();
    java.lang.String str17 = hierarchyPropertyParser2.showTree();
    java.lang.String str18 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null(0)[null]\n"+ "'", str17.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test193"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    boolean b12 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    int i13 = hierarchyPropertyParser2.numChildren();
    java.lang.String str14 = hierarchyPropertyParser2.parentValue();
    java.lang.String str15 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test194"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    boolean b6 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test195"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!(0)[null]\n"+ "'", str6.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test196"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    boolean b12 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    int i13 = hierarchyPropertyParser2.numChildren();
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, "null(0)[null]\n");
    boolean b17 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str18 = hierarchyPropertyParser2.fullValue();
    java.lang.String str19 = hierarchyPropertyParser2.fullValue();
    java.lang.String str20 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test197"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.context();
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    java.lang.String str12 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test198"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    boolean b5 = hierarchyPropertyParser2.isLeafReached();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser2.search(vector6, "null(0)[null]");
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test199"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    int i12 = hierarchyPropertyParser2.getLevel();
    boolean b13 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str14 = hierarchyPropertyParser2.parentValue();
    java.lang.String str15 = hierarchyPropertyParser2.context();
    boolean b17 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test200"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    int i12 = hierarchyPropertyParser2.numChildren();
    boolean b14 = hierarchyPropertyParser2.contains(".");
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
    boolean b19 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");
    int i20 = hierarchyPropertyParser2.depth();
    java.lang.String str21 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "null(0)[null]"+ "'", str21.equals("null(0)[null]"));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test201"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    boolean b7 = hierarchyPropertyParser2.isLeafReached();
    boolean b9 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b12 = hierarchyPropertyParser2.goToChild("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.add("null(0)[null]");
    boolean b15 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test202"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    int i9 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    int i11 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.build("(0)[null]\n(0)[null]\n", "null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test203"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.depth();
    int i7 = hierarchyPropertyParser2.numChildren();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, ".");
    java.util.Vector vector11 = null;
    int i13 = hierarchyPropertyParser2.search(vector11, "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test204"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.depth();
    int i9 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test205"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b12 = hierarchyPropertyParser2.isHierachic(".");
    hierarchyPropertyParser2.setSeperator("(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test206"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.numChildren();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    int i8 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test207"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.add("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test208"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    int i7 = hierarchyPropertyParser2.depth();
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test209"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    java.lang.String str12 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.setSeperator("(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test210"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    boolean b11 = hierarchyPropertyParser2.contains("hi!");
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str14 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]\n");
    boolean b18 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "."+ "'", str14.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test211"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    boolean b8 = hierarchyPropertyParser2.goToChild("");
    boolean b10 = hierarchyPropertyParser2.goTo("");
    int i11 = hierarchyPropertyParser2.getLevel();
    java.lang.String str12 = hierarchyPropertyParser2.getValue();
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "."+ "'", str13.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test212"); }


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
    java.lang.String str17 = hierarchyPropertyParser2.context();
    java.lang.String str18 = hierarchyPropertyParser2.showTree();
    boolean b19 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null(0)[null]\n"+ "'", str18.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test213"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    boolean b2 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    hierarchyPropertyParser0.add("null(0)[null]\n");
    int i9 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array11);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test214"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!(0)[null](0)[null]\n", "(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test215"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    int i7 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator("");
    int i10 = hierarchyPropertyParser2.depth();
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "hi!");
    java.lang.String str15 = hierarchyPropertyParser2.getSeperator();
    int i16 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test216"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToParent();
    boolean b9 = hierarchyPropertyParser2.goTo(".");
    int i10 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str16 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!(0)[null]\n"+ "'", str16.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test217"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    int i7 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test218"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]", "hi!(0)[null]\n");
    java.lang.String[] str_array3 = hierarchyPropertyParser2.childrenValues();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build("hi!(0)[null](0)[null]\n", ".");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test219"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, ".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test220"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    boolean b11 = hierarchyPropertyParser2.contains("hi!");
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    boolean b16 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String str17 = hierarchyPropertyParser2.context();
    boolean b19 = hierarchyPropertyParser2.isHierachic("hi!");
    int i20 = hierarchyPropertyParser2.depth();
    boolean b22 = hierarchyPropertyParser2.contains(".(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test221"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n");
    int i14 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.add("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test222"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    int i7 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test223"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b9 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    boolean b14 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]");
    java.lang.String[] str_array18 = hierarchyPropertyParser2.tokenize("(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test224"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    boolean b11 = hierarchyPropertyParser2.goToChild("");
    int i12 = hierarchyPropertyParser2.depth();
    int i13 = hierarchyPropertyParser2.getLevel();
    java.lang.String str14 = hierarchyPropertyParser2.getSeperator();
    boolean b16 = hierarchyPropertyParser2.goDown("hi!");
    boolean b18 = hierarchyPropertyParser2.contains("hi!");
    boolean b20 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    int i21 = hierarchyPropertyParser2.numChildren();
    java.lang.String str22 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "."+ "'", str14.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test225"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    boolean b8 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    int i9 = hierarchyPropertyParser2.getLevel();
    int i10 = hierarchyPropertyParser2.depth();
    java.util.Vector vector11 = null;
    int i13 = hierarchyPropertyParser2.search(vector11, "hi!(0)[null]\n");
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, "null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test226"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    boolean b14 = hierarchyPropertyParser2.goDown(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!(0)[null]\n"+ "'", str11.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test227"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    boolean b11 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    int i13 = hierarchyPropertyParser2.numChildren();
    java.lang.String str14 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test228"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    boolean b3 = hierarchyPropertyParser0.contains("hi!");
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.contains("hi!");
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test229"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b9 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    boolean b14 = hierarchyPropertyParser2.isRootReached();
    boolean b15 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str16 = hierarchyPropertyParser2.context();
    boolean b18 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    boolean b20 = hierarchyPropertyParser2.goDown("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test230"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.add("hi!");
    boolean b11 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser2.goTo("null(0)[null]\n");
    java.lang.String str14 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array15 = hierarchyPropertyParser2.childrenValues();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build("hi!(0)[null](0)[null]\n", "(0)[null]\n(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array15);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test231"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.getValue();
    int i7 = hierarchyPropertyParser2.depth();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test232"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.build("", "hi!");
    java.lang.String str7 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.contains("(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test233"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    java.lang.String str11 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test234"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test235"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.goToRoot();
    boolean b10 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    java.lang.String[] str_array15 = hierarchyPropertyParser2.tokenize("null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test236"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    boolean b6 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build("", "");
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, "null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test237"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test238"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b9 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    java.lang.String[] str_array15 = hierarchyPropertyParser2.tokenize("");
    int i16 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.build("(0)[null]\n", "null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test239"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.add("hi!");
    boolean b11 = hierarchyPropertyParser2.goDown("");
    int i12 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test240"); }


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
    java.lang.String[] str_array17 = hierarchyPropertyParser2.tokenize(".");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.add("null(0)[null]\n(0)[null]\n");
    int i21 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test241"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "null(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.contains(".");
    java.lang.String str15 = hierarchyPropertyParser2.showTree();
    java.lang.String str16 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str17 = hierarchyPropertyParser2.showTree();
    java.util.Vector vector18 = null;
    int i20 = hierarchyPropertyParser2.search(vector18, "hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null(0)[null]\n"+ "'", str17.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test242"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "hi!");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "."+ "'", str6.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test243"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.build("hi!", "hi!");
    int i12 = hierarchyPropertyParser2.numChildren();
    int i13 = hierarchyPropertyParser2.depth();
    int i14 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test244"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser2.search(vector5, ".");
    hierarchyPropertyParser2.build("", "hi!(0)[null]\n(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test245"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    int i7 = hierarchyPropertyParser2.getLevel();
    int i8 = hierarchyPropertyParser2.depth();
    int i9 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test246"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, "(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test247"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.isHierachic("(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test248"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    boolean b8 = hierarchyPropertyParser2.goTo("null(0)[null]\n");
    int i9 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.setSeperator("null(0)[null]");
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "null(0)[null](0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test249"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "hi!");
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    int i13 = hierarchyPropertyParser2.getLevel();
    boolean b14 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str15 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test250"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    int i10 = hierarchyPropertyParser2.numChildren();
    boolean b12 = hierarchyPropertyParser2.goToChild(".");
    int i13 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test251"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    int i14 = hierarchyPropertyParser2.depth();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild(1);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!(0)[null]\n"+ "'", str13.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test252"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    int i11 = hierarchyPropertyParser2.numChildren();
    boolean b13 = hierarchyPropertyParser2.goToChild(".");
    int i14 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test253"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    boolean b5 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test254"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    int i9 = hierarchyPropertyParser2.numChildren();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b12 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array14 = hierarchyPropertyParser2.tokenize("");
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, ".(0)[null]\n");
    boolean b19 = hierarchyPropertyParser2.goDown("null(0)[null](0)[null]\n");
    java.lang.String[] str_array21 = hierarchyPropertyParser2.tokenize(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test255"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    hierarchyPropertyParser2.build("hi!(0)[null]\n", "null(0)[null]\n");
    boolean b17 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str19 = hierarchyPropertyParser2.fullValue();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test256"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "null(0)[null]\n(0)[null]\n");
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str12 = hierarchyPropertyParser2.context();
    java.lang.String str13 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test257"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    hierarchyPropertyParser2.add("hi!");
    boolean b13 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str14 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!(0)[null]\n"+ "'", str14.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test258"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    int i7 = hierarchyPropertyParser2.depth();
    boolean b9 = hierarchyPropertyParser2.isHierachic(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test259"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, ".");
    java.lang.String str13 = hierarchyPropertyParser2.context();
    java.lang.String str14 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test260"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    boolean b13 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    java.lang.String str15 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array16 = hierarchyPropertyParser2.childrenValues();
    int i17 = hierarchyPropertyParser2.numChildren();
    java.lang.String str18 = hierarchyPropertyParser2.context();
    java.lang.String str19 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null(0)[null]\n"+ "'", str19.equals("null(0)[null]\n"));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test261"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToParent();
    boolean b9 = hierarchyPropertyParser2.goTo(".");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    boolean b13 = hierarchyPropertyParser2.goDown(".");
    java.lang.String str14 = hierarchyPropertyParser2.fullValue();
    boolean b15 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test262"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    boolean b8 = hierarchyPropertyParser2.goTo("null(0)[null]\n");
    int i9 = hierarchyPropertyParser2.numChildren();
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "hi!(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.isHierachic("");
    boolean b15 = hierarchyPropertyParser2.isLeafReached();
    boolean b16 = hierarchyPropertyParser2.isRootReached();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild(1);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test263"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.add("(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test264"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    hierarchyPropertyParser2.goToParent();
    int i12 = hierarchyPropertyParser2.depth();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test265"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    int i12 = hierarchyPropertyParser2.numChildren();
    int i13 = hierarchyPropertyParser2.getLevel();
    int i14 = hierarchyPropertyParser2.depth();
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, "null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test266"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b9 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    int i12 = hierarchyPropertyParser2.getLevel();
    boolean b14 = hierarchyPropertyParser2.goDown(".");
    java.lang.String str15 = hierarchyPropertyParser2.fullValue();
    boolean b17 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test267"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.isHierachic(".");
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test268"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    int i7 = hierarchyPropertyParser2.depth();
    boolean b9 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b11 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize("null(0)[null]\n(0)[null]\n");
    java.lang.String str14 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test269"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b12 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    boolean b17 = hierarchyPropertyParser2.goDown("null(0)[null]\n(0)[null]\n");
    boolean b19 = hierarchyPropertyParser2.goTo(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test270"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("");
    int i13 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.setSeperator(".");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.add("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test271"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    int i9 = hierarchyPropertyParser2.numChildren();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b12 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array14 = hierarchyPropertyParser2.tokenize("");
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, ".(0)[null]\n");
    boolean b19 = hierarchyPropertyParser2.goDown("null(0)[null](0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test272"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    boolean b8 = hierarchyPropertyParser2.goTo("null(0)[null]\n");
    int i9 = hierarchyPropertyParser2.numChildren();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str14 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "."+ "'", str13.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "."+ "'", str14.equals("."));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test273"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    int i9 = hierarchyPropertyParser2.depth();
    int i10 = hierarchyPropertyParser2.numChildren();
    boolean b12 = hierarchyPropertyParser2.contains(".");
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test274"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser2.search(vector6, "null(0)[null]\n");
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser2.goToChild("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test275"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b9 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    int i12 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    boolean b16 = hierarchyPropertyParser2.goDown("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test276"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b12 = hierarchyPropertyParser2.contains("(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test277"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    int i9 = hierarchyPropertyParser2.numChildren();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b12 = hierarchyPropertyParser2.isHierachic("hi!");
    hierarchyPropertyParser2.setSeperator("");
    int i15 = hierarchyPropertyParser2.depth();
    java.lang.String str16 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test278"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.showTree();
    java.lang.String str7 = hierarchyPropertyParser2.context();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goTo("");
    boolean b12 = hierarchyPropertyParser2.goToChild("null(0)[null]");
    java.lang.String str13 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!(0)[null]\n"+ "'", str6.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test279"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.context();
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    int i12 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test280"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    int i12 = hierarchyPropertyParser2.depth();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    int i14 = hierarchyPropertyParser2.numChildren();
    java.lang.String str15 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array17 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test281"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToParent();
    boolean b10 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    hierarchyPropertyParser2.add("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test282"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.build("hi!", "");
    boolean b11 = hierarchyPropertyParser2.goDown("null(0)[null]\n(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build(".", "(0)[null]\n(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test283"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.add("hi!");
    int i14 = hierarchyPropertyParser2.getLevel();
    java.lang.String str15 = hierarchyPropertyParser2.fullValue();
    java.lang.String str16 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str18 = hierarchyPropertyParser2.fullValue();
    int i19 = hierarchyPropertyParser2.getLevel();
    boolean b20 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str21 = hierarchyPropertyParser2.getValue();
    boolean b23 = hierarchyPropertyParser2.goToChild("null(0)[null]");
    hierarchyPropertyParser2.setSeperator("(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test284"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("");
    int i7 = hierarchyPropertyParser2.depth();
    boolean b9 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test285"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("");
    boolean b13 = hierarchyPropertyParser2.isHierachic(".");
    java.lang.String str14 = hierarchyPropertyParser2.getSeperator();
    int i15 = hierarchyPropertyParser2.getLevel();
    java.lang.String str16 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test286"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser2.search(vector6, "");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test287"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    boolean b8 = hierarchyPropertyParser2.goToChild("");
    int i9 = hierarchyPropertyParser2.numChildren();
    boolean b11 = hierarchyPropertyParser2.goToChild(".");
    int i12 = hierarchyPropertyParser2.depth();
    java.lang.String str13 = hierarchyPropertyParser2.fullValue();
    boolean b15 = hierarchyPropertyParser2.goDown(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test288"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToParent();
    boolean b9 = hierarchyPropertyParser2.goTo(".");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    boolean b13 = hierarchyPropertyParser2.goToChild("hi!");
    boolean b15 = hierarchyPropertyParser2.contains("hi!");
    boolean b16 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str17 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test289"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b9 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test290"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    boolean b5 = hierarchyPropertyParser2.isLeafReached();
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test291"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    int i12 = hierarchyPropertyParser2.depth();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test292"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]", "null(0)[null](0)[null]\n");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser2.search(vector3, "(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.add("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test293"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    boolean b6 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    int i9 = hierarchyPropertyParser2.getLevel();
    int i10 = hierarchyPropertyParser2.getLevel();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test294"); }


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
    java.lang.String str15 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array17 = hierarchyPropertyParser2.tokenize("");
    boolean b19 = hierarchyPropertyParser2.contains("null(0)[null]\n(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "."+ "'", str15.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test295"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    boolean b10 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    boolean b13 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test296"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    int i10 = hierarchyPropertyParser2.getLevel();
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    java.lang.String str12 = hierarchyPropertyParser2.fullValue();
    java.lang.String str13 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test297"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("");
    int i7 = hierarchyPropertyParser2.depth();
    boolean b9 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test298"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    boolean b11 = hierarchyPropertyParser2.goDown("hi!(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test299"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("(0)[null]\n(0)[null]\n", "null(0)[null]\n(0)[null]");

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test300"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    boolean b6 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    int i10 = hierarchyPropertyParser2.depth();
    int i11 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.setSeperator("");
    boolean b15 = hierarchyPropertyParser2.goToChild("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test301"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    boolean b11 = hierarchyPropertyParser2.goToChild("");
    boolean b13 = hierarchyPropertyParser2.isHierachic("");
    boolean b15 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array17 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test302"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    boolean b11 = hierarchyPropertyParser2.contains("hi!");
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str17 = hierarchyPropertyParser2.fullValue();
    java.lang.String str18 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    boolean b21 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    boolean b23 = hierarchyPropertyParser2.isHierachic("(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test303"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
    hierarchyPropertyParser2.build("null(0)[null]\n", "hi!(0)[null]\n");
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    boolean b13 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test304"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    boolean b2 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.setSeperator("hi!");
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test305"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!(0)[null]");
    java.lang.String str3 = hierarchyPropertyParser2.context();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test306"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.add("hi!");
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test307"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test308"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    java.lang.String str13 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test309"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b11 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser2.goToChild(".");
    boolean b15 = hierarchyPropertyParser2.goDown("(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test310"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.build("", "");
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.add("hi!(0)[null]\n");
    int i14 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test311"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    boolean b5 = hierarchyPropertyParser2.isLeafReached();
    int i6 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test312"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    boolean b8 = hierarchyPropertyParser2.goToChild("hi!");
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "null(0)[null]\n(0)[null]\n");
    boolean b13 = hierarchyPropertyParser2.goDown("null(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "."+ "'", str6.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test313"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    boolean b8 = hierarchyPropertyParser2.goTo("null(0)[null]\n");
    int i9 = hierarchyPropertyParser2.numChildren();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, "(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test314"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    boolean b6 = hierarchyPropertyParser2.goToChild("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str9 = hierarchyPropertyParser2.context();
    int i10 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("null(0)[null](0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test315"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "hi!(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test316"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.build("", "hi!");
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "hi!(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test317"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    boolean b6 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test318"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.build("", "hi!");
    int i7 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test319"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize(".");
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    int i13 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test320"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    boolean b13 = hierarchyPropertyParser2.goDown(".");
    java.lang.String str14 = hierarchyPropertyParser2.parentValue();
    java.lang.String str15 = hierarchyPropertyParser2.showTree();
    java.util.Vector vector16 = null;
    int i18 = hierarchyPropertyParser2.search(vector16, "null(0)[null]\n");
    java.lang.String str19 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.add("(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null(0)[null]\n"+ "'", str19.equals("null(0)[null]\n"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test321"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "");
    boolean b16 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.add("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test322"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToParent();
    boolean b9 = hierarchyPropertyParser2.goTo(".");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b12 = hierarchyPropertyParser2.goDown(".");
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    int i14 = hierarchyPropertyParser2.getLevel();
    java.lang.String str15 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "."+ "'", str13.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!(0)[null]\n"+ "'", str15.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test323"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.build("hi!", "hi!");
    int i12 = hierarchyPropertyParser2.numChildren();
    int i13 = hierarchyPropertyParser2.depth();
    java.lang.String str14 = hierarchyPropertyParser2.showTree();
    int i15 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(0)[null]\n"+ "'", str14.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test324"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    boolean b2 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test325"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    int i7 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test326"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("(0)[null](0)[null]\n", ".");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test327"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.numChildren();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.build("hi!", "hi!(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test328"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize(".");
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    java.util.Vector vector11 = null;
    int i13 = hierarchyPropertyParser2.search(vector11, "hi!");
    java.lang.String str14 = hierarchyPropertyParser2.parentValue();
    boolean b16 = hierarchyPropertyParser2.goToChild("null(0)[null]");
    boolean b18 = hierarchyPropertyParser2.isHierachic("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test329"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test330"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    boolean b2 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.setSeperator("hi!");
    int i5 = hierarchyPropertyParser0.depth();
    java.lang.String str6 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize(".");
    boolean b10 = hierarchyPropertyParser0.goToChild("");
    int i11 = hierarchyPropertyParser0.depth();
    boolean b13 = hierarchyPropertyParser0.goDown("");
    java.lang.String str14 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test331"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    boolean b7 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    boolean b12 = hierarchyPropertyParser2.goDown("hi!");
    int i13 = hierarchyPropertyParser2.getLevel();
    java.lang.String str14 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(0)[null]\n"+ "'", str14.equals("null(0)[null]\n"));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test332"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    boolean b6 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test333"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.add("hi!");
    int i14 = hierarchyPropertyParser2.getLevel();
    java.lang.String str15 = hierarchyPropertyParser2.fullValue();
    java.lang.String str16 = hierarchyPropertyParser2.fullValue();
    java.util.Vector vector17 = null;
    int i19 = hierarchyPropertyParser2.search(vector17, "");
    int i20 = hierarchyPropertyParser2.depth();
    boolean b22 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test334"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.setSeperator(".");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "hi!");
    boolean b14 = hierarchyPropertyParser2.isHierachic("null(0)[null]");
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, "(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test335"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test336"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.goToParent();
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    boolean b12 = hierarchyPropertyParser2.isHierachic("(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test337"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    int i7 = hierarchyPropertyParser2.depth();
    boolean b9 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b11 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize("null(0)[null]\n(0)[null]\n");
    java.lang.String str14 = hierarchyPropertyParser2.context();
    java.lang.String str15 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "."+ "'", str15.equals("."));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test338"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize("(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.setSeperator(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test339"); }


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
    java.lang.String str20 = hierarchyPropertyParser2.showTree();
    boolean b22 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    java.util.Vector vector23 = null;
    int i25 = hierarchyPropertyParser2.search(vector23, "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null(0)[null]\n"+ "'", str20.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test340"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    int i9 = hierarchyPropertyParser2.numChildren();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b12 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array14 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str15 = hierarchyPropertyParser2.showTree();
    boolean b17 = hierarchyPropertyParser2.goToChild("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test341"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isHierachic(".");
    boolean b14 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    boolean b16 = hierarchyPropertyParser2.goDown("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test342"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.showTree();
    java.lang.String str7 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.setSeperator("");
    int i12 = hierarchyPropertyParser2.getLevel();
    boolean b14 = hierarchyPropertyParser2.goToChild("null(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!(0)[null]\n"+ "'", str6.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test343"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("");
    int i7 = hierarchyPropertyParser2.depth();
    boolean b9 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.build("", "hi!");
    java.lang.String str14 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array15 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test344"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    boolean b2 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    java.lang.String str7 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test345"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.build("null(0)[null]\n", "");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test346"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.build("hi!", "hi!");
    boolean b13 = hierarchyPropertyParser2.contains("hi!");
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, "hi!");
    java.lang.String str17 = hierarchyPropertyParser2.getValue();
    int i18 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test347"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    boolean b5 = hierarchyPropertyParser2.isLeafReached();
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test348"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b11 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test349"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    boolean b9 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.build("", "hi!(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "."+ "'", str6.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test350"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    int i14 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
    boolean b18 = hierarchyPropertyParser2.goDown("(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test351"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "null(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.contains(".");
    java.lang.String str15 = hierarchyPropertyParser2.showTree();
    java.lang.String str16 = hierarchyPropertyParser2.getSeperator();
    java.util.Vector vector17 = null;
    int i19 = hierarchyPropertyParser2.search(vector17, "");
    boolean b21 = hierarchyPropertyParser2.goDown(".");
    int i22 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test352"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize(".(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test353"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "hi!");
    boolean b11 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    int i12 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator(".(0)[null]\n");
    boolean b16 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test354"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.depth();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str12 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test355"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!(0)[null]\n", "hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test356"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser2.search(vector6, "null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("");
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test357"); }


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
    hierarchyPropertyParser2.build("", ".");
    hierarchyPropertyParser2.goToRoot();
    java.util.Vector vector19 = null;
    int i21 = hierarchyPropertyParser2.search(vector19, "");
    int i22 = hierarchyPropertyParser2.getLevel();
    boolean b23 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test358"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b9 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    int i12 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToParent();
    int i16 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test359"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    boolean b6 = hierarchyPropertyParser2.goToChild("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    boolean b10 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    boolean b15 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    java.util.Vector vector16 = null;
    int i18 = hierarchyPropertyParser2.search(vector16, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test360"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test361"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    boolean b12 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    int i13 = hierarchyPropertyParser2.depth();
    boolean b15 = hierarchyPropertyParser2.goDown("hi!(0)[null]\n");
    java.lang.String str16 = hierarchyPropertyParser2.getValue();
    boolean b18 = hierarchyPropertyParser2.goToChild("");
    boolean b19 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test362"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    boolean b7 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "null(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String str15 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str16 = hierarchyPropertyParser2.context();
    boolean b17 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "."+ "'", str15.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test363"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]\n");
    boolean b9 = hierarchyPropertyParser2.contains(".");
    hierarchyPropertyParser2.add(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test364"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n(0)[null]\n", "null(0)[null]\n(0)[null]");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test365"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    boolean b8 = hierarchyPropertyParser2.goTo("null(0)[null]\n");
    int i9 = hierarchyPropertyParser2.numChildren();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.build("", "null(0)[null]\n");
    boolean b17 = hierarchyPropertyParser2.isRootReached();
    boolean b18 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str19 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "."+ "'", str13.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!(0)[null]\n"+ "'", str19.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test366"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b9 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    java.lang.String str12 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b16 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str17 = hierarchyPropertyParser2.fullValue();
    int i18 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test367"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array2 = hierarchyPropertyParser0.childrenValues();
    boolean b3 = hierarchyPropertyParser0.isLeafReached();
    boolean b5 = hierarchyPropertyParser0.isHierachic(".");
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser0.search(vector6, "null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test368"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.tokenize("null(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "."+ "'", str6.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test369"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    int i5 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.setSeperator("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test370"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str12 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str14 = hierarchyPropertyParser2.parentValue();
    int i15 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test371"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!(0)[null]\n", "hi!(0)[null]\n");
    int i3 = hierarchyPropertyParser2.numChildren();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    boolean b6 = hierarchyPropertyParser2.isHierachic("null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test372"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b12 = hierarchyPropertyParser2.goToChild("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!(0)[null]\n"+ "'", str10.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test373"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    boolean b8 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    boolean b11 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test374"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    int i13 = hierarchyPropertyParser2.getLevel();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build(".(0)[null]\n", "null(0)[null]\n(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test375"); }


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
    boolean b18 = hierarchyPropertyParser2.isHierachic("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test376"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    int i5 = hierarchyPropertyParser2.getLevel();
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    int i8 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test377"); }


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
    boolean b18 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    java.lang.String[] str_array19 = hierarchyPropertyParser2.childrenValues();
    boolean b21 = hierarchyPropertyParser2.goToChild(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test378"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    boolean b8 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    boolean b12 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    int i13 = hierarchyPropertyParser2.getLevel();
    boolean b14 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test379"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("");
    int i7 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test380"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    boolean b11 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.add("hi!");
    java.lang.String[] str_array17 = hierarchyPropertyParser2.tokenize(".");
    java.lang.String str18 = hierarchyPropertyParser2.showTree();
    java.lang.String str19 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!(0)[null]\n"+ "'", str18.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test381"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    java.lang.String str12 = hierarchyPropertyParser2.getValue();
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    int i14 = hierarchyPropertyParser2.numChildren();
    java.lang.String str15 = hierarchyPropertyParser2.getValue();
    boolean b17 = hierarchyPropertyParser2.goToChild("(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!(0)[null]\n"+ "'", str11.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!(0)[null]\n"+ "'", str13.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test382"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.build(".(0)[null]\n", "");
    java.lang.String str17 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!(0)[null]\n"+ "'", str11.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!(0)[null]\n"+ "'", str13.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!(0)[null]\n"+ "'", str17.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test383"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    boolean b15 = hierarchyPropertyParser2.isRootReached();
    boolean b17 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!(0)[null]\n"+ "'", str11.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "."+ "'", str13.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test384"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("hi!");
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test385"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    boolean b15 = hierarchyPropertyParser2.goTo("null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!(0)[null]\n"+ "'", str11.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!(0)[null]\n"+ "'", str13.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test386"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.build("(0)[null]\n", "hi!(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test387"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    boolean b6 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build(".", ".");
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "");
    boolean b16 = hierarchyPropertyParser2.contains("hi!(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test388"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "hi!(0)[null]\n");
    int i3 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test389"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.showTree();
    java.lang.String str7 = hierarchyPropertyParser2.context();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!(0)[null]\n"+ "'", str6.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test390"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str9 = hierarchyPropertyParser2.context();
    boolean b11 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "."+ "'", str6.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test391"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    boolean b11 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test392"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    boolean b7 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    boolean b10 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test393"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.add("hi!");
    boolean b14 = hierarchyPropertyParser2.goToChild("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test394"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    int i10 = hierarchyPropertyParser2.getLevel();
    boolean b12 = hierarchyPropertyParser2.goToChild("");
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, "hi!");
    java.lang.String str16 = hierarchyPropertyParser2.fullValue();
    int i17 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test395"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    boolean b7 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.add("hi!(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test396"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    int i8 = hierarchyPropertyParser2.depth();
    boolean b10 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test397"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.add("hi!");
    boolean b11 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test398"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test399"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    boolean b12 = hierarchyPropertyParser2.goDown(".");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test400"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.build("null(0)[null](0)[null]\n", "null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test401"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser2.isHierachic("");
    boolean b11 = hierarchyPropertyParser2.goToChild(".");
    boolean b13 = hierarchyPropertyParser2.goToChild("null(0)[null]\n(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test402"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    boolean b12 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str15 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test403"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    boolean b8 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    int i10 = hierarchyPropertyParser2.getLevel();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".(0)[null]\n");
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array14);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test404"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    java.util.Vector vector11 = null;
    int i13 = hierarchyPropertyParser2.search(vector11, ".");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.build(".", ".");
    java.lang.String[] str_array19 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test405"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    boolean b6 = hierarchyPropertyParser2.goToChild("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str9 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    int i11 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.tokenize("null(0)[null](0)[null]\n");
    java.lang.String[] str_array15 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test406"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "null(0)[null]\n");
    hierarchyPropertyParser2.build("hi!", "null(0)[null]\n");
    int i13 = hierarchyPropertyParser2.depth();
    boolean b15 = hierarchyPropertyParser2.isHierachic("");
    boolean b17 = hierarchyPropertyParser2.isHierachic("hi!(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test407"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.goToChild("hi!");
    int i6 = hierarchyPropertyParser2.numChildren();
    int i7 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    int i12 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test408"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("(0)[null]\n(0)[null]\n", ".(0)[null]\n");

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test409"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator(".");
    hierarchyPropertyParser2.setSeperator(".");
    int i18 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.build("null(0)[null](0)[null]\n", "(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test410"); }


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
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, "");
    java.lang.String str18 = hierarchyPropertyParser2.fullValue();
    boolean b20 = hierarchyPropertyParser2.contains("(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(0)[null]\n"+ "'", str14.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test411"); }


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
    java.lang.String str19 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "."+ "'", str17.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "."+ "'", str19.equals("."));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test412"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.add("hi!");
    int i14 = hierarchyPropertyParser2.getLevel();
    java.lang.String str15 = hierarchyPropertyParser2.parentValue();
    boolean b16 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str17 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test413"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    int i5 = hierarchyPropertyParser2.numChildren();
    boolean b7 = hierarchyPropertyParser2.isHierachic("");
    boolean b9 = hierarchyPropertyParser2.goDown("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("hi!");
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "");
    boolean b16 = hierarchyPropertyParser2.contains("hi!");
    hierarchyPropertyParser2.build("null(0)[null]\n(0)[null]", "hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test414"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.numChildren();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
    boolean b11 = hierarchyPropertyParser2.isHierachic("null(0)[null]");
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test415"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    int i8 = hierarchyPropertyParser2.getLevel();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "null(0)[null]\n(0)[null]\n");
    java.lang.String[] str_array14 = hierarchyPropertyParser2.tokenize(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test416"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    int i12 = hierarchyPropertyParser2.numChildren();
    boolean b14 = hierarchyPropertyParser2.contains(".");
    int i15 = hierarchyPropertyParser2.numChildren();
    int i16 = hierarchyPropertyParser2.depth();
    java.lang.String str17 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test417"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "hi!(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    java.lang.String str13 = hierarchyPropertyParser2.fullValue();
    java.lang.String str14 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str15 = hierarchyPropertyParser2.parentValue();
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "."+ "'", str14.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test418"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "null(0)[null]\n");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b13 = hierarchyPropertyParser2.contains("hi!");
    boolean b15 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String[] str_array17 = hierarchyPropertyParser2.tokenize(".");
    int i18 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test419"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test420"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!(0)[null]\n(0)[null]\n", "");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test421"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!(0)[null]\n");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.setSeperator("(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "."+ "'", str6.equals("."));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test422"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    boolean b6 = hierarchyPropertyParser2.goToChild(".");
    boolean b7 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.tokenize("null(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test423"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    int i13 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, "null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test424"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    boolean b11 = hierarchyPropertyParser2.goToChild("");
    int i12 = hierarchyPropertyParser2.depth();
    int i13 = hierarchyPropertyParser2.getLevel();
    java.lang.String str14 = hierarchyPropertyParser2.getSeperator();
    boolean b16 = hierarchyPropertyParser2.goDown("hi!");
    boolean b18 = hierarchyPropertyParser2.contains("hi!");
    boolean b20 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    int i21 = hierarchyPropertyParser2.depth();
    java.lang.String str22 = hierarchyPropertyParser2.getSeperator();
    boolean b24 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "."+ "'", str14.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "."+ "'", str22.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test425"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = hierarchyPropertyParser2.goDown("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test426"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.numChildren();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    boolean b9 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = hierarchyPropertyParser2.contains("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test427"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    boolean b9 = hierarchyPropertyParser2.contains(".");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize("(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test428"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    boolean b13 = hierarchyPropertyParser2.goDown(".");
    boolean b15 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String str16 = hierarchyPropertyParser2.fullValue();
    boolean b18 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    boolean b20 = hierarchyPropertyParser2.goDown("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test429"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.context();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test430"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("null(0)[null]", ".");
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = hierarchyPropertyParser2.goTo("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test431"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    int i11 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.build("hi!(0)[null]", "hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test432"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.getValue();
    java.lang.String str5 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test433"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test434"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("");
    boolean b10 = hierarchyPropertyParser2.goDown("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    int i13 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test435"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    int i7 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    boolean b10 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    boolean b14 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array15 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test436"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    java.lang.String str12 = hierarchyPropertyParser2.context();
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, "null(0)[null]\n");
    java.lang.String str16 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array18 = hierarchyPropertyParser2.tokenize("null(0)[null]");
    java.lang.String[] str_array19 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!(0)[null]\n"+ "'", str11.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!(0)[null]\n"+ "'", str16.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array19);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test437"); }


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
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(0)[null]\n"+ "'", str14.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test438"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    int i9 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test439"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    hierarchyPropertyParser2.add("hi!");
    boolean b13 = hierarchyPropertyParser2.isRootReached();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test440"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    boolean b2 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser0.goToChild(".(0)[null]\n");
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test441"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.goDown("");
    boolean b13 = hierarchyPropertyParser2.isRootReached();
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, "(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test442"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    int i12 = hierarchyPropertyParser2.numChildren();
    boolean b14 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str15 = hierarchyPropertyParser2.parentValue();
    boolean b17 = hierarchyPropertyParser2.goDown("hi!(0)[null]\n");
    java.lang.String str18 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.setSeperator(".(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    // The following exception was thrown during execution in test generation
    try {
    boolean b23 = hierarchyPropertyParser2.contains("(0)[null](0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test443"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.getValue();
    int i7 = hierarchyPropertyParser2.getLevel();
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test444"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    hierarchyPropertyParser2.build("hi!(0)[null]\n", "null(0)[null]\n");
    boolean b17 = hierarchyPropertyParser2.goDown("hi!");
    int i18 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test445"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser2.search(vector6, "null(0)[null]\n");
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "");
    int i12 = hierarchyPropertyParser2.numChildren();
    java.lang.String str13 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test446"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "hi!(0)[null]\n");
    boolean b11 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    boolean b14 = hierarchyPropertyParser2.goToChild("hi!");
    boolean b15 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array17 = hierarchyPropertyParser2.tokenize("null(0)[null]\n(0)[null]\n");
    int i18 = hierarchyPropertyParser2.getLevel();
    int i19 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test447"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b12 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str14 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    java.util.Vector vector16 = null;
    int i18 = hierarchyPropertyParser2.search(vector16, "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "."+ "'", str13.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test448"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    boolean b6 = hierarchyPropertyParser2.goToChild("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str9 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test449"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    boolean b11 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.add("hi!");
    java.lang.String[] str_array17 = hierarchyPropertyParser2.tokenize(".");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.add("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test450"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser2.search(vector6, "null(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.context();
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = hierarchyPropertyParser2.contains("null(0)[null]");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test451"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    boolean b7 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("");
    boolean b14 = hierarchyPropertyParser2.goDown("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test452"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    boolean b11 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String[] str_array15 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.build("(0)[null](0)[null]\n", "null(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test453"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    boolean b8 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    int i9 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test454"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    boolean b8 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    boolean b11 = hierarchyPropertyParser2.goToChild("null(0)[null](0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test455"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array2 = hierarchyPropertyParser0.childrenValues();
    int i3 = hierarchyPropertyParser0.numChildren();
    java.lang.String str4 = hierarchyPropertyParser0.getSeperator();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.build(".", "hi!(0)[null]");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "."+ "'", str4.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test456"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    int i5 = hierarchyPropertyParser2.depth();
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    boolean b9 = hierarchyPropertyParser2.contains("(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test457"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("hi!");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build("hi!", ".");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test458"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b5 = hierarchyPropertyParser2.isHierachic("hi!");
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser2.search(vector6, "");
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToRoot();
    int i11 = hierarchyPropertyParser2.depth();
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test459"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    boolean b11 = hierarchyPropertyParser2.contains("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test460"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    int i12 = hierarchyPropertyParser2.numChildren();
    boolean b14 = hierarchyPropertyParser2.contains(".");
    hierarchyPropertyParser2.add(".");
    java.lang.String str17 = hierarchyPropertyParser2.showTree();
    java.lang.String str18 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ".(0)[null]\n"+ "'", str17.equals(".(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "."+ "'", str18.equals("."));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test461"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    boolean b9 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str11 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test462"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    boolean b8 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test463"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.setSeperator("");
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "hi!(0)[null]\n(0)[null]\n");
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, "null(0)[null]");
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test464"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    boolean b12 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String str13 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test465"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b9 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    int i11 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build("hi!(0)[null]", "null(0)[null]");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test466"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    boolean b10 = hierarchyPropertyParser2.goToChild(".");
    int i11 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test467"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("");
    int i13 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String str16 = hierarchyPropertyParser2.context();
    boolean b18 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    java.lang.String str19 = hierarchyPropertyParser2.context();
    boolean b21 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array22 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test468"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.getValue();
    boolean b4 = hierarchyPropertyParser0.contains("hi!");
    hierarchyPropertyParser0.setSeperator("");
    boolean b8 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("hi!");
    boolean b12 = hierarchyPropertyParser0.goToChild("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test469"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.isHierachic("hi!");
    int i10 = hierarchyPropertyParser2.getLevel();
    int i11 = hierarchyPropertyParser2.numChildren();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test470"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    int i13 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test471"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    boolean b11 = hierarchyPropertyParser2.goToChild("");
    boolean b13 = hierarchyPropertyParser2.isHierachic("");
    boolean b15 = hierarchyPropertyParser2.isHierachic("");
    boolean b16 = hierarchyPropertyParser2.isLeafReached();
    int i17 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array19 = hierarchyPropertyParser2.tokenize("(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test472"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test473"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    boolean b11 = hierarchyPropertyParser2.goToChild("");
    int i12 = hierarchyPropertyParser2.depth();
    int i13 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array16 = hierarchyPropertyParser2.tokenize("");
    java.util.Vector vector17 = null;
    int i19 = hierarchyPropertyParser2.search(vector17, ".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test474"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String[] str_array1 = hierarchyPropertyParser0.childrenValues();
    boolean b2 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.setSeperator("hi!");
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b7 = hierarchyPropertyParser0.contains("hi!(0)[null]\n");
    boolean b8 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str9 = hierarchyPropertyParser0.parentValue();
    int i10 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test475"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str12 = hierarchyPropertyParser2.fullValue();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    java.lang.String str14 = hierarchyPropertyParser2.fullValue();
    java.lang.String str15 = hierarchyPropertyParser2.parentValue();
    java.lang.String str16 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test476"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    int i6 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b13 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    boolean b16 = hierarchyPropertyParser2.goDown("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test477"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.add("hi!");
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    boolean b13 = hierarchyPropertyParser2.isHierachic("");
    boolean b14 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test478"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b9 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    int i12 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test479"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("null(0)[null]");
    boolean b14 = hierarchyPropertyParser2.contains("hi!(0)[null]\n(0)[null]\n");
    java.lang.String[] str_array15 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test480"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    int i12 = hierarchyPropertyParser2.depth();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    int i14 = hierarchyPropertyParser2.numChildren();
    int i15 = hierarchyPropertyParser2.numChildren();
    java.lang.String str16 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test481"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("");
    int i5 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test482"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.add("hi!");
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test483"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize(".");
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test484"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b9 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.goToParent();
    boolean b13 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test485"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    boolean b9 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    boolean b14 = hierarchyPropertyParser2.goTo("hi!");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.tokenize("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test486"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    boolean b8 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    boolean b11 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test487"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    boolean b9 = hierarchyPropertyParser2.contains(".");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.add(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test488"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser2.search(vector6, "null(0)[null]\n");
    boolean b10 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str14 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array15 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str16 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test489"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    int i11 = hierarchyPropertyParser2.getLevel();
    boolean b13 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    boolean b15 = hierarchyPropertyParser2.goDown("hi!(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test490"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    boolean b8 = hierarchyPropertyParser2.goDown(".");
    hierarchyPropertyParser2.goToRoot();
    int i10 = hierarchyPropertyParser2.depth();
    boolean b12 = hierarchyPropertyParser2.contains("null(0)[null](0)[null]\n");
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test491"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test492"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    int i12 = hierarchyPropertyParser2.getLevel();
    int i13 = hierarchyPropertyParser2.depth();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.add("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test493"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b8 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    hierarchyPropertyParser2.add("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test494"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b9 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("hi!");
    java.lang.String str12 = hierarchyPropertyParser2.context();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test495"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    int i9 = hierarchyPropertyParser2.numChildren();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b12 = hierarchyPropertyParser2.isHierachic("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i16 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test496"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser2.search(vector6, "");
    boolean b10 = hierarchyPropertyParser2.goDown("null(0)[null]\n(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test497"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToRoot();
    boolean b10 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str13 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test498"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b9 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, "null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test499"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    boolean b6 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    int i11 = hierarchyPropertyParser2.getLevel();
    int i12 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.build("(0)[null](0)[null]\n", "null(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test500"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b12 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    java.lang.String str15 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

}