package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2_it6_livello3 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test001"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test002"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.add("null(0)[null]\n");
    int i5 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("");
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str10 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test003"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.setSeperator(".");
    boolean b8 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize(".");
    int i13 = hierarchyPropertyParser2.depth();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    boolean b16 = hierarchyPropertyParser2.isHierachic(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test004"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test005"); }


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
    int i14 = hierarchyPropertyParser2.depth();
    boolean b15 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str16 = hierarchyPropertyParser2.getSeperator();
    int i17 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test006"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    int i9 = hierarchyPropertyParser2.depth();
    boolean b11 = hierarchyPropertyParser2.isHierachic("null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test007"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("hi!");
    boolean b7 = hierarchyPropertyParser2.isLeafReached();
    int i8 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test008"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n(0)[null]\n");
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str10 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test009"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    int i5 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test010"); }


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
    boolean b16 = hierarchyPropertyParser2.goDown(".");
    java.lang.String str17 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.build("null(0)[null]\n(0)[null]\n", "");
    java.lang.String[] str_array22 = hierarchyPropertyParser2.tokenize("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test011"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "");
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
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test012"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    int i5 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    boolean b9 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test013"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    java.lang.String str2 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    boolean b5 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test014"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b12 = hierarchyPropertyParser2.contains("hi!");
    int i13 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    boolean b16 = hierarchyPropertyParser2.goDown(".");
    boolean b18 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    int i19 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test015"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.tokenize(".");
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.build("null(0)[null]\n", "null(0)[null]");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test016"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    boolean b5 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test017"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b12 = hierarchyPropertyParser2.contains("hi!");
    int i13 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    boolean b17 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str18 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null(0)[null]\n"+ "'", str18.equals("null(0)[null]\n"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test018"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    java.lang.String str2 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = hierarchyPropertyParser0.contains(".");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test019"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.build("hi!", "");
    hierarchyPropertyParser2.setSeperator("");
    boolean b18 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str19 = hierarchyPropertyParser2.context();
    java.lang.String str20 = hierarchyPropertyParser2.getValue();
    int i21 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test020"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("");
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, "null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test021"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    java.lang.String str12 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test022"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("hi!");
    int i7 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test023"); }


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
    java.util.Vector vector16 = null;
    int i18 = hierarchyPropertyParser2.search(vector16, ".");
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
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test024"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str17 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test025"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test026"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test027"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!(0)[null]\n", "hi!(0)[null]\n");

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test028"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str13 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test029"); }


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
    java.util.Vector vector16 = null;
    int i18 = hierarchyPropertyParser2.search(vector16, "null(0)[null](0)[null]\n");
    hierarchyPropertyParser2.add(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test030"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "");
    hierarchyPropertyParser2.build("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test031"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    boolean b7 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.build("null(0)[null]\n", "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test032"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    int i10 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    boolean b13 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str14 = hierarchyPropertyParser2.context();
    java.lang.String str15 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.build("", "null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test033"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str13 = hierarchyPropertyParser2.context();
    boolean b15 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
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
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test034"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    boolean b11 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
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
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test035"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToRoot();
    int i12 = hierarchyPropertyParser2.depth();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    java.lang.String str14 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test036"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    java.lang.String str13 = hierarchyPropertyParser2.fullValue();
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    boolean b20 = hierarchyPropertyParser2.isHierachic("");
    boolean b22 = hierarchyPropertyParser2.contains(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test037"); }


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
    boolean b16 = hierarchyPropertyParser2.goDown(".");
    java.lang.String str17 = hierarchyPropertyParser2.fullValue();
    boolean b18 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array19 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.build("null(0)[null]", "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test038"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    int i13 = hierarchyPropertyParser2.getLevel();
    java.lang.String str14 = hierarchyPropertyParser2.parentValue();
    boolean b15 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test039"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    boolean b17 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    boolean b19 = hierarchyPropertyParser2.goToChild("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test040"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.isHierachic("hi!");
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, "null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test041"); }


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
    java.lang.String str16 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str17 = hierarchyPropertyParser2.context();
    boolean b19 = hierarchyPropertyParser2.goToChild("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test042"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    boolean b15 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str18 = hierarchyPropertyParser2.parentValue();
    java.lang.String str19 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null(0)[null]\n"+ "'", str19.equals("null(0)[null]\n"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test043"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.context();
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    boolean b9 = hierarchyPropertyParser2.contains("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test044"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    boolean b12 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str13 = hierarchyPropertyParser2.getValue();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build(".(0)[null]\n", "null(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test045"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    int i12 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test046"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str12 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test047"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test048"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b10 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    int i12 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test049"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.add(".");
    hierarchyPropertyParser2.add("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test050"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str13 = hierarchyPropertyParser2.context();
    int i14 = hierarchyPropertyParser2.getLevel();
    int i15 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test051"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    boolean b5 = hierarchyPropertyParser2.isRootReached();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    boolean b8 = hierarchyPropertyParser2.contains("null(0)[null]\n(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test052"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser(".(0)[null]\n", "");

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test053"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    int i5 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToRoot();
    boolean b11 = hierarchyPropertyParser2.contains("null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test054"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    boolean b8 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test055"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test056"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize(".");
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test057"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
    boolean b16 = hierarchyPropertyParser2.goTo("hi!");
    int i17 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test058"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.goTo("hi!");
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    int i9 = hierarchyPropertyParser2.getLevel();
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
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test059"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    boolean b13 = hierarchyPropertyParser2.goDown("hi!");
    int i14 = hierarchyPropertyParser2.getLevel();
    boolean b16 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    boolean b17 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test060"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    int i9 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    java.lang.String str12 = hierarchyPropertyParser2.fullValue();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.tokenize("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test061"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    int i13 = hierarchyPropertyParser2.depth();
    boolean b14 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str15 = hierarchyPropertyParser2.parentValue();
    boolean b16 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test062"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    boolean b10 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test063"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    int i16 = hierarchyPropertyParser2.numChildren();
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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test064"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.goTo("hi!");
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build(".(0)[null]\n", "null(0)[null]");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test065"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "hi!");
    hierarchyPropertyParser2.build("hi!", "");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str14 = hierarchyPropertyParser2.fullValue();
    java.lang.String str15 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test066"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.build("hi!", "");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array18 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str19 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.build("null(0)[null]\n(0)[null]\n", "hi!");
    java.lang.String str23 = hierarchyPropertyParser2.context();
    boolean b24 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test067"); }


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
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test068"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToParent();
    int i9 = hierarchyPropertyParser2.getLevel();
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test069"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    java.lang.String str6 = hierarchyPropertyParser0.getSeperator();
    boolean b7 = hierarchyPropertyParser0.isRootReached();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.tokenize("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "."+ "'", str6.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test070"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    int i5 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    java.util.Vector vector11 = null;
    int i13 = hierarchyPropertyParser2.search(vector11, "null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test071"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.context();
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test072"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.build("hi!", "");
    boolean b13 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test073"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    int i10 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.setSeperator(".");
    boolean b13 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test074"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    boolean b10 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str16 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test075"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    java.lang.String str13 = hierarchyPropertyParser2.fullValue();
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, "null(0)[null]\n");
    java.lang.String str17 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str18 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.build("", "null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test076"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test077"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    boolean b2 = hierarchyPropertyParser0.isRootReached();
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test078"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    int i12 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.build("null(0)[null]\n(0)[null]\n", "hi!(0)[null]\n");
    boolean b16 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test079"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    int i11 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.build("null(0)[null]", "hi!");
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test080"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str12 = hierarchyPropertyParser2.fullValue();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str16 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(0)[null]\n"+ "'", str16.equals("null(0)[null]\n"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test081"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    boolean b5 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array6 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test082"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "null(0)[null]\n");
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    java.lang.String str14 = hierarchyPropertyParser2.parentValue();
    int i15 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test083"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", ".");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser2.search(vector3, "null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test084"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    boolean b15 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    hierarchyPropertyParser2.add("hi!");
    boolean b19 = hierarchyPropertyParser2.goToChild("null(0)[null]\n(0)[null]\n");
    boolean b21 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test085"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test086"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    boolean b15 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str18 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    boolean b20 = hierarchyPropertyParser2.isRootReached();
    boolean b22 = hierarchyPropertyParser2.isHierachic(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test087"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    boolean b8 = hierarchyPropertyParser2.goDown(".");
    int i9 = hierarchyPropertyParser2.numChildren();
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test088"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b12 = hierarchyPropertyParser2.contains("hi!");
    int i13 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    boolean b16 = hierarchyPropertyParser2.goToChild(".");
    boolean b18 = hierarchyPropertyParser2.goToChild("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test089"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.setSeperator(".");
    boolean b13 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test090"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.build("hi!", "");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
    java.lang.String[] str_array20 = hierarchyPropertyParser2.childrenValues();
    boolean b21 = hierarchyPropertyParser2.isLeafReached();
    boolean b23 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str24 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test091"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.setSeperator(".");
    boolean b16 = hierarchyPropertyParser2.isHierachic("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test092"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    boolean b6 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    boolean b8 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    boolean b11 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test093"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test094"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    boolean b13 = hierarchyPropertyParser2.goToChild("");
    boolean b15 = hierarchyPropertyParser2.goDown("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test095"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "hi!");
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null](0)[null]\n"+ "'", str13.equals("null(0)[null](0)[null]\n"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test096"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    int i4 = hierarchyPropertyParser2.numChildren();
    java.lang.String str5 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test097"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    int i9 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.build("hi!", "null(0)[null]\n");
    java.lang.String str13 = hierarchyPropertyParser2.getValue();
    java.lang.String str14 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test098"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("hi!");
    hierarchyPropertyParser0.goToParent();
    java.lang.String str6 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test099"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "null(0)[null]\n(0)[null]\n");
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

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test100"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser2.search(vector5, "hi!");
    boolean b8 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.tokenize(".");
    hierarchyPropertyParser2.add("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test101"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!(0)[null]\n", "null(0)[null]\n(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test102"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    int i11 = hierarchyPropertyParser2.numChildren();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "");
    hierarchyPropertyParser2.build("", "null(0)[null]\n(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = hierarchyPropertyParser2.goTo("null(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test103"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test104"); }


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
    hierarchyPropertyParser2.build("", ".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test105"); }


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
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test106"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.build("hi!", "");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
    java.lang.String str20 = hierarchyPropertyParser2.parentValue();
    java.lang.String str21 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array22 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.build("null(0)[null]\n(0)[null]\n", "hi!");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array22);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test107"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    boolean b3 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser0.showTree();
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    java.lang.String str7 = hierarchyPropertyParser0.getValue();
    boolean b9 = hierarchyPropertyParser0.goToChild("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test108"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.parentValue();
    int i4 = hierarchyPropertyParser2.depth();
    boolean b6 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "");
    java.lang.String str10 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test109"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    int i9 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    boolean b13 = hierarchyPropertyParser2.isHierachic("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test110"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    int i12 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test111"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser2.search(vector5, ".");
    hierarchyPropertyParser2.setSeperator(".");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "hi!");
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    boolean b15 = hierarchyPropertyParser2.goDown(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test112"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "null(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str14 = hierarchyPropertyParser2.context();
    java.lang.String str15 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test113"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.goToParent();
    boolean b7 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.context();
    int i10 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test114"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    java.lang.String str7 = hierarchyPropertyParser0.context();
    boolean b8 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test115"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    int i6 = hierarchyPropertyParser2.numChildren();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test116"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b12 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str14 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.build("", "null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test117"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.build("hi!", "");
    java.lang.String str16 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str18 = hierarchyPropertyParser2.fullValue();
    java.util.Vector vector19 = null;
    int i21 = hierarchyPropertyParser2.search(vector19, ".(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test118"); }


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
    int i15 = hierarchyPropertyParser2.numChildren();
    int i16 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test119"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test120"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    int i11 = hierarchyPropertyParser2.depth();
    int i12 = hierarchyPropertyParser2.numChildren();
    int i13 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test121"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, "");
    java.util.Vector vector17 = null;
    int i19 = hierarchyPropertyParser2.search(vector17, "hi!");
    java.util.Vector vector20 = null;
    int i22 = hierarchyPropertyParser2.search(vector20, "null(0)[null]\n(0)[null]\n");
    boolean b23 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test122"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test123"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    int i5 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    int i8 = hierarchyPropertyParser2.getLevel();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test124"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test125"); }


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
    boolean b15 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String[] str_array17 = hierarchyPropertyParser2.tokenize("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test126"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.build("hi!", "");
    java.lang.String str16 = hierarchyPropertyParser2.context();
    java.lang.String str17 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!(0)[null]\n"+ "'", str17.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test127"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    boolean b15 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str18 = hierarchyPropertyParser2.parentValue();
    int i19 = hierarchyPropertyParser2.numChildren();
    java.lang.String[] str_array21 = hierarchyPropertyParser2.tokenize("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test128"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    int i9 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test129"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test130"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array4 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test131"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.build("hi!", "");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToParent();
    int i18 = hierarchyPropertyParser2.depth();
    java.lang.String str19 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test132"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    int i12 = hierarchyPropertyParser2.numChildren();
    java.lang.String str13 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test133"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    int i5 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = hierarchyPropertyParser2.contains("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test134"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!(0)[null]\n", "");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test135"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str11 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test136"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    int i10 = hierarchyPropertyParser2.numChildren();
    java.util.Vector vector11 = null;
    int i13 = hierarchyPropertyParser2.search(vector11, "hi!");
    int i14 = hierarchyPropertyParser2.numChildren();
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = hierarchyPropertyParser2.goTo(".(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test137"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    int i12 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.build("null(0)[null]\n(0)[null]\n", "hi!(0)[null]\n");
    java.lang.String str16 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(0)[null]\n"+ "'", str16.equals("null(0)[null]\n"));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test138"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.childrenValues();
    boolean b8 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test139"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    boolean b15 = hierarchyPropertyParser2.contains(".");
    boolean b16 = hierarchyPropertyParser2.isLeafReached();
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = hierarchyPropertyParser2.contains("null(0)[null](0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n(0)[null]\n"+ "'", str13.equals("null(0)[null]\n(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test140"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n");
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, "");
    java.lang.String[] str_array19 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String str20 = hierarchyPropertyParser2.getSeperator();
    boolean b22 = hierarchyPropertyParser2.contains(".");
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test141"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    int i7 = hierarchyPropertyParser2.depth();
    int i8 = hierarchyPropertyParser2.getLevel();
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test142"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    boolean b14 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test143"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str10 = hierarchyPropertyParser2.context();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str13 = hierarchyPropertyParser2.context();
    int i14 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str16 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test144"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    int i5 = hierarchyPropertyParser2.getLevel();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    int i7 = hierarchyPropertyParser2.depth();
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test145"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b12 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str14 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test146"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "");
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test147"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "null(0)[null]\n");
    java.lang.String str13 = hierarchyPropertyParser2.fullValue();
    int i14 = hierarchyPropertyParser2.depth();
    boolean b16 = hierarchyPropertyParser2.goToChild(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test148"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser2.search(vector5, ".");
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test149"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.goDown("");
    java.lang.String str15 = hierarchyPropertyParser2.showTree();
    java.lang.String str16 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test150"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    int i12 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.build("", "");
    java.lang.String str16 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test151"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    int i13 = hierarchyPropertyParser2.getLevel();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    java.lang.String str15 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test152"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.build("hi!", "");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
    java.lang.String str20 = hierarchyPropertyParser2.parentValue();
    int i21 = hierarchyPropertyParser2.numChildren();
    java.lang.String str22 = hierarchyPropertyParser2.getValue();
    boolean b23 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test153"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    boolean b10 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    int i11 = hierarchyPropertyParser2.getLevel();
    java.lang.String str12 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test154"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str13 = hierarchyPropertyParser2.context();
    java.lang.String str14 = hierarchyPropertyParser2.context();
    boolean b16 = hierarchyPropertyParser2.isHierachic("null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test155"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    int i13 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test156"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("hi!");
    java.lang.String str5 = hierarchyPropertyParser0.context();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser0.search(vector6, "hi!");
    boolean b10 = hierarchyPropertyParser0.goDown(".(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test157"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    boolean b15 = hierarchyPropertyParser2.contains("hi!");
    boolean b17 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str18 = hierarchyPropertyParser2.getSeperator();
    boolean b20 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    java.lang.String[] str_array22 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test158"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    boolean b15 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String str16 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str17 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null(0)[null]\n"+ "'", str17.equals("null(0)[null]\n"));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test159"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.context();
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "hi!");
    java.lang.String str15 = hierarchyPropertyParser2.context();
    java.lang.String str16 = hierarchyPropertyParser2.showTree();
    java.util.Vector vector17 = null;
    int i19 = hierarchyPropertyParser2.search(vector17, "");
    int i20 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(0)[null]\n"+ "'", str16.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test160"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    int i5 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    boolean b8 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test161"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n");
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, "");
    java.lang.String[] str_array19 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String str22 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "null(0)[null]\n"+ "'", str22.equals("null(0)[null]\n"));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test162"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test163"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    java.lang.String str18 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test164"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test165"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.goTo("hi!");
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    java.lang.String str9 = hierarchyPropertyParser2.context();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test166"); }


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
    java.lang.String str16 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test167"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.build("hi!", "");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
    java.lang.String[] str_array20 = hierarchyPropertyParser2.childrenValues();
    boolean b21 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array22 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array22);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test168"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.parentValue();
    int i4 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test169"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array19 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str20 = hierarchyPropertyParser2.getSeperator();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test170"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str12 = hierarchyPropertyParser2.context();
    java.lang.String str13 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test171"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    int i10 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, "hi!");
    java.lang.String[] str_array17 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.build("hi!(0)[null]\n", "null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test172"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array17 = hierarchyPropertyParser2.tokenize("");
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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test173"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String str6 = hierarchyPropertyParser2.getValue();
    int i7 = hierarchyPropertyParser2.depth();
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test174"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.goDown("");
    hierarchyPropertyParser2.add("hi!");
    int i17 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test175"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    boolean b13 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToParent();
    int i16 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array17 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str18 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test176"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test177"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    int i10 = hierarchyPropertyParser2.getLevel();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test178"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.setSeperator(".");
    boolean b8 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test179"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    int i10 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    boolean b13 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str14 = hierarchyPropertyParser2.context();
    java.lang.String str15 = hierarchyPropertyParser2.context();
    int i16 = hierarchyPropertyParser2.numChildren();
    boolean b17 = hierarchyPropertyParser2.isRootReached();
    int i18 = hierarchyPropertyParser2.getLevel();
    java.lang.String str19 = hierarchyPropertyParser2.getSeperator();
    int i20 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test180"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    boolean b8 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String[] str_array10 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b12 = hierarchyPropertyParser2.isHierachic("null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(0)[null]\n"+ "'", str6.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test181"); }


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
    hierarchyPropertyParser2.build("hi!", "null(0)[null]\n");
    java.lang.String str17 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test182"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.context();
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test183"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.add("null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test184"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str12 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test185"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    boolean b6 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    hierarchyPropertyParser2.add("null(0)[null]\n(0)[null]\n");
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
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test186"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.build("hi!", "");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
    java.lang.String str20 = hierarchyPropertyParser2.parentValue();
    java.lang.String str21 = hierarchyPropertyParser2.parentValue();
    boolean b22 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array24 = hierarchyPropertyParser2.tokenize(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test187"); }


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
    boolean b16 = hierarchyPropertyParser2.goDown(".");
    java.util.Vector vector17 = null;
    int i19 = hierarchyPropertyParser2.search(vector17, "");
    int i20 = hierarchyPropertyParser2.depth();
    boolean b22 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str23 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test188"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, ".");
    boolean b18 = hierarchyPropertyParser2.goDown(".");
    boolean b19 = hierarchyPropertyParser2.isRootReached();
    boolean b21 = hierarchyPropertyParser2.goToChild("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test189"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test190"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.goToRoot();
    boolean b3 = hierarchyPropertyParser0.contains("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser0.setSeperator(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test191"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToRoot();
    int i12 = hierarchyPropertyParser2.getLevel();
    int i13 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test192"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n");
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, "");
    java.lang.String[] str_array19 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.util.Vector vector20 = null;
    int i22 = hierarchyPropertyParser2.search(vector20, "");
    java.lang.String str23 = hierarchyPropertyParser2.getValue();
    java.lang.String str24 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array26 = hierarchyPropertyParser2.tokenize("null(0)[null]\n(0)[null]\n");
    int i27 = hierarchyPropertyParser2.depth();
    int i28 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test193"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.goToParent();
    boolean b7 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    boolean b10 = hierarchyPropertyParser2.contains(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test194"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "hi!");
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    boolean b15 = hierarchyPropertyParser2.goToChild("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null](0)[null]\n"+ "'", str13.equals("null(0)[null](0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test195"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    int i5 = hierarchyPropertyParser2.getLevel();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test196"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str14 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test197"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.build("hi!", "null(0)[null]\n");
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, "null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator(".(0)[null]\n");
    boolean b21 = hierarchyPropertyParser2.isHierachic("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test198"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test199"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("hi!");
    java.lang.String str5 = hierarchyPropertyParser0.context();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser0.search(vector6, "hi!");
    java.lang.String str9 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str10 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test200"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    java.util.Vector vector4 = null;
    int i6 = hierarchyPropertyParser2.search(vector4, ".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test201"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    boolean b11 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test202"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    int i12 = hierarchyPropertyParser2.getLevel();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    java.lang.String str14 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.add(".");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str18 = hierarchyPropertyParser2.showTree();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build(".", "null(0)[null](0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(0)[null]\n"+ "'", str14.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ".(0)[null]\n"+ "'", str18.equals(".(0)[null]\n"));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test203"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, ".");
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = hierarchyPropertyParser2.goTo("null(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test204"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    java.lang.String str13 = hierarchyPropertyParser2.fullValue();
    int i14 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test205"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.goToChild("null(0)[null]\n(0)[null]\n");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str14 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test206"); }


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
    java.lang.String str17 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test207"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    int i11 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator("null(0)[null]");
    int i14 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test208"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    boolean b12 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str13 = hierarchyPropertyParser2.getValue();
    boolean b14 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test209"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    java.lang.String str2 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    boolean b5 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    java.lang.String str6 = hierarchyPropertyParser0.context();
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = hierarchyPropertyParser0.contains("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test210"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    int i10 = hierarchyPropertyParser2.numChildren();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    int i15 = hierarchyPropertyParser2.numChildren();
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
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test211"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    int i6 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test212"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    boolean b13 = hierarchyPropertyParser2.goToChild("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test213"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str14 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.add("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test214"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, ".");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    int i14 = hierarchyPropertyParser2.depth();
    boolean b16 = hierarchyPropertyParser2.isHierachic("");
    boolean b17 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test215"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    boolean b7 = hierarchyPropertyParser2.isLeafReached();
    int i8 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test216"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.build("null(0)[null]", "null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test217"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
    boolean b16 = hierarchyPropertyParser2.goTo(".");
    java.lang.String str17 = hierarchyPropertyParser2.showTree();
    java.lang.String str18 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array20 = hierarchyPropertyParser2.tokenize("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null(0)[null](0)[null]\n"+ "'", str17.equals("null(0)[null](0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test218"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    boolean b11 = hierarchyPropertyParser2.goToChild(".");
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test219"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    int i11 = hierarchyPropertyParser2.depth();
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, ".");
    java.lang.String str16 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test220"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b12 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String str13 = hierarchyPropertyParser2.getValue();
    int i14 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test221"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n");
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, "");
    java.lang.String[] str_array19 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.util.Vector vector20 = null;
    int i22 = hierarchyPropertyParser2.search(vector20, "");
    java.lang.String str23 = hierarchyPropertyParser2.getValue();
    java.lang.String str24 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array26 = hierarchyPropertyParser2.tokenize("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b30 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array31 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test222"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test223"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, ".");
    java.lang.String str17 = hierarchyPropertyParser2.showTree();
    boolean b19 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null(0)[null]\n"+ "'", str17.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test224"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    boolean b5 = hierarchyPropertyParser2.isHierachic("hi!");
    int i6 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test225"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test226"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    boolean b9 = hierarchyPropertyParser2.goDown(".");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test227"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    boolean b13 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str16 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.setSeperator(".");
    hierarchyPropertyParser2.build("null(0)[null]\n(0)[null]\n", "null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test228"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "null(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, "hi!(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    int i17 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test229"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "hi!");
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, "null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test230"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test231"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str10 = hierarchyPropertyParser2.context();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test232"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    java.lang.String str14 = hierarchyPropertyParser2.parentValue();
    int i15 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test233"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    int i9 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    int i14 = hierarchyPropertyParser2.numChildren();
    boolean b16 = hierarchyPropertyParser2.goToChild(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test234"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test235"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser2.search(vector5, "hi!");
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test236"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.context();
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str12 = hierarchyPropertyParser2.fullValue();
    boolean b14 = hierarchyPropertyParser2.goDown("null(0)[null](0)[null]\n");
    java.lang.String str15 = hierarchyPropertyParser2.parentValue();
    java.lang.String str16 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test237"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b12 = hierarchyPropertyParser2.contains("null(0)[null]");
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
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test238"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    int i6 = hierarchyPropertyParser2.depth();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test239"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    int i9 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    int i14 = hierarchyPropertyParser2.depth();
    java.lang.String str15 = hierarchyPropertyParser2.showTree();
    java.lang.String str16 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(0)[null]\n"+ "'", str16.equals("null(0)[null]\n"));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test240"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize(".");
    hierarchyPropertyParser2.goToParent();
    boolean b9 = hierarchyPropertyParser2.goDown(".");
    boolean b11 = hierarchyPropertyParser2.goDown(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test241"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b12 = hierarchyPropertyParser2.contains("hi!");
    int i13 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    int i16 = hierarchyPropertyParser2.numChildren();
    java.lang.String[] str_array17 = hierarchyPropertyParser2.childrenValues();
    boolean b18 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test242"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.goDown("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test243"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    int i13 = hierarchyPropertyParser2.getLevel();
    int i14 = hierarchyPropertyParser2.getLevel();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build(".", "");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test244"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.goToRoot();
    boolean b2 = hierarchyPropertyParser0.isRootReached();
    hierarchyPropertyParser0.goToParent();
    int i4 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array6 = hierarchyPropertyParser0.tokenize("null(0)[null](0)[null]\n");
    hierarchyPropertyParser0.build("null(0)[null]\n(0)[null]\n", ".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test245"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    boolean b14 = hierarchyPropertyParser2.isHierachic("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test246"); }


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
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build(".", "hi!(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test247"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "null(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test248"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "hi!");
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    boolean b14 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b15 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test249"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    hierarchyPropertyParser2.add(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test250"); }


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
    java.lang.String str15 = hierarchyPropertyParser2.context();
    int i16 = hierarchyPropertyParser2.depth();
    java.lang.String str17 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test251"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    java.lang.String[] str_array15 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    int i18 = hierarchyPropertyParser2.numChildren();
    boolean b19 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test252"); }


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
    hierarchyPropertyParser2.build("hi!", "null(0)[null]\n");
    java.lang.String str17 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test253"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.getValue();
    boolean b7 = hierarchyPropertyParser2.isLeafReached();
    boolean b9 = hierarchyPropertyParser2.isHierachic("null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test254"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n");
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, "");
    java.lang.String[] str_array19 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.util.Vector vector20 = null;
    int i22 = hierarchyPropertyParser2.search(vector20, "");
    java.lang.String str23 = hierarchyPropertyParser2.getValue();
    java.lang.String str24 = hierarchyPropertyParser2.context();
    boolean b26 = hierarchyPropertyParser2.contains(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test255"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    int i5 = hierarchyPropertyParser2.getLevel();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    int i7 = hierarchyPropertyParser2.depth();
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
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test256"); }


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
    boolean b15 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    boolean b17 = hierarchyPropertyParser2.isHierachic("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test257"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    boolean b11 = hierarchyPropertyParser2.goToChild(".");
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str14 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    java.util.Vector vector16 = null;
    int i18 = hierarchyPropertyParser2.search(vector16, "null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test258"); }


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
    java.lang.String str15 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.setSeperator("");
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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test259"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.build("hi!", "null(0)[null]\n");
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, "null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.lang.String str21 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.build("", ".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test260"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToParent();
    int i11 = hierarchyPropertyParser2.getLevel();
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    int i13 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test261"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    java.lang.String str7 = hierarchyPropertyParser0.context();
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test262"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    int i12 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.tokenize("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test263"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b10 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    int i12 = hierarchyPropertyParser2.getLevel();
    boolean b13 = hierarchyPropertyParser2.isLeafReached();
    boolean b14 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str15 = hierarchyPropertyParser2.fullValue();
    int i16 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test264"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    int i12 = hierarchyPropertyParser2.depth();
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    boolean b15 = hierarchyPropertyParser2.goDown("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test265"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str12 = hierarchyPropertyParser2.fullValue();
    boolean b13 = hierarchyPropertyParser2.isLeafReached();
    boolean b15 = hierarchyPropertyParser2.goDown("null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test266"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "hi!");
    boolean b11 = hierarchyPropertyParser2.isHierachic(".");
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test267"); }


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
    java.lang.String str15 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test268"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null](0)[null]\n", "null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test269"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    int i12 = hierarchyPropertyParser2.getLevel();
    boolean b14 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    java.lang.String[] str_array15 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test270"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test271"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test272"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("");
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test273"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n");
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, "");
    java.lang.String[] str_array19 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String str20 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str21 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str23 = hierarchyPropertyParser2.showTree();
    boolean b25 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    boolean b27 = hierarchyPropertyParser2.goDown("null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "null(0)[null]\n"+ "'", str23.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test274"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str5 = hierarchyPropertyParser2.context();
    int i6 = hierarchyPropertyParser2.depth();
    boolean b8 = hierarchyPropertyParser2.goToChild(".");
    hierarchyPropertyParser2.build("null(0)[null](0)[null]\n", "null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test275"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    int i5 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    boolean b10 = hierarchyPropertyParser2.goDown(".");
    hierarchyPropertyParser2.build("null(0)[null](0)[null]\n", ".");
    boolean b14 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test276"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    boolean b3 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser0.showTree();
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    boolean b8 = hierarchyPropertyParser0.goDown("null(0)[null]");
    int i9 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test277"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.build("hi!", "");
    hierarchyPropertyParser2.setSeperator("");
    boolean b19 = hierarchyPropertyParser2.goDown("null(0)[null]");
    java.lang.String str20 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test278"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.goToRoot();
    boolean b2 = hierarchyPropertyParser0.isRootReached();
    boolean b4 = hierarchyPropertyParser0.goToChild(".");
    java.lang.String[] str_array6 = hierarchyPropertyParser0.tokenize(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test279"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    boolean b2 = hierarchyPropertyParser0.isRootReached();
    java.lang.String[] str_array3 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str4 = hierarchyPropertyParser0.getSeperator();
    boolean b6 = hierarchyPropertyParser0.goDown("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "."+ "'", str4.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test280"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "null(0)[null]\n");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b18 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test281"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    boolean b14 = hierarchyPropertyParser2.goToChild("null(0)[null](0)[null]\n");
    java.lang.String str15 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test282"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    int i11 = hierarchyPropertyParser2.depth();
    int i12 = hierarchyPropertyParser2.numChildren();
    boolean b13 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test283"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "hi!");
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
    int i13 = hierarchyPropertyParser2.getLevel();
    boolean b14 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str15 = hierarchyPropertyParser2.context();
    java.lang.String str16 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(0)[null]"+ "'", str16.equals("null(0)[null]"));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test284"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser(".(0)[null]\n", "hi!");

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test285"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b12 = hierarchyPropertyParser2.isHierachic("hi!");
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, "null(0)[null]\n(0)[null]\n");
    java.lang.String str16 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(0)[null]\n"+ "'", str16.equals("null(0)[null]\n"));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test286"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b12 = hierarchyPropertyParser2.contains("hi!");
    int i13 = hierarchyPropertyParser2.getLevel();
    int i14 = hierarchyPropertyParser2.numChildren();
    java.lang.String str15 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test287"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.parentValue();
    int i4 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    int i6 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build("null(0)[null]", ".");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test288"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", ".(0)[null]\n");

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test289"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b10 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    int i12 = hierarchyPropertyParser2.getLevel();
    int i13 = hierarchyPropertyParser2.depth();
    boolean b15 = hierarchyPropertyParser2.goToChild("");
    boolean b17 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test290"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    boolean b15 = hierarchyPropertyParser2.goToChild("hi!");
    java.util.Vector vector16 = null;
    int i18 = hierarchyPropertyParser2.search(vector16, "null(0)[null](0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test291"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    boolean b8 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str9 = hierarchyPropertyParser0.parentValue();
    boolean b10 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test292"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    boolean b11 = hierarchyPropertyParser2.contains("hi!");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.build("hi!", ".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test293"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b12 = hierarchyPropertyParser2.isHierachic("hi!");
    hierarchyPropertyParser2.build("null(0)[null]\n(0)[null]\n", "null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    boolean b18 = hierarchyPropertyParser2.isHierachic(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test294"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    boolean b5 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test295"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.setSeperator(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test296"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    int i9 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    boolean b15 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    java.lang.String[] str_array17 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test297"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str13 = hierarchyPropertyParser2.getValue();
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test298"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.isHierachic("hi!");
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, "null(0)[null]\n");
    java.lang.String[] str_array19 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String[] str_array20 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test299"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    int i5 = hierarchyPropertyParser2.getLevel();
    int i6 = hierarchyPropertyParser2.getLevel();
    int i7 = hierarchyPropertyParser2.depth();
    boolean b9 = hierarchyPropertyParser2.goToChild("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test300"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b5 = hierarchyPropertyParser2.goToChild("hi!");
    boolean b7 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    boolean b10 = hierarchyPropertyParser2.contains("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test301"); }


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
    boolean b16 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test302"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    int i7 = hierarchyPropertyParser2.depth();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    java.lang.String str9 = hierarchyPropertyParser2.context();
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    boolean b13 = hierarchyPropertyParser2.contains(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test303"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    int i9 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.build("null(0)[null]\n", "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test304"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    boolean b19 = hierarchyPropertyParser2.goToChild(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test305"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b12 = hierarchyPropertyParser2.isHierachic("hi!");
    hierarchyPropertyParser2.build("null(0)[null]\n(0)[null]\n", "null(0)[null]\n(0)[null]\n");
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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test306"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize(".");
    hierarchyPropertyParser2.add("null(0)[null]\n(0)[null]\n");
    int i7 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test307"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.build("hi!", "");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.build("null(0)[null]", "null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test308"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    int i7 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test309"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    int i5 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "");
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test310"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    boolean b15 = hierarchyPropertyParser2.isHierachic("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test311"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    java.lang.String[] str_array15 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str16 = hierarchyPropertyParser2.context();
    int i17 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test312"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser(".", ".");
    java.lang.String[] str_array3 = hierarchyPropertyParser2.childrenValues();
    boolean b5 = hierarchyPropertyParser2.goToChild("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test313"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test314"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    int i9 = hierarchyPropertyParser2.numChildren();
    int i10 = hierarchyPropertyParser2.depth();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test315"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.setSeperator(".");
    boolean b8 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize(".");
    int i13 = hierarchyPropertyParser2.depth();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    boolean b16 = hierarchyPropertyParser2.goToChild(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test316"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    java.lang.String str2 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.tokenize("");
    java.lang.String[] str_array6 = hierarchyPropertyParser0.childrenValues();
    boolean b7 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    java.lang.String str9 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test317"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.add("hi!");
    boolean b9 = hierarchyPropertyParser2.goTo("null(0)[null]");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test318"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.setSeperator(".");
    boolean b8 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize(".");
    java.lang.String str13 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test319"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    boolean b12 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test320"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    boolean b5 = hierarchyPropertyParser2.isRootReached();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.tokenize("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test321"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    boolean b6 = hierarchyPropertyParser2.contains("null(0)[null]\n(0)[null]\n");
    int i7 = hierarchyPropertyParser2.getLevel();
    boolean b9 = hierarchyPropertyParser2.contains("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test322"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    java.lang.String str2 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.tokenize("");
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test323"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]", ".");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test324"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    int i11 = hierarchyPropertyParser2.numChildren();
    int i12 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test325"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    boolean b10 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.add("hi!(0)[null]\n");
    java.lang.String str13 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!(0)[null]\n"+ "'", str13.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test326"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    int i9 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser2.contains("null(0)[null](0)[null]\n");
    boolean b15 = hierarchyPropertyParser2.contains("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test327"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser(".(0)[null]\n", ".(0)[null]\n");

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test328"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    java.lang.String[] str_array15 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    int i18 = hierarchyPropertyParser2.numChildren();
    int i19 = hierarchyPropertyParser2.numChildren();
    java.lang.String str20 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null(0)[null]\n"+ "'", str20.equals("null(0)[null]\n"));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test329"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    boolean b8 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str9 = hierarchyPropertyParser0.parentValue();
    boolean b10 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str11 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test330"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    boolean b6 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str7 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test331"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    int i7 = hierarchyPropertyParser2.depth();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "null(0)[null]\n(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.goToChild("null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test332"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "hi!");
    boolean b11 = hierarchyPropertyParser2.contains("hi!");
    hierarchyPropertyParser2.setSeperator("null(0)[null]");
    hierarchyPropertyParser2.add("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test333"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    int i9 = hierarchyPropertyParser2.numChildren();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b12 = hierarchyPropertyParser2.goDown(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test334"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    int i11 = hierarchyPropertyParser2.numChildren();
    boolean b13 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    boolean b15 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test335"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.goToRoot();
    boolean b3 = hierarchyPropertyParser0.contains("null(0)[null]\n(0)[null]\n");
    boolean b5 = hierarchyPropertyParser0.goDown(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test336"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str10 = hierarchyPropertyParser2.context();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test337"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    int i10 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    boolean b13 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str14 = hierarchyPropertyParser2.context();
    java.lang.String str15 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array18 = hierarchyPropertyParser2.tokenize("null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test338"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser2.search(vector5, ".");
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test339"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    java.lang.String str2 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.tokenize("");
    java.lang.String[] str_array6 = hierarchyPropertyParser0.childrenValues();
    boolean b7 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str8 = hierarchyPropertyParser0.fullValue();
    int i9 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test340"); }


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
    boolean b16 = hierarchyPropertyParser2.goDown(".");
    java.lang.String str17 = hierarchyPropertyParser2.fullValue();
    int i18 = hierarchyPropertyParser2.numChildren();
    java.util.Vector vector19 = null;
    int i21 = hierarchyPropertyParser2.search(vector19, "null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.build("null(0)[null]", "hi!(0)[null]\n");
    java.lang.String str25 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test341"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    int i9 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test342"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    int i12 = hierarchyPropertyParser2.depth();
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    boolean b14 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str15 = hierarchyPropertyParser2.parentValue();
    boolean b17 = hierarchyPropertyParser2.isHierachic("hi!");
    hierarchyPropertyParser2.add("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test343"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    int i9 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.build("", ".");
    int i13 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.build("hi!(0)[null]\n", "hi!(0)[null]\n");
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
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test344"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    int i12 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    int i15 = hierarchyPropertyParser2.numChildren();
    java.lang.String str16 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test345"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    boolean b11 = hierarchyPropertyParser2.goToChild(".");
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    int i13 = hierarchyPropertyParser2.depth();
    boolean b15 = hierarchyPropertyParser2.isHierachic(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test346"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str12 = hierarchyPropertyParser2.fullValue();
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test347"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test348"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test349"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    java.lang.String str7 = hierarchyPropertyParser0.context();
    boolean b9 = hierarchyPropertyParser0.goToChild("null(0)[null]\n(0)[null]\n");
    int i10 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test350"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b12 = hierarchyPropertyParser2.contains("hi!");
    int i13 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    boolean b16 = hierarchyPropertyParser2.goDown(".");
    java.lang.String[] str_array17 = hierarchyPropertyParser2.childrenValues();
    int i18 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array20 = hierarchyPropertyParser2.tokenize("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test351"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test352"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build(".(0)[null]\n", "null(0)[null](0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test353"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    boolean b11 = hierarchyPropertyParser2.goDown(".");
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test354"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b12 = hierarchyPropertyParser2.contains("null(0)[null]\n(0)[null]\n");
    java.lang.String str13 = hierarchyPropertyParser2.context();
    java.lang.String str14 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test355"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    int i9 = hierarchyPropertyParser2.getLevel();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test356"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.build("hi!", "null(0)[null]\n");
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, "null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str19 = hierarchyPropertyParser2.parentValue();
    boolean b20 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test357"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = hierarchyPropertyParser2.goTo("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test358"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    int i12 = hierarchyPropertyParser2.depth();
    boolean b13 = hierarchyPropertyParser2.isLeafReached();
    boolean b14 = hierarchyPropertyParser2.isRootReached();
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = hierarchyPropertyParser2.goDown("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test359"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize(".");
    int i7 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test360"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.goDown(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test361"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n(0)[null]\n");
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser0.search(vector9, "null(0)[null]");
    int i12 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test362"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.isHierachic("hi!");
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, "null(0)[null]\n");
    boolean b18 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test363"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test364"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test365"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.goDown("");
    int i15 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test366"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    int i9 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.build("hi!", "null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]\n");
    java.lang.String[] str_array15 = hierarchyPropertyParser2.childrenValues();
    boolean b17 = hierarchyPropertyParser2.contains(".(0)[null]\n");
    java.lang.String str18 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array20 = hierarchyPropertyParser2.tokenize("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test367"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("hi!");
    boolean b8 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test368"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array17 = hierarchyPropertyParser2.tokenize("");
    int i18 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test369"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    boolean b13 = hierarchyPropertyParser2.goDown("hi!");
    int i14 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array15 = hierarchyPropertyParser2.childrenValues();
    boolean b16 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test370"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test371"); }


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
    java.lang.String[] str_array17 = hierarchyPropertyParser2.tokenize(".(0)[null]\n");
    int i18 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test372"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.context();
    int i6 = hierarchyPropertyParser2.getLevel();
    int i7 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test373"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    java.lang.String str14 = hierarchyPropertyParser2.parentValue();
    java.lang.String str15 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test374"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.build("hi!", "");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
    java.lang.String str20 = hierarchyPropertyParser2.context();
    java.lang.String str21 = hierarchyPropertyParser2.getSeperator();
    int i22 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test375"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.build("null(0)[null]\n", "hi!");
    int i15 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test376"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n(0)[null]\n");
    boolean b10 = hierarchyPropertyParser0.isHierachic(".");
    boolean b12 = hierarchyPropertyParser0.goDown("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test377"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    boolean b15 = hierarchyPropertyParser2.contains("null(0)[null]\n(0)[null]\n");
    boolean b17 = hierarchyPropertyParser2.contains("hi!");
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test378"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    int i10 = hierarchyPropertyParser2.numChildren();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test379"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    int i5 = hierarchyPropertyParser2.getLevel();
    boolean b7 = hierarchyPropertyParser2.goDown(".");
    boolean b9 = hierarchyPropertyParser2.goDown(".");
    int i10 = hierarchyPropertyParser2.numChildren();
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test380"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!(0)[null]\n");

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test381"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b12 = hierarchyPropertyParser2.contains("hi!");
    int i13 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    boolean b16 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String str17 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test382"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.goToRoot();
    boolean b2 = hierarchyPropertyParser0.isRootReached();
    boolean b4 = hierarchyPropertyParser0.goToChild(".");
    hierarchyPropertyParser0.setSeperator("");
    boolean b8 = hierarchyPropertyParser0.contains(".(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test383"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.add("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test384"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    int i6 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.build(".(0)[null]\n", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test385"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.context();
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild(100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test386"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n(0)[null]\n");
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser0.search(vector9, "null(0)[null]");
    java.lang.String str12 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test387"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    int i11 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test388"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.showTree();
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test389"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.parentValue();
    int i4 = hierarchyPropertyParser2.depth();
    boolean b6 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build(".", "");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test390"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    int i13 = hierarchyPropertyParser2.getLevel();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array16 = hierarchyPropertyParser2.tokenize("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test391"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, "");
    boolean b18 = hierarchyPropertyParser2.contains("hi!");
    hierarchyPropertyParser2.build(".(0)[null]\n", "");
    int i22 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test392"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    int i10 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    boolean b13 = hierarchyPropertyParser2.contains("hi!");
    hierarchyPropertyParser2.add("hi!");
    boolean b17 = hierarchyPropertyParser2.goToChild(".");
    boolean b18 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str19 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test393"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test394"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    boolean b13 = hierarchyPropertyParser2.goToChild("");
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str15 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test395"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    java.lang.String str2 = hierarchyPropertyParser0.getValue();
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    java.lang.String str4 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test396"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    int i12 = hierarchyPropertyParser2.getLevel();
    java.lang.String str13 = hierarchyPropertyParser2.context();
    java.lang.String str14 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test397"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str12 = hierarchyPropertyParser2.fullValue();
    int i13 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test398"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test399"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    int i5 = hierarchyPropertyParser2.getLevel();
    boolean b7 = hierarchyPropertyParser2.goDown(".");
    boolean b9 = hierarchyPropertyParser2.goDown(".");
    int i10 = hierarchyPropertyParser2.numChildren();
    int i11 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test400"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, ".");
    boolean b18 = hierarchyPropertyParser2.isHierachic(".");
    java.util.Vector vector19 = null;
    int i21 = hierarchyPropertyParser2.search(vector19, "null(0)[null]\n(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test401"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str15 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test402"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b12 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test403"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test404"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    java.lang.String str15 = hierarchyPropertyParser2.showTree();
    java.lang.String str16 = hierarchyPropertyParser2.getSeperator();
    int i17 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test405"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "hi!");
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    java.lang.String str14 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(0)[null]\n"+ "'", str14.equals("null(0)[null]\n"));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test406"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    boolean b5 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("null(0)[null](0)[null]\n");
    boolean b9 = hierarchyPropertyParser2.goToChild(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test407"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.goToRoot();
    boolean b2 = hierarchyPropertyParser0.isRootReached();
    hierarchyPropertyParser0.goToParent();
    int i4 = hierarchyPropertyParser0.numChildren();
    int i5 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test408"); }


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
    java.lang.String str16 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str17 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array19 = hierarchyPropertyParser2.tokenize(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test409"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("");
    boolean b10 = hierarchyPropertyParser2.isHierachic(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test410"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    int i6 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, ".");
    boolean b12 = hierarchyPropertyParser2.goToChild("null(0)[null]\n(0)[null]\n");
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, "hi!(0)[null]\n");
    java.lang.String str16 = hierarchyPropertyParser2.showTree();
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = hierarchyPropertyParser2.goTo("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(0)[null]\n"+ "'", str16.equals("null(0)[null]\n"));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test411"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    int i11 = hierarchyPropertyParser2.numChildren();
    int i12 = hierarchyPropertyParser2.numChildren();
    java.lang.String str13 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test412"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    int i5 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToRoot();
    int i10 = hierarchyPropertyParser2.numChildren();
    boolean b12 = hierarchyPropertyParser2.goToChild("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test413"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    boolean b15 = hierarchyPropertyParser2.contains("hi!");
    boolean b17 = hierarchyPropertyParser2.goDown(".(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array20 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test414"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.goTo("hi!");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    boolean b11 = hierarchyPropertyParser2.goDown(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test415"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.add("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test416"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "hi!");
    boolean b11 = hierarchyPropertyParser2.isHierachic(".");
    java.lang.String str12 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test417"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    boolean b8 = hierarchyPropertyParser2.goDown(".");
    boolean b10 = hierarchyPropertyParser2.goToChild("hi!");
    boolean b12 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test418"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    boolean b14 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String str15 = hierarchyPropertyParser2.getValue();
    boolean b16 = hierarchyPropertyParser2.isLeafReached();
    int i17 = hierarchyPropertyParser2.getLevel();
    java.lang.String str18 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test419"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    boolean b3 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser0.isLeafReached();
    boolean b6 = hierarchyPropertyParser0.goToChild("");
    java.lang.String[] str_array7 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str8 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test420"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize(".");
    int i13 = hierarchyPropertyParser2.numChildren();
    java.lang.String str14 = hierarchyPropertyParser2.context();
    boolean b16 = hierarchyPropertyParser2.isHierachic("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test421"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    int i14 = hierarchyPropertyParser2.numChildren();
    boolean b15 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test422"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize(".");
    hierarchyPropertyParser2.add(".");
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = hierarchyPropertyParser2.contains("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test423"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    int i5 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    int i8 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.tokenize("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test424"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    int i5 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    java.util.Vector vector11 = null;
    int i13 = hierarchyPropertyParser2.search(vector11, ".");
    java.lang.String str14 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test425"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test426"); }


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
    int i14 = hierarchyPropertyParser2.depth();
    boolean b16 = hierarchyPropertyParser2.contains("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("null(0)[null](0)[null]\n");
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test427"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    int i12 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.build("", "");
    java.lang.String str16 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str17 = hierarchyPropertyParser2.fullValue();
    int i18 = hierarchyPropertyParser2.getLevel();
    boolean b20 = hierarchyPropertyParser2.goToChild("null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test428"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    int i12 = hierarchyPropertyParser2.depth();
    boolean b14 = hierarchyPropertyParser2.goToChild("hi!");
    int i15 = hierarchyPropertyParser2.getLevel();
    java.lang.String str16 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test429"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test430"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test431"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    boolean b3 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser0.showTree();
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    boolean b8 = hierarchyPropertyParser0.goDown("null(0)[null]");
    int i9 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test432"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b12 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test433"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    int i11 = hierarchyPropertyParser2.getLevel();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test434"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.add("null(0)[null]");
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test435"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    java.lang.String str13 = hierarchyPropertyParser2.fullValue();
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    boolean b20 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str21 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.add(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test436"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize(".");
    int i12 = hierarchyPropertyParser2.numChildren();
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = hierarchyPropertyParser2.contains("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test437"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    boolean b13 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test438"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    int i10 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.setSeperator(".");
    boolean b13 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array15 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.childrenValues();
    int i17 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test439"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.build("hi!", "null(0)[null]\n");
    int i15 = hierarchyPropertyParser2.numChildren();
    int i16 = hierarchyPropertyParser2.getLevel();
    java.lang.String str17 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!(0)[null]\n"+ "'", str17.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test440"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test441"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.context();
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test442"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    boolean b8 = hierarchyPropertyParser2.goTo(".");
    java.lang.String[] str_array10 = hierarchyPropertyParser2.tokenize(".");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str12 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test443"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    boolean b13 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.goToRoot();
    int i15 = hierarchyPropertyParser2.depth();
    java.lang.String str16 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test444"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.build("hi!", "null(0)[null]\n(0)[null]\n");
    int i14 = hierarchyPropertyParser2.getLevel();
    boolean b15 = hierarchyPropertyParser2.isLeafReached();
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = hierarchyPropertyParser2.goDown("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test445"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.childrenValues();
    boolean b8 = hierarchyPropertyParser2.goToChild("hi!");
    boolean b10 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test446"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("");
    boolean b13 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test447"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test448"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToRoot();
    int i12 = hierarchyPropertyParser2.depth();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.add("null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test449"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.build("hi!", "");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
    java.lang.String[] str_array20 = hierarchyPropertyParser2.childrenValues();
    boolean b21 = hierarchyPropertyParser2.isLeafReached();
    boolean b22 = hierarchyPropertyParser2.isRootReached();
    boolean b23 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test450"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    int i5 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    int i9 = hierarchyPropertyParser2.numChildren();
    int i10 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("");
    boolean b14 = hierarchyPropertyParser2.contains("null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test451"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test452"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test453"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToParent();
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = hierarchyPropertyParser2.contains("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test454"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null](0)[null]\n");
    hierarchyPropertyParser2.add("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test455"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    boolean b14 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array15 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str18 = hierarchyPropertyParser2.context();
    java.lang.String str19 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test456"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    int i10 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    boolean b13 = hierarchyPropertyParser2.contains("hi!");
    hierarchyPropertyParser2.add("hi!");
    boolean b17 = hierarchyPropertyParser2.isHierachic("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test457"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    int i9 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.build("", ".");
    int i13 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.build("null(0)[null]\n", "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test458"); }


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
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str17 = hierarchyPropertyParser2.showTree();
    java.util.Vector vector18 = null;
    int i20 = hierarchyPropertyParser2.search(vector18, "");
    java.lang.String[] str_array21 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str22 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null(0)[null]\n"+ "'", str17.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test459"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n");
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, "");
    java.lang.String[] str_array19 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String str20 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str21 = hierarchyPropertyParser2.parentValue();
    int i22 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test460"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "hi!");
    boolean b11 = hierarchyPropertyParser2.contains("hi!");
    int i12 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test461"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    int i13 = hierarchyPropertyParser2.depth();
    boolean b14 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str15 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
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
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test462"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    boolean b5 = hierarchyPropertyParser2.isLeafReached();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test463"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    boolean b14 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array15 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str16 = hierarchyPropertyParser2.showTree();
    java.lang.String str17 = hierarchyPropertyParser2.parentValue();
    int i18 = hierarchyPropertyParser2.getLevel();
    java.lang.String str19 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(0)[null]\n"+ "'", str16.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test464"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser2.search(vector5, ".");
    hierarchyPropertyParser2.setSeperator(".");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "hi!");
    java.lang.String str13 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test465"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    java.lang.String str15 = hierarchyPropertyParser2.showTree();
    boolean b17 = hierarchyPropertyParser2.goToChild("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test466"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test467"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    boolean b6 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    hierarchyPropertyParser2.add("null(0)[null]\n(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n(0)[null]\n"+ "'", str9.equals("null(0)[null]\n(0)[null]\n"));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test468"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser(".(0)[null]\n", "null(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test469"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize(".");
    hierarchyPropertyParser2.add(".");
    int i15 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test470"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.setSeperator("null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test471"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToRoot();
    boolean b13 = hierarchyPropertyParser2.goToChild("null(0)[null]\n(0)[null]\n");
    java.lang.String str14 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test472"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToRoot();
    int i12 = hierarchyPropertyParser2.getLevel();
    boolean b13 = hierarchyPropertyParser2.isLeafReached();
    boolean b15 = hierarchyPropertyParser2.isHierachic(".");
    int i16 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test473"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "hi!");
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.setSeperator("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test474"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b12 = hierarchyPropertyParser2.contains("hi!");
    int i13 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator(".");
    int i18 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test475"); }


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
    java.util.Vector vector16 = null;
    int i18 = hierarchyPropertyParser2.search(vector16, ".");
    hierarchyPropertyParser2.build("hi!", "null(0)[null]\n(0)[null]\n");
    boolean b23 = hierarchyPropertyParser2.isHierachic(".");
    int i24 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test476"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.util.Vector vector11 = null;
    int i13 = hierarchyPropertyParser2.search(vector11, "");
    boolean b14 = hierarchyPropertyParser2.isLeafReached();
    boolean b15 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test477"); }


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
    boolean b19 = hierarchyPropertyParser2.goDown("null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test478"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.setSeperator("");
    int i14 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.lang.String[] str_array17 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array17);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test479"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    int i9 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.build("", ".");
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, "null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "."+ "'", str13.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test480"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    int i12 = hierarchyPropertyParser2.getLevel();
    boolean b13 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.add("hi!(0)[null]\n");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array16);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test481"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    boolean b5 = hierarchyPropertyParser2.isRootReached();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test482"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str12 = hierarchyPropertyParser2.fullValue();
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, ".(0)[null]\n");
    boolean b17 = hierarchyPropertyParser2.isHierachic(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test483"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.context();
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test484"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str6 = hierarchyPropertyParser2.getValue();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test485"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.goTo("hi!");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test486"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test487"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("hi!");
    boolean b8 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String str9 = hierarchyPropertyParser2.context();
    boolean b11 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test488"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
    boolean b16 = hierarchyPropertyParser2.goTo(".");
    java.lang.String str17 = hierarchyPropertyParser2.showTree();
    java.lang.String str18 = hierarchyPropertyParser2.context();
    java.lang.String str19 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null(0)[null](0)[null]\n"+ "'", str17.equals("null(0)[null](0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null(0)[null]"+ "'", str19.equals("null(0)[null]"));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test489"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    boolean b14 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String[] str_array17 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.build("", "hi!");
    java.lang.String str21 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test490"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.setSeperator("");
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("hi!");
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, "null(0)[null]\n(0)[null]\n");
    boolean b16 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str17 = hierarchyPropertyParser2.fullValue();
    int i18 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test491"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, "");
    boolean b18 = hierarchyPropertyParser2.contains("hi!");
    hierarchyPropertyParser2.build(".(0)[null]\n", "");
    java.lang.String str22 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ".(0)[null](0)[null]\n"+ "'", str22.equals(".(0)[null](0)[null]\n"));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test492"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.context();
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.setSeperator(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test493"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.setSeperator(".");
    boolean b8 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str9 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test494"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    boolean b15 = hierarchyPropertyParser2.goToChild("hi!");
    java.util.Vector vector16 = null;
    int i18 = hierarchyPropertyParser2.search(vector16, "null(0)[null](0)[null]\n");
    boolean b20 = hierarchyPropertyParser2.contains(".(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test495"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test496"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n");
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, "");
    java.lang.String[] str_array19 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator(".");
    hierarchyPropertyParser2.goToRoot();
    boolean b24 = hierarchyPropertyParser2.goDown("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test497"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize(".");
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test498"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "null(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, "hi!(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test499"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "null(0)[null]\n");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    boolean b13 = hierarchyPropertyParser2.contains("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.add("null(0)[null]\n(0)[null]\n");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.childrenValues();
    boolean b18 = hierarchyPropertyParser2.goToChild("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test500"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.context();
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));

  }

}
